package ru.ok.android.onelog;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import ru.ok.android.utils.Logger;
import xsna.e9e0;

/* loaded from: classes9.dex */
final class Worker implements OneLogAppender {
    private static final long MAX_FILE_LENGTH = 10000000;
    private static final int MSG_APPEND = 0;
    private static final int MSG_FLUSH = 1;
    private static final int MSG_UPLOAD_MAX_TIMEOUT = 17;
    private static final int MSG_UPLOAD_SILENCE_TIMEOUT = 16;
    private static volatile Looper looper;
    private final FileAppender appender;
    private final String collector;
    private int count = 0;
    private volatile Handler handler;

    public class Callback implements Handler.Callback {
        public /* synthetic */ Callback(Worker worker, int i) {
            this();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 0) {
                Worker.this.handleAppend((OneLogItem) message.obj);
                return true;
            }
            if (i == 1) {
                Worker.this.handleFlush((ConditionVariable) message.obj);
                return true;
            }
            if (i == 16) {
                Worker.this.handleUploadSilenceTimeout();
                return true;
            }
            if (i != 17) {
                return false;
            }
            Worker.this.handleUploadMaxTimeout(message.arg1);
            return true;
        }

        private Callback() {
        }
    }

    public Worker(@NonNull e9e0<File> e9e0Var, @NonNull Lock lock, @NonNull String str) {
        this.collector = str;
        this.appender = new FileAppender(e9e0Var, lock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAppend(OneLogItem oneLogItem) {
        if (this.appender.length() > MAX_FILE_LENGTH) {
            Logger.w("append file too big");
            drop();
        }
        this.appender.append(oneLogItem);
        this.count++;
        int defFileLengthToUpload = OneLogImpl.getInstance().getDefFileLengthToUpload();
        int defCountToUpload = OneLogImpl.getInstance().getDefCountToUpload();
        long j = defFileLengthToUpload;
        if (this.appender.length() >= j) {
            Logger.d("trigger | log file size exceeded %sB", Integer.valueOf(defFileLengthToUpload));
            startUpload(OneLogTrigger.exceededFileLength(j));
        } else if (this.count >= defCountToUpload) {
            Logger.d("trigger | log items count exceeded %s", Integer.valueOf(defCountToUpload));
            startUpload(OneLogTrigger.exceededCount(defCountToUpload));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFlush(ConditionVariable conditionVariable) {
        conditionVariable.open();
        int defFileLengthToUpload = OneLogImpl.getInstance().getDefFileLengthToUpload();
        long j = defFileLengthToUpload;
        if (this.appender.length() >= j) {
            Logger.d("trigger | log file size exceeded %sB", Integer.valueOf(defFileLengthToUpload));
            startUpload(OneLogTrigger.exceededFileLength(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadMaxTimeout(long j) {
        if (this.count == 0) {
            return;
        }
        Logger.d("trigger | max time since log item passed");
        startUpload(OneLogTrigger.exceededMaxTime(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadSilenceTimeout() {
        if (this.count == 0) {
            return;
        }
        long defSilenceMillisToUpload = OneLogImpl.getInstance().getDefSilenceMillisToUpload();
        Logger.d("trigger | time since last log item exceeded %sms", Long.valueOf(defSilenceMillisToUpload));
        startUpload(OneLogTrigger.passedSilenceTime(defSilenceMillisToUpload));
    }

    @NonNull
    private Handler obtainHandler() {
        if (this.handler == null) {
            synchronized (this) {
                try {
                    if (this.handler == null) {
                        this.handler = new Handler(obtainLooper(), new Callback(this, 0));
                    }
                } finally {
                }
            }
        }
        return this.handler;
    }

    @NonNull
    private static Looper obtainLooper() {
        if (looper == null) {
            synchronized (Worker.class) {
                try {
                    if (looper == null) {
                        HandlerThread handlerThread = new HandlerThread(UploadService.SCHEME);
                        handlerThread.start();
                        looper = handlerThread.getLooper();
                    }
                } finally {
                }
            }
        }
        return looper;
    }

    private void startUpload(@Nullable OneLogTrigger oneLogTrigger) {
        if (this.count == 0) {
            return;
        }
        this.count = 0;
        OneLogImpl.getInstance().startUpload(this.collector, oneLogTrigger);
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(@NonNull OneLogItem oneLogItem) {
        Handler obtainHandler = obtainHandler();
        obtainHandler.sendMessage(Message.obtain(obtainHandler, 0, oneLogItem));
        long defSilenceMillisToUpload = OneLogImpl.getInstance().getDefSilenceMillisToUpload();
        if (defSilenceMillisToUpload < Long.MAX_VALUE) {
            obtainHandler.removeMessages(16);
            obtainHandler.sendEmptyMessageDelayed(16, defSilenceMillisToUpload);
        }
        long maxMillisToUpload = OneLogImpl.getInstance().getMaxMillisToUpload(oneLogItem.collector(), oneLogItem.operation());
        if (maxMillisToUpload < Long.MAX_VALUE) {
            Message obtain = Message.obtain();
            obtain.what = 17;
            obtain.arg1 = (int) Math.min(maxMillisToUpload, 2147483647L);
            obtainHandler.sendMessageDelayed(obtain, maxMillisToUpload);
        }
    }

    public void drop() {
        try {
            this.appender.drop();
        } catch (IOException e) {
            Logger.e(e, "drop failed");
        }
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
        flush(new ConditionVariable());
    }

    public void grab(File file) throws IOException {
        if (file.length() > MAX_FILE_LENGTH) {
            Files.delete(file);
        }
        this.appender.grab(file);
    }

    private void flush(ConditionVariable conditionVariable) {
        Message.obtain(obtainHandler(), 1, conditionVariable).sendToTarget();
        conditionVariable.block();
    }
}

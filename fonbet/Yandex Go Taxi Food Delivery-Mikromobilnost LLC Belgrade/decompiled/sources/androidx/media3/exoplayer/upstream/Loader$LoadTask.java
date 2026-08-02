package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import defpackage.d6z;
import defpackage.h0n;
import defpackage.lk91;
import defpackage.oyy;
import defpackage.pyy;
import defpackage.tsi0;
import java.io.IOException;

/* loaded from: classes10.dex */
final class Loader$LoadTask<T extends pyy> extends Handler implements Runnable {
    private static final int MSG_FATAL_ERROR = 4;
    private static final int MSG_FINISH = 2;
    private static final int MSG_IO_EXCEPTION = 3;
    private static final int MSG_START = 1;
    private static final String TAG = "LoadTask";
    private oyy callback;
    private boolean canceled;
    private IOException currentError;
    public final int defaultMinRetryCount;
    private int errorCount;
    private Thread executorThread;
    private final T loadable;
    private volatile boolean released;
    private final long startTimeMs;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Loader$LoadTask(a aVar, Looper looper, T t, oyy oyyVar, int i, long j) {
        super(looper);
        this.this$0 = aVar;
        this.loadable = t;
        this.callback = oyyVar;
        this.defaultMinRetryCount = i;
        this.startTimeMs = j;
    }

    private void execute() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.startTimeMs;
        oyy oyyVar = this.callback;
        oyyVar.getClass();
        oyyVar.o(this.loadable, elapsedRealtime, j, this.errorCount);
        this.currentError = null;
        a aVar = this.this$0;
        tsi0 tsi0Var = aVar.a;
        Loader$LoadTask loader$LoadTask = aVar.b;
        loader$LoadTask.getClass();
        tsi0Var.execute(loader$LoadTask);
    }

    private void finish() {
        this.this$0.b = null;
    }

    private long getRetryDelayMillis() {
        return Math.min((this.errorCount - 1) * 1000, 5000);
    }

    public void cancel(boolean z) {
        this.released = z;
        this.currentError = null;
        if (hasMessages(1)) {
            this.canceled = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.canceled = true;
                    this.loadable.d();
                    Thread thread = this.executorThread;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            oyy oyyVar = this.callback;
            oyyVar.getClass();
            oyyVar.d(this.loadable, elapsedRealtime, elapsedRealtime - this.startTimeMs, true);
            this.callback = null;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.released) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            execute();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        finish();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.startTimeMs;
        oyy oyyVar = this.callback;
        oyyVar.getClass();
        if (this.canceled) {
            oyyVar.d(this.loadable, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                oyyVar.m(this.loadable, elapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                lk91.f(TAG, "Unexpected exception handling load completed", e);
                this.this$0.c = new Loader$UnexpectedLoaderException(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.currentError = iOException;
        int i3 = this.errorCount + 1;
        this.errorCount = i3;
        h0n p = oyyVar.p(this.loadable, elapsedRealtime, j, iOException, i3);
        int i4 = p.a;
        if (i4 == 3) {
            this.this$0.c = this.currentError;
        } else if (i4 != 2) {
            if (i4 == 1) {
                this.errorCount = 1;
            }
            long j2 = p.b;
            if (j2 == -9223372036854775807L) {
                j2 = getRetryDelayMillis();
            }
            start(j2);
        }
    }

    public void maybeThrowError(int i) throws IOException {
        IOException iOException = this.currentError;
        if (iOException != null && this.errorCount > i) {
            throw iOException;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.canceled;
                this.executorThread = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.loadable.getClass().getSimpleName()));
                try {
                    this.loadable.load();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.executorThread = null;
                Thread.interrupted();
            }
            if (this.released) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.released) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.released) {
                return;
            }
            lk91.f(TAG, "Unexpected exception loading stream", e2);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.released) {
                return;
            }
            lk91.f(TAG, "OutOfMemory error loading stream", e3);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.released) {
                lk91.f(TAG, "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public void start(long j) {
        d6z.x(this.this$0.b == null);
        this.this$0.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            execute();
        }
    }
}

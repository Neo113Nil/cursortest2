package ru.ok.android.onelog;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.locks.Lock;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.json.PlainJsonWriter;
import ru.ok.android.commons.io.OutputStreamWriter;
import ru.ok.android.utils.Logger;
import xsna.e9e0;

/* loaded from: classes9.dex */
final class FileAppender implements OneLogAppender {
    private final e9e0<File> file;
    private long length = -1;
    private final Lock lock;

    public FileAppender(e9e0<File> e9e0Var, Lock lock) {
        this.file = e9e0Var;
        this.lock = lock;
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(@NonNull OneLogItem oneLogItem) {
        File file = this.file.get();
        try {
            try {
                this.lock.lock();
            } finally {
                this.length = file.length();
                this.lock.unlock();
            }
        } catch (IOException e) {
            file.delete();
            OneLogImpl.getInstance().getErrorHandler().handleFailedItemStore(e, oneLogItem);
        }
        if (OneLogImpl.getInstance().getForceFallbackLogs()) {
            throw new IOException("Testing log fallback");
        }
        Files.mkfile(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            if (file.length() > 0) {
                fileOutputStream.write(Files.SEPARATOR);
            }
            PlainJsonWriter plainJsonWriter = new PlainJsonWriter(new OutputStreamWriter(fileOutputStream));
            try {
                OneLogItemSerializer oneLogItemSerializer = OneLogItemSerializer.INSTANCE;
                oneLogItemSerializer.serialize((JsonWriter) plainJsonWriter, oneLogItem);
                plainJsonWriter.close();
                fileOutputStream.close();
                if (Logger.isLoggingEnable()) {
                    try {
                        StringWriter stringWriter = new StringWriter();
                        try {
                            plainJsonWriter = new PlainJsonWriter(stringWriter);
                            try {
                                oneLogItemSerializer.serialize((JsonWriter) plainJsonWriter, oneLogItem);
                                plainJsonWriter.close();
                                Logger.v("append %s | %s", oneLogItem.collector(), stringWriter.toString());
                                stringWriter.close();
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                stringWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } finally {
                try {
                    plainJsonWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
            }
        } catch (Throwable th4) {
            try {
                fileOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public void drop() throws IOException {
        File file = this.file.get();
        try {
            this.lock.lock();
            if (file.exists()) {
                Files.delete(file);
                Logger.d("drop %s", file);
            } else {
                Logger.d("no drop %s", file);
            }
        } finally {
            this.length = file.length();
            this.lock.unlock();
        }
    }

    public void grab(File file) throws IOException {
        File file2 = this.file.get();
        try {
            Logger.d("grab | %s >> %s", file2, file);
            this.lock.lock();
            if (file2.exists()) {
                Files.cat(file, file2);
            }
        } finally {
            this.length = file2.length();
            this.lock.unlock();
        }
    }

    public long length() {
        long j = this.length;
        if (j >= 0) {
            return j;
        }
        File file = this.file.get();
        try {
            this.lock.lock();
            this.length = file.length();
            this.lock.unlock();
            return this.length;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
    }
}

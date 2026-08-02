package ru.mail.libverify.storage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.RandomAccessFile;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class f {
    private int a;

    public f(@NonNull Context context) {
        int i = 0;
        this.a = 0;
        try {
            File file = new File(ru.mail.libverify.n0.e.c(context), "VERIFY_INSTALLATION_FLAGS");
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    int readInt = randomAccessFile.readInt();
                    randomAccessFile.close();
                    i = readInt;
                } finally {
                }
            }
        } catch (Throwable th) {
            ru.mail.libverify.n0.b.a("InstallationFlags", "failed to read installation flags file", new RuntimeException(th));
        }
        this.a = i;
    }

    public final boolean a() {
        return (this.a & 1) == 1;
    }

    public final void a(@NonNull Context context, boolean z) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        if (z == a()) {
            return;
        }
        if (z) {
            this.a |= 1;
        } else {
            this.a &= -2;
        }
        FileLog.d("InstallationFlags", "no encryption option set to value %s", Boolean.valueOf(z));
        try {
            try {
                randomAccessFile = new RandomAccessFile(new File(ru.mail.libverify.n0.e.c(context), "VERIFY_INSTALLATION_FLAGS"), "rw");
                try {
                    randomAccessFile.writeInt(this.a);
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    randomAccessFile.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
            }
        } catch (Throwable th4) {
            ru.mail.libverify.n0.b.a("InstallationFlags", "failed to save installation flags file", new RuntimeException(th4));
        }
    }
}

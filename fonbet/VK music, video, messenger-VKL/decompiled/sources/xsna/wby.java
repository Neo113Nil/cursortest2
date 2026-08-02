package xsna;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;

/* compiled from: JvmSystemFileSystem.kt */
/* loaded from: classes11.dex */
public class wby extends tar {
    @Override // xsna.tar
    public void a(aq90 aq90Var, aq90 aq90Var2) {
        if (aq90Var.toFile().renameTo(aq90Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + aq90Var + " to " + aq90Var2);
    }

    @Override // xsna.tar
    public final void b(aq90 aq90Var) {
        if (aq90Var.toFile().mkdir()) {
            return;
        }
        n9r e = e(aq90Var);
        if (e == null || !e.b) {
            throw new IOException("failed to create directory: " + aq90Var);
        }
    }

    @Override // xsna.tar
    public final void c(aq90 aq90Var) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = aq90Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + aq90Var);
    }

    @Override // xsna.tar
    public n9r e(aq90 aq90Var) {
        File file = aq90Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new n9r(isFile, isDirectory, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // xsna.tar
    public final y8r f(aq90 aq90Var) {
        return new uby(false, new RandomAccessFile(aq90Var.toFile(), "r"));
    }

    @Override // xsna.tar
    public final y8r g(aq90 aq90Var) {
        return new uby(true, new RandomAccessFile(aq90Var.toFile(), "rw"));
    }

    @Override // xsna.tar
    public final agk0 h(aq90 aq90Var) {
        File file = aq90Var.toFile();
        Logger logger = ez70.a;
        return new i3x(new FileInputStream(file), mxo0.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}

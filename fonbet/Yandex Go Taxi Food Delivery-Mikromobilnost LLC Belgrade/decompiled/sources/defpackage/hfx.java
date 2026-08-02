package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class hfx extends r1r {
    @Override // defpackage.r1r
    public final gfx B(oq90 oq90Var) {
        return new gfx(new RandomAccessFile(oq90Var.toFile(), "r"));
    }

    @Override // defpackage.r1r
    public final uis0 D(oq90 oq90Var, boolean z) {
        if (!z || !n(oq90Var)) {
            return new qy80(new FileOutputStream(oq90Var.toFile(), false), new ydz0());
        }
        throw new IOException(oq90Var + " already exists.");
    }

    @Override // defpackage.r1r
    public final y9t0 G(oq90 oq90Var) {
        return new v0w(new FileInputStream(oq90Var.toFile()), ydz0.d);
    }

    @Override // defpackage.r1r
    public final uis0 a(oq90 oq90Var) {
        return new qy80(new FileOutputStream(oq90Var.toFile(), true), new ydz0());
    }

    @Override // defpackage.r1r
    public void c(oq90 oq90Var, oq90 oq90Var2) {
        if (oq90Var.toFile().renameTo(oq90Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + oq90Var + " to " + oq90Var2);
    }

    @Override // defpackage.r1r
    public final void e(oq90 oq90Var) {
        if (oq90Var.toFile().mkdir()) {
            return;
        }
        m0r w = w(oq90Var);
        if (w == null || !w.b) {
            w511.h(oq90Var, "failed to create directory: ");
        }
    }

    @Override // defpackage.r1r
    public final void k(oq90 oq90Var) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = oq90Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        w511.h(oq90Var, "failed to delete ");
    }

    @Override // defpackage.r1r
    public final List o(oq90 oq90Var) {
        File file = oq90Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                w511.h(oq90Var, "failed to list ");
                return null;
            }
            yhl.h(oq90Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(oq90Var.e(str));
        }
        xcc.p(arrayList);
        return arrayList;
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // defpackage.r1r
    public m0r w(oq90 oq90Var) {
        File file = oq90Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new m0r(isFile, isDirectory, (oq90) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null, 128);
    }
}

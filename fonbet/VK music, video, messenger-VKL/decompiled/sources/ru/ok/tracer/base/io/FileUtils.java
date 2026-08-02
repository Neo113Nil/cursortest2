package ru.ok.tracer.base.io;

import java.io.File;
import java.io.IOException;
import xsna.nbr;
import xsna.z9r;

/* compiled from: FileUtils.kt */
/* loaded from: classes11.dex */
public final class FileUtils {
    public static final File deleteChecked(File file) throws IOException {
        if (!file.exists() || nbr.l(file)) {
            return file;
        }
        throw new IOException(z9r.a(file, "Can't delete "));
    }

    public static final boolean ensureDirs(File file) {
        return file.exists() || file.mkdirs();
    }

    public static final File mkdirsChecked(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(file + " is not a directory");
            }
        } else if (!file.mkdirs()) {
            throw new IOException(z9r.a(file, "Can't create "));
        }
        return file;
    }

    public static final File renameToChecked(File file, File file2) throws IOException {
        if (file.renameTo(file2)) {
            return file;
        }
        throw new IOException("Can't rename " + file + " to " + file2);
    }
}

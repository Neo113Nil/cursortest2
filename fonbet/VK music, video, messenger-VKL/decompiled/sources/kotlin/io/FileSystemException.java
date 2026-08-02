package kotlin.io;

import java.io.File;
import java.io.IOException;
import xsna.ine0;

/* compiled from: Exceptions.kt */
/* loaded from: classes11.dex */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    public FileSystemException(File file, File file2, String str) {
        super(ine0.c(file, file2, str));
        this.file = file;
        this.other = file2;
        this.reason = str;
    }
}

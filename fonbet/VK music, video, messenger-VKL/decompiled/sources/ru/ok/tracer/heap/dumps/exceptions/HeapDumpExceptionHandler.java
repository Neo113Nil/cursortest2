package ru.ok.tracer.heap.dumps.exceptions;

import android.os.Debug;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.heap.dumps.OutOfMemoryErrors;
import xsna.ozl;

/* compiled from: HeapDumpExceptionHandler.kt */
@ozl
/* loaded from: classes9.dex */
public final class HeapDumpExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final File file;
    private final File tmpFile;

    public HeapDumpExceptionHandler(File file, File file2) {
        this.file = file;
        this.tmpFile = file2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (OutOfMemoryErrors.isOom(th)) {
            try {
                File parentFile = this.tmpFile.getParentFile();
                if (parentFile != null) {
                    FileUtils.mkdirsChecked(parentFile);
                }
                Debug.dumpHprofData(this.tmpFile.getAbsolutePath());
                File parentFile2 = this.file.getParentFile();
                if (parentFile2 != null) {
                    FileUtils.mkdirsChecked(parentFile2);
                }
                this.tmpFile.renameTo(this.file);
            } catch (IOException unused) {
            }
        }
    }
}

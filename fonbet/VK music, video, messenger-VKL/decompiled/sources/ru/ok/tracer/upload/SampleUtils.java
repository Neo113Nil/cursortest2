package ru.ok.tracer.upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;
import xsna.i7o0;

/* compiled from: SampleUtils.kt */
/* loaded from: classes9.dex */
public final class SampleUtils {
    public static final void gzipTo(File file, File file2, int i) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file2));
            try {
                i7o0.b(fileInputStream, gZIPOutputStream, i);
                gZIPOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ void gzipTo$default(File file, File file2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        gzipTo(file, file2, i);
    }
}

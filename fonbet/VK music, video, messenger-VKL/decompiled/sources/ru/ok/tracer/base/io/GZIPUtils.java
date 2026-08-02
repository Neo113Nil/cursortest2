package ru.ok.tracer.base.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import xsna.emb;
import xsna.i7o0;

/* compiled from: GZIPUtils.kt */
/* loaded from: classes9.dex */
public final class GZIPUtils {
    public static final byte[] readBytesToGzippedByteArray(File file) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            i7o0.b(fileInputStream, gZIPOutputStream, 8192);
            fileInputStream.close();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
        }
    }

    public static final byte[] toGzippedByteArray(String str) {
        return toGzippedByteArray(str.getBytes(emb.b));
    }

    public static final byte[] toGzippedByteArray(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}

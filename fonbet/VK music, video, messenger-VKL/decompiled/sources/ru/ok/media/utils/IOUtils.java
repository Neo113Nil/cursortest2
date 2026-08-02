package ru.ok.media.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public class IOUtils {
    static byte[] skipBuf = new byte[4096];

    public static void closeSilently(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void copyStreams(OutputStream outputStream, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                closeSilently(outputStream);
                closeSilently(inputStream);
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static void skip(InputStream inputStream) throws IOException {
        byte[] bArr;
        do {
            bArr = skipBuf;
        } while (inputStream.read(bArr, 0, bArr.length) != -1);
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStreams(byteArrayOutputStream, inputStream);
        return byteArrayOutputStream.toByteArray();
    }
}

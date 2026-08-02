package ru.ok.android.commons.io;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public final class InputOutputStreams {
    public static final int DEFAULT_BUFFER_SIZE = 8192;

    private InputOutputStreams() {
    }

    public static void copy(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        copy(inputStream, outputStream, new byte[8192]);
    }

    public static int copy(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, @NonNull byte[] bArr) throws IOException {
        return copy(inputStream, outputStream, bArr, 0, bArr.length);
    }

    public static int copy(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, @NonNull byte[] bArr, int i, int i2) throws IOException {
        int read;
        int read2 = inputStream.read(bArr, i, i2);
        if (read2 < 0) {
            return read2;
        }
        outputStream.write(bArr, i, read2);
        Thread currentThread = Thread.currentThread();
        while (!currentThread.isInterrupted() && (read = inputStream.read(bArr, i, i2)) >= 0) {
            outputStream.write(bArr, i, read);
            read2 += read;
        }
        return read2;
    }
}

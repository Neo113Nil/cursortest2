package ru.ok.android.commons.io;

import androidx.annotation.NonNull;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* loaded from: classes9.dex */
public class InputStreams {
    private InputStreams() {
    }

    public static int read(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        return read(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    private static int read(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i, int i2) throws IOException {
        int read = inputStream.read(bArr, i, i2);
        if (read < 0) {
            return read;
        }
        int i3 = i + read;
        int i4 = i2 - read;
        Thread currentThread = Thread.currentThread();
        while (i4 > 0 && !currentThread.isInterrupted()) {
            int read2 = inputStream.read(bArr, i3, i4);
            if (read2 < 0) {
                break;
            }
            read += read2;
            i3 += read2;
            i4 -= read2;
        }
        return read;
    }

    public static void readFully(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i, int i2) throws IOException {
        if (read(inputStream, bArr, i, i2) == i2) {
            return;
        }
        if (!Thread.interrupted()) {
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}

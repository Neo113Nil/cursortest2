package ru.ok.android.commons.io;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public final class NothingnessOutputStream extends OutputStream {
    public static final NothingnessOutputStream INSTANCE = new NothingnessOutputStream();

    private NothingnessOutputStream() {
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return NothingnessOutputStream.class.getName();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) {
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}

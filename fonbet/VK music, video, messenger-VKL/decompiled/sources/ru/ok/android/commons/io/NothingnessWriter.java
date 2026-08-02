package ru.ok.android.commons.io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Writer;

/* loaded from: classes9.dex */
public final class NothingnessWriter extends Writer {
    public static final NothingnessWriter INSTANCE = new NothingnessWriter();

    private NothingnessWriter() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    @NonNull
    public Writer append(char c) {
        return this;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return NothingnessWriter.class.getName();
    }

    @Override // java.io.Writer
    public void write(int i) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    @NonNull
    public Writer append(@Nullable CharSequence charSequence) {
        return this;
    }

    @Override // java.io.Writer
    public void write(@NonNull String str) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    @NonNull
    public Writer append(@Nullable CharSequence charSequence, int i, int i2) {
        return this;
    }

    @Override // java.io.Writer
    public void write(@NonNull String str, int i, int i2) {
    }

    @Override // java.io.Writer
    public void write(@NonNull char[] cArr) {
    }

    @Override // java.io.Writer
    public void write(@NonNull char[] cArr, int i, int i2) {
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}

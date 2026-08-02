package ru.ok.android.commons.io;

import android.text.GetChars;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.Writer;
import java.nio.CharBuffer;

/* loaded from: classes9.dex */
abstract class BasicWriter extends Writer {
    private static final char[] NULL_CHARS = {'n', 'u', 'l', 'l'};
    private final char[] chars;

    public BasicWriter(int i) {
        this.chars = new char[Math.max(i, 1)];
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        char[] cArr = this.chars;
        cArr[0] = (char) i;
        write(cArr, 0, 1);
    }

    public BasicWriter(Object obj, int i) {
        super(obj);
        this.chars = new char[Math.max(i, 1)];
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    public final void write(@NonNull CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence instanceof String) {
            write((String) charSequence, i, i2);
            return;
        }
        if (charSequence instanceof StringBuilder) {
            write((StringBuilder) charSequence, i, i2);
            return;
        }
        if (charSequence instanceof StringBuffer) {
            write((StringBuffer) charSequence, i, i2);
            return;
        }
        if (charSequence instanceof GetChars) {
            write((GetChars) charSequence, i, i2);
            return;
        }
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (charBuffer.hasArray()) {
                write(charBuffer.array(), charBuffer.arrayOffset() + i, i2);
                return;
            }
        }
        char[] cArr = this.chars;
        int length = cArr.length;
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                try {
                    int min = Math.min(length, i2);
                    int i3 = i + min;
                    int i4 = 0;
                    while (i4 < min) {
                        cArr[i4] = charSequence.charAt(i);
                        i4++;
                        i++;
                    }
                    write(cArr, 0, min);
                    i2 -= min;
                    i = i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(@Nullable CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            write(NULL_CHARS, 0, 4);
            return this;
        }
        write(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(@Nullable CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            write(NULL_CHARS, 0, 4);
            return this;
        }
        write(charSequence, i, i2 - i);
        return this;
    }

    public final void write(@NonNull StringBuilder sb, int i, int i2) throws IOException {
        char[] cArr = this.chars;
        int length = cArr.length;
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                try {
                    int min = Math.min(length, i2);
                    int i3 = i + min;
                    sb.getChars(i, i3, cArr, 0);
                    write(cArr, 0, min);
                    i2 -= min;
                    i = i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void write(@NonNull StringBuffer stringBuffer, int i, int i2) throws IOException {
        char[] cArr = this.chars;
        int length = cArr.length;
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                try {
                    int min = Math.min(length, i2);
                    int i3 = i + min;
                    stringBuffer.getChars(i, i3, cArr, 0);
                    write(cArr, 0, min);
                    i2 -= min;
                    i = i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void write(@NonNull GetChars getChars, int i, int i2) throws IOException {
        char[] cArr = this.chars;
        int length = cArr.length;
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                try {
                    int min = Math.min(length, i2);
                    int i3 = i + min;
                    getChars.getChars(i, i3, cArr, 0);
                    write(cArr, 0, min);
                    i2 -= min;
                    i = i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Writer
    public final void write(@NonNull String str, int i, int i2) throws IOException {
        char[] cArr = this.chars;
        int length = cArr.length;
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                try {
                    int min = Math.min(length, i2);
                    int i3 = i + min;
                    str.getChars(i, i3, cArr, 0);
                    write(cArr, 0, min);
                    i2 -= min;
                    i = i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Writer
    public final void write(@NonNull char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public final void write(@NonNull String str) throws IOException {
        write(str, 0, str.length());
    }
}

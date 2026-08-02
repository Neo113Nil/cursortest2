package ru.ok.android.commons.io;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.android.commons.nio.charset.Utf8Encoder;

/* loaded from: classes9.dex */
public final class OutputStreamWriter extends BasicWriter {
    public static final int DEFAULT_BUFFER_SIZE = 128;
    private final byte[] buf;
    private final CharsetEncoder encoder;

    @NonNull
    private final OutputStream out;

    public OutputStreamWriter(@NonNull OutputStream outputStream) {
        this(outputStream, new Utf8Encoder(), 128);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (((Writer) this).lock) {
            CharsetEncoder charsetEncoder = this.encoder;
            byte[] bArr = this.buf;
            this.out.write(this.buf, 0, charsetEncoder.encodeEnd(bArr, 0, bArr.length));
            this.out.close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        synchronized (((Writer) this).lock) {
            this.out.flush();
        }
    }

    @Override // java.io.Writer
    public void write(@NonNull char[] cArr, int i, int i2) throws IOException {
        synchronized (((Writer) this).lock) {
            int i3 = i + i2;
            int i4 = i;
            int i5 = i2;
            while (i4 < i3) {
                try {
                    CharsetEncoder charsetEncoder = this.encoder;
                    byte[] bArr = this.buf;
                    char[] cArr2 = cArr;
                    long encode = charsetEncoder.encode(cArr2, i4, i5, bArr, 0, bArr.length);
                    this.out.write(this.buf, 0, (int) encode);
                    i4 = (int) (encode >> 32);
                    i5 = i3 - i4;
                    cArr = cArr2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public OutputStreamWriter(@NonNull OutputStream outputStream, @NonNull CharsetEncoder charsetEncoder) {
        this(outputStream, charsetEncoder, 128);
    }

    public OutputStreamWriter(@NonNull OutputStream outputStream, @NonNull CharsetEncoder charsetEncoder, int i) {
        super(i);
        this.out = outputStream;
        this.encoder = charsetEncoder;
        this.buf = new byte[Math.max(i, charsetEncoder.maxBytesPerChar())];
    }
}

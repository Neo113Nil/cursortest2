package ru.ok.android.api.http;

import java.io.IOException;
import java.io.OutputStream;
import ru.ok.android.commons.convert.Hex;
import xsna.zcl;

/* compiled from: UrlEncoderOutputStream.kt */
/* loaded from: classes9.dex */
public final class UrlEncoderOutputStream extends OutputStream {
    public static final Companion Companion = new Companion(null);
    private final OutputStream out;

    /* compiled from: UrlEncoderOutputStream.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean unreserved(int i) {
            char c = (char) i;
            if ('a' <= c && c < '{') {
                return true;
            }
            if ('A' > c || c >= '[') {
                return ('0' <= c && c < ':') || c == '-' || c == '_' || c == '.' || c == '~';
            }
            return true;
        }

        private Companion() {
        }
    }

    public UrlEncoderOutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    private final void writeReserved(OutputStream outputStream, int i) throws IOException {
        outputStream.write(37);
        Hex.writeHexByteUpperCase(outputStream, i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (Companion.unreserved(i)) {
            this.out.write(i);
        } else {
            writeReserved(this.out, i);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        OutputStream outputStream = this.out;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            byte b = bArr[i];
            if (!Companion.unreserved(b)) {
                if (i > i4) {
                    outputStream.write(bArr, i4, i - i4);
                }
                writeReserved(outputStream, b);
                i4 = i + 1;
            }
            i++;
        }
        if (i4 < i3) {
            outputStream.write(bArr, i4, i3 - i4);
        }
    }
}

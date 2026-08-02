package xsna;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ByteStreams.java */
/* loaded from: classes8.dex */
public final class mu8 {

    /* compiled from: ByteStreams.java */
    public class a extends OutputStream {
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
        }
    }

    static {
        new a();
    }

    public static void a(DataInputStream dataInputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i3 = 0;
        while (i3 < i2) {
            int read = dataInputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            } else {
                i3 += read;
            }
        }
        if (i3 != i2) {
            throw new EOFException(sl9.c(i3, i2, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }
}

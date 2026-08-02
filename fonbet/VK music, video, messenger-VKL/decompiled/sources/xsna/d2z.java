package xsna;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* loaded from: classes13.dex */
public final class d2z extends OutputStream {
    public long b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.b += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

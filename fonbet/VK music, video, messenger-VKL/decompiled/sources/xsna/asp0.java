package xsna;

import androidx.annotation.Nullable;
import java.io.IOException;
import xsna.rgp0;

/* compiled from: TrueHdSampleRechunker.java */
/* loaded from: classes12.dex */
public final class asp0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(rgp0 rgp0Var, @Nullable rgp0.a aVar) {
        if (this.c > 0) {
            rgp0Var.a(this.d, this.e, this.f, this.g, aVar);
            this.c = 0;
        }
    }

    public final void b(rgp0 rgp0Var, long j, int i, int i2, int i3, @Nullable rgp0.a aVar) {
        fxc0.A(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(rgp0Var, aVar);
            }
        }
    }

    public final void c(qgq qgqVar) throws IOException {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        qgqVar.peekFully(bArr, 0, 10);
        qgqVar.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r2 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r2 == 0) {
            return;
        }
        this.b = true;
    }
}

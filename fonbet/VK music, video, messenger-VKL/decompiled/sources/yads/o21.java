package yads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes10.dex */
public final class o21 implements p30 {
    public final p30 a;
    public final int b;
    public final n21 c;
    public final byte[] d;
    public int e;

    public o21(v43 v43Var, int i, n21 n21Var) {
        ni.a(i > 0);
        this.a = v43Var;
        this.b = i;
        this.c = n21Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // yads.p30
    public final void a(v93 v93Var) {
        v93Var.getClass();
        this.a.a(v93Var);
    }

    @Override // yads.p30
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        if (this.e == 0) {
            int i3 = 0;
            if (this.a.read(this.d, 0, 1) != -1) {
                int i4 = (this.d[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr2 = new byte[i4];
                    int i5 = i4;
                    while (i5 > 0) {
                        int read = this.a.read(bArr2, i3, i5);
                        if (read != -1) {
                            i3 += read;
                            i5 -= read;
                        }
                    }
                    while (i4 > 0 && bArr2[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        n21 n21Var = this.c;
                        kc2 kc2Var = new kc2(i4, bArr2);
                        al2 al2Var = (al2) n21Var;
                        long max = !al2Var.l ? al2Var.i : Math.max(al2Var.m.a(true), al2Var.i);
                        int i6 = kc2Var.c - kc2Var.b;
                        nt2 nt2Var = al2Var.k;
                        nt2Var.getClass();
                        nt2Var.a(i6, kc2Var);
                        nt2Var.a(max, 1, i6, 0, (p83) null);
                        al2Var.l = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int read2 = this.a.read(bArr, i, Math.min(this.e, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        throw new UnsupportedOperationException();
    }
}

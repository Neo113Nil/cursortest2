package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes10.dex */
public final class p5v implements kpg {
    public final kpg a;
    public final int b;
    public final nkf0 c;
    public final byte[] w;
    public int x;

    public p5v(kpg kpgVar, int i, nkf0 nkf0Var) {
        d6z.l(i > 0);
        this.a = kpgVar;
        this.b = i;
        this.c = nkf0Var;
        this.w = new byte[1];
        this.x = i;
    }

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
        cj01Var.getClass();
        this.a.addTransferListener(cj01Var);
    }

    @Override // defpackage.kpg
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        return this.a.getInflatedUri();
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.x;
        kpg kpgVar = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.w;
            if (kpgVar.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int read = kpgVar.read(bArr3, i6, i5);
                        if (read != -1) {
                            i6 += read;
                            i5 -= read;
                        }
                    }
                    while (i4 > 0 && bArr3[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        ef90 ef90Var = new ef90(bArr3, i4);
                        nkf0 nkf0Var = this.c;
                        long max = !nkf0Var.F ? nkf0Var.C : Math.max(nkf0Var.G.t(true), nkf0Var.C);
                        int a = ef90Var.a();
                        g001 g001Var = nkf0Var.E;
                        g001Var.getClass();
                        g001Var.a(ef90Var, a, 0);
                        g001Var.c(max, 1, a, 0, null);
                        nkf0Var.F = true;
                    }
                }
                this.x = this.b;
            }
            return -1;
        }
        int read2 = kpgVar.read(bArr, i, Math.min(this.x, i2));
        if (read2 != -1) {
            this.x -= read2;
        }
        return read2;
    }
}

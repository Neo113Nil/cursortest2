package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class afr extends gru0 {
    public cfr n;
    public zer o;

    @Override // defpackage.gru0
    public final long b(ef90 ef90Var) {
        byte[] bArr = ef90Var.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            ef90Var.L(4);
            ef90Var.F();
        }
        int c = joa1.c(i, ef90Var);
        ef90Var.K(0);
        return c;
    }

    @Override // defpackage.gru0
    public final boolean c(ef90 ef90Var, long j, zxs0 zxs0Var) {
        byte[] bArr = ef90Var.a;
        cfr cfrVar = this.n;
        if (cfrVar == null) {
            cfr cfrVar2 = new cfr(bArr, 17, 0);
            this.n = cfrVar2;
            f7s a = cfrVar2.d(Arrays.copyOfRange(bArr, 9, ef90Var.c), null).a();
            a.l = eh20.q("audio/ogg");
            zxs0Var.a = new a(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            zer zerVar = this.o;
            if (zerVar != null) {
                zerVar.a = j;
                zxs0Var.b = zerVar;
            }
            ((a) zxs0Var.a).getClass();
            return false;
        }
        bfr a2 = ooa1.a(ef90Var);
        cfr cfrVar3 = new cfr(cfrVar.a, cfrVar.b, cfrVar.c, cfrVar.d, cfrVar.e, cfrVar.g, cfrVar.h, cfrVar.j, a2, (w820) cfrVar.l);
        this.n = cfrVar3;
        zer zerVar2 = new zer();
        zerVar2.c = cfrVar3;
        zerVar2.w = a2;
        zerVar2.a = -1L;
        zerVar2.b = -1L;
        this.o = zerVar2;
        return true;
    }

    @Override // defpackage.gru0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}

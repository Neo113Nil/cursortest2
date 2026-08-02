package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import java.util.Arrays;
import xsna.bpm0;
import xsna.tnr;

/* compiled from: FlacReader.java */
/* loaded from: classes12.dex */
public final class rnr extends bpm0 {

    @Nullable
    public tnr n;

    @Nullable
    public a o;

    /* compiled from: FlacReader.java */
    public static final class a implements gw70 {
        public tnr a;
        public tnr.a b;
        public long c;
        public long d;

        @Override // xsna.gw70
        public final long a(qgq qgqVar) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // xsna.gw70
        public final n3i0 createSeekMap() {
            fxc0.z(this.c != -1);
            return new snr(this.a, this.c);
        }

        @Override // xsna.gw70
        public final void startSeek(long j) {
            long[] jArr = this.b.a;
            this.d = jArr[y2r0.f(jArr, j, true)];
        }
    }

    @Override // xsna.bpm0
    public final long b(xi90 xi90Var) {
        byte[] bArr = xi90Var.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            xi90Var.Q(4);
            xi90Var.K();
        }
        int b = pnr.b(i, xi90Var);
        xi90Var.P(0);
        return b;
    }

    @Override // xsna.bpm0
    public final boolean c(xi90 xi90Var, long j, bpm0.a aVar) {
        byte[] bArr = xi90Var.a;
        tnr tnrVar = this.n;
        if (tnrVar == null) {
            tnr tnrVar2 = new tnr(bArr, 17);
            this.n = tnrVar2;
            a.C0043a a2 = tnrVar2.c(Arrays.copyOfRange(bArr, 9, xi90Var.c), null).a();
            a2.l = io20.q("audio/ogg");
            aVar.a = new androidx.media3.common.a(a2);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.c = j;
                aVar.b = aVar2;
            }
            aVar.a.getClass();
            return false;
        }
        tnr.a a3 = qnr.a(xi90Var);
        tnr tnrVar3 = new tnr(tnrVar.a, tnrVar.b, tnrVar.c, tnrVar.d, tnrVar.e, tnrVar.g, tnrVar.h, tnrVar.j, a3, tnrVar.l);
        this.n = tnrVar3;
        a aVar3 = new a();
        aVar3.a = tnrVar3;
        aVar3.b = a3;
        aVar3.c = -1L;
        aVar3.d = -1L;
        this.o = aVar3;
        return true;
    }

    @Override // xsna.bpm0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}

package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class v03 implements ot2 {
    public int b;
    public boolean c;
    public final /* synthetic */ x03 d;

    public v03(x03 x03Var) {
        this.d = x03Var;
    }

    @Override // yads.ot2
    public final void a() {
        x03 x03Var = this.d;
        if (x03Var.l) {
            return;
        }
        x03Var.j.a(Integer.MIN_VALUE);
    }

    @Override // yads.ot2
    public final boolean isReady() {
        return this.d.m;
    }

    @Override // yads.ot2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        if (!this.c) {
            x03 x03Var = this.d;
            co1 co1Var = x03Var.f;
            co1Var.a(new in1(1, iu1.d(x03Var.k.m), this.d.k, 0, null, co1Var.a(0L), C.TIME_UNSET));
            this.c = true;
        }
        x03 x03Var2 = this.d;
        boolean z = x03Var2.m;
        if (z && x03Var2.n == null) {
            this.b = 2;
        }
        int i2 = this.b;
        if (i2 == 2) {
            sa0Var.b |= 4;
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            ox0Var.b = x03Var2.k;
            this.b = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        x03Var2.n.getClass();
        sa0Var.b |= 1;
        sa0Var.f = 0L;
        if ((i & 4) == 0) {
            sa0Var.c(this.d.o);
            ByteBuffer byteBuffer = sa0Var.d;
            x03 x03Var3 = this.d;
            byteBuffer.put(x03Var3.n, 0, x03Var3.o);
        }
        if ((i & 1) == 0) {
            this.b = 2;
        }
        return -4;
    }

    @Override // yads.ot2
    public final int a(long j) {
        if (!this.c) {
            x03 x03Var = this.d;
            co1 co1Var = x03Var.f;
            co1Var.a(new in1(1, iu1.d(x03Var.k.m), this.d.k, 0, null, co1Var.a(0L), C.TIME_UNSET));
            this.c = true;
        }
        if (j <= 0 || this.b == 2) {
            return 0;
        }
        this.b = 2;
        return 1;
    }
}

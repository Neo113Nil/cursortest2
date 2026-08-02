package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class sv implements ot2 {
    public final ot2 b;
    public boolean c;
    public final /* synthetic */ tv d;

    public sv(tv tvVar, ot2 ot2Var) {
        this.d = tvVar;
        this.b = ot2Var;
    }

    @Override // yads.ot2
    public final void a() {
        this.b.a();
    }

    @Override // yads.ot2
    public final boolean isReady() {
        return this.d.e == C.TIME_UNSET && this.b.isReady();
    }

    @Override // yads.ot2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        if (this.d.e != C.TIME_UNSET) {
            return -3;
        }
        if (this.c) {
            sa0Var.b = 4;
            return -4;
        }
        int a = this.b.a(ox0Var, sa0Var, i);
        if (a != -5) {
            tv tvVar = this.d;
            long j = tvVar.g;
            if (j == Long.MIN_VALUE || ((a != -4 || sa0Var.f < j) && !(a == -3 && tvVar.getBufferedPositionUs() == Long.MIN_VALUE && !sa0Var.e))) {
                return a;
            }
            sa0Var.b();
            sa0Var.b = 4;
            this.c = true;
            return -4;
        }
        nx0 nx0Var = ox0Var.b;
        nx0Var.getClass();
        int i2 = nx0Var.C;
        if (i2 != 0 || nx0Var.D != 0) {
            tv tvVar2 = this.d;
            if (tvVar2.f != 0) {
                i2 = 0;
            }
            int i3 = tvVar2.g == Long.MIN_VALUE ? nx0Var.D : 0;
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.A = i2;
            mx0Var.B = i3;
            ox0Var.b = new nx0(mx0Var);
        }
        return -5;
    }

    @Override // yads.ot2
    public final int a(long j) {
        if (this.d.e != C.TIME_UNSET) {
            return -3;
        }
        return this.b.a(j);
    }
}

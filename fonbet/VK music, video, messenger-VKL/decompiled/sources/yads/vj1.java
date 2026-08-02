package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class vj1 extends w73 {
    public final gn1 c;

    public vj1(gn1 gn1Var) {
        this.c = gn1Var;
    }

    @Override // yads.w73
    public final int a() {
        return 1;
    }

    @Override // yads.w73
    public final int b() {
        return 1;
    }

    @Override // yads.w73
    public final int a(Object obj) {
        return obj == uj1.f ? 0 : -1;
    }

    @Override // yads.w73
    public final t73 a(int i, t73 t73Var, boolean z) {
        t73Var.a(z ? 0 : null, z ? uj1.f : null, 0, C.TIME_UNSET, 0L, e6.h, true);
        return t73Var;
    }

    @Override // yads.w73
    public final v73 a(int i, v73 v73Var, long j) {
        v73Var.a(v73.s, this.c, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        v73Var.m = true;
        return v73Var;
    }

    @Override // yads.w73
    public final Object a(int i) {
        return uj1.f;
    }
}

package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class kp2 extends mp2 implements i30 {
    public final gy2 f;

    public kp2(long j, nx0 nx0Var, s51 s51Var, gy2 gy2Var, ArrayList arrayList) {
        super(nx0Var, s51Var, gy2Var, arrayList);
        this.f = gy2Var;
    }

    @Override // yads.i30
    public final long a(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override // yads.i30
    public final long b(long j, long j2) {
        return this.f.b(j, j2);
    }

    @Override // yads.mp2
    public final String c() {
        return null;
    }

    @Override // yads.mp2
    public final i30 d() {
        return this;
    }

    @Override // yads.mp2
    public final qm2 e() {
        return null;
    }

    @Override // yads.i30
    public final long a(long j) {
        return this.f.b(j);
    }

    @Override // yads.i30
    public final long b() {
        return this.f.d;
    }

    @Override // yads.i30
    public final long c(long j, long j2) {
        return this.f.a(j, j2);
    }

    @Override // yads.i30
    public final long d(long j, long j2) {
        gy2 gy2Var = this.f;
        if (gy2Var.f != null) {
            return C.TIME_UNSET;
        }
        long a = gy2Var.a(j, j2);
        long a2 = gy2Var.a(j);
        if (a2 == -1) {
            a2 = (int) (gy2Var.c((j2 - gy2Var.h) + gy2Var.i, j) - gy2Var.a(j, j2));
        }
        long j3 = a2 + a;
        return (gy2Var.b(j3, j) + gy2Var.b(j3)) - gy2Var.i;
    }

    @Override // yads.i30
    public final long e(long j, long j2) {
        long a = this.f.a(j);
        return a != -1 ? a : (int) (r0.c((j2 - r0.h) + r0.i, j) - r0.a(j, j2));
    }

    @Override // yads.i30
    public final boolean a() {
        return this.f.b();
    }

    @Override // yads.i30
    public final long c(long j) {
        return this.f.a(j);
    }

    @Override // yads.i30
    public final qm2 b(long j) {
        return this.f.a(j, this);
    }
}

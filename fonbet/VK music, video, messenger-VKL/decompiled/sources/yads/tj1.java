package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class tj1 implements qn1, pn1 {
    public final zn1 b;
    public final long c;
    public final qe d;
    public mo e;
    public qn1 f;
    public pn1 g;
    public long h = C.TIME_UNSET;

    public tj1(zn1 zn1Var, qe qeVar, long j) {
        this.b = zn1Var;
        this.d = qeVar;
        this.c = j;
    }

    public final void a(zn1 zn1Var) {
        long j = this.c;
        long j2 = this.h;
        if (j2 != C.TIME_UNSET) {
            j = j2;
        }
        mo moVar = this.e;
        moVar.getClass();
        qn1 a = moVar.a(zn1Var, this.d, j);
        this.f = a;
        if (this.g != null) {
            a.a(this, j);
        }
    }

    @Override // yads.vy2
    public final boolean continueLoading(long j) {
        qn1 qn1Var = this.f;
        return qn1Var != null && qn1Var.continueLoading(j);
    }

    @Override // yads.qn1
    public final void discardBuffer(long j, boolean z) {
        qn1 qn1Var = this.f;
        int i = mc3.a;
        qn1Var.discardBuffer(j, z);
    }

    @Override // yads.vy2
    public final long getBufferedPositionUs() {
        qn1 qn1Var = this.f;
        int i = mc3.a;
        return qn1Var.getBufferedPositionUs();
    }

    @Override // yads.vy2
    public final long getNextLoadPositionUs() {
        qn1 qn1Var = this.f;
        int i = mc3.a;
        return qn1Var.getNextLoadPositionUs();
    }

    @Override // yads.qn1
    public final m83 getTrackGroups() {
        qn1 qn1Var = this.f;
        int i = mc3.a;
        return qn1Var.getTrackGroups();
    }

    @Override // yads.vy2
    public final boolean isLoading() {
        qn1 qn1Var = this.f;
        return qn1Var != null && qn1Var.isLoading();
    }

    @Override // yads.qn1
    public final void maybeThrowPrepareError() {
        qn1 qn1Var = this.f;
        if (qn1Var != null) {
            qn1Var.maybeThrowPrepareError();
            return;
        }
        mo moVar = this.e;
        if (moVar != null) {
            moVar.d();
        }
    }

    @Override // yads.qn1
    public final long readDiscontinuity() {
        qn1 qn1Var = this.f;
        int i = mc3.a;
        return qn1Var.readDiscontinuity();
    }

    @Override // yads.vy2
    public final void reevaluateBuffer(long j) {
        qn1 qn1Var = this.f;
        int i = mc3.a;
        qn1Var.reevaluateBuffer(j);
    }

    @Override // yads.qn1
    public final long seekToUs(long j) {
        qn1 qn1Var = this.f;
        int i = mc3.a;
        return qn1Var.seekToUs(j);
    }

    @Override // yads.qn1
    public final long a(long j, ay2 ay2Var) {
        qn1 qn1Var = this.f;
        int i = mc3.a;
        return qn1Var.a(j, ay2Var);
    }

    @Override // yads.uy2
    public final void a(vy2 vy2Var) {
        pn1 pn1Var = this.g;
        int i = mc3.a;
        pn1Var.a((vy2) this);
    }

    @Override // yads.pn1
    public final void a(qn1 qn1Var) {
        pn1 pn1Var = this.g;
        int i = mc3.a;
        pn1Var.a((qn1) this);
    }

    @Override // yads.qn1
    public final void a(pn1 pn1Var, long j) {
        this.g = pn1Var;
        qn1 qn1Var = this.f;
        if (qn1Var != null) {
            long j2 = this.c;
            long j3 = this.h;
            if (j3 != C.TIME_UNSET) {
                j2 = j3;
            }
            qn1Var.a(this, j2);
        }
    }

    public final void a() {
        if (this.f != null) {
            mo moVar = this.e;
            moVar.getClass();
            moVar.a(this.f);
        }
    }

    @Override // yads.qn1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ot2[] ot2VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.h;
        if (j3 == C.TIME_UNSET || j != this.c) {
            j2 = j;
        } else {
            this.h = C.TIME_UNSET;
            j2 = j3;
        }
        qn1 qn1Var = this.f;
        int i = mc3.a;
        return qn1Var.a(pp0VarArr, zArr, ot2VarArr, zArr2, j2);
    }

    public final void a(mo moVar) {
        if (this.e == null) {
            this.e = moVar;
            return;
        }
        throw new IllegalStateException();
    }
}

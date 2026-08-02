package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class mt1 implements qn1, pn1 {
    public final qn1 b;
    public final long c;
    public pn1 d;

    public mt1(qn1 qn1Var, long j) {
        this.b = qn1Var;
        this.c = j;
    }

    @Override // yads.qn1
    public final long a(long j, ay2 ay2Var) {
        return this.b.a(j - this.c, ay2Var) + this.c;
    }

    @Override // yads.vy2
    public final boolean continueLoading(long j) {
        return this.b.continueLoading(j - this.c);
    }

    @Override // yads.qn1
    public final void discardBuffer(long j, boolean z) {
        this.b.discardBuffer(j - this.c, z);
    }

    @Override // yads.vy2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.c;
    }

    @Override // yads.vy2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.c;
    }

    @Override // yads.qn1
    public final m83 getTrackGroups() {
        return this.b.getTrackGroups();
    }

    @Override // yads.vy2
    public final boolean isLoading() {
        return this.b.isLoading();
    }

    @Override // yads.qn1
    public final void maybeThrowPrepareError() {
        this.b.maybeThrowPrepareError();
    }

    @Override // yads.qn1
    public final long readDiscontinuity() {
        long readDiscontinuity = this.b.readDiscontinuity();
        return readDiscontinuity == C.TIME_UNSET ? C.TIME_UNSET : readDiscontinuity + this.c;
    }

    @Override // yads.vy2
    public final void reevaluateBuffer(long j) {
        this.b.reevaluateBuffer(j - this.c);
    }

    @Override // yads.qn1
    public final long seekToUs(long j) {
        return this.b.seekToUs(j - this.c) + this.c;
    }

    @Override // yads.uy2
    public final void a(vy2 vy2Var) {
        pn1 pn1Var = this.d;
        pn1Var.getClass();
        pn1Var.a((vy2) this);
    }

    @Override // yads.pn1
    public final void a(qn1 qn1Var) {
        pn1 pn1Var = this.d;
        pn1Var.getClass();
        pn1Var.a((qn1) this);
    }

    @Override // yads.qn1
    public final void a(pn1 pn1Var, long j) {
        this.d = pn1Var;
        this.b.a(this, j - this.c);
    }

    @Override // yads.qn1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ot2[] ot2VarArr, boolean[] zArr2, long j) {
        ot2[] ot2VarArr2 = new ot2[ot2VarArr.length];
        int i = 0;
        while (true) {
            ot2 ot2Var = null;
            if (i >= ot2VarArr.length) {
                break;
            }
            nt1 nt1Var = (nt1) ot2VarArr[i];
            if (nt1Var != null) {
                ot2Var = nt1Var.b;
            }
            ot2VarArr2[i] = ot2Var;
            i++;
        }
        long a = this.b.a(pp0VarArr, zArr, ot2VarArr2, zArr2, j - this.c);
        for (int i2 = 0; i2 < ot2VarArr.length; i2++) {
            ot2 ot2Var2 = ot2VarArr2[i2];
            if (ot2Var2 == null) {
                ot2VarArr[i2] = null;
            } else {
                ot2 ot2Var3 = ot2VarArr[i2];
                if (ot2Var3 == null || ((nt1) ot2Var3).b != ot2Var2) {
                    ot2VarArr[i2] = new nt1(ot2Var2, this.c);
                }
            }
        }
        return a + this.c;
    }
}

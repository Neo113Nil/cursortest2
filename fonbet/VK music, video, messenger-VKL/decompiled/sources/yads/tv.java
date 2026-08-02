package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class tv implements qn1, pn1 {
    public final qn1 b;
    public pn1 c;
    public sv[] d = new sv[0];
    public long e;
    public long f;
    public long g;
    public vv h;

    public tv(qn1 qn1Var, boolean z, long j, long j2) {
        this.b = qn1Var;
        this.e = z ? j : C.TIME_UNSET;
        this.f = j;
        this.g = j2;
    }

    @Override // yads.qn1
    public final long a(long j, ay2 ay2Var) {
        long j2 = this.f;
        if (j == j2) {
            return j2;
        }
        int i = mc3.a;
        long max = Math.max(0L, Math.min(ay2Var.a, j - j2));
        long j3 = ay2Var.b;
        long j4 = this.g;
        long max2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (max != ay2Var.a || max2 != ay2Var.b) {
            ay2Var = new ay2(max, max2);
        }
        return this.b.a(j, ay2Var);
    }

    @Override // yads.vy2
    public final boolean continueLoading(long j) {
        return this.b.continueLoading(j);
    }

    @Override // yads.qn1
    public final void discardBuffer(long j, boolean z) {
        this.b.discardBuffer(j, z);
    }

    @Override // yads.vy2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // yads.vy2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
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
        vv vvVar = this.h;
        if (vvVar != null) {
            throw vvVar;
        }
        this.b.maybeThrowPrepareError();
    }

    @Override // yads.qn1
    public final long readDiscontinuity() {
        long j = this.e;
        if (j != C.TIME_UNSET) {
            this.e = C.TIME_UNSET;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != C.TIME_UNSET ? readDiscontinuity : j;
        }
        long readDiscontinuity2 = this.b.readDiscontinuity();
        if (readDiscontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (readDiscontinuity2 < this.f) {
            throw new IllegalStateException();
        }
        long j2 = this.g;
        if (j2 == Long.MIN_VALUE || readDiscontinuity2 <= j2) {
            return readDiscontinuity2;
        }
        throw new IllegalStateException();
    }

    @Override // yads.vy2
    public final void reevaluateBuffer(long j) {
        this.b.reevaluateBuffer(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // yads.qn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long seekToUs(long j) {
        this.e = C.TIME_UNSET;
        for (sv svVar : this.d) {
            if (svVar != null) {
                svVar.c = false;
            }
        }
        long seekToUs = this.b.seekToUs(j);
        if (seekToUs != j) {
            if (seekToUs >= this.f) {
                long j2 = this.g;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            throw new IllegalStateException();
        }
        return seekToUs;
    }

    @Override // yads.uy2
    public final void a(vy2 vy2Var) {
        pn1 pn1Var = this.c;
        pn1Var.getClass();
        pn1Var.a((vy2) this);
    }

    @Override // yads.pn1
    public final void a(qn1 qn1Var) {
        if (this.h != null) {
            return;
        }
        pn1 pn1Var = this.c;
        pn1Var.getClass();
        pn1Var.a((qn1) this);
    }

    @Override // yads.qn1
    public final void a(pn1 pn1Var, long j) {
        this.c = pn1Var;
        this.b.a(this, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        if (r11 > r1) goto L32;
     */
    @Override // yads.qn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ot2[] ot2VarArr, boolean[] zArr2, long j) {
        this.d = new sv[ot2VarArr.length];
        ot2[] ot2VarArr2 = new ot2[ot2VarArr.length];
        int i = 0;
        while (true) {
            ot2 ot2Var = null;
            if (i >= ot2VarArr.length) {
                break;
            }
            sv[] svVarArr = this.d;
            sv svVar = (sv) ot2VarArr[i];
            svVarArr[i] = svVar;
            if (svVar != null) {
                ot2Var = svVar.b;
            }
            ot2VarArr2[i] = ot2Var;
            i++;
        }
        long a = this.b.a(pp0VarArr, zArr, ot2VarArr2, zArr2, j);
        long j2 = this.e;
        long j3 = C.TIME_UNSET;
        if (j2 != C.TIME_UNSET) {
            long j4 = this.f;
            if (j == j4 && j4 != 0) {
                int length = pp0VarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    pp0 pp0Var = pp0VarArr[i2];
                    if (pp0Var != null) {
                        nx0 c = pp0Var.c();
                        if (!iu1.a(c.m, c.j)) {
                            j3 = a;
                            break;
                        }
                    }
                    i2++;
                }
            }
        }
        this.e = j3;
        if (a != j) {
            if (a >= this.f) {
                long j5 = this.g;
                if (j5 != Long.MIN_VALUE) {
                }
            }
            throw new IllegalStateException();
        }
        for (int i3 = 0; i3 < ot2VarArr.length; i3++) {
            ot2 ot2Var2 = ot2VarArr2[i3];
            if (ot2Var2 == null) {
                this.d[i3] = null;
            } else {
                sv[] svVarArr2 = this.d;
                sv svVar2 = svVarArr2[i3];
                if (svVar2 == null || svVar2.b != ot2Var2) {
                    svVarArr2[i3] = new sv(this, ot2Var2);
                }
            }
            ot2VarArr[i3] = this.d[i3];
        }
        return a;
    }
}

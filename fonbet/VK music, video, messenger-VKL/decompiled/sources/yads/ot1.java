package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes10.dex */
public final class ot1 implements qn1, pn1 {
    public final qn1[] b;
    public final IdentityHashMap c;
    public final hc0 d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public pn1 g;
    public m83 h;
    public qn1[] i;
    public sy j;

    public ot1(hc0 hc0Var, long[] jArr, qn1... qn1VarArr) {
        this.d = hc0Var;
        this.b = qn1VarArr;
        hc0Var.getClass();
        this.j = hc0.a(new vy2[0]);
        this.c = new IdentityHashMap();
        this.i = new qn1[0];
        for (int i = 0; i < qn1VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = new mt1(qn1VarArr[i], j);
            }
        }
    }

    @Override // yads.qn1
    public final long a(long j, ay2 ay2Var) {
        qn1[] qn1VarArr = this.i;
        return (qn1VarArr.length > 0 ? qn1VarArr[0] : this.b[0]).a(j, ay2Var);
    }

    @Override // yads.vy2
    public final boolean continueLoading(long j) {
        if (this.e.isEmpty()) {
            return this.j.continueLoading(j);
        }
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((qn1) this.e.get(i)).continueLoading(j);
        }
        return false;
    }

    @Override // yads.qn1
    public final void discardBuffer(long j, boolean z) {
        for (qn1 qn1Var : this.i) {
            qn1Var.discardBuffer(j, z);
        }
    }

    @Override // yads.vy2
    public final long getBufferedPositionUs() {
        return this.j.getBufferedPositionUs();
    }

    @Override // yads.vy2
    public final long getNextLoadPositionUs() {
        return this.j.getNextLoadPositionUs();
    }

    @Override // yads.qn1
    public final m83 getTrackGroups() {
        m83 m83Var = this.h;
        m83Var.getClass();
        return m83Var;
    }

    @Override // yads.vy2
    public final boolean isLoading() {
        return this.j.isLoading();
    }

    @Override // yads.qn1
    public final void maybeThrowPrepareError() {
        for (qn1 qn1Var : this.b) {
            qn1Var.maybeThrowPrepareError();
        }
    }

    @Override // yads.qn1
    public final long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (qn1 qn1Var : this.i) {
            long readDiscontinuity = qn1Var.readDiscontinuity();
            if (readDiscontinuity != C.TIME_UNSET) {
                if (j == C.TIME_UNSET) {
                    for (qn1 qn1Var2 : this.i) {
                        if (qn1Var2 == qn1Var) {
                            break;
                        }
                        if (qn1Var2.seekToUs(readDiscontinuity) != readDiscontinuity) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = readDiscontinuity;
                } else if (readDiscontinuity != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != C.TIME_UNSET && qn1Var.seekToUs(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // yads.vy2
    public final void reevaluateBuffer(long j) {
        this.j.reevaluateBuffer(j);
    }

    @Override // yads.qn1
    public final long seekToUs(long j) {
        long seekToUs = this.i[0].seekToUs(j);
        int i = 1;
        while (true) {
            qn1[] qn1VarArr = this.i;
            if (i >= qn1VarArr.length) {
                return seekToUs;
            }
            if (qn1VarArr[i].seekToUs(seekToUs) != seekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // yads.uy2
    public final void a(vy2 vy2Var) {
        pn1 pn1Var = this.g;
        pn1Var.getClass();
        pn1Var.a((vy2) this);
    }

    @Override // yads.pn1
    public final void a(qn1 qn1Var) {
        this.e.remove(qn1Var);
        if (!this.e.isEmpty()) {
            return;
        }
        int i = 0;
        for (qn1 qn1Var2 : this.b) {
            i += qn1Var2.getTrackGroups().b;
        }
        l83[] l83VarArr = new l83[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            qn1[] qn1VarArr = this.b;
            if (i2 < qn1VarArr.length) {
                m83 trackGroups = qn1VarArr[i2].getTrackGroups();
                int i4 = trackGroups.b;
                int i5 = 0;
                while (i5 < i4) {
                    l83 a = trackGroups.a(i5);
                    l83 l83Var = new l83(i2 + StringUtils.PROCESS_POSTFIX_DELIMITER + a.c, a.e);
                    this.f.put(l83Var, a);
                    l83VarArr[i3] = l83Var;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.h = new m83(l83VarArr);
                pn1 pn1Var = this.g;
                pn1Var.getClass();
                pn1Var.a((qn1) this);
                return;
            }
        }
    }

    @Override // yads.qn1
    public final void a(pn1 pn1Var, long j) {
        this.g = pn1Var;
        Collections.addAll(this.e, this.b);
        for (qn1 qn1Var : this.b) {
            qn1Var.a(this, j);
        }
    }

    @Override // yads.qn1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ot2[] ot2VarArr, boolean[] zArr2, long j) {
        int[] iArr = new int[pp0VarArr.length];
        int[] iArr2 = new int[pp0VarArr.length];
        for (int i = 0; i < pp0VarArr.length; i++) {
            ot2 ot2Var = ot2VarArr[i];
            Integer num = ot2Var == null ? null : (Integer) this.c.get(ot2Var);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            pp0 pp0Var = pp0VarArr[i];
            if (pp0Var != null) {
                l83 l83Var = (l83) this.f.get(pp0Var.b());
                l83Var.getClass();
                int i2 = 0;
                while (true) {
                    qn1[] qn1VarArr = this.b;
                    if (i2 >= qn1VarArr.length) {
                        break;
                    }
                    int indexOf = qn1VarArr[i2].getTrackGroups().c.indexOf(l83Var);
                    if (indexOf >= 0 && indexOf != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.c.clear();
        int length = pp0VarArr.length;
        ot2[] ot2VarArr2 = new ot2[length];
        ot2[] ot2VarArr3 = new ot2[pp0VarArr.length];
        pp0[] pp0VarArr2 = new pp0[pp0VarArr.length];
        ArrayList arrayList = new ArrayList(this.b.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.b.length) {
            for (int i4 = 0; i4 < pp0VarArr.length; i4++) {
                ot2VarArr3[i4] = iArr[i4] == i3 ? ot2VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    pp0 pp0Var2 = pp0VarArr[i4];
                    pp0Var2.getClass();
                    l83 l83Var2 = (l83) this.f.get(pp0Var2.b());
                    l83Var2.getClass();
                    pp0VarArr2[i4] = new lt1(pp0Var2, l83Var2);
                } else {
                    pp0VarArr2[i4] = null;
                }
            }
            int i5 = i3;
            long a = this.b[i3].a(pp0VarArr2, zArr, ot2VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = a;
            } else if (a != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < pp0VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    ot2 ot2Var2 = ot2VarArr3[i6];
                    ot2Var2.getClass();
                    ot2VarArr2[i6] = ot2VarArr3[i6];
                    this.c.put(ot2Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5 && ot2VarArr3[i6] != null) {
                    throw new IllegalStateException();
                }
            }
            if (z) {
                arrayList.add(this.b[i5]);
            }
            i3 = i5 + 1;
        }
        System.arraycopy(ot2VarArr2, 0, ot2VarArr, 0, length);
        qn1[] qn1VarArr2 = (qn1[]) arrayList.toArray(new qn1[0]);
        this.i = qn1VarArr2;
        this.d.getClass();
        this.j = new sy(qn1VarArr2);
        return j2;
    }
}

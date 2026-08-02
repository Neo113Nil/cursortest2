package yads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class x03 implements qn1, zg1 {
    public final u30 b;
    public final o30 c;
    public final v93 d;
    public final ae0 e;
    public final co1 f;
    public final m83 g;
    public final long i;
    public final nx0 k;
    public final boolean l;
    public boolean m;
    public byte[] n;
    public int o;
    public final ArrayList h = new ArrayList();
    public final gh1 j = new gh1("SingleSampleMediaPeriod");

    public x03(u30 u30Var, o30 o30Var, v93 v93Var, nx0 nx0Var, long j, ae0 ae0Var, co1 co1Var, boolean z) {
        this.b = u30Var;
        this.c = o30Var;
        this.d = v93Var;
        this.k = nx0Var;
        this.i = j;
        this.e = ae0Var;
        this.f = co1Var;
        this.l = z;
        this.g = new m83(new l83(nx0Var));
    }

    @Override // yads.qn1
    public final long a(long j, ay2 ay2Var) {
        return j;
    }

    @Override // yads.vy2
    public final boolean continueLoading(long j) {
        if (this.m || this.j.b() || this.j.c != null) {
            return false;
        }
        p30 createDataSource = this.c.createDataSource();
        v93 v93Var = this.d;
        if (v93Var != null) {
            createDataSource.a(v93Var);
        }
        this.j.a(new w03(createDataSource, this.b), this, this.e.a(1));
        co1 co1Var = this.f;
        Uri uri = this.b.a;
        co1Var.c(new wg1(), new in1(1, -1, this.k, 0, null, co1Var.a(0L), co1Var.a(this.i)));
        return true;
    }

    @Override // yads.vy2
    public final long getBufferedPositionUs() {
        return this.m ? Long.MIN_VALUE : 0L;
    }

    @Override // yads.vy2
    public final long getNextLoadPositionUs() {
        return (this.m || this.j.b()) ? Long.MIN_VALUE : 0L;
    }

    @Override // yads.qn1
    public final m83 getTrackGroups() {
        return this.g;
    }

    @Override // yads.vy2
    public final boolean isLoading() {
        return this.j.b();
    }

    @Override // yads.qn1
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // yads.qn1
    public final long seekToUs(long j) {
        for (int i = 0; i < this.h.size(); i++) {
            v03 v03Var = (v03) this.h.get(i);
            if (v03Var.b == 2) {
                v03Var.b = 1;
            }
        }
        return j;
    }

    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2, boolean z) {
        Uri uri = ((w03) ch1Var).b.c;
        wg1 wg1Var = new wg1();
        this.e.getClass();
        co1 co1Var = this.f;
        co1Var.a(wg1Var, new in1(1, -1, null, 0, null, co1Var.a(0L), co1Var.a(this.i)));
    }

    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2) {
        w03 w03Var = (w03) ch1Var;
        this.o = (int) w03Var.b.b;
        byte[] bArr = w03Var.c;
        bArr.getClass();
        this.n = bArr;
        this.m = true;
        Uri uri = w03Var.b.c;
        wg1 wg1Var = new wg1();
        this.e.getClass();
        co1 co1Var = this.f;
        co1Var.b(wg1Var, new in1(1, -1, this.k, 0, null, co1Var.a(0L), co1Var.a(this.i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    @Override // yads.zg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ah1 a(ch1 ch1Var, long j, long j2, IOException iOException, int i) {
        long j3;
        ah1 ah1Var;
        boolean z;
        Uri uri = ((w03) ch1Var).b.c;
        wg1 wg1Var = new wg1();
        int i2 = mc3.a;
        this.e.getClass();
        if (!(iOException instanceof pc2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof r11) && !(iOException instanceof fh1)) {
            int i3 = q30.c;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof q30) || ((q30) th).b != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            boolean z2 = j3 != C.TIME_UNSET || i >= this.e.a(1);
            if (!this.l && z2) {
                ji1.d("SingleSampleMediaPeriod", ji1.a("Loading failed, treating as end-of-stream.", iOException));
                this.m = true;
                ah1Var = gh1.d;
            } else if (j3 == C.TIME_UNSET) {
                ah1Var = new ah1(0, j3);
            } else {
                ah1Var = gh1.e;
            }
            int i4 = ah1Var.a;
            z = i4 != 0 || i4 == 1;
            co1 co1Var = this.f;
            co1Var.a(wg1Var, new in1(1, -1, this.k, 0, null, co1Var.a(0L), co1Var.a(this.i)), iOException, !z);
            if (!z) {
                this.e.getClass();
            }
            return ah1Var;
        }
        j3 = -9223372036854775807L;
        if (j3 != C.TIME_UNSET) {
        }
        if (!this.l) {
        }
        if (j3 == C.TIME_UNSET) {
        }
        int i42 = ah1Var.a;
        if (i42 != 0) {
        }
        co1 co1Var2 = this.f;
        co1Var2.a(wg1Var, new in1(1, -1, this.k, 0, null, co1Var2.a(0L), co1Var2.a(this.i)), iOException, !z);
        if (!z) {
        }
        return ah1Var;
    }

    @Override // yads.qn1
    public final void maybeThrowPrepareError() {
    }

    @Override // yads.qn1
    public final void a(pn1 pn1Var, long j) {
        pn1Var.a((qn1) this);
    }

    @Override // yads.qn1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ot2[] ot2VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < pp0VarArr.length; i++) {
            ot2 ot2Var = ot2VarArr[i];
            if (ot2Var != null && (pp0VarArr[i] == null || !zArr[i])) {
                this.h.remove(ot2Var);
                ot2VarArr[i] = null;
            }
            if (ot2VarArr[i] == null && pp0VarArr[i] != null) {
                v03 v03Var = new v03(this);
                this.h.add(v03Var);
                ot2VarArr[i] = v03Var;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // yads.vy2
    public final void reevaluateBuffer(long j) {
    }

    @Override // yads.qn1
    public final void discardBuffer(long j, boolean z) {
    }
}

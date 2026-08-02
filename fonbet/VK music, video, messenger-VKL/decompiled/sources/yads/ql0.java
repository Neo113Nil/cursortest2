package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class ql0 implements vl0 {
    public final List a;
    public final q83[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = C.TIME_UNSET;

    public ql0(List list) {
        this.a = list;
        this.b = new q83[list.size()];
    }

    @Override // yads.vl0
    public final void a(kc2 kc2Var) {
        if (this.c) {
            if (this.d == 2) {
                if (kc2Var.c - kc2Var.b == 0) {
                    return;
                }
                if (kc2Var.m() != 32) {
                    this.c = false;
                }
                this.d--;
                if (!this.c) {
                    return;
                }
            }
            if (this.d == 1) {
                if (kc2Var.c - kc2Var.b == 0) {
                    return;
                }
                if (kc2Var.m() != 0) {
                    this.c = false;
                }
                this.d--;
                if (!this.c) {
                    return;
                }
            }
            int i = kc2Var.b;
            int i2 = kc2Var.c - i;
            for (q83 q83Var : this.b) {
                kc2Var.e(i);
                q83Var.a(i2, kc2Var);
            }
            this.e += i2;
        }
    }

    @Override // yads.vl0
    public final void b() {
        if (this.c) {
            if (this.f != C.TIME_UNSET) {
                for (q83 q83Var : this.b) {
                    q83Var.a(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        for (int i = 0; i < this.b.length; i++) {
            ma3 ma3Var = (ma3) this.a.get(i);
            pa3Var.a();
            pa3Var.b();
            q83 a = qq0Var.a(pa3Var.d, 3);
            mx0 mx0Var = new mx0();
            pa3Var.b();
            mx0Var.a = pa3Var.e;
            mx0Var.k = MimeTypes.APPLICATION_DVBSUBS;
            mx0Var.m = Collections.singletonList(ma3Var.b);
            mx0Var.c = ma3Var.a;
            a.a(new nx0(mx0Var));
            this.b[i] = a;
        }
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != C.TIME_UNSET) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // yads.vl0
    public final void a() {
        this.c = false;
        this.f = C.TIME_UNSET;
    }
}

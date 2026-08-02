package xsna;

import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import xsna.tsp0;

/* compiled from: DvbSubtitleReader.java */
/* loaded from: classes12.dex */
public final class qoo implements zap {
    public final List<tsp0.a> a;
    public final rgp0[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = C.TIME_UNSET;

    public qoo(List list) {
        this.a = list;
        this.b = new rgp0[list.size()];
    }

    @Override // xsna.zap
    public final void a(xi90 xi90Var) {
        boolean z;
        boolean z2;
        if (this.c) {
            if (this.d == 2) {
                if (xi90Var.a() == 0) {
                    z2 = false;
                } else {
                    if (xi90Var.C() != 32) {
                        this.c = false;
                    }
                    this.d--;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (xi90Var.a() == 0) {
                    z = false;
                } else {
                    if (xi90Var.C() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int i = xi90Var.b;
            int a = xi90Var.a();
            for (rgp0 rgp0Var : this.b) {
                xi90Var.P(i);
                rgp0Var.d(a, xi90Var);
            }
            this.e += a;
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        int i = 0;
        while (true) {
            rgp0[] rgp0VarArr = this.b;
            if (i >= rgp0VarArr.length) {
                return;
            }
            tsp0.a aVar = this.a.get(i);
            cVar.a();
            cVar.b();
            rgp0 track = rgqVar.track(cVar.d, 3);
            a.C0043a c0043a = new a.C0043a();
            cVar.b();
            c0043a.a = cVar.e;
            c0043a.l = io20.q("video/mp2t");
            c0043a.m = io20.q(MimeTypes.APPLICATION_DVBSUBS);
            c0043a.p = Collections.singletonList(aVar.b);
            c0043a.d = aVar.a;
            zjh0.d(c0043a, track);
            rgp0VarArr[i] = track;
            i++;
        }
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
        if (this.c) {
            fxc0.z(this.f != C.TIME_UNSET);
            for (rgp0 rgp0Var : this.b) {
                rgp0Var.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // xsna.zap
    public final void seek() {
        this.c = false;
        this.f = C.TIME_UNSET;
    }
}

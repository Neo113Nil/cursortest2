package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.ri;
import xsna.tsp0;

/* compiled from: Ac4Reader.java */
/* loaded from: classes12.dex */
public final class qi implements zap {
    public final wi90 a;
    public final xi90 b;

    @Nullable
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public rgp0 g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public androidx.media3.common.a l;
    public int m;
    public long n;

    public qi(@Nullable String str, int i, String str2) {
        wi90 wi90Var = new wi90(new byte[16], 16);
        this.a = wi90Var;
        this.b = new xi90(wi90Var.b);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = C.TIME_UNSET;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // xsna.zap
    public final void a(xi90 xi90Var) {
        this.g.getClass();
        while (xi90Var.a() > 0) {
            int i = this.h;
            xi90 xi90Var2 = this.b;
            if (i == 0) {
                while (xi90Var.a() > 0) {
                    if (this.j) {
                        int C = xi90Var.C();
                        this.j = C == 172;
                        if (C == 64 || C == 65) {
                            boolean z = C == 65;
                            this.h = 1;
                            byte[] bArr = xi90Var2.a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z ? 65 : 64);
                            this.i = 2;
                        }
                    } else {
                        this.j = xi90Var.C() == 172;
                    }
                }
            } else if (i == 1) {
                byte[] bArr2 = xi90Var2.a;
                int min = Math.min(xi90Var.a(), 16 - this.i);
                xi90Var.n(bArr2, this.i, min);
                int i2 = this.i + min;
                this.i = i2;
                if (i2 == 16) {
                    wi90 wi90Var = this.a;
                    wi90Var.m(0);
                    ri.b b = ri.b(wi90Var);
                    int i3 = b.a;
                    androidx.media3.common.a aVar = this.l;
                    if (aVar == null || 2 != aVar.F || i3 != aVar.G || !"audio/ac4".equals(aVar.n)) {
                        a.C0043a c0043a = new a.C0043a();
                        c0043a.a = this.f;
                        c0043a.l = io20.q(this.e);
                        c0043a.m = io20.q("audio/ac4");
                        c0043a.E = 2;
                        c0043a.F = i3;
                        c0043a.d = this.c;
                        c0043a.f = this.d;
                        androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0043a);
                        this.l = aVar2;
                        this.g.c(aVar2);
                    }
                    this.m = b.b;
                    this.k = (b.c * 1000000) / this.l.G;
                    xi90Var2.P(0);
                    this.g.d(16, xi90Var2);
                    this.h = 2;
                }
            } else if (i == 2) {
                int min2 = Math.min(xi90Var.a(), this.m - this.i);
                this.g.d(min2, xi90Var);
                int i4 = this.i + min2;
                this.i = i4;
                if (i4 == this.m) {
                    fxc0.z(this.n != C.TIME_UNSET);
                    this.g.a(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                }
            }
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.f = cVar.e;
        cVar.b();
        this.g = rgqVar.track(cVar.d, 1);
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.n = j;
    }

    @Override // xsna.zap
    public final void seek() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = C.TIME_UNSET;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
    }
}

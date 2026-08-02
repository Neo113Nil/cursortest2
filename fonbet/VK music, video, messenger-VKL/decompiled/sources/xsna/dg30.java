package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.eg30;
import xsna.tsp0;

/* compiled from: MpegAudioReader.java */
/* loaded from: classes12.dex */
public final class dg30 implements zap {
    public final xi90 a;
    public final eg30.a b;

    @Nullable
    public final String c;
    public final int d;
    public final String e;
    public rgp0 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public dg30(@Nullable String str, int i, String str2) {
        xi90 xi90Var = new xi90(4);
        this.a = xi90Var;
        xi90Var.a[0] = -1;
        this.b = new eg30.a();
        this.n = C.TIME_UNSET;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // xsna.zap
    public final void a(xi90 xi90Var) {
        this.f.getClass();
        while (xi90Var.a() > 0) {
            int i = this.h;
            xi90 xi90Var2 = this.a;
            if (i == 0) {
                byte[] bArr = xi90Var.a;
                int i2 = xi90Var.b;
                int i3 = xi90Var.c;
                while (true) {
                    if (i2 >= i3) {
                        xi90Var.P(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        xi90Var.P(i2 + 1);
                        this.k = false;
                        xi90Var2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(xi90Var.a(), 4 - this.i);
                xi90Var.n(xi90Var2.a, this.i, min);
                int i4 = this.i + min;
                this.i = i4;
                if (i4 >= 4) {
                    xi90Var2.P(0);
                    int p = xi90Var2.p();
                    eg30.a aVar = this.b;
                    if (aVar.a(p)) {
                        this.m = aVar.c;
                        if (!this.j) {
                            this.l = (aVar.g * 1000000) / aVar.d;
                            a.C0043a c0043a = new a.C0043a();
                            c0043a.a = this.g;
                            c0043a.l = io20.q(this.e);
                            c0043a.m = io20.q(aVar.b);
                            c0043a.n = 4096;
                            c0043a.E = aVar.e;
                            c0043a.F = aVar.d;
                            c0043a.d = this.c;
                            c0043a.f = this.d;
                            this.f.c(new androidx.media3.common.a(c0043a));
                            this.j = true;
                        }
                        xi90Var2.P(0);
                        this.f.d(4, xi90Var2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(xi90Var.a(), this.m - this.i);
                this.f.d(min2, xi90Var);
                int i5 = this.i + min2;
                this.i = i5;
                if (i5 >= this.m) {
                    fxc0.z(this.n != C.TIME_UNSET);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.g = cVar.e;
        cVar.b();
        this.f = rgqVar.track(cVar.d, 1);
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.n = j;
    }

    @Override // xsna.zap
    public final void seek() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = C.TIME_UNSET;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
    }
}

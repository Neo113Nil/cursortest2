package xsna;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.c8x;
import xsna.d8x;
import xsna.p7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ihz0 implements d8x.a {
    public f5z0 e;
    public thz0 f;
    public d8x g;
    public p7z0.e h;
    public lgz0 i;
    public int n;
    public float o;
    public izy0 d = null;
    public int j = 0;
    public int k = 10;
    public float l = 1.0f;
    public float m = 1.0f;
    public final saz0 a = saz0.b(200);
    public final kwy0 b = new kwy0(null, null, null, null, new wiy0(new Handler(Looper.getMainLooper())));
    public final cuy0 c = new cuy0(this, 1);

    public final void a(float f, float f2, float f3) {
        lgz0 lgz0Var;
        this.n = 0;
        this.o = f2;
        kwy0 kwy0Var = this.b;
        if (f2 < f3) {
            kwy0Var.b(f2, f3);
            f5z0 f5z0Var = this.e;
            if (f5z0Var != null) {
                f5z0Var.c(f2, f3);
            }
            p7z0.e eVar = this.h;
            if (eVar == null || (lgz0Var = this.i) == null) {
                return;
            }
            p7z0 p7z0Var = p7z0.this;
            if (eVar.b(lgz0Var)) {
                return;
            }
            c8x.c cVar = p7z0Var.a.l;
            if (cVar != null) {
                cVar.a(f, f3);
            }
            p7z0Var.r.getClass();
            return;
        }
        if (c(4)) {
            kwy0Var.b(f3, f3);
            this.o = f3;
            this.a.h(this.c);
            f5z0 f5z0Var2 = this.e;
            if (f5z0Var2 != null) {
                f5z0Var2.c(f3, f3);
            }
            lgz0 lgz0Var2 = this.i;
            this.i = null;
            f5z0 f5z0Var3 = this.e;
            if (f5z0Var3 != null) {
                f5z0Var3.b();
                this.e = null;
            }
            izy0 izy0Var = this.d;
            if (izy0Var != null) {
                izy0Var.h();
                this.d = null;
            }
            thz0 thz0Var = this.f;
            if (thz0Var != null) {
                thz0Var.g();
            }
            if (lgz0Var2 == null) {
                return;
            }
            p7z0.e eVar2 = this.h;
            if (eVar2 != null) {
                p7z0 p7z0Var2 = p7z0.this;
                if (!eVar2.b(lgz0Var2)) {
                    c8x.c cVar2 = p7z0Var2.a.l;
                    if (cVar2 != null) {
                        cVar2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
                    }
                    p7z0Var2.r.getClass();
                }
            }
            if (this.h != null) {
                kwy0Var.i();
                this.h.a(lgz0Var2);
            }
        }
    }

    public final void b(lgz0 lgz0Var, boolean z) {
        d8x d8xVar;
        if (c(1)) {
            this.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = lgz0Var;
            kwy0 kwy0Var = this.b;
            kwy0Var.c(lgz0Var);
            this.e = f5z0.a(lgz0Var.a, null);
            thz0 thz0Var = this.f;
            if (thz0Var != null) {
                thz0Var.g();
            }
            izy0 izy0Var = this.d;
            if (izy0Var != null) {
                izy0Var.h();
                this.d = null;
            }
            d8x d8xVar2 = this.g;
            if (d8xVar2 != null) {
                View view = d8xVar2.getView();
                this.e.d(view);
                if (!z) {
                    this.f = thz0.a(lgz0Var, 3, this.i, view.getContext());
                    this.d = izy0.b(lgz0Var.b, lgz0Var.a, null);
                }
            }
            kwy0Var.c = this.f;
            kwy0Var.j = new sqk0(this, 11);
            sgz0 sgz0Var = (sgz0) lgz0Var.v0;
            if (sgz0Var == null || (d8xVar = this.g) == null) {
                return;
            }
            d8xVar.setVolume(this.l);
            this.g.d(Uri.parse(sgz0Var.a), sgz0Var.b, sgz0Var.c);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0 != 5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (r0 != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r0 != 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r0 != 3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i) {
        int i2 = this.j;
        boolean z = false;
        if (i != i2) {
            switch (i) {
                case 1:
                case 6:
                    z = true;
                    break;
                case 2:
                    if (i2 != 1) {
                    }
                    z = true;
                    break;
                case 3:
                    if (i2 != 1) {
                    }
                    z = true;
                    break;
                case 4:
                    if (i2 != 1) {
                        if (i2 != 2) {
                            break;
                        }
                    }
                    z = true;
                    break;
                case 5:
                    if (i2 != 1) {
                        if (i2 != 2) {
                        }
                    }
                    z = true;
                    break;
            }
        }
        if (!z) {
            gu8.c(null, "InstreamAdVideoController: wrong state transition from " + this.j + " to " + i);
            return z;
        }
        gu8.c(null, "InstreamAdVideoController: state has been changed from " + this.j + " to " + i);
        this.j = i;
        return z;
    }

    public final void d() {
        float f;
        float f2;
        float f3;
        lgz0 lgz0Var;
        d8x d8xVar;
        lgz0 lgz0Var2 = this.i;
        cuy0 cuy0Var = this.c;
        saz0 saz0Var = this.a;
        if (lgz0Var2 == null) {
            saz0Var.h(cuy0Var);
            return;
        }
        float f4 = lgz0Var2.D;
        boolean z = this.j == 2;
        if (!z || (d8xVar = this.g) == null) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            f = d8xVar.e();
            f2 = this.g.g();
            f3 = f4 - f2;
        }
        if (!z || this.o == f2 || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.n++;
        } else {
            a(f3, f2, f4);
        }
        if (this.n >= (this.k * 1000) / 200) {
            gu8.c(null, "InstreamAdVideoController: Video freeze more then " + this.k + " seconds, stopping");
            saz0Var.h(cuy0Var);
            this.b.m();
            p7z0.e eVar = this.h;
            if (eVar != null && (lgz0Var = this.i) != null) {
                p7z0 p7z0Var = p7z0.this;
                if (!eVar.b(lgz0Var)) {
                    c8x.c cVar = p7z0Var.a.l;
                    if (cVar != null) {
                        cVar.onError();
                    }
                    jbz0 jbz0Var = p7z0Var.r;
                    jbz0Var.a.removeCallbacks(jbz0Var.b);
                    p7z0Var.g();
                }
            }
            this.i = null;
            f5z0 f5z0Var = this.e;
            if (f5z0Var != null) {
                f5z0Var.b();
                this.e = null;
            }
            izy0 izy0Var = this.d;
            if (izy0Var != null) {
                izy0Var.h();
                this.d = null;
            }
            thz0 thz0Var = this.f;
            if (thz0Var != null) {
                thz0Var.g();
            }
        }
    }

    public final void e() {
        p7z0.e eVar;
        c8x.c cVar;
        if (c(5)) {
            this.b.o();
            izy0 izy0Var = this.d;
            if (izy0Var != null) {
                izy0Var.h();
            }
            this.a.h(this.c);
            lgz0 lgz0Var = this.i;
            this.i = null;
            f5z0 f5z0Var = this.e;
            if (f5z0Var != null) {
                f5z0Var.b();
                this.e = null;
            }
            izy0 izy0Var2 = this.d;
            if (izy0Var2 != null) {
                izy0Var2.h();
                this.d = null;
            }
            thz0 thz0Var = this.f;
            if (thz0Var != null) {
                thz0Var.g();
            }
            if (lgz0Var == null || (eVar = this.h) == null || eVar.b(lgz0Var) || (cVar = p7z0.this.a.l) == null) {
                return;
            }
            cVar.f();
        }
    }

    public final void f(String str) {
        p7z0.e eVar;
        if (c(6)) {
            this.b.l();
            izy0 izy0Var = this.d;
            if (izy0Var != null) {
                izy0Var.h();
            }
            this.a.h(this.c);
            lgz0 lgz0Var = this.i;
            this.i = null;
            f5z0 f5z0Var = this.e;
            if (f5z0Var != null) {
                f5z0Var.b();
                this.e = null;
            }
            izy0 izy0Var2 = this.d;
            if (izy0Var2 != null) {
                izy0Var2.h();
                this.d = null;
            }
            thz0 thz0Var = this.f;
            if (thz0Var != null) {
                thz0Var.g();
            }
            if (lgz0Var == null || (eVar = this.h) == null) {
                return;
            }
            p7z0 p7z0Var = p7z0.this;
            if (eVar.b(lgz0Var)) {
                return;
            }
            c8x.c cVar = p7z0Var.a.l;
            if (cVar != null) {
                cVar.onError();
            }
            jbz0 jbz0Var = p7z0Var.r;
            jbz0Var.a.removeCallbacks(jbz0Var.b);
            p7z0Var.g();
        }
    }
}

package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.impl.model.BoundingBox;

/* compiled from: Point.kt */
/* loaded from: classes2.dex */
public class elb0 implements lif0, atx0 {
    public final String b;
    public final float c;
    public final float d;
    public hah0 e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public elb0(String str, float f, float f2, hah0 hah0Var) {
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = hah0Var;
        this.f = f;
        this.g = f2;
        this.h = f2;
        this.i = f;
    }

    @Override // xsna.atx0
    public final String a() {
        return this.b;
    }

    @Override // xsna.snt
    public final boolean b(lif0 lif0Var) {
        float f = lif0Var.f();
        float f2 = this.h;
        if (f > f2 || f2 > lif0Var.g()) {
            return false;
        }
        float k = lif0Var.k();
        float f3 = this.i;
        return k <= f3 && f3 <= lif0Var.l();
    }

    public elb0 c() {
        return new elb0(this.b, this.c, this.d, this.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elb0)) {
            return false;
        }
        return epx.f(this.b, ((elb0) obj).b);
    }

    @Override // xsna.lif0
    public final float f() {
        return this.h;
    }

    @Override // xsna.lif0
    public final float g() {
        return this.h;
    }

    public int hashCode() {
        return this.b.hashCode() + (elb0.class.hashCode() * 31);
    }

    @Override // xsna.lif0
    public final BoundingBox i(lif0 lif0Var) {
        float f = lif0Var.f();
        float f2 = this.h;
        if (f2 <= f) {
            f = f2;
        }
        float k = lif0Var.k();
        float f3 = this.i;
        if (f3 <= k) {
            k = f3;
        }
        float g = lif0Var.g();
        if (f2 < g) {
            f2 = g;
        }
        float l = lif0Var.l();
        if (f3 < l) {
            f3 = l;
        }
        return new BoundingBox(f, k, f2, f3, null);
    }

    @Override // xsna.lif0
    public final float k() {
        return this.i;
    }

    @Override // xsna.lif0
    public final float l() {
        return this.i;
    }

    @Override // xsna.lif0
    public final float o() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.luu, xsna.ktx0
    public final lif0 d() {
        return this;
    }

    @Override // xsna.luu
    public final snt n() {
        return this;
    }
}

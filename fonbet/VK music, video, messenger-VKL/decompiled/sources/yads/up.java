package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class up {
    public final sz1 a;
    public final k62 b;
    public final n82 c;
    public final l82 d;
    public final y02 e;
    public final g42 f;
    public final u22 g;
    public final ov2 h;
    public final gz1 i;
    public final va j;

    public up(sz1 sz1Var, l22 l22Var, n82 n82Var, l82 l82Var, y02 y02Var, g42 g42Var, u22 u22Var, ov2 ov2Var, gz1 gz1Var, va vaVar) {
        this.a = sz1Var;
        this.b = l22Var;
        this.c = n82Var;
        this.d = l82Var;
        this.e = y02Var;
        this.f = g42Var;
        this.g = u22Var;
        this.h = ov2Var;
        this.i = gz1Var;
        this.j = vaVar;
    }

    public final va a() {
        return this.j;
    }

    public final u22 b() {
        return this.g;
    }

    public final g42 c() {
        return this.f;
    }

    public final sz1 d() {
        return this.a;
    }

    public final y02 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up)) {
            return false;
        }
        up upVar = (up) obj;
        return epx.f(this.a, upVar.a) && epx.f(this.b, upVar.b) && epx.f(this.c, upVar.c) && epx.f(this.d, upVar.d) && epx.f(this.e, upVar.e) && epx.f(this.f, upVar.f) && epx.f(this.g, upVar.g) && epx.f(this.h, upVar.h) && epx.f(this.i, upVar.i) && this.j == upVar.j;
    }

    public final gz1 f() {
        return this.i;
    }

    public final k62 g() {
        return this.b;
    }

    public final l82 h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        gz1 gz1Var = this.i;
        return this.j.hashCode() + ((hashCode + (gz1Var == null ? 0 : gz1Var.hashCode())) * 31);
    }

    public final n82 i() {
        return this.c;
    }

    public final ov2 j() {
        return this.h;
    }

    public final String toString() {
        return "BinderConfiguration(nativeAdBlock=" + this.a + ", nativeValidator=" + this.b + ", nativeVisualBlock=" + this.c + ", nativeViewRenderer=" + this.d + ", nativeAdFactoriesProvider=" + this.e + ", forceImpressionConfigurator=" + this.f + ", adViewRenderingValidator=" + this.g + ", sdkEnvironmentModule=" + this.h + ", nativeData=" + this.i + ", adStructureType=" + this.j + ")";
    }
}

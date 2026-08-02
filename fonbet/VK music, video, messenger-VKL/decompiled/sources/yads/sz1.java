package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class sz1 {
    public final e22 a;
    public final v9 b;
    public final d4 c;

    public sz1(v9 v9Var, d4 d4Var, e22 e22Var) {
        this.a = e22Var;
        this.b = v9Var;
        this.c = d4Var;
    }

    public final d4 a() {
        return this.c;
    }

    public final v9 b() {
        return this.b;
    }

    public final e22 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz1)) {
            return false;
        }
        sz1 sz1Var = (sz1) obj;
        return epx.f(this.a, sz1Var.a) && epx.f(this.b, sz1Var.b) && epx.f(this.c, sz1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdBlock(nativeAdResponse=" + this.a + ", adResponse=" + this.b + ", adConfiguration=" + this.c + ")";
    }
}

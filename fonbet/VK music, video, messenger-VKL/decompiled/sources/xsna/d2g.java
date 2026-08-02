package xsna;

/* compiled from: CollageSlotTransform.kt */
/* loaded from: classes4.dex */
public final class d2g {
    public final Float a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final Float f;
    public final Float g;
    public final Float h;

    public d2g() {
        this(null, null, null, null, null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2g)) {
            return false;
        }
        d2g d2gVar = (d2g) obj;
        return epx.f(this.a, d2gVar.a) && epx.f(this.b, d2gVar.b) && epx.f(this.c, d2gVar.c) && epx.f(this.d, d2gVar.d) && epx.f(this.e, d2gVar.e) && epx.f(this.f, d2gVar.f) && epx.f(this.g, d2gVar.g) && epx.f(this.h, d2gVar.h);
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.b;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.c;
        int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.d;
        int hashCode4 = (hashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.e;
        int hashCode5 = (hashCode4 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.f;
        int hashCode6 = (hashCode5 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.g;
        int hashCode7 = (hashCode6 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.h;
        return hashCode7 + (f8 != null ? f8.hashCode() : 0);
    }

    public final String toString() {
        return "CollageSlotTransform(translateX=" + this.a + ", translateY=" + this.b + ", scale=" + this.c + ", angle=" + this.d + ", diffX=" + this.e + ", diffY=" + this.f + ", diffScale=" + this.g + ", diffAngle=" + this.h + ")";
    }

    public d2g(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, int i) {
        f = (i & 1) != 0 ? null : f;
        f2 = (i & 2) != 0 ? null : f2;
        f3 = (i & 4) != 0 ? null : f3;
        f4 = (i & 8) != 0 ? null : f4;
        f5 = (i & 16) != 0 ? null : f5;
        f6 = (i & 32) != 0 ? null : f6;
        f7 = (i & 64) != 0 ? null : f7;
        f8 = (i & 128) != 0 ? null : f8;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
    }
}

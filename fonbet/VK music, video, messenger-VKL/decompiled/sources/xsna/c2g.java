package xsna;

/* compiled from: CollageSlotConfig.kt */
/* loaded from: classes4.dex */
public final class c2g {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final e4p i;

    public c2g(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, e4p e4pVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = e4pVar;
    }

    public static c2g a(c2g c2gVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        if ((i & 1) != 0) {
            f = c2gVar.a;
        }
        float f9 = f;
        if ((i & 2) != 0) {
            f2 = c2gVar.b;
        }
        float f10 = f2;
        if ((i & 4) != 0) {
            f3 = c2gVar.c;
        }
        float f11 = f3;
        if ((i & 8) != 0) {
            f4 = c2gVar.d;
        }
        float f12 = f4;
        if ((i & 16) != 0) {
            f5 = c2gVar.e;
        }
        float f13 = f5;
        float f14 = (i & 32) != 0 ? c2gVar.f : f6;
        float f15 = (i & 64) != 0 ? c2gVar.g : f7;
        float f16 = (i & 128) != 0 ? c2gVar.h : f8;
        e4p e4pVar = c2gVar.i;
        c2gVar.getClass();
        return new c2g(f9, f10, f11, f12, f13, f14, f15, f16, e4pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2g)) {
            return false;
        }
        c2g c2gVar = (c2g) obj;
        return Float.compare(this.a, c2gVar.a) == 0 && Float.compare(this.b, c2gVar.b) == 0 && Float.compare(this.c, c2gVar.c) == 0 && Float.compare(this.d, c2gVar.d) == 0 && Float.compare(this.e, c2gVar.e) == 0 && Float.compare(this.f, c2gVar.f) == 0 && Float.compare(this.g, c2gVar.g) == 0 && Float.compare(this.h, c2gVar.h) == 0 && epx.f(this.i, c2gVar.i);
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
        e4p e4pVar = this.i;
        return a + (e4pVar == null ? 0 : e4pVar.hashCode());
    }

    public final String toString() {
        StringBuilder a = bxj0.a("CollageSlotConfig(x=", this.a, ", y=", this.b, ", w=");
        gq.h(a, this.c, ", h=", this.d, ", translateX=");
        gq.h(a, this.e, ", translateY=", this.f, ", scale=");
        gq.h(a, this.g, ", rotateAngle=", this.h, ", imageLink=");
        a.append(this.i);
        a.append(")");
        return a.toString();
    }
}

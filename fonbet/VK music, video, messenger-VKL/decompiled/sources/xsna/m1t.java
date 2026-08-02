package xsna;

/* compiled from: GLCollageSlotConfig.kt */
/* loaded from: classes4.dex */
public final class m1t {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final e4p i;
    public final f2t j;
    public final f2t k;

    public m1t(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, e4p e4pVar, f2t f2tVar, f2t f2tVar2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = e4pVar;
        this.j = f2tVar;
        this.k = f2tVar2;
    }

    public static m1t a(m1t m1tVar, f2t f2tVar, f2t f2tVar2, int i) {
        float f = m1tVar.a;
        float f2 = m1tVar.b;
        float f3 = m1tVar.c;
        float f4 = m1tVar.d;
        float f5 = m1tVar.e;
        float f6 = m1tVar.f;
        float f7 = m1tVar.g;
        float f8 = m1tVar.h;
        e4p e4pVar = m1tVar.i;
        if ((i & 512) != 0) {
            f2tVar = m1tVar.j;
        }
        f2t f2tVar3 = f2tVar;
        if ((i & 1024) != 0) {
            f2tVar2 = m1tVar.k;
        }
        return new m1t(f, f2, f3, f4, f5, f6, f7, f8, e4pVar, f2tVar3, f2tVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1t)) {
            return false;
        }
        m1t m1tVar = (m1t) obj;
        return Float.compare(this.a, m1tVar.a) == 0 && Float.compare(this.b, m1tVar.b) == 0 && Float.compare(this.c, m1tVar.c) == 0 && Float.compare(this.d, m1tVar.d) == 0 && Float.compare(this.e, m1tVar.e) == 0 && Float.compare(this.f, m1tVar.f) == 0 && Float.compare(this.g, m1tVar.g) == 0 && Float.compare(this.h, m1tVar.h) == 0 && epx.f(this.i, m1tVar.i) && epx.f(this.j, m1tVar.j) && epx.f(this.k, m1tVar.k);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31;
        f2t f2tVar = this.j;
        int hashCode2 = (hashCode + (f2tVar == null ? 0 : f2tVar.hashCode())) * 31;
        f2t f2tVar2 = this.k;
        return hashCode2 + (f2tVar2 != null ? f2tVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = bxj0.a("GLCollageSlotConfig(x=", this.a, ", y=", this.b, ", w=");
        gq.h(a, this.c, ", h=", this.d, ", translateX=");
        gq.h(a, this.e, ", translateY=", this.f, ", scale=");
        gq.h(a, this.g, ", rotateAngle=", this.h, ", imageLink=");
        a.append(this.i);
        a.append(", textureInfo=");
        a.append(this.j);
        a.append(", enhancedTextureInfo=");
        a.append(this.k);
        a.append(")");
        return a.toString();
    }
}

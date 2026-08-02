package xsna;

/* compiled from: ColorData.kt */
/* loaded from: classes4.dex */
public final class y5g {
    public final y8g a;
    public final y8g b;
    public final y8g c;
    public final y8g d;
    public final boolean e;
    public final boolean f;

    public y5g(y8g y8gVar, y8g y8gVar2, y8g y8gVar3, y8g y8gVar4, boolean z, boolean z2) {
        this.a = y8gVar;
        this.b = y8gVar2;
        this.c = y8gVar3;
        this.d = y8gVar4;
        this.e = z;
        this.f = z2;
    }

    public static y5g a(y5g y5gVar, y8g y8gVar, y8g y8gVar2, y8g y8gVar3, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            y8gVar = y5gVar.a;
        }
        y8g y8gVar4 = y8gVar;
        y8g y8gVar5 = y5gVar.d;
        if ((i & 16) != 0) {
            z = y5gVar.e;
        }
        y5gVar.getClass();
        return new y5g(y8gVar4, y8gVar2, y8gVar3, y8gVar5, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5g)) {
            return false;
        }
        y5g y5gVar = (y5g) obj;
        return epx.f(this.a, y5gVar.a) && epx.f(this.b, y5gVar.b) && epx.f(this.c, y5gVar.c) && epx.f(this.d, y5gVar.d) && this.e == y5gVar.e && this.f == y5gVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "ColorData(selectedColor=" + this.a + ", backgroundColor=" + this.b + ", fontColor=" + this.c + ", pipetteColor=" + this.d + ", selectedByPipette=" + this.e + ", applyToBackground=" + this.f + ")";
    }
}

package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k8v extends w3b1 {
    public final String a;
    public final Float b;
    public final Float c;
    public final nhe d;
    public final y7m e;
    public final y7m f;
    public final ldc g;
    public final ldc h;

    public k8v(String str, Float f, Float f2, nhe nheVar, y7m y7mVar, y7m y7mVar2, ldc ldcVar, ldc ldcVar2) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = nheVar;
        this.e = y7mVar;
        this.f = y7mVar2;
        this.g = ldcVar;
        this.h = ldcVar2;
    }

    @Override // defpackage.w3b1
    public final ldc b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8v)) {
            return false;
        }
        k8v k8vVar = (k8v) obj;
        return jl40.l(this.a, k8vVar.a) && jl40.l(this.b, k8vVar.b) && jl40.l(this.c, k8vVar.c) && this.d.equals(k8vVar.d) && jl40.l(this.e, k8vVar.e) && jl40.l(this.f, k8vVar.f) && jl40.l(this.g, k8vVar.g) && jl40.l(this.h, k8vVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31)) * 31;
        y7m y7mVar = this.e;
        int hashCode4 = (hashCode3 + (y7mVar == null ? 0 : Float.hashCode(y7mVar.a))) * 31;
        y7m y7mVar2 = this.f;
        int hashCode5 = (hashCode4 + (y7mVar2 == null ? 0 : Float.hashCode(y7mVar2.a))) * 31;
        ldc ldcVar = this.g;
        int hashCode6 = (hashCode5 + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.h;
        return hashCode6 + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0);
    }

    public final String toString() {
        return "ImageBackgroundState(imageUrl=" + this.a + ", alpha=" + this.b + ", scale=" + this.c + ", contentScale=" + this.d + ", offsetX=" + this.e + ", offsetY=" + this.f + ", color=" + this.g + ", rippleColor=" + this.h + Extension.C_BRAKE;
    }
}

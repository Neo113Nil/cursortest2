package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j0u {
    public final Float a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Float e;

    public j0u(Float f, Float f2, Float f3, Float f4, Float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0u)) {
            return false;
        }
        j0u j0uVar = (j0u) obj;
        return jl40.l(this.a, j0uVar.a) && jl40.l(this.b, j0uVar.b) && jl40.l(this.c, j0uVar.c) && jl40.l(this.d, j0uVar.d) && jl40.l(this.e, j0uVar.e);
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
        return hashCode4 + (f5 != null ? f5.hashCode() : 0);
    }

    public final String toString() {
        return "RectangleGeometry(originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", cornerRadius=" + this.e + Extension.C_BRAKE;
    }
}

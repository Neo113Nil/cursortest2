package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class hkf {
    public static final gkf Companion = new gkf();
    public final String a;
    public final float b;
    public final Float c;
    public final String d;
    public final Float e;

    public /* synthetic */ hkf(int i, String str, float f, Float f2, String str2, Float f3) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, fkf.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkf)) {
            return false;
        }
        hkf hkfVar = (hkf) obj;
        return jl40.l(this.a, hkfVar.a) && Float.compare(this.b, hkfVar.b) == 0 && jl40.l(this.c, hkfVar.c) && jl40.l(this.d, hkfVar.d) && jl40.l(this.e, hkfVar.e);
    }

    public final int hashCode() {
        int c = g8e.c(this.b, this.a.hashCode() * 31, 31);
        Float f = this.c;
        int b = unr0.b((c + (f == null ? 0 : f.hashCode())) * 31, 31, this.d);
        Float f2 = this.e;
        return b + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        return "CustomLoaderViewProps(uniqueId=" + this.a + ", lineWidth=" + this.b + ", strokeEnd=" + this.c + ", strokeColorExpression=" + this.d + ", duration=" + this.e + Extension.C_BRAKE;
    }
}

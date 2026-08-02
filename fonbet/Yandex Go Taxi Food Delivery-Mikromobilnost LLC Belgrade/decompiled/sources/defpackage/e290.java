package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class e290 {
    public static final e290 e = new e290(null, null, null, null);
    public final String a;
    public final Float b;
    public final String c;
    public final Float d;

    public e290(String str, Float f, String str2, Float f2) {
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e290)) {
            return false;
        }
        e290 e290Var = (e290) obj;
        return jl40.l(this.a, e290Var.a) && jl40.l(this.b, e290Var.b) && jl40.l(this.c, e290Var.c) && jl40.l(this.d, e290Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f2 = this.d;
        return hashCode3 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        return "OverrideRouteStyleParameters(outlineColor=" + this.a + ", outlineWidth=" + this.b + ", strokeColor=" + this.c + ", strokeWidth=" + this.d + Extension.C_BRAKE;
    }

    public e290() {
        this(null, null, null, null);
    }
}

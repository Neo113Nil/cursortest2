package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class gx81 extends zz61 {
    public final String a;
    public final fx81 b;
    public final vl71 c;

    public gx81(String str, String str2) {
        this(str, new fx81(0, 0, 14, null, str2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx81)) {
            return false;
        }
        gx81 gx81Var = (gx81) obj;
        return jl40.l(this.a, gx81Var.a) && jl40.l(this.b, gx81Var.b) && jl40.l(this.c, gx81Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        fx81 fx81Var = this.b;
        int hashCode2 = (hashCode + (fx81Var == null ? 0 : fx81Var.hashCode())) * 31;
        vl71 vl71Var = this.c;
        return hashCode2 + (vl71Var != null ? vl71Var.hashCode() : 0);
    }

    public final String toString() {
        return "KeyValue(title=" + this.a + ", subtitle=" + this.b + ", text=" + this.c + Extension.C_BRAKE;
    }

    public gx81(String str, fx81 fx81Var, vl71 vl71Var) {
        this.a = str;
        this.b = fx81Var;
        this.c = vl71Var;
    }

    public gx81(String str, fx81 fx81Var) {
        this.a = str;
        this.b = fx81Var;
        this.c = null;
    }
}

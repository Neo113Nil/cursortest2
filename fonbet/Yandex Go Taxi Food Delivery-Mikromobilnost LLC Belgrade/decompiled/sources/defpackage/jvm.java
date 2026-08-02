package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jvm {
    public final lvi0 a;
    public final String b;
    public final String c;

    public jvm(lvi0 lvi0Var, String str, String str2) {
        this.a = lvi0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvm)) {
            return false;
        }
        jvm jvmVar = (jvm) obj;
        return this.a.equals(jvmVar.a) && this.b.equals(jvmVar.b) && jl40.l(this.c, jvmVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DueDescription(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}

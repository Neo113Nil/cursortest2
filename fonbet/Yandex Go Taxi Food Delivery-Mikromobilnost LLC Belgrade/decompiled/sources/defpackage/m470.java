package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class m470 {
    public static final m470 c = new m470("", "");
    public final String a;
    public final String b;

    public m470(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m470)) {
            return false;
        }
        m470 m470Var = (m470) obj;
        return this.a.equals(m470Var.a) && this.b.equals(m470Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OpenCorpAccountInfo(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}

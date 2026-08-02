package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jbq0 implements b151 {
    public final c0k0 a;
    public final s9e b;
    public final x2s c;

    public jbq0(c0k0 c0k0Var, s9e s9eVar, x2s x2sVar) {
        this.a = c0k0Var;
        this.b = s9eVar;
        this.c = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbq0)) {
            return false;
        }
        jbq0 jbq0Var = (jbq0) obj;
        return this.a.equals(jbq0Var.a) && jl40.l(this.b, jbq0Var.b) && jl40.l(this.c, jbq0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s9e s9eVar = this.b;
        int hashCode2 = (hashCode + (s9eVar == null ? 0 : s9eVar.hashCode())) * 31;
        x2s x2sVar = this.c;
        return hashCode2 + (x2sVar != null ? x2sVar.hashCode() : 0);
    }

    public final String toString() {
        return "SelectContactWidgetAction(resultPosition=" + this.a + ", selectedContact=" + this.b + ", analyticsData=" + this.c + Extension.C_BRAKE;
    }
}

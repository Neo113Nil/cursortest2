package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pau {
    public final rry0 a;
    public final rry0 b;
    public final w4v c;

    public /* synthetic */ pau(rry0 rry0Var, w4v w4vVar, int i) {
        this(rry0Var, (rry0) null, (i & 4) != 0 ? null : w4vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pau)) {
            return false;
        }
        pau pauVar = (pau) obj;
        return jl40.l(this.a, pauVar.a) && jl40.l(this.b, pauVar.b) && jl40.l(this.c, pauVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rry0 rry0Var = this.b;
        int hashCode2 = (hashCode + (rry0Var == null ? 0 : rry0Var.hashCode())) * 31;
        w4v w4vVar = this.c;
        return hashCode2 + (w4vVar != null ? w4vVar.hashCode() : 0);
    }

    public final String toString() {
        return "HeaderLeadModel(text=" + this.a + ", subtitle=" + this.b + ", icon=" + this.c + Extension.C_BRAKE;
    }

    public pau(rry0 rry0Var, rry0 rry0Var2, w4v w4vVar) {
        this.a = rry0Var;
        this.b = rry0Var2;
        this.c = w4vVar;
    }
}

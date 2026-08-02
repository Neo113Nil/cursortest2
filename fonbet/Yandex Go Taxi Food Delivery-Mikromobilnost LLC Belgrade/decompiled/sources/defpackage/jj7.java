package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jj7 {
    public final c2t a;
    public final e3n b;
    public final Long c;

    public jj7(c2t c2tVar, e3n e3nVar, Long l) {
        this.a = c2tVar;
        this.b = e3nVar;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj7)) {
            return false;
        }
        jj7 jj7Var = (jj7) obj;
        return jl40.l(this.a, jj7Var.a) && jl40.l(this.b, jj7Var.b) && jl40.l(this.c, jj7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e3n e3nVar = this.b;
        int hashCode2 = (hashCode + (e3nVar == null ? 0 : Long.hashCode(e3nVar.a))) * 31;
        Long l = this.c;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "TriggersInternalState(loadingState=" + this.a + ", timeout=" + this.b + ", loadingStartedTimestamp=" + this.c + Extension.C_BRAKE;
    }
}

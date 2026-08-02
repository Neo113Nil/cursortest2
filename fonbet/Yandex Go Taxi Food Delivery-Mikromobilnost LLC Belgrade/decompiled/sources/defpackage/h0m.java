package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class h0m {
    public final u1m a;
    public final wbe0 b;

    public h0m(u1m u1mVar, wbe0 wbe0Var) {
        this.a = u1mVar;
        this.b = wbe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0m)) {
            return false;
        }
        h0m h0mVar = (h0m) obj;
        return jl40.l(this.a, h0mVar.a) && jl40.l(this.b, h0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentLoadKey(documentQuery=" + this.a + ", portionParams=" + this.b + Extension.C_BRAKE;
    }
}

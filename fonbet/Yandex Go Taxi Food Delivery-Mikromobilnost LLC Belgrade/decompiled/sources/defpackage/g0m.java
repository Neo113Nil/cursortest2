package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class g0m {
    public final u1m a;
    public final l0m b;

    public g0m(u1m u1mVar, l0m l0mVar) {
        this.a = u1mVar;
        this.b = l0mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0m)) {
            return false;
        }
        g0m g0mVar = (g0m) obj;
        return this.a.equals(g0mVar.a) && jl40.l(this.b, g0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentLoad(query=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}

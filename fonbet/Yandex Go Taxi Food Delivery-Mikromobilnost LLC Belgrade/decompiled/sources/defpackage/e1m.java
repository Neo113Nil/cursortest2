package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class e1m extends f1m {
    public final l1o a;
    public final u1m b;

    public e1m(l1o l1oVar, u1m u1mVar) {
        this.a = l1oVar;
        this.b = u1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e1m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e1m e1mVar = (e1m) obj;
        return jl40.l(this.a, e1mVar.a) && jl40.l(this.b, e1mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Started(context=" + this.a + ", query=" + this.b + Extension.C_BRAKE;
    }
}

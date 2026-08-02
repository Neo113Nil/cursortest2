package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jru {
    public final t1y a;
    public final n351 b;

    public jru(t1y t1yVar, n351 n351Var) {
        this.a = t1yVar;
        this.b = n351Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jru)) {
            return false;
        }
        jru jruVar = (jru) obj;
        return this.a.equals(jruVar.a) && jl40.l(this.b, jruVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HorizontalStackItem(distributionPolicy=" + this.a + ", widget=" + this.b + Extension.C_BRAKE;
    }
}

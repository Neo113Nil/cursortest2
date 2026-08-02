package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bcu {
    public final String a;
    public final dty0 b;

    public bcu(String str, dty0 dty0Var) {
        this.a = str;
        this.b = dty0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcu)) {
            return false;
        }
        bcu bcuVar = (bcu) obj;
        return this.a.equals(bcuVar.a) && this.b.equals(bcuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderSubtitle(text=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}

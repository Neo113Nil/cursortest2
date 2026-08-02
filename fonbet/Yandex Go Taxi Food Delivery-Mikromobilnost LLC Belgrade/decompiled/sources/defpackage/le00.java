package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class le00 {
    public final Object a;
    public final an11 b;

    public le00(Object obj, an11 an11Var) {
        this.a = obj;
        this.b = an11Var;
    }

    public final boolean equals(Object obj) {
        le00 le00Var = obj instanceof le00 ? (le00) obj : null;
        if (le00Var == null) {
            return false;
        }
        Object obj2 = le00Var.a;
        return this.a.equals(obj2) && this.b.equals(obj2);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MangoSeed(" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}

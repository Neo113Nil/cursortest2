package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c14 {
    public final b14 a;
    public final b14 b;

    public c14(b14 b14Var, b14 b14Var2) {
        this.a = b14Var;
        this.b = b14Var2;
    }

    public final b14 a() {
        return this.a;
    }

    public final b14 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c14)) {
            return false;
        }
        c14 c14Var = (c14) obj;
        return this.a.equals(c14Var.a) && this.b.equals(c14Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Toolbar(blockCenter=" + this.a + ", blockRight=" + this.b + Extension.C_BRAKE;
    }
}

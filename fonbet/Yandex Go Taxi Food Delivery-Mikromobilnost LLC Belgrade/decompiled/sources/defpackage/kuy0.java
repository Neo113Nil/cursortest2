package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kuy0 implements luy0 {
    public final String a;
    public final dty0 b;

    public kuy0(String str, dty0 dty0Var) {
        this.a = str;
        this.b = dty0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuy0)) {
            return false;
        }
        kuy0 kuy0Var = (kuy0) obj;
        return this.a.equals(kuy0Var.a) && this.b.equals(kuy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Styled(content=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}

package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kek0 implements mek0 {
    public final String a;
    public final nsz b;

    public kek0(String str, nsz nszVar) {
        this.a = str;
        this.b = nszVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kek0)) {
            return false;
        }
        kek0 kek0Var = (kek0) obj;
        return jl40.l(this.a, kek0Var.a) && this.b.equals(kek0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(id=" + this.a + ", composition=" + this.b + Extension.C_BRAKE;
    }
}

package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = do11.class)
/* loaded from: classes9.dex */
public final class fo11 {
    public static final eo11 Companion = new eo11();
    public final String a;
    public final go11 b;

    public fo11(String str, go11 go11Var) {
        this.a = str;
        this.b = go11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo11)) {
            return false;
        }
        fo11 fo11Var = (fo11) obj;
        return this.a.equals(fo11Var.a) && jl40.l(this.b, fo11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TypedScreenContainer(type=" + this.a + ", screen=" + this.b + Extension.C_BRAKE;
    }
}

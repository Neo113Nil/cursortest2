package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class je6 implements ke6 {
    public final String a;
    public final String b;

    public je6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je6)) {
            return false;
        }
        je6 je6Var = (je6) obj;
        return jl40.l(this.a, je6Var.a) && jl40.l(this.b, je6Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("ShareText(title=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}

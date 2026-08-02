package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b6k0 {
    public final String a;
    public final Integer b;

    public b6k0(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6k0)) {
            return false;
        }
        b6k0 b6k0Var = (b6k0) obj;
        return jl40.l(this.a, b6k0Var.a) && this.b.equals(b6k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subtitle(text=" + this.a + ", leadingIconRes=" + this.b + Extension.C_BRAKE;
    }
}

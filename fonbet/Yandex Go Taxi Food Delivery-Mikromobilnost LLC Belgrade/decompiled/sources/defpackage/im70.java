package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class im70 {
    public final String a;
    public final Integer b;

    public im70(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im70)) {
            return false;
        }
        im70 im70Var = (im70) obj;
        return jl40.l(this.a, im70Var.a) && jl40.l(this.b, im70Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Icon(url=" + this.a + ", drawableId=" + this.b + Extension.C_BRAKE;
    }
}

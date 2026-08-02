package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lm70 implements km70 {
    public final String a;
    public final Integer b;

    public lm70(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm70)) {
            return false;
        }
        lm70 lm70Var = (lm70) obj;
        return jl40.l(this.a, lm70Var.a) && jl40.l(this.b, lm70Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OrderCardHeaderImageUrl(url=" + this.a + ", cornerRadius=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ lm70(String str) {
        this(str, null);
    }
}

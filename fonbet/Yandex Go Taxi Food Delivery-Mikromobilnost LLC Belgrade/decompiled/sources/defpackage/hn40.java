package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hn40 {
    public final CharSequence a;
    public final fn40 b;
    public final gn40 c;
    public final String d;

    public hn40(CharSequence charSequence, fn40 fn40Var, gn40 gn40Var, String str) {
        this.a = charSequence;
        this.b = fn40Var;
        this.c = gn40Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn40)) {
            return false;
        }
        hn40 hn40Var = (hn40) obj;
        return jl40.l(this.a, hn40Var.a) && jl40.l(this.b, hn40Var.b) && jl40.l(this.c, hn40Var.c) && jl40.l(this.d, hn40Var.d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        fn40 fn40Var = this.b;
        int hashCode2 = (hashCode + (fn40Var == null ? 0 : fn40Var.a.hashCode())) * 31;
        gn40 gn40Var = this.c;
        int hashCode3 = (hashCode2 + (gn40Var == null ? 0 : gn40Var.a.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PriceInfoState(price=" + ((Object) this.a) + ", cashbackInfo=" + this.b + ", originalPrice=" + this.c + ", contentDescription=" + this.d + Extension.C_BRAKE;
    }
}

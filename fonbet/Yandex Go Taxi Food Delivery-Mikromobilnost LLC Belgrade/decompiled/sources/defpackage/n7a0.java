package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n7a0 implements uni {
    public final String a;
    public final String b;
    public final String c;
    public final String w;
    public final ArrayList x;

    public n7a0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.w = str4;
        this.x = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7a0)) {
            return false;
        }
        n7a0 n7a0Var = (n7a0) obj;
        return this.a.equals(n7a0Var.a) && jl40.l(this.b, n7a0Var.b) && jl40.l(this.c, n7a0Var.c) && this.w.equals(n7a0Var.w) && this.x.equals(n7a0Var.x);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.x.hashCode() + unr0.b((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.w);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentMethodSelectorArgs(screenTitle=", this.a, ", screenSubtitle=", this.b, ", screenHeaderIconTag=");
        g8e.D(v, this.c, ", buttonText=", this.w, ", listItems=");
        return b64.n(Extension.C_BRAKE, v, this.x);
    }
}

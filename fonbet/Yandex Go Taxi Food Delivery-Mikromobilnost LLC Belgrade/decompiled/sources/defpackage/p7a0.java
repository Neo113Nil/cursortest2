package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p7a0 {
    public final String a;
    public final String b;
    public final v4v c;
    public final String d;
    public final ArrayList e;

    public p7a0(String str, String str2, lvi0 lvi0Var, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = lvi0Var;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7a0)) {
            return false;
        }
        p7a0 p7a0Var = (p7a0) obj;
        return this.a.equals(p7a0Var.a) && jl40.l(this.b, p7a0Var.b) && jl40.l(this.c, p7a0Var.c) && this.d.equals(p7a0Var.d) && this.e.equals(p7a0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        v4v v4vVar = this.c;
        return this.e.hashCode() + unr0.b((hashCode2 + (v4vVar != null ? v4vVar.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentMethodSelectorUiState(screenTitle=", this.a, ", screenSubtitle=", this.b, ", screenHeaderImage=");
        v.append(this.c);
        v.append(", buttonText=");
        v.append(this.d);
        v.append(", listItems=");
        return b64.n(Extension.C_BRAKE, v, this.e);
    }
}

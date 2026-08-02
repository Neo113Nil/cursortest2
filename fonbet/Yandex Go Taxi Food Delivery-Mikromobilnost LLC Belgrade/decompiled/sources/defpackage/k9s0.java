package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes8.dex */
public final class k9s0 {
    public static final k9s0 f = new fcj0(bov0.e).a();
    public final String a;
    public final String b;
    public final String c;
    public final SelectionOrigin d;
    public final bov0 e;

    public k9s0(fcj0 fcj0Var) {
        String j = fcj0Var.j();
        String h = fcj0Var.h();
        String i = fcj0Var.i();
        SelectionOrigin f2 = fcj0Var.f();
        bov0 e = fcj0Var.e();
        this.a = j;
        this.b = h;
        this.c = i;
        this.d = f2;
        this.e = e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9s0)) {
            return false;
        }
        k9s0 k9s0Var = (k9s0) obj;
        return jl40.l(this.a, k9s0Var.a) && jl40.l(this.b, k9s0Var.b) && jl40.l(this.c, k9s0Var.c) && this.d == k9s0Var.d && jl40.l(this.e, k9s0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SelectionOrigin selectionOrigin = this.d;
        return this.e.hashCode() + ((hashCode3 + (selectionOrigin != null ? selectionOrigin.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ShowSummaryParams(verticalId=", this.a, ", tariffClass=", this.b, ", trapVerticalId=");
        v.append(this.c);
        v.append(", selectionOrigin=");
        v.append(this.d);
        v.append(", params=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

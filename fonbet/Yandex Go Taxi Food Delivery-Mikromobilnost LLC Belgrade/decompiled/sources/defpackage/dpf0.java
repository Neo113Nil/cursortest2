package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dpf0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final Map f;

    public dpf0(String str, String str2, String str3, int i, List list, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = list;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpf0)) {
            return false;
        }
        dpf0 dpf0Var = (dpf0) obj;
        return jl40.l(this.a, dpf0Var.a) && jl40.l(this.b, dpf0Var.b) && jl40.l(this.c, dpf0Var.c) && this.d == dpf0Var.d && this.e.equals(dpf0Var.e) && jl40.l(this.f, dpf0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int c = unr0.c(oyr.b(this.d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.e);
        Map map = this.f;
        return c + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PromoPlaqueActionInfo(promoId=", this.a, ", orderId=", this.b, ", status=");
        b64.A(this.d, this.c, ", promoIndex=", ", actionTypes=", v);
        v.append(this.e);
        v.append(", analyticsPayload=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

package defpackage;

import com.yandex.go.taxi.order.models.api.response.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ad11 {
    public static final ad11 g = new ad11(0);
    public final String a;
    public final String b;
    public final String c;
    public final zc11 d;
    public final d e;
    public final Long f;

    public ad11(String str, String str2, String str3, zc11 zc11Var, d dVar, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zc11Var;
        this.e = dVar;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad11)) {
            return false;
        }
        ad11 ad11Var = (ad11) obj;
        return jl40.l(this.a, ad11Var.a) && jl40.l(this.b, ad11Var.b) && jl40.l(this.c, ad11Var.c) && jl40.l(this.d, ad11Var.d) && jl40.l(this.e, ad11Var.e) && jl40.l(this.f, ad11Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        d dVar = this.e;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Long l = this.f;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TravelCompanionStatusModel(title=", this.a, ", subtitle=", this.b, ", imageUrl=");
        v.append(this.c);
        v.append(", animation=");
        v.append(this.d);
        v.append(", action=");
        v.append(this.e);
        v.append(", timerEnd=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ad11(int i) {
        this("", "", "", zc11.d, null, null);
    }

    public ad11() {
        this(0);
    }
}

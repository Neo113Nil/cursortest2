package defpackage;

import com.ybsdk.feature.card.internal.entities.CardProductTypeEntity;
import com.ybsdk.feature.card.internal.network.dto.YbCardTypeResponse;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hgs0 {
    public final pgs0 a;
    public final qgs0 b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final CardProductTypeEntity g;
    public final YbCardTypeResponse h;
    public final rr51 i;
    public final rr51 j;
    public final String k;
    public final List l;
    public final boolean m;
    public final jgs0 n;

    public hgs0(pgs0 pgs0Var, qgs0 qgs0Var, String str, String str2, List list, List list2, CardProductTypeEntity cardProductTypeEntity, YbCardTypeResponse ybCardTypeResponse, rr51 rr51Var, rr51 rr51Var2, String str3, List list3, boolean z, jgs0 jgs0Var) {
        this.a = pgs0Var;
        this.b = qgs0Var;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = list2;
        this.g = cardProductTypeEntity;
        this.h = ybCardTypeResponse;
        this.i = rr51Var;
        this.j = rr51Var2;
        this.k = str3;
        this.l = list3;
        this.m = z;
        this.n = jgs0Var;
    }

    public final rr51 a() {
        return this.j;
    }

    public final String b() {
        return this.k;
    }

    public final pgs0 c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final rr51 e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgs0)) {
            return false;
        }
        hgs0 hgs0Var = (hgs0) obj;
        return jl40.l(this.a, hgs0Var.a) && jl40.l(this.b, hgs0Var.b) && jl40.l(this.c, hgs0Var.c) && jl40.l(this.d, hgs0Var.d) && jl40.l(this.e, hgs0Var.e) && jl40.l(this.f, hgs0Var.f) && this.g == hgs0Var.g && this.h == hgs0Var.h && jl40.l(this.i, hgs0Var.i) && jl40.l(this.j, hgs0Var.j) && jl40.l(this.k, hgs0Var.k) && jl40.l(this.l, hgs0Var.l) && this.m == hgs0Var.m && jl40.l(this.n, hgs0Var.n);
    }

    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + unr0.c(unr0.c(unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31;
        rr51 rr51Var = this.i;
        int hashCode2 = (hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        rr51 rr51Var2 = this.j;
        int hashCode3 = (hashCode2 + (rr51Var2 == null ? 0 : rr51Var2.hashCode())) * 31;
        String str = this.k;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.l;
        int e = unr0.e((hashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.m);
        jgs0 jgs0Var = this.n;
        return e + (jgs0Var != null ? jgs0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleCardDetailsEntity(header=");
        sb.append(this.a);
        sb.append(", details=");
        sb.append(this.b);
        sb.append(", settingsTitle=");
        g8e.D(sb, this.c, ", managementTitle=", this.d, ", settings=");
        nnm.w(sb, this.e, ", managementSettings=", this.f, ", productType=");
        sb.append(this.g);
        sb.append(", cardType=");
        sb.append(this.h);
        sb.append(", notificationDivData=");
        sb.append(this.i);
        sb.append(", bottomNotification=");
        sb.append(this.j);
        sb.append(", cardAdditionalTitle=");
        tse0.x(this.k, ", cardAdditionalSetting=", ", showRequisites=", sb, this.l);
        sb.append(this.m);
        sb.append(", snackbars=");
        sb.append(this.n);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}

package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.common.entities.SessionEntity$ActionReason;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class hzq0 {
    public final String a;
    public final String b;
    public final SessionEntity$Action c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final Integer i;
    public final SessionEntity$ActionReason j;
    public final YBProduct k;

    public hzq0(String str, String str2, SessionEntity$Action sessionEntity$Action, String str3, String str4, String str5, List list, String str6, Integer num, SessionEntity$ActionReason sessionEntity$ActionReason, YBProduct yBProduct) {
        this.a = str;
        this.b = str2;
        this.c = sessionEntity$Action;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
        this.h = str6;
        this.i = num;
        this.j = sessionEntity$ActionReason;
        this.k = yBProduct;
    }

    public final SessionEntity$Action a() {
        return this.c;
    }

    public final SessionEntity$ActionReason b() {
        return this.j;
    }

    public final List c() {
        return this.g;
    }

    public final String d() {
        return this.h;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzq0)) {
            return false;
        }
        hzq0 hzq0Var = (hzq0) obj;
        return jl40.l(this.a, hzq0Var.a) && jl40.l(this.b, hzq0Var.b) && this.c == hzq0Var.c && jl40.l(this.d, hzq0Var.d) && this.e.equals(hzq0Var.e) && jl40.l(this.f, hzq0Var.f) && this.g.equals(hzq0Var.g) && jl40.l(this.h, hzq0Var.h) && jl40.l(this.i, hzq0Var.i) && this.j == hzq0Var.j && this.k == hzq0Var.k;
    }

    public final Integer f() {
        return this.i;
    }

    public final YBProduct g() {
        return this.k;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        int b = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int c = unr0.c((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        String str4 = this.h;
        int hashCode3 = (c + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.i;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        SessionEntity$ActionReason sessionEntity$ActionReason = this.j;
        int hashCode5 = (hashCode4 + (sessionEntity$ActionReason == null ? 0 : sessionEntity$ActionReason.hashCode())) * 31;
        YBProduct yBProduct = this.k;
        return hashCode5 + (yBProduct != null ? yBProduct.hashCode() : 0);
    }

    public final String i() {
        return this.f;
    }

    public final String j() {
        return this.e;
    }

    public final String k() {
        return this.b;
    }

    public final String toString() {
        StringBuilder v = b64.v("SessionEntity(sessionUUID=", this.a, ", yandexUid=", this.b, ", action=");
        v.append(this.c);
        v.append(", deeplink=");
        v.append(this.d);
        v.append(", supportUrl=");
        g8e.D(v, this.e, ", startLandingUrl=", this.f, ", applications=");
        oyr.D(", authorizationTrackId=", this.h, ", pinAttemptsLeft=", v, this.g);
        v.append(this.i);
        v.append(", actionReason=");
        v.append(this.j);
        v.append(", productToOpen=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

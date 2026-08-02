package defpackage;

import com.yandex.go.payments.payment.TransportCardPayment$CardStatusDomain;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class d111 extends lea0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final a111 g;
    public final ArrayList h;
    public final fef i;
    public final String j;
    public final String k;
    public final TransportCardPayment$CardStatusDomain l;
    public final b111 m;

    public d111(String str, String str2, String str3, String str4, String str5, String str6, a111 a111Var, ArrayList arrayList, fef fefVar, String str7, String str8, TransportCardPayment$CardStatusDomain transportCardPayment$CardStatusDomain, b111 b111Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = a111Var;
        this.h = arrayList;
        this.i = fefVar;
        this.j = str7;
        this.k = str8;
        this.l = transportCardPayment$CardStatusDomain;
        this.m = b111Var;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.TRANSPORT_CARD;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof d111) {
                d111 d111Var = (d111) obj;
                if (jl40.l(this.a, d111Var.a)) {
                    String str = d111Var.b;
                    String str2 = this.b;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && jl40.l(this.c, d111Var.c) && jl40.l(this.d, d111Var.d) && jl40.l(this.e, d111Var.e) && jl40.l(this.f, d111Var.f) && jl40.l(this.g, d111Var.g) && this.h.equals(d111Var.h) && this.i.equals(d111Var.i) && jl40.l(this.j, d111Var.j) && jl40.l(this.k, d111Var.k) && this.l == d111Var.l && jl40.l(this.m, d111Var.m)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List f() {
        return this.h;
    }

    public final a111 g() {
        return this.g;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final String h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b(unr0.b(unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        a111 a111Var = this.g;
        int hashCode2 = (this.l.hashCode() + unr0.b(unr0.b((this.i.hashCode() + ly3.b((b + (a111Var == null ? 0 : a111Var.hashCode())) * 31, 31, this.h)) * 31, 31, this.j), 31, this.k)) * 31;
        b111 b111Var = this.m;
        return hashCode2 + (b111Var != null ? b111Var.hashCode() : 0);
    }

    public final TransportCardPayment$CardStatusDomain i() {
        return this.l;
    }

    public final fef j() {
        return this.i;
    }

    public final String k() {
        return this.f;
    }

    public final String l() {
        return this.e;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("TransportCardPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", name=");
        g8e.D(v, this.c, ", shortName=", this.d, ", title=");
        g8e.D(v, this.e, ", subtitle=", this.f, ", balance=");
        v.append(this.g);
        v.append(", actions=");
        v.append(this.h);
        v.append(", currencyRules=");
        v.append(this.i);
        v.append(", statusColor=");
        v.append(this.j);
        v.append(", cardIcon=");
        v.append(this.k);
        v.append(", cardStatus=");
        v.append(this.l);
        v.append(", statusDescription=");
        v.append(this.m);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

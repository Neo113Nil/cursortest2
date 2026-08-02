package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes14.dex */
public final class g980 implements e980 {
    public final zuj0 a;
    public final xdf b;
    public final pdc c;
    public final crg d;
    public final jom0 e;

    public g980(zuj0 zuj0Var, xdf xdfVar, pdc pdcVar, crg crgVar, jom0 jom0Var) {
        this.a = zuj0Var;
        this.b = xdfVar;
        this.c = pdcVar;
        this.d = crgVar;
        this.e = jom0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5, types: [jom0] */
    public final b980 a(b980 b980Var, TaxiOrder taxiOrder, boolean z, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i = f980.a[taxiOrder.h.b.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return b980Var;
        }
        ?? r2 = this.e;
        zuj0 zuj0Var = r2.b;
        OrderStatusInfo.MultiOrderInfo multiOrderInfo = taxiOrder.V().h0;
        Calendar n = taxiOrder.n();
        TimeZone N = taxiOrder.N();
        String f = taxiOrder.f();
        String str7 = b980Var.a;
        if (f != null && !evu0.J(f) && n != null) {
            str7 = r2.a(n, N, str7, true);
        }
        if (str7 == null || evu0.J(str7)) {
            str7 = ((avj0) zuj0Var).h(kyh0.taxischeduled_title);
        }
        String str8 = str7;
        ?? r1 = b980Var.c;
        q48 q48Var = b980Var.e;
        if (multiOrderInfo != null) {
            r1 = multiOrderInfo.b;
            if (evu0.J(r1)) {
                if (n == null) {
                    str4 = "";
                    return new b980(str8, b980Var.b, (CharSequence) str4, b980Var.d, b980Var.e, b980Var.f, false, (String) null, 384);
                }
                r1 = r2.a.a(n, N);
                if (r1.length() > 0) {
                    r1 = ((Object) String.valueOf(r1.charAt(0)).toUpperCase(Locale.ROOT)) + r1.substring(1);
                }
            }
            str4 = r1;
            return new b980(str8, b980Var.b, (CharSequence) str4, b980Var.d, b980Var.e, b980Var.f, false, (String) null, 384);
        }
        if (!evu0.J(r1) && n != null) {
            r1 = r2.a(n, N, r1, false);
        } else if ((q48Var == null || (str5 = q48Var.a) == null || evu0.J(str5) || (str6 = q48Var.d) == null || evu0.J(str6)) && n != null) {
            r1 = r2.a(n, N, str, false);
        } else if (z && q48Var != null && (str2 = q48Var.a) != null && !evu0.J(str2) && (str3 = q48Var.d) != null && !evu0.J(str3) && q48Var != null) {
            String str9 = q48Var.b;
            String str10 = q48Var.a;
            StringBuilder sb = new StringBuilder();
            if (((avj0) zuj0Var).a.getResources().getConfiguration().getLayoutDirection() == 1) {
                sb.append(str10);
                sb.append(" ");
                sb.append(str9 != null ? str9 : "");
            } else {
                x4e.C(sb, str9 != null ? str9 : "", " ", str10);
            }
            String obj = evu0.k0(sb.toString()).toString();
            if (obj != null) {
                str4 = obj;
                return new b980(str8, b980Var.b, (CharSequence) str4, b980Var.d, b980Var.e, b980Var.f, false, (String) null, 384);
            }
        }
        str4 = r1;
        return new b980(str8, b980Var.b, (CharSequence) str4, b980Var.d, b980Var.e, b980Var.f, false, (String) null, 384);
    }

    public final kdc b(String str) {
        return ((ufu) this.c).h(new bdc(xng0.textMain), str);
    }

    public final String c(TaxiOrder taxiOrder, long j, String str, String str2) {
        String f = taxiOrder.f();
        String str3 = taxiOrder.V().g.d;
        Date c = this.d.c(taxiOrder.V().Z.e);
        an91.i(taxiOrder.h.b);
        if (f != null && !evu0.J(f)) {
            str2 = t7s.h(this.a, f, str3, j, c);
        }
        ief iefVar = taxiOrder.V().K;
        return this.b.a(iefVar != null ? gwk0.h(iefVar) : null, str2, false, false);
    }
}

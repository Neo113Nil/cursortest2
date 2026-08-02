package defpackage;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutErrorReason;
import com.yandex.go.masstransit.sdk.client_api.ClientApiException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class enb {
    public final AtomicInteger a = new AtomicInteger(0);

    public static plb a(String str, String str2, String str3, Throwable th) {
        if (th instanceof ClientApiException) {
            int i = dnb.a[((ClientApiException) th).getCode().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                if (str != null) {
                    return new nlb(str, new akb(CheckoutErrorReason.OrderPaymentFailure, str2, str, str3, "payment_declined_processing:".concat(str)));
                }
            } else if (str != null) {
                return new mlb(str, new akb(CheckoutErrorReason.Other, str2, str, null, "mosmetro_auth_processing:".concat(str)));
            }
        }
        return null;
    }

    public static olb b(String str, String str2, String str3) {
        return new olb(str2, str, str3, new glb(str, str2, str3, b64.l("payment_succeed:", str, ":", str2)));
    }

    public static smb c(String str, String str2, Throwable th) {
        if (!(th instanceof ClientApiException)) {
            return null;
        }
        if (dnb.a[((ClientApiException) th).getCode().ordinal()] != 1 || str == null) {
            return null;
        }
        return new smb(str, str2, new akb(CheckoutErrorReason.Other, str2, str, null, b64.l("mosmetro_auth:", str, ":", str2)));
    }

    public static tmb d(String str, String str2, String str3) {
        CheckoutErrorReason checkoutErrorReason = CheckoutErrorReason.OrderPaymentFailure;
        StringBuilder v = b64.v("payment_declined:", str, ":", str2, ":");
        v.append(str3);
        return new tmb(str, str2, str3, new akb(checkoutErrorReason, str3, str, str2, v.toString()));
    }

    public static vmb e(r1a0 r1a0Var) {
        CheckoutErrorReason checkoutErrorReason = CheckoutErrorReason.PaymentMethodsFailure;
        String str = r1a0Var.a;
        return new vmb(r1a0Var, new akb(checkoutErrorReason, null, str, null, b64.l("payment_widget_reload:", str, ":", r1a0Var.b)));
    }

    public static wmb f(enb enbVar, afp0 afp0Var, boolean z, String str, bkb bkbVar, int i) {
        amb ambVar;
        bjb bjbVar;
        boolean z2 = (i & 2) != 0 ? false : z;
        bkb bkbVar2 = (i & 8) != 0 ? null : bkbVar;
        enbVar.getClass();
        String str2 = afp0Var.a;
        bba0 bba0Var = afp0Var.j;
        int incrementAndGet = enbVar.a.incrementAndGet();
        Integer num = afp0Var.b;
        ArrayList arrayList = afp0Var.c;
        cg60 cg60Var = afp0Var.d;
        y3l0 y3l0Var = afp0Var.f;
        if (y3l0Var != null) {
            String str3 = y3l0Var.a;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = y3l0Var.b;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = y3l0Var.c;
            ambVar = new amb(str3, str4, str5 != null ? str5 : "");
        } else {
            ambVar = null;
        }
        rze0 rze0Var = afp0Var.i;
        hlb hlbVar = rze0Var != null ? new hlb(rze0Var.a, rze0Var.b, rze0Var.c) : null;
        FormattedText formattedText = afp0Var.h;
        wz6 wz6Var = afp0Var.g;
        return new wmb(new pmb(str2, incrementAndGet, num, arrayList, cg60Var, ambVar, hlbVar, formattedText, (wz6Var == null || (bjbVar = wz6Var.a) == null) ? null : bjbVar.a, afp0Var.e, bba0Var, str), new llc(afp0Var.b != null ? Long.valueOf(r10.intValue()) : null, str2, afp0Var.e != null), new r1a0(str2, bba0Var.a), z2, bkbVar2);
    }

    public static cnb g(lkb lkbVar, Throwable th, String str) {
        smb c = c(null, str, th);
        return c == null ? new zmb(lkbVar, str, new akb(CheckoutErrorReason.TripInitFailure, str, null, null, oyr.k(lkbVar.a.hashCode(), "trip_init:", ":", str))) : c;
    }

    public static bnb i(mkb mkbVar, String str) {
        return new bnb(mkbVar, str, new akb(CheckoutErrorReason.VehicleSearchFailure, str, null, null, b64.l("vehicle_search:", mkbVar.a, ":", str)));
    }

    public final cnb h(String str, jo2 jo2Var) {
        Object obj = jo2Var.a;
        Throwable a = Result.a(obj);
        String str2 = jo2Var.b;
        if (a == null) {
            mf11 mf11Var = (mf11) obj;
            return f(this, mf11Var.a, mf11Var.b, str2, null, 8);
        }
        smb c = c(str, str2, a);
        return c == null ? new anb(str, str2, new akb(CheckoutErrorReason.TripUpdateFailure, str2, str, null, b64.l("trip_update:", str, ":", str2))) : c;
    }
}

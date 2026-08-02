package defpackage;

import android.content.Context;
import com.google.android.gms.internal.fido.zzcf;
import com.yandex.payment.sdk.core.data.PayMethodMarkup;
import com.yandex.payment.sdk.core.data.PaymentSettings;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public abstract class mta1 {
    public static au2 a;

    public static final void a(q62 q62Var, f530 f530Var, tls tlsVar, tls tlsVar2, qor qorVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1262836673);
        int i2 = (btsVar.k(q62Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(qorVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            ggj ggjVar = q62Var.a;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new f22(6);
                btsVar.o0(Q);
            }
            qfj.c(ggjVar, f530Var, yn91.g(tlsVar, (tls) Q, btsVar, ((i2 >> 6) & 14) | 48), qorVar, wwg.S(-713175506, true, new qk30(5, q62Var, tlsVar, tlsVar2), btsVar), btsVar, (i2 & 112) | HProv.ALG_CLASS_DATA_ENCRYPT | ((i2 >> 3) & 7168));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(i, 5, tlsVar, f530Var, q62Var, tlsVar2, qorVar);
        }
    }

    public static final String b(double d) {
        return ((int) (100.0d * d)) % 100 == 0 ? String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)) : String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }

    public static final String c(Context context, double d, String str, rwo rwoVar) {
        return context.getString(tyh0.paymentsdk_prebuilt_pay_sum_format, b(d), e(str, rwoVar));
    }

    public static final String d(Context context, PaymentSettings paymentSettings, rwo rwoVar) {
        String total;
        PayMethodMarkup payMethodMarkup = paymentSettings.getPayMethodMarkup();
        if (payMethodMarkup == null || (total = payMethodMarkup.getCard()) == null) {
            total = paymentSettings.getTotal();
        }
        String currency = paymentSettings.getCurrency();
        Double i = avu0.i(total);
        return i != null ? c(context, i.doubleValue(), currency, rwoVar) : context.getString(tyh0.paymentsdk_prebuilt_pay_sum_format, total, e(currency, rwoVar));
    }

    public static final String e(String str, rwo rwoVar) {
        Currency currency;
        String symbol;
        if (str.equals("RUB")) {
            return "₽";
        }
        try {
            currency = Currency.getInstance(str);
        } catch (IllegalArgumentException unused) {
            if (rwoVar != null) {
                ((y22) rwoVar).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка при парсинге валюты", "currency_parse_error"));
            }
            currency = null;
        }
        return (currency == null || (symbol = currency.getSymbol()) == null) ? str : symbol;
    }

    public static final au2 f() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Route", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.k(23.0f, 8.98f);
        uq90Var.i(-0.77f, 6.7f);
        uq90Var.i(-2.09f, -1.8f);
        uq90Var.i(-3.56f, 4.32f);
        uq90Var.e(-1.63f, 1.98f, -4.37f, 2.39f, -6.1f, 0.91f);
        uq90Var.e(-1.73f, -1.47f, -1.81f, -4.29f, -0.18f, -6.27f);
        uq90Var.i(2.38f, -2.87f);
        uq90Var.e(0.98f, -1.2f, 1.0f, -2.83f, 0.03f, -3.65f);
        uq90Var.e(-0.96f, -0.82f, -2.54f, -0.52f, -3.52f, 0.67f);
        uq90Var.h(6.1f, 10.72f);
        uq90Var.e(0.57f, 0.99f, 0.5f, 2.27f, -0.27f, 3.21f);
        uq90Var.b(2.7f, 2.7f, false, true, -3.87f, 0.37f);
        uq90Var.b(2.83f, 2.83f, false, true, -0.32f, -3.94f);
        uq90Var.b(2.7f, 2.7f, false, true, 3.07f, -0.83f);
        uq90Var.h(7.79f, 5.8f);
        uq90Var.e(1.64f, -1.98f, 4.38f, -2.39f, 6.1f, -0.91f);
        uq90Var.e(1.74f, 1.47f, 1.82f, 4.29f, 0.18f, 6.27f);
        uq90Var.i(-2.37f, 2.87f);
        uq90Var.e(-0.98f, 1.2f, -1.0f, 2.83f, -0.04f, 3.65f);
        uq90Var.e(0.97f, 0.82f, 2.55f, 0.52f, 3.53f, -0.67f);
        uq90Var.i(3.55f, -4.31f);
        uq90Var.i(-2.09f, -1.79f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static int g(zzcf zzcfVar) {
        Iterator it = zzcfVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}

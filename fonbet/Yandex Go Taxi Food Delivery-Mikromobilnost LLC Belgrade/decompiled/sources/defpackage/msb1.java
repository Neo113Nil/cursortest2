package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.yandex.mobile.ads.common.analytics.AdAnalyticsProvider;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import ru.yandex.taxi.common_models.net.map_object.BubbleStructure;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.parks.api.ParksApi;

/* loaded from: classes13.dex */
public final class msb1 implements q81, AdAnalyticsProvider, po8, ihg0, gwi, ywm, jk7, x8u, ese, l530, sm60, g0a0, c5c0, oae0, m8j0, ltn0, e8p0, q8r0, k1t0, hew0, x2y0 {
    public static msb1 b;
    public static volatile pwf y;
    public static volatile String z;
    public final /* synthetic */ int a;
    public static final msb1 c = new msb1(1);
    public static final msb1 w = new msb1(2);
    public static final msb1 x = new msb1(3);
    public static final msb1 A = new msb1(4);
    public static final msb1 B = new msb1(5);
    public static final msb1 C = new msb1(6);
    public static final msb1 D = new msb1(7);
    public static final msb1 E = new msb1(8);
    public static final msb1 F = new msb1(9);
    public static final msb1 G = new msb1(10);
    public static final msb1 H = new msb1(11);
    public static final msb1 I = new msb1(12);
    public static final /* synthetic */ msb1 J = new msb1(13);
    public static final qir K = new qir(19);
    public static final msb1 L = new msb1(16);
    public static final msb1 M = new msb1(17);
    public static final msb1 N = new msb1(19);
    public static final msb1 O = new msb1(21);
    public static final msb1 P = new msb1(22);
    public static final msb1 Q = new msb1(23);
    public static final msb1 R = new msb1(24);
    public static final msb1 S = new msb1(25);
    public static final msb1 T = new msb1(26);
    public static final msb1 U = new msb1(27);
    public static final msb1 V = new msb1(28);
    public static final msb1 W = new msb1(29);

    public /* synthetic */ msb1(int i) {
        this.a = i;
    }

    public static Drawable d(Context context, BubbleStructure bubbleStructure, Integer num, Integer num2) {
        if (zpb0.a[bubbleStructure.ordinal()] == 1 && num2 != null) {
            float u = num != null ? tje.u(num.intValue(), context) : Math.max(num2.intValue(), tje.u(24, context)) / 2.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(u);
            return gradientDrawable.mutate();
        }
        return tje.y(dzg0.bubble_default_frame, context).mutate();
    }

    public static ParksApi h(on2 on2Var) {
        on2Var.getClass();
        return (ParksApi) on2Var.a(GoApiName.TaxiV3, ParksApi.class);
    }

    public static x500 j(u500 u500Var) {
        return new x500(u500Var);
    }

    public static synchronized void l() {
        synchronized (msb1.class) {
            if (b == null) {
                b = new msb1(0);
            }
        }
    }

    @Override // defpackage.gwi
    public float b(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.k1t0
    public int c(int i, int i2, int i3, int i4) {
        return 0;
    }

    @Override // defpackage.jk7
    public void e(yf7 yf7Var) {
    }

    public pwf f(tw4 tw4Var, Context context, ConsoleLoggingMode consoleLoggingMode, Merchant merchant, Payer payer, PaymentSdkEnvironment paymentSdkEnvironment, AdditionalSettings additionalSettings, String str) {
        pwf pwfVar;
        synchronized (this) {
            try {
                pwfVar = y;
                if (pwfVar != null) {
                    if (!jl40.l(z, str)) {
                        pwfVar = null;
                    }
                    if (pwfVar == null) {
                    }
                }
                z = str;
                new y45();
                pwf pwfVar2 = new pwf(new w3i(tw4Var, context.getApplicationContext(), consoleLoggingMode, merchant, payer, paymentSdkEnvironment, additionalSettings, str));
                y = pwfVar2;
                pwfVar = pwfVar2;
            } finally {
            }
        }
        return pwfVar;
    }

    @Override // defpackage.jk7
    public void g(yf7 yf7Var, kvj0 kvj0Var, long j) {
    }

    @Override // defpackage.m8j0
    public String i() {
        return "RouteStats mode changed";
    }

    @Override // defpackage.e8p0
    public String k() {
        return "velobike";
    }

    @Override // defpackage.sm60
    public String q() {
        return "expected an Int value";
    }

    public String toString() {
        switch (this.a) {
            case 27:
                return "Start";
            default:
                return super.toString();
        }
    }
}

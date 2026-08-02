package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.OrderInfo;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class oy90 implements pim0 {
    public final Context a;
    public final PaymentToken b;
    public final OrderInfo c;
    public final vv90 d;
    public final px90 e;
    public final bga0 f;
    public final rwo g;
    public final fx5 h;
    public final Payer i;
    public uv90 j;
    public aia0 k;
    public boolean l;
    public final boolean m;

    public oy90(Context context, PaymentToken paymentToken, OrderInfo orderInfo, vv90 vv90Var, px90 px90Var, bga0 bga0Var, rwo rwoVar, fx5 fx5Var, Payer payer) {
        this.a = context;
        this.b = paymentToken;
        this.c = orderInfo;
        this.d = vv90Var;
        this.e = px90Var;
        this.f = bga0Var;
        this.g = rwoVar;
        this.h = fx5Var;
        this.i = payer;
        this.m = cvu0.x(paymentToken.getToken(), "payment:", false);
    }

    public final void a(String str, ryj0 ryj0Var) {
        String token = this.b.getToken();
        px90 px90Var = this.e;
        bga0 bga0Var = this.f;
        Pair pair = new Pair(px90Var, bga0Var);
        if (r991.b == null) {
            r991.b = token;
            r991.c = pair;
        }
        uv90 uv90Var = this.j;
        if (uv90Var == null) {
            uv90Var = null;
        }
        PaymentMethod.GooglePay googlePay = PaymentMethod.GooglePay.INSTANCE;
        xjg xjgVar = new xjg(ryj0Var, px90Var, false, 5);
        bga0Var.b = zfa0.c;
        y4a0 y4a0Var = bga0Var.a;
        y4a0Var.b = xjgVar;
        ((wga0) uv90Var).f(googlePay, str, y4a0Var);
    }

    public final void b(String str, ryj0 ryj0Var) {
        uv90 uv90Var = this.j;
        if (uv90Var == null) {
            uv90Var = null;
        }
        ((wga0) uv90Var).p = new ljh(ryj0Var);
        String token = this.b.getToken();
        px90 px90Var = this.e;
        bga0 bga0Var = this.f;
        Pair pair = new Pair(px90Var, bga0Var);
        if (r991.b == null) {
            r991.b = token;
            r991.c = pair;
        }
        uv90 uv90Var2 = this.j;
        uv90 uv90Var3 = uv90Var2 != null ? uv90Var2 : null;
        PaymentMethod.NewSbpToken newSbpToken = PaymentMethod.NewSbpToken.INSTANCE;
        xjg xjgVar = new xjg(ryj0Var, px90Var, false, 5);
        bga0Var.b = zfa0.c;
        y4a0 y4a0Var = bga0Var.a;
        y4a0Var.b = xjgVar;
        ((wga0) uv90Var3).f(newSbpToken, str, y4a0Var);
    }

    public final void c(PaymentMethod paymentMethod, tls tlsVar, String str, ryj0 ryj0Var) {
        mrf mrfVar = new mrf(1, ryj0Var, new xw90(tlsVar, 2, this));
        px90 px90Var = this.e;
        px90.h(px90Var, mrfVar);
        String token = this.b.getToken();
        bga0 bga0Var = this.f;
        Pair pair = new Pair(px90Var, bga0Var);
        if (r991.b == null) {
            r991.b = token;
            r991.c = pair;
        }
        uv90 uv90Var = this.j;
        if (uv90Var == null) {
            uv90Var = null;
        }
        xjg xjgVar = new xjg(ryj0Var, px90Var, false, 5);
        bga0Var.b = zfa0.c;
        y4a0 y4a0Var = bga0Var.a;
        y4a0Var.b = xjgVar;
        ((wga0) uv90Var).f(paymentMethod, str, y4a0Var);
    }

    public final void d(NewCard newCard, String str, ryj0 ryj0Var) {
        mrf mrfVar = new mrf(1, ryj0Var, new bgc(12));
        px90 px90Var = this.e;
        px90.h(px90Var, mrfVar);
        uv90 uv90Var = this.j;
        if (uv90Var == null) {
            uv90Var = null;
        }
        PaymentMethod.NewCard newCard2 = PaymentMethod.NewCard.INSTANCE;
        xjg xjgVar = new xjg(ryj0Var, px90Var, false, 5);
        zfa0 zfa0Var = zfa0.c;
        bga0 bga0Var = this.f;
        bga0Var.b = zfa0Var;
        y4a0 y4a0Var = bga0Var.a;
        y4a0Var.b = xjgVar;
        ((wga0) uv90Var).f(newCard2, str, y4a0Var);
        ((yv90) ((asw) this.d)).f(newCard);
    }

    public final void e(String str, ryj0 ryj0Var) {
        uv90 uv90Var = this.j;
        if (uv90Var == null) {
            uv90Var = null;
        }
        ((wga0) uv90Var).p = new ljh(ryj0Var);
        String token = this.b.getToken();
        px90 px90Var = this.e;
        bga0 bga0Var = this.f;
        Pair pair = new Pair(px90Var, bga0Var);
        if (r991.b == null) {
            r991.b = token;
            r991.c = pair;
        }
        uv90 uv90Var2 = this.j;
        uv90 uv90Var3 = uv90Var2 != null ? uv90Var2 : null;
        PaymentMethod.Sbp sbp = PaymentMethod.Sbp.INSTANCE;
        xjg xjgVar = new xjg(ryj0Var, px90Var, false, 5);
        bga0Var.b = zfa0.c;
        y4a0 y4a0Var = bga0Var.a;
        y4a0Var.b = xjgVar;
        ((wga0) uv90Var3).f(sbp, str, y4a0Var);
    }

    public final void f(String str, String str2, String str3, ryj0 ryj0Var) {
        String uid = this.i.getUid();
        if (uid == null) {
            uid = "";
        }
        String a = this.h.a(this.a, uid);
        if (a != null) {
            sv90 sv90Var = qv90.a;
            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics = PaymentOptionNameForAnalytics.SBP_TOKEN;
            sv90Var.getClass();
            ((y22) this.g).a(sv90.d(a, paymentOptionNameForAnalytics));
        }
        aia0 aia0Var = this.k;
        if (aia0Var == null) {
            aia0Var = null;
        }
        aia0 aia0Var2 = aia0Var;
        aia0Var2.g.g(new rs5(aia0Var2, str, str2, str3, new sae(28, ryj0Var), new ljh(ryj0Var), a)).h(new sp4(ryj0Var, 10)).c(new sp4(ryj0Var, 11));
    }
}

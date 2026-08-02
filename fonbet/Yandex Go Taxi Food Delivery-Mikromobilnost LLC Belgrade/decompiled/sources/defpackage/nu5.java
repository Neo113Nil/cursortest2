package defpackage;

import com.yandex.payment.sdk.core.data.CardId;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.payment.sdk.core.data.a;
import com.yandex.xplat.payment.sdk.BindingServiceError;
import com.yandex.xplat.payment.sdk.ChallengeMethod;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class nu5 {
    public final xw5 a;
    public final bx5 b;
    public final ox90 c;
    public ryj0 d;

    public nu5(xw5 xw5Var, bx5 bx5Var, ox90 ox90Var) {
        this.a = xw5Var;
        this.b = bx5Var;
        this.c = ox90Var;
    }

    public final void a(ryj0 ryj0Var) {
        if (this.d != null) {
            PaymentKitError.Companion.getClass();
            ryj0Var.i(a.d("Failed to bind card. \"bindCompletion\" is not null"));
        } else {
            this.d = ryj0Var;
            this.c.g();
        }
    }

    public final void b(String str, tls tlsVar, ryj0 ryj0Var) {
        mu5 mu5Var = new mu5(tlsVar);
        bx5 bx5Var = this.b;
        rwo rwoVar = bx5Var.l;
        iho f = vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Привязка СБП токена", "bind_sbp_token");
        qs20 qs20Var = bx5Var.f;
        md51 g = qs20Var.a.f(new tv5(str, 0), new rv10(28), NetworkServiceRetryingStrategy.retryOnce).g(new w04(15, mu5Var, bx5Var));
        ((y22) rwoVar).b(f, g);
        g.h(new sp4(ryj0Var, 6)).c(new sp4(ryj0Var, 7));
    }

    public final void c() {
        bx5 bx5Var = this.a.a;
        w18 w18Var = bx5Var.q;
        if (w18Var != null) {
            w18Var.a = true;
        }
        bx5Var.q = null;
        bx5 bx5Var2 = this.b;
        w18 w18Var2 = bx5Var2.q;
        if (w18Var2 != null) {
            w18Var2.a = true;
        }
        bx5Var2.q = null;
    }

    public final void d(String str, String str2, ryj0 ryj0Var) {
        bx5 bx5Var = this.b;
        rwo rwoVar = bx5Var.l;
        qv90.a.getClass();
        wj00 i = vfc.i(0, "sbp_token_id", str, "verification_id", str2);
        i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь запросил повторно отправить код, sbp_token_id = " + str + ", verification_id = " + str2);
        iho c = y891.c("verification_resend_code", i);
        md51 g = bx5Var.f.a.f(new s931(str, str2, "", ChallengeMethod.smsChallenge, true), new rv10(27), NetworkServiceRetryingStrategy.retryOnce).g(new ar5(5));
        ((y22) rwoVar).b(c, g);
        g.h(new sp4(ryj0Var, 2)).c(new sp4(ryj0Var, 3));
    }

    public final void e(CardId cardId, ryj0 ryj0Var) {
        String value = cardId.getValue();
        bx5 bx5Var = this.a.a;
        hx11 hx11Var = new hx11(bx5Var.a.b, value);
        rwo rwoVar = bx5Var.l;
        qv90.a.getClass();
        iho c = y891.c("unbind_card", vfc.i(0, "card_id", value, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Удалить привязанную карту ".concat(value)));
        nhj nhjVar = bx5Var.g;
        md51 h = hg91.a("unbind_card", nhjVar.b, new bmh(23, nhjVar, hx11Var)).h(new ar5(13));
        ((y22) rwoVar).b(c, h);
        h.h(new sp4(ryj0Var, 8)).c(new sp4(ryj0Var, 9));
    }

    public final void f(CardId cardId, ryj0 ryj0Var) {
        md51 g;
        String value = cardId.getValue();
        int i = 26;
        ymu ymuVar = new ymu(i, this.c, ryj0Var);
        bx5 bx5Var = this.a.a;
        hh5 hh5Var = new hh5(5, ymuVar);
        rwo rwoVar = bx5Var.l;
        sv90 sv90Var = qv90.a;
        boolean z = bx5Var.k;
        sv90Var.getClass();
        String concat = "Подтвердить карту ".concat(value);
        if (z) {
            concat = concat.concat(", с использованием поллинга");
        }
        wj00 wj00Var = new wj00(0);
        wj00Var.k("card_id", value);
        wj00Var.i("use_verification_polling", z);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        iho c = y891.c("verify_card", wj00Var);
        int i2 = 2;
        if (bx5Var.a.b == null) {
            g = zmx.c(new BindingServiceError(ExternalErrorKind.authorization, ExternalErrorTrigger.internal_sdk, null, null, "Unable to bind a new card: OAuth token is empty."));
        } else {
            g = bx5Var.f.a.f(new bib(value, bx5Var.h, 2), new rv10(i), NetworkServiceRetryingStrategy.retryOnce).g(new q(22, bx5Var, value, hh5Var));
        }
        ((y22) rwoVar).b(c, g);
        g.h(new pw5(ymuVar, i2)).c(new pw5(ymuVar, 3));
    }

    public final void g(String str, String str2, String str3, SbpChallengeInfo.SbpChallengeMethod sbpChallengeMethod, ryj0 ryj0Var) {
        ChallengeMethod challengeMethod;
        int i = vme.b[sbpChallengeMethod.ordinal()];
        if (i == 1) {
            challengeMethod = ChallengeMethod.smsChallenge;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            challengeMethod = ChallengeMethod.randomAmount;
        }
        ChallengeMethod challengeMethod2 = challengeMethod;
        bx5 bx5Var = this.b;
        rwo rwoVar = bx5Var.l;
        qv90.a.getClass();
        wj00 i2 = vfc.i(0, "sbp_token_id", str, "verification_id", str2);
        i2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Верификация СБП токена " + str + ", verification_id = " + str2);
        iho c = y891.c("verify_sbp_token", i2);
        md51 h = bx5Var.f.a.f(new s931(str, str2, str3, challengeMethod2, false), new rv10(27), NetworkServiceRetryingStrategy.retryOnce).h(new ar5(9));
        ((y22) rwoVar).b(c, h);
        h.h(new sp4(ryj0Var, 4)).c(new sp4(ryj0Var, 5));
    }
}

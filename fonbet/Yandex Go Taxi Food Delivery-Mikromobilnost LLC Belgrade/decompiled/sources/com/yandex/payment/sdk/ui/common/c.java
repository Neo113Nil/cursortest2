package com.yandex.payment.sdk.ui.common;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.sdk.FinishPaymentResult;
import com.yandex.payment.sdk.core.data.BoundSbpToken;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.core.data.PersonalInfo;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.PersonalInfoVisibility;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.common.ResultFragment;
import defpackage.apa1;
import defpackage.dgo;
import defpackage.ev5;
import defpackage.hyj0;
import defpackage.iu11;
import defpackage.kyj0;
import defpackage.nao0;
import defpackage.np90;
import defpackage.pwf;
import defpackage.qyj0;
import defpackage.ryh0;
import defpackage.s400;
import defpackage.sw4;
import defpackage.vyj0;
import defpackage.wsf;
import defpackage.wwg;
import defpackage.wy4;
import defpackage.xry0;
import defpackage.xsf;
import defpackage.yry0;
import defpackage.zbq0;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class c implements sw4 {
    public final qyj0 a;
    public final Parcelable b;
    public final /* synthetic */ zbq0 c;

    public c(zbq0 zbq0Var, qyj0 qyj0Var, BoundSbpToken boundSbpToken) {
        this.c = zbq0Var;
        this.a = qyj0Var;
        this.b = boundSbpToken;
    }

    public static Fragment b(DKResultFragment dKResultFragment, ResultFragment resultFragment) {
        if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_RESULT_FLAG)) {
            dKResultFragment = null;
        }
        return dKResultFragment == null ? resultFragment : dKResultFragment;
    }

    public final void a(String str, PaymentKitError paymentKitError) {
        Fragment b;
        this.c.a.saveActivityResultError$paymentsdk_release(paymentKitError);
        ResultScreenClosing resultScreenClosing = ((pwf) this.c.b).a().getResultScreenClosing();
        if (!resultScreenClosing.hideFinalState$paymentsdk_release()) {
            zbq0 zbq0Var = this.c;
            if (!zbq0Var.z && !zbq0Var.a.getSupportFragmentManager().S()) {
                this.c.a.popFragmentBackStack$paymentsdk_release();
                if (str != null) {
                    DKResultFragment a = wsf.a(new xsf(), new TextRes.StringText(str), resultScreenClosing.getShowButton() ? new TextRes.IntRes(ryh0.paymentsdk_login_done) : null, null, null, resultScreenClosing.getDelayToAutoHide(), new ResultScreenIdentifier.PaymentFailure(paymentKitError));
                    ResultFragment.Companion.getClass();
                    ResultFragment resultFragment = new ResultFragment();
                    resultFragment.setArguments(wwg.g(new Pair("ARG_RESULT", ResultFragment.RESULT.FAILURE), new Pair("ARG_EXTERNAL_TEXT", str), new Pair("ARG_CLOSING", resultScreenClosing)));
                    b = b(a, resultFragment);
                } else {
                    xsf xsfVar = new xsf();
                    xry0 xry0Var = yry0.a;
                    TextRes.IntRes intRes = new TextRes.IntRes(iu11.b(paymentKitError, yry0.a.e));
                    TextRes.IntRes intRes2 = resultScreenClosing.getShowButton() ? new TextRes.IntRes(ryh0.paymentsdk_login_done) : null;
                    Integer a2 = iu11.a(paymentKitError);
                    DKResultFragment a3 = wsf.a(xsfVar, intRes, intRes2, a2 != null ? new TextRes.IntRes(a2.intValue()) : null, null, resultScreenClosing.getDelayToAutoHide(), new ResultScreenIdentifier.PaymentFailure(paymentKitError));
                    a aVar = ResultFragment.Companion;
                    int b2 = iu11.b(paymentKitError, yry0.a.e);
                    Integer a4 = iu11.a(paymentKitError);
                    aVar.getClass();
                    b = b(a3, a.a(b2, a4, resultScreenClosing));
                }
                BaseActivity.replaceFragment$paymentsdk_release$default(this.c.a, b, false, 0, 6, null);
                this.c.L();
                this.c.K();
                return;
            }
        }
        this.c.a.finishWithResult$paymentsdk_release();
    }

    public final void c(FinishPaymentResult finishPaymentResult) {
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) this.c.b).b());
        if (a != null) {
            a.a(new s400());
        }
        if (finishPaymentResult instanceof FinishPaymentResult.Success) {
            xry0 xry0Var = yry0.a;
            d(this.b, yry0.a.c);
            return;
        }
        if (!(finishPaymentResult instanceof FinishPaymentResult.Error)) {
            qyj0 qyj0Var = this.a;
            if (qyj0Var instanceof kyj0) {
                d(this.b, ((Number) ((kyj0) qyj0Var).a).intValue());
                return;
            } else {
                if (qyj0Var instanceof hyj0) {
                    a(null, ((hyj0) qyj0Var).a);
                    return;
                }
                return;
            }
        }
        FinishPaymentResult.Error error = (FinishPaymentResult.Error) finishPaymentResult;
        if (error.getLocalizedText() != null) {
            com.yandex.payment.sdk.core.data.a aVar = PaymentKitError.Companion;
            String localizedText = error.getLocalizedText();
            aVar.getClass();
            a(error.getLocalizedText(), com.yandex.payment.sdk.core.data.a.a(localizedText));
            return;
        }
        qyj0 qyj0Var2 = this.a;
        if (qyj0Var2 instanceof hyj0) {
            a(null, ((hyj0) qyj0Var2).a);
        } else {
            PaymentKitError.Companion.getClass();
            a(null, com.yandex.payment.sdk.core.data.a.a(null));
        }
    }

    public final void d(Parcelable parcelable, int i) {
        Fragment b;
        zbq0 zbq0Var = this.c;
        BaseActivity baseActivity = zbq0Var.a;
        BaseActivity baseActivity2 = zbq0Var.a;
        baseActivity.saveActivityResultSuccess$paymentsdk_release(parcelable);
        wy4 wy4Var = zbq0Var.b;
        ResultScreenClosing resultScreenClosing = ((pwf) wy4Var).a().getResultScreenClosing();
        if (resultScreenClosing.hideSuccessState$paymentsdk_release() || zbq0Var.z || baseActivity2.getSupportFragmentManager().S()) {
            baseActivity2.finishWithResult$paymentsdk_release();
            return;
        }
        baseActivity2.popFragmentBackStack$paymentsdk_release();
        if (!((PersonalInfoVisibility) ((pwf) wy4Var).p.get()).shouldShowAnything() || np90.b() == null) {
            xsf xsfVar = new xsf();
            TextRes.IntRes intRes = new TextRes.IntRes(i);
            TextRes.IntRes intRes2 = new TextRes.IntRes(ryh0.paymentsdk_login_done);
            if (!resultScreenClosing.getShowButton()) {
                intRes2 = null;
            }
            DKResultFragment e = xsfVar.e(intRes, intRes2, resultScreenClosing.getDelayToAutoHide(), ResultScreenIdentifier.PaymentSuccess.INSTANCE);
            ResultFragment.Companion.getClass();
            b = b(e, a.b(i, resultScreenClosing));
        } else {
            xsf xsfVar2 = new xsf();
            TextRes.IntRes intRes3 = new TextRes.IntRes(i);
            TextRes.IntRes intRes4 = new TextRes.IntRes(ryh0.paymentsdk_login);
            if (!resultScreenClosing.getShowButton()) {
                intRes4 = null;
            }
            DKResultFragment e2 = xsfVar2.e(intRes3, intRes4, resultScreenClosing.getDelayToAutoHide(), ResultScreenIdentifier.PaymentSuccess.INSTANCE);
            vyj0.h(e2, new nao0(20, this, zbq0Var), null, null, 6);
            a aVar = ResultFragment.Companion;
            PersonalInfo personalInfo = zbq0Var.A;
            boolean isDebug = ((PaymentSdkEnvironment) ((pwf) wy4Var).n.get()).getIsDebug();
            aVar.getClass();
            ResultFragment resultFragment = new ResultFragment();
            resultFragment.setArguments(wwg.g(new Pair("ARG_RESULT", ResultFragment.RESULT.SUCCESS), new Pair("ARG_TEXT", Integer.valueOf(i)), new Pair("ARG_IS_LOGGED_IN", Boolean.FALSE), new Pair("ARG_PERSONAL_INFO", personalInfo), new Pair("ARG_IS_DEBUG", Boolean.valueOf(isDebug))));
            b = b(e2, resultFragment);
        }
        BaseActivity.replaceFragment$paymentsdk_release$default(zbq0Var.a, b, false, 0, 6, null);
        zbq0Var.L();
        zbq0Var.K();
    }
}

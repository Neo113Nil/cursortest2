package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment;
import com.yandex.payment.divkit.cvv_confirm.CvvScreenArguments;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.bind.AdditionalVerifyCardActivity;
import com.yandex.payment.sdk.ui.common.ResultFragment;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import java.util.List;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class go0 implements d560, nmo, arf, stf {
    public final i3y a;
    public final /* synthetic */ AdditionalVerifyCardActivity b;

    public go0(AdditionalVerifyCardActivity additionalVerifyCardActivity) {
        this.b = additionalVerifyCardActivity;
        this.a = a.a(new eo0(additionalVerifyCardActivity, 1));
    }

    @Override // defpackage.nrf
    public final uv90 A() {
        return null;
    }

    @Override // defpackage.vw90
    public final void B(sls slsVar) {
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        additionalVerifyCardActivity.getBinding().b.setOnClickListener(new k5(5, (x460) slsVar, additionalVerifyCardActivity));
    }

    @Override // defpackage.nrf
    public final void C() {
        poa0 binding = this.b.getBinding();
        binding.b.setVisibility(8);
        binding.h.setVisibility(8);
        binding.d.setVisibility(8);
    }

    @Override // defpackage.nrf
    public final px90 F() {
        return ((pwf) this.b.getBaseComponent$paymentsdk_release()).g();
    }

    @Override // defpackage.nmo, defpackage.nrf, defpackage.stf
    public final tc5 a() {
        return this.b.getActivityViewModel();
    }

    @Override // defpackage.nmo, defpackage.nrf, defpackage.stf
    public final Object b(Fragment fragment, Class cls) {
        return ((y8h) ((p7u) dpb1.c(fragment)).componentDispatcher()).b(xxk.class);
    }

    @Override // defpackage.d560, defpackage.arf
    public final void c(BoundCard boundCard) {
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) this.b.getBaseComponent$paymentsdk_release()).b());
        if (a != null) {
            a.a(qtb1.J);
        }
        this.b.saveActivityResultSuccess$paymentsdk_release(boundCard);
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        qv90.a.getClass();
        additionalVerifyCardActivity.reportEvent(sv90.a(null, true));
        ResultScreenClosing resultScreenClosing = ((pwf) this.b.getBaseComponent$paymentsdk_release()).a().getResultScreenClosing();
        if (resultScreenClosing.hideSuccessState$paymentsdk_release()) {
            this.b.finishWithResult$paymentsdk_release();
            return;
        }
        xsf xsfVar = new xsf();
        xry0 xry0Var = yry0.a;
        Fragment e = xsfVar.e(new TextRes.IntRes(yry0.a.g), resultScreenClosing.getShowButton() ? new TextRes.IntRes(ryh0.paymentsdk_login_done) : null, resultScreenClosing.getDelayToAutoHide(), ResultScreenIdentifier.CardBindingSuccess.INSTANCE);
        if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_RESULT_FLAG)) {
            e = null;
        }
        if (e == null) {
            com.yandex.payment.sdk.ui.common.a aVar = ResultFragment.Companion;
            int i = yry0.a.g;
            aVar.getClass();
            e = com.yandex.payment.sdk.ui.common.a.b(i, resultScreenClosing);
        }
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(this.b.getSupportFragmentManager());
        aVar2.h(j9h0.fragment_container, e, null);
        aVar2.l(true, true);
    }

    @Override // defpackage.d560, defpackage.ts90
    public final void d(String str, List list) {
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(additionalVerifyCardActivity.getSupportFragmentManager());
        aVar.h(j9h0.challenge_fragment, eq41.a(WebViewFragment.Companion, additionalVerifyCardActivity.getCard3DSWebViewDelegateFactory(), str, additionalVerifyCardActivity.getConfig$paymentsdk_release().a, list), null);
        aVar.l(true, true);
    }

    @Override // defpackage.d560, defpackage.arf
    public final void e(PaymentKitError paymentKitError) {
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) this.b.getBaseComponent$paymentsdk_release()).b());
        if (a != null) {
            a.a(new f0a0(paymentKitError));
        }
        this.b.saveActivityResultError$paymentsdk_release(paymentKitError);
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        sv90 sv90Var = qv90.a;
        String message = paymentKitError.getMessage();
        sv90Var.getClass();
        additionalVerifyCardActivity.reportEvent(sv90.a(message, false));
        ResultScreenClosing resultScreenClosing = ((pwf) this.b.getBaseComponent$paymentsdk_release()).a().getResultScreenClosing();
        if (resultScreenClosing.hideFinalState$paymentsdk_release()) {
            this.b.finishWithResult$paymentsdk_release();
            return;
        }
        xsf xsfVar = new xsf();
        xry0 xry0Var = yry0.a;
        TextRes.IntRes intRes = new TextRes.IntRes(iu11.b(paymentKitError, yry0.a.j));
        TextRes.IntRes intRes2 = resultScreenClosing.getShowButton() ? new TextRes.IntRes(ryh0.paymentsdk_login_done) : null;
        Integer a2 = iu11.a(paymentKitError);
        Fragment a3 = wsf.a(xsfVar, intRes, intRes2, a2 != null ? new TextRes.IntRes(a2.intValue()) : null, null, resultScreenClosing.getDelayToAutoHide(), new ResultScreenIdentifier.CardBindingFailure(paymentKitError));
        if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_RESULT_FLAG)) {
            a3 = null;
        }
        if (a3 == null) {
            com.yandex.payment.sdk.ui.common.a aVar = ResultFragment.Companion;
            int b = iu11.b(paymentKitError, yry0.a.j);
            Integer a4 = iu11.a(paymentKitError);
            aVar.getClass();
            a3 = com.yandex.payment.sdk.ui.common.a.a(b, a4, resultScreenClosing);
        }
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(this.b.getSupportFragmentManager());
        aVar2.h(j9h0.fragment_container, a3, null);
        aVar2.l(true, true);
    }

    @Override // defpackage.d560, defpackage.ts90
    public final void f() {
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        Fragment E = additionalVerifyCardActivity.getSupportFragmentManager().E(j9h0.challenge_fragment);
        if (E != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(additionalVerifyCardActivity.getSupportFragmentManager());
            aVar.p(E);
            aVar.l(true, true);
        }
    }

    @Override // defpackage.stf
    public final void finish() {
        this.b.finishWithResult$paymentsdk_release();
    }

    @Override // defpackage.nrf
    public final boolean g() {
        return apa1.e(FeatureFlag.NO_CVV_MIR_PAY) && ((yv90) ox21.b(((pwf) this.b.getBaseComponent$paymentsdk_release()).f())).e();
    }

    @Override // defpackage.x760
    public final rwo getEventReporter() {
        return ((pwf) this.b.getBaseComponent$paymentsdk_release()).c();
    }

    @Override // defpackage.arf
    public final void h(rf8 rf8Var) {
        new xsf();
        int i = rf8Var.a;
        String str = rf8Var.b;
        String str2 = rf8Var.c;
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        fo0 fo0Var = new fo0(additionalVerifyCardActivity, 1);
        CvvConfirmFragment.Companion.getClass();
        CvvConfirmFragment cvvConfirmFragment = new CvvConfirmFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("paymentsdk_cvv_args_key", new CvvScreenArguments.NoPaymentChallenge(i, str, str2));
        cvvConfirmFragment.setArguments(bundle);
        cvvConfirmFragment.setCompletionCallback(fo0Var);
        BaseActivity.replaceFragment$paymentsdk_release$default(additionalVerifyCardActivity, cvvConfirmFragment, false, j9h0.challenge_fragment, 2, null);
        cvvConfirmFragment.setCallback(new zbq0(additionalVerifyCardActivity, additionalVerifyCardActivity.getBaseComponent$paymentsdk_release(), (ay90) this.a.getValue(), new eo0(additionalVerifyCardActivity, 2), new eo0(additionalVerifyCardActivity, 3), new ddf(6, additionalVerifyCardActivity), false));
        additionalVerifyCardActivity.showChallenge$paymentsdk_release();
        n(false);
        additionalVerifyCardActivity.hideLoading$paymentsdk_release();
    }

    @Override // defpackage.nrf
    public final int i() {
        cvy0 cvy0Var = ckt.a;
        return ckt.a(this.b);
    }

    @Override // defpackage.ts90
    public final void j(String str) {
        d(str, EmptyList.a);
    }

    @Override // defpackage.nrf
    public final vv90 k() {
        return ((pwf) this.b.getBaseComponent$paymentsdk_release()).f();
    }

    @Override // defpackage.stf
    public final yr31 l() {
        return this.b.getResultViewModel();
    }

    @Override // defpackage.ts90
    public final void m() {
    }

    @Override // defpackage.vw90
    public final void n(boolean z) {
        this.b.getBinding().b.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.nrf
    public final CardValidationConfig o() {
        return ((pwf) this.b.getBaseComponent$paymentsdk_release()).a().getCardValidationConfig();
    }

    @Override // defpackage.ts90
    public final void q(PaymentKitError paymentKitError) {
    }

    @Override // defpackage.ts90
    public final void r(int i) {
    }

    @Override // defpackage.nrf
    public final boolean s() {
        return this.b.getDebrandingFlag$paymentsdk_release();
    }

    @Override // defpackage.vw90
    public final void u(String str, String str2, String str3) {
        this.b.getBinding().b.setText(str, str2, null);
    }

    @Override // defpackage.vw90
    public final void v(lx90 lx90Var) {
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        lx90 currentState = additionalVerifyCardActivity.getBinding().b.getCurrentState();
        if (!jl40.l(currentState != null ? currentState.getClass() : null, lx90Var.getClass())) {
            if (lx90Var.equals(ix90.a)) {
                qv90.a.getClass();
                additionalVerifyCardActivity.reportEvent(sv90.F());
            } else if (lx90Var instanceof jx90) {
                qv90.a.getClass();
                additionalVerifyCardActivity.reportEvent(sv90.G());
            } else if (!lx90Var.equals(kx90.a)) {
                w511.b();
                return;
            }
        }
        additionalVerifyCardActivity.getBinding().b.setState(lx90Var);
    }

    @Override // defpackage.nmo
    public final wmo w() {
        return new wmo();
    }

    @Override // defpackage.nrf
    public final pv5 x() {
        return new pv5();
    }

    @Override // defpackage.nrf
    public final boolean y() {
        return apa1.e(FeatureFlag.NO_CVV_MIR_BINDING) && apa1.e(FeatureFlag.BINDING_PSP_FLAG);
    }

    @Override // defpackage.nrf
    public final void z(TextRes textRes, Integer num) {
        aqa0 snackBarBinding;
        aqa0 snackBarBinding2;
        aqa0 snackBarBinding3;
        aqa0 snackBarBinding4;
        String text = ((TextRes.StringText) textRes).getText();
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        snackBarBinding = additionalVerifyCardActivity.getSnackBarBinding();
        snackBarBinding.d.setText(text);
        snackBarBinding2 = additionalVerifyCardActivity.getSnackBarBinding();
        additionalVerifyCardActivity.bindImage$paymentsdk_release(snackBarBinding2.b, null);
        snackBarBinding3 = additionalVerifyCardActivity.getSnackBarBinding();
        n891.c(snackBarBinding3.c, null);
        snackBarBinding4 = additionalVerifyCardActivity.getSnackBarBinding();
        snackBarBinding4.a.announceForAccessibility(text + " ");
        ViewBindingActivityImpl.performSnackBarTransition$default(additionalVerifyCardActivity, true, additionalVerifyCardActivity.getBinding().f, 0L, 4, null);
    }
}

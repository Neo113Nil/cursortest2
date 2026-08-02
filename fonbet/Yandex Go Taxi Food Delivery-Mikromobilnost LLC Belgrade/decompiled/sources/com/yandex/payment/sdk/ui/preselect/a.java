package com.yandex.payment.sdk.ui.preselect;

import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.Fragment;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.divkit.bind.BindType;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.divkit.preselect.DKPreselectFragment;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.sdk.core.data.BankName;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.CardId;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.PreselectButtonState;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.common.ResultFragment;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment;
import com.yandex.payment.sdk.ui.preselect.select.PreselectFragment;
import defpackage.apa1;
import defpackage.bei;
import defpackage.ckt;
import defpackage.cvy0;
import defpackage.d1d;
import defpackage.dgo;
import defpackage.dve0;
import defpackage.eq41;
import defpackage.ev5;
import defpackage.eve0;
import defpackage.f0a0;
import defpackage.gtf;
import defpackage.hhq0;
import defpackage.itf;
import defpackage.iu11;
import defpackage.j9h0;
import defpackage.jhq0;
import defpackage.lx90;
import defpackage.njb;
import defpackage.o3a0;
import defpackage.ox21;
import defpackage.pv5;
import defpackage.pwf;
import defpackage.px90;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.soa0;
import defpackage.stf;
import defpackage.tc5;
import defpackage.uv90;
import defpackage.vv90;
import defpackage.wsf;
import defpackage.wwg;
import defpackage.xry0;
import defpackage.xsf;
import defpackage.xue0;
import defpackage.xxk;
import defpackage.y8h;
import defpackage.yr31;
import defpackage.yry0;
import defpackage.yue0;
import defpackage.yv90;
import defpackage.zbq0;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class a implements yue0, dve0, gtf, itf, stf {
    public final /* synthetic */ PreselectActivity a;

    public a(PreselectActivity preselectActivity) {
        this.a = preselectActivity;
    }

    @Override // defpackage.nrf
    public final uv90 A() {
        zbq0 zbq0Var;
        zbq0Var = this.a.selectFragmentCallbacks;
        if (zbq0Var != null) {
            return zbq0Var.B;
        }
        return null;
    }

    @Override // defpackage.vw90
    public final void B(sls slsVar) {
        this.a.getBinding().f.setOnClickListener(new njb(21, slsVar));
    }

    @Override // defpackage.nrf
    public final void C() {
        soa0 binding = this.a.getBinding();
        binding.f.setVisibility(8);
        binding.c.setVisibility(8);
        binding.h.setVisibility(8);
    }

    @Override // defpackage.nrf
    public final px90 F() {
        return ((pwf) this.a.getBaseComponent$paymentsdk_release()).g();
    }

    @Override // defpackage.nrf, defpackage.stf
    public final tc5 a() {
        return this.a.getActivityViewModel();
    }

    @Override // defpackage.nrf, defpackage.stf
    public final Object b(Fragment fragment, Class cls) {
        d1d componentDispatcher;
        componentDispatcher = this.a.getComponentDispatcher();
        return ((y8h) componentDispatcher).b(xxk.class);
    }

    public final void c(BoundCard boundCard) {
        boolean z;
        boolean z2;
        z = this.a.startPaymentAfterSelect;
        if (z) {
            z2 = this.a.bindNewCardBeforePayment;
            if (z2) {
                xry0 xry0Var = yry0.a;
                q(true, new TextRes.IntRes(yry0.a.n));
                m(new hhq0(new PaymentMethod.Card(new CardId(boundCard.getCardId()), CardPaymentSystem.Unknown, "", BankName.UnknownBank, null)));
            }
        }
    }

    public final void d(String str, List list) {
        eq41 eq41Var = WebViewFragment.Companion;
        PreselectActivity preselectActivity = this.a;
        BaseActivity.replaceFragment$paymentsdk_release$default(preselectActivity, eq41.a(eq41Var, preselectActivity.getCard3DSWebViewDelegateFactory(), str, preselectActivity.getConfig$paymentsdk_release().a, list), false, j9h0.challenge_fragment, 2, null);
    }

    public final void f() {
        this.a.removeFragment$paymentsdk_release(j9h0.challenge_fragment);
    }

    @Override // defpackage.stf
    public final void finish() {
        this.a.finishWithResult$paymentsdk_release();
    }

    @Override // defpackage.nrf
    public final boolean g() {
        return apa1.e(FeatureFlag.NO_CVV_MIR_PAY) && ((yv90) ox21.b(((pwf) this.a.getBaseComponent$paymentsdk_release()).f())).e();
    }

    @Override // defpackage.nrf
    public final int i() {
        cvy0 cvy0Var = ckt.a;
        return ckt.a(this.a.getBaseContext());
    }

    public final void j(PaymentKitError paymentKitError, int i) {
        Fragment a;
        Object obj = dgo.a;
        PreselectActivity preselectActivity = this.a;
        ev5 a2 = dgo.a(((pwf) preselectActivity.getBaseComponent$paymentsdk_release()).b());
        if (a2 != null) {
            a2.a(new f0a0(paymentKitError));
        }
        preselectActivity.saveActivityResultError$paymentsdk_release(paymentKitError);
        ResultScreenClosing resultScreenClosing = ((pwf) preselectActivity.getBaseComponent$paymentsdk_release()).a().getResultScreenClosing();
        if (resultScreenClosing.hideFinalState$paymentsdk_release()) {
            preselectActivity.finishWithResult$paymentsdk_release();
            return;
        }
        preselectActivity.popFragmentBackStack$paymentsdk_release();
        if (apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) && apa1.e(FeatureFlag.DIV_KIT_RESULT_FLAG)) {
            xsf xsfVar = new xsf();
            TextRes.IntRes intRes = new TextRes.IntRes(iu11.b(paymentKitError, i));
            TextRes.IntRes intRes2 = resultScreenClosing.getShowButton() ? new TextRes.IntRes(ryh0.paymentsdk_login_done) : null;
            Integer a3 = iu11.a(paymentKitError);
            a = wsf.a(xsfVar, intRes, intRes2, a3 != null ? new TextRes.IntRes(a3.intValue()) : null, null, resultScreenClosing.getDelayToAutoHide(), new ResultScreenIdentifier.PreselectFailure(paymentKitError));
        } else {
            com.yandex.payment.sdk.ui.common.a aVar = ResultFragment.Companion;
            int b = iu11.b(paymentKitError, i);
            Integer a4 = iu11.a(paymentKitError);
            aVar.getClass();
            a = com.yandex.payment.sdk.ui.common.a.a(b, a4, resultScreenClosing);
        }
        BaseActivity.replaceFragment$paymentsdk_release$default(preselectActivity, a, false, 0, 6, null);
    }

    @Override // defpackage.nrf
    public final vv90 k() {
        return ((pwf) this.a.getBaseComponent$paymentsdk_release()).f();
    }

    @Override // defpackage.stf
    public final yr31 l() {
        return this.a.getResultViewModel();
    }

    public final void m(jhq0 jhq0Var) {
        boolean z;
        Object obj = dgo.a;
        PreselectActivity preselectActivity = this.a;
        ev5 a = dgo.a(((pwf) preselectActivity.getBaseComponent$paymentsdk_release()).b());
        if (a != null) {
            a.a(bei.K);
        }
        z = preselectActivity.startPaymentAfterSelect;
        if (!z) {
            preselectActivity.saveActivityResultSuccess$paymentsdk_release(jhq0Var.getMethod());
            preselectActivity.finishWithResult$paymentsdk_release();
        } else {
            preselectActivity.stage = PreselectActivity.PreselectAndPayStage.WAITING_FOR_TOKEN;
            preselectActivity.setSelectedMethod(jhq0Var);
            o3a0.b.a(jhq0Var.getMethod());
        }
    }

    @Override // defpackage.vw90
    public final void n(boolean z) {
        this.a.getBinding().f.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.nrf
    public final CardValidationConfig o() {
        return ((pwf) this.a.getBaseComponent$paymentsdk_release()).a().getCardValidationConfig();
    }

    public final void p(boolean z) {
        boolean z2;
        Fragment preselectNewBindFragment;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        PreselectActivity preselectActivity = this.a;
        if (!z) {
            preselectActivity.popFragmentBackStack$paymentsdk_release();
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) preselectActivity.getApplicationContext().getSystemService("accessibility");
        boolean z7 = false;
        if (apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) && apa1.e(FeatureFlag.DIV_KIT_BIND_FLAG)) {
            new xsf();
            z4 = preselectActivity.startPaymentAfterSelect;
            if (z4) {
                z6 = preselectActivity.bindNewCardBeforePayment;
                if (!z6) {
                    z5 = true;
                    boolean z8 = (apa1.e(FeatureFlag.ENABLE_NFC_FLAG) || accessibilityManager.isEnabled()) ? false : true;
                    boolean e = apa1.e(FeatureFlag.ENABLE_CARD_SCANNER_FLAG);
                    DKBindCardFragment.Companion.getClass();
                    preselectNewBindFragment = new DKBindCardFragment();
                    preselectNewBindFragment.setArguments(wwg.g(new Pair("ARG_BIND_TYPE", new BindType.PreselectBindAndPay(z8, z5, z, z5, e))));
                }
            }
            z5 = false;
            if (apa1.e(FeatureFlag.ENABLE_NFC_FLAG)) {
            }
            boolean e2 = apa1.e(FeatureFlag.ENABLE_CARD_SCANNER_FLAG);
            DKBindCardFragment.Companion.getClass();
            preselectNewBindFragment = new DKBindCardFragment();
            preselectNewBindFragment.setArguments(wwg.g(new Pair("ARG_BIND_TYPE", new BindType.PreselectBindAndPay(z8, z5, z, z5, e2))));
        } else {
            eve0 eve0Var = PreselectNewBindFragment.Companion;
            z2 = preselectActivity.startPaymentAfterSelect;
            if (z2) {
                z3 = preselectActivity.bindNewCardBeforePayment;
                if (!z3) {
                    z7 = true;
                }
            }
            eve0Var.getClass();
            preselectNewBindFragment = new PreselectNewBindFragment();
            preselectNewBindFragment.setArguments(wwg.g(new Pair("ARG_IS_BACK_BUTTON_ENABLED", Boolean.valueOf(z)), new Pair("START_PAYMENT_AFTER_SELECT", Boolean.valueOf(z7))));
        }
        BaseActivity.replaceFragment$paymentsdk_release$default(preselectActivity, preselectNewBindFragment, true, 0, 4, null);
        preselectActivity.hideLoading$paymentsdk_release();
        preselectActivity.removeFragment$paymentsdk_release(j9h0.loading_fragment_container);
    }

    public final void q(boolean z, TextRes.IntRes intRes) {
        DKResultFragment c = new xsf().c(false, z, intRes, null, null, ResultScreenIdentifier.PreselectLoading.INSTANCE);
        int i = j9h0.loading_fragment_container;
        PreselectActivity preselectActivity = this.a;
        preselectActivity.replaceFragment$paymentsdk_release(c, false, i);
        preselectActivity.showLoading$paymentsdk_release();
    }

    public final void r() {
        boolean z;
        String str;
        PreselectButtonState preselectButtonState;
        boolean z2;
        String str2;
        PreselectActivity preselectActivity = this.a;
        preselectActivity.popFragmentBackStack$paymentsdk_release();
        xsf xsfVar = new xsf();
        z = preselectActivity.startPaymentAfterSelect;
        str = preselectActivity.defaultPaymentMethodId;
        preselectButtonState = preselectActivity.preselectButtonState;
        Fragment fragment = null;
        DKPreselectFragment d = xsfVar.d(str, z, preselectButtonState != null ? Double.valueOf(preselectButtonState.getTotal()) : null);
        if (apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) && apa1.e(FeatureFlag.DIV_KIT_PRESELECT_FLAG)) {
            fragment = d;
        }
        if (fragment == null) {
            xue0 xue0Var = PreselectFragment.Companion;
            z2 = preselectActivity.startPaymentAfterSelect;
            str2 = preselectActivity.defaultPaymentMethodId;
            xue0Var.getClass();
            fragment = xue0.a(str2, z2);
        }
        BaseActivity.replaceFragment$paymentsdk_release$default(preselectActivity, fragment, true, 0, 4, null);
    }

    @Override // defpackage.nrf
    public final boolean s() {
        return this.a.getDebrandingFlag$paymentsdk_release();
    }

    public final void t(List list) {
        this.a.methods = list;
    }

    @Override // defpackage.vw90
    public final void u(String str, String str2, String str3) {
        this.a.getBinding().f.setText(str, str2, str3);
    }

    @Override // defpackage.vw90
    public final void v(lx90 lx90Var) {
        this.a.getBinding().f.setState(lx90Var);
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
        this.a.showSnackBar$paymentsdk_release(textRes, num, null);
    }
}

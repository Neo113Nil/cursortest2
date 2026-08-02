package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonValidationResult;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderScreenParams;
import defpackage.ds31;
import defpackage.etw;
import defpackage.evu0;
import defpackage.ftw;
import defpackage.g8e;
import defpackage.gau;
import defpackage.itw;
import defpackage.ktw;
import defpackage.l0p;
import defpackage.m04;
import defpackage.mgu;
import defpackage.ou01;
import defpackage.pz40;
import defpackage.q4s;
import defpackage.qoi0;
import defpackage.r8j0;
import defpackage.rm01;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w511;
import defpackage.yow;
import defpackage.zmg;
import java.util.LinkedHashMap;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final InternetPaymentFormInputScreenParams B;
    public final com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.data.a C;
    public final rm01 D;
    public final tfl0 E;
    public final com.ybsdk.feature.transfer.version2.internal.screens.a F;
    public final m04 G;

    public b(ktw ktwVar, InternetPaymentFormInputScreenParams internetPaymentFormInputScreenParams, com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.data.a aVar, rm01 rm01Var, tfl0 tfl0Var, com.ybsdk.feature.transfer.version2.internal.screens.a aVar2, m04 m04Var) {
        super(new yow(4, internetPaymentFormInputScreenParams), ktwVar);
        this.B = internetPaymentFormInputScreenParams;
        this.C = aVar;
        this.D = rm01Var;
        this.E = tfl0Var;
        this.F = aVar2;
        this.G = m04Var;
        f0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r3 == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() {
        ftw ftwVar;
        boolean z;
        r0 r0Var;
        Object value;
        ftw ftwVar2 = (ftw) ((etw) X()).a.a();
        if (ftwVar2 == null) {
            return;
        }
        String name = ftwVar2.a.getName();
        InternetPaymentFormInputScreenParams internetPaymentFormInputScreenParams = this.B;
        boolean withResult = internetPaymentFormInputScreenParams.getWithResult();
        m04 m04Var = this.G;
        l0p l0pVar = m04Var.a.E;
        InternetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonClickButton internetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonClickButton = withResult ? InternetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonClickButton.SAVE : InternetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonClickButton.NEXT;
        LinkedHashMap w = g8e.w(2, "provider", name);
        w.put("button", internetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonClickButton.getOriginalValue());
        l0pVar.a.a("payment.internet_tv.providers_account_screen_button_click", w);
        ftw ftwVar3 = (ftw) ((etw) X()).a.a();
        if (ftwVar3 != null) {
            q4s q4sVar = ftwVar3.b.b;
            String str = ((etw) X()).b;
            Regex regex = q4sVar != null ? q4sVar.a : null;
            if (!evu0.J(str) && regex != null) {
                boolean h = regex.h(str);
                z = true;
            }
            z = false;
            boolean z2 = z;
            String str2 = q4sVar != null ? q4sVar.b : null;
            l0p l0pVar2 = m04Var.a.E;
            InternetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonValidationResult internetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonValidationResult = z2 ? InternetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonValidationResult.OK : InternetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonValidationResult.ERROR;
            String str3 = z2 ? null : str2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, internetServicesEvents$PaymentInternetTvProvidersAccountScreenButtonValidationResult.getOriginalValue());
            if (str3 != null) {
                linkedHashMap.put("error", str3);
            }
            l0pVar2.a.a("payment.internet_tv.providers_account_screen_button_validation", linkedHashMap);
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, etw.a((etw) value, null, null, null, z2, 23)));
        }
        if (!((etw) X()).d || (ftwVar = (ftw) ((etw) X()).a.a()) == null) {
            return;
        }
        PaymentProviderEntity paymentProviderEntity = ftwVar.a;
        String str4 = ((etw) X()).b;
        if (internetPaymentFormInputScreenParams.getWithResult()) {
            Z(new itw(PaymentProviderEntity.copy$default(paymentProviderEntity, null, null, null, ((etw) X()).b, null, 23, null), str4));
            return;
        }
        TransferMainScreenArguments transferMainScreenArguments = new TransferMainScreenArguments(TransferDirection.TRANSFER, internetPaymentFormInputScreenParams.getAgreementId(), new TransferPrerequisites.InternetPayment(paymentProviderEntity.getId(), str4), TransferScenario.INTERNET_PAYMENT, false, false, null, null, null, null, null, 1984, null);
        this.F.getClass();
        this.E.l(com.ybsdk.feature.transfer.version2.internal.screens.a.f(transferMainScreenArguments));
    }

    public final void c0() {
        ftw ftwVar = (ftw) ((etw) X()).a.a();
        if (ftwVar == null) {
            return;
        }
        String name = ftwVar.a.getName();
        l0p l0pVar = this.G.a.E;
        l0pVar.a.a("payment.internet_tv.providers_account_screen_button_provider_click", g8e.w(1, "provider", name));
        InternetPaymentSelectProviderScreenParams internetPaymentSelectProviderScreenParams = new InternetPaymentSelectProviderScreenParams(true, this.B.getAgreementId());
        this.F.getClass();
        this.E.h(new FragmentScreen("InternetPaymentSelectProviderFragment", false, internetPaymentSelectProviderScreenParams, TransitionPolicyType.POPUP, qoi0.a(InternetPaymentSelectProviderFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null));
    }

    public final void d0() {
        u8j0 u8j0Var = ((etw) X()).a;
        if ((u8j0Var instanceof s8j0) || (u8j0Var instanceof t8j0)) {
            Z(zmg.b);
        } else if (u8j0Var instanceof r8j0) {
            Z(zmg.c);
        } else {
            w511.b();
        }
    }

    public final void e0(String str) {
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            String str2 = str;
            if (r0Var.k(value, etw.a((etw) value, null, null, str2, false, 27))) {
                f0();
                return;
            }
            str = str2;
        }
    }

    public final void f0() {
        this.G.a.E.a.a("payment.internet_tv.providers_account_screen_initiated", null);
        a0(new gau(28, this));
        tje.N(ds31.a(this), null, null, new InternetPaymentFormInputViewModel$onRequestData$2(this, null), 3);
    }

    public final void g0() {
        String supportUrl;
        u8j0 u8j0Var = ((etw) X()).a;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Object obj = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        ((ou01) this.D).a(supportUrl);
    }

    public final void h0(String str) {
        if (str.equals(((etw) X()).b)) {
            return;
        }
        a0(new mgu(16, this, str));
    }
}

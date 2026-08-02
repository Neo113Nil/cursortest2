package xsna;

import android.content.Context;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vk.superapp.vkpay.checkout.feature.success.states.SuccessState;
import com.vkontakte.android.R;
import xsna.bbv0;
import xsna.kku0;

/* compiled from: BiometricPromptPresenter.kt */
/* loaded from: classes6.dex */
public final class l57 implements fm6 {
    public final as90 b;
    public final as90 c;
    public final gbv0 d;
    public final a8c e;
    public final Context f;
    public final d2p0 g;
    public final wjk h;
    public final m57 i;
    public final io.reactivex.rxjava3.disposables.b j;

    public l57(as90 as90Var, as90 as90Var2) {
        bbv0.a aVar = bbv0.g;
        aVar.getClass();
        gbv0 gbv0Var = bbv0.a.f().d;
        aVar.getClass();
        VkPayCheckoutConfig vkPayCheckoutConfig = bbv0.a.f().b;
        a8c a8cVar = sdi.f;
        this.b = as90Var;
        this.c = as90Var2;
        this.d = gbv0Var;
        this.e = a8cVar;
        Context mo2getContext = as90Var2.mo2getContext();
        if (mo2getContext == null) {
            throw new IllegalStateException("Context is null");
        }
        this.f = mo2getContext;
        this.g = new d2p0(mo2getContext, vkPayCheckoutConfig.c.getUserId());
        this.h = new wjk();
        this.i = new m57(mo2getContext);
        this.j = new io.reactivex.rxjava3.disposables.b();
    }

    public final void a() {
        String str;
        String string;
        bbv0.g.getClass();
        VkTransactionInfo vkTransactionInfo = bbv0.a.f().a;
        int i = vkTransactionInfo.b;
        String str2 = sua.i(i, ',') + (char) 8201 + vkTransactionInfo.d.h();
        as90 as90Var = this.c;
        Context mo2getContext = as90Var.mo2getContext();
        String str3 = "";
        if (mo2getContext == null || (str = mo2getContext.getString(R.string.vk_pay_checkout_success_title)) == null) {
            str = "";
        }
        StatusActionStyle statusActionStyle = StatusActionStyle.PRIMARY;
        Context mo2getContext2 = as90Var.mo2getContext();
        if (mo2getContext2 != null && (string = mo2getContext2.getString(R.string.vk_pay_checkout_transaction_done)) != null) {
            str3 = string;
        }
        kku0.a.a(this.d, new Status(new SuccessState(str2, str), new ButtonAction(statusActionStyle, str3, new com.vk.movika.sdk.base.ui.g0(6))));
    }

    @Override // xsna.fm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.j.e();
    }

    @Override // xsna.fm6
    public final void d() {
    }

    @Override // xsna.fm6
    public final void onDestroy() {
    }

    @Override // xsna.fm6
    public final void onResume() {
    }

    @Override // xsna.fm6
    public final void onStart() {
    }
}

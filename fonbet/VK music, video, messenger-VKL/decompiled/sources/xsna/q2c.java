package xsna;

import android.content.Context;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.ErrorState;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vk.superapp.vkpay.checkout.feature.success.states.SuccessState;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bbv0;
import xsna.kku0;
import xsna.o2c;

/* compiled from: Checkout3dsPaymentPresenter.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class q2c extends FunctionReferenceImpl implements izs<TransactionStatusResponse.VkCheckoutTransactionStatus, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus) {
        String str;
        String string;
        TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus2 = vkCheckoutTransactionStatus;
        o2c o2cVar = (o2c) this.receiver;
        n2c n2cVar = o2cVar.b;
        kku0 kku0Var = o2cVar.d;
        if (vkCheckoutTransactionStatus2.h()) {
            if (o2c.a.$EnumSwitchMapping$0[vkCheckoutTransactionStatus2.ordinal()] == 1) {
                bbv0.g.getClass();
                VkTransactionInfo vkTransactionInfo = bbv0.a.f().a;
                int i = vkTransactionInfo.b;
                String str2 = sua.i(i, ',') + (char) 8201 + vkTransactionInfo.d.h();
                Context mo2getContext = n2cVar.mo2getContext();
                String str3 = "";
                if (mo2getContext == null || (str = mo2getContext.getString(R.string.vk_pay_checkout_success_title)) == null) {
                    str = "";
                }
                yv2 yv2Var = new yv2(8);
                StatusActionStyle statusActionStyle = StatusActionStyle.PRIMARY;
                Context mo2getContext2 = n2cVar.mo2getContext();
                if (mo2getContext2 != null && (string = mo2getContext2.getString(R.string.vk_pay_checkout_transaction_done)) != null) {
                    str3 = string;
                }
                kku0.a.a(kku0Var, new Status(new SuccessState(str2, str), new ButtonAction(statusActionStyle, str3, yv2Var)));
            } else {
                String str4 = o2cVar.c;
                Context mo2getContext3 = n2cVar.mo2getContext();
                if (mo2getContext3 != null) {
                    kku0.a.a(kku0Var, new Status(new ErrorState(mo2getContext3.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext3.getString(R.string.vk_pay_checkout_something_wrong_hint)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext3.getString(R.string.vk_pay_checkout_failed_try_again), new hh1(str4, 11))));
                }
            }
        }
        return s3q0.a;
    }
}

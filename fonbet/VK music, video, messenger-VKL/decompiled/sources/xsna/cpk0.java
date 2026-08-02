package xsna;

import android.content.Context;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.ErrorState;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vk.superapp.vkpay.checkout.feature.success.states.SuccessState;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PaymentData3DS;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PostData3DS;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PostParams3DS;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bbv0;
import xsna.kku0;

/* compiled from: StandaloneLoaderPresenter.kt */
/* loaded from: classes6.dex */
public final class cpk0 implements apk0 {
    public final bpk0 b;
    public final VkCheckoutPayMethod c;
    public final String d;
    public final String e;
    public final gbv0 f;
    public io.reactivex.rxjava3.disposables.c g;
    public io.reactivex.rxjava3.disposables.c h;

    /* compiled from: StandaloneLoaderPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionStatusResponse.VkCheckoutTransactionStatus.values().length];
            try {
                iArr[TransactionStatusResponse.VkCheckoutTransactionStatus.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionStatusResponse.VkCheckoutTransactionStatus.ENROLLED_3DS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionStatusResponse.VkCheckoutTransactionStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: StandaloneLoaderPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ajp0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ajp0 ajp0Var) {
            String str;
            String string;
            Context mo2getContext;
            ajp0 ajp0Var2 = ajp0Var;
            cpk0 cpk0Var = (cpk0) this.receiver;
            bpk0 bpk0Var = cpk0Var.b;
            gbv0 gbv0Var = cpk0Var.f;
            String str2 = cpk0Var.e;
            int i = a.$EnumSwitchMapping$0[ajp0Var2.c.ordinal()];
            int i2 = 2;
            if (i == 1) {
                sdi.f.getClass();
                VkTransactionInfo.Currency currency = a8c.b().d;
                sdi.f.getClass();
                int i3 = a8c.b().b;
                String str3 = sua.i(i3, ',') + (char) 8201 + currency.h();
                Context mo2getContext2 = bpk0Var.mo2getContext();
                String str4 = "";
                if (mo2getContext2 == null || (str = mo2getContext2.getString(R.string.vk_pay_checkout_success_title)) == null) {
                    str = "";
                }
                StatusActionStyle statusActionStyle = StatusActionStyle.PRIMARY;
                Context mo2getContext3 = bpk0Var.mo2getContext();
                if (mo2getContext3 != null && (string = mo2getContext3.getString(R.string.vk_pay_checkout_transaction_done)) != null) {
                    str4 = string;
                }
                kku0.a.a(gbv0Var, new Status(new SuccessState(str3, str), new ButtonAction(statusActionStyle, str4, new pkd0(4))));
                cpk0Var.h = io.reactivex.rxjava3.core.q.B0(2L, TimeUnit.SECONDS).subscribe(new ca10(new b8j0(cpk0Var, i2), 22));
            } else if (i == 2) {
                io.reactivex.rxjava3.disposables.c cVar = cpk0Var.g;
                if (cVar != null) {
                    cVar.dispose();
                }
                PaymentData3DS paymentData3DS = new PaymentData3DS(cpk0Var.d, cpk0Var.c, null);
                String str5 = ajp0Var2.d;
                xou0 xou0Var = ajp0Var2.e;
                if (xou0Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                gbv0Var.h(PaymentData3DS.i(paymentData3DS, new PostData3DS(str5, new PostParams3DS(xou0Var.a, xou0Var.b, xou0Var.c))), str2);
                s3q0 s3q0Var = s3q0.a;
            } else if (i == 3 && (mo2getContext = bpk0Var.mo2getContext()) != null) {
                kku0.a.a(gbv0Var, new Status(new ErrorState(mo2getContext.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext.getString(R.string.vk_pay_checkout_something_wrong_hint)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext.getString(R.string.vk_pay_checkout_failed_try_again), new re40(str2, 24))));
            }
            return s3q0.a;
        }
    }

    /* compiled from: StandaloneLoaderPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((cpk0) this.receiver).getClass();
            bbv0.g.getClass();
            bbv0.a.c(th);
            return s3q0.a;
        }
    }

    public cpk0(bpk0 bpk0Var, VkCheckoutPayMethod vkCheckoutPayMethod, String str, String str2) {
        bbv0.g.getClass();
        gbv0 gbv0Var = bbv0.a.f().d;
        this.b = bpk0Var;
        this.c = vkCheckoutPayMethod;
        this.d = str;
        this.e = str2;
        this.f = gbv0Var;
    }

    @Override // xsna.fm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.apk0
    public final void d4() {
        this.g = atv0.s(this.c, this.d).subscribe(new tts(new b(1, this, cpk0.class, "handleTransactionStatusResponse", "handleTransactionStatusResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/TransactionStatus;)V", 0), 28), new fv70(new c(1, this, cpk0.class, "handleTransactionStatusFailed", "handleTransactionStatusFailed(Ljava/lang/Throwable;)V", 0), 15));
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.g;
        if (cVar2 != null) {
            cVar2.dispose();
        }
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

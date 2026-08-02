package xsna;

import android.content.Intent;
import com.vk.superapp.bridges.dto.GooglePayMerchantInfo;
import com.vk.superapp.bridges.dto.GooglePayTransactionRequest;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkMerchantInfo;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import com.vk.superapp.vkpay.checkout.feature.confirmation.googlepay.GooglePayInternalActivity;
import xsna.bbv0;

/* compiled from: GooglePayConfirmationPresenter.kt */
/* loaded from: classes6.dex */
public final class w9u extends qr90<GooglePay, kku0> {
    public final v9u i;
    public final kku0 j;
    public final a8c k;
    public final io.reactivex.rxjava3.disposables.b l;

    /* compiled from: GooglePayConfirmationPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkCheckoutResponse.VkCheckoutResponseStatus.values().length];
            try {
                iArr[VkCheckoutResponse.VkCheckoutResponseStatus.ERR_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w9u(v9u v9uVar, GooglePay googlePay, kku0 kku0Var) {
        super(v9uVar, googlePay, r0, kku0Var);
        a8c a8cVar = sdi.f;
        this.i = v9uVar;
        this.j = kku0Var;
        this.k = a8cVar;
        this.l = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.or90
    public final void S1() {
        this.k.getClass();
        int i = a8c.b().b;
        this.l.b(ysg0.b.a.b0(cau.class).subscribe(new defpackage.x(new mf8(1, this, w9u.class, "handleGooglePayTransactionEvent", "handleGooglePayTransactionEvent(Lcom/vk/superapp/vkpay/checkout/feature/confirmation/googlepay/GooglePayTransactionEvent;)V", 0, 7), 27), new xz(new pf8(xgx0.a, 6), 24)));
        VkMerchantInfo vkMerchantInfo = a8c.a().b;
        GooglePayTransactionRequest googlePayTransactionRequest = new GooglePayTransactionRequest(i, new GooglePayMerchantInfo(vkMerchantInfo.b, vkMerchantInfo.e));
        v9u v9uVar = this.i;
        v9uVar.getClass();
        v9uVar.startActivity(new Intent(v9uVar.requireContext(), (Class<?>) GooglePayInternalActivity.class).putExtra("google_pay_transaction_request", googlePayTransactionRequest));
    }

    @Override // xsna.qr90
    public final nsa a(boolean z) {
        bbv0.g.getClass();
        return super.a(bbv0.a.f().b.l);
    }

    @Override // xsna.qr90
    public final hfz i() {
        return t9u.b;
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.l.e();
    }
}

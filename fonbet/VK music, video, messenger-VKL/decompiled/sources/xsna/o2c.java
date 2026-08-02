package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;

/* compiled from: Checkout3dsPaymentPresenter.kt */
/* loaded from: classes6.dex */
public final class o2c implements k2c {
    public final n2c b;
    public final String c;
    public final kku0 d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: Checkout3dsPaymentPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionStatusResponse.VkCheckoutTransactionStatus.values().length];
            try {
                iArr[TransactionStatusResponse.VkCheckoutTransactionStatus.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o2c(n2c n2cVar, String str, kku0 kku0Var) {
        this.b = n2cVar;
        this.c = str;
        this.d = kku0Var;
    }

    @Override // xsna.k2c
    public final void I1(VkCheckoutPayMethod vkCheckoutPayMethod, String str) {
        this.e.b(atv0.s(vkCheckoutPayMethod, str).U(new nu0(p2c.b, 7)).subscribe(new cz(new q2c(1, this, o2c.class, "handleTransactionStatus", "handleTransactionStatus(Lcom/vk/superapp/vkpay/checkout/api/dto/response/TransactionStatusResponse$VkCheckoutTransactionStatus;)V", 0), 14), new io1(new i37(1, this, o2c.class, "handleTransactionCheckError", "handleTransactionCheckError(Ljava/lang/Throwable;)V", 0, 3), 15)));
    }

    @Override // xsna.fm6
    public final boolean a0() {
        this.d.j(this.c);
        return false;
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.e.e();
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

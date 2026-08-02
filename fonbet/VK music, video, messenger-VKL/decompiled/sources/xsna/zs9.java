package xsna;

import android.content.Context;
import android.widget.Toast;
import com.vk.log.L;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.ErrorState;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vk.superapp.vkpay.checkout.feature.success.states.SuccessState;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kku0;

/* compiled from: CardConfirmationPresenter.kt */
/* loaded from: classes6.dex */
public final class zs9 extends qr90<Card, kku0> implements xs9 {
    public final ys9 i;
    public final Card j;
    public final a8c k;
    public final kku0 l;
    public final io.reactivex.rxjava3.disposables.b m;

    /* compiled from: CardConfirmationPresenter.kt */
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

    /* compiled from: CardConfirmationPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<tr90, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(tr90 tr90Var) {
            String str;
            String string;
            tr90 tr90Var2 = tr90Var;
            zs9 zs9Var = (zs9) this.receiver;
            kku0 kku0Var = zs9Var.l;
            ys9 ys9Var = zs9Var.i;
            if (!tr90Var2.b()) {
                Toast.makeText(ys9Var.mo2getContext(), tr90Var2.b.name(), 0).show();
            } else if (a.$EnumSwitchMapping$0[tr90Var2.c.ordinal()] == 1) {
                zs9Var.k.getClass();
                int i = a8c.b().b;
                String str2 = sua.i(i, ',') + (char) 8201 + a8c.b().d.h();
                Context mo2getContext = ys9Var.mo2getContext();
                String str3 = "";
                if (mo2getContext == null || (str = mo2getContext.getString(R.string.vk_pay_checkout_success_title)) == null) {
                    str = "";
                }
                StatusActionStyle statusActionStyle = StatusActionStyle.PRIMARY;
                Context mo2getContext2 = ys9Var.mo2getContext();
                if (mo2getContext2 != null && (string = mo2getContext2.getString(R.string.vk_pay_checkout_transaction_done)) != null) {
                    str3 = string;
                }
                kku0.a.a(kku0Var, new Status(new SuccessState(str2, str), new ButtonAction(statusActionStyle, str3, new gu0(2))));
                zs9Var.m.b(io.reactivex.rxjava3.core.q.B0(2L, TimeUnit.SECONDS).subscribe(new cz(new com.vk.movika.sdk.base.observable.e(zs9Var, 16), 8)));
            } else {
                kku0Var.d(tr90Var2.e, tr90Var2.d, "ys9");
            }
            return s3q0.a;
        }
    }

    /* compiled from: CardConfirmationPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            zs9 zs9Var = (zs9) this.receiver;
            zs9Var.getClass();
            L.i(th);
            Context mo2getContext = zs9Var.i.mo2getContext();
            if (mo2getContext != null) {
                x84 x84Var = new x84(2);
                kku0.a.a(zs9Var.l, new Status(new ErrorState(mo2getContext.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext.getString(R.string.vk_pay_checkout_something_wrong_hint)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext.getString(R.string.vk_pay_checkout_failed_try_again), x84Var)));
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zs9(ys9 ys9Var, Card card, kku0 kku0Var) {
        super(ys9Var, card, r0, kku0Var);
        a8c a8cVar = sdi.f;
        this.i = ys9Var;
        this.j = card;
        this.k = a8cVar;
        this.l = kku0Var;
        this.m = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.or90
    public final void S1() {
        String id = this.j.getId();
        a8c a8cVar = this.k;
        int i = 7;
        this.m.b(new io.reactivex.rxjava3.internal.operators.single.m(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.h(a8c.e(a8c.d(a8cVar.a.c(id))), new p41(new qm1(a8cVar, 22), 10)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new fu0(new fb(this, 12), i)), new b8(new com.vk.movika.tools.controls.seekbar.l(this, 3), i)).subscribe(new ov2(new b(1, this, zs9.class, "handlePayByCardResponse", "handlePayByCardResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/PayOperation;)V", 0), 4), new xf1(new c(1, this, zs9.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0), 7)));
    }

    @Override // xsna.qr90, xsna.fm6
    public final boolean a0() {
        return true;
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.m.e();
    }
}

package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkOrderDescription;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model.Card;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.JustWallet;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.NewCard;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.WalletPayMethod;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.WithCard;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.CustomState;
import com.vk.superapp.vkpay.checkout.feature.success.states.ErrorState;
import com.vk.superapp.vkpay.checkout.feature.success.states.Icon;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PaymentData3DS;
import com.vk.superapp.vkpay.checkout.feature.verification.biometric.core.BiometricProcessor$AuthMode;
import com.vkontakte.android.R;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import xsna.bbv0;
import xsna.e57;
import xsna.kku0;
import xsna.m57;
import xsna.zr90;

/* compiled from: PayVerificationPresenter.kt */
/* loaded from: classes6.dex */
public final class cs90<T extends zr90> extends ek6 implements yr90 {
    public final as90 e;
    public final WalletPayMethod f;
    public final a8c g;
    public final VkPayCheckoutConfig h;
    public final kku0 i;
    public final io.reactivex.rxjava3.disposables.b j;
    public l57 k;
    public final bbv0 l;

    /* compiled from: PayVerificationPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[VkCheckoutResponse.VkCheckoutResponseStatus.values().length];
            try {
                iArr2[VkCheckoutResponse.VkCheckoutResponseStatus.ERR_PWD_BANNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkCheckoutResponse.VkCheckoutResponseStatus.ERR_PAYER_PWD_BANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkCheckoutResponse.VkCheckoutResponseStatus.ERR_WRONG_PIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VkCheckoutResponse.VkCheckoutResponseStatus.ERR_WRONG_PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VkCheckoutResponse.VkCheckoutResponseStatus.ERR_NO_MONEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VkCheckoutResponse.VkCheckoutResponseStatus.ERR_LIMIT_PAYER.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VkCheckoutResponse.VkCheckoutResponseStatus.ERR_SYSTEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public cs90() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cs90(as90 as90Var, WalletPayMethod walletPayMethod, kku0 kku0Var) {
        super(as90Var, r2.i);
        a8c a8cVar = sdi.f;
        bbv0.a aVar = bbv0.g;
        aVar.getClass();
        VkPayCheckoutConfig vkPayCheckoutConfig = bbv0.a.f().b;
        this.e = as90Var;
        this.f = walletPayMethod;
        this.g = a8cVar;
        this.h = vkPayCheckoutConfig;
        this.i = kku0Var;
        this.j = new io.reactivex.rxjava3.disposables.b();
        aVar.getClass();
        this.l = bbv0.a.f();
    }

    public static final void f(cs90 cs90Var, Throwable th) {
        cs90Var.getClass();
        bbv0.g.getClass();
        bbv0.a.c(th);
        cs90Var.e.un();
        cs90Var.a();
        cs90Var.j();
    }

    public static final void h(cs90 cs90Var, tr90 tr90Var) {
        as90 as90Var = cs90Var.e;
        if (tr90Var.b()) {
            if (tr90Var.c != TransactionStatusResponse.VkCheckoutTransactionStatus.DONE) {
                String str = tr90Var.d;
                VkCheckoutPayMethod vkCheckoutPayMethod = tr90Var.e;
                PaymentData3DS paymentData3DS = new PaymentData3DS(str, vkCheckoutPayMethod, null);
                as90Var.vn();
                cs90Var.j.b(atv0.s(vkCheckoutPayMethod, str).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jsv(new ll1(18, cs90Var, paymentData3DS), 12), new w250(new a2a(1, cs90Var, cs90.class, "handleCheckTransactionStatusFailed", "handleCheckTransactionStatusFailed(Ljava/lang/Throwable;)V", 0, 11), 7)));
                return;
            }
            as90Var.un();
            hk70 hk70Var = new hk70(cs90Var, 3);
            l57 l57Var = cs90Var.k;
            if (l57Var == null) {
                hk70Var.invoke();
                return;
            }
            String sb = cs90Var.d.toString();
            m57 m57Var = l57Var.i;
            Context mo2getContext = l57Var.c.mo2getContext();
            if (!gz80.a(23) || mo2getContext == null) {
                hk70Var.invoke();
                return;
            }
            m57Var.getClass();
            boolean z = c57.c(mo2getContext).a(255) == 0;
            bbv0.g.getClass();
            VkPayCheckoutConfig vkPayCheckoutConfig = bbv0.a.f().b;
            if (vkPayCheckoutConfig == null) {
                throw new IllegalStateException("Config must not be null");
            }
            UserId userId = vkPayCheckoutConfig.c.getUserId();
            boolean contains = Preference.g(mo2getContext).contains("VK_PAY_CHECKOUT_VKPAY_TOKEN/" + userId.b);
            if (!z || contains) {
                hk70Var.invoke();
                return;
            } else {
                if (!z || contains) {
                    return;
                }
                k57 k57Var = new k57(l57Var, sb, hk70Var);
                Context context = l57Var.f;
                m57Var.b(l57Var.b, k57Var, new o47(context.getString(R.string.vk_pay_checkout_biometric_create_token_dialog_title), context.getString(R.string.vk_pay_checkout_biometric_create_token_dialog_subtitle), context.getString(R.string.vk_pay_checkout_biometric_create_token_dialog_negative_button)), BiometricProcessor$AuthMode.ENCRYPTION);
                return;
            }
        }
        as90Var.un();
        kku0 kku0Var = cs90Var.i;
        cs90Var.a();
        switch (a.$EnumSwitchMapping$1[tr90Var.b.ordinal()]) {
            case 1:
            case 2:
                bbv0.g.getClass();
                shn0 shn0Var = bbv0.a.f().e;
                shn0Var.a.a(tr90Var);
                shn0Var.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.ACCESS_BLOCKED);
                shn0Var.a.a(null);
                Context mo2getContext2 = as90Var.mo2getContext();
                if (mo2getContext2 == null) {
                    return;
                }
                kku0Var.f(new Status(new CustomState(new Icon(R.drawable.vk_icon_do_not_disturb_outline_56, R.attr.vk_legacy_icon_secondary), mo2getContext2.getString(R.string.vk_pay_checkout_vkpay_access_denied), mo2getContext2.getString(R.string.vk_pay_checkout_restore_access_to_make_payment)), new ButtonAction(StatusActionStyle.TERTIARY, mo2getContext2.getString(R.string.vk_pay_checkout_restore), new com.vk.movika.sdk.base.model.props.a(20))), new bs90());
                return;
            case 3:
            case 4:
                int i = tr90Var.f;
                VkPayCheckoutConfig vkPayCheckoutConfig2 = cs90Var.h;
                vkPayCheckoutConfig2.i.b = true;
                cs90Var.a();
                as90Var.un();
                as90Var.Ob();
                as90Var.Nm();
                vkPayCheckoutConfig2.i.c = Integer.valueOf(i);
                return;
            case 5:
                Context mo2getContext3 = as90Var.mo2getContext();
                if (mo2getContext3 == null) {
                    return;
                }
                kku0.a.a(kku0Var, new Status(new CustomState(new Icon(R.drawable.vk_icon_error_outline_56, -1), mo2getContext3.getString(R.string.vk_pay_checkout_loader_insufficient_money_title), mo2getContext3.getString(R.string.vk_pay_checkout_unable_to_replenish_balance)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext3.getString(R.string.vk_pay_checkout_failed_try_again), new d4(28))));
                return;
            case 6:
                Context mo2getContext4 = as90Var.mo2getContext();
                if (mo2getContext4 == null) {
                    return;
                }
                kku0.a.a(kku0Var, new Status(new ErrorState(mo2getContext4.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext4.getString(R.string.vk_pay_checkout_exceeded_limit_payer)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext4.getString(R.string.vk_pay_checkout_failed_try_again), new i21(26))));
                return;
            case 7:
                Context mo2getContext5 = as90Var.mo2getContext();
                if (mo2getContext5 == null) {
                    return;
                }
                kku0.a.a(kku0Var, new Status(new ErrorState(mo2getContext5.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext5.getString(R.string.vk_pay_checkout_system_error_occured)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext5.getString(R.string.vk_pay_checkout_failed_try_again), new kr6(17))));
                return;
            default:
                cs90Var.j();
                return;
        }
    }

    @Override // xsna.yr90
    public final void D() {
        bbv0.g.getClass();
        bbv0.a.f().e.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.ACCESS_RESTORE);
        this.i.g();
    }

    @Override // xsna.fm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.ek6
    public final void c() {
        String sb = this.d.toString();
        as90 as90Var = this.e;
        as90Var.gd();
        as90Var.vn();
        int i = 0;
        this.j.b(i(new ecv0(sb)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f5y(new xv2(1, this, cs90.class, "handlePayOperationResponse", "handlePayOperationResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/PayOperation;)V", i, 13), 13), new cc20(new q69(1, this, cs90.class, "handleCheckTransactionStatusFailed", "handleCheckTransactionStatusFailed(Ljava/lang/Throwable;)V", i, 10), 13)));
    }

    @Override // xsna.fm6
    public final void d() {
        bbv0.g.getClass();
        VkOrderDescription vkOrderDescription = bbv0.a.f().b.e.c;
        as90 as90Var = this.e;
        as90Var.b8(vkOrderDescription);
        VkTransactionInfo vkTransactionInfo = this.l.a;
        int i = vkTransactionInfo.b;
        as90Var.Uj(sua.i(i, ',') + (char) 8201 + vkTransactionInfo.d.h());
    }

    @Override // xsna.ek6
    public final void e() {
        super.e();
        Integer num = this.h.i.c;
        as90 as90Var = this.e;
        if (num == null || num.intValue() <= 0) {
            as90Var.lm();
        } else {
            as90Var.pf(num.intValue());
        }
    }

    public final io.reactivex.rxjava3.internal.operators.single.o i(de deVar) {
        io.reactivex.rxjava3.internal.operators.single.h hVar;
        WalletPayMethod walletPayMethod = this.f;
        boolean z = walletPayMethod instanceof JustWallet;
        a8c a8cVar = this.g;
        if (z) {
            hVar = new io.reactivex.rxjava3.internal.operators.single.h(a8c.e(a8c.d(a8cVar.a.a(deVar))), new f40(new sz(a8cVar, 15), 8));
        } else if (walletPayMethod instanceof WithCard) {
            WithCard withCard = (WithCard) walletPayMethod;
            hVar = new io.reactivex.rxjava3.internal.operators.single.h(a8c.e(a8c.d(a8cVar.a.j(new gcv0(deVar, withCard.g(), withCard.d())))), new t00(new t40(a8cVar, 15), 12));
        } else {
            if (!(walletPayMethod instanceof NewCard)) {
                throw new NoWhenBranchMatchedException();
            }
            NewCard newCard = (NewCard) walletPayMethod;
            Card d = newCard.d();
            hVar = new io.reactivex.rxjava3.internal.operators.single.h(a8c.e(a8c.d(a8cVar.a.i(new hcv0(deVar, newCard.g(), new jwu0(d.i().d(), d.j().toString(), d.k().d(), false))))), new xn(new p1(a8cVar, 25), 9));
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(hVar, new ux00(new qey(this, 21), 9));
    }

    public final void j() {
        Context mo2getContext = this.e.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        mg mgVar = new mg(21);
        kku0.a.a(this.i, new Status(new ErrorState(mo2getContext.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext.getString(R.string.vk_pay_checkout_something_wrong_hint)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext.getString(R.string.vk_pay_checkout_failed_try_again), mgVar)));
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.j.e();
        l57 l57Var = this.k;
        if (l57Var != null) {
            l57Var.onDestroyView();
        }
    }

    @Override // xsna.yr90
    public final void u0(Fragment fragment) {
        b bVar = new b(this);
        l57 l57Var = this.k;
        if (l57Var != null) {
            Context context = l57Var.f;
            l57Var.i.b(fragment, bVar, new o47(context.getString(R.string.vk_pay_checkout_biometric_pay_dialog_title), context.getString(R.string.vk_pay_checkout_biometric_pay_dialog_subtitle), context.getString(R.string.vk_pay_checkout_biometric_pay_dialog_negative_button)), BiometricProcessor$AuthMode.DECRYPTION);
        }
    }

    /* compiled from: PayVerificationPresenter.kt */
    public static final class b implements d57<e57.c, Object> {
        public final /* synthetic */ cs90<T> a;

        public b(cs90<T> cs90Var) {
            this.a = cs90Var;
        }

        @Override // xsna.d57
        public final void b(m57.a aVar) {
            cs90<T> cs90Var = this.a;
            l57 l57Var = cs90Var.k;
            if (l57Var != null) {
                Cipher cipher = aVar.a.a.b;
                if (cipher == null) {
                    throw new IllegalStateException("Cipher must be not null");
                }
                d2p0 d2p0Var = l57Var.g;
                d2p0Var.getClass();
                int i = 3;
                new io.reactivex.rxjava3.internal.operators.single.v(new vyt(d2p0Var, i)).q(new io.reactivex.rxjava3.internal.schedulers.f()).l(new com.vk.movika.sdk.base.hooks.k(new com.vk.movika.sdk.base.logic.interactor.f(i), 4)).l(new mj1(new fo6(1, l57Var, cipher), 2)).l(new e05(new f57(0), 2)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wx00(new ds90(1, cs90Var, cs90.class, "handleBiometricToken", "handleBiometricToken(Ljava/lang/String;)V", 0), 8), new m5y(new es90(1, cs90Var, cs90.class, "handleEncodeTokenFailed", "handleEncodeTokenFailed(Ljava/lang/Throwable;)V", 0), 13));
            }
        }

        @Override // xsna.d57
        public final void a() {
        }
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

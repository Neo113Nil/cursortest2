package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.yandex.payment.sdk.core.data.OrderInfo;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.xplat.payment.sdk.ApiMethodNameForAnalytics;
import defpackage.ba20;
import defpackage.hcx;
import defpackage.jqr;
import defpackage.k3a0;
import defpackage.ksi0;
import defpackage.o3a0;
import defpackage.pzt0;
import defpackage.zy11;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlinx.coroutines.a;
import kotlinx.coroutines.flow.e;
import ru.yandex.tankerapp.domain.error.PaymentKitPluginError;
import ru.yandex.tankerapp.models.dto.PaymentKitArguments;
import ru.yandex.tankerapp.models.dto.PaymentKitChallenge;
import ru.yandex.tankerapp.models.dto.PaymentKitContinuePayment;
import ru.yandex.tankerapp.models.dto.PaymentKitSelectAndPay;
import ru.yandex.tankerapp.sdk.b;

/* loaded from: classes5.dex */
public final class h8x0 implements tsr, ca20, r30 {
    public ea20 a;
    public afo b;
    public b c;

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        b bVar = this.c;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d(l40Var);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        csa0 csa0Var = new csa0();
        this.c = new b(ssrVar.a, csa0Var);
        tt5 tt5Var = ssrVar.c;
        ea20 ea20Var = new ea20(tt5Var, "tanker_flutter/native_payment");
        ea20Var.b(this);
        this.a = ea20Var;
        afo afoVar = new afo(tt5Var, "tanker_flutter/native_payment/preselect_payment_method");
        afoVar.a(csa0Var);
        this.b = afoVar;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        b bVar = this.c;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d(null);
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        b bVar = this.c;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d(null);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
        afo afoVar = this.b;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(null);
        b bVar = this.c;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d(null);
        b bVar2 = this.c;
        if (bVar2 == null) {
            bVar2 = null;
        }
        a.g(bVar2.c.a.a, null);
        bVar2.D = null;
        bVar2.A = false;
        bVar2.d(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        final Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            final int i = 1;
            int i2 = 15;
            switch (str.hashCode()) {
                case -1129604540:
                    if (str.equals("present_sbp_payment")) {
                        b bVar = this.c;
                        final b bVar2 = bVar != null ? bVar : null;
                        bVar2.getClass();
                        final ba20 ba20Var = (ba20) da20Var;
                        final int i3 = 2;
                        bVar2.b(ba20Var, new tls() { // from class: j3a0
                            /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
                            /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
                            /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
                            /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
                            @Override // defpackage.tls
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj2) {
                                Result.Failure failure;
                                Object obj3;
                                Result.Failure failure2;
                                Object obj4;
                                Activity activity;
                                Result.Failure failure3;
                                Object obj5;
                                Object failure4;
                                PaymentMethod paymentMethod;
                                int i4 = i3;
                                zy11 zy11Var = zy11.a;
                                ba20 ba20Var2 = ba20Var;
                                Object obj6 = obj;
                                b bVar3 = bVar2;
                                ksi0 ksi0Var = (ksi0) obj2;
                                switch (i4) {
                                    case 0:
                                        bVar3.x.getClass();
                                        Object a = k3a0.a(obj6);
                                        if (a instanceof Result.Failure) {
                                            a = null;
                                        }
                                        String str2 = (String) a;
                                        if (str2 != null) {
                                            try {
                                                obj3 = (PaymentKitChallenge) hcx.a().c(PaymentKitChallenge.class, str2);
                                            } catch (Throwable th) {
                                                failure = new Result.Failure(th);
                                            }
                                            if (!(obj3 instanceof Result.Failure)) {
                                                bVar3.e(ksi0Var.e(new PaymentToken(((PaymentKitChallenge) obj3).getIntentId()), PaymentMethod.ChallengePollingMethod.INSTANCE), 1006, ba20Var2);
                                            }
                                            if (Result.a(obj3) != null) {
                                                PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError = PaymentKitPluginError.InvalidArgumentsError.a;
                                                ba20Var2.error(invalidArgumentsError.getCode(), invalidArgumentsError.getMessage(), null);
                                            }
                                            return zy11Var;
                                        }
                                        failure = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                        obj3 = failure;
                                        if (!(obj3 instanceof Result.Failure)) {
                                        }
                                        if (Result.a(obj3) != null) {
                                        }
                                        return zy11Var;
                                    case 1:
                                        bVar3.x.getClass();
                                        Object a2 = k3a0.a(obj6);
                                        if (a2 instanceof Result.Failure) {
                                            a2 = null;
                                        }
                                        String str3 = (String) a2;
                                        if (str3 != null) {
                                            try {
                                                obj4 = (PaymentKitContinuePayment) hcx.a().c(PaymentKitContinuePayment.class, str3);
                                            } catch (Throwable th2) {
                                                failure2 = new Result.Failure(th2);
                                            }
                                            if (!(obj4 instanceof Result.Failure)) {
                                                PaymentKitContinuePayment paymentKitContinuePayment = (PaymentKitContinuePayment) obj4;
                                                l40 l40Var = bVar3.C;
                                                if (l40Var == null || (activity = (Activity) ((wrr) l40Var).b) == null) {
                                                    PaymentKitPluginError.NoActivityError noActivityError = PaymentKitPluginError.NoActivityError.a;
                                                    ba20Var2.error(noActivityError.getCode(), noActivityError.getMessage(), null);
                                                } else {
                                                    activity.startActivity(ksi0Var.d(new PaymentToken(paymentKitContinuePayment.getTrustPurchaseToken()), new OrderInfo(paymentKitContinuePayment.getOrderId(), null)));
                                                    ba20Var2.success(null);
                                                }
                                            }
                                            if (Result.a(obj4) != null) {
                                                PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError2 = PaymentKitPluginError.InvalidArgumentsError.a;
                                                ba20Var2.error(invalidArgumentsError2.getCode(), invalidArgumentsError2.getMessage(), null);
                                            }
                                            return zy11Var;
                                        }
                                        failure2 = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                        obj4 = failure2;
                                        if (!(obj4 instanceof Result.Failure)) {
                                        }
                                        if (Result.a(obj4) != null) {
                                        }
                                        return zy11Var;
                                    default:
                                        bVar3.x.getClass();
                                        Object a3 = k3a0.a(obj6);
                                        if (a3 instanceof Result.Failure) {
                                            a3 = null;
                                        }
                                        String str4 = (String) a3;
                                        if (str4 != null) {
                                            try {
                                                obj5 = (PaymentKitArguments) hcx.a().c(PaymentKitArguments.class, str4);
                                            } catch (Throwable th3) {
                                                failure3 = new Result.Failure(th3);
                                            }
                                            if (!(obj5 instanceof Result.Failure)) {
                                                PaymentKitArguments paymentKitArguments = (PaymentKitArguments) obj5;
                                                try {
                                                    PaymentKitArguments.PaymentOption paymentOption = paymentKitArguments.getPaymentOption();
                                                    if (paymentOption != null) {
                                                        int i5 = l3a0.b[paymentOption.ordinal()];
                                                        if (i5 == 1) {
                                                            paymentMethod = PaymentMethod.Sbp.INSTANCE;
                                                        } else {
                                                            if (i5 != 2) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            paymentMethod = PaymentMethod.NewSbpToken.INSTANCE;
                                                        }
                                                    } else {
                                                        paymentMethod = null;
                                                    }
                                                    bVar3.e(ksi0Var.e(new PaymentToken(paymentKitArguments.getTrustId()), paymentMethod), 1001, ba20Var2);
                                                    failure4 = zy11Var;
                                                } catch (Throwable th4) {
                                                    failure4 = new Result.Failure(th4);
                                                }
                                                if (Result.a(failure4) != null) {
                                                    PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError3 = PaymentKitPluginError.InvalidArgumentsError.a;
                                                    ba20Var2.error(invalidArgumentsError3.getCode(), invalidArgumentsError3.getMessage(), null);
                                                }
                                            }
                                            if (Result.a(obj5) != null) {
                                                PaymentKitPluginError.ParseArgumentsError parseArgumentsError = PaymentKitPluginError.ParseArgumentsError.a;
                                                ba20Var2.error(parseArgumentsError.getCode(), parseArgumentsError.getMessage(), null);
                                            }
                                            return zy11Var;
                                        }
                                        failure3 = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                        obj5 = failure3;
                                        if (!(obj5 instanceof Result.Failure)) {
                                        }
                                        if (Result.a(obj5) != null) {
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                        return;
                    }
                    break;
                case -995780549:
                    if (str.equals("present_select_controller")) {
                        b bVar3 = this.c;
                        if (bVar3 == null) {
                            bVar3 = null;
                        }
                        bVar3.getClass();
                        ba20 ba20Var2 = (ba20) da20Var;
                        ksi0 ksi0Var = bVar3.z;
                        if (ksi0Var == null) {
                            hay.e(ba20Var2, PaymentKitPluginError.UninitializedError.a);
                            return;
                        }
                        Intent putExtra = ksi0Var.a(true, PreselectActivity.class).putExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, true).putExtra(BaseActivity.EXTRA_DEFAULT_PAYMENT_METHOD, (String) null);
                        sv90 sv90Var = qv90.a;
                        ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.SELECT;
                        sv90Var.getClass();
                        ksi0Var.i(new mrj(i2, apiMethodNameForAnalytics));
                        bVar3.e(putExtra, 1005, ba20Var2);
                        return;
                    }
                    break;
                case -899417766:
                    if (str.equals("present_card_binding")) {
                        b bVar4 = this.c;
                        b bVar5 = bVar4 != null ? bVar4 : null;
                        bVar5.getClass();
                        ba20 ba20Var3 = (ba20) da20Var;
                        ksi0 ksi0Var2 = bVar5.z;
                        if (ksi0Var2 != null) {
                            bVar5.e(ksi0Var2.c(), 1003, ba20Var3);
                            return;
                        } else {
                            hay.e(ba20Var3, PaymentKitPluginError.UninitializedError.a);
                            return;
                        }
                    }
                    break;
                case -656351078:
                    if (str.equals("present_select_and_pay_controller")) {
                        b bVar6 = this.c;
                        final b bVar7 = bVar6 != null ? bVar6 : null;
                        bVar7.getClass();
                        final ba20 ba20Var4 = (ba20) da20Var;
                        bVar7.b(ba20Var4, new tls() { // from class: ru.yandex.tankerapp.sdk.a
                            /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
                            /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
                            @Override // defpackage.tls
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj2) {
                                Result.Failure failure;
                                Object obj3;
                                boolean z;
                                ksi0 ksi0Var3 = (ksi0) obj2;
                                b bVar8 = b.this;
                                bVar8.x.getClass();
                                Object a = k3a0.a(obj);
                                if (a instanceof Result.Failure) {
                                    a = null;
                                }
                                String str2 = (String) a;
                                if (str2 != null) {
                                    try {
                                        obj3 = (PaymentKitSelectAndPay) hcx.a().c(PaymentKitSelectAndPay.class, str2);
                                    } catch (Throwable th) {
                                        failure = new Result.Failure(th);
                                    }
                                    z = obj3 instanceof Result.Failure;
                                    ba20 ba20Var5 = ba20Var4;
                                    if (!z) {
                                        bVar8.e(ksi0Var3.f(PreselectActivity.class, ((PaymentKitSelectAndPay) obj3).getPreferredPaymentId()), 1004, ba20Var5);
                                        pzt0 pzt0Var = bVar8.B;
                                        if (pzt0Var != null) {
                                            pzt0Var.a(null);
                                        }
                                        bVar8.B = e.H(bVar8.c.a, new jqr(ru.yandex.tankerapp.utils.a.a(o3a0.b), new PaymentKitManagerImpl$observePreselectPaymentMethodFlow$1(bVar8, null), 3));
                                    }
                                    if (Result.a(obj3) != null) {
                                        PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError = PaymentKitPluginError.InvalidArgumentsError.a;
                                        ba20Var5.error(invalidArgumentsError.getCode(), invalidArgumentsError.getMessage(), null);
                                    }
                                    return zy11.a;
                                }
                                failure = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                obj3 = failure;
                                z = obj3 instanceof Result.Failure;
                                ba20 ba20Var52 = ba20Var4;
                                if (!z) {
                                }
                                if (Result.a(obj3) != null) {
                                }
                                return zy11.a;
                            }
                        });
                        return;
                    }
                    break;
                case -209632726:
                    if (str.equals("challenge_payment")) {
                        b bVar8 = this.c;
                        final b bVar9 = bVar8 != null ? bVar8 : null;
                        bVar9.getClass();
                        final ba20 ba20Var5 = (ba20) da20Var;
                        final int i4 = 0;
                        bVar9.b(ba20Var5, new tls() { // from class: j3a0
                            /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
                            /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
                            /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
                            /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
                            @Override // defpackage.tls
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj2) {
                                Result.Failure failure;
                                Object obj3;
                                Result.Failure failure2;
                                Object obj4;
                                Activity activity;
                                Result.Failure failure3;
                                Object obj5;
                                Object failure4;
                                PaymentMethod paymentMethod;
                                int i42 = i4;
                                zy11 zy11Var = zy11.a;
                                ba20 ba20Var22 = ba20Var5;
                                Object obj6 = obj;
                                b bVar32 = bVar9;
                                ksi0 ksi0Var3 = (ksi0) obj2;
                                switch (i42) {
                                    case 0:
                                        bVar32.x.getClass();
                                        Object a = k3a0.a(obj6);
                                        if (a instanceof Result.Failure) {
                                            a = null;
                                        }
                                        String str2 = (String) a;
                                        if (str2 != null) {
                                            try {
                                                obj3 = (PaymentKitChallenge) hcx.a().c(PaymentKitChallenge.class, str2);
                                            } catch (Throwable th) {
                                                failure = new Result.Failure(th);
                                            }
                                            if (!(obj3 instanceof Result.Failure)) {
                                                bVar32.e(ksi0Var3.e(new PaymentToken(((PaymentKitChallenge) obj3).getIntentId()), PaymentMethod.ChallengePollingMethod.INSTANCE), 1006, ba20Var22);
                                            }
                                            if (Result.a(obj3) != null) {
                                                PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError = PaymentKitPluginError.InvalidArgumentsError.a;
                                                ba20Var22.error(invalidArgumentsError.getCode(), invalidArgumentsError.getMessage(), null);
                                            }
                                            return zy11Var;
                                        }
                                        failure = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                        obj3 = failure;
                                        if (!(obj3 instanceof Result.Failure)) {
                                        }
                                        if (Result.a(obj3) != null) {
                                        }
                                        return zy11Var;
                                    case 1:
                                        bVar32.x.getClass();
                                        Object a2 = k3a0.a(obj6);
                                        if (a2 instanceof Result.Failure) {
                                            a2 = null;
                                        }
                                        String str3 = (String) a2;
                                        if (str3 != null) {
                                            try {
                                                obj4 = (PaymentKitContinuePayment) hcx.a().c(PaymentKitContinuePayment.class, str3);
                                            } catch (Throwable th2) {
                                                failure2 = new Result.Failure(th2);
                                            }
                                            if (!(obj4 instanceof Result.Failure)) {
                                                PaymentKitContinuePayment paymentKitContinuePayment = (PaymentKitContinuePayment) obj4;
                                                l40 l40Var = bVar32.C;
                                                if (l40Var == null || (activity = (Activity) ((wrr) l40Var).b) == null) {
                                                    PaymentKitPluginError.NoActivityError noActivityError = PaymentKitPluginError.NoActivityError.a;
                                                    ba20Var22.error(noActivityError.getCode(), noActivityError.getMessage(), null);
                                                } else {
                                                    activity.startActivity(ksi0Var3.d(new PaymentToken(paymentKitContinuePayment.getTrustPurchaseToken()), new OrderInfo(paymentKitContinuePayment.getOrderId(), null)));
                                                    ba20Var22.success(null);
                                                }
                                            }
                                            if (Result.a(obj4) != null) {
                                                PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError2 = PaymentKitPluginError.InvalidArgumentsError.a;
                                                ba20Var22.error(invalidArgumentsError2.getCode(), invalidArgumentsError2.getMessage(), null);
                                            }
                                            return zy11Var;
                                        }
                                        failure2 = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                        obj4 = failure2;
                                        if (!(obj4 instanceof Result.Failure)) {
                                        }
                                        if (Result.a(obj4) != null) {
                                        }
                                        return zy11Var;
                                    default:
                                        bVar32.x.getClass();
                                        Object a3 = k3a0.a(obj6);
                                        if (a3 instanceof Result.Failure) {
                                            a3 = null;
                                        }
                                        String str4 = (String) a3;
                                        if (str4 != null) {
                                            try {
                                                obj5 = (PaymentKitArguments) hcx.a().c(PaymentKitArguments.class, str4);
                                            } catch (Throwable th3) {
                                                failure3 = new Result.Failure(th3);
                                            }
                                            if (!(obj5 instanceof Result.Failure)) {
                                                PaymentKitArguments paymentKitArguments = (PaymentKitArguments) obj5;
                                                try {
                                                    PaymentKitArguments.PaymentOption paymentOption = paymentKitArguments.getPaymentOption();
                                                    if (paymentOption != null) {
                                                        int i5 = l3a0.b[paymentOption.ordinal()];
                                                        if (i5 == 1) {
                                                            paymentMethod = PaymentMethod.Sbp.INSTANCE;
                                                        } else {
                                                            if (i5 != 2) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            paymentMethod = PaymentMethod.NewSbpToken.INSTANCE;
                                                        }
                                                    } else {
                                                        paymentMethod = null;
                                                    }
                                                    bVar32.e(ksi0Var3.e(new PaymentToken(paymentKitArguments.getTrustId()), paymentMethod), 1001, ba20Var22);
                                                    failure4 = zy11Var;
                                                } catch (Throwable th4) {
                                                    failure4 = new Result.Failure(th4);
                                                }
                                                if (Result.a(failure4) != null) {
                                                    PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError3 = PaymentKitPluginError.InvalidArgumentsError.a;
                                                    ba20Var22.error(invalidArgumentsError3.getCode(), invalidArgumentsError3.getMessage(), null);
                                                }
                                            }
                                            if (Result.a(obj5) != null) {
                                                PaymentKitPluginError.ParseArgumentsError parseArgumentsError = PaymentKitPluginError.ParseArgumentsError.a;
                                                ba20Var22.error(parseArgumentsError.getCode(), parseArgumentsError.getMessage(), null);
                                            }
                                            return zy11Var;
                                        }
                                        failure3 = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                        obj5 = failure3;
                                        if (!(obj5 instanceof Result.Failure)) {
                                        }
                                        if (Result.a(obj5) != null) {
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                        return;
                    }
                    break;
                case -157979026:
                    if (str.equals("continue_payment")) {
                        b bVar10 = this.c;
                        final b bVar11 = bVar10 != null ? bVar10 : null;
                        bVar11.getClass();
                        final ba20 ba20Var6 = (ba20) da20Var;
                        bVar11.b(ba20Var6, new tls() { // from class: j3a0
                            /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
                            /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
                            /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
                            /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
                            @Override // defpackage.tls
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj2) {
                                Result.Failure failure;
                                Object obj3;
                                Result.Failure failure2;
                                Object obj4;
                                Activity activity;
                                Result.Failure failure3;
                                Object obj5;
                                Object failure4;
                                PaymentMethod paymentMethod;
                                int i42 = i;
                                zy11 zy11Var = zy11.a;
                                ba20 ba20Var22 = ba20Var6;
                                Object obj6 = obj;
                                b bVar32 = bVar11;
                                ksi0 ksi0Var3 = (ksi0) obj2;
                                switch (i42) {
                                    case 0:
                                        bVar32.x.getClass();
                                        Object a = k3a0.a(obj6);
                                        if (a instanceof Result.Failure) {
                                            a = null;
                                        }
                                        String str2 = (String) a;
                                        if (str2 != null) {
                                            try {
                                                obj3 = (PaymentKitChallenge) hcx.a().c(PaymentKitChallenge.class, str2);
                                            } catch (Throwable th) {
                                                failure = new Result.Failure(th);
                                            }
                                            if (!(obj3 instanceof Result.Failure)) {
                                                bVar32.e(ksi0Var3.e(new PaymentToken(((PaymentKitChallenge) obj3).getIntentId()), PaymentMethod.ChallengePollingMethod.INSTANCE), 1006, ba20Var22);
                                            }
                                            if (Result.a(obj3) != null) {
                                                PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError = PaymentKitPluginError.InvalidArgumentsError.a;
                                                ba20Var22.error(invalidArgumentsError.getCode(), invalidArgumentsError.getMessage(), null);
                                            }
                                            return zy11Var;
                                        }
                                        failure = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                        obj3 = failure;
                                        if (!(obj3 instanceof Result.Failure)) {
                                        }
                                        if (Result.a(obj3) != null) {
                                        }
                                        return zy11Var;
                                    case 1:
                                        bVar32.x.getClass();
                                        Object a2 = k3a0.a(obj6);
                                        if (a2 instanceof Result.Failure) {
                                            a2 = null;
                                        }
                                        String str3 = (String) a2;
                                        if (str3 != null) {
                                            try {
                                                obj4 = (PaymentKitContinuePayment) hcx.a().c(PaymentKitContinuePayment.class, str3);
                                            } catch (Throwable th2) {
                                                failure2 = new Result.Failure(th2);
                                            }
                                            if (!(obj4 instanceof Result.Failure)) {
                                                PaymentKitContinuePayment paymentKitContinuePayment = (PaymentKitContinuePayment) obj4;
                                                l40 l40Var = bVar32.C;
                                                if (l40Var == null || (activity = (Activity) ((wrr) l40Var).b) == null) {
                                                    PaymentKitPluginError.NoActivityError noActivityError = PaymentKitPluginError.NoActivityError.a;
                                                    ba20Var22.error(noActivityError.getCode(), noActivityError.getMessage(), null);
                                                } else {
                                                    activity.startActivity(ksi0Var3.d(new PaymentToken(paymentKitContinuePayment.getTrustPurchaseToken()), new OrderInfo(paymentKitContinuePayment.getOrderId(), null)));
                                                    ba20Var22.success(null);
                                                }
                                            }
                                            if (Result.a(obj4) != null) {
                                                PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError2 = PaymentKitPluginError.InvalidArgumentsError.a;
                                                ba20Var22.error(invalidArgumentsError2.getCode(), invalidArgumentsError2.getMessage(), null);
                                            }
                                            return zy11Var;
                                        }
                                        failure2 = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                        obj4 = failure2;
                                        if (!(obj4 instanceof Result.Failure)) {
                                        }
                                        if (Result.a(obj4) != null) {
                                        }
                                        return zy11Var;
                                    default:
                                        bVar32.x.getClass();
                                        Object a3 = k3a0.a(obj6);
                                        if (a3 instanceof Result.Failure) {
                                            a3 = null;
                                        }
                                        String str4 = (String) a3;
                                        if (str4 != null) {
                                            try {
                                                obj5 = (PaymentKitArguments) hcx.a().c(PaymentKitArguments.class, str4);
                                            } catch (Throwable th3) {
                                                failure3 = new Result.Failure(th3);
                                            }
                                            if (!(obj5 instanceof Result.Failure)) {
                                                PaymentKitArguments paymentKitArguments = (PaymentKitArguments) obj5;
                                                try {
                                                    PaymentKitArguments.PaymentOption paymentOption = paymentKitArguments.getPaymentOption();
                                                    if (paymentOption != null) {
                                                        int i5 = l3a0.b[paymentOption.ordinal()];
                                                        if (i5 == 1) {
                                                            paymentMethod = PaymentMethod.Sbp.INSTANCE;
                                                        } else {
                                                            if (i5 != 2) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            paymentMethod = PaymentMethod.NewSbpToken.INSTANCE;
                                                        }
                                                    } else {
                                                        paymentMethod = null;
                                                    }
                                                    bVar32.e(ksi0Var3.e(new PaymentToken(paymentKitArguments.getTrustId()), paymentMethod), 1001, ba20Var22);
                                                    failure4 = zy11Var;
                                                } catch (Throwable th4) {
                                                    failure4 = new Result.Failure(th4);
                                                }
                                                if (Result.a(failure4) != null) {
                                                    PaymentKitPluginError.InvalidArgumentsError invalidArgumentsError3 = PaymentKitPluginError.InvalidArgumentsError.a;
                                                    ba20Var22.error(invalidArgumentsError3.getCode(), invalidArgumentsError3.getMessage(), null);
                                                }
                                            }
                                            if (Result.a(obj5) != null) {
                                                PaymentKitPluginError.ParseArgumentsError parseArgumentsError = PaymentKitPluginError.ParseArgumentsError.a;
                                                ba20Var22.error(parseArgumentsError.getCode(), parseArgumentsError.getMessage(), null);
                                            }
                                            return zy11Var;
                                        }
                                        failure3 = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                                        obj5 = failure3;
                                        if (!(obj5 instanceof Result.Failure)) {
                                        }
                                        if (Result.a(obj5) != null) {
                                        }
                                        return zy11Var;
                                }
                            }
                        });
                        return;
                    }
                    break;
                case -102666959:
                    if (str.equals("present_bind_sbp_payment_controller")) {
                        b bVar12 = this.c;
                        if (bVar12 == null) {
                            bVar12 = null;
                        }
                        bVar12.getClass();
                        ba20 ba20Var7 = (ba20) da20Var;
                        ksi0 ksi0Var3 = bVar12.z;
                        if (ksi0Var3 == null) {
                            hay.e(ba20Var7, PaymentKitPluginError.UninitializedError.a);
                            return;
                        }
                        String str2 = obj instanceof String ? (String) obj : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        bVar12.e(ksi0Var3.b(str2), 1002, ba20Var7);
                        return;
                    }
                    break;
                case 268781707:
                    if (str.equals("init_sdk")) {
                        b bVar13 = this.c;
                        (bVar13 != null ? bVar13 : null).a(obj, (ba20) da20Var);
                        return;
                    }
                    break;
                case 879695819:
                    if (str.equals("dismiss_payment_interface")) {
                        b bVar14 = this.c;
                        ksi0 ksi0Var4 = (bVar14 != null ? bVar14 : null).z;
                        if (ksi0Var4 != null) {
                            sv90 sv90Var2 = qv90.a;
                            ApiMethodNameForAnalytics apiMethodNameForAnalytics2 = ApiMethodNameForAnalytics.DISMISS;
                            sv90Var2.getClass();
                            ksi0Var4.i(new mrj(i2, apiMethodNameForAnalytics2));
                            androidx.localbroadcastmanager.content.a.a(ksi0Var4.a).c(new Intent(BaseActivity.NOTIFICATION_DISMISS_PAYMENT_INTERFACE));
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        b bVar = this.c;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d(l40Var);
    }
}

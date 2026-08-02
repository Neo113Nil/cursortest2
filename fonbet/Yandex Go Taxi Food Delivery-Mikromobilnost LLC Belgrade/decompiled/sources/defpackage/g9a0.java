package defpackage;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$AddNequiToAppScreenActionType;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$AddNequiToAppScreenButton;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$ChangeType;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$LoyaltyToggleAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayProvider;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$VerificationProcessingAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$VerificationType;
import java.util.HashMap;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class g9a0 {
    public final pho a;

    public g9a0(pho phoVar) {
        this.a = phoVar;
    }

    public static void b(g9a0 g9a0Var, PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen, String str) {
        g9a0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
        hashMap.put("payment_method_type", str);
        g9a0Var.a.a("PaymentMethods.AddPaymentMethod", hashMap, 1, new HashMap());
    }

    public static void d(g9a0 g9a0Var, PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen, String str, String str2, Boolean bool, Boolean bool2) {
        g9a0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
        hashMap.put("payment_type", str);
        hashMap.put("payment_id", str2);
        hashMap.put("cashback_switch", bool);
        hashMap.put("composite_available", bool2);
        g9a0Var.a.a("PaymentMethods.DoneButton.Tapped", hashMap, 1, new HashMap());
    }

    public static void f(g9a0 g9a0Var, PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen, String str, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        g9a0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
        hashMap.put("payment_method", str);
        if (str2 != null) {
            hashMap.put("card_type", str2);
        }
        if (str3 != null) {
            hashMap.put("trust_labels", str3);
        }
        g9a0Var.a.a("PaymentMethods.Method.Selected", hashMap, 1, new HashMap());
    }

    public static void i(g9a0 g9a0Var, PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen, String str, PaymentMethodsAnalytics$VerificationType paymentMethodsAnalytics$VerificationType, String str2, String str3, int i) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        g9a0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
        hashMap.put("payment_method", str);
        hashMap.put("verification_type", paymentMethodsAnalytics$VerificationType.getEventValue());
        hashMap.put(ACSPConstants.STATUS, str2);
        if (str3 != null) {
            hashMap.put("card_type", str3);
        }
        g9a0Var.a.a("PaymentMethods.Verification.Completed", hashMap, 1, new HashMap());
    }

    public static void l(g9a0 g9a0Var, PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen, String str, PaymentMethodsAnalytics$VerificationType paymentMethodsAnalytics$VerificationType) {
        g9a0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
        hashMap.put("payment_type", str);
        hashMap.put("verification_type", paymentMethodsAnalytics$VerificationType.getEventValue());
        hashMap.put(ACSPConstants.STATUS, "unverified");
        g9a0Var.a.a("PaymentMethods.Verification.Tap", hashMap, 1, new HashMap());
    }

    public final void a(PaymentMethodsAnalytics$AddNequiToAppScreenActionType paymentMethodsAnalytics$AddNequiToAppScreenActionType, PaymentMethodsAnalytics$AddNequiToAppScreenButton paymentMethodsAnalytics$AddNequiToAppScreenButton) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", paymentMethodsAnalytics$AddNequiToAppScreenActionType.getEventValue());
        if (paymentMethodsAnalytics$AddNequiToAppScreenButton != null) {
            hashMap.put("button", paymentMethodsAnalytics$AddNequiToAppScreenButton.getEventValue());
        }
        this.a.a("PaymentMethods.AddNequi.ToAppScreen", hashMap, 1, new HashMap());
    }

    public final void c(PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
        hashMap.put("payment_method_type", str);
        this.a.a("PaymentMethods.AddPaymentMethod.BindingStatus", hashMap, 1, tse0.r(ACSPConstants.STATUS, hashMap, str2));
    }

    public final void e(PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
        hashMap.put(ACSPConstants.STATUS, str);
        this.a.a("PaymentMethods.Edit.Delete", hashMap, 1, tse0.r("payment_method", hashMap, str2));
    }

    public final void g(PaymentMethodsAnalytics$PlatformPayProvider paymentMethodsAnalytics$PlatformPayProvider, PaymentMethodsAnalytics$PlatformPayAction paymentMethodsAnalytics$PlatformPayAction, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("provider", paymentMethodsAnalytics$PlatformPayProvider.getEventValue());
        hashMap.put("action", paymentMethodsAnalytics$PlatformPayAction.getEventValue());
        hashMap.put("idempotency_token", str);
        if (str2 != null) {
            hashMap.put("error_status", str2);
        }
        this.a.a("PaymentMethods.PlatformPay.Action", hashMap, 1, new HashMap());
    }

    public final void h(String str, PaymentMethodsAnalytics$LoyaltyToggleAction paymentMethodsAnalytics$LoyaltyToggleAction, String str2, PaymentMethodsAnalytics$ChangeType paymentMethodsAnalytics$ChangeType, String str3) {
        HashMap p = x4e.p("loyalty_program", str);
        p.put("loyalty_toggle_action", paymentMethodsAnalytics$LoyaltyToggleAction.getEventValue());
        p.put("loyalty_balance", str2);
        p.put("change_type", paymentMethodsAnalytics$ChangeType.getEventValue());
        p.put("source", str3);
        this.a.a("PaymentMethods.Toggle.Switch", p, 1, new HashMap());
    }

    public final void j(PaymentMethodsAnalytics$PaymentMethodsScreen paymentMethodsAnalytics$PaymentMethodsScreen, String str, PaymentMethodsAnalytics$VerificationType paymentMethodsAnalytics$VerificationType, PaymentMethodsAnalytics$VerificationProcessingAction paymentMethodsAnalytics$VerificationProcessingAction, Integer num, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, paymentMethodsAnalytics$PaymentMethodsScreen.getEventValue());
        hashMap.put("payment_type", str);
        hashMap.put("verification_type", paymentMethodsAnalytics$VerificationType.getEventValue());
        hashMap.put("action", paymentMethodsAnalytics$VerificationProcessingAction.getEventValue());
        if (num != null) {
            hashMap.put("error_code", num);
        }
        if (str2 != null) {
            hashMap.put("error_description", str2);
        }
        this.a.a("PaymentMethods.Verification.Processing", hashMap, 1, new HashMap());
    }
}

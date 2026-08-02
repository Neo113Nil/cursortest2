package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.OrderInfo;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.SplashActivity;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.payment.sbp.BindSbpActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import com.yandex.xplat.payment.sdk.ApiMethodNameForAnalytics;
import com.yandex.xplat.payment.sdk.InstanceTypeForAnalytics;
import java.util.Map;
import java.util.UUID;
import kotlin.a;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class ksi0 {
    public final Context a;
    public final Payer b;
    public final Merchant c;
    public final PaymentSdkEnvironment d;
    public final AdditionalSettings e;
    public final ConsoleLoggingMode f;
    public final ev5 g;
    public final i3y h;
    public final i3y i;
    public final i3y j;

    public ksi0(Context context, Payer payer, Merchant merchant, PaymentSdkEnvironment paymentSdkEnvironment, AdditionalSettings additionalSettings, ConsoleLoggingMode consoleLoggingMode, ev5 ev5Var) {
        this.a = context;
        this.b = payer;
        this.c = merchant;
        this.d = paymentSdkEnvironment;
        this.e = additionalSettings;
        this.f = consoleLoggingMode;
        this.g = ev5Var;
        final int i = 0;
        this.h = a.a(new sls(this) { // from class: isi0
            public final /* synthetic */ ksi0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ksi0 ksi0Var = this.b;
                switch (i2) {
                    case 0:
                        String uuid = UUID.randomUUID().toString();
                        ev5 ev5Var2 = ksi0Var.g;
                        if (ev5Var2 != null) {
                            synchronized (dgo.a) {
                                dgo.b.put(uuid, ev5Var2);
                            }
                        }
                        msb1 msb1Var = msb1.x;
                        Context context2 = ksi0Var.a;
                        Payer payer2 = ksi0Var.b;
                        Merchant merchant2 = ksi0Var.c;
                        AdditionalSettings additionalSettings2 = ksi0Var.e;
                        return msb1Var.f(null, context2, ksi0Var.f, merchant2, payer2, ksi0Var.d, additionalSettings2, uuid);
                    case 1:
                        return ((pwf) ksi0Var.h()).b();
                    default:
                        return new rwf(((pwf) ksi0Var.h()).a, new kzu0(), new pkr());
                }
            }
        });
        if (paymentSdkEnvironment.getIsDebug()) {
            tyj0 b = hnb1.b(payer.getOauthToken(), payer.getUid());
            if (b.b()) {
                YSError ySError = b.b;
                c.b(ySError);
                w511.f(ySError.getMessage());
                throw null;
            }
        }
        y22 y22Var = (y22) ((pwf) h()).t.get();
        String uid = payer.getUid();
        if (uid != null) {
            y22Var.b.b("uid", uid);
        } else {
            y22Var.getClass();
        }
        km0 km0Var = y22Var.b;
        km0Var.b("service_token", merchant.getServiceToken());
        String uuid = UUID.randomUUID().toString();
        InstanceTypeForAnalytics instanceTypeForAnalytics = InstanceTypeForAnalytics.SDK_DIALOG;
        km0Var.b("api_instance_id", uuid);
        km0Var.b("api_instance_type", instanceTypeForAnalytics.getValue());
        final int i2 = 1;
        this.i = a.a(new sls(this) { // from class: isi0
            public final /* synthetic */ ksi0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ksi0 ksi0Var = this.b;
                switch (i22) {
                    case 0:
                        String uuid2 = UUID.randomUUID().toString();
                        ev5 ev5Var2 = ksi0Var.g;
                        if (ev5Var2 != null) {
                            synchronized (dgo.a) {
                                dgo.b.put(uuid2, ev5Var2);
                            }
                        }
                        msb1 msb1Var = msb1.x;
                        Context context2 = ksi0Var.a;
                        Payer payer2 = ksi0Var.b;
                        Merchant merchant2 = ksi0Var.c;
                        AdditionalSettings additionalSettings2 = ksi0Var.e;
                        return msb1Var.f(null, context2, ksi0Var.f, merchant2, payer2, ksi0Var.d, additionalSettings2, uuid2);
                    case 1:
                        return ((pwf) ksi0Var.h()).b();
                    default:
                        return new rwf(((pwf) ksi0Var.h()).a, new kzu0(), new pkr());
                }
            }
        });
        final int i3 = 2;
        this.j = a.a(new sls(this) { // from class: isi0
            public final /* synthetic */ ksi0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                ksi0 ksi0Var = this.b;
                switch (i22) {
                    case 0:
                        String uuid2 = UUID.randomUUID().toString();
                        ev5 ev5Var2 = ksi0Var.g;
                        if (ev5Var2 != null) {
                            synchronized (dgo.a) {
                                dgo.b.put(uuid2, ev5Var2);
                            }
                        }
                        msb1 msb1Var = msb1.x;
                        Context context2 = ksi0Var.a;
                        Payer payer2 = ksi0Var.b;
                        Merchant merchant2 = ksi0Var.c;
                        AdditionalSettings additionalSettings2 = ksi0Var.e;
                        return msb1Var.f(null, context2, ksi0Var.f, merchant2, payer2, ksi0Var.d, additionalSettings2, uuid2);
                    case 1:
                        return ((pwf) ksi0Var.h()).b();
                    default:
                        return new rwf(((pwf) ksi0Var.h()).a, new kzu0(), new pkr());
                }
            }
        });
    }

    public final Intent a(boolean z, Class cls) {
        Context context = this.a;
        return (z ? new Intent(context, (Class<?>) SplashActivity.class).putExtra(BaseActivity.EXTRA_CLASS_NAME, cls) : new Intent(context, (Class<?>) cls)).putExtra(BaseActivity.EXTRA_PAYER_DATA, this.b).putExtra(BaseActivity.EXTRA_MERCHANT_DATA, this.c).putExtra(BaseActivity.EXTRA_ENVIRONMENT, (Parcelable) this.d).putExtra(BaseActivity.ADDITIONAL_SETTINGS, this.e).putExtra(BaseActivity.CONSOLE_LOGGING_MODE, (Parcelable) this.f).putExtra(BaseActivity.EXTRA_LOGGER_KEY, (String) this.i.getValue());
    }

    public final Intent b(String str) {
        Intent putExtra = a(true, BindSbpActivity.class).putExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, false).putExtra(BaseActivity.EXTRA_EMAIL, this.b.getEmail()).putExtra(BaseActivity.EXTRA_REDIRECT_URL, str);
        sv90 sv90Var = qv90.a;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.BIND_SBP_TOKEN;
        sv90Var.getClass();
        i(new mrj(15, apiMethodNameForAnalytics));
        return putExtra;
    }

    public final Intent c() {
        Intent putExtra = a(true, BindCardActivity.class).putExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, false).putExtra(BaseActivity.EXTRA_CAMERA_CARD_SCANNER, (Parcelable) null);
        sv90 sv90Var = qv90.a;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.CARD_BIND;
        sv90Var.getClass();
        i(new mrj(15, apiMethodNameForAnalytics));
        return putExtra;
    }

    public final Intent d(PaymentToken paymentToken, OrderInfo orderInfo) {
        Intent putExtra = a(false, PreselectActivity.class).putExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, true).putExtra(BaseActivity.EXTRA_PAYMENT_TOKEN, paymentToken).putExtra(BaseActivity.EXTRA_ORDER_INFO, orderInfo);
        sv90 sv90Var = qv90.a;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.CONTINUE_PAYMENT;
        sv90Var.getClass();
        mrj mrjVar = new mrj(15, apiMethodNameForAnalytics);
        mrjVar.w = paymentToken.getToken();
        i(mrjVar);
        return putExtra;
    }

    public final Intent e(PaymentToken paymentToken, PaymentMethod paymentMethod) {
        Intent putExtra = a(true, PaymentActivity.class).putExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, true).putExtra(BaseActivity.EXTRA_PAYMENT_TOKEN, paymentToken).putExtra(BaseActivity.EXTRA_SELECTED_METHOD, paymentMethod).putExtra(BaseActivity.EXTRA_ORDER_INFO, (Parcelable) null);
        sv90 sv90Var = qv90.a;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.PAY;
        sv90Var.getClass();
        mrj mrjVar = new mrj(15, apiMethodNameForAnalytics);
        mrjVar.c = paymentMethod != null ? a8a0.c(paymentMethod) : null;
        mrjVar.w = paymentToken.getToken();
        i(mrjVar);
        return putExtra;
    }

    public final Intent f(Class cls, String str) {
        Intent putExtra = a(true, cls).putExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, true).putExtra(BaseActivity.START_PAYMENT_AFTER_SELECT, true).putExtra(BaseActivity.EXTRA_DEFAULT_PAYMENT_METHOD, str);
        sv90 sv90Var = qv90.a;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.SELECT_AND_PAY;
        sv90Var.getClass();
        mrj mrjVar = new mrj(15, apiMethodNameForAnalytics);
        mrjVar.c = str;
        i(mrjVar);
        return putExtra;
    }

    public final Intent g(String str, Map map) {
        Intent putExtra = new Intent(this.a, (Class<?>) SplashActivity.class).putExtra(BaseActivity.EXTRA_CLASS_NAME, TransportCardsActivity.class);
        PaymentSdkEnvironment paymentSdkEnvironment = this.d;
        Intent putExtra2 = putExtra.putExtra(BaseActivity.EXTRA_ENVIRONMENT, (Parcelable) paymentSdkEnvironment).putExtra(BaseActivity.EXTRA_PAYER_DATA, this.b).putExtra(BaseActivity.EXTRA_TRANSPORT_CARD_DEEPLINK, str).putExtra(BaseActivity.EXTRA_TRANSPORT_CARD_BODY, new u3u().h(map)).putExtra(BaseActivity.EXTRA_MERCHANT_DATA, this.c).putExtra(BaseActivity.EXTRA_ENVIRONMENT, (Parcelable) paymentSdkEnvironment).putExtra(BaseActivity.ADDITIONAL_SETTINGS, this.e).putExtra(BaseActivity.CONSOLE_LOGGING_MODE, (Parcelable) this.f).putExtra(BaseActivity.EXTRA_LOGGER_KEY, (String) this.i.getValue());
        sv90 sv90Var = qv90.a;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.TRANSPORT_CARDS;
        sv90Var.getClass();
        i(new mrj(15, apiMethodNameForAnalytics));
        return putExtra2;
    }

    public final wy4 h() {
        return (wy4) this.h.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final void i(mrj mrjVar) {
        String str;
        rwo c = ((pwf) h()).c();
        ApiMethodNameForAnalytics apiMethodNameForAnalytics = (ApiMethodNameForAnalytics) mrjVar.b;
        switch (yn2.a[apiMethodNameForAnalytics.ordinal()]) {
            case 1:
                str = "запустить процесс оплаты";
                break;
            case 2:
                str = "запустить процесс привязки карты без верификации";
                break;
            case 3:
                str = "запустить процесс привязки карты с верификацией";
                break;
            case 4:
                str = "запустить процесс привязки СБП токена";
                break;
            case 5:
                str = "запустить процесс верификации карты";
                break;
            case 6:
                str = "запустить процесс выбора способа оплаты";
                break;
            case 7:
                str = "запустить процесс выбора способа оплаты с досылкой токена и последующей оплатой (Preselect&Pay)";
                break;
            case 8:
                str = "запустить получение токена GooglePay";
                break;
            case 9:
                str = "привязать GooglePay токен";
                break;
            case 10:
                str = "привязать ApplePay токен";
                break;
            case 11:
                str = "запустить процесс оплаты через ApplePay";
                break;
            case 12:
                str = "отобразить переопределенный результат в диалоге PaymentSDK";
                break;
            case 13:
                str = "дослать ошибку в Preselect&Pay";
                break;
            case 14:
                str = "дослать токен в Preselect&Pay";
                break;
            case 15:
                str = "обновить кнопку выбора метода оплаты";
                break;
            case 16:
                str = "обновить методы оплаты";
                break;
            case 17:
                str = "скрыть интерфейс PaymentSDK";
                break;
            case 18:
                str = "применить CVV и оплатить";
                break;
            case 19:
                str = "запустить процесс оплаты iPayment";
                break;
            case 20:
                str = "запустить процесс пополнения транспортной карты";
                break;
            case 21:
                str = "запустить процесс подписки и оплаты счетов RTP";
                break;
            case 22:
                str = "вызвать remote action";
                break;
            case 23:
                str = "дополнительно верифицировать карту";
                break;
            default:
                str = "";
                break;
        }
        String concat = "Вызов конкретного публичного метода PaymentKit: ".concat(str);
        String str2 = (String) mrjVar.c;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2105971089:
                    if (str2.equals("NEW_CARD")) {
                        str2 = "оплата новой картой";
                        break;
                    }
                    break;
                case -1855318471:
                    if (str2.equals("SBP_ID")) {
                        str2 = "оплата через Систему Быстрых Платежей";
                        break;
                    }
                    break;
                case -1048776318:
                    if (str2.equals("GOOGLE_PAY")) {
                        str2 = "оплата через GooglePay";
                        break;
                    }
                    break;
                case 2061107:
                    if (str2.equals("CASH")) {
                        str2 = "оплата наличными";
                        break;
                    }
                    break;
                case 693748227:
                    if (str2.equals("APPLE_PAY")) {
                        str2 = "оплата через ApplePay";
                        break;
                    }
                    break;
                case 1649876030:
                    if (str2.equals("NEW_SBP_TOKEN_ID")) {
                        str2 = "оплата через Систему Быстрых Платежей с возможностью привязки СБП токена";
                        break;
                    }
                    break;
            }
            concat = g8e.p(concat, ", выбранный способ оплаты: ", str2);
        }
        String str3 = (String) mrjVar.w;
        if (str3 != null) {
            concat = g8e.p(concat, ", payment_token = ", str3);
        }
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("method", apiMethodNameForAnalytics.getValue());
        String str4 = (String) mrjVar.c;
        if (str4 != null) {
            wj00Var.k("selected_option", str4);
        }
        String str5 = (String) mrjVar.w;
        if (str5 != null) {
            wj00Var.k("payment_token", str5);
        }
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        ((y22) c).a(y891.c("api_method_call", wj00Var));
    }

    public final void j(xry0 xry0Var) {
        xry0 xry0Var2 = yry0.a;
        yry0.a = xry0Var;
    }
}

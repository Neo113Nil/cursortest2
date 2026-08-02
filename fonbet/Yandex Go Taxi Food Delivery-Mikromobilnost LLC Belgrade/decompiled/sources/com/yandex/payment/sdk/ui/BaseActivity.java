package com.yandex.payment.sdk.ui;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.payment.sdk.FinishPaymentResult;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.common.c;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.yandex.xplat.payment.sdk.ExternalConvertibleError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.ServiceStatusForAnalytics;
import com.yandex.xplat.payment.sdk.YBCardType;
import defpackage.ao2;
import defpackage.apa1;
import defpackage.ckt;
import defpackage.dzf;
import defpackage.g8e;
import defpackage.hyj0;
import defpackage.i3y;
import defpackage.iho;
import defpackage.img0;
import defpackage.j9h0;
import defpackage.jxi;
import defpackage.kt3;
import defpackage.kyj0;
import defpackage.laa0;
import defpackage.msb1;
import defpackage.mxk;
import defpackage.ncq0;
import defpackage.nnm;
import defpackage.nuj0;
import defpackage.o3a0;
import defpackage.pac;
import defpackage.pcy;
import defpackage.pwf;
import defpackage.qv10;
import defpackage.qv90;
import defpackage.qw4;
import defpackage.qyj0;
import defpackage.r991;
import defpackage.rw4;
import defpackage.rwo;
import defpackage.rxk;
import defpackage.sls;
import defpackage.sv90;
import defpackage.sw4;
import defpackage.tue0;
import defpackage.tw4;
import defpackage.u870;
import defpackage.ucs;
import defpackage.uu5;
import defpackage.vfc;
import defpackage.vtf;
import defpackage.vu5;
import defpackage.w511;
import defpackage.wb20;
import defpackage.wj00;
import defpackage.wtf;
import defpackage.wy4;
import defpackage.xsf;
import defpackage.xvt;
import defpackage.y22;
import defpackage.y891;
import defpackage.yr31;
import defpackage.znb1;
import defpackage.zvt;
import defpackage.zy11;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0087\u00012\u00020\u0001:\u0005-\u0088\u0001\u0089\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\"\u0010#J\u001b\u0010'\u001a\u00020\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010,\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u00101\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010\u0003J\u000f\u00107\u001a\u00020\bH\u0000¢\u0006\u0004\b6\u0010\u0003J\u001d\u0010<\u001a\u00020\b2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020\bH\u0000¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010A\u001a\u00020\bH\u0000¢\u0006\u0004\b@\u0010\u0003J\u000f\u0010C\u001a\u00020\bH\u0000¢\u0006\u0004\bB\u0010\u0003J\u000f\u0010E\u001a\u00020\bH\u0000¢\u0006\u0004\bD\u0010\u0003J\u000f\u0010G\u001a\u00020\bH\u0000¢\u0006\u0004\bF\u0010\u0003J\u000f\u0010I\u001a\u00020\bH\u0000¢\u0006\u0004\bH\u0010\u0003J+\u0010P\u001a\u00020\b2\u0006\u0010K\u001a\u00020J2\b\b\u0002\u0010L\u001a\u00020\u00042\b\b\u0002\u0010M\u001a\u00020\u001eH\u0000¢\u0006\u0004\bN\u0010OJ\u0017\u0010S\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u001eH\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010V\u001a\u00020\b2\u0006\u0010U\u001a\u00020TH\u0005¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\b2\u0006\u0010X\u001a\u00020\u001eH\u0002¢\u0006\u0004\bY\u0010RJ\u000f\u0010Z\u001a\u00020\u0004H\u0002¢\u0006\u0004\bZ\u0010\u0006J%\u0010]\u001a\u00020\b2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\b0[2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\bH\u0002¢\u0006\u0004\b_\u0010\u0003J!\u0010a\u001a\u00020\b2\u0006\u0010`\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020c8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bj\u0010e\u001a\u0004\bk\u0010lR$\u0010o\u001a\u0004\u0018\u00010n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010w\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u001b\u0010\u007f\u001a\u00020{8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b|\u0010e\u001a\u0004\b}\u0010~R\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018 X \u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/yandex/payment/sdk/ui/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "getDebrandingFlag$paymentsdk_release", "()Z", "getDebrandingFlag", "Lzy11;", "onResume", "onPause", "onStart", "onStop", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Liho;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "reportEvent", "(Liho;)V", "shouldRestorePayment", "(Landroid/os/Bundle;)Z", "outState", "onSaveInstanceState", "onDestroy", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "resultCode", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/Parcelable;", "saveActivityResultSuccess$paymentsdk_release", "(Landroid/os/Parcelable;)V", "saveActivityResultSuccess", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "saveActivityResultError$paymentsdk_release", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "saveActivityResultError", "Lsw4;", "callback", "applyProcessResultSuccess$paymentsdk_release", "(Lsw4;)V", "applyProcessResultSuccess", "applyProcessResultError$paymentsdk_release", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;Lsw4;)V", "applyProcessResultError", "tryCloseActivity", "finishWithResult$paymentsdk_release", "finishWithResult", "", "key", "", "value", "putExtraToResult", "(Ljava/lang/String;J)V", "popFragmentBackStack$paymentsdk_release", "popFragmentBackStack", "cleanBackStack$paymentsdk_release", "cleanBackStack", "showChallenge$paymentsdk_release", "showChallenge", "hideChallenge$paymentsdk_release", "hideChallenge", "showLoading$paymentsdk_release", "showLoading", "hideLoading$paymentsdk_release", "hideLoading", "Landroidx/fragment/app/Fragment;", "replacement", "addToBackStack", "fragmentId", "replaceFragment$paymentsdk_release", "(Landroidx/fragment/app/Fragment;ZI)V", "replaceFragment", "removeFragment$paymentsdk_release", "(I)V", "removeFragment", "Landroid/view/ViewGroup;", "container", "applyWidthOnLargeScreen", "(Landroid/view/ViewGroup;)V", "securityFlag", "toggleSecurityMode", "isBindFragment", "Lqyj0;", TarifficatorScenarioActivity.RESULT_KEY, "applyProcessResult", "(Lqyj0;Lsw4;)V", "saveActivityResultCanceled", AuthSdkActivity.RESPONSE_TYPE_CODE, "saveActivityResult", "(ILandroid/content/Intent;)V", "Lwy4;", "baseComponent$delegate", "Li3y;", "getBaseComponent$paymentsdk_release", "()Lwy4;", "baseComponent", "Lmxk;", "divKitComponent$delegate", "getDivKitComponent$paymentsdk_release", "()Lmxk;", "divKitComponent", "Lyr31;", "resultViewModel", "Lyr31;", "getResultViewModel$paymentsdk_release", "()Lyr31;", "setResultViewModel$paymentsdk_release", "(Lyr31;)V", "activityResultCode", "Ljava/lang/Integer;", "activityResultIntent", "Landroid/content/Intent;", "finishProcessCallback", "Lsw4;", "Lpcy;", "config$delegate", "getConfig$paymentsdk_release", "()Lpcy;", ConfigConstants.CONFIG, "Lucs;", "changeFragmentListener", "Lucs;", "Landroid/content/BroadcastReceiver;", "getDismissInterfaceReceiver$paymentsdk_release", "()Landroid/content/BroadcastReceiver;", "dismissInterfaceReceiver", "Companion", "tw4", "rw4", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseActivity extends AppCompatActivity {
    public static final String ADDITIONAL_SETTINGS = "com.yandex.payment.sdk.ui.extra.ADDITIONAL_SETTINGS";
    public static final String BIND_NEW_CARD_BEFORE_PAYMENT = "com.yandex.payment.sdk.ui.extra.BIND_NEW_CARD_BEFORE_PAYMENT";
    public static final String CONSOLE_LOGGING_MODE = "com.yandex.payment.sdk.ui.extra.CONSOLE_LOGGING_MODE";
    public static final rw4 Companion = new rw4();
    public static final int DEFAULT_WIDTH = -1;
    public static final String EXTRA_BINDING_ID = "com.yandex.payment.sdk.ui.network.extra.BINDING_ID";
    public static final String EXTRA_CAMERA_CARD_SCANNER = "com.yandex.payment.sdk.ui.network.extra.EXTRA_CAMERA_CARD_SCANNER";
    public static final String EXTRA_CLASS_NAME = "com.yandex.payment.sdk.ui.network.extra.CLASS_NAME";
    public static final String EXTRA_CURRENCY = "com.yandex.payment.sdk.ui.network.extra.CURRENCY";
    public static final String EXTRA_DEFAULT_PAYMENT_METHOD = "com.yandex.payment.sdk.ui.network.extra.DEFAULT_PAYMENT_METHOD_ID";
    public static final String EXTRA_EMAIL = "com.yandex.payment.sdk.ui.network.extra.EMAIL";
    public static final String EXTRA_ENVIRONMENT = "com.yandex.payment.sdk.ui.network.extra.ENVIRONMENT";
    public static final String EXTRA_LOGGER_KEY = "com.yandex.payment.sdk.ui.network.extra.LOGGER_KEY";
    public static final String EXTRA_MERCHANT_DATA = "com.yandex.payment.sdk.ui.network.extra.MERCHANT_DATA";
    public static final String EXTRA_ORDER_DATA = "com.yandex.payment.sdk.ui.network.extra.ORDER_DATA";
    public static final String EXTRA_ORDER_INFO = "com.yandex.payment.sdk.ui.network.extra.ORDER_INFO";
    public static final String EXTRA_PAYER_DATA = "com.yandex.payment.sdk.ui.network.extra.PAYER_DATA";
    public static final String EXTRA_PAYMENT_CONTEXT = "com.yandex.payment.sdk.ui.network.extra.PAYMENT_CONTEXT";
    public static final String EXTRA_PAYMENT_FINAL_STATE_RESULT = "com.yandex.payment.sdk.ui.network.extra.EXTRA_PAYMENT_FINAL_STATE_RESULT";
    public static final String EXTRA_PAYMENT_PROCESS_FINAL_STATE = "com.yandex.payment.sdk.ui.network.extra.PAYMENT_PROCESS_FINAL_STATE";
    public static final String EXTRA_PAYMENT_TOKEN = "com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN";
    public static final String EXTRA_PAYMENT_TOKEN_ERROR = "com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN_ERROR";
    private static final String EXTRA_PREFIX = "com.yandex.payment.sdk.ui.network.extra";
    public static final String EXTRA_PRESELECT_BUTTON_STATE = "com.yandex.payment.sdk.ui.network.extra.PRESELECT_BUTTON_STATE";
    public static final String EXTRA_REDIRECT_URL = "com.yandex.payment.sdk.ui.network.extra.REDIRECT_URL";
    public static final String EXTRA_SELECTED_METHOD = "com.yandex.payment.sdk.ui.network.extra.SELECTED_METHOD";
    public static final String EXTRA_TRANSPORT_CARD_BODY = "com.yandex.payment.sdk.ui.network.extra.TRANSPORT_CARD_BODY";
    public static final String EXTRA_TRANSPORT_CARD_DEEPLINK = "com.yandex.payment.sdk.ui.network.extra.TRANSPORT_CARD_DEEPLINK";
    public static final String EXTRA_UPDATE_PAY_BUTTON_TEXT = "com.yandex.payment.sdk.ui.network.extra.EXTRA_UPDATE_PAY_BUTTON_TEXT";
    public static final String EXTRA_VERIFY_CARD_ID = "com.yandex.payment.sdk.ui.network.extra.VERIFY_CARD_ID";
    public static final String EXTRA_VERIFY_INTENT_ID = "com.yandex.payment.sdk.ui.network.extra.VERIFY_INTENT_ID";
    private static final String FLAGS_STATE_KEY = "flags_state";
    public static final int FULL_SCREEN_WIDTH = -1;
    public static final String NOTIFICATION_DISMISS_PAYMENT_INTERFACE = "com.yandex.payment.sdk.ui.ui.notification.DISMISS_PAYMENT_INTERFACE";
    public static final String PRESELECT_PROVIDED_PAYMENT_METHODS = "com.yandex.payment.sdk.ui.extra.PRESELECT_PROVIDED_PAYMENT_METHODS";
    public static final String START_PAYMENT_AFTER_SELECT = "com.yandex.payment.sdk.ui.extra.START_PAYMENT_AFTER_SELECT";
    private Integer activityResultCode;
    private Intent activityResultIntent;

    /* renamed from: baseComponent$delegate, reason: from kotlin metadata */
    private final i3y baseComponent;
    private final ucs changeFragmentListener;

    /* renamed from: config$delegate, reason: from kotlin metadata */
    private final i3y config;

    /* renamed from: divKitComponent$delegate, reason: from kotlin metadata */
    private final i3y divKitComponent;
    private sw4 finishProcessCallback;
    private yr31 resultViewModel;

    public BaseActivity() {
        final int i = 0;
        this.baseComponent = kotlin.a.a(new sls(this) { // from class: pw4
            public final /* synthetic */ BaseActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                wy4 baseComponent_delegate$lambda$0;
                mxk divKitComponent_delegate$lambda$0;
                pcy config_delegate$lambda$0;
                int i2 = i;
                BaseActivity baseActivity = this.b;
                switch (i2) {
                    case 0:
                        baseComponent_delegate$lambda$0 = BaseActivity.baseComponent_delegate$lambda$0(baseActivity);
                        return baseComponent_delegate$lambda$0;
                    case 1:
                        divKitComponent_delegate$lambda$0 = BaseActivity.divKitComponent_delegate$lambda$0(baseActivity);
                        return divKitComponent_delegate$lambda$0;
                    default:
                        config_delegate$lambda$0 = BaseActivity.config_delegate$lambda$0(baseActivity);
                        return config_delegate$lambda$0;
                }
            }
        });
        final int i2 = 1;
        this.divKitComponent = kotlin.a.a(new sls(this) { // from class: pw4
            public final /* synthetic */ BaseActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                wy4 baseComponent_delegate$lambda$0;
                mxk divKitComponent_delegate$lambda$0;
                pcy config_delegate$lambda$0;
                int i22 = i2;
                BaseActivity baseActivity = this.b;
                switch (i22) {
                    case 0:
                        baseComponent_delegate$lambda$0 = BaseActivity.baseComponent_delegate$lambda$0(baseActivity);
                        return baseComponent_delegate$lambda$0;
                    case 1:
                        divKitComponent_delegate$lambda$0 = BaseActivity.divKitComponent_delegate$lambda$0(baseActivity);
                        return divKitComponent_delegate$lambda$0;
                    default:
                        config_delegate$lambda$0 = BaseActivity.config_delegate$lambda$0(baseActivity);
                        return config_delegate$lambda$0;
                }
            }
        });
        final int i3 = 2;
        this.config = kotlin.a.a(new sls(this) { // from class: pw4
            public final /* synthetic */ BaseActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                wy4 baseComponent_delegate$lambda$0;
                mxk divKitComponent_delegate$lambda$0;
                pcy config_delegate$lambda$0;
                int i22 = i3;
                BaseActivity baseActivity = this.b;
                switch (i22) {
                    case 0:
                        baseComponent_delegate$lambda$0 = BaseActivity.baseComponent_delegate$lambda$0(baseActivity);
                        return baseComponent_delegate$lambda$0;
                    case 1:
                        divKitComponent_delegate$lambda$0 = BaseActivity.divKitComponent_delegate$lambda$0(baseActivity);
                        return divKitComponent_delegate$lambda$0;
                    default:
                        config_delegate$lambda$0 = BaseActivity.config_delegate$lambda$0(baseActivity);
                        return config_delegate$lambda$0;
                }
            }
        });
        this.changeFragmentListener = new qw4(i, this);
    }

    private final void applyProcessResult(qyj0 result, sw4 callback) {
        o3a0 o3a0Var = o3a0.f;
        if (!o3a0Var.a.e()) {
            ((c) callback).c(null);
        } else {
            this.finishProcessCallback = callback;
            o3a0Var.a(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wy4 baseComponent_delegate$lambda$0(BaseActivity baseActivity) {
        AdditionalSettings additionalSettings = (AdditionalSettings) baseActivity.getIntent().getParcelableExtra(ADDITIONAL_SETTINGS);
        tw4 tw4Var = tw4.a;
        tw4.b = new WeakReference(baseActivity);
        msb1 msb1Var = msb1.x;
        Payer payer = (Payer) baseActivity.getIntent().getParcelableExtra(EXTRA_PAYER_DATA);
        Merchant merchant = (Merchant) baseActivity.getIntent().getParcelableExtra(EXTRA_MERCHANT_DATA);
        PaymentSdkEnvironment paymentSdkEnvironment = (PaymentSdkEnvironment) baseActivity.getIntent().getParcelableExtra(EXTRA_ENVIRONMENT);
        ConsoleLoggingMode consoleLoggingMode = (ConsoleLoggingMode) baseActivity.getIntent().getParcelableExtra(CONSOLE_LOGGING_MODE);
        String stringExtra = baseActivity.getIntent().getStringExtra(EXTRA_LOGGER_KEY);
        if (stringExtra == null) {
            stringExtra = "";
        }
        pwf f = msb1Var.f(tw4Var, baseActivity, consoleLoggingMode, merchant, payer, paymentSdkEnvironment, additionalSettings, stringExtra);
        rwo c = f.c();
        sv90 sv90Var = qv90.a;
        laa0 i = znb1.i(f.a().getPaymentMethodsFilter());
        sv90Var.getClass();
        boolean z = i.f;
        boolean z2 = i.e;
        boolean z3 = i.d;
        boolean z4 = i.c;
        boolean z5 = i.b;
        boolean z6 = i.a;
        ArrayList arrayList = i.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((YBCardType) it.next()).getValue());
        }
        String p = g8e.p(g8e.p(g8e.p(g8e.p(g8e.p(g8e.p("Фильтр методов оплаты: оплата привязанной картой ".concat(z6 ? "доступна" : "не доступна").concat("; оплата через ApplePay не доступна"), "; оплата через GooglePay ", z5 ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей ", z4 ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей с возможностью привязки СБП токена ", z3 ? "доступна" : "не доступна"), "; оплата привязанным СБП токеном ", z2 ? "доступна" : "не доступна"), "; оплата через счёт в yb ", z ? "доступна" : "не доступна"), "; доступные типы карт yb: ", kotlin.collections.a.X(arrayList2, Extension.FIX_SPACE, null, null, null, 62));
        sv90 sv90Var2 = qv90.a;
        wj00 wj00Var = new wj00(0);
        StringBuilder u = qv10.u("{ isStoredCardAvailable: ", ", isApplePayAvailable: false, isGooglePayAvailable: ", ", isSBPAvailable: ", z6, z5);
        nnm.v(", isNewSbpTokenAvailable: ", ", isSBPTokensAvailable: ", u, z4, z3);
        nnm.v(", isYBAccountAvailable: ", " , isSplitAvailable: ", u, z2, z);
        u.append(arrayList);
        u.append(" }");
        wj00Var.k("value", u.toString());
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
        ((y22) c).a(y891.c("payment_methods_filter", wj00Var));
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeFragmentListener$lambda$0(BaseActivity baseActivity) {
        baseActivity.toggleSecurityMode((baseActivity.isBindFragment() || !apa1.e(FeatureFlag.ALLOW_SCREEN_SHOT_FLAG)) ? 8192 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pcy config_delegate$lambda$0(BaseActivity baseActivity) {
        return ((pwf) baseActivity.getBaseComponent$paymentsdk_release()).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mxk divKitComponent_delegate$lambda$0(BaseActivity baseActivity) {
        Application application = baseActivity.getApplication();
        Merchant merchant = (Merchant) ((pwf) baseActivity.getBaseComponent$paymentsdk_release()).r.get();
        Payer e = ((pwf) baseActivity.getBaseComponent$paymentsdk_release()).e();
        rwo c = ((pwf) baseActivity.getBaseComponent$paymentsdk_release()).c();
        pcy d = ((pwf) baseActivity.getBaseComponent$paymentsdk_release()).d();
        u870 u870Var = (u870) ((pwf) baseActivity.getBaseComponent$paymentsdk_release()).z.get();
        boolean debrandingFlag$paymentsdk_release = baseActivity.getDebrandingFlag$paymentsdk_release();
        merchant.getClass();
        e.getClass();
        c.getClass();
        d.getClass();
        u870Var.getClass();
        return new dzf(new rxk(), new ao2(), new nuj0(), new ncq0(), application, merchant, e, c, d, u870Var, Boolean.valueOf(debrandingFlag$paymentsdk_release));
    }

    private final boolean isBindFragment() {
        Fragment E = getSupportFragmentManager().E(j9h0.fragment_container);
        return (E instanceof vu5) || (E instanceof uu5) || (E instanceof tue0);
    }

    public static /* synthetic */ void replaceFragment$paymentsdk_release$default(BaseActivity baseActivity, Fragment fragment, boolean z, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: replaceFragment");
            return;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = j9h0.fragment_container;
        }
        baseActivity.replaceFragment$paymentsdk_release(fragment, z, i);
    }

    private final void saveActivityResult(int code, Intent intent) {
        this.activityResultCode = Integer.valueOf(code);
        if (intent == null) {
            intent = new Intent();
        }
        this.activityResultIntent = intent;
        setResult(code, intent);
    }

    private final void saveActivityResultCanceled() {
        saveActivityResult(0, new Intent().putExtra("CODE", "NOT_STARTED"));
    }

    public static /* synthetic */ void saveActivityResultSuccess$paymentsdk_release$default(BaseActivity baseActivity, Parcelable parcelable, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: saveActivityResultSuccess");
            return;
        }
        if ((i & 1) != 0) {
            parcelable = null;
        }
        baseActivity.saveActivityResultSuccess$paymentsdk_release(parcelable);
    }

    private final void toggleSecurityMode(int securityFlag) {
        getWindow().setFlags(securityFlag, 8192);
    }

    public final void applyProcessResultError$paymentsdk_release(PaymentKitError error, sw4 callback) {
        applyProcessResult(new hyj0(error), callback);
    }

    public final void applyProcessResultSuccess$paymentsdk_release(sw4 callback) {
        applyProcessResult(new kyj0(zy11.a), callback);
    }

    @jxi
    public final void applyWidthOnLargeScreen(ViewGroup container) {
    }

    public final void cleanBackStack$paymentsdk_release() {
        int K = getSupportFragmentManager().K() + 1;
        for (int i = 0; i < K; i++) {
            getSupportFragmentManager().a0(-1, 1);
        }
    }

    public final void finishWithResult$paymentsdk_release() {
        if (this.activityResultCode == null) {
            saveActivityResultCanceled();
        }
        Intent intent = this.activityResultIntent;
        String stringExtra = intent != null ? intent.getStringExtra(IDialogId.INTENT_EXTRA_IN_MESSAGE) : null;
        int intValue = this.activityResultCode.intValue();
        if (intValue == -1) {
            sv90 sv90Var = qv90.a;
            ServiceStatusForAnalytics serviceStatusForAnalytics = ServiceStatusForAnalytics.success;
            sv90Var.getClass();
            reportEvent(sv90.i(serviceStatusForAnalytics, stringExtra));
        } else if (intValue != 0) {
            sv90 sv90Var2 = qv90.a;
            ServiceStatusForAnalytics serviceStatusForAnalytics2 = ServiceStatusForAnalytics.failed;
            sv90Var2.getClass();
            reportEvent(sv90.i(serviceStatusForAnalytics2, stringExtra));
        } else {
            sv90 sv90Var3 = qv90.a;
            ServiceStatusForAnalytics serviceStatusForAnalytics3 = ServiceStatusForAnalytics.canceled;
            sv90Var3.getClass();
            reportEvent(sv90.i(serviceStatusForAnalytics3, stringExtra));
        }
        finish();
    }

    public final wy4 getBaseComponent$paymentsdk_release() {
        return (wy4) this.baseComponent.getValue();
    }

    public final pcy getConfig$paymentsdk_release() {
        return (pcy) this.config.getValue();
    }

    public final boolean getDebrandingFlag$paymentsdk_release() {
        Boolean enableDebranding = ((pwf) getBaseComponent$paymentsdk_release()).a().getEnableDebranding();
        return enableDebranding != null ? enableDebranding.booleanValue() : apa1.e(FeatureFlag.DEBRANDING_FLAG);
    }

    /* renamed from: getDismissInterfaceReceiver$paymentsdk_release */
    public abstract BroadcastReceiver getDismissInterfaceReceiver();

    public final mxk getDivKitComponent$paymentsdk_release() {
        return (mxk) this.divKitComponent.getValue();
    }

    /* renamed from: getResultViewModel$paymentsdk_release, reason: from getter */
    public final yr31 getResultViewModel() {
        return this.resultViewModel;
    }

    public final void hideChallenge$paymentsdk_release() {
        View findViewById = getDelegate().findViewById(j9h0.challenge_fragment);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void hideLoading$paymentsdk_release() {
        View findViewById = getDelegate().findViewById(j9h0.loading_fragment_container);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        ExternalConvertibleError c;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 663) {
            xvt xvtVar = tw4.c;
            if (xvtVar != null) {
                zvt zvtVar = xvtVar.e;
                if (zvtVar != null) {
                    if (resultCode != -1) {
                        if (resultCode == 0) {
                            PaymentKitError.Companion.getClass();
                            zvtVar.a(new ExternalConvertibleError(ExternalErrorKind.google_pay, ExternalErrorTrigger.internal_sdk, null, "undo", "GooglePay was undo"));
                        } else if (resultCode != 1) {
                            zvtVar.e = null;
                        } else {
                            Status a = kt3.a(data);
                            if (a == null || a.getStatusCode() != 10) {
                                PaymentKitError.Companion.getClass();
                                c = com.yandex.payment.sdk.core.data.a.c();
                            } else {
                                PaymentKitError.Companion.getClass();
                                c = new ExternalConvertibleError(ExternalErrorKind.google_pay, ExternalErrorTrigger.internal_sdk, null, "developer error", "GooglePay request returned developer error");
                            }
                            zvtVar.a(c);
                        }
                    } else if (data != null) {
                        PaymentData fromIntent = PaymentData.getFromIntent(data);
                        String json2 = fromIntent != null ? fromIntent.toJson() : null;
                        if (json2 == null) {
                            PaymentKitError.Companion.getClass();
                            zvtVar.a(com.yandex.payment.sdk.core.data.a.c());
                        } else {
                            try {
                                String string = new JSONObject(json2).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
                                pac pacVar = zvtVar.e;
                                if (pacVar != null) {
                                    pacVar.onSuccess(string);
                                }
                                zvtVar.e = null;
                            } catch (JSONException unused) {
                                PaymentKitError.Companion.getClass();
                                zvtVar.a(com.yandex.payment.sdk.core.data.a.c());
                            }
                        }
                    } else {
                        PaymentKitError.Companion.getClass();
                        zvtVar.a(com.yandex.payment.sdk.core.data.a.c());
                    }
                }
                xvtVar.e = null;
            }
            tw4.c = null;
        }
        if (requestCode == 1111 && resultCode == 1000) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String token;
        Parcelable[] parcelableArray;
        if (savedInstanceState != null && (parcelableArray = savedInstanceState.getParcelableArray(FLAGS_STATE_KEY)) != null) {
            com.yandex.payment.sdk.xflags.a.a(parcelableArray);
        }
        int a = ckt.a(this);
        setTheme(a);
        getApplicationContext().setTheme(a);
        super.onCreate(savedInstanceState);
        saveActivityResultCanceled();
        getSupportFragmentManager().o.add(this.changeFragmentListener);
        PaymentToken paymentToken = (PaymentToken) getIntent().getParcelableExtra(EXTRA_PAYMENT_TOKEN);
        if (paymentToken != null && (token = paymentToken.getToken()) != null) {
            ((y22) ((pwf) getBaseComponent$paymentsdk_release()).t.get()).b.b("payment_token", token);
        }
        androidx.localbroadcastmanager.content.a.a(this).b(getDismissInterfaceReceiver(), new IntentFilter(NOTIFICATION_DISMISS_PAYMENT_INTERFACE));
        if (!shouldRestorePayment(savedInstanceState)) {
            r991.b = null;
            r991.c = null;
            tw4.c = null;
        }
        if (apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) && apa1.e(FeatureFlag.DIV_KIT_RESULT_FLAG)) {
            new xsf();
            wtf wtfVar = (wtf) ((dzf) getDivKitComponent$paymentsdk_release()).A.get();
            this.resultViewModel = wtfVar != null ? new vtf(wtfVar.a) : null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        androidx.localbroadcastmanager.content.a.a(this).d(getDismissInterfaceReceiver());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.o.remove(this.changeFragmentListener);
        ((u870) ((pwf) getBaseComponent$paymentsdk_release()).g.get()).a();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        sw4 sw4Var;
        super.onNewIntent(intent);
        if (!intent.getBooleanExtra(EXTRA_PAYMENT_PROCESS_FINAL_STATE, false) || (sw4Var = this.finishProcessCallback) == null) {
            return;
        }
        ((c) sw4Var).c((FinishPaymentResult) intent.getParcelableExtra(EXTRA_PAYMENT_FINAL_STATE_RESULT));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IReporter a;
        wb20 wb20Var = wb20.d;
        if (wb20Var != null && (a = wb20Var.a()) != null) {
            a.pauseSession();
        }
        ((y22) ((pwf) getBaseComponent$paymentsdk_release()).c()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Приложение перешло в бэкграунд", "application_did_enter_background"));
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IReporter a;
        super.onResume();
        wb20 wb20Var = wb20.d;
        if (wb20Var != null && (a = wb20Var.a()) != null) {
            a.resumeSession();
        }
        ((y22) ((pwf) getBaseComponent$paymentsdk_release()).c()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Приложение перешло в форграунд", "application_did_enter_foreground"));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelableArray(FLAGS_STATE_KEY, com.yandex.payment.sdk.xflags.a.b());
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (!apa1.e(FeatureFlag.ALLOW_SCREEN_SHOT_FLAG) || isBindFragment()) {
            getWindow().setFlags(8192, 8192);
        } else {
            getWindow().setFlags(0, 8192);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getWindow().setFlags(0, 8192);
    }

    public final void popFragmentBackStack$paymentsdk_release() {
        getSupportFragmentManager().W(1, null);
    }

    public final void putExtraToResult(String key, long value) {
        Intent intent = this.activityResultIntent;
        if (intent != null) {
            intent.putExtra(key, value);
        }
    }

    public final void removeFragment$paymentsdk_release(int fragmentId) {
        Fragment E = getSupportFragmentManager().E(fragmentId);
        if (E != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(getSupportFragmentManager());
            aVar.p(E);
            aVar.l(true, true);
        }
    }

    public final void replaceFragment$paymentsdk_release(Fragment replacement, boolean addToBackStack, int fragmentId) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(getSupportFragmentManager());
        if (addToBackStack) {
            aVar.c(null);
        }
        if (apa1.e(FeatureFlag.FULLSCREEN_FLAG)) {
            aVar.i(img0.enter_from_right, img0.exit_to_left, img0.enter_from_left, img0.exit_to_right);
        }
        aVar.h(fragmentId, replacement, replacement.getClass().getName());
        aVar.l(true, true);
    }

    public final void reportEvent(iho event) {
        ((y22) ((pwf) getBaseComponent$paymentsdk_release()).c()).a(event);
    }

    public final void saveActivityResultError$paymentsdk_release(PaymentKitError error) {
        Intent putExtra = new Intent().putExtra("ERROR", (Parcelable) error);
        String status = error.getStatus();
        saveActivityResult(1, putExtra.putExtra("CODE", status != null ? status : "ERROR").putExtra(IDialogId.INTENT_EXTRA_IN_MESSAGE, error.getMessage()));
    }

    public final void saveActivityResultSuccess$paymentsdk_release(Parcelable data) {
        saveActivityResult(-1, data != null ? new Intent().putExtra("DATA", data) : null);
    }

    public final void setResultViewModel$paymentsdk_release(yr31 yr31Var) {
        this.resultViewModel = yr31Var;
    }

    public boolean shouldRestorePayment(Bundle savedInstanceState) {
        return savedInstanceState != null;
    }

    public final void showChallenge$paymentsdk_release() {
        View findViewById = getDelegate().findViewById(j9h0.challenge_fragment);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    public final void showLoading$paymentsdk_release() {
        View findViewById = getDelegate().findViewById(j9h0.loading_fragment_container);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    public void tryCloseActivity() {
    }
}

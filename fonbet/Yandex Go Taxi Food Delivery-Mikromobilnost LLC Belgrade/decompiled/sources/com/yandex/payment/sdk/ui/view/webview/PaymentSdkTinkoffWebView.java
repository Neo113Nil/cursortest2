package com.yandex.payment.sdk.ui.view.webview;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.xplat.payment.sdk.WebViewTagForAnalytics;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.rwo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@jxi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000f\u0019\u001aB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/webview/PaymentSdkTinkoffWebView;", "Lcom/yandex/payment/sdk/ui/view/webview/PaymentSdkWebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/yandex/payment/sdk/core/data/PaymentSdkEnvironment;", WebViewActivity.KEY_ENVIRONMENT, "Lrwo;", "eventReporter", "Lzy11;", "init", "(Lcom/yandex/payment/sdk/core/data/PaymentSdkEnvironment;Lrwo;)V", "Lcom/yandex/payment/sdk/ui/view/webview/b;", "callback", "setCallback", "(Lcom/yandex/payment/sdk/ui/view/webview/b;)V", "Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "loggingTag", "Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "getLoggingTag", "()Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "Lcom/yandex/payment/sdk/ui/view/webview/b;", "TinkoffState", "com/yandex/payment/sdk/ui/view/webview/a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentSdkTinkoffWebView extends PaymentSdkWebView {
    private b callback;
    private final WebViewTagForAnalytics loggingTag;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/webview/PaymentSdkTinkoffWebView$TinkoffState;", "", "", "value", "Ljava/lang/String;", "Companion", "com/yandex/payment/sdk/ui/view/webview/c", "SUCCESS", "APPOINTED", "CANCEL", "REJECT", "ERROR_RESUME", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @jxi
    /* loaded from: classes13.dex */
    public static final class TinkoffState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TinkoffState[] $VALUES;
        public static final TinkoffState APPOINTED;
        public static final TinkoffState CANCEL;
        public static final c Companion;
        public static final TinkoffState ERROR_RESUME;
        public static final TinkoffState REJECT;
        public static final TinkoffState SUCCESS;
        private final String value;

        static {
            TinkoffState tinkoffState = new TinkoffState("SUCCESS", 0, "tinkoff/SUCCESS");
            SUCCESS = tinkoffState;
            TinkoffState tinkoffState2 = new TinkoffState("APPOINTED", 1, "tinkoff/APPOINTED");
            APPOINTED = tinkoffState2;
            TinkoffState tinkoffState3 = new TinkoffState("CANCEL", 2, "tinkoff/CANCEL");
            CANCEL = tinkoffState3;
            TinkoffState tinkoffState4 = new TinkoffState("REJECT", 3, "tinkoff/REJECT");
            REJECT = tinkoffState4;
            TinkoffState tinkoffState5 = new TinkoffState("ERROR_RESUME", 4, "tinkoff/ERROR_RESUME");
            ERROR_RESUME = tinkoffState5;
            TinkoffState[] tinkoffStateArr = {tinkoffState, tinkoffState2, tinkoffState3, tinkoffState4, tinkoffState5};
            $VALUES = tinkoffStateArr;
            $ENTRIES = kotlin.enums.a.a(tinkoffStateArr);
            Companion = new c();
        }

        public TinkoffState(String str, int i, String str2) {
            this.value = str2;
        }

        public static TinkoffState valueOf(String str) {
            return (TinkoffState) Enum.valueOf(TinkoffState.class, str);
        }

        public static TinkoffState[] values() {
            return (TinkoffState[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PaymentSdkTinkoffWebView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final /* synthetic */ b access$getCallback$p(PaymentSdkTinkoffWebView paymentSdkTinkoffWebView) {
        paymentSdkTinkoffWebView.getClass();
        return null;
    }

    @Override // com.yandex.payment.sdk.ui.view.webview.PaymentSdkWebView
    public WebViewTagForAnalytics getLoggingTag() {
        return this.loggingTag;
    }

    @Override // com.yandex.payment.sdk.ui.view.webview.PaymentSdkWebView
    public void init(PaymentSdkEnvironment environment, rwo eventReporter) {
        super.init(environment, eventReporter);
        addJavascriptInterface(new a(this), "Yandex");
    }

    public final void setCallback(b callback) {
    }

    public PaymentSdkTinkoffWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loggingTag = WebViewTagForAnalytics.CREDIT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSdkTinkoffWebView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}

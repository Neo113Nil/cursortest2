package com.yandex.payment.sdk.ui.common;

import com.yandex.payment.sdk.ui.view.Card3DSWebView;
import com.yandex.xplat.payment.sdk.WebViewTagForAnalytics;
import defpackage.b88;
import defpackage.xe51;
import defpackage.ye51;
import defpackage.ze51;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0003\u0017\u0007\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/yandex/payment/sdk/ui/common/YB2FAObservingWebViewFragment;", "Lcom/yandex/payment/sdk/ui/common/WebViewFragment;", "<init>", "()V", "Lb88;", "delegate", "(Lb88;)V", "Lye51;", "callback", "Lzy11;", "setYBChallengeCallback", "(Lye51;)V", "Lcom/yandex/payment/sdk/ui/view/Card3DSWebView;", "it", "onPrepareWebView", "(Lcom/yandex/payment/sdk/ui/view/Card3DSWebView;)V", "Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "loggingTag", "Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "getLoggingTag", "()Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "Lye51;", "Companion", "ze51", "xe51", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YB2FAObservingWebViewFragment extends WebViewFragment {
    public static final xe51 Companion = new xe51();
    private ye51 callback;
    private final WebViewTagForAnalytics loggingTag;

    public YB2FAObservingWebViewFragment() {
        this.loggingTag = WebViewTagForAnalytics.FORM_3DS;
    }

    @Override // com.yandex.payment.sdk.ui.common.WebViewFragment
    public WebViewTagForAnalytics getLoggingTag() {
        return this.loggingTag;
    }

    @Override // com.yandex.payment.sdk.ui.common.WebViewFragment
    public void onPrepareWebView(Card3DSWebView it) {
        super.onPrepareWebView(it);
        it.addJavascriptInterface(new ze51(this), "ybChallengeNativeObserver");
    }

    public final void setYBChallengeCallback(ye51 callback) {
        this.callback = callback;
    }

    public YB2FAObservingWebViewFragment(b88 b88Var) {
        this();
        setDelegate(b88Var);
    }
}

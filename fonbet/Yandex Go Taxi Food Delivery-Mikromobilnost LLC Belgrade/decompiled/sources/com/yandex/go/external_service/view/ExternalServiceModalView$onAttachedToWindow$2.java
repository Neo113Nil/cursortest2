package com.yandex.go.external_service.view;

import android.webkit.WebView;
import defpackage.c2p;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/external_service/view/ExternalServiceModalView$onAttachedToWindow$2", "Landroid/webkit/WebView$VisualStateCallback;", "", "requestId", "Lzy11;", "onComplete", "(J)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExternalServiceModalView$onAttachedToWindow$2 extends WebView.VisualStateCallback {
    final /* synthetic */ long $visualStateRequestId;
    final /* synthetic */ ExternalServiceModalView this$0;

    public ExternalServiceModalView$onAttachedToWindow$2(long j, ExternalServiceModalView externalServiceModalView) {
        this.$visualStateRequestId = j;
        this.this$0 = externalServiceModalView;
    }

    @Override // android.webkit.WebView.VisualStateCallback
    public void onComplete(long requestId) {
        WebView webView;
        if (requestId == this.$visualStateRequestId && this.this$0.isAttachedToWindow()) {
            webView = this.this$0.getWebView();
            webView.getHandler().post(new c2p(this.this$0, 1));
        }
    }
}

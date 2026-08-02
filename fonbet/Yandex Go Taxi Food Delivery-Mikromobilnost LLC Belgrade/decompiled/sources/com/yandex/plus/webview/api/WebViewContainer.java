package com.yandex.plus.webview.api;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bb1;
import defpackage.dah0;
import defpackage.kgx;
import defpackage.lmh0;
import defpackage.qoi0;
import defpackage.wv5;
import defpackage.xzr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/yandex/plus/webview/api/WebViewContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/webkit/WebView;", "webView$delegate", "Lwv5;", "getWebView", "()Landroid/webkit/WebView;", "webView", "plus-core-webview-contracts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewContainer extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties;

    /* renamed from: webView$delegate, reason: from kotlin metadata */
    private final wv5 webView;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("webView", 0, "getWebView()Landroid/webkit/WebView;", WebViewContainer.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
    }

    public WebViewContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.webView = new wv5(new xzr(this, dah0.plus_webview, 7));
        bb1.v(this, lmh0.plus_sdk_webview, true);
    }

    public final WebView getWebView() {
        return (WebView) this.webView.a($$delegatedProperties[0]);
    }

    public WebViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public WebViewContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ WebViewContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public WebViewContainer(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}

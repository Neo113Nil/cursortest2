package com.yandex.passport.internal.warm;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/passport/internal/warm/WarmUpContent;", "Landroid/widget/FrameLayout;", "Lcom/yandex/passport/internal/warm/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/webkit/WebView;", "warmWebView", "Landroid/webkit/WebView;", "getWarmWebView", "()Landroid/webkit/WebView;", "Landroid/view/View;", "theRootView", "Landroid/view/View;", "getTheRootView", "()Landroid/view/View;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WarmUpContent extends FrameLayout implements a {
    public static final int $stable = 8;
    private final View theRootView;
    private final WebView warmWebView;

    public WarmUpContent(Context context) {
        super(context);
        this.warmWebView = new WebView(context);
        this.theRootView = this;
        getWarmWebView().getSettings().setJavaScriptEnabled(true);
        addView(getWarmWebView(), new FrameLayout.LayoutParams(-1, -1));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.yandex.passport.internal.warm.a
    public View getTheRootView() {
        return this.theRootView;
    }

    @Override // com.yandex.passport.internal.warm.a
    public WebView getWarmWebView() {
        return this.warmWebView;
    }
}

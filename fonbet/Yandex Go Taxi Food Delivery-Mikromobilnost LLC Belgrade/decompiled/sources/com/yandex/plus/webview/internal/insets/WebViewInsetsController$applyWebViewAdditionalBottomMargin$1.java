package com.yandex.plus.webview.internal.insets;

import android.view.View;
import defpackage.qq41;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/yandex/plus/webview/internal/insets/WebViewInsetsController$applyWebViewAdditionalBottomMargin$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "plus-core-webview-contracts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewInsetsController$applyWebViewAdditionalBottomMargin$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ WebViewInsetsController$OnFooterVisibilityChangeListener $footerVisibilityListener;
    final /* synthetic */ qq41 this$0;

    public WebViewInsetsController$applyWebViewAdditionalBottomMargin$1(qq41 qq41Var, WebViewInsetsController$OnFooterVisibilityChangeListener webViewInsetsController$OnFooterVisibilityChangeListener) {
        this.this$0 = qq41Var;
        this.$footerVisibilityListener = webViewInsetsController$OnFooterVisibilityChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        qq41.a(this.this$0).getViewTreeObserver().addOnGlobalLayoutListener(this.$footerVisibilityListener);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        qq41.a(this.this$0).getViewTreeObserver().removeOnGlobalLayoutListener(this.$footerVisibilityListener);
    }
}

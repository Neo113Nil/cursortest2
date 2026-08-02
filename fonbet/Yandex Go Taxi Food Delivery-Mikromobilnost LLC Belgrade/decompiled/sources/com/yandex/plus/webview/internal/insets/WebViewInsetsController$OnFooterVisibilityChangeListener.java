package com.yandex.plus.webview.internal.insets;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.ay60;
import defpackage.ny61;
import defpackage.qq41;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/yandex/plus/webview/internal/insets/WebViewInsetsController$OnFooterVisibilityChangeListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lay60;", "onFooterShownWebViewBottomMargin", "<init>", "(Lqq41;Lay60;)V", "Landroid/view/ViewGroup;", "container", "", "toPx", "(Lay60;Landroid/view/ViewGroup;)I", "Lzy11;", "onGlobalLayout", "()V", "Lay60;", "", "isFooterVisible", "Z", "plus-core-webview-contracts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebViewInsetsController$OnFooterVisibilityChangeListener implements ViewTreeObserver.OnGlobalLayoutListener {
    private boolean isFooterVisible;
    private final ay60 onFooterShownWebViewBottomMargin;
    final /* synthetic */ qq41 this$0;

    public WebViewInsetsController$OnFooterVisibilityChangeListener(qq41 qq41Var, ay60 ay60Var) {
        this.this$0 = qq41Var;
    }

    private final int toPx(ay60 ay60Var, ViewGroup viewGroup) {
        return 0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean z = qq41.a(this.this$0).getVisibility() == 0;
        boolean z2 = this.isFooterVisible;
        if (z != z2) {
            this.isFooterVisible = !z2;
            int px = !z2 ? toPx(null, qq41.a(this.this$0)) : 0;
            WebView webView = this.this$0.a.getWebView();
            qq41 qq41Var = this.this$0;
            ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            WebViewContainer webViewContainer = qq41Var.a;
            WebViewContainer webViewContainer2 = qq41Var.a;
            ViewGroup.LayoutParams layoutParams2 = webViewContainer.getWebView().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams3 = webViewContainer2.getWebView().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i2 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
            ViewGroup.LayoutParams layoutParams4 = webViewContainer2.getWebView().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            marginLayoutParams.setMargins(i, i2, marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0, px);
            webView.setLayoutParams(marginLayoutParams);
        }
    }
}

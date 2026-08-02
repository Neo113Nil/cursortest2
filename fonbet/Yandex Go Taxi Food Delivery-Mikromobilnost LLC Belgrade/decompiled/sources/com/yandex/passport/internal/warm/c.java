package com.yandex.passport.internal.warm;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class c extends t2y implements a {
    public final WebView c;
    public final View w;

    /* JADX WARN: Multi-variable type inference failed */
    public c(WarmUpWebViewActivity warmUpWebViewActivity) {
        super(warmUpWebViewActivity);
        View view = (View) WarmUpWebViewActivityUi$special$$inlined$webView$default$1.b.invoke(wj91.e(0, warmUpWebViewActivity), 0, 0);
        if (this instanceof lzx) {
            ((lzx) this).addToParent(view);
        }
        this.c = (WebView) view;
        this.w = getRoot();
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        frameLayoutBuilder.invoke(this.c, new com.yandex.passport.internal.ui.bouncer.roundabout.items.a(frameLayoutBuilder, 1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = -1;
        frameLayoutBuilder.setLayoutParams(layoutParams);
        return frameLayoutBuilder;
    }

    @Override // com.yandex.passport.internal.warm.a
    public final View getTheRootView() {
        return this.w;
    }

    @Override // com.yandex.passport.internal.warm.a
    public final WebView getWarmWebView() {
        return this.c;
    }
}

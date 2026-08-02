package com.yandex.android.webview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.in50;
import defpackage.in51;
import defpackage.nn41;
import defpackage.vq41;
import defpackage.z83;

/* loaded from: classes11.dex */
public class YandexWebView extends FrameLayout {
    private final nn41 mController;

    public YandexWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getDefaultWebKitSure();
        throw null;
    }

    private static vq41 getDefaultWebKitSure() {
        throw new IllegalStateException("Default web view kit is not provided yet. Please set default kit by WebViewKit.setDefaultWebViewKit.");
    }

    public nn41 getController() {
        return null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        throw null;
    }

    @Override // android.view.View
    public void setLongClickable(boolean z) {
        z83.j("You probably want to use WebViewController.setPageLongClickListener() instead");
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z83.j("You probably want WebViewController.setPageLongClickListener() instead");
    }

    public YandexWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YandexWebView(Context context) {
        this(context, null);
    }

    public YandexWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        getDefaultWebKitSure();
        throw null;
    }

    public YandexWebView(Context context, in51 in51Var, in50 in50Var) {
        super(context);
        in51Var.a();
    }
}

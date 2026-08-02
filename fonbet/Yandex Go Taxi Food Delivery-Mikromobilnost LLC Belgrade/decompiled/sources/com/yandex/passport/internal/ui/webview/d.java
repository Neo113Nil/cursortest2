package com.yandex.passport.internal.ui.webview;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.internal.core.accounts.p;

/* loaded from: classes2.dex */
public final class d {
    public final ConstraintLayout a;
    public final View b;
    public final View c;
    public final p d;
    public final WebView e;

    public d(ConstraintLayout constraintLayout, Toolbar toolbar, View view, p pVar, WebView webView) {
        this.a = constraintLayout;
        this.b = toolbar;
        this.c = view;
        this.d = pVar;
        this.e = webView;
        webView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.passport.internal.ui.webview.WebViewActivityViewController$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                int width = view2.getWidth();
                int height = view2.getHeight();
                d.this.getClass();
                outline.setRoundRect(0, 0, width, height, 0.0f);
            }
        });
    }

    public final void a(int i) {
        p pVar = this.d;
        ((View) pVar.a).setVisibility(0);
        ((TextView) pVar.b).setText(i);
        this.c.setVisibility(8);
        this.e.setVisibility(8);
    }
}

package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import defpackage.tls;
import defpackage.uc20;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayoutBuilder b;

    public /* synthetic */ a(FrameLayoutBuilder frameLayoutBuilder, int i) {
        this.a = i;
        this.b = frameLayoutBuilder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        FrameLayoutBuilder frameLayoutBuilder = this.b;
        switch (i) {
            case 0:
                TextView textView = (TextView) obj;
                ViewGroup.LayoutParams generateLayoutParams = frameLayoutBuilder.generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
                layoutParams.width = -1;
                layoutParams.height = -2;
                textView.setLayoutParams(generateLayoutParams);
                textView.setMinHeight((int) (56.0f * uc20.a.density));
                break;
            default:
                WebView webView = (WebView) obj;
                ViewGroup.LayoutParams generateLayoutParams2 = frameLayoutBuilder.generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) generateLayoutParams2;
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                webView.setLayoutParams(generateLayoutParams2);
                webView.getSettings().setJavaScriptEnabled(true);
                break;
        }
        return zy11Var;
    }
}

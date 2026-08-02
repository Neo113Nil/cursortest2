package com.yandex.quark.webchat;

import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.quark.utils.extension.InsetsExtensionsKt$requestInsetsOnAttach$1;
import com.yandex.quark.webchat.webview.WebChatContainerView;
import defpackage.b64;
import defpackage.hg41;
import defpackage.i3f;
import defpackage.sfs;
import defpackage.u1w;
import defpackage.vuu0;
import defpackage.y3x0;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class i {
    public final hg41 a;
    public u1w b;
    public WebViewInsetsController$LastPageState c = WebViewInsetsController$LastPageState.Initial;

    public i(WebChatContainerView webChatContainerView, hg41 hg41Var) {
        this.a = hg41Var;
        sfs sfsVar = new sfs(1, this);
        u1w c = u1w.c(webChatContainerView.getPaddingLeft(), webChatContainerView.getPaddingTop(), webChatContainerView.getPaddingRight(), webChatContainerView.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = webChatContainerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = webChatContainerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = webChatContainerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = webChatContainerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        i3f i3fVar = new i3f(4, sfsVar, c, u1w.c(i, i2, i3, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0));
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(webChatContainerView, i3fVar);
        webChatContainerView.addOnAttachStateChangeListener(new InsetsExtensionsKt$requestInsetsOnAttach$1());
        if (webChatContainerView.isAttachedToWindow()) {
            webChatContainerView.requestApplyInsets();
        }
    }

    public final void a() {
        u1w u1wVar = this.b;
        if (this.c != WebViewInsetsController$LastPageState.Started) {
            u1wVar = null;
        }
        if (u1wVar == null) {
            return;
        }
        WebView webView = ((y3x0) this.a).e;
        float f = webView.getResources().getDisplayMetrics().density;
        int i = (int) (u1wVar.a / f);
        int i2 = (int) (u1wVar.c / f);
        StringBuilder s = b64.s((int) (u1wVar.b / f), (int) (u1wVar.d / f), "\n            (function() {\n                if (window.__quarkCurrentInsetsListener) {\n                    document.removeEventListener('DOMContentLoaded', window.__quarkCurrentInsetsListener);\n                    window.__quarkCurrentInsetsListener = null;\n                }\n\n                function setInsets() {\n                    document.documentElement.style.setProperty('--safe-area-inset-top', '", "px');\n                    document.documentElement.style.setProperty('--safe-area-inset-bottom', '", "px');\n                    document.documentElement.style.setProperty('--safe-area-inset-left', '");
        s.append(i);
        s.append("px');\n                    document.documentElement.style.setProperty('--safe-area-inset-right', '");
        s.append(i2);
        s.append("px');\n                    window.__quarkCurrentInsetsListener = null;\n                }\n\n                if (document.readyState === 'loading') {\n                    window.__quarkCurrentInsetsListener = setInsets;\n                    document.addEventListener(\n                        'DOMContentLoaded',\n                        window.__quarkCurrentInsetsListener,\n                        { once: true }\n                    );\n                } else {\n                    setInsets();\n                }\n            })();\n        ");
        webView.evaluateJavascript(vuu0.c(s.toString()), null);
    }
}

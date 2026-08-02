package com.yandex.quark.webchat;

import android.webkit.WebView;
import defpackage.se41;
import defpackage.sls;
import defpackage.y3x0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class WebChatViewControllerImpl$observeLifecycle$1$authInvalidReloadObserver$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        WebView webView = ((y3x0) ((se41) this.receiver).a()).e;
        webView.clearCache(true);
        webView.reload();
        return zy11.a;
    }
}

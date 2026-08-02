package com.yandex.passport.internal.ui.bouncer.chooser;

import android.webkit.WebView;
import com.yandex.passport.sloth.ui.webview.WebViewController;
import defpackage.mnq0;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ f(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 execJsAsync$lambda$6;
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                androidx.compose.ui.semantics.f.o((mnq0) obj, str);
                return zy11.a;
            case 1:
                return new com.yandex.passport.internal.ui.challenge.vpn.a0((com.yandex.passport.internal.ui.challenge.vpn.o) ((com.yandex.passport.internal.ui.challenge.vpn.c0) com.yandex.passport.internal.di.a.a().getVpnChallengeViewModelFactory()).a.a.get(), str);
            default:
                execJsAsync$lambda$6 = WebViewController.execJsAsync$lambda$6(str, (WebView) obj);
                return execJsAsync$lambda$6;
        }
    }
}

package com.yandex.go.superapp.web.view;

import android.content.Context;
import android.view.ContextThemeWrapper;
import defpackage.bv41;
import defpackage.dy60;
import defpackage.exu0;
import defpackage.hhs0;
import defpackage.j5z;
import defpackage.lg21;
import defpackage.ly60;
import defpackage.o3h;
import defpackage.o7w0;
import defpackage.pux0;
import defpackage.r7w0;
import defpackage.s7w0;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.w511;
import java.util.Collections;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.fragment.common.BaseWebChromeClient;
import ru.yandex.taxi.fragment.common.b;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;

/* loaded from: classes12.dex */
public final class a {
    public final Context a;
    public final tse b;
    public final b c;
    public final o3h d;
    public final bv41 e;
    public final f f;
    public final j5z g;
    public final lg21 h;
    public final exu0 i;
    public final v7j0 j;
    public final o7w0 k;

    public a(Context context, tse tseVar, b bVar, o3h o3hVar, bv41 bv41Var, f fVar, j5z j5zVar, lg21 lg21Var, exu0 exu0Var, v7j0 v7j0Var, o7w0 o7w0Var) {
        this.a = context;
        this.b = tseVar;
        this.c = bVar;
        this.d = o3hVar;
        this.e = bv41Var;
        this.f = fVar;
        this.g = j5zVar;
        this.h = lg21Var;
        this.i = exu0Var;
        this.j = v7j0Var;
        this.k = o7w0Var;
    }

    public static SuperAppWebView a(a aVar, WebViewThemeChangeMode webViewThemeChangeMode, dy60 dy60Var, ly60 ly60Var, s7w0 s7w0Var, int i) {
        Context context;
        dy60 dy60Var2 = (i & 2) != 0 ? null : dy60Var;
        ly60 ly60Var2 = (i & 4) != 0 ? null : ly60Var;
        boolean z = (i & 8) == 0;
        s7w0 s7w0Var2 = (i & 16) != 0 ? null : s7w0Var;
        Context context2 = aVar.a;
        int i2 = r7w0.a[webViewThemeChangeMode.ordinal()];
        if (i2 == 1 || i2 == 2) {
            context = context2;
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            context = new ContextThemeWrapper(context2, aVar.i.a(ThemeType.LIGHT).b);
        }
        SuperAppWebView superAppWebView = new SuperAppWebView(context, new hhs0(17, aVar.f, Collections.singletonList(aVar.k)), aVar.e, aVar.g, webViewThemeChangeMode);
        if (dy60Var2 != null) {
            superAppWebView.getSettings().setSupportMultipleWindows(true);
        }
        superAppWebView.getSettings().setOffscreenPreRaster(z);
        BaseWebChromeClient baseWebChromeClient = new BaseWebChromeClient(aVar.b, ly60Var2);
        baseWebChromeClient.setFileChooserHandler(aVar.c);
        baseWebChromeClient.setOnCreateWindowDelegate(dy60Var2);
        baseWebChromeClient.setRequestPermissionInteractor(aVar.j);
        superAppWebView.setWebChromeClient(baseWebChromeClient);
        ((pux0) aVar.d).getClass();
        superAppWebView.setSupportedDeeplinkSchemes(pux0.b);
        superAppWebView.setIntentHandleListener(new SuperAppWebViewFactoryImpl$create$1$2(1, aVar.h, lg21.class, "openUrl", "openUrl(Ljava/lang/String;)Z", 8));
        superAppWebView.setLoadingListener(s7w0Var2);
        return superAppWebView;
    }
}

package com.yandex.passport.internal.ui.social.authenticators;

import android.content.Context;
import android.os.Bundle;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;
import com.yandex.passport.legacy.lx.j;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements j {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f w;

    public /* synthetic */ b(f fVar, String str, String str2, int i) {
        this.a = i;
        this.w = fVar;
        this.b = str;
        this.c = str2;
    }

    @Override // com.yandex.passport.legacy.lx.j
    public final Object a(Object obj) {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        f fVar = this.w;
        switch (i) {
            case 0:
                c cVar = (c) fVar;
                Context context = (Context) obj;
                com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                LoginProperties loginProperties = cVar.b;
                PassportEnvironmentImpl primaryEnvironment = loginProperties.getFilter().getPrimaryEnvironment();
                PassportTheme theme = loginProperties.getTheme();
                WebCaseType webCaseType = WebCaseType.NATIVE_SOCIAL_AUTH;
                SocialConfiguration socialConfiguration = cVar.c;
                Bundle bundle = new Bundle();
                bundle.putParcelable("social-provider", socialConfiguration);
                bundle.putString("social-token", str2);
                bundle.putString("application-client-id", str);
                return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, context, theme, webCaseType, bundle);
            default:
                e eVar = (e) fVar;
                Context context2 = (Context) obj;
                com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                LoginProperties loginProperties2 = eVar.b;
                PassportEnvironmentImpl primaryEnvironment2 = loginProperties2.getFilter().getPrimaryEnvironment();
                PassportTheme theme2 = loginProperties2.getTheme();
                WebCaseType webCaseType2 = WebCaseType.BIND_SOCIAL_NATIVE;
                SocialConfiguration socialConfiguration2 = eVar.c;
                MasterToken masterToken = eVar.F;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("social-provider", socialConfiguration2);
                bundle2.putString("social-token", str2);
                bundle2.putString("application-id", str);
                bundle2.putString("master-token", masterToken.getRawValue());
                return com.yandex.passport.internal.ui.webview.b.b(bVar2, primaryEnvironment2, context2, theme2, webCaseType2, bundle2);
        }
    }
}

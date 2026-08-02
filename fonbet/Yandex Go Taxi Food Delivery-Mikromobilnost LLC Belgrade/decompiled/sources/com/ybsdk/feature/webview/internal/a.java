package com.ybsdk.feature.webview.internal;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.adjust.sdk.Constants;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.di.modules.features.x;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import com.ybsdk.feature.webview.internal.utils.b;
import com.ybsdk.rconfig.configs.YbWebCookieDomainsPrepareConfig;
import defpackage.gw41;
import defpackage.if8;
import defpackage.it41;
import defpackage.iz51;
import defpackage.jt41;
import defpackage.kcs;
import defpackage.np41;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tc9;
import defpackage.vop0;
import defpackage.w511;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a implements np41, kcs {
    public final /* synthetic */ tc9 a;
    public final vop0 b;
    public final if8 c;
    public final x d;
    public final AppAnalyticsReporter e;
    public final b f;

    public a(vop0 vop0Var, jt41 jt41Var, if8 if8Var, x xVar, AppAnalyticsReporter appAnalyticsReporter, b bVar, Map map) {
        this.a = new tc9(map, 10);
        this.b = vop0Var;
        this.c = if8Var;
        this.d = xVar;
        this.e = appAnalyticsReporter;
        this.f = bVar;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final List b() {
        return ((YbWebCookieDomainsPrepareConfig) this.c.a.d(iz51.a).getData()).getDomains();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007d -> B:10:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        WebViewFeatureImpl$reportCookieStorage$1 webViewFeatureImpl$reportCookieStorage$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof WebViewFeatureImpl$reportCookieStorage$1) {
            webViewFeatureImpl$reportCookieStorage$1 = (WebViewFeatureImpl$reportCookieStorage$1) continuationImpl;
            int i2 = webViewFeatureImpl$reportCookieStorage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewFeatureImpl$reportCookieStorage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewFeatureImpl$reportCookieStorage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewFeatureImpl$reportCookieStorage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = b().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gw41 gw41Var = (gw41) webViewFeatureImpl$reportCookieStorage$1.L$2;
                    String uri = (String) webViewFeatureImpl$reportCookieStorage$1.L$1;
                    it = (Iterator) webViewFeatureImpl$reportCookieStorage$1.L$0;
                    kotlin.b.b(obj);
                    gw41Var.a(uri, (List) obj, EmptyList.a);
                    if (it.hasNext()) {
                        uri = new Uri.Builder().scheme(Constants.SCHEME).authority((String) it.next()).build().toString();
                        gw41Var = this.e.v0;
                        webViewFeatureImpl$reportCookieStorage$1.L$0 = it;
                        webViewFeatureImpl$reportCookieStorage$1.L$1 = uri;
                        webViewFeatureImpl$reportCookieStorage$1.L$2 = gw41Var;
                        webViewFeatureImpl$reportCookieStorage$1.label = 1;
                        obj = this.f.a(uri, webViewFeatureImpl$reportCookieStorage$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        gw41Var.a(uri, (List) obj, EmptyList.a);
                        if (it.hasNext()) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        webViewFeatureImpl$reportCookieStorage$1 = new WebViewFeatureImpl$reportCookieStorage$1(this, continuationImpl);
        Object obj2 = webViewFeatureImpl$reportCookieStorage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewFeatureImpl$reportCookieStorage$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        WebViewFeatureImpl$warmUpAuthCookies$1 webViewFeatureImpl$warmUpAuthCookies$1;
        int i;
        Iterator it;
        gw41 gw41Var = this.e.v0;
        if (continuationImpl instanceof WebViewFeatureImpl$warmUpAuthCookies$1) {
            webViewFeatureImpl$warmUpAuthCookies$1 = (WebViewFeatureImpl$warmUpAuthCookies$1) continuationImpl;
            int i2 = webViewFeatureImpl$warmUpAuthCookies$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewFeatureImpl$warmUpAuthCookies$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewFeatureImpl$warmUpAuthCookies$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewFeatureImpl$warmUpAuthCookies$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean isEnabled = ((YbWebCookieDomainsPrepareConfig) this.c.a.d(iz51.a).getData()).isEnabled();
                    gw41.f(gw41Var, "start", Boolean.valueOf(isEnabled), null, 54);
                    if (!isEnabled || b().isEmpty()) {
                        gw41.f(gw41Var, "skip", null, null, 60);
                        return zy11Var;
                    }
                    gw41.f(gw41Var, "inject", null, kotlin.collections.a.X(b(), ",", null, null, null, 62), 46);
                    it = b().iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) webViewFeatureImpl$warmUpAuthCookies$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    webViewFeatureImpl$warmUpAuthCookies$1.L$0 = it;
                    webViewFeatureImpl$warmUpAuthCookies$1.label = 1;
                    if (this.d.d(str, webViewFeatureImpl$warmUpAuthCookies$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                gw41.f(gw41Var, "complete", null, null, 62);
                return zy11Var;
            }
        }
        webViewFeatureImpl$warmUpAuthCookies$1 = new WebViewFeatureImpl$warmUpAuthCookies$1(this, continuationImpl);
        Object obj2 = webViewFeatureImpl$warmUpAuthCookies$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewFeatureImpl$warmUpAuthCookies$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        gw41.f(gw41Var, "complete", null, null, 62);
        return zy11Var2;
    }

    public final FragmentScreen e(WebViewScreenParams webViewScreenParams) {
        OpenScreenRequirement openScreenRequirement;
        TransitionPolicyType transitionPolicyType = webViewScreenParams.getShowAsOverlay() ? TransitionPolicyType.POPUP : TransitionPolicyType.DEFAULT;
        WebViewScreenParams.Auth auth = webViewScreenParams.getAuth();
        int i = auth == null ? -1 : it41.a[auth.ordinal()];
        if (i == -1) {
            openScreenRequirement = OpenScreenRequirement.WithYbSession.INSTANCE;
        } else if (i == 1) {
            openScreenRequirement = OpenScreenRequirement.WithoutRequirements.INSTANCE;
        } else if (i == 2) {
            openScreenRequirement = OpenScreenRequirement.WithUid.INSTANCE;
        } else if (i == 3) {
            openScreenRequirement = OpenScreenRequirement.WithYbSession.INSTANCE;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            openScreenRequirement = OpenScreenRequirement.WithBuid.INSTANCE;
        }
        return new FragmentScreen("WebViewScreen", false, webViewScreenParams, transitionPolicyType, qoi0.a(WebViewFragment.class), openScreenRequirement, 2, null);
    }

    public final FragmentScreen f(String str) {
        return e(new WebViewScreenParams(str, false, null, null, null, null, null, null, false, 510, null));
    }
}

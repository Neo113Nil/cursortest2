package com.ybsdk.feature.resolver.internal.interactors;

import android.net.Uri;
import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.c;
import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.resolver.api.LinkResolveType;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import defpackage.bzk0;
import defpackage.c3h;
import defpackage.evu0;
import defpackage.hly;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wlp;
import defpackage.x4c;
import defpackage.zqi0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.resolver.internal.data.a a;
    public final zqi0 b;

    public a(com.ybsdk.feature.resolver.internal.data.a aVar, zqi0 zqi0Var) {
        this.a = aVar;
        this.b = zqi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LinkResolveType linkResolveType, ContinuationImpl continuationImpl) {
        ResolveLinkInteractor$getDeeplink$1 resolveLinkInteractor$getDeeplink$1;
        int i;
        Object failure;
        SessionEntity$Action sessionStateAction;
        if (continuationImpl instanceof ResolveLinkInteractor$getDeeplink$1) {
            resolveLinkInteractor$getDeeplink$1 = (ResolveLinkInteractor$getDeeplink$1) continuationImpl;
            int i2 = resolveLinkInteractor$getDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveLinkInteractor$getDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveLinkInteractor$getDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveLinkInteractor$getDeeplink$1.label;
                if (i == 0) {
                    if (i == 1 || i == 2 || i == 3) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                boolean z = linkResolveType instanceof LinkResolveType.OnboardingDeeplink;
                com.ybsdk.feature.resolver.internal.data.a aVar = this.a;
                if (z) {
                    String onboardingUrl = ((LinkResolveType.OnboardingDeeplink) linkResolveType).getOnboardingUrl();
                    resolveLinkInteractor$getDeeplink$1.label = 1;
                    Object a = aVar.a(onboardingUrl, resolveLinkInteractor$getDeeplink$1);
                    if (a != coroutineSingletons) {
                        return a;
                    }
                } else if (linkResolveType instanceof LinkResolveType.ShortLink) {
                    String shortUrl = ((LinkResolveType.ShortLink) linkResolveType).getShortUrl();
                    resolveLinkInteractor$getDeeplink$1.label = 2;
                    Object c = aVar.c(shortUrl, resolveLinkInteractor$getDeeplink$1);
                    if (c != coroutineSingletons) {
                        return c;
                    }
                } else {
                    if (!(linkResolveType instanceof LinkResolveType.LandingFromStartSession)) {
                        w511.b();
                        return null;
                    }
                    resolveLinkInteractor$getDeeplink$1.label = 3;
                    hly hlyVar = (hly) this.b;
                    AppAnalyticsReporter appAnalyticsReporter = hlyVar.c;
                    InternalSdkState b = hlyVar.a.b();
                    String c2 = b != null ? c.c(b) : null;
                    if (c2 != null && !evu0.J(c2)) {
                        appAnalyticsReporter.o.g(c2);
                        failure = c3h.k(Uri.parse(c2)) ? bzk0.g(Uri.parse(c2), SdkUri$QueryParam.SHOW_SKIP_REGISTRATION).toString() : new DeeplinkAction.WebView(c2, false, WebViewScreenParams.Auth.YANDEX, new WebViewAppearanceOption.NoToolbar(null, false, false, 7, null), null, Boolean.FALSE).getDeeplinkUri().toString();
                    } else if (((CommonFeatureFlag) hlyVar.b.d(wlp.V0).getData()).isEnabled() && (b instanceof InternalSdkState.Ok)) {
                        appAnalyticsReporter.m0.a.a("tech.landing_replaced_with_dashboard", null);
                        failure = new DeeplinkAction.DashboardAction(null, null, null, null, 8, null).getDeeplinkUri().toString();
                    } else {
                        x4c.g("Failed to open OpenLandingFromStartSession deeplink with landing_url", null, kotlin.collections.b.i(new Pair("landing_url", c2), new Pair("s_s_action", (b == null || (sessionStateAction = b.getSessionStateAction()) == null) ? null : sessionStateAction.name())), null, 10);
                        failure = new Result.Failure(new Exception("Failed to open OpenLandingFromStartSession deeplink with landing_url"));
                    }
                    if (failure != coroutineSingletons) {
                        return failure;
                    }
                }
                return coroutineSingletons;
            }
        }
        resolveLinkInteractor$getDeeplink$1 = new ResolveLinkInteractor$getDeeplink$1(this, continuationImpl);
        Object obj2 = resolveLinkInteractor$getDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveLinkInteractor$getDeeplink$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(LinkResolveType linkResolveType, ContinuationImpl continuationImpl) {
        ResolveLinkInteractor$getDeeplinks$1 resolveLinkInteractor$getDeeplinks$1;
        int i;
        if (continuationImpl instanceof ResolveLinkInteractor$getDeeplinks$1) {
            resolveLinkInteractor$getDeeplinks$1 = (ResolveLinkInteractor$getDeeplinks$1) continuationImpl;
            int i2 = resolveLinkInteractor$getDeeplinks$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveLinkInteractor$getDeeplinks$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveLinkInteractor$getDeeplinks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveLinkInteractor$getDeeplinks$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                if (linkResolveType instanceof LinkResolveType.OnboardingDeeplink) {
                    String onboardingUrl = ((LinkResolveType.OnboardingDeeplink) linkResolveType).getOnboardingUrl();
                    resolveLinkInteractor$getDeeplinks$1.label = 1;
                    Object b = this.a.b(onboardingUrl, resolveLinkInteractor$getDeeplinks$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (!(linkResolveType instanceof LinkResolveType.LandingFromStartSession) && !(linkResolveType instanceof LinkResolveType.ShortLink)) {
                    w511.b();
                    return null;
                }
                return new Result.Failure(new IllegalStateException("Called getDeeplinks with type " + linkResolveType));
            }
        }
        resolveLinkInteractor$getDeeplinks$1 = new ResolveLinkInteractor$getDeeplinks$1(this, continuationImpl);
        Object obj2 = resolveLinkInteractor$getDeeplinks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveLinkInteractor$getDeeplinks$1.label;
        if (i == 0) {
        }
    }
}

package com.yandex.go.support.web;

import defpackage.bi41;
import defpackage.dp41;
import defpackage.fqc;
import defpackage.hqc;
import defpackage.id00;
import defpackage.iqc;
import defpackage.jqc;
import defpackage.l7b;
import defpackage.mqc;
import defpackage.ms41;
import defpackage.nma;
import defpackage.ny61;
import defpackage.pqc;
import defpackage.tnh;
import defpackage.to41;
import defpackage.unh;
import defpackage.w030;
import defpackage.yfa;
import defpackage.zm41;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.view.WebViewContainerImpl;

/* loaded from: classes14.dex */
public final class e extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final hqc G;
    public final jqc H;
    public final com.yandex.go.support.web.factory.a I;
    public final zm41 J;
    public final com.yandex.go.support.analytics.a K;
    public final boolean L;
    public WebViewContainerImpl M;

    public e(w030 w030Var, hqc hqcVar, jqc jqcVar, com.yandex.go.support.web.factory.a aVar, zm41 zm41Var, com.yandex.go.support.analytics.a aVar2) {
        super(null);
        this.F = w030Var;
        this.G = hqcVar;
        this.H = jqcVar;
        this.I = aVar;
        this.J = zm41Var;
        this.K = aVar2;
        this.L = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((mqc) obj);
        WebViewContainerImpl webViewContainerImpl = this.M;
        if (webViewContainerImpl != null) {
            webViewContainerImpl.release();
        }
        this.M = null;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(mqc mqcVar, ContinuationImpl continuationImpl) {
        CommonSupportWebRouter$createWebViewContainer$1 commonSupportWebRouter$createWebViewContainer$1;
        int i;
        if (continuationImpl instanceof CommonSupportWebRouter$createWebViewContainer$1) {
            commonSupportWebRouter$createWebViewContainer$1 = (CommonSupportWebRouter$createWebViewContainer$1) continuationImpl;
            int i2 = commonSupportWebRouter$createWebViewContainer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonSupportWebRouter$createWebViewContainer$1.label = i2 - Integer.MIN_VALUE;
                CommonSupportWebRouter$createWebViewContainer$1 commonSupportWebRouter$createWebViewContainer$12 = commonSupportWebRouter$createWebViewContainer$1;
                Object obj = commonSupportWebRouter$createWebViewContainer$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonSupportWebRouter$createWebViewContainer$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = mqcVar.a;
                    fqc fqcVar = mqcVar.c;
                    String str2 = mqcVar.b;
                    CommonSupportWebRouter$createWebViewContainer$uiWebConfig$1 commonSupportWebRouter$createWebViewContainer$uiWebConfig$1 = new CommonSupportWebRouter$createWebViewContainer$uiWebConfig$1(0, this, e.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
                    CommonSupportWebRouter$createWebViewContainer$uiWebConfig$2 commonSupportWebRouter$createWebViewContainer$uiWebConfig$2 = new CommonSupportWebRouter$createWebViewContainer$uiWebConfig$2(1, this, e.class, "onAnalyticsEvent", "onAnalyticsEvent(Ljava/lang/String;)V", 0);
                    commonSupportWebRouter$createWebViewContainer$12.L$0 = null;
                    commonSupportWebRouter$createWebViewContainer$12.label = 1;
                    obj = this.I.b(str, fqcVar, str2, commonSupportWebRouter$createWebViewContainer$uiWebConfig$1, commonSupportWebRouter$createWebViewContainer$uiWebConfig$2, commonSupportWebRouter$createWebViewContainer$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                tnh tnhVar = to41.a;
                unh unhVar = ms41.a;
                return id00.e(this.J, (UiWebViewConfig) obj, bi41.D4, dp41.a, tnhVar, unhVar).c();
            }
        }
        commonSupportWebRouter$createWebViewContainer$1 = new CommonSupportWebRouter$createWebViewContainer$1(this, continuationImpl);
        CommonSupportWebRouter$createWebViewContainer$1 commonSupportWebRouter$createWebViewContainer$122 = commonSupportWebRouter$createWebViewContainer$1;
        Object obj2 = commonSupportWebRouter$createWebViewContainer$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonSupportWebRouter$createWebViewContainer$122.label;
        if (i != 0) {
        }
        tnh tnhVar2 = to41.a;
        unh unhVar2 = ms41.a;
        return id00.e(this.J, (UiWebViewConfig) obj2, bi41.D4, dp41.a, tnhVar2, unhVar2).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(mqc mqcVar, ContinuationImpl continuationImpl) {
        CommonSupportWebRouter$provideModalView$1 commonSupportWebRouter$provideModalView$1;
        int i;
        if (continuationImpl instanceof CommonSupportWebRouter$provideModalView$1) {
            commonSupportWebRouter$provideModalView$1 = (CommonSupportWebRouter$provideModalView$1) continuationImpl;
            int i2 = commonSupportWebRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonSupportWebRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonSupportWebRouter$provideModalView$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonSupportWebRouter$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    commonSupportWebRouter$provideModalView$1.L$0 = null;
                    commonSupportWebRouter$provideModalView$1.label = 1;
                    obj = T(mqcVar, commonSupportWebRouter$provideModalView$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                WebViewContainerImpl webViewContainerImpl = (WebViewContainerImpl) obj;
                this.M = webViewContainerImpl;
                yfa yfaVar = new yfa(this);
                this.H.a.getClass();
                return new CommonSupportWebView(webViewContainerImpl, new iqc(yfaVar), new l7b(24, this), (pqc) ((nma) this.G.a.a).get());
            }
        }
        commonSupportWebRouter$provideModalView$1 = new CommonSupportWebRouter$provideModalView$1(this, continuationImpl);
        Object obj3 = commonSupportWebRouter$provideModalView$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonSupportWebRouter$provideModalView$1.label;
        if (i != 0) {
        }
        WebViewContainerImpl webViewContainerImpl2 = (WebViewContainerImpl) obj3;
        this.M = webViewContainerImpl2;
        yfa yfaVar2 = new yfa(this);
        this.H.a.getClass();
        return new CommonSupportWebView(webViewContainerImpl2, new iqc(yfaVar2), new l7b(24, this), (pqc) ((nma) this.G.a.a).get());
    }
}

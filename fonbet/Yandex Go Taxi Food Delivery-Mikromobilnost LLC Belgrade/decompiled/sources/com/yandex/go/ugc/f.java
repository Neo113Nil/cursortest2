package com.yandex.go.ugc;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.go.ugc.entities.UGCItemExperiment;
import defpackage.a811;
import defpackage.ag41;
import defpackage.avu0;
import defpackage.bs11;
import defpackage.cu41;
import defpackage.cvu0;
import defpackage.ds11;
import defpackage.es11;
import defpackage.evu0;
import defpackage.ff41;
import defpackage.fs11;
import defpackage.gf41;
import defpackage.h55;
import defpackage.hlx0;
import defpackage.i3y;
import defpackage.ih01;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.js11;
import defpackage.lg21;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.po21;
import defpackage.qqo;
import defpackage.qu;
import defpackage.rqo;
import defpackage.scg;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wnt;
import defpackage.xf41;
import defpackage.zy11;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes14.dex */
public final class f extends h55 implements es11 {
    public final ru.yandex.taxi.deeplinks.b D;
    public final ru.yandex.taxi.web.deeplink.a E;
    public final po21 F;
    public final ru.yandex.taxi.am.token.a G;
    public final bs11 H;
    public final hlx0 I;
    public final lg21 J;
    public final qqo K;
    public final i3y L;
    public UgcDeeplinkApi M;

    public f(ru.yandex.taxi.deeplinks.b bVar, ru.yandex.taxi.web.deeplink.a aVar, po21 po21Var, gf41 gf41Var, ru.yandex.taxi.am.token.a aVar2, bs11 bs11Var, hlx0 hlx0Var, lg21 lg21Var, rqo rqoVar) {
        super(null);
        this.D = bVar;
        this.E = aVar;
        this.F = po21Var;
        this.G = aVar2;
        this.H = bs11Var;
        this.I = hlx0Var;
        this.J = lg21Var;
        UGCItemExperiment.Companion.getClass();
        this.K = ((jbh) rqoVar).c(UGCItemExperiment.g);
        this.L = kotlin.a.a(new UgcDeeplinkRouterImpl$webContainerApi$2(0, gf41Var, gf41.class, "createApi", "createApi()Lru/yandex/taxi/web/modal/WebContainerApi;", 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r7.U(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(f fVar, WebViewFromDeeplinkExperiment.a aVar, ContinuationImpl continuationImpl) {
        UgcDeeplinkRouterImpl$refreshToken$1 ugcDeeplinkRouterImpl$refreshToken$1;
        int i;
        Object d;
        Object obj;
        fVar.getClass();
        if (continuationImpl instanceof UgcDeeplinkRouterImpl$refreshToken$1) {
            ugcDeeplinkRouterImpl$refreshToken$1 = (UgcDeeplinkRouterImpl$refreshToken$1) continuationImpl;
            int i2 = ugcDeeplinkRouterImpl$refreshToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ugcDeeplinkRouterImpl$refreshToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ugcDeeplinkRouterImpl$refreshToken$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ugcDeeplinkRouterImpl$refreshToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((ag41) ((scg) fVar.T()).a()).c(cu41.b);
                    ru.yandex.taxi.am.token.a aVar2 = fVar.G;
                    ugcDeeplinkRouterImpl$refreshToken$1.L$0 = aVar;
                    ugcDeeplinkRouterImpl$refreshToken$1.label = 1;
                    d = aVar2.d(false, ugcDeeplinkRouterImpl$refreshToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = ugcDeeplinkRouterImpl$refreshToken$1.L$1;
                        kotlin.b.b(obj2);
                        if (Result.a(obj) != null) {
                            ((ag41) ((scg) fVar.T()).a()).c(cu41.d);
                        }
                        return zy11.a;
                    }
                    aVar = (WebViewFromDeeplinkExperiment.a) ugcDeeplinkRouterImpl$refreshToken$1.L$0;
                    kotlin.b.b(obj2);
                    d = ((Result) obj2).getValue();
                }
                Object obj4 = d;
                WebViewFromDeeplinkExperiment.a aVar3 = aVar;
                obj = obj4;
                if (!(obj instanceof Result.Failure)) {
                    ugcDeeplinkRouterImpl$refreshToken$1.L$0 = null;
                    ugcDeeplinkRouterImpl$refreshToken$1.L$1 = obj;
                    ugcDeeplinkRouterImpl$refreshToken$1.L$2 = null;
                    ugcDeeplinkRouterImpl$refreshToken$1.label = 2;
                }
                if (Result.a(obj) != null) {
                }
                return zy11.a;
            }
        }
        ugcDeeplinkRouterImpl$refreshToken$1 = new UgcDeeplinkRouterImpl$refreshToken$1(fVar, continuationImpl);
        Object obj22 = ugcDeeplinkRouterImpl$refreshToken$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ugcDeeplinkRouterImpl$refreshToken$1.label;
        if (i != 0) {
        }
        Object obj42 = d;
        WebViewFromDeeplinkExperiment.a aVar32 = aVar;
        obj = obj42;
        if (!(obj instanceof Result.Failure)) {
        }
        if (Result.a(obj) != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(f fVar, WebViewFromDeeplinkExperiment.a aVar, Uri uri, js11 js11Var, ContinuationImpl continuationImpl) {
        UgcDeeplinkRouterImpl$withLocation$1 ugcDeeplinkRouterImpl$withLocation$1;
        int i;
        String str;
        String str2;
        po21 po21Var;
        Object failure;
        fVar.getClass();
        try {
            if (continuationImpl instanceof UgcDeeplinkRouterImpl$withLocation$1) {
                ugcDeeplinkRouterImpl$withLocation$1 = (UgcDeeplinkRouterImpl$withLocation$1) continuationImpl;
                int i2 = ugcDeeplinkRouterImpl$withLocation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ugcDeeplinkRouterImpl$withLocation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = ugcDeeplinkRouterImpl$withLocation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ugcDeeplinkRouterImpl$withLocation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        String queryParameter = uri.getQueryParameter("lat");
                        Double i3 = queryParameter != null ? avu0.i(queryParameter) : null;
                        String queryParameter2 = uri.getQueryParameter("lon");
                        Double i4 = queryParameter2 != null ? avu0.i(queryParameter2) : null;
                        str = "lat={lat}&lon={lon}";
                        if (!evu0.y(aVar.b, "lat={lat}&lon={lon}", false)) {
                            return aVar;
                        }
                        if (js11Var == null) {
                            if (i3 == null || i4 == null) {
                                try {
                                    po21Var = fVar.F;
                                    ugcDeeplinkRouterImpl$withLocation$1.L$0 = aVar;
                                    ugcDeeplinkRouterImpl$withLocation$1.L$1 = null;
                                    ugcDeeplinkRouterImpl$withLocation$1.L$2 = null;
                                    ugcDeeplinkRouterImpl$withLocation$1.L$3 = "lat={lat}&lon={lon}";
                                    ugcDeeplinkRouterImpl$withLocation$1.L$4 = null;
                                    ugcDeeplinkRouterImpl$withLocation$1.L$5 = null;
                                    ugcDeeplinkRouterImpl$withLocation$1.label = 1;
                                } catch (Exception e) {
                                    e = e;
                                }
                                try {
                                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(ugcDeeplinkRouterImpl$withLocation$1);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    str2 = "lat={lat}&lon={lon}";
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = "lat={lat}&lon={lon}";
                                    failure = new Result.Failure(e);
                                    str = str2;
                                    js11Var = (js11) (failure instanceof Result.Failure ? null : failure);
                                    if (js11Var == null) {
                                    }
                                    String str3 = aVar.b;
                                    double d = js11Var.a;
                                    double d2 = js11Var.b;
                                    StringBuilder u = oyr.u(d, "lat=", "&lon=");
                                    u.append(d2);
                                    return WebViewFromDeeplinkExperiment.a.a(aVar, cvu0.v(str3, str, u.toString(), false));
                                }
                            } else {
                                js11Var = new js11(i3.doubleValue(), i4.doubleValue());
                            }
                        }
                        String str32 = aVar.b;
                        double d3 = js11Var.a;
                        double d22 = js11Var.b;
                        StringBuilder u2 = oyr.u(d3, "lat=", "&lon=");
                        u2.append(d22);
                        return WebViewFromDeeplinkExperiment.a.a(aVar, cvu0.v(str32, str, u2.toString(), false));
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) ugcDeeplinkRouterImpl$withLocation$1.L$3;
                    aVar = (WebViewFromDeeplinkExperiment.a) ugcDeeplinkRouterImpl$withLocation$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Exception e3) {
                        e = e3;
                        failure = new Result.Failure(e);
                        str = str2;
                        js11Var = (js11) (failure instanceof Result.Failure ? null : failure);
                        if (js11Var == null) {
                        }
                        String str322 = aVar.b;
                        double d32 = js11Var.a;
                        double d222 = js11Var.b;
                        StringBuilder u22 = oyr.u(d32, "lat=", "&lon=");
                        u22.append(d222);
                        return WebViewFromDeeplinkExperiment.a.a(aVar, cvu0.v(str322, str, u22.toString(), false));
                    }
                    mo21 mo21Var = (mo21) obj;
                    failure = new js11(mo21Var.a, mo21Var.b);
                    str = str2;
                    js11Var = (js11) (failure instanceof Result.Failure ? null : failure);
                    if (js11Var == null) {
                        return aVar;
                    }
                    String str3222 = aVar.b;
                    double d322 = js11Var.a;
                    double d2222 = js11Var.b;
                    StringBuilder u222 = oyr.u(d322, "lat=", "&lon=");
                    u222.append(d2222);
                    return WebViewFromDeeplinkExperiment.a.a(aVar, cvu0.v(str3222, str, u222.toString(), false));
                }
            }
            if (i != 0) {
            }
            mo21 mo21Var2 = (mo21) obj;
            failure = new js11(mo21Var2.a, mo21Var2.b);
            str = str2;
            js11Var = (js11) (failure instanceof Result.Failure ? null : failure);
            if (js11Var == null) {
            }
            String str32222 = aVar.b;
            double d3222 = js11Var.a;
            double d22222 = js11Var.b;
            StringBuilder u2222 = oyr.u(d3222, "lat=", "&lon=");
            u2222.append(d22222);
            return WebViewFromDeeplinkExperiment.a.a(aVar, cvu0.v(str32222, str, u2222.toString(), false));
        } catch (CancellationException e4) {
            throw e4;
        }
        ugcDeeplinkRouterImpl$withLocation$1 = new UgcDeeplinkRouterImpl$withLocation$1(fVar, continuationImpl);
        Object obj2 = ugcDeeplinkRouterImpl$withLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ugcDeeplinkRouterImpl$withLocation$1.label;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.M = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ds11 ds11Var = (ds11) obj;
        hlx0 hlx0Var = this.I;
        ih01 ih01Var = (ih01) hlx0Var.x;
        ih01Var.getClass();
        ih01Var.a.a("Ugc.Deeplink", new HashMap(), 1, new HashMap());
        Uri uri = ds11Var.a;
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            String uri2 = uri.toString();
            ih01Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.DEEPLINK, uri2);
            ih01Var.a.a("Ugc.IdMissingInDeeplink", hashMap, 1, new HashMap());
            r(new qu(9));
            return;
        }
        if (!this.G.g()) {
            hlx0Var.l(queryParameter);
            r(new qu(9));
            return;
        }
        ih01Var.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url_id", queryParameter);
        ih01Var.a.a("Ugc.Started", hashMap2, 1, new HashMap());
        tje.N(o(), null, null, new UgcDeeplinkRouterImpl$onLaunch$$inlined$safeCollectIn$1(this.K.a(), null, queryParameter, this, uri, ds11Var), 3);
        tje.N(o(), null, null, new UgcDeeplinkRouterImpl$onLaunch$2(this, queryParameter, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(ContinuationImpl continuationImpl, CoreWebViewConfig.a aVar, WebViewFromDeeplinkExperiment.a aVar2) {
        UgcDeeplinkRouterImpl$addAuthInfo$1 ugcDeeplinkRouterImpl$addAuthInfo$1;
        int i;
        if (continuationImpl instanceof UgcDeeplinkRouterImpl$addAuthInfo$1) {
            ugcDeeplinkRouterImpl$addAuthInfo$1 = (UgcDeeplinkRouterImpl$addAuthInfo$1) continuationImpl;
            int i2 = ugcDeeplinkRouterImpl$addAuthInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ugcDeeplinkRouterImpl$addAuthInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ugcDeeplinkRouterImpl$addAuthInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ugcDeeplinkRouterImpl$addAuthInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ugcDeeplinkRouterImpl$addAuthInfo$1.L$0 = aVar;
                    ugcDeeplinkRouterImpl$addAuthInfo$1.L$1 = null;
                    ugcDeeplinkRouterImpl$addAuthInfo$1.label = 1;
                    return this.E.a(ugcDeeplinkRouterImpl$addAuthInfo$1, aVar, aVar2) == coroutineSingletons ? coroutineSingletons : aVar;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CoreWebViewConfig.a aVar3 = (CoreWebViewConfig.a) ugcDeeplinkRouterImpl$addAuthInfo$1.L$0;
                kotlin.b.b(obj);
                return aVar3;
            }
        }
        ugcDeeplinkRouterImpl$addAuthInfo$1 = new UgcDeeplinkRouterImpl$addAuthInfo$1(this, continuationImpl);
        Object obj2 = ugcDeeplinkRouterImpl$addAuthInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ugcDeeplinkRouterImpl$addAuthInfo$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(WebViewFromDeeplinkExperiment.a aVar, ContinuationImpl continuationImpl) {
        UgcDeeplinkRouterImpl$createConfig$1 ugcDeeplinkRouterImpl$createConfig$1;
        Object obj;
        Object obj2;
        int i;
        WebViewFromDeeplinkExperiment.a aVar2;
        Object d;
        String str;
        UgcDeeplinkApi ugcDeeplinkApi;
        ds11 ds11Var;
        Uri uri;
        if (continuationImpl instanceof UgcDeeplinkRouterImpl$createConfig$1) {
            ugcDeeplinkRouterImpl$createConfig$1 = (UgcDeeplinkRouterImpl$createConfig$1) continuationImpl;
            int i2 = ugcDeeplinkRouterImpl$createConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ugcDeeplinkRouterImpl$createConfig$1.label = i2 - Integer.MIN_VALUE;
                obj = ugcDeeplinkRouterImpl$createConfig$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ugcDeeplinkRouterImpl$createConfig$1.label;
                String str2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar2 = aVar;
                    ugcDeeplinkRouterImpl$createConfig$1.L$0 = aVar2;
                    ugcDeeplinkRouterImpl$createConfig$1.label = 1;
                    d = this.G.d(false, ugcDeeplinkRouterImpl$createConfig$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) ugcDeeplinkRouterImpl$createConfig$1.L$1;
                        kotlin.b.b(obj);
                        CoreWebViewConfig.a aVar3 = (CoreWebViewConfig.a) obj;
                        aVar3.e = false;
                        aVar3.c = str;
                        aVar3.f = true;
                        aVar3.h = true;
                        ugcDeeplinkApi = this.M;
                        if (ugcDeeplinkApi != null) {
                            aVar3.k = ugcDeeplinkApi;
                        }
                        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar3.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                        ds11Var = (ds11) this.x;
                        if (ds11Var != null && (uri = ds11Var.a) != null) {
                            str2 = uri.getQueryParameter("presentation_mode");
                        }
                        boolean l = jl40.l(str2, Constants.PUSH);
                        uiWebViewConfig.setShouldShowCloseButton(false);
                        uiWebViewConfig.setShouldShowToolbar(false);
                        uiWebViewConfig.setArrowHidden(false);
                        uiWebViewConfig.setBackStackAware(false);
                        uiWebViewConfig.setHasTitleFromWeb(true);
                        uiWebViewConfig.setModalViewMode(l ? new UiWebViewConfig.Slideable(false, null, true, false, 10, null) : UiWebViewConfig.Fullscreen.INSTANCE);
                        uiWebViewConfig.setAnimateOnAppearing(true);
                        return uiWebViewConfig;
                    }
                    WebViewFromDeeplinkExperiment.a aVar4 = (WebViewFromDeeplinkExperiment.a) ugcDeeplinkRouterImpl$createConfig$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                    aVar2 = aVar4;
                }
                if (d instanceof Result.Failure) {
                    d = null;
                }
                String str3 = (String) d;
                fs11 fs11Var = new fs11(this, aVar2);
                a811 a811Var = this.H.a;
                this.M = new UgcDeeplinkApi(fs11Var, (tt2) a811Var.a.get(), (wnt) a811Var.b.get());
                CoreWebViewConfig.a aVar5 = new CoreWebViewConfig.a();
                ugcDeeplinkRouterImpl$createConfig$1.L$0 = null;
                ugcDeeplinkRouterImpl$createConfig$1.L$1 = str3;
                ugcDeeplinkRouterImpl$createConfig$1.label = 2;
                obj = R(ugcDeeplinkRouterImpl$createConfig$1, aVar5, aVar2);
                if (obj != obj2) {
                    str = str3;
                    CoreWebViewConfig.a aVar32 = (CoreWebViewConfig.a) obj;
                    aVar32.e = false;
                    aVar32.c = str;
                    aVar32.f = true;
                    aVar32.h = true;
                    ugcDeeplinkApi = this.M;
                    if (ugcDeeplinkApi != null) {
                    }
                    UiWebViewConfig uiWebViewConfig2 = new UiWebViewConfig(aVar32.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                    ds11Var = (ds11) this.x;
                    if (ds11Var != null) {
                        str2 = uri.getQueryParameter("presentation_mode");
                    }
                    boolean l2 = jl40.l(str2, Constants.PUSH);
                    uiWebViewConfig2.setShouldShowCloseButton(false);
                    uiWebViewConfig2.setShouldShowToolbar(false);
                    uiWebViewConfig2.setArrowHidden(false);
                    uiWebViewConfig2.setBackStackAware(false);
                    uiWebViewConfig2.setHasTitleFromWeb(true);
                    uiWebViewConfig2.setModalViewMode(l2 ? new UiWebViewConfig.Slideable(false, null, true, false, 10, null) : UiWebViewConfig.Fullscreen.INSTANCE);
                    uiWebViewConfig2.setAnimateOnAppearing(true);
                    return uiWebViewConfig2;
                }
                return obj2;
            }
        }
        ugcDeeplinkRouterImpl$createConfig$1 = new UgcDeeplinkRouterImpl$createConfig$1(this, continuationImpl);
        obj = ugcDeeplinkRouterImpl$createConfig$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ugcDeeplinkRouterImpl$createConfig$1.label;
        String str22 = null;
        if (i != 0) {
        }
        if (d instanceof Result.Failure) {
        }
        String str32 = (String) d;
        fs11 fs11Var2 = new fs11(this, aVar2);
        a811 a811Var2 = this.H.a;
        this.M = new UgcDeeplinkApi(fs11Var2, (tt2) a811Var2.a.get(), (wnt) a811Var2.b.get());
        CoreWebViewConfig.a aVar52 = new CoreWebViewConfig.a();
        ugcDeeplinkRouterImpl$createConfig$1.L$0 = null;
        ugcDeeplinkRouterImpl$createConfig$1.L$1 = str32;
        ugcDeeplinkRouterImpl$createConfig$1.label = 2;
        obj = R(ugcDeeplinkRouterImpl$createConfig$1, aVar52, aVar2);
        if (obj != obj2) {
        }
        return obj2;
    }

    public final ff41 T() {
        return (ff41) this.L.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(WebViewFromDeeplinkExperiment.a aVar, ContinuationImpl continuationImpl) {
        UgcDeeplinkRouterImpl$successRefreshToken$1 ugcDeeplinkRouterImpl$successRefreshToken$1;
        int i;
        xf41 xf41Var;
        if (continuationImpl instanceof UgcDeeplinkRouterImpl$successRefreshToken$1) {
            ugcDeeplinkRouterImpl$successRefreshToken$1 = (UgcDeeplinkRouterImpl$successRefreshToken$1) continuationImpl;
            int i2 = ugcDeeplinkRouterImpl$successRefreshToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ugcDeeplinkRouterImpl$successRefreshToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ugcDeeplinkRouterImpl$successRefreshToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ugcDeeplinkRouterImpl$successRefreshToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ag41 ag41Var = (ag41) ((scg) T()).a();
                    ag41Var.c(cu41.c);
                    ugcDeeplinkRouterImpl$successRefreshToken$1.L$0 = null;
                    ugcDeeplinkRouterImpl$successRefreshToken$1.L$1 = ag41Var;
                    ugcDeeplinkRouterImpl$successRefreshToken$1.L$2 = null;
                    ugcDeeplinkRouterImpl$successRefreshToken$1.L$3 = ag41Var;
                    ugcDeeplinkRouterImpl$successRefreshToken$1.label = 1;
                    Object S = S(aVar, ugcDeeplinkRouterImpl$successRefreshToken$1);
                    if (S == obj2) {
                        return obj2;
                    }
                    obj = S;
                    xf41Var = ag41Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xf41Var = (xf41) ugcDeeplinkRouterImpl$successRefreshToken$1.L$3;
                    kotlin.b.b(obj);
                }
                ((ag41) xf41Var).a((UiWebViewConfig) obj);
                return zy11.a;
            }
        }
        ugcDeeplinkRouterImpl$successRefreshToken$1 = new UgcDeeplinkRouterImpl$successRefreshToken$1(this, continuationImpl);
        Object obj3 = ugcDeeplinkRouterImpl$successRefreshToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ugcDeeplinkRouterImpl$successRefreshToken$1.label;
        if (i != 0) {
        }
        ((ag41) xf41Var).a((UiWebViewConfig) obj3);
        return zy11.a;
    }
}

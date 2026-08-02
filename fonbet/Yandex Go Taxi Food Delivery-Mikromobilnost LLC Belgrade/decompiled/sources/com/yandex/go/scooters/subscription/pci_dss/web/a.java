package com.yandex.go.scooters.subscription.pci_dss.web;

import android.net.Uri;
import com.yandex.go.scooters.subscription.pci_dss.web.js.ScootersSubscriptionJsApi;
import defpackage.ab60;
import defpackage.fn21;
import defpackage.io60;
import defpackage.j5z;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kp50;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.pne;
import defpackage.po21;
import defpackage.u5o;
import defpackage.ua41;
import defpackage.w511;
import defpackage.ypb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class a {
    public final j5z a;
    public final fn21 b;
    public final ru.yandex.taxi.am.token.a c;
    public final po21 d;
    public final o e;

    public a(j5z j5zVar, fn21 fn21Var, ru.yandex.taxi.am.token.a aVar, po21 po21Var, o oVar) {
        this.a = j5zVar;
        this.b = fn21Var;
        this.c = aVar;
        this.d = po21Var;
        this.e = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersSubscriptionWebContainerConfigFactory$addGeoParam$1 scootersSubscriptionWebContainerConfigFactory$addGeoParam$1;
        int i;
        if (continuationImpl instanceof ScootersSubscriptionWebContainerConfigFactory$addGeoParam$1) {
            scootersSubscriptionWebContainerConfigFactory$addGeoParam$1 = (ScootersSubscriptionWebContainerConfigFactory$addGeoParam$1) continuationImpl;
            int i2 = scootersSubscriptionWebContainerConfigFactory$addGeoParam$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionWebContainerConfigFactory$addGeoParam$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionWebContainerConfigFactory$addGeoParam$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionWebContainerConfigFactory$addGeoParam$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersSubscriptionWebContainerConfigFactory$addGeoParam$1.L$0 = str;
                    scootersSubscriptionWebContainerConfigFactory$addGeoParam$1.label = 1;
                    obj = ((e) this.d).h(scootersSubscriptionWebContainerConfigFactory$addGeoParam$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersSubscriptionWebContainerConfigFactory$addGeoParam$1.L$0;
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                return Uri.parse(str).buildUpon().appendQueryParameter("position", mo21Var.b + "," + mo21Var.a).toString();
            }
        }
        scootersSubscriptionWebContainerConfigFactory$addGeoParam$1 = new ScootersSubscriptionWebContainerConfigFactory$addGeoParam$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionWebContainerConfigFactory$addGeoParam$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionWebContainerConfigFactory$addGeoParam$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        return Uri.parse(str).buildUpon().appendQueryParameter("position", mo21Var2.b + "," + mo21Var2.a).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ScootersSubscriptionJsApi scootersSubscriptionJsApi, ContinuationImpl continuationImpl) {
        ScootersSubscriptionWebContainerConfigFactory$create$1 scootersSubscriptionWebContainerConfigFactory$create$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        CoreWebViewConfig.a aVar;
        a aVar2;
        CoreWebViewConfig.a aVar3;
        String Hg;
        if (continuationImpl instanceof ScootersSubscriptionWebContainerConfigFactory$create$1) {
            scootersSubscriptionWebContainerConfigFactory$create$1 = (ScootersSubscriptionWebContainerConfigFactory$create$1) continuationImpl;
            int i2 = scootersSubscriptionWebContainerConfigFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionWebContainerConfigFactory$create$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersSubscriptionWebContainerConfigFactory$create$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionWebContainerConfigFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CoreWebViewConfig.Companion.getClass();
                    CoreWebViewConfig.a aVar4 = new CoreWebViewConfig.a();
                    aVar4.k = scootersSubscriptionJsApi;
                    scootersSubscriptionWebContainerConfigFactory$create$1.L$0 = null;
                    scootersSubscriptionWebContainerConfigFactory$create$1.L$1 = null;
                    scootersSubscriptionWebContainerConfigFactory$create$1.L$2 = aVar4;
                    scootersSubscriptionWebContainerConfigFactory$create$1.L$3 = this;
                    scootersSubscriptionWebContainerConfigFactory$create$1.label = 1;
                    Object a = a(str, scootersSubscriptionWebContainerConfigFactory$create$1);
                    if (a != coroutineSingletons) {
                        aVar = aVar4;
                        obj = a;
                        aVar2 = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar3 = (CoreWebViewConfig.a) scootersSubscriptionWebContainerConfigFactory$create$1.L$2;
                    kotlin.b.b(obj);
                    aVar3.b = (String) obj;
                    ru.yandex.taxi.am.token.a aVar5 = this.c;
                    aVar3.c = aVar5.c();
                    aVar3.b("Authorization", kp50.h(aVar5.c()));
                    Hg = ((h) this.b).Hg();
                    if (Hg == null) {
                        Hg = "";
                    }
                    aVar3.b("X-YaTaxi-UserId", Hg);
                    aVar3.b("Accept-Language", this.a.d());
                    aVar3.b("X-YaTaxi-TZ", String.valueOf(ypb1.d()));
                    aVar3.h = true;
                    aVar3.e = true;
                    return new UiWebViewConfig(aVar3.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, new UiWebViewConfig.Slideable(false, null, false, false, 14, null), false, false, 3538934, null);
                }
                aVar2 = (a) scootersSubscriptionWebContainerConfigFactory$create$1.L$3;
                aVar = (CoreWebViewConfig.a) scootersSubscriptionWebContainerConfigFactory$create$1.L$2;
                kotlin.b.b(obj);
                scootersSubscriptionWebContainerConfigFactory$create$1.L$0 = null;
                scootersSubscriptionWebContainerConfigFactory$create$1.L$1 = null;
                scootersSubscriptionWebContainerConfigFactory$create$1.L$2 = aVar;
                scootersSubscriptionWebContainerConfigFactory$create$1.L$3 = null;
                scootersSubscriptionWebContainerConfigFactory$create$1.label = 2;
                obj = aVar2.c((String) obj, scootersSubscriptionWebContainerConfigFactory$create$1);
                if (obj != coroutineSingletons) {
                    aVar3 = aVar;
                    aVar3.b = (String) obj;
                    ru.yandex.taxi.am.token.a aVar52 = this.c;
                    aVar3.c = aVar52.c();
                    aVar3.b("Authorization", kp50.h(aVar52.c()));
                    Hg = ((h) this.b).Hg();
                    if (Hg == null) {
                    }
                    aVar3.b("X-YaTaxi-UserId", Hg);
                    aVar3.b("Accept-Language", this.a.d());
                    aVar3.b("X-YaTaxi-TZ", String.valueOf(ypb1.d()));
                    aVar3.h = true;
                    aVar3.e = true;
                    return new UiWebViewConfig(aVar3.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, new UiWebViewConfig.Slideable(false, null, false, false, 14, null), false, false, 3538934, null);
                }
                return coroutineSingletons;
            }
        }
        scootersSubscriptionWebContainerConfigFactory$create$1 = new ScootersSubscriptionWebContainerConfigFactory$create$1(this, continuationImpl);
        obj = scootersSubscriptionWebContainerConfigFactory$create$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionWebContainerConfigFactory$create$1.label;
        if (i != 0) {
        }
        scootersSubscriptionWebContainerConfigFactory$create$1.L$0 = null;
        scootersSubscriptionWebContainerConfigFactory$create$1.L$1 = null;
        scootersSubscriptionWebContainerConfigFactory$create$1.L$2 = aVar;
        scootersSubscriptionWebContainerConfigFactory$create$1.L$3 = null;
        scootersSubscriptionWebContainerConfigFactory$create$1.label = 2;
        obj = aVar2.c((String) obj, scootersSubscriptionWebContainerConfigFactory$create$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ScootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1 scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1;
        int i;
        ua41 ua41Var;
        if (continuationImpl instanceof ScootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1) {
            scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1 = (ScootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1) continuationImpl;
            int i2 = scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AuthType authType = AuthType.COOKIES;
                    scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.L$0 = str;
                    scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label = 1;
                    obj = this.e.b(str, authType, scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.L$0;
                    kotlin.b.b(obj);
                }
                ua41Var = (ua41) obj;
                if (!jl40.l(ua41Var, ab60.a) || (ua41Var instanceof u5o)) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    jst.e.k(illegalStateException, ua41Var.toString());
                    throw illegalStateException;
                }
                if (ua41Var instanceof pne) {
                    return ((pne) ua41Var).a;
                }
                if (ua41Var instanceof io60) {
                    return str;
                }
                w511.b();
                return null;
            }
        }
        scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1 = new ScootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label;
        if (i != 0) {
        }
        ua41Var = (ua41) obj2;
        if (jl40.l(ua41Var, ab60.a)) {
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        jst.e.k(illegalStateException2, ua41Var.toString());
        throw illegalStateException2;
    }
}

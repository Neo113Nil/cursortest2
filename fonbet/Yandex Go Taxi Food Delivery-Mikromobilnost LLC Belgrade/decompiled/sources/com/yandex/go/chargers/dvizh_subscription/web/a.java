package com.yandex.go.chargers.dvizh_subscription.web;

import android.net.Uri;
import com.yandex.go.chargers.dvizh_subscription.web.js.ChargersDvizhSubscriptionJsApi;
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
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
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
        ChargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1 chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1;
        int i;
        if (continuationImpl instanceof ChargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1) {
            chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1 = (ChargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1) continuationImpl;
            int i2 = chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1.L$0 = str;
                    chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1.label = 1;
                    obj = ((e) this.d).h(chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1.L$0;
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                return Uri.parse(str).buildUpon().appendQueryParameter("position", mo21Var.b + "," + mo21Var.a).toString();
            }
        }
        chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1 = new ChargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1(this, continuationImpl);
        Object obj2 = chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1.label;
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
    public final Object b(String str, ChargersDvizhSubscriptionJsApi chargersDvizhSubscriptionJsApi, ContinuationImpl continuationImpl) {
        ChargersDvizhSubscriptionWebContainerConfigFactory$create$1 chargersDvizhSubscriptionWebContainerConfigFactory$create$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        CoreWebViewConfig.a aVar;
        a aVar2;
        CoreWebViewConfig.a aVar3;
        String Hg;
        if (continuationImpl instanceof ChargersDvizhSubscriptionWebContainerConfigFactory$create$1) {
            chargersDvizhSubscriptionWebContainerConfigFactory$create$1 = (ChargersDvizhSubscriptionWebContainerConfigFactory$create$1) continuationImpl;
            int i2 = chargersDvizhSubscriptionWebContainerConfigFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDvizhSubscriptionWebContainerConfigFactory$create$1.label = i2 - Integer.MIN_VALUE;
                obj = chargersDvizhSubscriptionWebContainerConfigFactory$create$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDvizhSubscriptionWebContainerConfigFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CoreWebViewConfig.Companion.getClass();
                    CoreWebViewConfig.a aVar4 = new CoreWebViewConfig.a();
                    aVar4.k = chargersDvizhSubscriptionJsApi;
                    chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$0 = null;
                    chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$1 = null;
                    chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$2 = aVar4;
                    chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$3 = this;
                    chargersDvizhSubscriptionWebContainerConfigFactory$create$1.label = 1;
                    Object a = a(str, chargersDvizhSubscriptionWebContainerConfigFactory$create$1);
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
                    aVar3 = (CoreWebViewConfig.a) chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$2;
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
                    TimeZone timeZone = TimeZone.getDefault();
                    aVar3.b("X-YaTaxi-TZ", String.valueOf(timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000));
                    aVar3.h = true;
                    aVar3.e = true;
                    return new UiWebViewConfig(aVar3.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, new UiWebViewConfig.Slideable(false, null, false, false, 14, null), false, true, 1441782, null);
                }
                aVar2 = (a) chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$3;
                aVar = (CoreWebViewConfig.a) chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$2;
                kotlin.b.b(obj);
                chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$0 = null;
                chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$1 = null;
                chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$2 = aVar;
                chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$3 = null;
                chargersDvizhSubscriptionWebContainerConfigFactory$create$1.label = 2;
                obj = aVar2.c((String) obj, chargersDvizhSubscriptionWebContainerConfigFactory$create$1);
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
                    TimeZone timeZone2 = TimeZone.getDefault();
                    aVar3.b("X-YaTaxi-TZ", String.valueOf(timeZone2.getOffset(Calendar.getInstance(timeZone2).getTimeInMillis()) / 1000));
                    aVar3.h = true;
                    aVar3.e = true;
                    return new UiWebViewConfig(aVar3.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, new UiWebViewConfig.Slideable(false, null, false, false, 14, null), false, true, 1441782, null);
                }
                return coroutineSingletons;
            }
        }
        chargersDvizhSubscriptionWebContainerConfigFactory$create$1 = new ChargersDvizhSubscriptionWebContainerConfigFactory$create$1(this, continuationImpl);
        obj = chargersDvizhSubscriptionWebContainerConfigFactory$create$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDvizhSubscriptionWebContainerConfigFactory$create$1.label;
        if (i != 0) {
        }
        chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$0 = null;
        chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$1 = null;
        chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$2 = aVar;
        chargersDvizhSubscriptionWebContainerConfigFactory$create$1.L$3 = null;
        chargersDvizhSubscriptionWebContainerConfigFactory$create$1.label = 2;
        obj = aVar2.c((String) obj, chargersDvizhSubscriptionWebContainerConfigFactory$create$1);
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
        ChargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1 chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1;
        int i;
        ua41 ua41Var;
        if (continuationImpl instanceof ChargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1) {
            chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1 = (ChargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1) continuationImpl;
            int i2 = chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AuthType authType = AuthType.COOKIES;
                    chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.L$0 = str;
                    chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label = 1;
                    obj = this.e.b(str, authType, chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.L$0;
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
        chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1 = new ChargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1(this, continuationImpl);
        Object obj2 = chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDvizhSubscriptionWebContainerConfigFactory$wrapUrlWithCookie$1.label;
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

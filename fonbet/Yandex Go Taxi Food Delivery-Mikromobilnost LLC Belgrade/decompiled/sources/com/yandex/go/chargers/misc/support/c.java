package com.yandex.go.chargers.misc.support;

import android.net.Uri;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.fn21;
import defpackage.gh00;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.rva;
import defpackage.tpr;
import defpackage.v7v0;
import defpackage.vp21;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class c {
    public final ah00 a;
    public final fn21 b;
    public final vp21 c;
    public final atd0 d;
    public final ru.yandex.taxi.am.token.a e;

    public c(ah00 ah00Var, fn21 fn21Var, vp21 vp21Var, atd0 atd0Var, ru.yandex.taxi.am.token.a aVar) {
        this.a = ah00Var;
        this.b = fn21Var;
        this.c = vp21Var;
        this.d = atd0Var;
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, rva rvaVar, ContinuationImpl continuationImpl) {
        ChargersSupportWebViewConfigFactory$createWebViewConfig$1 chargersSupportWebViewConfigFactory$createWebViewConfig$1;
        Object obj;
        int i;
        Uri.Builder buildUpon;
        Object obj2;
        Uri.Builder builder;
        String str2;
        String Og;
        Object d;
        Object obj3;
        Uri.Builder builder2;
        if (continuationImpl instanceof ChargersSupportWebViewConfigFactory$createWebViewConfig$1) {
            chargersSupportWebViewConfigFactory$createWebViewConfig$1 = (ChargersSupportWebViewConfigFactory$createWebViewConfig$1) continuationImpl;
            int i2 = chargersSupportWebViewConfigFactory$createWebViewConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersSupportWebViewConfigFactory$createWebViewConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = chargersSupportWebViewConfigFactory$createWebViewConfig$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersSupportWebViewConfigFactory$createWebViewConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    buildUpon = Uri.parse(str).buildUpon();
                    buildUpon.appendQueryParameter("chargers_user_id", "");
                    if (rvaVar != null) {
                        buildUpon.appendQueryParameter("order_id", rvaVar.a);
                        buildUpon.appendQueryParameter("order_status", rvaVar.b);
                        buildUpon.appendQueryParameter("power_bank_number", rvaVar.c);
                    }
                    chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$0 = null;
                    chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$1 = null;
                    chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$2 = buildUpon;
                    chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$3 = buildUpon;
                    chargersSupportWebViewConfigFactory$createWebViewConfig$1.label = 1;
                    Object b = b(chargersSupportWebViewConfigFactory$createWebViewConfig$1);
                    if (b != obj) {
                        obj2 = b;
                        builder = buildUpon;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    builder2 = (Uri.Builder) chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$2;
                    kotlin.b.b(obj4);
                    obj3 = ((Result) obj4).getValue();
                    String str3 = (String) (obj3 instanceof Result.Failure ? null : obj3);
                    CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                    aVar.b = builder2.toString();
                    aVar.e = false;
                    aVar.c = str3;
                    aVar.b("X-YaTaxi-Authorization", kp50.h(str3));
                    String Hg = ((h) this.b).Hg();
                    aVar.b("X-YaTaxi-UserId", Hg != null ? Hg : "");
                    aVar.g = true;
                    UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                    uiWebViewConfig.setHasTitleFromWeb(true);
                    uiWebViewConfig.setShouldShowCloseButton(true);
                    uiWebViewConfig.setCloseButtonPosition(1);
                    uiWebViewConfig.setTitleHorizontalAlignment(1);
                    uiWebViewConfig.setShouldUseCached(false);
                    return uiWebViewConfig;
                }
                builder = (Uri.Builder) chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$3;
                Uri.Builder builder3 = (Uri.Builder) chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$2;
                kotlin.b.b(obj4);
                obj2 = obj4;
                buildUpon = builder3;
                str2 = (String) obj2;
                if (str2 != null) {
                    builder.appendQueryParameter("user_city", str2);
                }
                Og = ((h) this.c).Og();
                if (Og.length() <= 0) {
                    Og = null;
                }
                if (Og != null) {
                    builder.appendQueryParameter("phone", Og);
                }
                chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$0 = null;
                chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$1 = null;
                chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$2 = buildUpon;
                chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$3 = null;
                chargersSupportWebViewConfigFactory$createWebViewConfig$1.label = 2;
                d = this.e.d(false, chargersSupportWebViewConfigFactory$createWebViewConfig$1);
                if (d != obj) {
                    Uri.Builder builder4 = buildUpon;
                    obj3 = d;
                    builder2 = builder4;
                    String str32 = (String) (obj3 instanceof Result.Failure ? null : obj3);
                    CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
                    aVar2.b = builder2.toString();
                    aVar2.e = false;
                    aVar2.c = str32;
                    aVar2.b("X-YaTaxi-Authorization", kp50.h(str32));
                    String Hg2 = ((h) this.b).Hg();
                    aVar2.b("X-YaTaxi-UserId", Hg2 != null ? Hg2 : "");
                    aVar2.g = true;
                    UiWebViewConfig uiWebViewConfig2 = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                    uiWebViewConfig2.setHasTitleFromWeb(true);
                    uiWebViewConfig2.setShouldShowCloseButton(true);
                    uiWebViewConfig2.setCloseButtonPosition(1);
                    uiWebViewConfig2.setTitleHorizontalAlignment(1);
                    uiWebViewConfig2.setShouldUseCached(false);
                    return uiWebViewConfig2;
                }
                return obj;
            }
        }
        chargersSupportWebViewConfigFactory$createWebViewConfig$1 = new ChargersSupportWebViewConfigFactory$createWebViewConfig$1(this, continuationImpl);
        Object obj42 = chargersSupportWebViewConfigFactory$createWebViewConfig$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersSupportWebViewConfigFactory$createWebViewConfig$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 != null) {
        }
        Og = ((h) this.c).Og();
        if (Og.length() <= 0) {
        }
        if (Og != null) {
        }
        chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$0 = null;
        chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$1 = null;
        chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$2 = buildUpon;
        chargersSupportWebViewConfigFactory$createWebViewConfig$1.L$3 = null;
        chargersSupportWebViewConfigFactory$createWebViewConfig$1.label = 2;
        d = this.e.d(false, chargersSupportWebViewConfigFactory$createWebViewConfig$1);
        if (d != obj) {
        }
        return obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|(2:17|18)|21))|31|6|7|(0)(0)|11|(4:13|15|17|18)|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ChargersSupportWebViewConfigFactory$requestCity$1 chargersSupportWebViewConfigFactory$requestCity$1;
        int i;
        pv0 pv0Var;
        List list;
        v7v0 v7v0Var;
        if (continuationImpl instanceof ChargersSupportWebViewConfigFactory$requestCity$1) {
            chargersSupportWebViewConfigFactory$requestCity$1 = (ChargersSupportWebViewConfigFactory$requestCity$1) continuationImpl;
            int i2 = chargersSupportWebViewConfigFactory$requestCity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersSupportWebViewConfigFactory$requestCity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersSupportWebViewConfigFactory$requestCity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersSupportWebViewConfigFactory$requestCity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr a = atd0.a(this.d, ((gh00) this.a).e.b(), RoutePointType.SERVICE_CHARGERS);
                    chargersSupportWebViewConfigFactory$requestCity$1.label = 1;
                    obj = e.A(a, chargersSupportWebViewConfigFactory$requestCity$1);
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
                pv0Var = (pv0) obj;
                if (pv0Var != null && (list = pv0Var.h) != null && (v7v0Var = (v7v0) kotlin.collections.a.R(list)) != null) {
                    return v7v0Var.k;
                }
                return null;
            }
        }
        chargersSupportWebViewConfigFactory$requestCity$1 = new ChargersSupportWebViewConfigFactory$requestCity$1(this, continuationImpl);
        Object obj2 = chargersSupportWebViewConfigFactory$requestCity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersSupportWebViewConfigFactory$requestCity$1.label;
        if (i != 0) {
        }
        pv0Var = (pv0) obj2;
        if (pv0Var != null) {
            return v7v0Var.k;
        }
        return null;
    }
}

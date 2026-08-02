package com.yandex.go.scooters.misc.support;

import android.net.Uri;
import com.yandex.go.scooters.misc.api.support.ScootersSupportEntryPoint;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.fn21;
import defpackage.gh00;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.t2p0;
import defpackage.tpr;
import defpackage.v7v0;
import defpackage.vp21;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class c {
    public final ah00 a;
    public final fn21 b;
    public final vp21 c;
    public final atd0 d;
    public final ru.yandex.taxi.am.token.a e;
    public final k f;

    public c(ah00 ah00Var, fn21 fn21Var, vp21 vp21Var, atd0 atd0Var, ru.yandex.taxi.am.token.a aVar, k kVar) {
        this.a = ah00Var;
        this.b = fn21Var;
        this.c = vp21Var;
        this.d = atd0Var;
        this.e = aVar;
        this.f = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, t2p0 t2p0Var, ScootersSupportEntryPoint scootersSupportEntryPoint, ContinuationImpl continuationImpl) {
        ScootersSupportWebViewConfigFactory$createWebViewConfig$1 scootersSupportWebViewConfigFactory$createWebViewConfig$1;
        int i;
        Uri.Builder buildUpon;
        ScootersSupportEntryPoint scootersSupportEntryPoint2;
        Object b;
        Uri.Builder builder;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String Hg;
        if (continuationImpl instanceof ScootersSupportWebViewConfigFactory$createWebViewConfig$1) {
            scootersSupportWebViewConfigFactory$createWebViewConfig$1 = (ScootersSupportWebViewConfigFactory$createWebViewConfig$1) continuationImpl;
            int i2 = scootersSupportWebViewConfigFactory$createWebViewConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSupportWebViewConfigFactory$createWebViewConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSupportWebViewConfigFactory$createWebViewConfig$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSupportWebViewConfigFactory$createWebViewConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    buildUpon = Uri.parse(str).buildUpon();
                    buildUpon.appendQueryParameter("scooter_user_id", String.valueOf(this.f.Lg()));
                    if (t2p0Var != null && (str5 = t2p0Var.c) != null) {
                        buildUpon.appendQueryParameter("scooter_ride_id", str5);
                    }
                    if (t2p0Var != null && (str4 = t2p0Var.a) != null) {
                        buildUpon.appendQueryParameter("session_id", str4);
                    }
                    if (t2p0Var != null && (str3 = t2p0Var.b) != null) {
                        buildUpon.appendQueryParameter("scooter_id", str3);
                    }
                    if (t2p0Var != null) {
                        buildUpon.appendQueryParameter("scooter_session_status", t2p0Var.e);
                    }
                    if (t2p0Var != null && (str2 = t2p0Var.d) != null) {
                        buildUpon.appendQueryParameter("scooter_number", str2);
                    }
                    scootersSupportWebViewConfigFactory$createWebViewConfig$1.L$0 = null;
                    scootersSupportWebViewConfigFactory$createWebViewConfig$1.L$1 = null;
                    scootersSupportEntryPoint2 = scootersSupportEntryPoint;
                    scootersSupportWebViewConfigFactory$createWebViewConfig$1.L$2 = scootersSupportEntryPoint2;
                    scootersSupportWebViewConfigFactory$createWebViewConfig$1.L$3 = buildUpon;
                    scootersSupportWebViewConfigFactory$createWebViewConfig$1.L$4 = buildUpon;
                    scootersSupportWebViewConfigFactory$createWebViewConfig$1.label = 1;
                    b = b(scootersSupportWebViewConfigFactory$createWebViewConfig$1);
                    if (b == obj2) {
                        return obj2;
                    }
                    builder = buildUpon;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Uri.Builder builder2 = (Uri.Builder) scootersSupportWebViewConfigFactory$createWebViewConfig$1.L$4;
                    builder = (Uri.Builder) scootersSupportWebViewConfigFactory$createWebViewConfig$1.L$3;
                    ScootersSupportEntryPoint scootersSupportEntryPoint3 = (ScootersSupportEntryPoint) scootersSupportWebViewConfigFactory$createWebViewConfig$1.L$2;
                    kotlin.b.b(obj);
                    b = obj;
                    buildUpon = builder2;
                    scootersSupportEntryPoint2 = scootersSupportEntryPoint3;
                }
                str6 = (String) b;
                if (str6 != null) {
                    buildUpon.appendQueryParameter("user_city", str6);
                }
                buildUpon.appendQueryParameter("entry_point", scootersSupportEntryPoint2.getScreenName());
                String Og = ((h) this.c).Og();
                str7 = Og.length() > 0 ? Og : null;
                if (str7 != null) {
                    buildUpon.appendQueryParameter("phone", str7);
                }
                String c = this.e.c();
                CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                aVar.b = builder.toString();
                aVar.e = false;
                aVar.c = c;
                aVar.b("X-YaTaxi-Authorization", kp50.h(c));
                Hg = ((h) this.b).Hg();
                if (Hg == null) {
                    Hg = "";
                }
                aVar.b("X-YaTaxi-UserId", Hg);
                aVar.g = true;
                UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                uiWebViewConfig.setHasTitleFromWeb(true);
                uiWebViewConfig.setShouldShowCloseButton(true);
                uiWebViewConfig.setCloseButtonPosition(1);
                uiWebViewConfig.setTitleHorizontalAlignment(1);
                uiWebViewConfig.setShouldUseCached(false);
                return uiWebViewConfig;
            }
        }
        scootersSupportWebViewConfigFactory$createWebViewConfig$1 = new ScootersSupportWebViewConfigFactory$createWebViewConfig$1(this, continuationImpl);
        Object obj3 = scootersSupportWebViewConfigFactory$createWebViewConfig$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSupportWebViewConfigFactory$createWebViewConfig$1.label;
        if (i != 0) {
        }
        str6 = (String) b;
        if (str6 != null) {
        }
        buildUpon.appendQueryParameter("entry_point", scootersSupportEntryPoint2.getScreenName());
        String Og2 = ((h) this.c).Og();
        if (Og2.length() > 0) {
        }
        if (str7 != null) {
        }
        String c2 = this.e.c();
        CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
        aVar2.b = builder.toString();
        aVar2.e = false;
        aVar2.c = c2;
        aVar2.b("X-YaTaxi-Authorization", kp50.h(c2));
        Hg = ((h) this.b).Hg();
        if (Hg == null) {
        }
        aVar2.b("X-YaTaxi-UserId", Hg);
        aVar2.g = true;
        UiWebViewConfig uiWebViewConfig2 = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig2.setHasTitleFromWeb(true);
        uiWebViewConfig2.setShouldShowCloseButton(true);
        uiWebViewConfig2.setCloseButtonPosition(1);
        uiWebViewConfig2.setTitleHorizontalAlignment(1);
        uiWebViewConfig2.setShouldUseCached(false);
        return uiWebViewConfig2;
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
        ScootersSupportWebViewConfigFactory$requestCity$1 scootersSupportWebViewConfigFactory$requestCity$1;
        int i;
        pv0 pv0Var;
        List list;
        v7v0 v7v0Var;
        if (continuationImpl instanceof ScootersSupportWebViewConfigFactory$requestCity$1) {
            scootersSupportWebViewConfigFactory$requestCity$1 = (ScootersSupportWebViewConfigFactory$requestCity$1) continuationImpl;
            int i2 = scootersSupportWebViewConfigFactory$requestCity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSupportWebViewConfigFactory$requestCity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSupportWebViewConfigFactory$requestCity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSupportWebViewConfigFactory$requestCity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr a = atd0.a(this.d, ((gh00) this.a).e.b(), RoutePointType.SERVICE_SCOOTERS);
                    scootersSupportWebViewConfigFactory$requestCity$1.label = 1;
                    obj = e.A(a, scootersSupportWebViewConfigFactory$requestCity$1);
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
        scootersSupportWebViewConfigFactory$requestCity$1 = new ScootersSupportWebViewConfigFactory$requestCity$1(this, continuationImpl);
        Object obj2 = scootersSupportWebViewConfigFactory$requestCity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSupportWebViewConfigFactory$requestCity$1.label;
        if (i != 0) {
        }
        pv0Var = (pv0) obj2;
        if (pv0Var != null) {
            return v7v0Var.k;
        }
        return null;
    }
}

package com.ybsdk.common.repositiories.auth;

import android.content.Context;
import android.content.SharedPreferences;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$StartSessionAction;
import com.ybsdk.feature.persistence.api.StorageType;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.StartSessionRequest;
import com.ybsdk.network.dto.StartSessionResponse;
import defpackage.bif;
import defpackage.c1b0;
import defpackage.dnz0;
import defpackage.e5z0;
import defpackage.em3;
import defpackage.fcy0;
import defpackage.fk3;
import defpackage.gff;
import defpackage.gk3;
import defpackage.hzq0;
import defpackage.i5z0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k1x0;
import defpackage.kg51;
import defpackage.lnm0;
import defpackage.my30;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.rpp0;
import defpackage.saj;
import defpackage.sn90;
import defpackage.t6f0;
import defpackage.taj;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wt51;
import defpackage.x8g;
import defpackage.zmp0;
import defpackage.zy11;
import defpackage.zzq0;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.push.AppMetricaPush;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a implements fk3 {
    public final zmp0 a;
    public final Api b;
    public final DeviceIdProvider c;
    public final rpp0 d;
    public final AppAnalyticsReporter e;
    public final g f;
    public final wt51 g;
    public final kg51 h;
    public final com.ybsdk.common.repositiories.user.a i;
    public final com.ybsdk.rconfig.b j;
    public final gff k;
    public final tse l;
    public final b m;
    public final k1x0 n;
    public final f o;
    public final Context p;
    public final lnm0 q;
    public volatile pzt0 r;
    public final com.ybsdk.core.utils.c s = new com.ybsdk.core.utils.c();

    public a(zmp0 zmp0Var, Api api, DeviceIdProvider deviceIdProvider, rpp0 rpp0Var, AppAnalyticsReporter appAnalyticsReporter, g gVar, wt51 wt51Var, kg51 kg51Var, com.ybsdk.common.repositiories.user.a aVar, com.ybsdk.rconfig.b bVar, gff gffVar, tse tseVar, b bVar2, k1x0 k1x0Var, f fVar, Context context, lnm0 lnm0Var) {
        this.a = zmp0Var;
        this.b = api;
        this.c = deviceIdProvider;
        this.d = rpp0Var;
        this.e = appAnalyticsReporter;
        this.f = gVar;
        this.g = wt51Var;
        this.h = kg51Var;
        this.i = aVar;
        this.j = bVar;
        this.k = gffVar;
        this.l = tseVar;
        this.m = bVar2;
        this.n = k1x0Var;
        this.o = fVar;
        this.p = context;
        this.q = lnm0Var;
        tje.N(tseVar, null, null, new AuthRepositoryImpl$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        AuthRepositoryImpl$subscribeToPushes$1 authRepositoryImpl$subscribeToPushes$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof AuthRepositoryImpl$subscribeToPushes$1) {
            authRepositoryImpl$subscribeToPushes$1 = (AuthRepositoryImpl$subscribeToPushes$1) continuationImpl;
            int i2 = authRepositoryImpl$subscribeToPushes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authRepositoryImpl$subscribeToPushes$1.label = i2 - Integer.MIN_VALUE;
                obj = authRepositoryImpl$subscribeToPushes$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authRepositoryImpl$subscribeToPushes$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (aVar.q.a()) {
                        com.ybsdk.common.repositiories.user.a aVar2 = aVar.i;
                        authRepositoryImpl$subscribeToPushes$1.label = 1;
                        obj = aVar2.b(authRepositoryImpl$subscribeToPushes$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    ((com.ybsdk.feature.push.impl.a) aVar.g).d().d();
                }
                return zy11.a;
            }
        }
        authRepositoryImpl$subscribeToPushes$1 = new AuthRepositoryImpl$subscribeToPushes$1(aVar, continuationImpl);
        obj = authRepositoryImpl$subscribeToPushes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authRepositoryImpl$subscribeToPushes$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    public final void b(Long l) {
        Object value;
        AppMetricaPush.setPassportUidProvider(((x8g) ((com.ybsdk.feature.push.impl.a) this.g).a).a, new t6f0(14, l));
        fcy0 fcy0Var = this.e.m0;
        int i = 0;
        boolean z = l == null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("is_uid_null", Boolean.valueOf(z));
        fcy0Var.a.a("tech.auth_repository.update_uid", linkedHashMap);
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.a("uid changed, will reset passport token and persistent data", new Object[0]);
        rpp0 rpp0Var = this.d;
        rpp0Var.f.m0.a.a("tech.user_has_changed", null);
        e5z0Var.a("userHasChanged", new Object[0]);
        c1b0 c1b0Var = (c1b0) rpp0Var.a;
        synchronized (c1b0Var.b) {
            try {
                StorageType[] values = StorageType.values();
                ArrayList arrayList = new ArrayList();
                for (StorageType storageType : values) {
                    if (storageType.getNeedCleanup()) {
                        arrayList.add(storageType);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SharedPreferences.Editor edit = c1b0Var.a((StorageType) it.next()).edit();
                    edit.clear();
                    edit.apply();
                }
                c1b0Var.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        rpp0Var.g.a();
        rpp0Var.d.a.d.a.l(null);
        ((com.ybsdk.common.repositiories.payment.b) rpp0Var.e).i.l(null);
        rpp0Var.b.b.a.l(null);
        rpp0Var.c.d.a.l(null);
        rpp0Var.h.g(l);
        b bVar = this.m;
        bVar.d = null;
        r0 r0Var = bVar.c.e;
        sn90 sn90Var = sn90.a;
        r0Var.getClass();
        r0Var.m(null, sn90Var);
        this.c.j.updateAndGet(new saj(i, l));
        if (l != null) {
            com.ybsdk.persistence.a aVar = (com.ybsdk.persistence.a) this.a;
            fcy0 fcy0Var2 = aVar.c.m0;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
            linkedHashMap2.put("is_uid_null", Boolean.FALSE);
            fcy0Var2.a.a("tech.auth_storage.save_passport_uid", linkedHashMap2);
            SharedPreferences.Editor edit2 = aVar.b.edit();
            edit2.putLong("uid", l.longValue());
            edit2.apply();
        } else {
            ((com.ybsdk.feature.push.impl.a) this.g).d().f();
            com.ybsdk.persistence.a aVar2 = (com.ybsdk.persistence.a) this.a;
            aVar2.c.m0.a.a("tech.auth_storage.remove_passport_uid", null);
            SharedPreferences.Editor edit3 = aVar2.b.edit();
            edit3.remove("uid");
            edit3.apply();
        }
        r0 r0Var2 = this.o.a;
        do {
            value = r0Var2.getValue();
        } while (!r0Var2.k(value, new bif(l)));
        this.f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        AuthRepositoryImpl$authorize$1 authRepositoryImpl$authorize$1;
        int i;
        String str5;
        Object obj;
        String str6;
        String str7;
        String str8;
        taj tajVar;
        String str9;
        Object c;
        String str10;
        Object obj2;
        hzq0 hzq0Var;
        hzq0 hzq0Var2;
        String h;
        pzt0 pzt0Var;
        SessionEntity$Action a;
        CommonEvents$StartSessionAction commonEvents$StartSessionAction;
        if (continuationImpl instanceof AuthRepositoryImpl$authorize$1) {
            authRepositoryImpl$authorize$1 = (AuthRepositoryImpl$authorize$1) continuationImpl;
            int i2 = authRepositoryImpl$authorize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authRepositoryImpl$authorize$1.label = i2 - Integer.MIN_VALUE;
                AuthRepositoryImpl$authorize$1 authRepositoryImpl$authorize$12 = authRepositoryImpl$authorize$1;
                Object obj3 = authRepositoryImpl$authorize$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authRepositoryImpl$authorize$12.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    DeviceIdProvider deviceIdProvider = this.c;
                    str5 = str;
                    authRepositoryImpl$authorize$12.L$0 = str5;
                    authRepositoryImpl$authorize$12.L$1 = str2;
                    authRepositoryImpl$authorize$12.L$2 = str3;
                    authRepositoryImpl$authorize$12.L$3 = str4;
                    authRepositoryImpl$authorize$12.label = 1;
                    Object e = deviceIdProvider.e(authRepositoryImpl$authorize$12);
                    if (e != coroutineSingletons) {
                        obj = e;
                        str6 = str4;
                        str7 = str2;
                        str8 = str3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        str10 = (String) authRepositoryImpl$authorize$12.L$0;
                        kotlin.b.b(obj3);
                        c = ((Result) obj3).getValue();
                        if (!(c instanceof Result.Failure)) {
                            c = zzq0.b((StartSessionResponse) c);
                        }
                        obj2 = c;
                        if (!(obj2 instanceof Result.Failure)) {
                            hzq0Var = (hzq0) obj2;
                            this.e.a.setUserInfo(new UserInfo(hzq0Var.k()));
                            if (hzq0Var.a() != SessionEntity$Action.PIN_TOKEN_RETRY) {
                                this.f.f.updateAndGet(new saj(4, new my30(str10, 26)));
                                String h2 = hzq0Var.h();
                                authRepositoryImpl$authorize$12.L$0 = obj2;
                                authRepositoryImpl$authorize$12.L$1 = hzq0Var;
                                authRepositoryImpl$authorize$12.label = 3;
                                i5z0.a.a(oyr.p("saveAuth() called with: sessionUUID = [", h2, "]"), new Object[0]);
                                Object c2 = ((com.ybsdk.persistence.a) this.a).c(h2, authRepositoryImpl$authorize$12);
                                if (c2 != coroutineSingletons) {
                                    c2 = zy11.a;
                                }
                                if (c2 != coroutineSingletons) {
                                    hzq0Var2 = hzq0Var;
                                    hzq0Var = hzq0Var2;
                                }
                                return coroutineSingletons;
                            }
                            gff gffVar = this.k;
                            h = hzq0Var.h();
                            gffVar.f = h;
                            n0 n0Var = gffVar.d;
                            if (h == null) {
                            }
                            this.k.b = hzq0Var.a();
                            if (hzq0Var.a() == SessionEntity$Action.PIN_TOKEN_REISSUE) {
                            }
                            pzt0Var = this.r;
                            if (pzt0Var != null) {
                            }
                            this.r = kotlinx.coroutines.flow.e.H(this.l, new jqr(((com.ybsdk.feature.push.impl.data.b) ((com.ybsdk.feature.push.impl.a) this.g).c.getValue()).b(), new AuthRepositoryImpl$initPushes$1(this, null), 3));
                            a = hzq0Var.a();
                            em3 em3Var = this.e.o;
                            switch (gk3.a[a.ordinal()]) {
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                            linkedHashMap.put("action", commonEvents$StartSessionAction.getOriginalValue());
                            em3Var.a.a("start_session", linkedHashMap);
                        }
                        return obj2;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hzq0Var2 = (hzq0) authRepositoryImpl$authorize$12.L$1;
                    obj2 = authRepositoryImpl$authorize$12.L$0;
                    kotlin.b.b(obj3);
                    hzq0Var = hzq0Var2;
                    gff gffVar2 = this.k;
                    h = hzq0Var.h();
                    gffVar2.f = h;
                    n0 n0Var2 = gffVar2.d;
                    if (h == null) {
                        n0Var2.g(h);
                    } else {
                        n0Var2.f();
                    }
                    this.k.b = hzq0Var.a();
                    if (hzq0Var.a() == SessionEntity$Action.PIN_TOKEN_REISSUE || !((com.ybsdk.feature.push.impl.data.b) ((com.ybsdk.feature.push.impl.a) this.g).c.getValue()).c()) {
                        pzt0Var = this.r;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        this.r = kotlinx.coroutines.flow.e.H(this.l, new jqr(((com.ybsdk.feature.push.impl.data.b) ((com.ybsdk.feature.push.impl.a) this.g).c.getValue()).b(), new AuthRepositoryImpl$initPushes$1(this, null), 3));
                    } else {
                        ((com.ybsdk.feature.push.impl.a) this.g).d().e();
                    }
                    a = hzq0Var.a();
                    em3 em3Var2 = this.e.o;
                    switch (gk3.a[a.ordinal()]) {
                        case 1:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.NONE;
                            break;
                        case 2:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.AUTHORIZATION;
                            break;
                        case 3:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.PASSPORT_REGISTRATION;
                            break;
                        case 4:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.YB_REGISTRATION;
                            break;
                        case 5:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.APPLICATION_STATUS_CHECK;
                            break;
                        case 6:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.SUPPORT;
                            break;
                        case 7:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.AM_TOKEN_UPDATE;
                            break;
                        case 8:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.APP_UPDATE;
                            break;
                        case 9:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.PIN_TOKEN_CLEAR;
                            break;
                        case 10:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.PIN_TOKEN_REISSUE;
                            break;
                        case 11:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.PIN_TOKEN_RETRY;
                            break;
                        case 12:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.OPEN_PRODUCT;
                            break;
                        case 13:
                            commonEvents$StartSessionAction = CommonEvents$StartSessionAction.OPEN_DEEPLINK;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                    linkedHashMap2.put("action", commonEvents$StartSessionAction.getOriginalValue());
                    em3Var2.a.a("start_session", linkedHashMap2);
                    return obj2;
                }
                String str11 = (String) authRepositoryImpl$authorize$12.L$3;
                str8 = (String) authRepositoryImpl$authorize$12.L$2;
                String str12 = (String) authRepositoryImpl$authorize$12.L$1;
                String str13 = (String) authRepositoryImpl$authorize$12.L$0;
                kotlin.b.b(obj3);
                obj = obj3;
                str6 = str11;
                str5 = str13;
                str7 = str12;
                tajVar = (taj) obj;
                if (tajVar.b != null) {
                    return new Result.Failure(new RuntimeException("Can't get deviceID"));
                }
                this.e.a("own_device_id", tajVar.c);
                String str14 = str8;
                String str15 = tajVar.c;
                if (str15 == null) {
                    str15 = tajVar.b;
                }
                StartSessionRequest startSessionRequest = new StartSessionRequest(new StartSessionRequest.AntifraudInfo(str15, tajVar.b), Boolean.FALSE, str6);
                if (str14 == null) {
                    dnz0 dnz0Var = (dnz0) this.f.f.get();
                    str9 = dnz0Var != null ? dnz0Var.a : null;
                } else {
                    str9 = str14;
                }
                AuthRepositoryImpl$authorize$2 authRepositoryImpl$authorize$2 = new AuthRepositoryImpl$authorize$2(this, str5, startSessionRequest, str9, str7, null);
                authRepositoryImpl$authorize$12.L$0 = str9;
                authRepositoryImpl$authorize$12.L$1 = null;
                authRepositoryImpl$authorize$12.L$2 = null;
                authRepositoryImpl$authorize$12.L$3 = null;
                authRepositoryImpl$authorize$12.label = 2;
                c = com.ybsdk.core.utils.ext.c.c(authRepositoryImpl$authorize$2, authRepositoryImpl$authorize$12);
                if (c != coroutineSingletons) {
                    str10 = str9;
                    if (!(c instanceof Result.Failure)) {
                    }
                    obj2 = c;
                    if (!(obj2 instanceof Result.Failure)) {
                    }
                    return obj2;
                }
                return coroutineSingletons;
            }
        }
        authRepositoryImpl$authorize$1 = new AuthRepositoryImpl$authorize$1(this, continuationImpl);
        AuthRepositoryImpl$authorize$1 authRepositoryImpl$authorize$122 = authRepositoryImpl$authorize$1;
        Object obj32 = authRepositoryImpl$authorize$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authRepositoryImpl$authorize$122.label;
        if (i != 0) {
        }
        tajVar = (taj) obj;
        if (tajVar.b != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Long l, ContinuationImpl continuationImpl) {
        AuthRepositoryImpl$updateUid$1 authRepositoryImpl$updateUid$1;
        Object obj;
        int i;
        if (continuationImpl instanceof AuthRepositoryImpl$updateUid$1) {
            authRepositoryImpl$updateUid$1 = (AuthRepositoryImpl$updateUid$1) continuationImpl;
            int i2 = authRepositoryImpl$updateUid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authRepositoryImpl$updateUid$1.label = i2 - Integer.MIN_VALUE;
                obj = authRepositoryImpl$updateUid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authRepositoryImpl$updateUid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    authRepositoryImpl$updateUid$1.L$0 = l;
                    authRepositoryImpl$updateUid$1.label = 1;
                    obj = this.o.a(authRepositoryImpl$updateUid$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l = (Long) authRepositoryImpl$updateUid$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!jl40.l(obj, l)) {
                    b(l);
                }
                return zy11.a;
            }
        }
        authRepositoryImpl$updateUid$1 = new AuthRepositoryImpl$updateUid$1(this, continuationImpl);
        obj = authRepositoryImpl$updateUid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authRepositoryImpl$updateUid$1.label;
        if (i != 0) {
        }
        if (!jl40.l(obj, l)) {
        }
        return zy11.a;
    }
}

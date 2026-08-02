package com.yandex.go.inapp_calls.interactor;

import android.net.Uri;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$PhoneCallFallbackReason;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.q;
import defpackage.clv;
import defpackage.d6z;
import defpackage.dlv;
import defpackage.fn21;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.j5z;
import defpackage.ju6;
import defpackage.not;
import defpackage.ny61;
import defpackage.ojv;
import defpackage.tcc;
import defpackage.tj21;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes12.dex */
public final class a {
    public final ru.yandex.taxi.am.token.a a;
    public final fn21 b;
    public final j5z c;
    public final tj21 d;
    public final q e;
    public final ju6 f;

    public a(ru.yandex.taxi.am.token.a aVar, fn21 fn21Var, j5z j5zVar, tj21 tj21Var, q qVar, ju6 ju6Var) {
        this.a = aVar;
        this.b = fn21Var;
        this.c = j5zVar;
        this.d = tj21Var;
        this.e = qVar;
        this.f = ju6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0162 A[LOOP:0: B:16:0x015c->B:18:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Map map, ContinuationImpl continuationImpl) {
        InAppCallSessionInteractor$createSessionParams$1 inAppCallSessionInteractor$createSessionParams$1;
        int i;
        Object d;
        Map map2;
        String str;
        String str2;
        Object obj;
        String str3;
        String str4;
        String str5;
        Map map3;
        int d2;
        if (continuationImpl instanceof InAppCallSessionInteractor$createSessionParams$1) {
            inAppCallSessionInteractor$createSessionParams$1 = (InAppCallSessionInteractor$createSessionParams$1) continuationImpl;
            int i2 = inAppCallSessionInteractor$createSessionParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallSessionInteractor$createSessionParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = inAppCallSessionInteractor$createSessionParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallSessionInteractor$createSessionParams$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj2);
                    for (Map.Entry entry : map.entrySet()) {
                        String str6 = (String) entry.getKey();
                        String str7 = (String) entry.getValue();
                        Pair pair = (str6 == null || str6.length() == 0 || str7 == null || str7.length() == 0) ? null : new Pair(str6, str7);
                        if (pair != null) {
                            t.add(pair);
                        }
                    }
                    Map s = kotlin.collections.b.s(t);
                    Uri parse = Uri.parse(((not) this.f).c());
                    String uri = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).build().toString();
                    if (uri.length() <= 0) {
                        uri = null;
                    }
                    if (uri == null) {
                        return new clv(InAppCallsAnalytics$PhoneCallFallbackReason.EmptyInappCallEndpoint);
                    }
                    String Hg = ((h) this.b).Hg();
                    if (Hg == null) {
                        return new clv(InAppCallsAnalytics$PhoneCallFallbackReason.EmptyUserId);
                    }
                    inAppCallSessionInteractor$createSessionParams$1.L$0 = null;
                    inAppCallSessionInteractor$createSessionParams$1.L$1 = s;
                    inAppCallSessionInteractor$createSessionParams$1.L$2 = uri;
                    inAppCallSessionInteractor$createSessionParams$1.L$3 = Hg;
                    inAppCallSessionInteractor$createSessionParams$1.label = 1;
                    d = this.a.d(false, inAppCallSessionInteractor$createSessionParams$1);
                    if (d != coroutineSingletons) {
                        map2 = s;
                        str = Hg;
                        str2 = uri;
                        obj = d;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str8 = (String) inAppCallSessionInteractor$createSessionParams$1.L$4;
                    String str9 = (String) inAppCallSessionInteractor$createSessionParams$1.L$3;
                    str2 = (String) inAppCallSessionInteractor$createSessionParams$1.L$2;
                    map3 = (Map) inAppCallSessionInteractor$createSessionParams$1.L$1;
                    kotlin.b.b(obj2);
                    str5 = str8;
                    str4 = str9;
                    String str10 = str2;
                    InAppCallExperiment inAppCallExperiment = (InAppCallExperiment) obj2;
                    List list = inAppCallExperiment.i;
                    d2 = gw00.d(tcc.n(list, 10));
                    if (d2 < 16) {
                        d2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
                    for (Object obj3 : list) {
                        linkedHashMap.put(obj3, d6z.Y(inAppCallExperiment, (String) obj3));
                    }
                    return new dlv(new ojv(str4, str5, str10, this.c.d(), this.d.a(), kotlin.collections.b.n(linkedHashMap, map3)));
                }
                str = (String) inAppCallSessionInteractor$createSessionParams$1.L$3;
                str2 = (String) inAppCallSessionInteractor$createSessionParams$1.L$2;
                map2 = (Map) inAppCallSessionInteractor$createSessionParams$1.L$1;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                str3 = (String) obj;
                if (str3 != null) {
                    return new clv(InAppCallsAnalytics$PhoneCallFallbackReason.EmptyAuthToken);
                }
                inAppCallSessionInteractor$createSessionParams$1.L$0 = null;
                inAppCallSessionInteractor$createSessionParams$1.L$1 = map2;
                inAppCallSessionInteractor$createSessionParams$1.L$2 = str2;
                inAppCallSessionInteractor$createSessionParams$1.L$3 = str;
                inAppCallSessionInteractor$createSessionParams$1.L$4 = str3;
                inAppCallSessionInteractor$createSessionParams$1.label = 2;
                Object b = this.e.d.b(inAppCallSessionInteractor$createSessionParams$1);
                if (b != coroutineSingletons) {
                    str4 = str;
                    str5 = str3;
                    obj2 = b;
                    map3 = map2;
                    String str102 = str2;
                    InAppCallExperiment inAppCallExperiment2 = (InAppCallExperiment) obj2;
                    List list2 = inAppCallExperiment2.i;
                    d2 = gw00.d(tcc.n(list2, 10));
                    if (d2 < 16) {
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2);
                    while (r14.hasNext()) {
                    }
                    return new dlv(new ojv(str4, str5, str102, this.c.d(), this.d.a(), kotlin.collections.b.n(linkedHashMap2, map3)));
                }
                return coroutineSingletons;
            }
        }
        inAppCallSessionInteractor$createSessionParams$1 = new InAppCallSessionInteractor$createSessionParams$1(this, continuationImpl);
        Object obj22 = inAppCallSessionInteractor$createSessionParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallSessionInteractor$createSessionParams$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        str3 = (String) obj;
        if (str3 != null) {
        }
    }
}

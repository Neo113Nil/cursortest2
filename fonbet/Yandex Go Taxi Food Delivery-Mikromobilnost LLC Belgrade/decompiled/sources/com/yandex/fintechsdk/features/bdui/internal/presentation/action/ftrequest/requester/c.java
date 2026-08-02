package com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.requester;

import defpackage.an11;
import defpackage.bia1;
import defpackage.j6p;
import defpackage.kis0;
import defpackage.lfh;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.wjm;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c extends com.yandex.fintechsdk.core.network.api.request.a {
    public final lfh b;
    public final wjm c;

    public c(lfh lfhVar, wjm wjmVar) {
        super(0);
        this.b = lfhVar;
        this.c = wjmVar;
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object a(Object obj) {
        Map map;
        Object obj2;
        j6p j6pVar = (j6p) obj;
        Map map2 = j6pVar.i;
        wjm wjmVar = this.c;
        Map map3 = null;
        if (map2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                kis0 kis0Var = (kis0) entry.getValue();
                if (kis0Var != null) {
                    obj2 = wjmVar.h(kis0Var);
                    kotlin.b.b(obj2);
                } else {
                    obj2 = null;
                }
                String f = bia1.f(obj2);
                Pair pair = f != null ? new Pair(str, URLEncoder.encode(f, "UTF-8")) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            map = kotlin.collections.b.s(arrayList);
        } else {
            map = null;
        }
        Map map4 = j6pVar.f;
        if (map4 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : map4.entrySet()) {
                String str2 = (String) entry2.getKey();
                Object h = wjmVar.h((kis0) entry2.getValue());
                kotlin.b.b(h);
                String f2 = bia1.f(h);
                Pair pair2 = f2 != null ? new Pair(str2, f2) : null;
                if (pair2 != null) {
                    arrayList2.add(pair2);
                }
            }
            map3 = kotlin.collections.b.s(arrayList2);
        }
        Serializable b = wjmVar.b(j6pVar.j);
        kotlin.b.b(b);
        return new b(j6pVar.g, j6pVar.a, j6pVar.h, (Map) b, map3, map);
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        return bia1.g((kotlinx.serialization.json.c) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(b bVar, ContinuationImpl continuationImpl) {
        FTRequestActionRequester$executeRequest$1 fTRequestActionRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof FTRequestActionRequester$executeRequest$1) {
            fTRequestActionRequester$executeRequest$1 = (FTRequestActionRequester$executeRequest$1) continuationImpl;
            int i2 = fTRequestActionRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fTRequestActionRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fTRequestActionRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fTRequestActionRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                an11 e = qoi0.e(kotlinx.serialization.json.c.class);
                fTRequestActionRequester$executeRequest$1.label = 1;
                com.yandex.fintechsdk.core.network.impl.internal.network.a aVar = (com.yandex.fintechsdk.core.network.impl.internal.network.a) this.b;
                aVar.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(aVar, bVar, e, fTRequestActionRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        fTRequestActionRequester$executeRequest$1 = new FTRequestActionRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = fTRequestActionRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fTRequestActionRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}

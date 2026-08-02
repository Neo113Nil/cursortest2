package com.yandex.go.scooters.ignition.data;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionParams;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionResponse;
import defpackage.cmt;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.r3b1;
import defpackage.tcc;
import defpackage.ton0;
import defpackage.xuo0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class e {
    public final h3y a;
    public final ru.yandex.taxi.scooters.data.a b;
    public final xuo0 c;

    public e(h3y h3yVar, ru.yandex.taxi.scooters.data.a aVar, xuo0 xuo0Var) {
        this.a = h3yVar;
        this.b = aVar;
        this.c = xuo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[LOOP:0: B:17:0x007c->B:19:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        ScootersIgnitionNetworkRepository$requestIgnitionKey$1 scootersIgnitionNetworkRepository$requestIgnitionKey$1;
        int i;
        List list2;
        ScootersIgnitionApi scootersIgnitionApi;
        if (continuationImpl instanceof ScootersIgnitionNetworkRepository$requestIgnitionKey$1) {
            scootersIgnitionNetworkRepository$requestIgnitionKey$1 = (ScootersIgnitionNetworkRepository$requestIgnitionKey$1) continuationImpl;
            int i2 = scootersIgnitionNetworkRepository$requestIgnitionKey$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionNetworkRepository$requestIgnitionKey$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionNetworkRepository$requestIgnitionKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionNetworkRepository$requestIgnitionKey$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersIgnitionApi scootersIgnitionApi2 = (ScootersIgnitionApi) this.a.get();
                    scootersIgnitionNetworkRepository$requestIgnitionKey$1.L$0 = list;
                    scootersIgnitionNetworkRepository$requestIgnitionKey$1.L$1 = scootersIgnitionApi2;
                    scootersIgnitionNetworkRepository$requestIgnitionKey$1.label = 1;
                    Object a = this.b.a(true, scootersIgnitionNetworkRepository$requestIgnitionKey$1);
                    if (a != coroutineSingletons) {
                        list2 = list;
                        scootersIgnitionApi = scootersIgnitionApi2;
                        obj = a;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                scootersIgnitionApi = (ScootersIgnitionApi) scootersIgnitionNetworkRepository$requestIgnitionKey$1.L$1;
                list2 = (List) scootersIgnitionNetworkRepository$requestIgnitionKey$1.L$0;
                kotlin.b.b(obj);
                Map<String, String> map = (Map) obj;
                List f = r3b1.f(this.c.a());
                List<ton0> list3 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (ton0 ton0Var : list3) {
                    arrayList.add(new ScootersIgnitionParams.Beacon(ton0Var.e().toString(), ton0Var.a(), ton0Var.b(), ton0Var.d()));
                }
                cmt<ScootersIgnitionResponse> a2 = scootersIgnitionApi.a(map, new ScootersIgnitionParams(arrayList, f));
                scootersIgnitionNetworkRepository$requestIgnitionKey$1.L$0 = null;
                scootersIgnitionNetworkRepository$requestIgnitionKey$1.L$1 = null;
                scootersIgnitionNetworkRepository$requestIgnitionKey$1.label = 2;
                Object d = ru.yandex.taxi.network.api.a.d(a2, scootersIgnitionNetworkRepository$requestIgnitionKey$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        scootersIgnitionNetworkRepository$requestIgnitionKey$1 = new ScootersIgnitionNetworkRepository$requestIgnitionKey$1(this, continuationImpl);
        Object obj2 = scootersIgnitionNetworkRepository$requestIgnitionKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionNetworkRepository$requestIgnitionKey$1.label;
        if (i != 0) {
        }
        Map<String, String> map2 = (Map) obj2;
        List f2 = r3b1.f(this.c.a());
        List<ton0> list32 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list32, 10));
        while (r2.hasNext()) {
        }
        cmt<ScootersIgnitionResponse> a22 = scootersIgnitionApi.a(map2, new ScootersIgnitionParams(arrayList2, f2));
        scootersIgnitionNetworkRepository$requestIgnitionKey$1.L$0 = null;
        scootersIgnitionNetworkRepository$requestIgnitionKey$1.L$1 = null;
        scootersIgnitionNetworkRepository$requestIgnitionKey$1.label = 2;
        Object d2 = ru.yandex.taxi.network.api.a.d(a22, scootersIgnitionNetworkRepository$requestIgnitionKey$1);
        if (d2 != coroutineSingletons2) {
        }
    }
}

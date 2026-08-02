package com.yandex.go.zone.repository;

import com.yandex.go.zone.model.ClientCacheSettings;
import defpackage.g050;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.zone.repository.ZoneFallbackCache$putZoneInfo$2", f = "ZoneFallbackCache.kt", l = {193, HProv.PP_CIPHEROID, 100, 101, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ZoneFallbackCache$putZoneInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ ClientCacheSettings $clientCacheSettings;
    final /* synthetic */ String $userId;
    final /* synthetic */ kotlinx.serialization.json.c $zone;
    final /* synthetic */ String $zoneName;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneFallbackCache$putZoneInfo$2(h hVar, String str, ClientCacheSettings clientCacheSettings, String str2, kotlinx.serialization.json.c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$userId = str;
        this.$clientCacheSettings = clientCacheSettings;
        this.$zoneName = str2;
        this.$zone = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneFallbackCache$putZoneInfo$2(this.this$0, this.$userId, this.$clientCacheSettings, this.$zoneName, this.$zone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneFallbackCache$putZoneInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c A[Catch: all -> 0x0071, TryCatch #1 {all -> 0x0071, blocks: (B:32:0x006c, B:33:0x0144, B:41:0x0102, B:43:0x010c, B:44:0x0111, B:52:0x00e6), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        g050 g050Var2;
        String str;
        ClientCacheSettings clientCacheSettings;
        String str2;
        h hVar;
        kotlinx.serialization.json.c cVar;
        Object a;
        kotlinx.serialization.json.c cVar2;
        String str3;
        ClientCacheSettings clientCacheSettings2;
        h hVar2;
        ZoneFallbackContainer zoneFallbackContainer;
        LinkedHashMap linkedHashMap;
        Map map;
        h hVar3;
        ZoneFallbackContainer zoneFallbackContainer2;
        Integer num;
        ZoneFallbackContainer zoneFallbackContainer3;
        h hVar4;
        g050 g050Var3;
        com.yandex.go.utils.storage.json.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            th = th;
            g050Var = g050Var2;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar5 = this.this$0;
            g050Var2 = hVar5.e;
            str = this.$userId;
            clientCacheSettings = this.$clientCacheSettings;
            String str4 = this.$zoneName;
            kotlinx.serialization.json.c cVar3 = this.$zone;
            this.L$0 = g050Var2;
            this.L$1 = hVar5;
            this.L$2 = str;
            this.L$3 = clientCacheSettings;
            this.L$4 = str4;
            this.L$5 = cVar3;
            this.label = 1;
            if (g050Var2.a(this) != coroutineSingletons) {
                str2 = str4;
                hVar = hVar5;
                cVar = cVar3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinx.serialization.json.c cVar4 = (kotlinx.serialization.json.c) this.L$5;
                String str5 = (String) this.L$4;
                ClientCacheSettings clientCacheSettings3 = (ClientCacheSettings) this.L$3;
                str = (String) this.L$2;
                hVar2 = (h) this.L$1;
                g050 g050Var4 = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    a = obj;
                    cVar2 = cVar4;
                    str3 = str5;
                    clientCacheSettings2 = clientCacheSettings3;
                    g050Var2 = g050Var4;
                    zoneFallbackContainer = (ZoneFallbackContainer) a;
                    if (!jl40.l(zoneFallbackContainer.a, str)) {
                        zoneFallbackContainer = new ZoneFallbackContainer(str, 2);
                    }
                    linkedHashMap = new LinkedHashMap(zoneFallbackContainer.b);
                    linkedHashMap.put(str3, new ZoneCacheEntry(cVar2, hVar2.c.d(), clientCacheSettings2.a, 4));
                    this.L$0 = g050Var2;
                    this.L$1 = hVar2;
                    this.L$2 = clientCacheSettings2;
                    this.L$3 = zoneFallbackContainer;
                    this.L$4 = linkedHashMap;
                    this.L$5 = null;
                    this.label = 3;
                    if (h.b(hVar2, linkedHashMap, this) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = linkedHashMap;
                    hVar3 = hVar2;
                    zoneFallbackContainer2 = zoneFallbackContainer;
                    num = clientCacheSettings2.b;
                    this.L$0 = g050Var2;
                    this.L$1 = hVar3;
                    this.L$2 = zoneFallbackContainer2;
                    this.L$3 = map;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                    if (h.a(hVar3, map, num, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var = g050Var4;
                }
            } else {
                if (i == 3) {
                    map = (Map) this.L$4;
                    zoneFallbackContainer2 = (ZoneFallbackContainer) this.L$3;
                    clientCacheSettings2 = (ClientCacheSettings) this.L$2;
                    hVar3 = (h) this.L$1;
                    g050Var2 = (g050) this.L$0;
                    kotlin.b.b(obj);
                    num = clientCacheSettings2.b;
                    this.L$0 = g050Var2;
                    this.L$1 = hVar3;
                    this.L$2 = zoneFallbackContainer2;
                    this.L$3 = map;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                    if (h.a(hVar3, map, num, this) != coroutineSingletons) {
                        zoneFallbackContainer3 = zoneFallbackContainer2;
                        hVar4 = hVar3;
                        g050Var3 = g050Var2;
                        zoneFallbackContainer3.b = map;
                        aVar = hVar4.g;
                        this.L$0 = g050Var3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 5;
                        if (aVar.d(zoneFallbackContainer3, this) != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 4) {
                    map = (Map) this.L$3;
                    zoneFallbackContainer3 = (ZoneFallbackContainer) this.L$2;
                    hVar4 = (h) this.L$1;
                    g050Var3 = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        zoneFallbackContainer3.b = map;
                        aVar = hVar4.g;
                        this.L$0 = g050Var3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 5;
                        if (aVar.d(zoneFallbackContainer3, this) != coroutineSingletons) {
                            g050Var = g050Var3;
                            g050Var.d(null);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        g050Var = g050Var3;
                    }
                } else {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        g050Var.d(null);
                        return zy11.a;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
            g050Var.d(null);
            throw th;
        }
        cVar = (kotlinx.serialization.json.c) this.L$5;
        str2 = (String) this.L$4;
        ClientCacheSettings clientCacheSettings4 = (ClientCacheSettings) this.L$3;
        str = (String) this.L$2;
        h hVar6 = (h) this.L$1;
        g050 g050Var5 = (g050) this.L$0;
        kotlin.b.b(obj);
        clientCacheSettings = clientCacheSettings4;
        g050Var2 = g050Var5;
        hVar = hVar6;
        com.yandex.go.utils.storage.json.a aVar2 = hVar.g;
        this.L$0 = g050Var2;
        this.L$1 = hVar;
        this.L$2 = str;
        this.L$3 = clientCacheSettings;
        this.L$4 = str2;
        this.L$5 = cVar;
        this.label = 2;
        a = aVar2.a(this);
        if (a == coroutineSingletons) {
            return coroutineSingletons;
        }
        cVar2 = cVar;
        str3 = str2;
        clientCacheSettings2 = clientCacheSettings;
        hVar2 = hVar;
        zoneFallbackContainer = (ZoneFallbackContainer) a;
        if (!jl40.l(zoneFallbackContainer.a, str)) {
        }
        linkedHashMap = new LinkedHashMap(zoneFallbackContainer.b);
        linkedHashMap.put(str3, new ZoneCacheEntry(cVar2, hVar2.c.d(), clientCacheSettings2.a, 4));
        this.L$0 = g050Var2;
        this.L$1 = hVar2;
        this.L$2 = clientCacheSettings2;
        this.L$3 = zoneFallbackContainer;
        this.L$4 = linkedHashMap;
        this.L$5 = null;
        this.label = 3;
        if (h.b(hVar2, linkedHashMap, this) != coroutineSingletons) {
        }
    }
}

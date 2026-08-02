package com.yandex.go.zone.repository;

import defpackage.g050;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkotlinx/serialization/json/c;", "<anonymous>", "(Ltse;)Lkotlinx/serialization/json/c;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.zone.repository.ZoneFallbackCache$getZoneInfo$2", f = "ZoneFallbackCache.kt", l = {193, HProv.PP_VERSION_TIMESTAMP, HProv.PP_SECURITY_LEVEL, HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ZoneFallbackCache$getZoneInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $userId;
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
    public ZoneFallbackCache$getZoneInfo$2(h hVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$userId = str;
        this.$zoneName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneFallbackCache$getZoneInfo$2(this.this$0, this.$userId, this.$zoneName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneFallbackCache$getZoneInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0054: MOVE (r12 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:61:0x0054 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5 A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:30:0x0116, B:33:0x0124, B:15:0x00cb, B:17:0x00d5, B:24:0x00f2, B:26:0x00fc, B:7:0x00b3), top: B:6:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2 A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:30:0x0116, B:33:0x0124, B:15:0x00cb, B:17:0x00d5, B:24:0x00f2, B:26:0x00fc, B:7:0x00b3), top: B:6:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #2 {all -> 0x00ed, blocks: (B:30:0x0116, B:33:0x0124, B:15:0x00cb, B:17:0x00d5, B:24:0x00f2, B:26:0x00fc, B:7:0x00b3), top: B:6:0x00b3 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.yandex.go.zone.repository.ZoneFallbackCache$getZoneInfo$2, kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r12v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r8v12, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v9, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v6, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        kotlinx.coroutines.sync.a aVar;
        String str;
        String str2;
        g050 g050Var;
        ZoneCacheEntry zoneCacheEntry;
        kotlinx.serialization.json.c cVar;
        h hVar2;
        ZoneFallbackContainer zoneFallbackContainer;
        ZoneCacheEntry zoneCacheEntry2;
        ZoneCacheEntry zoneCacheEntry3;
        Object obj2;
        h hVar3;
        String str3;
        String str4;
        Object obj3;
        ZoneFallbackContainer zoneFallbackContainer2;
        Object obj4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                hVar = this.this$0;
                aVar = hVar.e;
                String str5 = this.$userId;
                String str6 = this.$zoneName;
                this.L$0 = aVar;
                this.L$1 = hVar;
                this.L$2 = str5;
                this.L$3 = str6;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    str = str5;
                    str2 = str6;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                try {
                    if (i == 2) {
                        String str7 = (String) this.L$3;
                        String str8 = (String) this.L$2;
                        h hVar4 = (h) this.L$1;
                        ?? r8 = (g050) this.L$0;
                        kotlin.b.b(obj);
                        obj3 = obj;
                        aVar = r8;
                        str3 = str8;
                        str4 = str7;
                        hVar3 = hVar4;
                        zoneFallbackContainer2 = (ZoneFallbackContainer) obj3;
                        if (!jl40.l(zoneFallbackContainer2.a, str3)) {
                            zoneCacheEntry3 = (ZoneCacheEntry) zoneFallbackContainer2.b.get(str4);
                            if (zoneCacheEntry3 != null) {
                                this.L$0 = aVar;
                                this.L$1 = hVar3;
                                this.L$2 = zoneFallbackContainer2;
                                this.L$3 = zoneCacheEntry3;
                                this.L$4 = zoneCacheEntry3;
                                this.L$5 = hVar3;
                                this.label = 4;
                                obj2 = hVar3.a.a(this);
                                if (obj2 != coroutineSingletons) {
                                    hVar2 = hVar3;
                                    zoneFallbackContainer = zoneFallbackContainer2;
                                    zoneCacheEntry2 = zoneCacheEntry3;
                                    if (!hVar3.c(zoneCacheEntry2, ((Number) obj2).intValue(), 0)) {
                                    }
                                }
                            }
                            aVar.d(null);
                            return null;
                        }
                        com.yandex.go.utils.storage.json.a aVar2 = hVar3.g;
                        ZoneFallbackContainer zoneFallbackContainer3 = hVar3.f;
                        this.L$0 = aVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        if (aVar2.d(zoneFallbackContainer3, this) != coroutineSingletons) {
                            g050Var = aVar;
                            cVar = null;
                            g050Var.d(null);
                            return cVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        g050Var = (g050) this.L$0;
                        kotlin.b.b(obj);
                        cVar = null;
                        g050Var.d(null);
                        return cVar;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zoneCacheEntry = (ZoneCacheEntry) this.L$2;
                        g050Var = (g050) this.L$0;
                        kotlin.b.b(obj);
                        cVar = zoneCacheEntry.a;
                        g050Var.d(null);
                        return cVar;
                    }
                    hVar3 = (h) this.L$5;
                    ZoneCacheEntry zoneCacheEntry4 = (ZoneCacheEntry) this.L$4;
                    zoneCacheEntry3 = (ZoneCacheEntry) this.L$3;
                    ZoneFallbackContainer zoneFallbackContainer4 = (ZoneFallbackContainer) this.L$2;
                    h hVar5 = (h) this.L$1;
                    ?? r82 = (g050) this.L$0;
                    kotlin.b.b(obj);
                    obj2 = obj;
                    aVar = r82;
                    hVar2 = hVar5;
                    zoneFallbackContainer = zoneFallbackContainer4;
                    zoneCacheEntry2 = zoneCacheEntry4;
                    if (!hVar3.c(zoneCacheEntry2, ((Number) obj2).intValue(), 0)) {
                        aVar.d(null);
                        return null;
                    }
                    zoneCacheEntry3.c = hVar2.c.d();
                    com.yandex.go.utils.storage.json.a aVar3 = hVar2.g;
                    this.L$0 = aVar;
                    this.L$1 = null;
                    this.L$2 = zoneCacheEntry3;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 5;
                    if (aVar3.d(zoneFallbackContainer, this) != coroutineSingletons) {
                        g050Var = aVar;
                        zoneCacheEntry = zoneCacheEntry3;
                        cVar = zoneCacheEntry.a;
                        g050Var.d(null);
                        return cVar;
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    this = obj4;
                    this.d(null);
                    throw th;
                }
            }
            str2 = (String) this.L$3;
            str = (String) this.L$2;
            hVar = (h) this.L$1;
            ?? r9 = (g050) this.L$0;
            kotlin.b.b(obj);
            aVar = r9;
            com.yandex.go.utils.storage.json.a aVar4 = hVar.g;
            this.L$0 = aVar;
            this.L$1 = hVar;
            this.L$2 = str;
            this.L$3 = str2;
            this.label = 2;
            obj3 = aVar4.a(this);
            if (obj3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            String str9 = str;
            str4 = str2;
            hVar3 = hVar;
            str3 = str9;
            zoneFallbackContainer2 = (ZoneFallbackContainer) obj3;
            if (!jl40.l(zoneFallbackContainer2.a, str3)) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar5 = aVar;
            th = th3;
            this = aVar5;
            this.d(null);
            throw th;
        }
    }
}

package com.yandex.go.places.map.data.repositories;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesMapSocialPinsRepository$restoreFromCache$2", f = "PlacesMapSocialPinsRepository.kt", l = {474, 481, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapSocialPinsRepository$restoreFromCache$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapSocialPinsRepository$restoreFromCache$2(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMapSocialPinsRepository$restoreFromCache$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMapSocialPinsRepository$restoreFromCache$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        if (r7.a(r6) == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009c A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #1 {all -> 0x0025, blocks: (B:9:0x0020, B:10:0x0094, B:12:0x009c), top: B:8:0x0020 }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        i iVar;
        Object obj2;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        Throwable th2;
        g050 g050Var2;
        Map map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ?? r4 = 1;
        try {
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    iVar = this.this$0;
                    kotlinx.coroutines.sync.a aVar2 = iVar.f;
                    this.L$0 = aVar2;
                    this.L$1 = iVar;
                    this.label = 1;
                    if (aVar2.a(this) != coroutineSingletons) {
                        obj2 = aVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) this.L$2;
                        iVar = (i) this.L$1;
                        g050Var2 = (g050) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            map = (Map) obj;
                            if (!map.isEmpty()) {
                                iVar.e.putAll(map);
                            }
                            g050Var.d(null);
                            g050Var2.d(null);
                            return zy11.a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            g050Var.d(null);
                            throw th2;
                        }
                    }
                    ?? r1 = (g050) this.L$2;
                    i iVar2 = (i) this.L$1;
                    g050 g050Var3 = (g050) this.L$0;
                    kotlin.b.b(obj);
                    aVar = r1;
                    iVar = iVar2;
                    r4 = g050Var3;
                    try {
                        iVar.l = false;
                        com.yandex.go.places.impl.data.repositories.map.a aVar3 = iVar.k;
                        this.L$0 = r4;
                        this.L$1 = iVar;
                        this.L$2 = aVar;
                        this.L$3 = null;
                        this.label = 3;
                        Object b = aVar3.b(this);
                        if (b != coroutineSingletons) {
                            g050Var = aVar;
                            obj = b;
                            g050Var2 = r4;
                            map = (Map) obj;
                            if (!map.isEmpty()) {
                            }
                            g050Var.d(null);
                            g050Var2.d(null);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th4) {
                        g050Var = aVar;
                        th2 = th4;
                        g050Var.d(null);
                        throw th2;
                    }
                }
                iVar = (i) this.L$1;
                Object obj3 = (g050) this.L$0;
                kotlin.b.b(obj);
                obj2 = obj3;
                aVar = iVar.d;
                this.L$0 = obj2;
                this.L$1 = iVar;
                this.L$2 = aVar;
                this.L$3 = null;
                this.label = 2;
                r4 = obj2;
            } catch (Throwable th5) {
                th = th5;
                r4.d(null);
                throw th;
            }
        } catch (Throwable th6) {
            r4 = this;
            th = th6;
            r4.d(null);
            throw th;
        }
    }
}

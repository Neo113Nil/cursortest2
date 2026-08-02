package com.yandex.go.places.map.data.repositories;

import defpackage.g050;
import defpackage.g5t0;
import defpackage.i5t0;
import defpackage.in00;
import defpackage.jl40;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lj5t0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesMapSocialPinsRepository$removeMapObjectsByIds$emits$1", f = "PlacesMapSocialPinsRepository.kt", l = {474, 481}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapSocialPinsRepository$removeMapObjectsByIds$emits$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $ids;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapSocialPinsRepository$removeMapObjectsByIds$emits$1(i iVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$ids = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMapSocialPinsRepository$removeMapObjectsByIds$emits$1(this.this$0, this.$ids, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMapSocialPinsRepository$removeMapObjectsByIds$emits$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0057, code lost:
    
        if (r1.a(r7) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[Catch: all -> 0x0098, TryCatch #2 {all -> 0x0098, blocks: (B:9:0x0073, B:10:0x007e, B:12:0x0084, B:15:0x0094, B:20:0x009a, B:22:0x00a0, B:27:0x00a3, B:29:0x00ad, B:31:0x00b5, B:34:0x00bc, B:35:0x00c0, B:37:0x00c6, B:40:0x00d6, B:43:0x00e2), top: B:8:0x0073, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[Catch: all -> 0x0098, TryCatch #2 {all -> 0x0098, blocks: (B:9:0x0073, B:10:0x007e, B:12:0x0084, B:15:0x0094, B:20:0x009a, B:22:0x00a0, B:27:0x00a3, B:29:0x00ad, B:31:0x00b5, B:34:0x00bc, B:35:0x00c0, B:37:0x00c6, B:40:0x00d6, B:43:0x00e2), top: B:8:0x0073, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[Catch: all -> 0x0098, TryCatch #2 {all -> 0x0098, blocks: (B:9:0x0073, B:10:0x007e, B:12:0x0084, B:15:0x0094, B:20:0x009a, B:22:0x00a0, B:27:0x00a3, B:29:0x00ad, B:31:0x00b5, B:34:0x00bc, B:35:0x00c0, B:37:0x00c6, B:40:0x00d6, B:43:0x00e2), top: B:8:0x0073, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r5v7, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i iVar;
        kotlinx.coroutines.sync.a aVar;
        Set<String> set;
        g050 g050Var;
        i iVar2;
        g050 g050Var2;
        Set<String> set2;
        LinkedHashSet linkedHashSet;
        Iterator it;
        Object j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                iVar = this.this$0;
                aVar = iVar.f;
                set = this.$ids;
                this.L$0 = aVar;
                this.L$1 = iVar;
                this.L$2 = set;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var2 = (g050) this.L$3;
                    set2 = (Set) this.L$2;
                    iVar2 = (i) this.L$1;
                    g050Var = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        try {
                            linkedHashSet = new LinkedHashSet();
                            it = set2.iterator();
                            while (it.hasNext()) {
                                kn00 kn00Var = (kn00) iVar2.e.remove((String) it.next());
                                if (kn00Var != null) {
                                    linkedHashSet.add(kn00Var);
                                }
                            }
                            if (linkedHashSet.isEmpty()) {
                                ListBuilder a = rcc.a();
                                in00 i2 = iVar2.i();
                                String id = i2 != null ? i2.getId() : null;
                                if (id != null && !linkedHashSet.isEmpty()) {
                                    Iterator it2 = linkedHashSet.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        if (jl40.l(((kn00) it2.next()).getId(), id)) {
                                            iVar2.u(null);
                                            a.add(new g5t0(null, false));
                                            break;
                                        }
                                    }
                                }
                                a.add(new i5t0(kotlin.collections.a.J0(iVar2.e.values()), linkedHashSet));
                                j = a.j();
                            } else {
                                j = EmptyList.a;
                            }
                            g050Var2.d(null);
                            g050Var.d(null);
                            return j;
                        } catch (Throwable th) {
                            g050Var2.d(null);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var.d(null);
                        throw th;
                    }
                }
                Set<String> set3 = (Set) this.L$2;
                i iVar3 = (i) this.L$1;
                ?? r5 = (g050) this.L$0;
                kotlin.b.b(obj);
                set = set3;
                aVar = r5;
                iVar = iVar3;
            }
            kotlinx.coroutines.sync.a aVar2 = iVar.d;
            this.L$0 = aVar;
            this.L$1 = iVar;
            this.L$2 = set;
            this.L$3 = aVar2;
            this.L$4 = null;
            this.label = 2;
            if (aVar2.a(this) != coroutineSingletons) {
                iVar2 = iVar;
                g050Var = aVar;
                g050Var2 = aVar2;
                set2 = set;
                linkedHashSet = new LinkedHashSet();
                it = set2.iterator();
                while (it.hasNext()) {
                }
                if (linkedHashSet.isEmpty()) {
                }
                g050Var2.d(null);
                g050Var.d(null);
                return j;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
    }
}

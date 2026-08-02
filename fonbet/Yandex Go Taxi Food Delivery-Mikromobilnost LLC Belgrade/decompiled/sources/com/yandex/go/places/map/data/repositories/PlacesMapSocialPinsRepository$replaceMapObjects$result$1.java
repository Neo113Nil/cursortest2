package com.yandex.go.places.map.data.repositories;

import defpackage.g050;
import defpackage.h73;
import defpackage.i5t0;
import defpackage.in00;
import defpackage.jl40;
import defpackage.kn00;
import defpackage.lbc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrq0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llbc0;", "<anonymous>", "(Ltse;)Llbc0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesMapSocialPinsRepository$replaceMapObjects$result$1", f = "PlacesMapSocialPinsRepository.kt", l = {474, 481}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapSocialPinsRepository$replaceMapObjects$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<kn00> $newMapObjects;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapSocialPinsRepository$replaceMapObjects$result$1(i iVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$newMapObjects = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMapSocialPinsRepository$replaceMapObjects$result$1(this.this$0, this.$newMapObjects, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMapSocialPinsRepository$replaceMapObjects$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0056, code lost:
    
        if (r1.a(r13) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090 A[Catch: all -> 0x009f, LOOP:0: B:10:0x008a->B:12:0x0090, LOOP_END, TryCatch #2 {all -> 0x009f, blocks: (B:9:0x0072, B:10:0x008a, B:12:0x0090, B:14:0x00a2, B:16:0x00b2, B:17:0x00b8, B:18:0x00c0, B:20:0x00c7, B:22:0x00e5, B:28:0x00ee, B:31:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0106, B:44:0x0126, B:50:0x0131, B:53:0x0137, B:61:0x013b, B:63:0x0143, B:65:0x014b, B:67:0x0151, B:70:0x0158, B:72:0x015e, B:76:0x0176, B:82:0x0167), top: B:8:0x0072, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2 A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:9:0x0072, B:10:0x008a, B:12:0x0090, B:14:0x00a2, B:16:0x00b2, B:17:0x00b8, B:18:0x00c0, B:20:0x00c7, B:22:0x00e5, B:28:0x00ee, B:31:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0106, B:44:0x0126, B:50:0x0131, B:53:0x0137, B:61:0x013b, B:63:0x0143, B:65:0x014b, B:67:0x0151, B:70:0x0158, B:72:0x015e, B:76:0x0176, B:82:0x0167), top: B:8:0x0072, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7 A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:9:0x0072, B:10:0x008a, B:12:0x0090, B:14:0x00a2, B:16:0x00b2, B:17:0x00b8, B:18:0x00c0, B:20:0x00c7, B:22:0x00e5, B:28:0x00ee, B:31:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0106, B:44:0x0126, B:50:0x0131, B:53:0x0137, B:61:0x013b, B:63:0x0143, B:65:0x014b, B:67:0x0151, B:70:0x0158, B:72:0x015e, B:76:0x0176, B:82:0x0167), top: B:8:0x0072, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8 A[EDGE_INSN: B:37:0x00f8->B:38:0x00f8 BREAK  A[LOOP:1: B:18:0x00c0->B:33:0x00c0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106 A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:9:0x0072, B:10:0x008a, B:12:0x0090, B:14:0x00a2, B:16:0x00b2, B:17:0x00b8, B:18:0x00c0, B:20:0x00c7, B:22:0x00e5, B:28:0x00ee, B:31:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0106, B:44:0x0126, B:50:0x0131, B:53:0x0137, B:61:0x013b, B:63:0x0143, B:65:0x014b, B:67:0x0151, B:70:0x0158, B:72:0x015e, B:76:0x0176, B:82:0x0167), top: B:8:0x0072, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143 A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:9:0x0072, B:10:0x008a, B:12:0x0090, B:14:0x00a2, B:16:0x00b2, B:17:0x00b8, B:18:0x00c0, B:20:0x00c7, B:22:0x00e5, B:28:0x00ee, B:31:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0106, B:44:0x0126, B:50:0x0131, B:53:0x0137, B:61:0x013b, B:63:0x0143, B:65:0x014b, B:67:0x0151, B:70:0x0158, B:72:0x015e, B:76:0x0176, B:82:0x0167), top: B:8:0x0072, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151 A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:9:0x0072, B:10:0x008a, B:12:0x0090, B:14:0x00a2, B:16:0x00b2, B:17:0x00b8, B:18:0x00c0, B:20:0x00c7, B:22:0x00e5, B:28:0x00ee, B:31:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0106, B:44:0x0126, B:50:0x0131, B:53:0x0137, B:61:0x013b, B:63:0x0143, B:65:0x014b, B:67:0x0151, B:70:0x0158, B:72:0x015e, B:76:0x0176, B:82:0x0167), top: B:8:0x0072, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:9:0x0072, B:10:0x008a, B:12:0x0090, B:14:0x00a2, B:16:0x00b2, B:17:0x00b8, B:18:0x00c0, B:20:0x00c7, B:22:0x00e5, B:28:0x00ee, B:31:0x00f4, B:38:0x00f8, B:39:0x0100, B:41:0x0106, B:44:0x0126, B:50:0x0131, B:53:0x0137, B:61:0x013b, B:63:0x0143, B:65:0x014b, B:67:0x0151, B:70:0x0158, B:72:0x015e, B:76:0x0176, B:82:0x0167), top: B:8:0x0072, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b7  */
    /* JADX WARN: Type inference failed for: r6v6, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i iVar;
        kotlinx.coroutines.sync.a aVar;
        List<kn00> list;
        g050 g050Var;
        i iVar2;
        List<kn00> list2;
        g050 g050Var2;
        ArrayList arrayList;
        String id;
        Iterator it;
        in00 in00Var;
        i5t0 i5t0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                iVar = this.this$0;
                aVar = iVar.f;
                list = this.$newMapObjects;
                this.L$0 = aVar;
                this.L$1 = iVar;
                this.L$2 = list;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var2 = (g050) this.L$3;
                    list2 = (List) this.L$2;
                    iVar2 = (i) this.L$1;
                    g050Var = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        try {
                            h73 h73Var = new h73(1, list2);
                            int i2 = iVar2.c;
                            LinkedHashMap linkedHashMap = iVar2.e;
                            qrq0 q = kotlin.sequences.b.q(h73Var, i2);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj2 : q) {
                                linkedHashMap2.put(((kn00) obj2).getId(), obj2);
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            arrayList = new ArrayList();
                            in00 i3 = iVar2.i();
                            id = i3 == null ? i3.getId() : null;
                            it = linkedHashMap.entrySet().iterator();
                            while (true) {
                                boolean z2 = false;
                                if (it.hasNext()) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                String str = (String) entry.getKey();
                                kn00 kn00Var = (kn00) entry.getValue();
                                kn00 kn00Var2 = (kn00) linkedHashMap2.get(str);
                                if (jl40.l(str, id) && (kn00Var2 instanceof in00)) {
                                    z2 = true;
                                }
                                if (kn00Var2 == null || (!z2 && !jl40.l(kn00Var, kn00Var2))) {
                                    linkedHashSet.add(kn00Var);
                                }
                            }
                            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                String str2 = (String) entry2.getKey();
                                kn00 kn00Var3 = (kn00) entry2.getValue();
                                kn00 kn00Var4 = (kn00) linkedHashMap.get(str2);
                                boolean z3 = jl40.l(str2, id) && kn00Var4 != null && (kn00Var3 instanceof in00);
                                if (kn00Var4 == null || (!z3 && !kn00Var4.equals(kn00Var3))) {
                                    arrayList.add(kn00Var3);
                                }
                            }
                            linkedHashMap.clear();
                            linkedHashMap.putAll(linkedHashMap2);
                            if (id != null) {
                                Object obj3 = linkedHashMap2.get(id);
                                if (obj3 instanceof in00) {
                                    in00Var = (in00) obj3;
                                    if (id != null) {
                                        iVar2.u(in00Var);
                                    }
                                    if (in00Var == null) {
                                        z = false;
                                    }
                                    if (arrayList.isEmpty() && linkedHashSet.isEmpty()) {
                                        i5t0Var = null;
                                        lbc0 lbc0Var = new lbc0(i5t0Var, arrayList, linkedHashSet, z);
                                        g050Var2.d(null);
                                        g050Var.d(null);
                                        return lbc0Var;
                                    }
                                    i5t0Var = new i5t0(kotlin.collections.a.J0(linkedHashMap.values()), linkedHashSet);
                                    lbc0 lbc0Var2 = new lbc0(i5t0Var, arrayList, linkedHashSet, z);
                                    g050Var2.d(null);
                                    g050Var.d(null);
                                    return lbc0Var2;
                                }
                            }
                            in00Var = null;
                            if (id != null) {
                            }
                            if (in00Var == null) {
                            }
                            if (arrayList.isEmpty()) {
                                i5t0Var = null;
                                lbc0 lbc0Var22 = new lbc0(i5t0Var, arrayList, linkedHashSet, z);
                                g050Var2.d(null);
                                g050Var.d(null);
                                return lbc0Var22;
                            }
                            i5t0Var = new i5t0(kotlin.collections.a.J0(linkedHashMap.values()), linkedHashSet);
                            lbc0 lbc0Var222 = new lbc0(i5t0Var, arrayList, linkedHashSet, z);
                            g050Var2.d(null);
                            g050Var.d(null);
                            return lbc0Var222;
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
                List<kn00> list3 = (List) this.L$2;
                i iVar3 = (i) this.L$1;
                ?? r6 = (g050) this.L$0;
                kotlin.b.b(obj);
                iVar = iVar3;
                list = list3;
                aVar = r6;
            }
            kotlinx.coroutines.sync.a aVar2 = iVar.d;
            this.L$0 = aVar;
            this.L$1 = iVar;
            this.L$2 = list;
            this.L$3 = aVar2;
            this.L$4 = null;
            this.label = 2;
            if (aVar2.a(this) != coroutineSingletons) {
                iVar2 = iVar;
                g050Var = aVar;
                list2 = list;
                g050Var2 = aVar2;
                h73 h73Var2 = new h73(1, list2);
                int i22 = iVar2.c;
                LinkedHashMap linkedHashMap3 = iVar2.e;
                qrq0 q2 = kotlin.sequences.b.q(h73Var2, i22);
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                while (r14.hasNext()) {
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                arrayList = new ArrayList();
                in00 i32 = iVar2.i();
                if (i32 == null) {
                }
                it = linkedHashMap3.entrySet().iterator();
                while (true) {
                    boolean z22 = false;
                    if (it.hasNext()) {
                    }
                }
                while (r8.hasNext()) {
                }
                linkedHashMap3.clear();
                linkedHashMap3.putAll(linkedHashMap22);
                if (id != null) {
                }
                in00Var = null;
                if (id != null) {
                }
                if (in00Var == null) {
                }
                if (arrayList.isEmpty()) {
                }
                i5t0Var = new i5t0(kotlin.collections.a.J0(linkedHashMap3.values()), linkedHashSet2);
                lbc0 lbc0Var2222 = new lbc0(i5t0Var, arrayList, linkedHashSet2, z);
                g050Var2.d(null);
                g050Var.d(null);
                return lbc0Var2222;
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

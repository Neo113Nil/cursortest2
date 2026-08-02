package com.ybsdk.api;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.divkit.api.data.LocalSkeleton;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import com.ybsdk.feature.divkit.api.data.SkeletonAliases;
import com.ybsdk.network.dto.skeletons.SkeletonItem;
import com.ybsdk.network.dto.skeletons.SkeletonsResponse;
import defpackage.exr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.v6o0;
import defpackage.wls;
import defpackage.xls0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.api.SkeletonsManagerImpl$updateOrDownloadSkeletons$2", f = "SkeletonsManagerImpl.kt", l = {46, 47, 48, 50, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 52, 56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SkeletonsManagerImpl$updateOrDownloadSkeletons$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonsManagerImpl$updateOrDownloadSkeletons$2(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SkeletonsManagerImpl$updateOrDownloadSkeletons$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SkeletonsManagerImpl$updateOrDownloadSkeletons$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c8, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if (com.ybsdk.api.f.a(r13, r7, r12) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0086, code lost:
    
        if (r13 == r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006d, code lost:
    
        if (r13 == r0) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        SkeletonAliases skeletonAliases;
        SkeletonsResponse skeletonsResponse;
        SkeletonAliases skeletonAliases2;
        SkeletonsResponse skeletonsResponse2;
        Object obj2;
        List list3;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        DefaultConstructorMarker defaultConstructorMarker = null;
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                xls0 xls0Var = this.this$0.b;
                this.label = 1;
                obj = ((com.ybsdk.feature.divkit.api.data.a) xls0Var).h(this);
                break;
            case 1:
                kotlin.b.b(obj);
                List list4 = (List) obj;
                if (list4 == null) {
                    list4 = EmptyList.a;
                }
                list = list4;
                xls0 xls0Var2 = this.this$0.b;
                this.L$0 = list;
                this.label = 2;
                obj = ((com.ybsdk.feature.divkit.api.data.a) xls0Var2).e(this);
                break;
            case 2:
                list = (List) this.L$0;
                kotlin.b.b(obj);
                SkeletonAliases skeletonAliases3 = (SkeletonAliases) obj;
                f fVar = this.this$0;
                String hash = skeletonAliases3 != null ? skeletonAliases3.getHash() : null;
                this.L$0 = list;
                this.L$1 = skeletonAliases3;
                this.label = 3;
                Object b = f.b(fVar, list, hash, this);
                if (b != coroutineSingletons) {
                    list2 = list;
                    skeletonAliases = skeletonAliases3;
                    obj = b;
                    skeletonsResponse = (SkeletonsResponse) obj;
                    if (skeletonsResponse != null) {
                        f fVar2 = this.this$0;
                        List<SkeletonItem> skeletons = skeletonsResponse.getSkeletons();
                        this.L$0 = list2;
                        this.L$1 = skeletonAliases;
                        this.L$2 = skeletonsResponse;
                        this.label = 4;
                        if (f.d(fVar2, skeletons, this) != coroutineSingletons) {
                            skeletonAliases2 = skeletonAliases;
                            skeletonsResponse2 = skeletonsResponse;
                            f fVar3 = this.this$0;
                            List<RawSkeletonId> skeletonsToDelete = skeletonsResponse2.getSkeletonsToDelete();
                            this.L$0 = list2;
                            this.L$1 = skeletonAliases2;
                            this.L$2 = skeletonsResponse2;
                            this.label = 5;
                            break;
                        }
                    }
                    return zy11Var;
                }
                return coroutineSingletons;
            case 3:
                skeletonAliases = (SkeletonAliases) this.L$1;
                List list5 = (List) this.L$0;
                kotlin.b.b(obj);
                list2 = list5;
                skeletonsResponse = (SkeletonsResponse) obj;
                if (skeletonsResponse != null) {
                }
                return zy11Var;
            case 4:
                skeletonsResponse2 = (SkeletonsResponse) this.L$2;
                skeletonAliases2 = (SkeletonAliases) this.L$1;
                list2 = (List) this.L$0;
                kotlin.b.b(obj);
                f fVar32 = this.this$0;
                List<RawSkeletonId> skeletonsToDelete2 = skeletonsResponse2.getSkeletonsToDelete();
                this.L$0 = list2;
                this.L$1 = skeletonAliases2;
                this.L$2 = skeletonsResponse2;
                this.label = 5;
                break;
            case 5:
                skeletonsResponse2 = (SkeletonsResponse) this.L$2;
                skeletonAliases2 = (SkeletonAliases) this.L$1;
                list2 = (List) this.L$0;
                kotlin.b.b(obj);
                f fVar4 = this.this$0;
                SkeletonAliases aliases = skeletonsResponse2.getAliases();
                this.L$0 = list2;
                this.L$1 = skeletonsResponse2;
                this.L$2 = null;
                this.label = 6;
                fVar4.getClass();
                if (aliases != null) {
                    skeletonAliases2 = aliases;
                }
                if (skeletonAliases2 == null || (obj2 = ((com.ybsdk.feature.divkit.api.data.a) fVar4.b).b(skeletonAliases2, this)) != coroutineSingletons) {
                    obj2 = zy11Var;
                }
                if (obj2 != coroutineSingletons) {
                    list3 = list2;
                    f fVar5 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 7;
                    fVar5.getClass();
                    if (!skeletonsResponse2.getSkeletons().isEmpty()) {
                        List<SkeletonItem> skeletons2 = skeletonsResponse2.getSkeletons();
                        ArrayList arrayList = new ArrayList(tcc.n(skeletons2, 10));
                        for (SkeletonItem skeletonItem : skeletons2) {
                            arrayList.add(new LocalSkeleton(skeletonItem.m473getSkeletonId6QunHn0(), skeletonItem.getHash(), defaultConstructorMarker));
                        }
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(RawSkeletonId.m431boximpl(((LocalSkeleton) it.next()).m430getSkeletonId6QunHn0()));
                        }
                        Set N0 = kotlin.collections.a.N0(arrayList2);
                        ArrayList arrayList3 = new ArrayList(list3);
                        arrayList3.removeIf(new v6o0(i2, new exr(i2, N0)));
                        ArrayList m0 = kotlin.collections.a.m0(arrayList, arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = m0.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (!skeletonsResponse2.getSkeletonsToDelete().contains(RawSkeletonId.m431boximpl(((LocalSkeleton) next).m430getSkeletonId6QunHn0()))) {
                                arrayList4.add(next);
                            }
                        }
                        obj3 = ((com.ybsdk.feature.divkit.api.data.a) fVar5.b).c(arrayList4, this);
                        break;
                    }
                    obj3 = zy11Var;
                    if (obj3 != coroutineSingletons) {
                        return zy11Var;
                    }
                }
                return coroutineSingletons;
            case 6:
                skeletonsResponse2 = (SkeletonsResponse) this.L$1;
                list3 = (List) this.L$0;
                kotlin.b.b(obj);
                f fVar52 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 7;
                fVar52.getClass();
                if (!skeletonsResponse2.getSkeletons().isEmpty()) {
                }
                obj3 = zy11Var;
                if (obj3 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                break;
            case 7:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

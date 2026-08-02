package com.ybsdk.feature.divkit.api.data;

import defpackage.g3r;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.divkit.api.data.SkeletonStorageImpl$createOrUpdateSkeletonsMeta$2", f = "SkeletonStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SkeletonStorageImpl$createOrUpdateSkeletonsMeta$2 extends SuspendLambda implements tls {
    final /* synthetic */ List<LocalSkeleton> $meta;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonStorageImpl$createOrUpdateSkeletonsMeta$2(a aVar, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$meta = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SkeletonStorageImpl$createOrUpdateSkeletonsMeta$2(this.this$0, this.$meta, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        SkeletonStorageImpl$createOrUpdateSkeletonsMeta$2 skeletonStorageImpl$createOrUpdateSkeletonsMeta$2 = (SkeletonStorageImpl$createOrUpdateSkeletonsMeta$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        skeletonStorageImpl$createOrUpdateSkeletonsMeta$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        kgx[] kgxVarArr = a.j;
        aVar.getClass();
        g3r.g(new File(aVar.a.getDir("skeletons", 0), "skeletons_meta_data"), this.this$0.d.toJson(this.$meta));
        return zy11.a;
    }
}

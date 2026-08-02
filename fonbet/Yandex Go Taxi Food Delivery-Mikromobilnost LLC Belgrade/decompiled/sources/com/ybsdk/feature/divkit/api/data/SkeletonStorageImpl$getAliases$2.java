package com.ybsdk.feature.divkit.api.data;

import defpackage.g3r;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002H\n"}, d2 = {"<anonymous>", "Lcom/ybsdk/feature/divkit/api/data/SkeletonAliases;", "Lkotlin/jvm/internal/EnhancedNullability;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.divkit.api.data.SkeletonStorageImpl$getAliases$2", f = "SkeletonStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SkeletonStorageImpl$getAliases$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonStorageImpl$getAliases$2(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SkeletonStorageImpl$getAliases$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SkeletonStorageImpl$getAliases$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        File file = new File(aVar.a.getDir("skeletons", 0), "skeletons_aliases");
        if (!file.exists()) {
            return null;
        }
        return this.this$0.e.fromJson(g3r.e(file));
    }
}

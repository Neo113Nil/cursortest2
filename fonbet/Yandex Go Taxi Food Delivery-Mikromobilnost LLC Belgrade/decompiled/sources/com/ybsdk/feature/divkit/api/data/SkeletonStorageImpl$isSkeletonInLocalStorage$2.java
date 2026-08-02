package com.ybsdk.feature.divkit.api.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.divkit.api.data.SkeletonStorageImpl$isSkeletonInLocalStorage$2", f = "SkeletonStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SkeletonStorageImpl$isSkeletonInLocalStorage$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $rawSkeletonId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonStorageImpl$isSkeletonInLocalStorage$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$rawSkeletonId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SkeletonStorageImpl$isSkeletonInLocalStorage$2(this.this$0, this.$rawSkeletonId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SkeletonStorageImpl$isSkeletonInLocalStorage$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(a.a(this.this$0, this.$rawSkeletonId).exists());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

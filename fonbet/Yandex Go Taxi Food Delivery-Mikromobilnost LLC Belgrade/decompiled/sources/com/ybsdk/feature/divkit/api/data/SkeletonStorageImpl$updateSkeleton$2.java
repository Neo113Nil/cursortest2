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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.divkit.api.data.SkeletonStorageImpl$updateSkeleton$2", f = "SkeletonStorageImpl.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SkeletonStorageImpl$updateSkeleton$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $rawSkeletonId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonStorageImpl$updateSkeleton$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$rawSkeletonId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SkeletonStorageImpl$updateSkeleton$2(this.this$0, this.$rawSkeletonId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SkeletonStorageImpl$updateSkeleton$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String str = this.$rawSkeletonId;
            this.label = 1;
            if (aVar.d(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}

package com.ybsdk.feature.kyc.internal.screens.photo;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u6z;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoViewModel$updateUserLocation$1", f = "KycPhotoViewModel.kt", l = {440}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycPhotoViewModel$updateUserLocation$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycPhotoViewModel$updateUserLocation$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KycPhotoViewModel$updateUserLocation$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycPhotoViewModel$updateUserLocation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        u6z u6zVar;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bVar = this.this$0;
            u6zVar = bVar.K;
            if (u6zVar == null) {
                this.L$0 = bVar;
                this.label = 1;
                Object n0 = bVar.n0(this);
                if (n0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = n0;
                bVar2 = bVar;
            }
            bVar.K = u6zVar;
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = (b) this.L$0;
        kotlin.b.b(obj);
        u6zVar = (u6z) obj;
        bVar = bVar2;
        bVar.K = u6zVar;
        return zy11.a;
    }
}

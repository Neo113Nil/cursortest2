package com.yandex.go.morphlex.data;

import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld0l0;", "route", "", "<anonymous>", "(Ld0l0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.morphlex.data.MorphlexFlexConfigFactory$getSourceAddress$2", f = "MorphlexFlexConfigFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MorphlexFlexConfigFactory$getSourceAddress$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isSourceAddressRequired;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorphlexFlexConfigFactory$getSourceAddress$2(boolean z, Continuation continuation) {
        super(2, continuation);
        this.$isSourceAddressRequired = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MorphlexFlexConfigFactory$getSourceAddress$2 morphlexFlexConfigFactory$getSourceAddress$2 = new MorphlexFlexConfigFactory$getSourceAddress$2(this.$isSourceAddressRequired, continuation);
        morphlexFlexConfigFactory$getSourceAddress$2.L$0 = obj;
        return morphlexFlexConfigFactory$getSourceAddress$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MorphlexFlexConfigFactory$getSourceAddress$2) create((d0l0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var = (d0l0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf((this.$isSourceAddressRequired && d0l0Var.h() == null) ? false : true);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

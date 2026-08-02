package com.yandex.go.scooters.di;

import defpackage.bjo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lajo0;", "<anonymous>", "(Ljava/lang/String;)Lajo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.di.ScootersPreorderPollingContractsModule$photocontrolVerification$1$1", f = "ScootersPreorderPollingContractsModule.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreorderPollingContractsModule$photocontrolVerification$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ bjo0 $scootersPhotocontrolStateRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreorderPollingContractsModule$photocontrolVerification$1$1(bjo0 bjo0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersPhotocontrolStateRepository = bjo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPreorderPollingContractsModule$photocontrolVerification$1$1(this.$scootersPhotocontrolStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreorderPollingContractsModule$photocontrolVerification$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        bjo0 bjo0Var = this.$scootersPhotocontrolStateRepository;
        this.label = 1;
        Object a = ((com.yandex.go.scooters.photocontrol.data.b) bjo0Var).a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}

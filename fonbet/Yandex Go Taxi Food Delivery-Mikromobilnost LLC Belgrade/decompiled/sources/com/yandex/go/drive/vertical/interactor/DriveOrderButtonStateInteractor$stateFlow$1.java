package com.yandex.go.drive.vertical.interactor;

import defpackage.bj70;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ycm;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmi31;", "verticalTariff", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lycm;", "<anonymous>", "(Lmi31;Lru/yandex/taxi/theme/ThemeType;)Lycm;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.vertical.interactor.DriveOrderButtonStateInteractor$stateFlow$1", f = "DriveOrderButtonStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DriveOrderButtonStateInteractor$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveOrderButtonStateInteractor$stateFlow$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DriveOrderButtonStateInteractor$stateFlow$1 driveOrderButtonStateInteractor$stateFlow$1 = new DriveOrderButtonStateInteractor$stateFlow$1(this.this$0, (Continuation) obj3);
        driveOrderButtonStateInteractor$stateFlow$1.L$0 = (mi31) obj;
        return driveOrderButtonStateInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        return new ycm(mi31Var, bj70.d);
    }
}

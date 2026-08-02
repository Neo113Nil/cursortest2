package com.yandex.go.pin.repository;

import defpackage.fji;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfji;", "deliveryPin", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Li1c0;", "<anonymous>", "(Lfji;Lru/yandex/taxi/theme/ThemeType;)Li1c0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainPinStyleRepositoryImpl$destinationV2StyleFlow$1", f = "MainPinStyleRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MainPinStyleRepositoryImpl$destinationV2StyleFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPinStyleRepositoryImpl$destinationV2StyleFlow$1(o oVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = oVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainPinStyleRepositoryImpl$destinationV2StyleFlow$1 mainPinStyleRepositoryImpl$destinationV2StyleFlow$1 = new MainPinStyleRepositoryImpl$destinationV2StyleFlow$1(this.this$0, (Continuation) obj3);
        mainPinStyleRepositoryImpl$destinationV2StyleFlow$1.L$0 = (fji) obj;
        return mainPinStyleRepositoryImpl$destinationV2StyleFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fji fjiVar = (fji) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return o.a(this.this$0, fjiVar, this.this$0.d.c());
    }
}

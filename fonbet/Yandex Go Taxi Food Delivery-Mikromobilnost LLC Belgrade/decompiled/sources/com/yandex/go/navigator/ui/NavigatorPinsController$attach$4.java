package com.yandex.go.navigator.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isSummaryLaunched", "", "upcomingStopsCount", "Lzy11;", "<anonymous>", "(ZI)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.ui.NavigatorPinsController$attach$4", f = "NavigatorPinsController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorPinsController$attach$4 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorPinsController$attach$4(m mVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = mVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        NavigatorPinsController$attach$4 navigatorPinsController$attach$4 = new NavigatorPinsController$attach$4(this.this$0, (Continuation) obj3);
        navigatorPinsController$attach$4.Z$0 = booleanValue;
        navigatorPinsController$attach$4.L$0 = (Integer) obj2;
        zy11 zy11Var = zy11.a;
        navigatorPinsController$attach$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        Integer num = (Integer) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m.d(this.this$0, z, num);
        return zy11.a;
    }
}

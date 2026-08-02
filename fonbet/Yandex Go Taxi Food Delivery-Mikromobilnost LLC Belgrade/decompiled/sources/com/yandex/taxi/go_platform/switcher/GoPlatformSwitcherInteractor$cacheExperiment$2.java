package com.yandex.taxi.go_platform.switcher;

import defpackage.cne0;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.nqt;
import defpackage.ny61;
import defpackage.oqt;
import defpackage.qme0;
import defpackage.tpr;
import defpackage.tqt;
import defpackage.tse;
import defpackage.uqt;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.taxi.go_platform.switcher.GoPlatformSwitcherInteractor$cacheExperiment$2", f = "GoPlatformSwitcherInteractor.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class GoPlatformSwitcherInteractor$cacheExperiment$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ tqt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoPlatformSwitcherInteractor$cacheExperiment$2(tqt tqtVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tqtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoPlatformSwitcherInteractor$cacheExperiment$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoPlatformSwitcherInteractor$cacheExperiment$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr a = ((oqt) this.this$0.b.get()).a.a();
            this.label = 1;
            obj = e.y(a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        nqt nqtVar = (nqt) obj;
        uqt uqtVar = this.this$0.a;
        boolean z = nqtVar.b;
        qme0 qme0Var = uqtVar.c;
        kgx[] kgxVarArr = uqt.x;
        qme0Var.setValue(uqtVar, kgxVarArr[0], Boolean.valueOf(z));
        uqtVar.w.setValue(uqtVar, kgxVarArr[1], nqtVar.c);
        ((cne0) uqtVar.b).b();
        return zy11.a;
    }
}

package com.yandex.go.scooters.ignition.domain;

import defpackage.drn0;
import defpackage.jsn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ugo0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzy11;", "it", "Ldrn0;", "<anonymous>", "(V)Lcom/yandex/go/scooters/ignition/domain/model/ScootersIgnitionOptionsStateHolder;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$2", f = "ScootersIgnitionOptionsStateHolderInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$2(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$2) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jsn0 jsn0Var = this.this$0.a;
        ugo0 ugo0Var = jsn0Var.d;
        ugo0 ugo0Var2 = jsn0Var.d;
        boolean f = ugo0Var.a.f();
        boolean a = jsn0Var.a();
        boolean g = ugo0Var2.a.g();
        boolean c = jsn0Var.b.c();
        boolean h = ugo0Var2.a.h();
        boolean a2 = jsn0Var.a.a();
        int i = 2;
        int i2 = (f && a) ? 0 : (f || a) ? !f ? 1 : 2 : 3;
        int i3 = (!g || c) ? (g || !c) ? !g ? 1 : 2 : 3 : 0;
        if (h && a2) {
            i = 0;
        } else if (!h && !a2) {
            i = 3;
        } else if (!h) {
            i = 1;
        }
        return new drn0(i2, i3, i);
    }
}

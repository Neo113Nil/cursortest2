package com.yandex.plus.home.plaque.feature.internal.presentation;

import defpackage.boc0;
import defpackage.hkc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.phc0;
import defpackage.rhc0;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lboc0;", "context", "Lhkc0;", "<destruct>", "Lkotlin/Triple;", "Lphc0;", "Lrhc0;", "<anonymous>", "(Lboc0;Lhkc0;)Lkotlin/Triple;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.feature.internal.presentation.PlaqueViewModel$3", f = "PlaqueViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlaqueViewModel$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueViewModel$3(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlaqueViewModel$3 plaqueViewModel$3 = new PlaqueViewModel$3(this.this$0, (Continuation) obj3);
        plaqueViewModel$3.L$0 = (boc0) obj;
        plaqueViewModel$3.L$1 = (hkc0) obj2;
        return plaqueViewModel$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boc0 boc0Var = (boc0) this.L$0;
        hkc0 hkc0Var = (hkc0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = hkc0Var.a;
        List list2 = hkc0Var.b;
        phc0 phc0Var = (phc0) this.this$0.c.c(list, boc0Var);
        rhc0 rhc0Var = (rhc0) this.this$0.c.c(list2, boc0Var);
        if (rhc0Var == null) {
            rhc0Var = rhc0.g;
        }
        return new Triple(boc0Var, phc0Var, rhc0Var);
    }
}

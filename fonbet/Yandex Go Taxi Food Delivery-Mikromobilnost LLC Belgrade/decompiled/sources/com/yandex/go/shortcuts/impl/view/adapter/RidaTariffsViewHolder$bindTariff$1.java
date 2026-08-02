package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.a8k0;
import defpackage.d8k0;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w7k0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.RidaTariffsViewHolder$bindTariff$1", f = "RidaTariffsViewHolder.kt", l = {HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RidaTariffsViewHolder$bindTariff$1 extends SuspendLambda implements wls {
    final /* synthetic */ a8k0 $model;
    final /* synthetic */ w7k0 $this_bindTariff;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidaTariffsViewHolder$bindTariff$1(o oVar, w7k0 w7k0Var, a8k0 a8k0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
        this.$this_bindTariff = w7k0Var;
        this.$model = a8k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RidaTariffsViewHolder$bindTariff$1(this.this$0, this.$this_bindTariff, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RidaTariffsViewHolder$bindTariff$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0;
            w7k0 w7k0Var = this.$this_bindTariff;
            a8k0 a8k0Var = this.$model;
            this.L$0 = oVar;
            this.L$1 = w7k0Var;
            this.L$2 = a8k0Var;
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            j18Var.w(new d8k0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(oVar.S, w7k0Var.e, null, null, a8k0Var.f, 0, null, null, null, 500), 0));
            if (j18Var.s() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}

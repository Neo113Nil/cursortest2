package com.yandex.div.core.view2.divs;

import android.view.View;
import defpackage.clk;
import defpackage.mvg;
import defpackage.ngh0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.core.view2.divs.DivCustomBinder$bind$$inlined$executeOnMainThreadBlocking$1", f = "DivCustomBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class DivCustomBinder$bind$$inlined$executeOnMainThreadBlocking$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $createView$inlined;
    final /* synthetic */ clk $div$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivCustomBinder$bind$$inlined$executeOnMainThreadBlocking$1(Continuation continuation, sls slsVar, clk clkVar) {
        super(2, continuation);
        this.$createView$inlined = slsVar;
        this.$div$inlined = clkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivCustomBinder$bind$$inlined$executeOnMainThreadBlocking$1(continuation, this.$createView$inlined, this.$div$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivCustomBinder$bind$$inlined$executeOnMainThreadBlocking$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        View view = (View) this.$createView$inlined.invoke();
        view.setTag(ngh0.div_custom_tag, this.$div$inlined);
        return view;
    }
}

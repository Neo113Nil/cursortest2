package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import defpackage.aw5;
import defpackage.clk;
import defpackage.j2k;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rvo;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.core.view2.divs.DivCustomBinder$bindView$$inlined$executeOnMainThreadBlocking$1", f = "DivCustomBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class DivCustomBinder$bindView$$inlined$executeOnMainThreadBlocking$1 extends SuspendLambda implements wls {
    final /* synthetic */ aw5 $context$inlined;
    final /* synthetic */ View $customView$inlined;
    final /* synthetic */ clk $divValue$inlined;
    final /* synthetic */ Div2View $divView$inlined;
    final /* synthetic */ j2k $oldDiv$inlined;
    final /* synthetic */ com.yandex.div.core.state.b $path$inlined;
    final /* synthetic */ rvo $resolver$inlined;
    final /* synthetic */ DivCustomWrapper $view$inlined;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivCustomBinder$bindView$$inlined$executeOnMainThreadBlocking$1(Continuation continuation, g gVar, clk clkVar, DivCustomWrapper divCustomWrapper, View view, j2k j2kVar, aw5 aw5Var, Div2View div2View, rvo rvoVar, com.yandex.div.core.state.b bVar) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$divValue$inlined = clkVar;
        this.$view$inlined = divCustomWrapper;
        this.$customView$inlined = view;
        this.$oldDiv$inlined = j2kVar;
        this.$context$inlined = aw5Var;
        this.$divView$inlined = div2View;
        this.$resolver$inlined = rvoVar;
        this.$path$inlined = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivCustomBinder$bindView$$inlined$executeOnMainThreadBlocking$1(continuation, this.this$0, this.$divValue$inlined, this.$view$inlined, this.$customView$inlined, this.$oldDiv$inlined, this.$context$inlined, this.$divView$inlined, this.$resolver$inlined, this.$path$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DivCustomBinder$bindView$$inlined$executeOnMainThreadBlocking$1 divCustomBinder$bindView$$inlined$executeOnMainThreadBlocking$1 = (DivCustomBinder$bindView$$inlined$executeOnMainThreadBlocking$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        divCustomBinder$bindView$$inlined$executeOnMainThreadBlocking$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.this$0.w.isCustomTypeSupported(this.$divValue$inlined.j)) {
            g gVar = this.this$0;
            DivCustomWrapper divCustomWrapper = this.$view$inlined;
            View view = this.$customView$inlined;
            j2k j2kVar = this.$oldDiv$inlined;
            clk clkVar = j2kVar != null ? j2kVar.c : null;
            clk clkVar2 = this.$divValue$inlined;
            aw5 aw5Var = this.$context$inlined;
            Div2View div2View = this.$divView$inlined;
            rvo rvoVar = this.$resolver$inlined;
            com.yandex.div.core.state.b bVar = this.$path$inlined;
            g.Hg(gVar, divCustomWrapper, view, clkVar, clkVar2, aw5Var, new DivCustomBinder$bindView$2$1(gVar, clkVar2, div2View, rvoVar, bVar), new DivCustomBinder$bindView$2$2(gVar, clkVar2, div2View, rvoVar, bVar));
        }
        return zy11.a;
    }
}

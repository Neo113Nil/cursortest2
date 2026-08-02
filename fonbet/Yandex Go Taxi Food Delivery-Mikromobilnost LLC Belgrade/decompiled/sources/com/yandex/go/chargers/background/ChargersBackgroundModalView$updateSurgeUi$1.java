package com.yandex.go.chargers.background;

import android.content.Context;
import android.graphics.drawable.NinePatchDrawable;
import defpackage.d6z;
import defpackage.dv4;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.lwa;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po4;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tse;
import defpackage.u08;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.BalanceWidget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.background.ChargersBackgroundModalView$updateSurgeUi$1", f = "ChargersBackgroundModalView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersBackgroundModalView$updateSurgeUi$1 extends SuspendLambda implements wls {
    final /* synthetic */ lwa $surgeState;
    int label;
    final /* synthetic */ ChargersBackgroundModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersBackgroundModalView$updateSurgeUi$1(ChargersBackgroundModalView chargersBackgroundModalView, lwa lwaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chargersBackgroundModalView;
        this.$surgeState = lwaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersBackgroundModalView$updateSurgeUi$1(this.this$0, this.$surgeState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersBackgroundModalView$updateSurgeUi$1 chargersBackgroundModalView$updateSurgeUi$1 = (ChargersBackgroundModalView$updateSurgeUi$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersBackgroundModalView$updateSurgeUi$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        BalanceWidget balanceWidget;
        BalanceWidget balanceWidget2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        aVar = this.this$0.overlayShadowUtil;
        Context context = this.this$0.getContext();
        int d = c.d(mrg0.go_design_m_space, this.this$0);
        Context context2 = this.this$0.getContext();
        NinePatchDrawable w = gtq0.w(aVar, context, d6z.W(qje.t(xng0.bgMain, context), d), new hgr0(0.0f, tje.w(8, context2), tje.w(20, context2), qje.u(context2.getTheme(), xng0.effectShadowBottom)), true, false);
        balanceWidget = this.this$0.surgeView;
        int m = s8o.m(this.$surgeState.b, this.this$0.getContext());
        lwa lwaVar = this.$surgeState;
        dv4 dv4Var = new dv4(m, lwaVar.a, lwaVar.c, false);
        EmptyList emptyList = EmptyList.a;
        balanceWidget.updateState(new po4(w, emptyList, emptyList, dv4Var, false), true);
        balanceWidget2 = this.this$0.surgeView;
        c.z(new u08(15, this.this$0, this.$surgeState), balanceWidget2);
        return zy11.a;
    }
}

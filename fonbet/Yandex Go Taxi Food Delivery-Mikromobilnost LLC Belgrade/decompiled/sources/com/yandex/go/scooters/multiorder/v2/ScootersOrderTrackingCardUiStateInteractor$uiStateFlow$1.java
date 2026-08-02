package com.yandex.go.scooters.multiorder.v2;

import android.content.Context;
import defpackage.a78;
import defpackage.avc0;
import defpackage.bvc0;
import defpackage.cdc;
import defpackage.gw00;
import defpackage.hn70;
import defpackage.m7x0;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q6o0;
import defpackage.qje;
import defpackage.qm70;
import defpackage.r7p0;
import defpackage.sm70;
import defpackage.tje;
import defpackage.vpr;
import defpackage.w68;
import defpackage.wls;
import defpackage.xng0;
import defpackage.yn70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lyn70;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.multiorder.v2.ScootersOrderTrackingCardUiStateInteractor$uiStateFlow$1", f = "ScootersOrderTrackingCardUiStateInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ScootersOrderTrackingCardUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ q6o0 $tracking;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOrderTrackingCardUiStateInteractor$uiStateFlow$1(q6o0 q6o0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$tracking = q6o0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersOrderTrackingCardUiStateInteractor$uiStateFlow$1 scootersOrderTrackingCardUiStateInteractor$uiStateFlow$1 = new ScootersOrderTrackingCardUiStateInteractor$uiStateFlow$1(this.$tracking, this.this$0, continuation);
        scootersOrderTrackingCardUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return scootersOrderTrackingCardUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOrderTrackingCardUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            q6o0 q6o0Var = this.$tracking;
            String str = q6o0Var.c;
            cdc cdcVar = new cdc(q6o0Var.e);
            String str2 = q6o0Var.d;
            cdc cdcVar2 = new cdc(q6o0Var.f);
            qm70 qm70Var = qm70.c;
            avc0 avc0Var = new avc0();
            avc0Var.b = this.$tracking.g.getNumber().a;
            a aVar = this.this$0;
            r7p0 number = this.$tracking.g.getNumber();
            aVar.getClass();
            Context context = aVar.a;
            avc0Var.c = new a78(qje.t(xng0.controlMinor, context), qje.u(context.getTheme(), xng0.textMain), gw00.e(new Pair(number.a, new w68(0.0f, tje.s(mrg0.component_text_size_subtitle, context), 24))));
            bvc0 bvc0Var = new bvc0(avc0Var);
            String o = this.$tracking.g.o();
            a aVar2 = this.this$0;
            if (o.length() > 0) {
                o = ((m7x0) aVar2.b).a(o);
            }
            yn70 yn70Var = new yn70(new hn70(str, cdcVar, null, null, null, false, null, str2, cdcVar2, null, new sm70(bvc0Var, null, o, null, null, qm70Var, 50), false, 0, null, false, 0L, 0L, null, 2094332), null, null, null, null, null, 510);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(yn70Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}

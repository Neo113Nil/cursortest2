package com.yandex.go.mainscreen.superapp.orders.presentation.ui;

import defpackage.hxx;
import defpackage.jl40;
import defpackage.lu6;
import defpackage.m4w0;
import defpackage.m5w0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4w0;
import defpackage.pu6;
import defpackage.r2w0;
import defpackage.sn70;
import defpackage.tn70;
import defpackage.tse;
import defpackage.un70;
import defpackage.va90;
import defpackage.vn70;
import defpackage.w201;
import defpackage.w511;
import defpackage.w601;
import defpackage.wls;
import defpackage.wn70;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersPresenter$uiActionInteractor$2$4$1", f = "SuperAppMainScreenOrdersPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainScreenOrdersPresenter$uiActionInteractor$2$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ w201 $tracking;
    int label;
    final /* synthetic */ r2w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenOrdersPresenter$uiActionInteractor$2$4$1(r2w0 r2w0Var, w201 w201Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r2w0Var;
        this.$tracking = w201Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenOrdersPresenter$uiActionInteractor$2$4$1(this.this$0, this.$tracking, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppMainScreenOrdersPresenter$uiActionInteractor$2$4$1 superAppMainScreenOrdersPresenter$uiActionInteractor$2$4$1 = (SuperAppMainScreenOrdersPresenter$uiActionInteractor$2$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppMainScreenOrdersPresenter$uiActionInteractor$2$4$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wn70 vn70Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r2w0 r2w0Var = this.this$0;
        w601 w601Var = r2w0Var.J;
        zy11 zy11Var = zy11.a;
        if (w601Var == null) {
            return zy11Var;
        }
        wn70 wn70Var = w601Var.b;
        va90 va90Var = r2w0Var.B;
        String str = ((pu6) this.$tracking).a;
        yaf0 yaf0Var = w601Var.a;
        if (jl40.l(wn70Var, tn70.a) || (wn70Var instanceof vn70)) {
            vn70Var = new vn70(false, false);
        } else {
            if (!(wn70Var instanceof un70)) {
                w511.b();
                return null;
            }
            un70 un70Var = (un70) wn70Var;
            vn70Var = new sn70(un70Var.t(), un70Var.o(), un70Var.u(), un70Var.l());
        }
        o4w0 o4w0Var = (o4w0) va90Var.a;
        o4w0Var.E((m950) o4w0Var.G.get(), new m5w0(new lu6(str), yaf0Var, vn70Var), new m4w0(va90Var), hxx.a);
        return zy11Var;
    }
}

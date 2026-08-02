package com.yandex.go.taxi.order.change.source.mvp;

import com.yandex.go.taxi.order.change.source.interactor.b0;
import defpackage.cc9;
import defpackage.ej1;
import defpackage.f28;
import defpackage.jl40;
import defpackage.k821;
import defpackage.m821;
import defpackage.mvg;
import defpackage.n821;
import defpackage.nc60;
import defpackage.ny61;
import defpackage.o821;
import defpackage.oc60;
import defpackage.p821;
import defpackage.pc60;
import defpackage.q821;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.UpdateSourcePointConfirmationPresenter$buttonClicked$1", f = "UpdateSourcePointConfirmationPresenter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UpdateSourcePointConfirmationPresenter$buttonClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ k821 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSourcePointConfirmationPresenter$buttonClicked$1(k821 k821Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = k821Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateSourcePointConfirmationPresenter$buttonClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateSourcePointConfirmationPresenter$buttonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ej1 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k821 k821Var = this.this$0;
            b0 b0Var = k821Var.x;
            String str = k821Var.C;
            cc9 cc9Var = k821Var.z;
            this.label = 1;
            obj = b0Var.b(str, cc9Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        q821 q821Var = (q821) obj;
        if (q821Var instanceof n821) {
            k821 k821Var2 = this.this$0;
            k821Var2.y.a(k821Var2.z, (n821) q821Var);
            ((f28) this.this$0.A.a).r(new qu(9));
        } else if ((q821Var instanceof o821) || jl40.l(q821Var, m821.a)) {
            this.this$0.Kg(false);
        } else {
            if (!(q821Var instanceof p821)) {
                w511.b();
                return null;
            }
            this.this$0.Kg(false);
            f28 f28Var = (f28) this.this$0.A.a;
            b = ((pc60) ((oc60) f28Var.I)).b(false);
            f28Var.A(b, new nc60((String) null), sy60.Q2);
        }
        return zy11.a;
    }
}

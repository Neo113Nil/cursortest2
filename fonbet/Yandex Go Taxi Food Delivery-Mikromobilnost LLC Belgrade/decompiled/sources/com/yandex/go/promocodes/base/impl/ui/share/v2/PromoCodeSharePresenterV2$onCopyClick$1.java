package com.yandex.go.promocodes.base.impl.ui.share.v2;

import defpackage.anf0;
import defpackage.avj0;
import defpackage.inf0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tmf0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xoe;
import defpackage.ymf0;
import defpackage.z3v0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.ui.share.v2.PromoCodeSharePresenterV2$onCopyClick$1", f = "PromoCodeSharePresenterV2.kt", l = {167}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PromoCodeSharePresenterV2$onCopyClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ anf0 $stateModel;
    Object L$0;
    int label;
    final /* synthetic */ ymf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeSharePresenterV2$onCopyClick$1(ymf0 ymf0Var, anf0 anf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ymf0Var;
        this.$stateModel = anf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromoCodeSharePresenterV2$onCopyClick$1(this.this$0, this.$stateModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromoCodeSharePresenterV2$onCopyClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xoe xoeVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tmf0 tmf0Var = this.this$0.A;
            z3v0 z3v0Var = (z3v0) this.$stateModel;
            tmf0Var.a("action_button", z3v0Var.h, z3v0Var.i, true);
            this.this$0.y.a(false, ((z3v0) this.$stateModel).c, "PromoCode");
            xoe xoeVar2 = ((z3v0) this.$stateModel).e;
            ((inf0) this.this$0.Dg()).updateCopyButtonState(new xoe(((avj0) this.this$0.B).h(kyh0.promocode_copied), "", ""));
            this.L$0 = xoeVar2;
            this.label = 1;
            if (a.i(2000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            xoeVar = xoeVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xoeVar = (xoe) this.L$0;
            b.b(obj);
        }
        ((inf0) this.this$0.Dg()).updateCopyButtonState(xoeVar);
        return zy11.a;
    }
}

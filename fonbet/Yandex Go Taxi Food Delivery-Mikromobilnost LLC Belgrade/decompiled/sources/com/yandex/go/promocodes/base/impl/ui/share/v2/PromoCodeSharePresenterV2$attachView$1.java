package com.yandex.go.promocodes.base.impl.ui.share.v2;

import defpackage.inf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qtc0;
import defpackage.tse;
import defpackage.wls;
import defpackage.ymf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.ui.share.v2.PromoCodeSharePresenterV2$attachView$1", f = "PromoCodeSharePresenterV2.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PromoCodeSharePresenterV2$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ inf0 $mvpView;
    int label;
    final /* synthetic */ ymf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeSharePresenterV2$attachView$1(ymf0 ymf0Var, inf0 inf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ymf0Var;
        this.$mvpView = inf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromoCodeSharePresenterV2$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromoCodeSharePresenterV2$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            r0 r0Var = this.this$0.F;
            qtc0 qtc0Var = new qtc0(8, this.$mvpView);
            this.label = 1;
            if (r0Var.collect(qtc0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ny61.A();
        return null;
    }
}

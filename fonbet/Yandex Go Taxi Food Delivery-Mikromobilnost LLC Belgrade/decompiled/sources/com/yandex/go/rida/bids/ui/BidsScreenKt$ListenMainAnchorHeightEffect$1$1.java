package com.yandex.go.rida.bids.ui;

import defpackage.l95;
import defpackage.lx40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.t24;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.ui.BidsScreenKt$ListenMainAnchorHeightEffect$1$1", f = "BidsScreen.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsScreenKt$ListenMainAnchorHeightEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ lx40 $mainAnchor;
    final /* synthetic */ tls $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsScreenKt$ListenMainAnchorHeightEffect$1$1(lx40 lx40Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$mainAnchor = lx40Var;
        this.$onAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidsScreenKt$ListenMainAnchorHeightEffect$1$1(this.$mainAnchor, this.$onAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BidsScreenKt$ListenMainAnchorHeightEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = androidx.compose.runtime.f.o(new l95(15, this.$mainAnchor));
            t24 t24Var = new t24(1, this.$onAction);
            this.label = 1;
            if (o.collect(t24Var, this) == coroutineSingletons) {
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

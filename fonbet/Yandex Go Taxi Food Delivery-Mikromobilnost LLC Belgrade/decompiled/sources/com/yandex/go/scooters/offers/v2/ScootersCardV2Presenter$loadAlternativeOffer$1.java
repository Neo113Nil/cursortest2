package com.yandex.go.scooters.offers.v2;

import android.graphics.drawable.Drawable;
import defpackage.lxm0;
import defpackage.m6n0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.ScootersCardV2Presenter$loadAlternativeOffer$1", f = "ScootersCardV2Presenter.kt", l = {209, 211}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardV2Presenter$loadAlternativeOffer$1 extends SuspendLambda implements wls {
    final /* synthetic */ y5n0 $cardState;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardV2Presenter$loadAlternativeOffer$1(f fVar, y5n0 y5n0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$cardState = y5n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCardV2Presenter$loadAlternativeOffer$1(this.this$0, this.$cardState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardV2Presenter$loadAlternativeOffer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lxm0 lxm0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.scooters.offers.v2.domain.a aVar = this.this$0.J;
            y5n0 y5n0Var = this.$cardState;
            this.label = 1;
            obj = aVar.a(y5n0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lxm0Var = (lxm0) this.L$0;
                kotlin.b.b(obj);
                ((m6n0) this.this$0.Dg()).x5(lxm0Var, (Drawable) obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        lxm0 lxm0Var2 = (lxm0) obj;
        f fVar = this.this$0;
        if (lxm0Var2 == null) {
            ((m6n0) fVar.Dg()).o6();
            return zy11.a;
        }
        ru.yandex.taxi.scooters.presentation.common.ui.alt_offer.a aVar2 = fVar.K;
        this.L$0 = lxm0Var2;
        this.label = 2;
        Object b = aVar2.b(this);
        if (b != coroutineSingletons) {
            lxm0Var = lxm0Var2;
            obj = b;
            ((m6n0) this.this$0.Dg()).x5(lxm0Var, (Drawable) obj);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}

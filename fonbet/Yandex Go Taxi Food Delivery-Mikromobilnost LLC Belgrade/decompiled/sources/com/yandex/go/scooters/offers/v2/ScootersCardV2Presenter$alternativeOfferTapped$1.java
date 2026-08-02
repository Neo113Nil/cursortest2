package com.yandex.go.scooters.offers.v2;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p6n0;
import defpackage.ppo0;
import defpackage.qoo0;
import defpackage.qpo0;
import defpackage.r7p0;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.ScootersCardV2Presenter$alternativeOfferTapped$1", f = "ScootersCardV2Presenter.kt", l = {334}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardV2Presenter$alternativeOfferTapped$1 extends SuspendLambda implements wls {
    final /* synthetic */ r7p0 $number;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardV2Presenter$alternativeOfferTapped$1(f fVar, r7p0 r7p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$number = r7p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCardV2Presenter$alternativeOfferTapped$1(this.this$0, this.$number, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardV2Presenter$alternativeOfferTapped$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = p6n0.a[this.this$0.O.a().b.ordinal()];
            if (i2 == 1) {
                this.this$0.P.b = true;
                f fVar = this.this$0;
                r7p0 r7p0Var = this.$number;
                qpo0 qpo0Var = (qpo0) ((r0) fVar.D.b).getValue();
                ppo0 ppo0Var = qpo0Var instanceof ppo0 ? (ppo0) qpo0Var : null;
                if (ppo0Var != null) {
                    qoo0 qoo0Var = fVar.D;
                    Set set = ppo0Var.b;
                    qoo0Var.Fg(new ppo0(ppo0Var.a, v4r0.i(v4r0.f(set, kotlin.collections.a.Y(set)), r7p0Var), ppo0Var.c));
                }
                return zy11.a;
            }
            if (i2 != 2 && i2 != 3) {
                w511.b();
                return null;
            }
            this.this$0.P.a = this.$number;
            f fVar2 = this.this$0;
            r7p0 r7p0Var2 = this.$number;
            this.label = 1;
            obj = f.Kg(fVar2, r7p0Var2, this);
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
        return zy11.a;
    }
}

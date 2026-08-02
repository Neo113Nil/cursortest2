package com.yandex.go.payments.cards.navigation;

import defpackage.bb0;
import defpackage.gj8;
import defpackage.ij8;
import defpackage.j88;
import defpackage.lj8;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n88;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tu5;
import defpackage.u88;
import defpackage.v920;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.navigation.CardNavigationRouterImpl$openCard3ds$1", f = "CardNavigationRouterImpl.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CardNavigationRouterImpl$openCard3ds$1 extends SuspendLambda implements wls {
    final /* synthetic */ gj8 $payload;
    final /* synthetic */ u88 $stepData;
    int label;
    final /* synthetic */ lj8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNavigationRouterImpl$openCard3ds$1(lj8 lj8Var, u88 u88Var, gj8 gj8Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lj8Var;
        this.$stepData = u88Var;
        this.$payload = gj8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardNavigationRouterImpl$openCard3ds$1(this.this$0, this.$stepData, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardNavigationRouterImpl$openCard3ds$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            lj8 lj8Var = this.this$0;
            this.label = 1;
            obj = lj8Var.I.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        lj8 lj8Var2 = this.this$0;
        if (booleanValue) {
            m950 m950Var = (m950) lj8Var2.G.get();
            String str = ((tu5) ((v920) this.$stepData).a).b.b.e;
            if (str == null) {
                str = "";
            }
            lj8Var2.A(m950Var, new n88(str), new bb0(this.this$0, 14));
        } else {
            m950 m950Var2 = (m950) lj8Var2.E.get();
            u88 u88Var = this.$stepData;
            gj8 gj8Var = this.$payload;
            lj8Var2.A(m950Var2, new j88(u88Var, gj8Var.b), new ij8(this.this$0, gj8Var));
        }
        return zy11.a;
    }
}

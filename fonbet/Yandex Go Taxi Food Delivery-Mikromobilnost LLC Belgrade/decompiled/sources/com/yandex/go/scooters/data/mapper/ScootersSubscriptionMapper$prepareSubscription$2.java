package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.Subscription;
import defpackage.a0p0;
import defpackage.fef;
import defpackage.gxo0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wzo0;
import defpackage.xwo0;
import defpackage.yyo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltwo0;", "<anonymous>", "(Ltse;)Ltwo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersSubscriptionMapper$prepareSubscription$2", f = "ScootersSubscriptionMapper.kt", l = {43, 44, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionMapper$prepareSubscription$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ Subscription $subscription;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionMapper$prepareSubscription$2(Subscription subscription, e eVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.$subscription = subscription;
        this.this$0 = eVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSubscriptionMapper$prepareSubscription$2 scootersSubscriptionMapper$prepareSubscription$2 = new ScootersSubscriptionMapper$prepareSubscription$2(this.$subscription, this.this$0, this.$currencyRules, continuation);
        scootersSubscriptionMapper$prepareSubscription$2.L$0 = obj;
        return scootersSubscriptionMapper$prepareSubscription$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionMapper$prepareSubscription$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh nohVar;
        gxo0 gxo0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$prepareSubscription$2$promoblockAsync$1(this.$subscription, this.this$0, this.$currencyRules, null), 3);
            h = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$prepareSubscription$2$upsaleWindowAsync$1(this.$subscription, this.this$0, this.$currencyRules, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else if (i == 1) {
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gxo0Var = (gxo0) this.L$5;
                kotlin.b.b(obj);
                return new xwo0(gxo0Var, (a0p0) obj);
            }
            gxo0Var = (gxo0) this.L$3;
            nohVar = (noh) this.L$2;
            kotlin.b.b(obj);
            a0p0 a0p0Var = (a0p0) obj;
            if (gxo0Var != null) {
                return a0p0Var != null ? new wzo0(a0p0Var) : yyo0.a;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = gxo0Var;
            this.label = 3;
            obj = nohVar.k(this);
        }
        nohVar = h;
        gxo0 gxo0Var2 = (gxo0) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = nohVar;
        this.L$3 = gxo0Var2;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            gxo0Var = gxo0Var2;
            obj = k;
            a0p0 a0p0Var2 = (a0p0) obj;
            if (gxo0Var != null) {
            }
        }
        return coroutineSingletons;
    }
}

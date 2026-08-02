package com.yandex.go.chargers.order.active;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xk9;
import defpackage.yk9;
import defpackage.z8y;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxk9;", "<anonymous>", "(Ltse;)Lxk9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderMapper$mapToUiStateHeader$2", f = "ChargersActiveOrderMapper.kt", l = {56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderMapper$mapToUiStateHeader$2 extends SuspendLambda implements wls {
    final /* synthetic */ z8y $leasingChargersOrder;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderMapper$mapToUiStateHeader$2(f fVar, z8y z8yVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$leasingChargersOrder = z8yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersActiveOrderMapper$mapToUiStateHeader$2 chargersActiveOrderMapper$mapToUiStateHeader$2 = new ChargersActiveOrderMapper$mapToUiStateHeader$2(this.this$0, this.$leasingChargersOrder, continuation);
        chargersActiveOrderMapper$mapToUiStateHeader$2.L$0 = obj;
        return chargersActiveOrderMapper$mapToUiStateHeader$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrderMapper$mapToUiStateHeader$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r10 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        yk9 yk9Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ChargersActiveOrderMapper$mapToUiStateHeader$2$startPartAsync$1(this.this$0, this.$leasingChargersOrder, null), 3);
            h = tje.h(tseVar, null, null, new ChargersActiveOrderMapper$mapToUiStateHeader$2$endPartAsync$1(this.this$0, this.$leasingChargersOrder, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yk9Var = (yk9) this.L$3;
                kotlin.b.b(obj);
                return new xk9(yk9Var, (yk9) obj);
            }
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        yk9 yk9Var2 = (yk9) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = yk9Var2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            yk9Var = yk9Var2;
            obj = k;
            return new xk9(yk9Var, (yk9) obj);
        }
        return coroutineSingletons;
    }
}

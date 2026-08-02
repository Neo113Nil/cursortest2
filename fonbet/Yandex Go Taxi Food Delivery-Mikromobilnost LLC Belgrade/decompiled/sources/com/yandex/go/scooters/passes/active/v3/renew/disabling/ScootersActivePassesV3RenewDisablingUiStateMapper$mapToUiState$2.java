package com.yandex.go.scooters.passes.active.v3.renew.disabling;

import defpackage.avm0;
import defpackage.dsm0;
import defpackage.fsm0;
import defpackage.gsm0;
import defpackage.hsm0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhsm0;", "<anonymous>", "(Ltse;)Lhsm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.disabling.ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2", f = "ScootersActivePassesV3RenewDisablingUiStateMapper.kt", l = {23, 24, 25}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ avm0 $paymentElement;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2(d dVar, avm0 avm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$paymentElement = avm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2 scootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2 = new ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2(this.this$0, this.$paymentElement, continuation);
        scootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        gsm0 gsm0Var;
        noh nohVar;
        Object k;
        gsm0 gsm0Var2;
        fsm0 fsm0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$paymentElement, null), 3);
            h = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2$hintsGroupAsync$1(this.this$0, this.$paymentElement, null), 3);
            h2 = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2$bottomGroupAsync$1(this.this$0, this.$paymentElement, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            obj = h3.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsm0Var = (fsm0) this.L$5;
                    gsm0Var2 = (gsm0) this.L$4;
                    kotlin.b.b(obj);
                    return new hsm0(gsm0Var2, fsm0Var, (dsm0) obj);
                }
                gsm0Var = (gsm0) this.L$4;
                nohVar = (noh) this.L$3;
                kotlin.b.b(obj);
                fsm0 fsm0Var2 = (fsm0) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = gsm0Var;
                this.L$5 = fsm0Var2;
                this.label = 3;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    gsm0Var2 = gsm0Var;
                    fsm0Var = fsm0Var2;
                    obj = k;
                    return new hsm0(gsm0Var2, fsm0Var, (dsm0) obj);
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        gsm0 gsm0Var3 = (gsm0) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = gsm0Var3;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            noh nohVar2 = h2;
            gsm0Var = gsm0Var3;
            obj = k2;
            nohVar = nohVar2;
            fsm0 fsm0Var22 = (fsm0) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = gsm0Var;
            this.L$5 = fsm0Var22;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}

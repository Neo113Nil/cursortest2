package com.yandex.go.scooters.passes.active.v3.renew.menu;

import defpackage.afo0;
import defpackage.atm0;
import defpackage.avm0;
import defpackage.bfo0;
import defpackage.btm0;
import defpackage.ctm0;
import defpackage.hfa0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.ysm0;
import defpackage.zsm0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lctm0;", "<anonymous>", "(Ltse;)Lctm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.menu.ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2", f = "ScootersActivePassesV3RenewMenuUiStateMapper.kt", l = {44, 45, 46, 47, 48, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $autorenewInProgress;
    final /* synthetic */ avm0 $paymentElement;
    final /* synthetic */ hfa0 $paymentOptions;
    final /* synthetic */ boolean $purchaseInProgress;
    final /* synthetic */ bfo0 $purchaseStatus;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2(boolean z, boolean z2, bfo0 bfo0Var, e eVar, avm0 avm0Var, hfa0 hfa0Var, Continuation continuation) {
        super(2, continuation);
        this.$purchaseInProgress = z;
        this.$autorenewInProgress = z2;
        this.$purchaseStatus = bfo0Var;
        this.this$0 = eVar;
        this.$paymentElement = avm0Var;
        this.$paymentOptions = hfa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2 scootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2 = new ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2(this.$purchaseInProgress, this.$autorenewInProgress, this.$purchaseStatus, this.this$0, this.$paymentElement, this.$paymentOptions, continuation);
        scootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0191  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        noh h3;
        noh nohVar;
        noh nohVar2;
        Object k;
        btm0 btm0Var;
        noh nohVar3;
        noh nohVar4;
        noh nohVar5;
        noh nohVar6;
        Object k2;
        ysm0 ysm0Var;
        btm0 btm0Var2;
        noh nohVar7;
        Object k3;
        zsm0 zsm0Var;
        noh nohVar8;
        noh nohVar9;
        Object k4;
        atm0 atm0Var;
        noh nohVar10;
        btm0 btm0Var3;
        ysm0 ysm0Var2;
        zsm0 zsm0Var2;
        Object k5;
        CharSequence charSequence;
        atm0 atm0Var2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean z = true;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                qoh h4 = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$paymentElement, null), 3);
                h = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$descriptionAsync$1(this.this$0, this.$paymentElement, null), 3);
                qoh h5 = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$paymentMethodItemAsync$1(this.this$0, this.$paymentElement, this.$paymentOptions, null), 3);
                h2 = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$renewItemAsync$1(this.this$0, this.$paymentElement, null), 3);
                qoh h6 = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$closeButtonTextAsync$1(this.this$0, this.$paymentElement, null), 3);
                h3 = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$retryButtonTextAsync$1(this.this$0, this.$paymentElement, null), 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h5;
                this.L$4 = h2;
                this.L$5 = h6;
                this.L$6 = h3;
                this.label = 1;
                obj = h4.s(this);
                if (obj != coroutineSingletons) {
                    nohVar = h5;
                    nohVar2 = h6;
                    btm0 btm0Var4 = (btm0) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = nohVar;
                    this.L$4 = h2;
                    this.L$5 = nohVar2;
                    this.L$6 = h3;
                    this.L$7 = btm0Var4;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        noh nohVar11 = h3;
                        btm0Var = btm0Var4;
                        obj = k;
                        nohVar3 = nohVar;
                        nohVar4 = h2;
                        nohVar5 = nohVar2;
                        nohVar6 = nohVar11;
                        ysm0 ysm0Var3 = (ysm0) obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = nohVar4;
                        this.L$5 = nohVar5;
                        this.L$6 = nohVar6;
                        this.L$7 = btm0Var;
                        this.L$8 = ysm0Var3;
                        this.label = 3;
                        k2 = nohVar3.k(this);
                        if (k2 != coroutineSingletons) {
                            noh nohVar12 = nohVar6;
                            ysm0Var = ysm0Var3;
                            obj = k2;
                            btm0Var2 = btm0Var;
                            nohVar7 = nohVar12;
                            zsm0 zsm0Var3 = (zsm0) obj;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = nohVar5;
                            this.L$6 = nohVar7;
                            this.L$7 = btm0Var2;
                            this.L$8 = ysm0Var;
                            this.L$9 = zsm0Var3;
                            this.label = 4;
                            k3 = nohVar4.k(this);
                            if (k3 != coroutineSingletons) {
                                noh nohVar13 = nohVar7;
                                zsm0Var = zsm0Var3;
                                obj = k3;
                                nohVar8 = nohVar5;
                                nohVar9 = nohVar13;
                                atm0 atm0Var3 = (atm0) obj;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = nohVar9;
                                this.L$7 = btm0Var2;
                                this.L$8 = ysm0Var;
                                this.L$9 = zsm0Var;
                                this.L$10 = atm0Var3;
                                this.label = 5;
                                k4 = nohVar8.k(this);
                                if (k4 != coroutineSingletons) {
                                    zsm0 zsm0Var4 = zsm0Var;
                                    atm0Var = atm0Var3;
                                    obj = k4;
                                    nohVar10 = nohVar9;
                                    btm0Var3 = btm0Var2;
                                    ysm0Var2 = ysm0Var;
                                    zsm0Var2 = zsm0Var4;
                                    CharSequence charSequence2 = (CharSequence) obj;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = btm0Var3;
                                    this.L$8 = ysm0Var2;
                                    this.L$9 = zsm0Var2;
                                    this.L$10 = atm0Var;
                                    this.L$11 = charSequence2;
                                    this.label = 6;
                                    k5 = nohVar10.k(this);
                                    if (k5 != coroutineSingletons) {
                                        charSequence = charSequence2;
                                        atm0Var2 = atm0Var;
                                        obj = k5;
                                        zsm0 zsm0Var5 = zsm0Var2;
                                        ysm0 ysm0Var4 = ysm0Var2;
                                        CharSequence charSequence3 = (CharSequence) obj;
                                        if (!this.$purchaseInProgress && !this.$autorenewInProgress && !(this.$purchaseStatus instanceof afo0)) {
                                            z = false;
                                        }
                                        return new ctm0(btm0Var3, ysm0Var4, zsm0Var5, atm0Var2, charSequence, charSequence3, z);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                h3 = (noh) this.L$6;
                nohVar2 = (noh) this.L$5;
                h2 = (noh) this.L$4;
                nohVar = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                btm0 btm0Var42 = (btm0) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar;
                this.L$4 = h2;
                this.L$5 = nohVar2;
                this.L$6 = h3;
                this.L$7 = btm0Var42;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                btm0Var = (btm0) this.L$7;
                nohVar6 = (noh) this.L$6;
                nohVar5 = (noh) this.L$5;
                nohVar4 = (noh) this.L$4;
                nohVar3 = (noh) this.L$3;
                kotlin.b.b(obj);
                ysm0 ysm0Var32 = (ysm0) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar4;
                this.L$5 = nohVar5;
                this.L$6 = nohVar6;
                this.L$7 = btm0Var;
                this.L$8 = ysm0Var32;
                this.label = 3;
                k2 = nohVar3.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                ysm0 ysm0Var5 = (ysm0) this.L$8;
                btm0 btm0Var5 = (btm0) this.L$7;
                noh nohVar14 = (noh) this.L$6;
                nohVar5 = (noh) this.L$5;
                nohVar4 = (noh) this.L$4;
                kotlin.b.b(obj);
                ysm0Var = ysm0Var5;
                nohVar7 = nohVar14;
                btm0Var2 = btm0Var5;
                zsm0 zsm0Var32 = (zsm0) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar5;
                this.L$6 = nohVar7;
                this.L$7 = btm0Var2;
                this.L$8 = ysm0Var;
                this.L$9 = zsm0Var32;
                this.label = 4;
                k3 = nohVar4.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                zsm0Var = (zsm0) this.L$9;
                ysm0Var = (ysm0) this.L$8;
                btm0Var2 = (btm0) this.L$7;
                nohVar9 = (noh) this.L$6;
                nohVar8 = (noh) this.L$5;
                kotlin.b.b(obj);
                atm0 atm0Var32 = (atm0) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = nohVar9;
                this.L$7 = btm0Var2;
                this.L$8 = ysm0Var;
                this.L$9 = zsm0Var;
                this.L$10 = atm0Var32;
                this.label = 5;
                k4 = nohVar8.k(this);
                if (k4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                atm0Var = (atm0) this.L$10;
                zsm0Var2 = (zsm0) this.L$9;
                ysm0Var2 = (ysm0) this.L$8;
                btm0Var3 = (btm0) this.L$7;
                nohVar10 = (noh) this.L$6;
                kotlin.b.b(obj);
                CharSequence charSequence22 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = btm0Var3;
                this.L$8 = ysm0Var2;
                this.L$9 = zsm0Var2;
                this.L$10 = atm0Var;
                this.L$11 = charSequence22;
                this.label = 6;
                k5 = nohVar10.k(this);
                if (k5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                CharSequence charSequence4 = (CharSequence) this.L$11;
                atm0 atm0Var4 = (atm0) this.L$10;
                zsm0Var2 = (zsm0) this.L$9;
                ysm0Var2 = (ysm0) this.L$8;
                btm0 btm0Var6 = (btm0) this.L$7;
                kotlin.b.b(obj);
                charSequence = charSequence4;
                atm0Var2 = atm0Var4;
                btm0Var3 = btm0Var6;
                zsm0 zsm0Var52 = zsm0Var2;
                ysm0 ysm0Var42 = ysm0Var2;
                CharSequence charSequence32 = (CharSequence) obj;
                if (!this.$purchaseInProgress) {
                    z = false;
                    break;
                }
                return new ctm0(btm0Var3, ysm0Var42, zsm0Var52, atm0Var2, charSequence, charSequence32, z);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

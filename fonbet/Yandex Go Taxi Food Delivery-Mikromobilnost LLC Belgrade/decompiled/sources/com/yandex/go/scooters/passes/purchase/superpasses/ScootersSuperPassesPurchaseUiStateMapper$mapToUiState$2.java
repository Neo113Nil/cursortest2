package com.yandex.go.scooters.passes.purchase.superpasses;

import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import com.yandex.go.scooters.passes.model.ScootersPassesPendingPurchaseStatus$PackageType;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.afo0;
import defpackage.bfo0;
import defpackage.bvf0;
import defpackage.hfa0;
import defpackage.mvg;
import defpackage.n1p0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o1p0;
import defpackage.q1p0;
import defpackage.qoh;
import defpackage.r1p0;
import defpackage.s1p0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x1p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ls1p0;", "<anonymous>", "(Ltse;)Ls1p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2", f = "ScootersSuperPassesPurchaseUiStateMapper.kt", l = {52, 53, 54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersSuperPassLegalTermsExperiment $legalTermsExperiment;
    final /* synthetic */ hfa0 $paymentOptions;
    final /* synthetic */ boolean $purchaseInProgress;
    final /* synthetic */ bfo0 $purchaseStatus;
    final /* synthetic */ x1p0 $purchaseWindow;
    final /* synthetic */ String $selectedPassId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2(boolean z, bfo0 bfo0Var, h hVar, hfa0 hfa0Var, x1p0 x1p0Var, String str, ScootersSuperPassLegalTermsExperiment scootersSuperPassLegalTermsExperiment, Continuation continuation) {
        super(2, continuation);
        this.$purchaseInProgress = z;
        this.$purchaseStatus = bfo0Var;
        this.this$0 = hVar;
        this.$paymentOptions = hfa0Var;
        this.$purchaseWindow = x1p0Var;
        this.$selectedPassId = str;
        this.$legalTermsExperiment = scootersSuperPassLegalTermsExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2 scootersSuperPassesPurchaseUiStateMapper$mapToUiState$2 = new ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2(this.$purchaseInProgress, this.$purchaseStatus, this.this$0, this.$paymentOptions, this.$purchaseWindow, this.$selectedPassId, this.$legalTermsExperiment, continuation);
        scootersSuperPassesPurchaseUiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersSuperPassesPurchaseUiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Object s;
        noh nohVar;
        int i2;
        noh nohVar2;
        Object k;
        noh nohVar3;
        r1p0 r1p0Var;
        Object k2;
        r1p0 r1p0Var2;
        q1p0 q1p0Var;
        Object n;
        n1p0 n1p0Var;
        q1p0 q1p0Var2;
        r1p0 r1p0Var3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            if (!this.$purchaseInProgress) {
                bfo0 bfo0Var = this.$purchaseStatus;
                if (!(bfo0Var instanceof afo0) || ((afo0) bfo0Var).b != ScootersPassesPendingPurchaseStatus$PackageType.SUPER_PASS) {
                    i = 0;
                    qoh h = tje.h(tseVar, null, null, new ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$purchaseWindow, null), 3);
                    qoh h2 = tje.h(tseVar, null, null, new ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$termsAsync$1(this.this$0, this.$purchaseWindow, null), 3);
                    qoh h3 = tje.h(tseVar, null, null, new ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$passesAsync$1(this.this$0, this.$purchaseWindow, this.$selectedPassId, this.$legalTermsExperiment, null), 3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = h2;
                    this.L$3 = h3;
                    this.I$0 = i;
                    this.label = 1;
                    s = h.s(this);
                    if (s != coroutineSingletons) {
                        int i4 = i;
                        nohVar = h3;
                        i2 = i4;
                        nohVar2 = h2;
                    }
                    return coroutineSingletons;
                }
            }
            i = 1;
            qoh h4 = tje.h(tseVar, null, null, new ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$purchaseWindow, null), 3);
            qoh h22 = tje.h(tseVar, null, null, new ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$termsAsync$1(this.this$0, this.$purchaseWindow, null), 3);
            qoh h32 = tje.h(tseVar, null, null, new ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$passesAsync$1(this.this$0, this.$purchaseWindow, this.$selectedPassId, this.$legalTermsExperiment, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h22;
            this.L$3 = h32;
            this.I$0 = i;
            this.label = 1;
            s = h4.s(this);
            if (s != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                i2 = this.I$0;
                r1p0Var = (r1p0) this.L$4;
                noh nohVar4 = (noh) this.L$3;
                kotlin.b.b(obj);
                nohVar3 = nohVar4;
                k = obj;
                q1p0 q1p0Var3 = (q1p0) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = r1p0Var;
                this.L$5 = q1p0Var3;
                this.I$0 = i2;
                this.label = 3;
                k2 = nohVar3.k(this);
                if (k2 != coroutineSingletons) {
                    r1p0Var2 = r1p0Var;
                    q1p0Var = q1p0Var3;
                    n1p0 n1p0Var2 = (n1p0) k2;
                    h hVar = this.this$0;
                    hfa0 hfa0Var = this.$paymentOptions;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = r1p0Var2;
                    this.L$5 = q1p0Var;
                    this.L$6 = n1p0Var2;
                    this.I$0 = i2;
                    this.label = 4;
                    hVar.getClass();
                    n = bvf0.n(new ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2(hfa0Var, hVar, null), this);
                    if (n != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.I$0;
                n1p0 n1p0Var3 = (n1p0) this.L$6;
                q1p0 q1p0Var4 = (q1p0) this.L$5;
                r1p0 r1p0Var4 = (r1p0) this.L$4;
                kotlin.b.b(obj);
                n = obj;
                q1p0Var2 = q1p0Var4;
                r1p0Var3 = r1p0Var4;
                n1p0Var = n1p0Var3;
                return new s1p0(r1p0Var3, q1p0Var2, n1p0Var, (o1p0) n, i2 == 0);
            }
            i2 = this.I$0;
            q1p0Var = (q1p0) this.L$5;
            r1p0Var2 = (r1p0) this.L$4;
            kotlin.b.b(obj);
            k2 = obj;
            n1p0 n1p0Var22 = (n1p0) k2;
            h hVar2 = this.this$0;
            hfa0 hfa0Var2 = this.$paymentOptions;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = r1p0Var2;
            this.L$5 = q1p0Var;
            this.L$6 = n1p0Var22;
            this.I$0 = i2;
            this.label = 4;
            hVar2.getClass();
            n = bvf0.n(new ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2(hfa0Var2, hVar2, null), this);
            if (n != coroutineSingletons) {
                n1p0Var = n1p0Var22;
                q1p0Var2 = q1p0Var;
                r1p0Var3 = r1p0Var2;
                return new s1p0(r1p0Var3, q1p0Var2, n1p0Var, (o1p0) n, i2 == 0);
            }
            return coroutineSingletons;
        }
        i2 = this.I$0;
        nohVar = (noh) this.L$3;
        nohVar2 = (noh) this.L$2;
        kotlin.b.b(obj);
        s = obj;
        r1p0 r1p0Var5 = (r1p0) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = r1p0Var5;
        this.I$0 = i2;
        this.label = 2;
        k = nohVar2.k(this);
        if (k != coroutineSingletons) {
            nohVar3 = nohVar;
            r1p0Var = r1p0Var5;
            q1p0 q1p0Var32 = (q1p0) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = r1p0Var;
            this.L$5 = q1p0Var32;
            this.I$0 = i2;
            this.label = 3;
            k2 = nohVar3.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}

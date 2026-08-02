package com.yandex.go.address_confirmation.modal;

import defpackage.ibt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.q5z;
import defpackage.qbt0;
import defpackage.rbt0;
import defpackage.tse;
import defpackage.vbt0;
import defpackage.wat0;
import defpackage.wls;
import defpackage.zat0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalViewPresenter$onClarifyState$1", f = "SourceAddressConfirmationModalViewPresenter.kt", l = {175, 181}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressConfirmationModalViewPresenter$onClarifyState$1 extends SuspendLambda implements wls {
    final /* synthetic */ rbt0 $pickupFromPhotoState;
    final /* synthetic */ ibt0 $state;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressConfirmationModalViewPresenter$onClarifyState$1(d dVar, ibt0 ibt0Var, rbt0 rbt0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$state = ibt0Var;
        this.$pickupFromPhotoState = rbt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourceAddressConfirmationModalViewPresenter$onClarifyState$1(this.this$0, this.$state, this.$pickupFromPhotoState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourceAddressConfirmationModalViewPresenter$onClarifyState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r9 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vbt0 vbt0Var;
        String str;
        String str2;
        rbt0 rbt0Var;
        wat0 wat0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            pv0 pv0Var = this.$state.a;
            this.label = 1;
            obj = d.Lg(dVar, pv0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rbt0Var = (rbt0) this.L$4;
                str2 = (String) this.L$3;
                str = (String) this.L$2;
                vbt0Var = (vbt0) this.L$1;
                kotlin.b.b(obj);
                vbt0Var.render(new qbt0(str, str2, rbt0Var, ((Boolean) obj).booleanValue()));
                wat0Var = (wat0) ((zat0) this.this$0.A.a).x;
                if (wat0Var != null) {
                    wat0Var.d.invoke();
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        pv0 pv0Var2 = (pv0) obj;
        vbt0 vbt0Var2 = (vbt0) this.this$0.Dg();
        String F = q5z.F(pv0Var2.a);
        String D = q5z.D(pv0Var2.a);
        rbt0 rbt0Var2 = this.$pickupFromPhotoState;
        d dVar2 = this.this$0;
        this.L$0 = null;
        this.L$1 = vbt0Var2;
        this.L$2 = F;
        this.L$3 = D;
        this.L$4 = rbt0Var2;
        this.label = 2;
        obj = d.Kg(dVar2, pv0Var2, this);
        if (obj != coroutineSingletons) {
            vbt0Var = vbt0Var2;
            str = F;
            str2 = D;
            rbt0Var = rbt0Var2;
            vbt0Var.render(new qbt0(str, str2, rbt0Var, ((Boolean) obj).booleanValue()));
            wat0Var = (wat0) ((zat0) this.this$0.A.a).x;
            if (wat0Var != null) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}

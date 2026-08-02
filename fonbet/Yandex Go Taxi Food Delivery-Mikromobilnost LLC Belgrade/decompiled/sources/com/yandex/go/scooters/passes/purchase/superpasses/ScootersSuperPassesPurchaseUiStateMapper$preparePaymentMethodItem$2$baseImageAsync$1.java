package com.yandex.go.scooters.passes.purchase.superpasses;

import android.graphics.drawable.Drawable;
import defpackage.bia0;
import defpackage.ffx;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x2h0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2$baseImageAsync$1", f = "ScootersSuperPassesPurchaseUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2$baseImageAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ lea0 $selected;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2$baseImageAsync$1(lea0 lea0Var, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$selected = lea0Var;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2$baseImageAsync$1(this.$selected, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2$baseImageAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r3 == null) goto L8;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Drawable y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        lea0 lea0Var = this.$selected;
        if (lea0Var != null) {
            h hVar = this.this$0;
            y = bia0.a(hVar.d, hVar.a, lea0Var);
        }
        y = tje.y(x2h0.ic_payment_add_card, this.this$0.a);
        return ffx.d0(y, 0, 0, 7);
    }
}

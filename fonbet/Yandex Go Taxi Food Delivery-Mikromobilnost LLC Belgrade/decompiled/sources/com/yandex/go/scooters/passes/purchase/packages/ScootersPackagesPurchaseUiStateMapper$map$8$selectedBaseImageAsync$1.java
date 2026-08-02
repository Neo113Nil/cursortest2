package com.yandex.go.scooters.passes.purchase.packages;

import android.graphics.drawable.Drawable;
import defpackage.bia0;
import defpackage.ffx;
import defpackage.hfa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.shq0;
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
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateMapper$map$8$selectedBaseImageAsync$1", f = "ScootersPackagesPurchaseUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseUiStateMapper$map$8$selectedBaseImageAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ hfa0 $paymentOptions;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateMapper$map$8$selectedBaseImageAsync$1(hfa0 hfa0Var, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$paymentOptions = hfa0Var;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPurchaseUiStateMapper$map$8$selectedBaseImageAsync$1(this.$paymentOptions, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseUiStateMapper$map$8$selectedBaseImageAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
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
        shq0 shq0Var = this.$paymentOptions.b;
        if (shq0Var != null) {
            i iVar = this.this$0;
            y = bia0.a(iVar.e, iVar.a, shq0Var.a);
        }
        y = tje.y(x2h0.ic_payment_add_card, this.this$0.a);
        return ffx.d0(y, 0, 0, 7);
    }
}

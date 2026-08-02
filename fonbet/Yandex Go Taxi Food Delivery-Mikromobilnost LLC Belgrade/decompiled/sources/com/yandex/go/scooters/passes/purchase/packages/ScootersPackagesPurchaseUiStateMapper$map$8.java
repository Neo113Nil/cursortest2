package com.yandex.go.scooters.passes.purchase.packages;

import android.graphics.Bitmap;
import defpackage.hfa0;
import defpackage.m8o0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lm8o0;", "<anonymous>", "(Ltse;)Lm8o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateMapper$map$8", f = "ScootersPackagesPurchaseUiStateMapper.kt", l = {193, 194}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseUiStateMapper$map$8 extends SuspendLambda implements wls {
    final /* synthetic */ hfa0 $paymentOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateMapper$map$8(hfa0 hfa0Var, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$paymentOptions = hfa0Var;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPackagesPurchaseUiStateMapper$map$8 scootersPackagesPurchaseUiStateMapper$map$8 = new ScootersPackagesPurchaseUiStateMapper$map$8(this.$paymentOptions, this.this$0, continuation);
        scootersPackagesPurchaseUiStateMapper$map$8.L$0 = obj;
        return scootersPackagesPurchaseUiStateMapper$map$8;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseUiStateMapper$map$8) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        Bitmap bitmap;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$map$8$selectedBaseImageAsync$1(this.$paymentOptions, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$map$8$selectedComplementImageAsync$1(this.$paymentOptions, this.this$0, null), 3);
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
                bitmap = (Bitmap) this.L$3;
                kotlin.b.b(obj);
                return new m8o0(bitmap, (Bitmap) obj);
            }
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        Bitmap bitmap2 = (Bitmap) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = bitmap2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            bitmap = bitmap2;
            obj = k;
            return new m8o0(bitmap, (Bitmap) obj);
        }
        return coroutineSingletons;
    }
}

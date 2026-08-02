package com.ybsdk.feature.pin.internal.screens.checkpin;

import defpackage.ay5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rhb;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel$onBiometricSuccess$1", f = "CheckPinViewModel.kt", l = {505, 506}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckPinViewModel$onBiometricSuccess$1 extends SuspendLambda implements wls {
    final /* synthetic */ ay5 $cryptoObject;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$onBiometricSuccess$1(b bVar, ay5 ay5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$cryptoObject = ay5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckPinViewModel$onBiometricSuccess$1(this.this$0, this.$cryptoObject, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckPinViewModel$onBiometricSuccess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (com.ybsdk.feature.pin.internal.screens.checkpin.b.c0(r5, r1, r4) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (com.ybsdk.feature.pin.internal.screens.checkpin.b.b0(r5, r1, r4) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = rhb.a[this.this$0.B.getCheckType().ordinal()];
            if (i2 == 1 || i2 == 2) {
                b bVar = this.this$0;
                ay5 ay5Var = this.$cryptoObject;
                this.label = 1;
            } else if (i2 == 3) {
                b bVar2 = this.this$0;
                ay5 ay5Var2 = this.$cryptoObject;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}

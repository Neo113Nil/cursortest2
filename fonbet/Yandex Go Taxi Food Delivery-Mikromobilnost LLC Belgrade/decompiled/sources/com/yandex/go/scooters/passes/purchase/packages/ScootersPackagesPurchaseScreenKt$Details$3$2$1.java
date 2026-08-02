package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.is6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oip0;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseScreenKt$Details$3$2$1", f = "ScootersPackagesPurchaseScreen.kt", l = {342, 344}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseScreenKt$Details$3$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $expanded$delegate;
    final /* synthetic */ oip0 $scrollState;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseScreenKt$Details$3$2$1(oz40 oz40Var, oip0 oip0Var, Continuation continuation) {
        super(2, continuation);
        this.$expanded$delegate = oz40Var;
        this.$scrollState = oip0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPurchaseScreenKt$Details$3$2$1(this.$expanded$delegate, this.$scrollState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseScreenKt$Details$3$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (defpackage.oip0.f(r1, r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r7 == r0) goto L17;
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
            if (((Boolean) this.$expanded$delegate.getValue()).booleanValue()) {
                e eVar = new e(kotlinx.coroutines.flow.e.p(androidx.compose.runtime.f.o(new is6(this.$scrollState, 6)), 50L), this.$scrollState);
                this.label = 1;
                obj = kotlinx.coroutines.flow.e.y(eVar, this);
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        oip0 oip0Var = this.$scrollState;
        int intValue = ((Number) obj).intValue();
        this.I$0 = intValue;
        this.label = 2;
    }
}

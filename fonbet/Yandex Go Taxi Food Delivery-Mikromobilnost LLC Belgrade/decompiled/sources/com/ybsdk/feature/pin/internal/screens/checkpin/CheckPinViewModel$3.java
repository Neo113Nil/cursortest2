package com.ybsdk.feature.pin.internal.screens.checkpin;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.phb;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.wzb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel$3", f = "CheckPinViewModel.kt", l = {HProv.PP_SIGNATUREOID, HProv.PP_RESERVED1}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckPinViewModel$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$3(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckPinViewModel$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckPinViewModel$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r14 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0026, code lost:
    
        if (com.ybsdk.feature.pin.internal.screens.checkpin.b.f0(r14, r13) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wzb0 wzb0Var = (wzb0) obj;
                pz40 Y = this.this$0.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, null, null, wzb0Var, null, false, null, 3839)));
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        if (this.this$0.B.getCheckType().isEnterOrValidateOnReturn$feature_pin_release()) {
            com.ybsdk.di.modules.features.pin.a aVar = this.this$0.K;
            if (aVar.a) {
                this.label = 2;
                obj = aVar.a(this);
            }
        }
        return zy11.a;
    }
}

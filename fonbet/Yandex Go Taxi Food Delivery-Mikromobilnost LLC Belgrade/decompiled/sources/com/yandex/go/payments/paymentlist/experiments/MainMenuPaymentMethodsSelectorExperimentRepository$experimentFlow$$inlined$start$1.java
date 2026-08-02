package com.yandex.go.payments.paymentlist.experiments;

import defpackage.b600;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1", f = "MainMenuPaymentMethodsSelectorExperimentRepository.kt", l = {HProv.PP_SIGNATUREOID, 67}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class MainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b600 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1(Continuation continuation, b600 b600Var) {
        super(2, continuation);
        this.this$0 = b600Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1 mainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1 = new MainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1(continuation, this.this$0);
        mainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1.L$0 = obj;
        return mainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainMenuPaymentMethodsSelectorExperimentRepository$experimentFlow$$inlined$start$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t1b0 t1b0Var = this.this$0.a;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.L$2 = null;
            this.label = 1;
            obj = t1b0Var.b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}

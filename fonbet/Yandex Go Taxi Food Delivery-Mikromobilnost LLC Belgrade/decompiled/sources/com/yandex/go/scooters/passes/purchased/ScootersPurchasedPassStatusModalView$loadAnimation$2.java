package com.yandex.go.scooters.passes.purchased;

import com.yandex.go.lottie_loader.a;
import com.yandex.go.scooters.passes.experiments.model.ScootersFireworkForSuperPassPurchaseExperiment;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ynn0;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnsz;", "<anonymous>", "(Ltse;)Lnsz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchased.ScootersPurchasedPassStatusModalView$loadAnimation$2", f = "ScootersPurchasedPassStatusModalView.kt", l = {100, 102}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersPurchasedPassStatusModalView$loadAnimation$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ ScootersPurchasedPassStatusModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPurchasedPassStatusModalView$loadAnimation$2(ScootersPurchasedPassStatusModalView scootersPurchasedPassStatusModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersPurchasedPassStatusModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPurchasedPassStatusModalView$loadAnimation$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPurchasedPassStatusModalView$loadAnimation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ynn0 ynn0Var;
        ytz ytzVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ynn0Var = this.this$0.scootersFireworkForSuperPassPurchaseExperimentRepository;
            this.label = 1;
            obj = ynn0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return (nsz) obj;
            }
            b.b(obj);
        }
        ScootersFireworkForSuperPassPurchaseExperiment scootersFireworkForSuperPassPurchaseExperiment = (ScootersFireworkForSuperPassPurchaseExperiment) obj;
        if (!scootersFireworkForSuperPassPurchaseExperiment.b) {
            return null;
        }
        ytzVar = this.this$0.lottieLoader;
        String str = scootersFireworkForSuperPassPurchaseExperiment.c;
        this.L$0 = null;
        this.label = 2;
        obj = ((a) ytzVar).a(str, this);
    }
}

package com.yandex.go.scooters.ignition;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.go.scooters.ignition.domain.k;
import defpackage.brn0;
import defpackage.ksn0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.ScootersIgnitionRouterImpl$onAttach$1", f = "ScootersIgnitionRouterImpl.kt", l = {24, 31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionRouterImpl$onAttach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionRouterImpl$onAttach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r7 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        if (i == 0) {
            b.b(obj);
            brn0 brn0Var = this.this$0.F;
            this.label = 1;
            obj = brn0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a aVar = this.this$0;
                if (booleanValue) {
                    aVar.z((m950) aVar.G.get(), new ksn0(this.this$0, i2));
                    return zy11Var;
                }
                aVar.r(new qu(9));
                return zy11Var;
            }
            b.b(obj);
        }
        ScootersIgnitionExperiment scootersIgnitionExperiment = (ScootersIgnitionExperiment) obj;
        if (!scootersIgnitionExperiment.b) {
            this.this$0.r(new qu(9));
            return zy11Var;
        }
        ScootersIgnitionExperiment.Ui.ControlPanel controlPanel = scootersIgnitionExperiment.r.g;
        a aVar2 = this.this$0;
        if (controlPanel != null) {
            aVar2.z((m950) aVar2.E.get(), new ksn0(this.this$0, 0));
            return zy11Var;
        }
        k kVar = (k) aVar2.D.get();
        this.L$0 = null;
        this.label = 2;
        obj = kVar.a(this);
    }
}

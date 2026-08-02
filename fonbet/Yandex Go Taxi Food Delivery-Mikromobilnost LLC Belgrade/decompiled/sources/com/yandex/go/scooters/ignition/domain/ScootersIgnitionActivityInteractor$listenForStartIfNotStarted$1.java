package com.yandex.go.scooters.ignition.domain;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionActivityInteractor$listenForStartIfNotStarted$1", f = "ScootersIgnitionActivityInteractor.kt", l = {49, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersIgnitionActivityInteractor$listenForStartIfNotStarted$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionActivityInteractor$listenForStartIfNotStarted$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionActivityInteractor$listenForStartIfNotStarted$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionActivityInteractor$listenForStartIfNotStarted$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.b(r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
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
            this.this$0.a.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            ScootersIgnitionActivityInteractor$listenForStartIfNotStarted$1$experiment$1 scootersIgnitionActivityInteractor$listenForStartIfNotStarted$1$experiment$1 = new ScootersIgnitionActivityInteractor$listenForStartIfNotStarted$1$experiment$1(this.this$0, null);
            this.label = 1;
            obj = tje.k0(mdhVar, scootersIgnitionActivityInteractor$listenForStartIfNotStarted$1$experiment$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        if (((ScootersIgnitionExperiment) obj).i == ScootersIgnitionExperiment.RestartStrategy.ACTIVITY_CREATE) {
            k kVar = (k) this.this$0.e.get();
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}

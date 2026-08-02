package com.yandex.go.scooters.discovery;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ukn0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.experiments.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.discovery.ScootersDiscoveryPresenter$listenLogotype$1", f = "ScootersDiscoveryPresenter.kt", l = {112, HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDiscoveryPresenter$listenLogotype$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryPresenter$listenLogotype$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDiscoveryPresenter$listenLogotype$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDiscoveryPresenter$listenLogotype$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ukn0 ukn0Var = this.this$0.E;
            this.label = 1;
            obj = ukn0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        String str = ((g0) obj).e;
        if (str.length() != 0) {
            tpr a = this.this$0.z.a();
            i iVar = new i(this.this$0, str);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (a.collect(iVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}

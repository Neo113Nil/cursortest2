package com.yandex.go.scooters.ignition.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$1", f = "ScootersIgnitionOptionsStateHolderInteractor.kt", l = {20, 21, 22, 23, 24}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$1 scootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$1 = new ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$1(2, continuation);
        scootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$1.L$0 = obj;
        return scootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionOptionsStateHolderInteractor$optionsStateHolderFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r10) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r0.emit(r9, r10) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (kotlinx.coroutines.a.i(500, r10) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r0.emit(r9, r10) == r1) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        kotlin.b.b(obj);
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.L$0 = null;
                this.label = 5;
                return vprVar.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 4;
        }
        this.L$0 = vprVar;
        this.label = 2;
    }
}

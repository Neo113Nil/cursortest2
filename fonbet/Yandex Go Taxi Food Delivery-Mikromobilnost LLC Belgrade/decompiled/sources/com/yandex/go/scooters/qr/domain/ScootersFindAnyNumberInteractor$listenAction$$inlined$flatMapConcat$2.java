package com.yandex.go.scooters.qr.domain;

import android.net.Uri;
import defpackage.gro0;
import defpackage.hro0;
import defpackage.iro0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.w511;
import defpackage.wls;
import defpackage.yln0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.domain.ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2", f = "ScootersFindAnyNumberInteractor.kt", l = {269, 269}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ yln0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2(Continuation continuation, yln0 yln0Var) {
        super(2, continuation);
        this.this$0 = yln0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2 scootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2 = new ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2(continuation, this.this$0);
        scootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2.L$0 = obj;
        return scootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r7 == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        yln0 yln0Var;
        Object obj2;
        Object obj3 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uri = (Uri) obj3;
            yln0Var = this.this$0;
            e eVar = yln0Var.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = uri;
            this.L$3 = yln0Var;
            this.label = 1;
            obj = eVar.a(uri, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            yln0Var = (yln0) this.L$3;
            uri = (Uri) this.L$2;
            kotlin.b.b(obj);
        }
        iro0 iro0Var = (iro0) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        if (iro0Var instanceof hro0) {
            obj2 = yln0Var.d.a((hro0) iro0Var, uri, this);
        } else {
            yln0Var.getClass();
            if (!jl40.l(iro0Var, gro0.a)) {
                w511.b();
                return null;
            }
            obj2 = pvn.a;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}

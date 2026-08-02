package com.yandex.go.taxi.order.change.source.mvp;

import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import defpackage.ac9;
import defpackage.fmt;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uf9;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.ChangeOrderSourceAddressPresenter$check$1", f = "ChangeOrderSourceAddressPresenter.kt", l = {143, 147, 196}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeOrderSourceAddressPresenter$check$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderSourceAddressPresenter$check$1(d dVar, pv0 pv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$addressInfo = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeOrderSourceAddressPresenter$check$1(this.this$0, this.$addressInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeOrderSourceAddressPresenter$check$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (defpackage.tje.k0(r7, r8, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        if (defpackage.tje.k0(r3, r4, r9) != r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.taxi.order.change.source.mvp.d, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        pv0 pv0Var;
        d dVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            r1.B.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            ChangeOrderSourceAddressPresenter$check$1$2$1 changeOrderSourceAddressPresenter$check$1$2$1 = new ChangeOrderSourceAddressPresenter$check$1$2$1(th, r1, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
        if (r1 == 0) {
            kotlin.b.b(obj);
            ((ac9) this.this$0.Dg()).changePinState(uf9.a);
            r10.Ng(true, (r3 & 2) == 0, (ChangeSourcePointExperiment) this.this$0.H.getValue());
            dVar = this.this$0;
            pv0 pv0Var2 = this.$addressInfo;
            com.yandex.go.taxi.order.change.source.interactor.c cVar = dVar.A;
            String str = dVar.x.a.b().a;
            zzs B = pv0Var2.a.B();
            this.L$0 = dVar;
            this.L$1 = pv0Var2;
            this.L$2 = dVar;
            this.label = 1;
            Object a = cVar.a(str, B, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            pv0Var = pv0Var2;
            obj = a;
            dVar2 = dVar;
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                    kotlin.b.b(obj);
                } else {
                    if (r1 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
            dVar = (d) this.L$2;
            pv0Var = (pv0) this.L$1;
            dVar2 = (d) this.L$0;
            kotlin.b.b(obj);
        }
        dVar2.B.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        ChangeOrderSourceAddressPresenter$check$1$1$1 changeOrderSourceAddressPresenter$check$1$1$1 = new ChangeOrderSourceAddressPresenter$check$1$1$1(pv0Var, (fmt) obj, dVar2, null);
        this.L$0 = dVar;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}

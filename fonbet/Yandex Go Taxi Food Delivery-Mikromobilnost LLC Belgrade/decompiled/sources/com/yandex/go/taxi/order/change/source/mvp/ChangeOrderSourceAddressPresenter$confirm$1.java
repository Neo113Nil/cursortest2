package com.yandex.go.taxi.order.change.source.mvp;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.change.source.data.SourceChangeReason;
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
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.ChangeOrderSourceAddressPresenter$confirm$1", f = "ChangeOrderSourceAddressPresenter.kt", l = {249, 255, 328}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeOrderSourceAddressPresenter$confirm$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderSourceAddressPresenter$confirm$1(d dVar, pv0 pv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$addressInfo = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeOrderSourceAddressPresenter$confirm$1(this.this$0, this.$addressInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeOrderSourceAddressPresenter$confirm$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        if (defpackage.tje.k0(r14, r7, r13) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (defpackage.tje.k0(r14, r15, r13) != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChangeOrderSourceAddressPresenter$confirm$1 changeOrderSourceAddressPresenter$confirm$1;
        pv0 pv0Var;
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        d dVar2 = this.label;
        try {
            try {
            } catch (Throwable unused) {
                changeOrderSourceAddressPresenter$confirm$1 = this;
            }
            if (dVar2 == 0) {
                kotlin.b.b(obj);
                r15.Ng(true, (r3 & 2) == 0, (ChangeSourcePointExperiment) this.this$0.H.getValue());
                ((ac9) this.this$0.Dg()).changeBackButtonVisibility(false);
                ((ac9) this.this$0.Dg()).changeAutoLocateButtonVisibility(false);
                pv0Var = this.$addressInfo;
                dVar2 = this.this$0;
                pv0Var.a.v0(dVar2.K);
                com.yandex.go.taxi.order.change.source.interactor.c cVar = dVar2.A;
                String str = dVar2.G;
                String str2 = dVar2.x.a.b().a;
                Address address = pv0Var.a;
                this.L$0 = pv0Var;
                this.L$1 = dVar2;
                this.L$2 = dVar2;
                this.label = 1;
                changeOrderSourceAddressPresenter$confirm$1 = this;
                try {
                    obj = cVar.b(str, str2, address, SourceChangeReason.PICKUP_POINT_MANUAL, changeOrderSourceAddressPresenter$confirm$1);
                } catch (Throwable unused2) {
                    dVar2.B.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    ChangeOrderSourceAddressPresenter$confirm$1$2$1 changeOrderSourceAddressPresenter$confirm$1$2$1 = new ChangeOrderSourceAddressPresenter$confirm$1$2$1(dVar2, null);
                    changeOrderSourceAddressPresenter$confirm$1.L$0 = null;
                    changeOrderSourceAddressPresenter$confirm$1.L$1 = null;
                    changeOrderSourceAddressPresenter$confirm$1.L$2 = null;
                    changeOrderSourceAddressPresenter$confirm$1.label = 3;
                }
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                dVar = dVar2;
                dVar2 = dVar2;
            } else {
                if (dVar2 != 1) {
                    if (dVar2 == 2) {
                        kotlin.b.b(obj);
                    } else {
                        if (dVar2 != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
                d dVar3 = (d) this.L$2;
                dVar = (d) this.L$1;
                pv0Var = (pv0) this.L$0;
                kotlin.b.b(obj);
                changeOrderSourceAddressPresenter$confirm$1 = this;
                dVar2 = dVar3;
            }
            dVar.B.getClass();
            sjh sjhVar2 = uyj.a;
            g6u g6uVar2 = o400.a;
            ChangeOrderSourceAddressPresenter$confirm$1$1$1 changeOrderSourceAddressPresenter$confirm$1$1$1 = new ChangeOrderSourceAddressPresenter$confirm$1$1$1(pv0Var, (fmt) obj, dVar, null);
            changeOrderSourceAddressPresenter$confirm$1.L$0 = dVar2;
            changeOrderSourceAddressPresenter$confirm$1.L$1 = null;
            changeOrderSourceAddressPresenter$confirm$1.L$2 = null;
            changeOrderSourceAddressPresenter$confirm$1.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}

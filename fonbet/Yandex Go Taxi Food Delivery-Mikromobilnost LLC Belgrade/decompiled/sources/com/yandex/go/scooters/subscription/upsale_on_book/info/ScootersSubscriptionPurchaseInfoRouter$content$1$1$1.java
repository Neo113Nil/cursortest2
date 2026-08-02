package com.yandex.go.scooters.subscription.upsale_on_book.info;

import defpackage.cyo0;
import defpackage.dyo0;
import defpackage.eyo0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nxo0;
import defpackage.ny61;
import defpackage.oxo0;
import defpackage.pxo0;
import defpackage.qxo0;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.subscription.upsale_on_book.info.ScootersSubscriptionPurchaseInfoRouter$content$1$1$1", f = "ScootersSubscriptionPurchaseInfoRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionPurchaseInfoRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ pxo0 $action;
    final /* synthetic */ nxo0 $navigator;
    final /* synthetic */ qxo0 $scootersSubscriptionPurchaseInfoUiActionInteractor;
    final /* synthetic */ eyo0 $window;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionPurchaseInfoRouter$content$1$1$1(qxo0 qxo0Var, pxo0 pxo0Var, nxo0 nxo0Var, eyo0 eyo0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersSubscriptionPurchaseInfoUiActionInteractor = qxo0Var;
        this.$action = pxo0Var;
        this.$navigator = nxo0Var;
        this.$window = eyo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSubscriptionPurchaseInfoRouter$content$1$1$1(this.$scootersSubscriptionPurchaseInfoUiActionInteractor, this.$action, this.$navigator, this.$window, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersSubscriptionPurchaseInfoRouter$content$1$1$1 scootersSubscriptionPurchaseInfoRouter$content$1$1$1 = (ScootersSubscriptionPurchaseInfoRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersSubscriptionPurchaseInfoRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qxo0 qxo0Var = this.$scootersSubscriptionPurchaseInfoUiActionInteractor;
        pxo0 pxo0Var = this.$action;
        nxo0 nxo0Var = this.$navigator;
        eyo0 eyo0Var = this.$window;
        qxo0Var.getClass();
        if (!jl40.l(pxo0Var, oxo0.c)) {
            if (jl40.l(pxo0Var, oxo0.b)) {
                dyo0 dyo0Var = eyo0Var.d;
                final cyo0 cyo0Var = dyo0Var != null ? dyo0Var.c : null;
                if (cyo0Var == null) {
                    zgz.a(null, new IllegalStateException("No reject button for reject action"));
                } else {
                    final int i = 1;
                    nxo0Var.a.r(new tls() { // from class: mxo0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i2 = i;
                            zy11 zy11Var = zy11.a;
                            cyo0 cyo0Var2 = cyo0Var;
                            d7n0 d7n0Var = (d7n0) obj2;
                            switch (i2) {
                                case 0:
                                    d7n0Var.b.invoke(cyo0Var2);
                                    break;
                                default:
                                    d7n0Var.c.invoke(cyo0Var2);
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                }
            } else {
                if (!jl40.l(pxo0Var, oxo0.a)) {
                    w511.b();
                    return null;
                }
                final cyo0 cyo0Var2 = eyo0Var.c.c;
                final int i2 = 0;
                nxo0Var.a.r(new tls() { // from class: mxo0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i22 = i2;
                        zy11 zy11Var = zy11.a;
                        cyo0 cyo0Var22 = cyo0Var2;
                        d7n0 d7n0Var = (d7n0) obj2;
                        switch (i22) {
                            case 0:
                                d7n0Var.b.invoke(cyo0Var22);
                                break;
                            default:
                                d7n0Var.c.invoke(cyo0Var22);
                                break;
                        }
                        return zy11Var;
                    }
                });
            }
        }
        return zy11.a;
    }
}

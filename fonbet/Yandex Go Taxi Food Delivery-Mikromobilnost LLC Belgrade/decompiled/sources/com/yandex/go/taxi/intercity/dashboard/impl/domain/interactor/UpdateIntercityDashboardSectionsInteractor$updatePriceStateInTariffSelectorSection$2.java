package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.gjw;
import defpackage.lkw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.okw;
import defpackage.pkw;
import defpackage.qkw;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgjw;", "section", "<anonymous>", "(Lgjw;)Lgjw;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.UpdateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2", f = "UpdateIntercityDashboardSectionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UpdateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2 updateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2 = new UpdateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2(this.this$0, continuation);
        updateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2.L$0 = obj;
        return updateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2) create((gjw) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gjw gjwVar = (gjw) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qkw qkwVar = this.this$0.a;
        ?? r10 = gjwVar.b;
        qkwVar.getClass();
        Iterable<pkw> iterable = (Iterable) r10;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((pkw) it.next()).b().e instanceof lkw) {
                    r10 = new ArrayList(tcc.n(iterable, 10));
                    for (pkw pkwVar : iterable) {
                        okw okwVar = pkwVar.e;
                        lkw lkwVar = lkw.a;
                        r10.add(pkw.a(pkwVar, false, false, okw.a(okwVar, lkwVar), okw.a(pkwVar.f, lkwVar), okw.a(pkwVar.g, lkwVar), 15));
                    }
                }
            }
        }
        return new gjw(gjwVar.a, r10);
    }
}

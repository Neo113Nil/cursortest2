package com.yandex.go.taxi.order.listener;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.i1w0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p870;
import defpackage.q251;
import defpackage.q780;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.multiorder.multi.ServiceType;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.listener.TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2", f = "TaxiOrderFeedbackActivityListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2 taxiOrderFeedbackActivityListener$setupFeedbackHandler$2 = new TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2(this.this$0, continuation);
        taxiOrderFeedbackActivityListener$setupFeedbackHandler$2.L$0 = obj;
        return taxiOrderFeedbackActivityListener$setupFeedbackHandler$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2 taxiOrderFeedbackActivityListener$setupFeedbackHandler$2 = (TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderFeedbackActivityListener$setupFeedbackHandler$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.this$0.h.a()) {
            p870 p870Var = (p870) this.this$0.d.get();
            List<o2y0> list = p870Var.b.a().a;
            ArrayList arrayList = new ArrayList();
            for (o2y0 o2y0Var : list) {
                String str = o2y0Var.c() == DriveState.COMPLETE ? o2y0Var.b().a : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            p870Var.d = arrayList;
        }
        final b bVar = this.this$0;
        bVar.c.t = new q780() { // from class: com.yandex.go.taxi.order.listener.a
            @Override // defpackage.q780
            public final void g(TaxiOrder taxiOrder) {
                String str2 = taxiOrder.a;
                b bVar2 = b.this;
                if (!bVar2.h.a()) {
                    tje.N(tseVar, null, null, new TaxiOrderFeedbackActivityListener$setupFeedbackHandler$2$1$1(bVar2, taxiOrder, null), 3);
                    return;
                }
                p870 p870Var2 = (p870) bVar2.d.get();
                if (p870Var2.d.contains(str2)) {
                    List list2 = p870Var2.d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (!jl40.l((String) obj2, str2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    p870Var2.d = arrayList2;
                    i1w0 i1w0Var = p870Var2.c;
                    String alias = ServiceType.TAXI.getAlias();
                    i1w0Var.getClass();
                    DetailsOpenReason detailsOpenReason = DetailsOpenReason.AUTO;
                    i1w0Var.b(alias, detailsOpenReason.alias).m();
                    ((com.yandex.go.superapp.impl.router.a) p870Var2.a).b(taxiOrder, false, detailsOpenReason, TaxiCardNavigationAction.EMPTY, new q251(10));
                }
            }
        };
        return zy11.a;
    }
}

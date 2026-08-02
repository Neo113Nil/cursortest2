package com.yandex.go.taxi.order.repositories;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import defpackage.pvn;
import defpackage.tls;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class PaidWaitingTimerInCardRepository$timerStateFlowInTitle$1 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r0 != false) goto L19;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        TaxiOrder taxiOrder = (TaxiOrder) obj;
        n nVar = (n) this.receiver;
        nVar.getClass();
        Date c = nVar.b.c(n.e(taxiOrder.V()));
        pvn pvnVar = pvn.a;
        if (c != null) {
            long time = c.getTime();
            if (!nVar.g(taxiOrder)) {
                if (time >= nVar.c.d()) {
                    if (n.f(taxiOrder.V()).b) {
                        z = true;
                    } else {
                        PaidWaitingTimerInCardExperiment.FreeWaitingInTitle freeWaitingInTitle = n.d(taxiOrder).e;
                        z = freeWaitingInTitle != null ? freeWaitingInTitle.a : false;
                    }
                }
            }
            return nVar.h(taxiOrder, time);
        }
        return pvnVar;
    }
}

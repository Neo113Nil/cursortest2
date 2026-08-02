package com.yandex.go.taxi.order.multi.feed.experiments;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment;
import defpackage.d1y0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class e implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public e(rqo rqoVar) {
        TaxiOrderFeedStateSettingsExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(TaxiOrderFeedStateSettingsExperiment.e);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (TaxiOrderFeedStateSettingsExperiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        TaxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1 taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1;
        int i;
        Iterator it;
        Object obj;
        TaxiOrderFeedStateSettingsExperiment.StateDto stateDto;
        List list;
        if (continuationImpl instanceof TaxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1) {
            taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1 = (TaxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1) continuationImpl;
            int i2 = taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1.L$0 = taxiOrder;
                    taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1.label = 1;
                    obj2 = this.a.b(taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    taxiOrder = (TaxiOrder) taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1.L$0;
                    kotlin.b.b(obj2);
                }
                TaxiOrderFeedStateSettingsExperiment taxiOrderFeedStateSettingsExperiment = (TaxiOrderFeedStateSettingsExperiment) obj2;
                it = taxiOrderFeedStateSettingsExperiment.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        TaxiOrderFeedStateSettingsExperiment.StateDto stateDto2 = (TaxiOrderFeedStateSettingsExperiment.StateDto) obj;
                        if (stateDto2.a == taxiOrder.h.b && ((list = stateDto2.b) == null || list.isEmpty() || stateDto2.b.contains(taxiOrder.x()))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                stateDto = (TaxiOrderFeedStateSettingsExperiment.StateDto) obj;
                if (stateDto == null || ((taxiOrder.l.c0.contains(taxiOrder.h.b) && !stateDto.g) || !taxiOrderFeedStateSettingsExperiment.b)) {
                    return null;
                }
                int i3 = d.a[stateDto.c.ordinal()];
                return new d1y0(i3 == 1 ? i3 != 2 ? 6 : 4 : 3, taxiOrder.h.b, stateDto.d, TimeUnit.SECONDS.toMillis(stateDto.e), stateDto.f, stateDto.g);
            }
        }
        taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1 = new TaxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1(this, continuationImpl);
        Object obj22 = taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderFeedStateSettingsExperimentRepository$getStateForOrder$1.label;
        if (i != 0) {
        }
        TaxiOrderFeedStateSettingsExperiment taxiOrderFeedStateSettingsExperiment2 = (TaxiOrderFeedStateSettingsExperiment) obj22;
        it = taxiOrderFeedStateSettingsExperiment2.c.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        stateDto = (TaxiOrderFeedStateSettingsExperiment.StateDto) obj;
        if (stateDto == null) {
            int i32 = d.a[stateDto.c.ordinal()];
            return new d1y0(i32 == 1 ? i32 != 2 ? 6 : 4 : 3, taxiOrder.h.b, stateDto.d, TimeUnit.SECONDS.toMillis(stateDto.e), stateDto.f, stateDto.g);
        }
        return null;
    }
}

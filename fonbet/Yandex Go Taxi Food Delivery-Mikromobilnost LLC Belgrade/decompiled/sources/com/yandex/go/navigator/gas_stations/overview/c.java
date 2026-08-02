package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.go.navigator.gas_stations.repositories.GasStationsFocusRectReadyRequestRepository;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1 gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof GasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1) {
            gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1 = (GasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1) continuation;
            int i2 = gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((GasStationsFocusRectReadyRequestRepository.FocusRectStatus) obj) == GasStationsFocusRectReadyRequestRepository.FocusRectStatus.REQUESTED) {
                        gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.L$0 = null;
                        gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.L$1 = null;
                        gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.L$2 = null;
                        gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.L$3 = null;
                        gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1 = new GasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}

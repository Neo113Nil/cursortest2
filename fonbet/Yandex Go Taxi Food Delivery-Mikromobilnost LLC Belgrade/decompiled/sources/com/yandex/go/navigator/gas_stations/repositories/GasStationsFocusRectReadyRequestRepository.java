package com.yandex.go.navigator.gas_stations.repositories;

import defpackage.gci0;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.xz4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class GasStationsFocusRectReadyRequestRepository extends xz4 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/repositories/GasStationsFocusRectReadyRequestRepository$FocusRectStatus;", "", "READY", "REQUESTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FocusRectStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FocusRectStatus[] $VALUES;
        public static final FocusRectStatus READY;
        public static final FocusRectStatus REQUESTED;

        static {
            FocusRectStatus focusRectStatus = new FocusRectStatus("READY", 0);
            READY = focusRectStatus;
            FocusRectStatus focusRectStatus2 = new FocusRectStatus("REQUESTED", 1);
            REQUESTED = focusRectStatus2;
            FocusRectStatus[] focusRectStatusArr = {focusRectStatus, focusRectStatus2};
            $VALUES = focusRectStatusArr;
            $ENTRIES = kotlin.enums.a.a(focusRectStatusArr);
        }

        public static FocusRectStatus valueOf(String str) {
            return (FocusRectStatus) Enum.valueOf(FocusRectStatus.class, str);
        }

        public static FocusRectStatus[] values() {
            return (FocusRectStatus[]) $VALUES.clone();
        }
    }

    public GasStationsFocusRectReadyRequestRepository() {
        super(10, FocusRectStatus.REQUESTED);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1 gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1;
        int i;
        if (continuationImpl instanceof GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1) {
            gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1 = (GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1) continuationImpl;
            int i2 = gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l(FocusRectStatus.REQUESTED);
                    gci0 gci0Var = (gci0) this.b;
                    GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2 gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2 = new GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2(2, null);
                    gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(gci0Var, gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$2, gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1 = new GasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1(this, continuationImpl);
        Object obj2 = gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsFocusRectReadyRequestRepository$awaitFocusRectReady$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}

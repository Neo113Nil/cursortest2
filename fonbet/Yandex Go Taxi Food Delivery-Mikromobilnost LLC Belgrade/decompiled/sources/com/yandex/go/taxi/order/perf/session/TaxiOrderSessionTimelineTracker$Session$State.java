package com.yandex.go.taxi.order.perf.session;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/perf/session/TaxiOrderSessionTimelineTracker$Session$State", "", "Lcom/yandex/go/taxi/order/perf/session/TaxiOrderSessionTimelineTracker$Session$State;", "WAITING_SCENARIO", "STARTED", "EVENT_ADDED", TlsConstants.TLS_FINISHED, "go-client-android.features.taxi_order:perf"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderSessionTimelineTracker$Session$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderSessionTimelineTracker$Session$State[] $VALUES;
    public static final TaxiOrderSessionTimelineTracker$Session$State EVENT_ADDED;
    public static final TaxiOrderSessionTimelineTracker$Session$State FINISHED;
    public static final TaxiOrderSessionTimelineTracker$Session$State STARTED;
    public static final TaxiOrderSessionTimelineTracker$Session$State WAITING_SCENARIO;

    static {
        TaxiOrderSessionTimelineTracker$Session$State taxiOrderSessionTimelineTracker$Session$State = new TaxiOrderSessionTimelineTracker$Session$State("WAITING_SCENARIO", 0);
        WAITING_SCENARIO = taxiOrderSessionTimelineTracker$Session$State;
        TaxiOrderSessionTimelineTracker$Session$State taxiOrderSessionTimelineTracker$Session$State2 = new TaxiOrderSessionTimelineTracker$Session$State("STARTED", 1);
        STARTED = taxiOrderSessionTimelineTracker$Session$State2;
        TaxiOrderSessionTimelineTracker$Session$State taxiOrderSessionTimelineTracker$Session$State3 = new TaxiOrderSessionTimelineTracker$Session$State("EVENT_ADDED", 2);
        EVENT_ADDED = taxiOrderSessionTimelineTracker$Session$State3;
        TaxiOrderSessionTimelineTracker$Session$State taxiOrderSessionTimelineTracker$Session$State4 = new TaxiOrderSessionTimelineTracker$Session$State(TlsConstants.TLS_FINISHED, 3);
        FINISHED = taxiOrderSessionTimelineTracker$Session$State4;
        TaxiOrderSessionTimelineTracker$Session$State[] taxiOrderSessionTimelineTracker$Session$StateArr = {taxiOrderSessionTimelineTracker$Session$State, taxiOrderSessionTimelineTracker$Session$State2, taxiOrderSessionTimelineTracker$Session$State3, taxiOrderSessionTimelineTracker$Session$State4};
        $VALUES = taxiOrderSessionTimelineTracker$Session$StateArr;
        $ENTRIES = kotlin.enums.a.a(taxiOrderSessionTimelineTracker$Session$StateArr);
    }

    public static TaxiOrderSessionTimelineTracker$Session$State valueOf(String str) {
        return (TaxiOrderSessionTimelineTracker$Session$State) Enum.valueOf(TaxiOrderSessionTimelineTracker$Session$State.class, str);
    }

    public static TaxiOrderSessionTimelineTracker$Session$State[] values() {
        return (TaxiOrderSessionTimelineTracker$Session$State[]) $VALUES.clone();
    }
}

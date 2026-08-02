package com.yandex.go.taxi.order.net.xiva;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/net/xiva/TaxiRouteWebSocketTrackingInteractor$WsAction", "", "Lcom/yandex/go/taxi/order/net/xiva/TaxiRouteWebSocketTrackingInteractor$WsAction;", "CONNECT", "DISCONNECT", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final class TaxiRouteWebSocketTrackingInteractor$WsAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiRouteWebSocketTrackingInteractor$WsAction[] $VALUES;
    public static final TaxiRouteWebSocketTrackingInteractor$WsAction CONNECT;
    public static final TaxiRouteWebSocketTrackingInteractor$WsAction DISCONNECT;
    public static final TaxiRouteWebSocketTrackingInteractor$WsAction NONE;

    static {
        TaxiRouteWebSocketTrackingInteractor$WsAction taxiRouteWebSocketTrackingInteractor$WsAction = new TaxiRouteWebSocketTrackingInteractor$WsAction("CONNECT", 0);
        CONNECT = taxiRouteWebSocketTrackingInteractor$WsAction;
        TaxiRouteWebSocketTrackingInteractor$WsAction taxiRouteWebSocketTrackingInteractor$WsAction2 = new TaxiRouteWebSocketTrackingInteractor$WsAction("DISCONNECT", 1);
        DISCONNECT = taxiRouteWebSocketTrackingInteractor$WsAction2;
        TaxiRouteWebSocketTrackingInteractor$WsAction taxiRouteWebSocketTrackingInteractor$WsAction3 = new TaxiRouteWebSocketTrackingInteractor$WsAction(JCP.RAW_PREFIX, 2);
        NONE = taxiRouteWebSocketTrackingInteractor$WsAction3;
        TaxiRouteWebSocketTrackingInteractor$WsAction[] taxiRouteWebSocketTrackingInteractor$WsActionArr = {taxiRouteWebSocketTrackingInteractor$WsAction, taxiRouteWebSocketTrackingInteractor$WsAction2, taxiRouteWebSocketTrackingInteractor$WsAction3};
        $VALUES = taxiRouteWebSocketTrackingInteractor$WsActionArr;
        $ENTRIES = kotlin.enums.a.a(taxiRouteWebSocketTrackingInteractor$WsActionArr);
    }

    public static TaxiRouteWebSocketTrackingInteractor$WsAction valueOf(String str) {
        return (TaxiRouteWebSocketTrackingInteractor$WsAction) Enum.valueOf(TaxiRouteWebSocketTrackingInteractor$WsAction.class, str);
    }

    public static TaxiRouteWebSocketTrackingInteractor$WsAction[] values() {
        return (TaxiRouteWebSocketTrackingInteractor$WsAction[]) $VALUES.clone();
    }
}

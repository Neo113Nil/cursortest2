package com.yandex.go.taxi.order.net.xiva;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiRouteWebSocketTrackingInteractor$WsAction.values().length];
        try {
            iArr[TaxiRouteWebSocketTrackingInteractor$WsAction.CONNECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiRouteWebSocketTrackingInteractor$WsAction.DISCONNECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxiRouteWebSocketTrackingInteractor$WsAction.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

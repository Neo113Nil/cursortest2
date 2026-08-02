package defpackage;

import com.yandex.go.taxi_order.ws.WebSocketClient$CloseReason;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class be51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebSocketClient$CloseReason.values().length];
        try {
            iArr[WebSocketClient$CloseReason.CLIENT_DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebSocketClient$CloseReason.CONNECTION_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebSocketClient$CloseReason.SERVER_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WebSocketClient$CloseReason.UNAUTHORIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WebSocketClient$CloseReason.BAD_REQUEST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}

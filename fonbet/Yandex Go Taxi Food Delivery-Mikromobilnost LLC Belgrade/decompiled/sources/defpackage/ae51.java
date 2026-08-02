package defpackage;

import com.yandex.go.xiva.data.XivaWebSocketCloseReason;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class ae51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[XivaWebSocketCloseReason.values().length];
        try {
            iArr[XivaWebSocketCloseReason.ClientDisconnected.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[XivaWebSocketCloseReason.ConnectionError.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[XivaWebSocketCloseReason.ServerError.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

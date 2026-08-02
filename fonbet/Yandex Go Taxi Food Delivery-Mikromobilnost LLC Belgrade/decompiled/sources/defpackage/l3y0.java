package defpackage;

import com.yandex.go.messenger_native.api.NativeMessengerConnectionStatus;
import com.yandex.go.taxi.order.chat.domain.model.MessengerType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class l3y0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[NativeMessengerConnectionStatus.values().length];
        try {
            iArr[NativeMessengerConnectionStatus.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeMessengerConnectionStatus.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeMessengerConnectionStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[MessengerType.values().length];
        try {
            iArr2[MessengerType.NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MessengerType.WEB.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}

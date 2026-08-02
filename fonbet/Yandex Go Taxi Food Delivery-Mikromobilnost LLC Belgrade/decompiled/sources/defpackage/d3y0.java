package defpackage;

import com.yandex.go.taxi.order.chat.api.data.model.Sender;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class d3y0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Sender.Role.values().length];
        try {
            iArr[Sender.Role.CLIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Sender.Role.DRIVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Sender.Role.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Sender.Role.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}

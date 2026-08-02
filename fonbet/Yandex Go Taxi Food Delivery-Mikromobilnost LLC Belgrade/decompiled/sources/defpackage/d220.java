package defpackage;

import ru.yandex.taxi.messenger.domain.MessengerChatOwner;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class d220 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessengerChatOwner.values().length];
        try {
            iArr[MessengerChatOwner.MARKETPLACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessengerChatOwner.TAXI_ORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

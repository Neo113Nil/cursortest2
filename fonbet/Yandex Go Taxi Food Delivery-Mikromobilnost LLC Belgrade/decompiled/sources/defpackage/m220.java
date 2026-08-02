package defpackage;

import ru.yandex.taxi.messenger.domain.MessengerChatOwner;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class m220 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessengerChatOwner.values().length];
        try {
            iArr[MessengerChatOwner.DELIVERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessengerChatOwner.TAXI_ORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessengerChatOwner.MARKETPLACE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

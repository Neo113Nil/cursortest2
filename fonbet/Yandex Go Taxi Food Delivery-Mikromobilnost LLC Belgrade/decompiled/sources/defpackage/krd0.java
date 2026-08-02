package defpackage;

import ru.yandex.taxi.cashback.sdk.OpenPlusSubscriptionAction;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class krd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OpenPlusSubscriptionAction.values().length];
        try {
            iArr[OpenPlusSubscriptionAction.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OpenPlusSubscriptionAction.BUY_SUBSCRIPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OpenPlusSubscriptionAction.UPGRADE_SUBSCRIPTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

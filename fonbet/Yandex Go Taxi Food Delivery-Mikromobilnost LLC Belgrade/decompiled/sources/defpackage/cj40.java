package defpackage;

import ru.yandex.taxi.masstransit.paymentcards.MtTransportCardSubscriber$TransportCardEventType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class cj40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtTransportCardSubscriber$TransportCardEventType.values().length];
        try {
            iArr[MtTransportCardSubscriber$TransportCardEventType.CARD_ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtTransportCardSubscriber$TransportCardEventType.CARD_REPLENISHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MtTransportCardSubscriber$TransportCardEventType.CARD_REMOVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

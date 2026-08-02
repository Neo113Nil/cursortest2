package defpackage;

import ru.yandex.taxi.masstransit.paymentcards.TransportCardAction;
import ru.yandex.taxi.masstransit.router.MtHubLeadingItemKind;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class bh30 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MtHubLeadingItemKind.values().length];
        try {
            iArr[MtHubLeadingItemKind.TRANSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtHubLeadingItemKind.PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TransportCardAction.values().length];
        try {
            iArr2[TransportCardAction.ADD_TRANSPORT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TransportCardAction.OPEN_TRANSPORT_CARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}

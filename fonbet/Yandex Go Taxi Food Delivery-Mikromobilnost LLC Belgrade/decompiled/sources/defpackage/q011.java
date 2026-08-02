package defpackage;

import ru.yandex.taxi.masstransit.paymentcards.TransportCardStatus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class q011 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransportCardStatus.values().length];
        try {
            iArr[TransportCardStatus.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportCardStatus.Blocked.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransportCardStatus.Advertisement.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

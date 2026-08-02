package defpackage;

import com.yandex.go.chargers.offer.ChargersOfferOpenReason;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class h7a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersOfferOpenReason.values().length];
        try {
            iArr[ChargersOfferOpenReason.Deeplink.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersOfferOpenReason.Qr.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

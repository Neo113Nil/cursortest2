package defpackage;

import com.yandex.go.chargers.offer.ChargersOfferStationOpenReason;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class fpa {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersOfferStationOpenReason.values().length];
        try {
            iArr[ChargersOfferStationOpenReason.Map.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersOfferStationOpenReason.DiscountsAndPromocodes.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

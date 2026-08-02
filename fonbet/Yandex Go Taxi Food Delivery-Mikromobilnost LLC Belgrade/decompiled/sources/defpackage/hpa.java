package defpackage;

import com.yandex.go.chargers.order.ChargersOrderStationOpenReason;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class hpa {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersOrderStationOpenReason.values().length];
        try {
            iArr[ChargersOrderStationOpenReason.Map.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersOrderStationOpenReason.DiscountsAndPromocodes.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

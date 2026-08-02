package defpackage;

import com.yandex.go.chargers.station.api.ChargersStationOpenReason;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ira {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersStationOpenReason.values().length];
        try {
            iArr[ChargersStationOpenReason.Map.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersStationOpenReason.BackFromCamera.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersStationOpenReason.Deeplink.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChargersStationOpenReason.BlePush.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChargersStationOpenReason.DiscountsAndPromocodes.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}

package defpackage;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class lws {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GasStationSearchType.values().length];
        try {
            iArr[GasStationSearchType.ON_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GasStationSearchType.ON_AREA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

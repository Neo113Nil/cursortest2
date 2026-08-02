package defpackage;

import com.yandex.go.navigator.gas_stations.repositories.GasStationsSearchResult;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class hvs {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GasStationsSearchResult.values().length];
        try {
            iArr[GasStationsSearchResult.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GasStationsSearchResult.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GasStationsSearchResult.FAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

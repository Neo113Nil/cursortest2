package defpackage;

import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class pa11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtVehiclesResponse.BLEItem.TransportType.values().length];
        try {
            iArr[MtVehiclesResponse.BLEItem.TransportType.Bus.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtVehiclesResponse.BLEItem.TransportType.Trolley.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MtVehiclesResponse.BLEItem.TransportType.Tram.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MtVehiclesResponse.BLEItem.TransportType.Water.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MtVehiclesResponse.BLEItem.TransportType.Electrobus.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}

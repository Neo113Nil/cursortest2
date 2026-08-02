package defpackage;

import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class jj40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtTransportType.values().length];
        try {
            iArr[MtTransportType.BUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtTransportType.METROBUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MtTransportType.MINIBUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MtTransportType.DOLMUS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MtTransportType.TRAMWAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MtTransportType.HISTORIC_TRAM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[MtTransportType.RAPID_TRAM.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[MtTransportType.DUBAI_TRAM.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[MtTransportType.UNDERGROUND.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[MtTransportType.RAILWAY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[MtTransportType.SUBURBAN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[MtTransportType.SBAHN.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[MtTransportType.MCD.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[MtTransportType.SUBURBAN_EXPRESS.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[MtTransportType.AEROEXPRESS.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[MtTransportType.AEROEXPRESS_BUS.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[MtTransportType.WATER.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[MtTransportType.FERRY.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[MtTransportType.FUNICULAR.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[MtTransportType.CABLE.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[MtTransportType.AERO.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[MtTransportType.TROLLEYBUS.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[MtTransportType.UNKNOWN.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        a = iArr;
    }
}

package defpackage;

import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class bf30 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[MtDetailedRouteAnalyticSource.values().length];
        try {
            iArr[MtDetailedRouteAnalyticSource.Hub.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtDetailedRouteAnalyticSource.Transport.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[MtDetailedRouteAnalyticType.values().length];
        try {
            iArr2[MtDetailedRouteAnalyticType.Vertical.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MtDetailedRouteAnalyticType.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[MtTransportType.values().length];
        try {
            iArr3[MtTransportType.AEROEXPRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[MtTransportType.AEROEXPRESS_BUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[MtTransportType.MCD.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[MtTransportType.SUBURBAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[MtTransportType.SUBURBAN_EXPRESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[MtTransportType.UNDERGROUND.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[MtTransportType.BUS.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[MtTransportType.MINIBUS.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[MtTransportType.TROLLEYBUS.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[MtTransportType.TRAMWAY.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[MtTransportType.RAPID_TRAM.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[MtTransportType.DUBAI_TRAM.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[MtTransportType.HISTORIC_TRAM.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[MtTransportType.METROBUS.ordinal()] = 14;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[MtTransportType.DOLMUS.ordinal()] = 15;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[MtTransportType.FUNICULAR.ordinal()] = 16;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[MtTransportType.CABLE.ordinal()] = 17;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[MtTransportType.AERO.ordinal()] = 18;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[MtTransportType.FERRY.ordinal()] = 19;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[MtTransportType.WATER.ordinal()] = 20;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[MtTransportType.RAILWAY.ordinal()] = 21;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[MtTransportType.SBAHN.ordinal()] = 22;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[MtTransportType.UNKNOWN.ordinal()] = 23;
        } catch (NoSuchFieldError unused27) {
        }
        c = iArr3;
    }
}

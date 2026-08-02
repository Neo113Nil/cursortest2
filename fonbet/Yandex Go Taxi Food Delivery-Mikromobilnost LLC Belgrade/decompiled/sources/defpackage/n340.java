package defpackage;

import ru.yandex.taxi.masstransit.model.RouteType;
import ru.yandex.taxi.masstransit.ui.stopsline.LineState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class n340 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LineState.values().length];
        try {
            iArr[LineState.SECONDARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LineState.SECONDARY_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LineState.NONE_TO_SECONDARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LineState.MAIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LineState.MAIN_POINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LineState.MAIN_TO_NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[LineState.NONE_TO_MAIN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[LineState.SECONDARY_TO_MAIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[LineState.SECONDARY_TO_NONE_POINT_MAIN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[LineState.MAIN_TO_SECONDARY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
        int[] iArr2 = new int[RouteType.values().length];
        try {
            iArr2[RouteType.ROUTE_TYPE_BUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_MINIBUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_TRAMWAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_UNDERGROUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_RAILWAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_WATER.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_TROLLEYBUS.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_FUNICULAR.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_CABLE.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_AERO.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[RouteType.ROUTE_TYPE_SHUTTLE.ordinal()] = 11;
        } catch (NoSuchFieldError unused21) {
        }
        b = iArr2;
    }
}

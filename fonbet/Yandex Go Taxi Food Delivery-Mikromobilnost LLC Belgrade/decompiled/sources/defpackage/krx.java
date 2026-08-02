package defpackage;

import com.yandex.mapkit.directions.driving.LaneDirection;
import com.yandex.mapkit.directions.driving.LaneKind;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class krx {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LaneKind.values().length];
        try {
            iArr[LaneKind.PLAIN_LANE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LaneKind.BUS_LANE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LaneKind.TRAM_LANE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LaneKind.TAXI_LANE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LaneKind.BIKE_LANE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LaneKind.UNKNOWN_KIND.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[LaneDirection.values().length];
        try {
            iArr2[LaneDirection.LEFT180.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[LaneDirection.LEFT135.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[LaneDirection.LEFT90.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[LaneDirection.LEFT45.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[LaneDirection.STRAIGHT_AHEAD.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[LaneDirection.RIGHT45.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[LaneDirection.RIGHT90.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[LaneDirection.RIGHT135.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[LaneDirection.RIGHT180.ordinal()] = 9;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[LaneDirection.LEFT_FROM_RIGHT.ordinal()] = 10;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[LaneDirection.RIGHT_FROM_LEFT.ordinal()] = 11;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[LaneDirection.LEFT_SHIFT.ordinal()] = 12;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[LaneDirection.RIGHT_SHIFT.ordinal()] = 13;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[LaneDirection.UNKNOWN_DIRECTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused20) {
        }
        b = iArr2;
    }
}

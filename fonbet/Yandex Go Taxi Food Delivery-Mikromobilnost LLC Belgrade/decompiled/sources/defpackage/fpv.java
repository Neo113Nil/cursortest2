package defpackage;

import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.go.navigator.incidents.report.IncidentReportType;
import com.yandex.mapkit.road_events.EventTag;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class fpv {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[IncidentReportType.values().length];
        try {
            iArr[IncidentReportType.Camera.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IncidentReportType.Police.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IncidentReportType.RoadWorks.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IncidentReportType.Accident.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[EventTag.values().length];
        try {
            iArr2[EventTag.NO_STOPPING_CONTROL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EventTag.ROAD_MARKING_CONTROL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EventTag.CROSS_ROAD_CONTROL.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EventTag.LANE_CONTROL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EventTag.SPEED_CONTROL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[EventTag.POLICE.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[EventTag.MOBILE_CONTROL.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[EventTag.RECONSTRUCTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[EventTag.ACCIDENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
        int[] iArr3 = new int[IncidentType.values().length];
        try {
            iArr3[IncidentType.Camera.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[IncidentType.Police.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[IncidentType.RoadWorks.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[IncidentType.Accident.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        c = iArr3;
    }
}

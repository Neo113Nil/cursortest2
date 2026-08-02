package defpackage;

import com.yandex.go.navigator.incidents.report.IncidentReportType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EventTag;

/* loaded from: classes12.dex */
public final class apv {
    public final dpv a;
    public final gpv b;
    public uov c;

    public apv(dpv dpvVar, gpv gpvVar) {
        this.a = dpvVar;
        this.b = gpvVar;
    }

    public final void a(IncidentReportType incidentReportType, Point point) {
        EventTag eventTag;
        this.c = new uov(incidentReportType, point);
        this.b.getClass();
        int i = fpv.a[incidentReportType.ordinal()];
        if (i == 1) {
            eventTag = EventTag.SPEED_CONTROL;
        } else if (i == 2) {
            eventTag = EventTag.MOBILE_CONTROL;
        } else if (i == 3) {
            eventTag = EventTag.RECONSTRUCTION;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            eventTag = EventTag.ACCIDENT;
        }
        dpv dpvVar = this.a;
        dpvVar.a.b(new ynn(11, dpvVar, eventTag, point), true);
    }
}

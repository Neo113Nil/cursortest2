package defpackage;

import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.mapkit.road_events.EventTag;

/* loaded from: classes12.dex */
public final class gpv {
    public final x1l0 a;

    public gpv(x1l0 x1l0Var) {
        this.a = x1l0Var;
    }

    public static IncidentType a(EventTag eventTag) {
        switch (fpv.b[eventTag.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return IncidentType.Camera;
            case 6:
            case 7:
                return IncidentType.Police;
            case 8:
                return IncidentType.RoadWorks;
            case 9:
                return IncidentType.Accident;
            default:
                return null;
        }
    }
}

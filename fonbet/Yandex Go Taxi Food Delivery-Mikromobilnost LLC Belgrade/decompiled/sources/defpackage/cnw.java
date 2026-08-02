package defpackage;

import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction;

/* loaded from: classes12.dex */
public abstract class cnw {
    public static q6e a(IntercityOpenShuttleClarifyPointAction intercityOpenShuttleClarifyPointAction) {
        kdx kdxVar = new kdx();
        abb1.d(kdxVar, "shuttle_trip_id", intercityOpenShuttleClarifyPointAction.c);
        abb1.d(kdxVar, "selected_point_id", intercityOpenShuttleClarifyPointAction.d);
        kdx kdxVar2 = new kdx();
        IntercityOpenShuttleClarifyPointAction.ClarifyPointOriginalPoint clarifyPointOriginalPoint = intercityOpenShuttleClarifyPointAction.e;
        Double[] dArr = clarifyPointOriginalPoint.a;
        xbx xbxVar = new xbx();
        xbxVar.a(qcx.b(dArr[0]));
        xbxVar.a(qcx.b(dArr[1]));
        kdxVar2.b("coordinates", xbxVar.b());
        abb1.d(kdxVar2, "address", clarifyPointOriginalPoint.b);
        kdxVar.b("shuttle_source_point", kdxVar2.a());
        return new q6e("intercity", kdxVar.a());
    }
}

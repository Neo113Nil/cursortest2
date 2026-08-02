package defpackage;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.uri.UriObjectMetadata;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class pt40 implements Route {
    public final /* synthetic */ Route a;

    public pt40(Route route) {
        this.a = route;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public final double distanceBetweenPolylinePositions(PolylinePosition polylinePosition, PolylinePosition polylinePosition2) {
        return this.a.distanceBetweenPolylinePositions(polylinePosition, polylinePosition2);
    }

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public final Polyline getGeometry() {
        return this.a.getGeometry();
    }

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public final RouteMetadata getMetadata() {
        return this.a.getMetadata();
    }

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public final List getSections() {
        List<Section> sections = this.a.getSections();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Object obj : sections) {
            boolean z2 = ((Section) obj).getMetadata().getData().getTaxi() != null ? true : z;
            if (z) {
                arrayList.add(obj);
            }
            z = z2;
        }
        return arrayList;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public final UriObjectMetadata getUriMetadata() {
        return this.a.getUriMetadata();
    }

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public final List getWayPoints() {
        return this.a.getWayPoints();
    }

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public final GraphLevel graphLevelAt(PolylinePosition polylinePosition) {
        return this.a.graphLevelAt(polylinePosition);
    }

    @Override // com.yandex.mapkit.transport.masstransit.Route
    public final double timeBetweenPolylinePositions(PolylinePosition polylinePosition, PolylinePosition polylinePosition2) {
        return this.a.timeBetweenPolylinePositions(polylinePosition, polylinePosition2);
    }
}

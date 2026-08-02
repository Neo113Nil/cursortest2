package defpackage;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.SectionMetadata;
import com.yandex.mapkit.uri.UriObjectMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class lt40 implements Route {
    public final /* synthetic */ Route a;
    public final /* synthetic */ mt40 b;

    public lt40(Route route, mt40 mt40Var) {
        this.a = route;
        this.b = mt40Var;
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
        SectionMetadata metadata;
        SectionMetadata.SectionData data;
        mt40 mt40Var = this.b;
        ArrayList arrayList = mt40Var.a;
        if (arrayList == null) {
            Route route = this.a;
            Section section = (Section) a.R(route.getSections());
            if (((section == null || (metadata = section.getMetadata()) == null || (data = metadata.getData()) == null) ? null : data.getFitness()) == null) {
                return route.getSections();
            }
            List<Section> sections = route.getSections();
            arrayList = new ArrayList();
            boolean z = false;
            for (Object obj : sections) {
                boolean z2 = ((Section) obj).getMetadata().getData().getFitness() != null ? true : z;
                if (z) {
                    arrayList.add(obj);
                }
                z = z2;
            }
            mt40Var.a = arrayList;
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

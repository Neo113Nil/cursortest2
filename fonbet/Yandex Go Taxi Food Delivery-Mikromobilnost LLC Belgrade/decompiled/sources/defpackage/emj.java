package defpackage;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.Time;
import com.yandex.mapkit.directions.driving.ArrowManeuverStyle;
import com.yandex.mapkit.directions.driving.Description;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingRouteMetadata;
import com.yandex.mapkit.directions.driving.Event;
import com.yandex.mapkit.directions.driving.ManeuverStyle;
import com.yandex.mapkit.directions.driving.RouteHelper;
import com.yandex.mapkit.directions.driving.RoutePoint;
import com.yandex.mapkit.directions.driving.TollRoad;
import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.indoor.IndoorPlan;
import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.mapkit.navigation.JamStyle;
import com.yandex.mapkit.navigation.JamType;
import com.yandex.mapkit.navigation.JamTypeColor;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.RouteView;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events.RoadEventMetadata;
import com.yandex.mapkit.search.Address;
import com.yandex.mapkit.search.Availability;
import com.yandex.mapkit.search.BillboardAction;
import com.yandex.mapkit.search.BillboardObjectMetadata;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import com.yandex.mapkit.search.Creative;
import com.yandex.mapkit.search.Disclaimer;
import com.yandex.mapkit.search.Entrance;
import com.yandex.mapkit.search.Feature;
import com.yandex.mapkit.search.Properties;
import com.yandex.mapkit.search.RoutePointMetadata;
import com.yandex.mapkit.search.State;
import com.yandex.mapkit.search.TimeRange;
import com.yandex.mapkit.search.WorkingHours;
import com.yandex.mapkit.transport.masstransit.Annotation;
import com.yandex.mapkit.transport.masstransit.BoardingOptions;
import com.yandex.mapkit.transport.masstransit.ConstructionSegment;
import com.yandex.mapkit.transport.masstransit.EssentialStop;
import com.yandex.mapkit.transport.masstransit.Fitness;
import com.yandex.mapkit.transport.masstransit.Flags;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.RestrictedEntry;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.RouteSettings;
import com.yandex.mapkit.transport.masstransit.RouteStop;
import com.yandex.mapkit.transport.masstransit.RouteStopMetadata;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.SectionMetadata;
import com.yandex.mapkit.transport.masstransit.Stop;
import com.yandex.mapkit.transport.masstransit.Thread;
import com.yandex.mapkit.transport.masstransit.Toponym;
import com.yandex.mapkit.transport.masstransit.TrafficTypeSegment;
import com.yandex.mapkit.transport.masstransit.Transfer;
import com.yandex.mapkit.transport.masstransit.Transport;
import com.yandex.mapkit.transport.masstransit.TransportThreadAlert;
import com.yandex.mapkit.transport.masstransit.TravelEstimation;
import com.yandex.mapkit.transport.masstransit.Wait;
import com.yandex.mapkit.transport.masstransit.WayPoint;
import com.yandex.mapkit.uri.Uri;
import com.yandex.mapkit.uri.UriObjectMetadata;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.runtime.auth.TokenListener;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;
import ru.yandextaxi.flutter_yandex_mapkit.methods.Metadata;

/* loaded from: classes15.dex */
public final class emj extends k45 {
    public final /* synthetic */ int b;
    public final ini0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emj(ssr ssrVar, ini0 ini0Var, int i) {
        super(ssrVar, "directions_balloon_view");
        this.b = i;
        switch (i) {
            case 1:
                super(ssrVar, "directions_driving_route");
                this.c = ini0Var;
                break;
            case 2:
                super(ssrVar, "directions_route_helper");
                this.c = ini0Var;
                break;
            case 3:
                super(ssrVar, "directions_route_view");
                this.c = ini0Var;
                break;
            case 4:
                super(ssrVar, "geo_object");
                this.c = ini0Var;
                break;
            case 5:
                super(ssrVar, "indoor_plan_controller");
                this.c = ini0Var;
                break;
            case 6:
                super(ssrVar, "polygons_map_objects");
                this.c = ini0Var;
                break;
            case 7:
                super(ssrVar, "polylines_map_objects");
                this.c = ini0Var;
                break;
            case 8:
                super(ssrVar, "token_listener");
                this.c = ini0Var;
                break;
            case 9:
                super(ssrVar, "transport_balloon_view");
                this.c = ini0Var;
                break;
            case 10:
                super(ssrVar, "transport_route");
                this.c = ini0Var;
                break;
            case 11:
                super(ssrVar, "transport_route_view");
                this.c = ini0Var;
                break;
            default:
                this.c = ini0Var;
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    private final void c(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            ini0 ini0Var = this.c;
            switch (hashCode) {
                case -392015183:
                    if (str.equals("setStrokeColorPolygon")) {
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            ((PolygonMapObject) ini0Var.c((String) entry.getKey(), ReferenceType.MAP_OBJECT)).setStrokeColor(dob1.b((String) entry.getValue()));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -345748570:
                    if (str.equals("setGeometryPolygon")) {
                        for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                            ((PolygonMapObject) ini0Var.c((String) entry2.getKey(), ReferenceType.MAP_OBJECT)).setGeometry(lyi.i((Map) entry2.getValue()));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 962981614:
                    if (str.equals("setStrokeWidthPolygon")) {
                        for (Map.Entry entry3 : ((Map) obj).entrySet()) {
                            ((PolygonMapObject) ini0Var.c((String) entry3.getKey(), ReferenceType.MAP_OBJECT)).setStrokeWidth((float) ((Number) entry3.getValue()).doubleValue());
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1759924732:
                    if (str.equals("setFillColorPolygon")) {
                        for (Map.Entry entry4 : ((Map) obj).entrySet()) {
                            ((PolygonMapObject) ini0Var.c((String) entry4.getKey(), ReferenceType.MAP_OBJECT)).setFillColor(dob1.b((String) entry4.getValue()));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void d(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            ini0 ini0Var = this.c;
            switch (hashCode) {
                case -2128127788:
                    if (str.equals("setGeometryPolyline")) {
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            String str2 = (String) entry.getKey();
                            Map map = (Map) entry.getValue();
                            PolylineMapObject polylineMapObject = (PolylineMapObject) ini0Var.c(str2, ReferenceType.MAP_OBJECT);
                            List<Map> list = (List) map.get(CRLDistributionPointsExtension.POINTS);
                            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                            for (Map map2 : list) {
                                Object obj2 = map2.get("lat");
                                Double d = obj2 instanceof Double ? (Double) obj2 : null;
                                Object obj3 = map2.get("lon");
                                Double d2 = obj3 instanceof Double ? (Double) obj3 : null;
                                if (d == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                } else {
                                    if (d2 == null) {
                                        ny61.g("Required value was null.");
                                        return;
                                    }
                                    arrayList.add(new Point(d.doubleValue(), d2.doubleValue()));
                                }
                            }
                            polylineMapObject.setGeometry(new Polyline(arrayList));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1267781832:
                    if (str.equals("setGradientLength")) {
                        for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                            ((PolylineMapObject) ini0Var.c((String) entry2.getKey(), ReferenceType.MAP_OBJECT)).setGradientLength((float) ((Number) entry2.getValue()).doubleValue());
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -212197748:
                    if (str.equals("setStrokeWidthPolyline")) {
                        for (Map.Entry entry3 : ((Map) obj).entrySet()) {
                            ((PolylineMapObject) ini0Var.c((String) entry3.getKey(), ReferenceType.MAP_OBJECT)).setStrokeWidth((float) ((Number) entry3.getValue()).doubleValue());
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 197717786:
                    if (str.equals("setGapLength")) {
                        for (Map.Entry entry4 : ((Map) obj).entrySet()) {
                            ((PolylineMapObject) ini0Var.c((String) entry4.getKey(), ReferenceType.MAP_OBJECT)).setGapLength((float) ((Number) entry4.getValue()).doubleValue());
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 205034707:
                    if (str.equals("setInnerOutlineEnabled")) {
                        for (Map.Entry entry5 : ((Map) obj).entrySet()) {
                            ((PolylineMapObject) ini0Var.c((String) entry5.getKey(), ReferenceType.MAP_OBJECT)).setInnerOutlineEnabled(((Boolean) entry5.getValue()).booleanValue());
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 732574505:
                    if (str.equals("setStrokeColorPolyline")) {
                        for (Map.Entry entry6 : ((Map) obj).entrySet()) {
                            ((PolylineMapObject) ini0Var.c((String) entry6.getKey(), ReferenceType.MAP_OBJECT)).setStrokeColor(dob1.b((String) entry6.getValue()));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1047829955:
                    if (str.equals("setOutlineColor")) {
                        for (Map.Entry entry7 : ((Map) obj).entrySet()) {
                            ((PolylineMapObject) ini0Var.c((String) entry7.getKey(), ReferenceType.MAP_OBJECT)).setOutlineColor(dob1.b((String) entry7.getValue()));
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1066114086:
                    if (str.equals("setOutlineWidth")) {
                        for (Map.Entry entry8 : ((Map) obj).entrySet()) {
                            ((PolylineMapObject) ini0Var.c((String) entry8.getKey(), ReferenceType.MAP_OBJECT)).setOutlineWidth((float) ((Number) entry8.getValue()).doubleValue());
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1713743642:
                    if (str.equals("setDashLength")) {
                        for (Map.Entry entry9 : ((Map) obj).entrySet()) {
                            ((PolylineMapObject) ini0Var.c((String) entry9.getKey(), ReferenceType.MAP_OBJECT)).setDashLength((float) ((Number) entry9.getValue()).doubleValue());
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }

    private final void e(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            ini0 ini0Var = this.c;
            if (hashCode == -113035288) {
                if (str.equals("isVisible")) {
                    ((ba20) da20Var).success(Boolean.valueOf(((BalloonView) ini0Var.c((String) obj, ReferenceType.TRANSPORT_BALLOON_VIEW)).isIsVisible()));
                    return;
                }
                return;
            }
            if (hashCode == 1671767583) {
                if (str.equals("dispose")) {
                    ini0Var.e((String) obj, ReferenceType.TRANSPORT_BALLOON_VIEW);
                    ((ba20) da20Var).success(null);
                    return;
                }
                return;
            }
            if (hashCode == 2073378034 && str.equals("isValid")) {
                ((ba20) da20Var).success(Boolean.valueOf(((BalloonView) ini0Var.c((String) obj, ReferenceType.TRANSPORT_BALLOON_VIEW)).isValid()));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void f(x920 x920Var, da20 da20Var) {
        ArrayList arrayList;
        Section section;
        SectionMetadata sectionMetadata;
        String str;
        String str2;
        String str3;
        String str4;
        SectionMetadata.SectionData sectionData;
        Map map;
        Map map2;
        Pair pair;
        ArrayList arrayList2;
        String str5;
        String str6;
        Map map3;
        Pair pair2;
        Map map4;
        Map map5;
        String str7;
        Map map6;
        Pair pair3;
        ArrayList arrayList3;
        Pair pair4;
        Pair pair5;
        Map map7;
        Map map8;
        Long l;
        ArrayList arrayList4;
        String str8;
        SectionMetadata.SectionData sectionData2;
        Map map9;
        Object obj = x920Var.b;
        String str9 = x920Var.a;
        if (str9 != null) {
            String str10 = "segmentPosition";
            String str11 = "segmentIndex";
            String str12 = "lon";
            String str13 = "lat";
            String str14 = "estimation";
            String str15 = "weight";
            switch (str9.hashCode()) {
                case -1269130332:
                    if (str9.equals("getSections")) {
                        List<Section> sections = b(x920Var).getSections();
                        ArrayList arrayList5 = new ArrayList(tcc.n(sections, 10));
                        Iterator it = sections.iterator();
                        while (it.hasNext()) {
                            Section section2 = (Section) it.next();
                            SectionMetadata metadata = section2.getMetadata();
                            Pair pair6 = new Pair(str15, ssq0.g(metadata.getWeight()));
                            SectionMetadata.SectionData data = metadata.getData();
                            Wait wait = data.getWait();
                            String str16 = "dummy";
                            Pair pair7 = new Pair("wait", wait != null ? gw00.e(new Pair("dummy", Integer.valueOf(wait.getDummy()))) : null);
                            Fitness fitness = data.getFitness();
                            String str17 = "position";
                            Iterator it2 = it;
                            if (fitness != null) {
                                section = section2;
                                sectionMetadata = metadata;
                                str3 = str15;
                                Pair pair8 = new Pair("type", fitness.getType().name().toLowerCase(Locale.ROOT));
                                List<ConstructionSegment> constructions = fitness.getConstructions();
                                ArrayList arrayList6 = new ArrayList(tcc.n(constructions, 10));
                                Iterator<T> it3 = constructions.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(ssq0.c((ConstructionSegment) it3.next()));
                                }
                                Pair pair9 = new Pair("constructions", arrayList6);
                                List<RestrictedEntry> restrictedEntries = fitness.getRestrictedEntries();
                                ArrayList arrayList7 = new ArrayList(tcc.n(restrictedEntries, 10));
                                Iterator<T> it4 = restrictedEntries.iterator();
                                while (it4.hasNext()) {
                                    arrayList7.add(gw00.e(new Pair("position", Integer.valueOf(((RestrictedEntry) it4.next()).getPosition()))));
                                }
                                Pair pair10 = new Pair("restrictedEntries", arrayList7);
                                List<PolylinePosition> viaPoints = fitness.getViaPoints();
                                ArrayList arrayList8 = new ArrayList(tcc.n(viaPoints, 10));
                                for (Iterator it5 = viaPoints.iterator(); it5.hasNext(); it5 = it5) {
                                    PolylinePosition polylinePosition = (PolylinePosition) it5.next();
                                    arrayList8.add(b.i(new Pair(str11, Integer.valueOf(polylinePosition.getSegmentIndex())), new Pair(str10, Double.valueOf(polylinePosition.getSegmentPosition()))));
                                }
                                Pair pair11 = new Pair("viaPoints", arrayList8);
                                List<Annotation> annotations = fitness.getAnnotations();
                                ArrayList arrayList9 = new ArrayList(tcc.n(annotations, 10));
                                Iterator it6 = annotations.iterator();
                                while (it6.hasNext()) {
                                    Annotation annotation = (Annotation) it6.next();
                                    PolylinePosition position = annotation.getPosition();
                                    Iterator it7 = it6;
                                    Pair pair12 = new Pair(str17, b.i(new Pair(str11, Integer.valueOf(position.getSegmentIndex())), new Pair(str10, Double.valueOf(position.getSegmentPosition()))));
                                    String str18 = str10;
                                    Pair pair13 = new Pair("action", annotation.getAction() != null ? annotation.getAction().name().toLowerCase(Locale.ROOT) : null);
                                    String str19 = str11;
                                    Pair pair14 = new Pair("landmark", annotation.getLandmark() != null ? annotation.getLandmark().name().toLowerCase(Locale.ROOT) : null);
                                    Toponym toponym = annotation.getToponym();
                                    if (toponym != null) {
                                        sectionData2 = data;
                                        arrayList4 = arrayList5;
                                        str8 = str17;
                                        map9 = b.i(new Pair("toponym", toponym.getToponym()), new Pair("accusativeToponym", toponym.getAccusativeToponym()));
                                    } else {
                                        arrayList4 = arrayList5;
                                        str8 = str17;
                                        sectionData2 = data;
                                        map9 = null;
                                    }
                                    arrayList9.add(b.i(pair12, pair13, pair14, new Pair("toponym", map9)));
                                    it6 = it7;
                                    str10 = str18;
                                    str11 = str19;
                                    data = sectionData2;
                                    arrayList5 = arrayList4;
                                    str17 = str8;
                                }
                                arrayList = arrayList5;
                                str = str10;
                                str2 = str11;
                                str4 = str17;
                                sectionData = data;
                                Pair pair15 = new Pair("annotations", arrayList9);
                                List<TrafficTypeSegment> trafficTypes = fitness.getTrafficTypes();
                                ArrayList arrayList10 = new ArrayList(tcc.n(trafficTypes, 10));
                                for (TrafficTypeSegment trafficTypeSegment : trafficTypes) {
                                    arrayList10.add(b.i(new Pair("trafficType", rsq0.c(trafficTypeSegment.getTrafficType())), new Pair("subpolyline", rsq0.n(trafficTypeSegment.getSubpolyline()))));
                                }
                                map = b.i(pair8, pair9, pair10, pair11, pair15, new Pair("trafficTypes", arrayList10));
                            } else {
                                arrayList = arrayList5;
                                section = section2;
                                sectionMetadata = metadata;
                                str = str10;
                                str2 = str11;
                                str3 = str15;
                                str4 = "position";
                                sectionData = data;
                                map = null;
                            }
                            Pair pair16 = new Pair("fitness", map);
                            Transfer transfer = sectionData.getTransfer();
                            if (transfer != null) {
                                List<ConstructionSegment> constructions2 = transfer.getConstructions();
                                ArrayList arrayList11 = new ArrayList(tcc.n(constructions2, 10));
                                Iterator<T> it8 = constructions2.iterator();
                                while (it8.hasNext()) {
                                    arrayList11.add(ssq0.c((ConstructionSegment) it8.next()));
                                }
                                map2 = gw00.e(new Pair("constructions", arrayList11));
                            } else {
                                map2 = null;
                            }
                            Pair pair17 = new Pair("transfer", map2);
                            List<Transport> transports = sectionData.getTransports();
                            String str20 = "stop";
                            if (transports != null) {
                                List<Transport> list = transports;
                                arrayList2 = new ArrayList(tcc.n(list, 10));
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    Transport transport = (Transport) it9.next();
                                    Line line = transport.getLine();
                                    Iterator it10 = it9;
                                    Pair pair18 = new Pair("id", line.getId());
                                    Pair pair19 = new Pair("name", line.getName());
                                    Pair pair20 = new Pair("vehicleTypes", line.getVehicleTypes());
                                    Line.Style style = line.getStyle();
                                    if (style != null) {
                                        pair2 = pair20;
                                        map4 = gw00.e(new Pair("color", style.getColor()));
                                    } else {
                                        pair2 = pair20;
                                        map4 = null;
                                    }
                                    Pair pair21 = new Pair("line", b.i(pair18, pair19, pair2, new Pair("style", map4), new Pair("isNight", Boolean.valueOf(line.getIsNight())), new Pair(LaunchBrowserActivity.KEY_URI, line.getUri()), new Pair("shortName", line.getShortName()), new Pair("transportSystemId", line.getTransportSystemId())));
                                    List<Transport.TransportThread> transports2 = transport.getTransports();
                                    String str21 = str12;
                                    ArrayList arrayList12 = new ArrayList(tcc.n(transports2, 10));
                                    Iterator it11 = transports2.iterator();
                                    while (it11.hasNext()) {
                                        Transport.TransportThread transportThread = (Transport.TransportThread) it11.next();
                                        Thread thread = transportThread.getThread();
                                        Iterator it12 = it11;
                                        Pair pair22 = new Pair("id", thread.getId());
                                        List<EssentialStop> essentialStops = thread.getEssentialStops();
                                        String str22 = str13;
                                        Pair pair23 = pair6;
                                        ArrayList arrayList13 = new ArrayList(tcc.n(essentialStops, 10));
                                        Iterator<T> it13 = essentialStops.iterator();
                                        while (it13.hasNext()) {
                                            arrayList13.add(gw00.e(new Pair(str20, ssq0.d(((EssentialStop) it13.next()).getStop()))));
                                        }
                                        Pair pair24 = new Pair("thread", b.i(pair22, new Pair("essentialStops", arrayList13), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, thread.getDescription())));
                                        Pair pair25 = new Pair("isRecommended", Boolean.valueOf(transportThread.getIsRecommended()));
                                        List<TransportThreadAlert> alerts = transportThread.getAlerts();
                                        String str23 = str20;
                                        ArrayList arrayList14 = new ArrayList(tcc.n(alerts, 10));
                                        Iterator it14 = alerts.iterator();
                                        while (it14.hasNext()) {
                                            TransportThreadAlert transportThreadAlert = (TransportThreadAlert) it14.next();
                                            Iterator it15 = it14;
                                            Pair pair26 = new Pair("text", transportThreadAlert.getText());
                                            TransportThreadAlert.Closed closed = transportThreadAlert.getClosed();
                                            if (closed != null) {
                                                str7 = str14;
                                                map6 = gw00.e(new Pair(str16, Boolean.valueOf(closed.getDummy())));
                                            } else {
                                                str7 = str14;
                                                map6 = null;
                                            }
                                            String str24 = str16;
                                            Pair pair27 = new Pair("closed", map6);
                                            TransportThreadAlert.ClosedUntil closedUntil = transportThreadAlert.getClosedUntil();
                                            Pair pair28 = pair17;
                                            if (closedUntil != null) {
                                                Time time = closedUntil.getTime();
                                                if (time != null) {
                                                    pair3 = pair16;
                                                    l = Long.valueOf(time.getValue());
                                                } else {
                                                    pair3 = pair16;
                                                    l = null;
                                                }
                                                pair5 = pair7;
                                                Pair pair29 = new Pair("value", l);
                                                arrayList3 = arrayList2;
                                                Pair pair30 = new Pair("tz_offset", time != null ? Integer.valueOf(time.getTzOffset()) : null);
                                                String text = time != null ? time.getText() : null;
                                                pair4 = pair21;
                                                map7 = gw00.e(new Pair(RemoteBioParameters.TIME, b.i(pair29, pair30, new Pair("text", text))));
                                            } else {
                                                pair3 = pair16;
                                                arrayList3 = arrayList2;
                                                pair4 = pair21;
                                                pair5 = pair7;
                                                map7 = null;
                                            }
                                            Pair pair31 = new Pair("closedUntil", map7);
                                            TransportThreadAlert.LastTrip lastTrip = transportThreadAlert.getLastTrip();
                                            if (lastTrip != null) {
                                                Time time2 = lastTrip.getTime();
                                                map8 = gw00.e(new Pair(RemoteBioParameters.TIME, b.i(new Pair("value", time2 != null ? Long.valueOf(time2.getValue()) : null), new Pair("tz_offset", time2 != null ? Integer.valueOf(time2.getTzOffset()) : null), new Pair("text", time2 != null ? time2.getText() : null))));
                                            } else {
                                                map8 = null;
                                            }
                                            arrayList14.add(b.i(pair26, pair27, pair31, new Pair("lastTrip", map8)));
                                            it14 = it15;
                                            str14 = str7;
                                            str16 = str24;
                                            pair21 = pair4;
                                            pair17 = pair28;
                                            pair16 = pair3;
                                            pair7 = pair5;
                                            arrayList2 = arrayList3;
                                        }
                                        Pair pair32 = pair17;
                                        Pair pair33 = pair16;
                                        ArrayList arrayList15 = arrayList2;
                                        String str25 = str14;
                                        Pair pair34 = pair21;
                                        Pair pair35 = pair7;
                                        String str26 = str16;
                                        Pair pair36 = new Pair("alerts", arrayList14);
                                        Stop alternateDepartureStop = transportThread.getAlternateDepartureStop();
                                        Pair pair37 = new Pair("alternateDepartureStop", alternateDepartureStop != null ? ssq0.d(alternateDepartureStop) : null);
                                        BoardingOptions boardingOptions = transportThread.getBoardingOptions();
                                        if (boardingOptions != null) {
                                            List<BoardingOptions.BoardingArea> area = boardingOptions.getArea();
                                            ArrayList arrayList16 = new ArrayList(tcc.n(area, 10));
                                            Iterator<T> it16 = area.iterator();
                                            while (it16.hasNext()) {
                                                arrayList16.add(gw00.e(new Pair("id", ((BoardingOptions.BoardingArea) it16.next()).getId())));
                                            }
                                            map5 = gw00.e(new Pair("area", arrayList16));
                                        } else {
                                            map5 = null;
                                        }
                                        arrayList12.add(b.i(pair24, pair25, pair36, pair37, new Pair("boardingOptions", map5)));
                                        it11 = it12;
                                        str20 = str23;
                                        str13 = str22;
                                        pair6 = pair23;
                                        str14 = str25;
                                        str16 = str26;
                                        pair21 = pair34;
                                        pair17 = pair32;
                                        pair16 = pair33;
                                        pair7 = pair35;
                                        arrayList2 = arrayList15;
                                    }
                                    ArrayList arrayList17 = arrayList2;
                                    arrayList17.add(b.i(pair21, new Pair("transports", arrayList12)));
                                    arrayList2 = arrayList17;
                                    it9 = it10;
                                    str12 = str21;
                                    pair17 = pair17;
                                }
                                pair = pair17;
                            } else {
                                pair = pair17;
                                arrayList2 = null;
                            }
                            String str27 = str20;
                            String str28 = str12;
                            String str29 = str13;
                            String str30 = str14;
                            Pair pair38 = pair6;
                            Pair pair39 = new Pair(Constants.KEY_DATA, b.i(pair7, pair16, pair, new Pair("transports", arrayList2)));
                            TravelEstimation estimation = sectionMetadata.getEstimation();
                            Pair pair40 = new Pair(kju0.j, b.i(pair38, pair39, new Pair(str30, estimation != null ? ssq0.e(estimation) : null)));
                            Pair pair41 = new Pair("geometry", rsq0.n(section.getGeometry()));
                            List<RouteStop> stops = section.getStops();
                            ArrayList arrayList18 = new ArrayList(tcc.n(stops, 10));
                            for (RouteStop routeStop : stops) {
                                RouteStopMetadata metadata2 = routeStop.getMetadata();
                                String str31 = str27;
                                Pair pair42 = new Pair(str31, ssq0.d(metadata2.getStop()));
                                Stop stopExit = metadata2.getStopExit();
                                Pair pair43 = new Pair("stopExit", stopExit != null ? ssq0.d(stopExit) : null);
                                if (metadata2.getExitPoint() != null) {
                                    Point exitPoint = metadata2.getExitPoint();
                                    str6 = str29;
                                    str5 = str28;
                                    map3 = b.i(new Pair(str6, Double.valueOf(exitPoint.getLatitude())), new Pair(str5, Double.valueOf(exitPoint.getLongitude())));
                                } else {
                                    str5 = str28;
                                    str6 = str29;
                                    map3 = null;
                                }
                                Pair pair44 = new Pair(kju0.j, b.i(pair42, pair43, new Pair("exitPoint", map3)));
                                Point position2 = routeStop.getPosition();
                                arrayList18.add(b.i(pair44, new Pair(str4, b.i(new Pair(str6, Double.valueOf(position2.getLatitude())), new Pair(str5, Double.valueOf(position2.getLongitude()))))));
                                str27 = str31;
                                str29 = str6;
                                str28 = str5;
                            }
                            String str32 = str28;
                            String str33 = str29;
                            Pair pair45 = new Pair("stops", arrayList18);
                            List<Subpolyline> rideLegs = section.getRideLegs();
                            ArrayList arrayList19 = new ArrayList(tcc.n(rideLegs, 10));
                            Iterator<T> it17 = rideLegs.iterator();
                            while (it17.hasNext()) {
                                arrayList19.add(rsq0.n((Subpolyline) it17.next()));
                            }
                            Map i = b.i(pair40, pair41, pair45, new Pair("rideLegs", arrayList19));
                            arrayList5 = arrayList;
                            arrayList5.add(i);
                            it = it2;
                            str14 = str30;
                            str13 = str33;
                            str12 = str32;
                            str15 = str3;
                            str10 = str;
                            str11 = str2;
                        }
                        ((ba20) da20Var).success(arrayList5);
                        return;
                    }
                    break;
                case -1049910291:
                    if (str9.equals("getDistanceBetweenPolylinePositions")) {
                        Map map10 = (Map) obj;
                        Map map11 = (Map) map10.get("from");
                        PolylinePosition polylinePosition2 = new PolylinePosition(((Integer) map11.get("segmentIndex")).intValue(), ((Double) map11.get("segmentPosition")).doubleValue());
                        Map map12 = (Map) map10.get("to");
                        ((ba20) da20Var).success(Double.valueOf(b(x920Var).distanceBetweenPolylinePositions(polylinePosition2, new PolylinePosition(((Integer) map12.get("segmentIndex")).intValue(), ((Double) map12.get("segmentPosition")).doubleValue()))));
                        return;
                    }
                    break;
                case -684567044:
                    if (str9.equals("getWayPoints")) {
                        List<WayPoint> wayPoints = b(x920Var).getWayPoints();
                        ArrayList arrayList20 = new ArrayList(tcc.n(wayPoints, 10));
                        Iterator<T> it18 = wayPoints.iterator();
                        while (it18.hasNext()) {
                            arrayList20.add(ssq0.f((WayPoint) it18.next()));
                        }
                        ((ba20) da20Var).success(arrayList20);
                        return;
                    }
                    break;
                case -371046936:
                    if (str9.equals("getGeometry")) {
                        List<Point> points = b(x920Var).getGeometry().getPoints();
                        ArrayList arrayList21 = new ArrayList(tcc.n(points, 10));
                        for (Point point : points) {
                            arrayList21.add(b.i(new Pair("lat", Double.valueOf(point.getLatitude())), new Pair("lon", Double.valueOf(point.getLongitude()))));
                        }
                        ((ba20) da20Var).success(gw00.e(new Pair(CRLDistributionPointsExtension.POINTS, arrayList21)));
                        return;
                    }
                    break;
                case 1627895973:
                    if (str9.equals("getMetadata")) {
                        RouteMetadata metadata3 = b(x920Var).getMetadata();
                        Pair pair46 = new Pair("weight", ssq0.g(metadata3.getWeight()));
                        RouteSettings settings = metadata3.getSettings();
                        Pair pair47 = new Pair("settings", settings != null ? b.i(new Pair("avoidTypes", settings.getAvoidTypes()), new Pair("acceptTypes", settings.getAcceptTypes())) : null);
                        TravelEstimation estimation2 = metadata3.getEstimation();
                        Pair pair48 = new Pair("estimation", estimation2 != null ? ssq0.e(estimation2) : null);
                        List<WayPoint> wayPoints2 = metadata3.getWayPoints();
                        ArrayList arrayList22 = new ArrayList(tcc.n(wayPoints2, 10));
                        Iterator<T> it19 = wayPoints2.iterator();
                        while (it19.hasNext()) {
                            arrayList22.add(ssq0.f((WayPoint) it19.next()));
                        }
                        Pair pair49 = new Pair("wayPoints", arrayList22);
                        Pair pair50 = new Pair("routeId", metadata3.getRouteId());
                        Flags flags = metadata3.getFlags();
                        ((ba20) da20Var).success(b.i(pair46, pair47, pair48, pair49, pair50, new Pair("flags", flags != null ? b.i(new Pair("requiresAccessPass", Boolean.valueOf(flags.getRequiresAccessPass())), new Pair("hasAutoRoad", Boolean.valueOf(flags.getHasAutoRoad()))) : null)));
                        return;
                    }
                    break;
                case 1671767583:
                    if (str9.equals("dispose")) {
                        this.c.e((String) obj, ReferenceType.TRANSPORT_ROUTE);
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1747566469:
                    if (str9.equals("getUriMetadata")) {
                        List<Uri> uris = b(x920Var).getUriMetadata().getUris();
                        ArrayList arrayList23 = new ArrayList(tcc.n(uris, 10));
                        Iterator<T> it20 = uris.iterator();
                        while (it20.hasNext()) {
                            arrayList23.add(((Uri) it20.next()).getValue());
                        }
                        ((ba20) da20Var).success(arrayList23);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }

    public Route b(x920 x920Var) {
        return (Route) this.c.c((String) x920Var.b, ReferenceType.TRANSPORT_ROUTE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        ArrayList arrayList;
        Pair pair;
        Map map;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        int i = this.b;
        ini0 ini0Var = this.c;
        switch (i) {
            case 0:
                Object obj = x920Var.b;
                String str = x920Var.a;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -739014965:
                            if (str.equals("getHostRoute")) {
                                ((ba20) da20Var).success(ini0Var.a(ReferenceType.DRIVING_ROUTE, ((com.yandex.mapkit.navigation.automotive.layer.BalloonView) ini0Var.c((String) obj, ReferenceType.BALLOON_VIEW)).getHostRoute()));
                                break;
                            }
                            break;
                        case -113035288:
                            if (str.equals("isVisible")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((com.yandex.mapkit.navigation.automotive.layer.BalloonView) ini0Var.c((String) obj, ReferenceType.BALLOON_VIEW)).isIsVisible()));
                                break;
                            }
                            break;
                        case 698003449:
                            if (str.equals("getBalloon")) {
                                Balloon balloon = ((com.yandex.mapkit.navigation.automotive.layer.BalloonView) ini0Var.c((String) obj, ReferenceType.BALLOON_VIEW)).getBalloon();
                                ((ba20) da20Var).success(b.i(new Pair("hasManeuver", Boolean.valueOf(balloon.getManoeuvre() != null)), new Pair("hasManeuverWithLaneSign", Boolean.valueOf(balloon.getManoeuvreWithLaneSign() != null))));
                                break;
                            }
                            break;
                        case 1671767583:
                            if (str.equals("dispose")) {
                                ini0Var.e((String) obj, ReferenceType.BALLOON_VIEW);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 2073378034:
                            if (str.equals("isValid")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((com.yandex.mapkit.navigation.automotive.layer.BalloonView) ini0Var.c((String) obj, ReferenceType.BALLOON_VIEW)).isValid()));
                                break;
                            }
                            break;
                    }
                }
                break;
            case 1:
                Object obj2 = x920Var.b;
                String str2 = x920Var.a;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1872459506:
                            if (str2.equals("getRouteId")) {
                                ((ba20) da20Var).success(((DrivingRoute) ini0Var.c((String) obj2, ReferenceType.DRIVING_ROUTE)).getRouteId());
                                break;
                            }
                            break;
                        case -1469262177:
                            if (str2.equals("getPosition")) {
                                PolylinePosition position = ((DrivingRoute) ini0Var.c((String) obj2, ReferenceType.DRIVING_ROUTE)).getPosition();
                                ((ba20) da20Var).success(b.i(new Pair("segmentIndex", Integer.valueOf(position.getSegmentIndex())), new Pair("segmentPosition", Double.valueOf(position.getSegmentPosition()))));
                                break;
                            }
                            break;
                        case -371046936:
                            if (str2.equals("getGeometry")) {
                                List<Point> points = ((DrivingRoute) ini0Var.c((String) obj2, ReferenceType.DRIVING_ROUTE)).getGeometry().getPoints();
                                ArrayList arrayList3 = new ArrayList(tcc.n(points, 10));
                                for (Point point : points) {
                                    arrayList3.add(b.i(new Pair("lat", Double.valueOf(point.getLatitude())), new Pair("lon", Double.valueOf(point.getLongitude()))));
                                }
                                ((ba20) da20Var).success(gw00.e(new Pair(CRLDistributionPointsExtension.POINTS, arrayList3)));
                                break;
                            }
                            break;
                        case 194875548:
                            if (str2.equals("getRequestPoints")) {
                                List<RequestPoint> requestPoints = ((DrivingRoute) ini0Var.c((String) obj2, ReferenceType.DRIVING_ROUTE)).getRequestPoints();
                                if (requestPoints != null) {
                                    List<RequestPoint> list = requestPoints;
                                    arrayList = new ArrayList(tcc.n(list, 10));
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(rsq0.k((RequestPoint) it.next()));
                                    }
                                } else {
                                    arrayList = null;
                                }
                                ((ba20) da20Var).success(arrayList);
                                break;
                            }
                            break;
                        case 404685839:
                            if (str2.equals("getEvents")) {
                                List<Event> events = ((DrivingRoute) ini0Var.c((String) obj2, ReferenceType.DRIVING_ROUTE)).getEvents();
                                ArrayList arrayList4 = new ArrayList();
                                for (Event event : events) {
                                    PolylinePosition polylinePosition = event.getPolylinePosition();
                                    Pair pair2 = new Pair("position", b.i(new Pair("segmentIndex", Integer.valueOf(polylinePosition.getSegmentIndex())), new Pair("segmentPosition", Double.valueOf(polylinePosition.getSegmentPosition()))));
                                    Pair pair3 = new Pair("eventId", event.getEventId());
                                    Pair pair4 = new Pair("descriptionText", event.getDescriptionText());
                                    List<EventTag> tags = event.getTags();
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator<T> it2 = tags.iterator();
                                    while (it2.hasNext()) {
                                        arrayList5.add(((EventTag) it2.next()).name().toLowerCase(Locale.ROOT));
                                    }
                                    Pair pair5 = new Pair("tags", arrayList5);
                                    Point location = event.getLocation();
                                    arrayList4.add(b.i(pair2, pair3, pair4, pair5, new Pair("location", b.i(new Pair("lat", Double.valueOf(location.getLatitude())), new Pair("lon", Double.valueOf(location.getLongitude())))), new Pair("speedLimit", event.getSpeedLimit())));
                                }
                                ((ba20) da20Var).success(arrayList4);
                                break;
                            }
                            break;
                        case 1194723874:
                            if (str2.equals("getTollRoads")) {
                                List<TollRoad> tollRoads = ((DrivingRoute) ini0Var.c((String) obj2, ReferenceType.DRIVING_ROUTE)).getTollRoads();
                                ArrayList arrayList6 = new ArrayList(tcc.n(tollRoads, 10));
                                Iterator<T> it3 = tollRoads.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(gw00.e(new Pair("position", rsq0.n(((TollRoad) it3.next()).getPosition()))));
                                }
                                ((ba20) da20Var).success(arrayList6);
                                break;
                            }
                            break;
                        case 1627895973:
                            if (str2.equals("getMetadata")) {
                                DrivingRouteMetadata metadata = ((DrivingRoute) ini0Var.c((String) obj2, ReferenceType.DRIVING_ROUTE)).getMetadata();
                                Description description = metadata.getDescription();
                                Pair pair6 = new Pair("weight", b.i(new Pair(RemoteBioParameters.TIME, rsq0.f(metadata.getWeight().getTime())), new Pair("timeWithTraffic", rsq0.f(metadata.getWeight().getTimeWithTraffic())), new Pair("distance", rsq0.f(metadata.getWeight().getDistance()))));
                                Pair pair7 = new Pair("flags", b.i(new Pair("blocked", Boolean.valueOf(metadata.getFlags().getBlocked())), new Pair("hasFerries", Boolean.valueOf(metadata.getFlags().getHasFerries())), new Pair("hasTolls", Boolean.valueOf(metadata.getFlags().getHasTolls())), new Pair("requiresAccessPass", Boolean.valueOf(metadata.getFlags().getRequiresAccessPass())), new Pair("forParking", Boolean.valueOf(metadata.getFlags().getForParking())), new Pair("futureBlocked", Boolean.valueOf(metadata.getFlags().getFutureBlocked())), new Pair("deadJam", Boolean.valueOf(metadata.getFlags().getDeadJam())), new Pair("builtOffline", Boolean.valueOf(metadata.getFlags().getBuiltOffline())), new Pair("predicted", Boolean.valueOf(metadata.getFlags().getPredicted())), new Pair("hasRuggedRoads", Boolean.valueOf(metadata.getFlags().getHasRuggedRoads())), new Pair("hasFordCrossing", Boolean.valueOf(metadata.getFlags().getHasFordCrossing())), new Pair("hasVehicleRestrictions", Boolean.valueOf(metadata.getFlags().getHasVehicleRestrictions())), new Pair("hasUnpavedRoads", Boolean.valueOf(metadata.getFlags().getHasUnpavedRoads())), new Pair("hasInPoorConditionRoads", Boolean.valueOf(metadata.getFlags().getHasInPoorConditionRoads())), new Pair("hasRailwayCrossing", Boolean.valueOf(metadata.getFlags().getHasRailwayCrossing())), new Pair("hasCheckpoints", Boolean.valueOf(metadata.getFlags().getHasCheckpoints())), new Pair("scheduledDeparture", Boolean.valueOf(metadata.getFlags().getScheduledDeparture()))));
                                Pair pair8 = new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, description != null ? g8e.z("via", description.getVia()) : null);
                                List<RoutePoint> routePoints = metadata.getRoutePoints();
                                ArrayList arrayList7 = new ArrayList(tcc.n(routePoints, 10));
                                for (RoutePoint routePoint : routePoints) {
                                    Point position2 = routePoint.getPosition();
                                    Pair pair9 = new Pair("position", b.i(new Pair("lat", Double.valueOf(position2.getLatitude())), new Pair("lon", Double.valueOf(position2.getLongitude()))));
                                    Point selectedArrivalPoint = routePoint.getSelectedArrivalPoint();
                                    arrayList7.add(b.i(pair9, new Pair("selectedArrivalPoint", selectedArrivalPoint != null ? b.i(new Pair("lat", Double.valueOf(selectedArrivalPoint.getLatitude())), new Pair("lon", Double.valueOf(selectedArrivalPoint.getLongitude()))) : null), new Pair("drivingArrivalPointId", routePoint.getDrivingArrivalPointId())));
                                }
                                ((ba20) da20Var).success(b.i(pair6, pair7, pair8, new Pair("routePoints", arrayList7), new Pair("tags", metadata.getTags()), new Pair(LaunchBrowserActivity.KEY_URI, metadata.getUri())));
                                break;
                            }
                            break;
                        case 1671767583:
                            if (str2.equals("dispose")) {
                                ini0Var.e((String) obj2, ReferenceType.DRIVING_ROUTE);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1950946976:
                            if (str2.equals("getJamSegments")) {
                                List<JamSegment> jamSegments = ((DrivingRoute) ini0Var.c((String) obj2, ReferenceType.DRIVING_ROUTE)).getJamSegments();
                                ArrayList arrayList8 = new ArrayList(tcc.n(jamSegments, 10));
                                for (JamSegment jamSegment : jamSegments) {
                                    arrayList8.add(b.i(new Pair("jamType", jamSegment.getJamType().name().toLowerCase(Locale.ROOT)), new Pair("speed", Double.valueOf(jamSegment.getSpeed()))));
                                }
                                ((ba20) da20Var).success(arrayList8);
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            case 2:
                Object obj3 = x920Var.b;
                String str3 = x920Var.a;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1148887714:
                            if (str3.equals("addJams")) {
                                Map map2 = (Map) obj3;
                                RouteHelper.addJams((PolylineMapObject) ini0Var.c((String) map2.get("polylineId"), ReferenceType.MAP_OBJECT), (DrivingRoute) ini0Var.c((String) map2.get("routeId"), ReferenceType.DRIVING_ROUTE));
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -706999607:
                            if (str3.equals("applyJamStyle")) {
                                Map map3 = (Map) obj3;
                                String str4 = (String) map3.get("polylineId");
                                Map map4 = (Map) map3.get("jamStyle");
                                PolylineMapObject polylineMapObject = (PolylineMapObject) ini0Var.c(str4, ReferenceType.MAP_OBJECT);
                                List<Map> list2 = (List) map4.get("colors");
                                ArrayList arrayList9 = new ArrayList(tcc.n(list2, 10));
                                for (Map map5 : list2) {
                                    arrayList9.add(new JamTypeColor(JamType.valueOf(((String) map5.get("jamType")).toUpperCase(Locale.ROOT)), ((Number) map5.get("jamColor")).intValue()));
                                }
                                RouteHelper.applyJamStyle(polylineMapObject, new JamStyle((List<JamTypeColor>) a.J0(arrayList9)));
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -483661799:
                            if (str3.equals("addManeuvers")) {
                                Map map6 = (Map) obj3;
                                RouteHelper.addManeuvers((PolylineMapObject) ini0Var.c((String) map6.get("polylineId"), ReferenceType.MAP_OBJECT), (DrivingRoute) ini0Var.c((String) map6.get("routeId"), ReferenceType.DRIVING_ROUTE));
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1845263498:
                            if (str3.equals("applyManeuverStyle")) {
                                Map map7 = (Map) obj3;
                                String str5 = (String) map7.get("polylineId");
                                Map map8 = (Map) map7.get("maneuverStyle");
                                PolylineMapObject polylineMapObject2 = (PolylineMapObject) ini0Var.c(str5, ReferenceType.MAP_OBJECT);
                                Map map9 = (Map) map8.get("arrow");
                                RouteHelper.applyManeuverStyle(polylineMapObject2, new ManeuverStyle(new ArrowManeuverStyle(((Number) map9.get("fillColor")).intValue(), ((Number) map9.get("outlineColor")).intValue(), (float) ((Double) map9.get("outlineWidth")).doubleValue(), (float) ((Double) map9.get("length")).doubleValue(), (float) ((Double) map9.get("triangleHeight")).doubleValue(), ((Boolean) map9.get(BackendConfig.Restrictions.ENABLED)).booleanValue())));
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            case 3:
                Object obj4 = x920Var.b;
                String str6 = x920Var.a;
                if (str6 != null) {
                    switch (str6.hashCode()) {
                        case 344886773:
                            if (str6.equals("getBalloonViews")) {
                                List<com.yandex.mapkit.navigation.automotive.layer.BalloonView> balloonViews = ((RouteView) ini0Var.c((String) obj4, ReferenceType.ROUTE_VIEW)).getBalloonViews();
                                ArrayList arrayList10 = new ArrayList(tcc.n(balloonViews, 10));
                                Iterator<T> it4 = balloonViews.iterator();
                                while (it4.hasNext()) {
                                    arrayList10.add(ini0Var.a(ReferenceType.BALLOON_VIEW, (com.yandex.mapkit.navigation.automotive.layer.BalloonView) it4.next()));
                                }
                                ((ba20) da20Var).success(arrayList10);
                                break;
                            }
                            break;
                        case 1671767583:
                            if (str6.equals("dispose")) {
                                ini0Var.e((String) obj4, ReferenceType.ROUTE_VIEW);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1964529811:
                            if (str6.equals("getRoute")) {
                                ((ba20) da20Var).success(ini0Var.a(ReferenceType.DRIVING_ROUTE, ((RouteView) ini0Var.c((String) obj4, ReferenceType.ROUTE_VIEW)).getRoute()));
                                break;
                            }
                            break;
                        case 2073378034:
                            if (str6.equals("isValid")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((RouteView) ini0Var.c((String) obj4, ReferenceType.ROUTE_VIEW)).isValid()));
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            case 4:
                Object obj5 = x920Var.b;
                String str7 = x920Var.a;
                if (jl40.l(str7, "getMetadata")) {
                    Map map10 = (Map) obj5;
                    String str8 = (String) map10.get("id");
                    Metadata valueOf = Metadata.valueOf(((String) map10.get("type")).toUpperCase(Locale.ROOT));
                    GeoObject geoObject = (GeoObject) ini0Var.c(str8, ReferenceType.GEO_OBJECT);
                    valueOf.getClass();
                    switch (t820.a[valueOf.ordinal()]) {
                        case 1:
                            BillboardObjectMetadata billboardObjectMetadata = (BillboardObjectMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(BillboardObjectMetadata.class));
                            if (billboardObjectMetadata != null) {
                                Pair pair10 = new Pair("title", billboardObjectMetadata.getTitle());
                                Pair pair11 = new Pair("address", billboardObjectMetadata.getAddress());
                                List<Disclaimer> disclaimers = billboardObjectMetadata.getDisclaimers();
                                ArrayList arrayList11 = new ArrayList(tcc.n(disclaimers, 10));
                                Iterator<T> it5 = disclaimers.iterator();
                                while (it5.hasNext()) {
                                    arrayList11.add(((Disclaimer) it5.next()).getText());
                                }
                                Pair pair12 = new Pair("disclaimers", arrayList11);
                                List<BillboardAction> actions = billboardObjectMetadata.getActions();
                                ArrayList arrayList12 = new ArrayList(tcc.n(actions, 10));
                                for (BillboardAction billboardAction : actions) {
                                    arrayList12.add(b.i(new Pair("type", billboardAction.getType()), new Pair("properties", ssq0.a(billboardAction.getProperties()))));
                                }
                                Pair pair13 = new Pair("actions", arrayList12);
                                List<Creative> creatives = billboardObjectMetadata.getCreatives();
                                ArrayList arrayList13 = new ArrayList(tcc.n(creatives, 10));
                                for (Creative creative : creatives) {
                                    arrayList13.add(b.i(new Pair("id", creative.getId()), new Pair("type", creative.getType()), new Pair("properties", ssq0.a(creative.getProperties()))));
                                }
                                r13 = b.i(pair10, pair11, pair12, pair13, new Pair("creatives", arrayList13));
                                ((ba20) da20Var).success(r13);
                                break;
                            }
                            r13 = null;
                            ((ba20) da20Var).success(r13);
                        case 2:
                            RoadEventMetadata roadEventMetadata = (RoadEventMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(RoadEventMetadata.class));
                            if (roadEventMetadata != null) {
                                r13 = rsq0.l(roadEventMetadata);
                                ((ba20) da20Var).success(r13);
                                break;
                            }
                            r13 = null;
                            ((ba20) da20Var).success(r13);
                        case 3:
                            BusinessObjectMetadata businessObjectMetadata = (BusinessObjectMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(BusinessObjectMetadata.class));
                            if (businessObjectMetadata != null) {
                                Pair pair14 = new Pair("oid", businessObjectMetadata.getOid());
                                Pair pair15 = new Pair("name", businessObjectMetadata.getName());
                                Address address = businessObjectMetadata.getAddress();
                                Pair pair16 = new Pair("formattedAddress", address.getFormattedAddress());
                                Pair pair17 = new Pair("additionalInfo", address.getAdditionalInfo());
                                Pair pair18 = new Pair("postalCode", address.getPostalCode());
                                Pair pair19 = new Pair("countryCode", address.getCountryCode());
                                List<Address.Component> components = address.getComponents();
                                ArrayList arrayList14 = new ArrayList(tcc.n(components, 10));
                                Iterator it6 = components.iterator();
                                while (it6.hasNext()) {
                                    Address.Component component = (Address.Component) it6.next();
                                    BusinessObjectMetadata businessObjectMetadata2 = businessObjectMetadata;
                                    Pair pair20 = new Pair("name", component.getName());
                                    List<Address.Component.Kind> kinds = component.getKinds();
                                    Iterator it7 = it6;
                                    Pair pair21 = pair14;
                                    ArrayList arrayList15 = new ArrayList(tcc.n(kinds, 10));
                                    Iterator<T> it8 = kinds.iterator();
                                    while (it8.hasNext()) {
                                        arrayList15.add(((Address.Component.Kind) it8.next()).name().toLowerCase(Locale.ROOT));
                                    }
                                    arrayList14.add(b.i(pair20, new Pair("kinds", arrayList15)));
                                    businessObjectMetadata = businessObjectMetadata2;
                                    it6 = it7;
                                    pair14 = pair21;
                                }
                                BusinessObjectMetadata businessObjectMetadata3 = businessObjectMetadata;
                                Pair pair22 = pair14;
                                Pair pair23 = new Pair("address", b.i(pair16, pair17, pair18, pair19, new Pair("components", arrayList14)));
                                WorkingHours workingHours = businessObjectMetadata3.getWorkingHours();
                                if (workingHours != null) {
                                    Pair pair24 = new Pair("text", workingHours.getText());
                                    List<Availability> availabilities = workingHours.getAvailabilities();
                                    ArrayList arrayList16 = new ArrayList(tcc.n(availabilities, 10));
                                    Iterator it9 = availabilities.iterator();
                                    while (it9.hasNext()) {
                                        Availability availability = (Availability) it9.next();
                                        Pair pair25 = new Pair("days", Integer.valueOf(availability.getDays()));
                                        List<TimeRange> timeRanges = availability.getTimeRanges();
                                        ArrayList arrayList17 = new ArrayList(tcc.n(timeRanges, 10));
                                        for (TimeRange timeRange : timeRanges) {
                                            arrayList17.add(b.i(new Pair("isTwentyFourHours", timeRange.getIsTwentyFourHours()), new Pair("from", timeRange.getFrom()), new Pair("to", timeRange.getTo())));
                                            workingHours = workingHours;
                                            pair23 = pair23;
                                            it9 = it9;
                                        }
                                        arrayList16.add(b.i(pair25, new Pair("timeRanges", arrayList17)));
                                        workingHours = workingHours;
                                        pair23 = pair23;
                                    }
                                    WorkingHours workingHours2 = workingHours;
                                    pair = pair23;
                                    Pair pair26 = new Pair("availabilities", arrayList16);
                                    State state = workingHours2.getState();
                                    map = b.i(pair24, pair26, new Pair(ClidProvider.STATE, state != null ? b.i(new Pair("isOpenNow", state.getIsOpenNow()), new Pair("text", state.getText()), new Pair("shortText", state.getShortText()), new Pair("tags", state.getTags())) : null));
                                } else {
                                    pair = pair23;
                                    map = null;
                                }
                                Pair pair27 = new Pair("workingHours", map);
                                List<Feature> features = businessObjectMetadata3.getFeatures();
                                ArrayList arrayList18 = new ArrayList(tcc.n(features, 10));
                                Iterator it10 = features.iterator();
                                while (it10.hasNext()) {
                                    Feature feature = (Feature) it10.next();
                                    Pair pair28 = new Pair("id", feature.getId());
                                    Feature.VariantValue value = feature.getValue();
                                    Feature.BooleanValue booleanValue = value.getBooleanValue();
                                    Pair pair29 = new Pair("booleanValue", booleanValue != null ? Boolean.valueOf(booleanValue.getValue()) : null);
                                    Pair pair30 = new Pair("textValue", value.getTextValue());
                                    List<Feature.FeatureEnumValue> enumValue = value.getEnumValue();
                                    if (enumValue != null) {
                                        List<Feature.FeatureEnumValue> list3 = enumValue;
                                        arrayList2 = new ArrayList(tcc.n(list3, 10));
                                        for (Feature.FeatureEnumValue featureEnumValue : list3) {
                                            arrayList2.add(b.i(new Pair("id", featureEnumValue.getId()), new Pair("name", featureEnumValue.getName()), new Pair("imageUrlTemplate", featureEnumValue.getImageUrlTemplate())));
                                            it10 = it10;
                                            pair27 = pair27;
                                        }
                                    } else {
                                        arrayList2 = null;
                                    }
                                    Iterator it11 = it10;
                                    Pair pair31 = pair27;
                                    arrayList18.add(b.i(pair28, new Pair("value", b.i(pair29, pair30, new Pair("enumValue", arrayList2))), new Pair("name", feature.getName()), new Pair("aref", feature.getAref())));
                                    it10 = it11;
                                    pair27 = pair31;
                                }
                                Pair pair32 = pair27;
                                Pair pair33 = new Pair("features", arrayList18);
                                Properties properties = businessObjectMetadata3.getProperties();
                                if (properties != null) {
                                    List<Properties.Item> items = properties.getItems();
                                    int d = gw00.d(tcc.n(items, 10));
                                    if (d < 16) {
                                        d = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(d);
                                    for (Properties.Item item : items) {
                                        Pair pair34 = new Pair(item.getKey(), item.getValue());
                                        linkedHashMap.put(pair34.c(), pair34.f());
                                    }
                                } else {
                                    linkedHashMap = null;
                                }
                                r13 = b.i(pair22, pair15, pair, pair32, pair33, new Pair("properties", linkedHashMap));
                                ((ba20) da20Var).success(r13);
                                break;
                            }
                            r13 = null;
                            ((ba20) da20Var).success(r13);
                        case 4:
                            GeoObjectSelectionMetadata geoObjectSelectionMetadata = (GeoObjectSelectionMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(GeoObjectSelectionMetadata.class));
                            if (geoObjectSelectionMetadata != null) {
                                r13 = b.i(new Pair("objectId", geoObjectSelectionMetadata.getObjectId()), new Pair("dataSourceName", geoObjectSelectionMetadata.getDataSourceName()), new Pair("layerId", geoObjectSelectionMetadata.getLayerId()), new Pair("groupId", geoObjectSelectionMetadata.getGroupId()));
                            }
                            ((ba20) da20Var).success(r13);
                            break;
                        case 5:
                            RoutePointMetadata routePointMetadata = (RoutePointMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(RoutePointMetadata.class));
                            if (routePointMetadata != null) {
                                Pair pair35 = new Pair("routePointContext", routePointMetadata.getRoutePointContext());
                                List<Entrance> entrances = routePointMetadata.getEntrances();
                                ArrayList arrayList19 = new ArrayList(tcc.n(entrances, 10));
                                for (Entrance entrance : entrances) {
                                    Pair pair36 = new Pair("name", entrance.getName());
                                    Point point2 = entrance.getPoint();
                                    Pair pair37 = new Pair(IssuingDistributionPointExtension.POINT, b.i(new Pair("lat", Double.valueOf(point2.getLatitude())), new Pair("lon", Double.valueOf(point2.getLongitude()))));
                                    Direction direction = entrance.getDirection();
                                    arrayList19.add(b.i(pair36, pair37, new Pair("direction", direction != null ? b.i(new Pair("tilt", Double.valueOf(direction.getTilt())), new Pair("azimuth", Double.valueOf(direction.getAzimuth()))) : null)));
                                }
                                r13 = b.i(pair35, new Pair("entrances", arrayList19));
                            }
                            ((ba20) da20Var).success(r13);
                            break;
                        case 6:
                            UriObjectMetadata uriObjectMetadata = (UriObjectMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(UriObjectMetadata.class));
                            if (uriObjectMetadata != null) {
                                List<Uri> uris = uriObjectMetadata.getUris();
                                ArrayList arrayList20 = new ArrayList(tcc.n(uris, 10));
                                Iterator<T> it12 = uris.iterator();
                                while (it12.hasNext()) {
                                    arrayList20.add(((Uri) it12.next()).getValue());
                                }
                                r13 = gw00.e(new Pair("uris", arrayList20));
                            }
                            ((ba20) da20Var).success(r13);
                            break;
                        default:
                            w511.b();
                            break;
                    }
                } else if (jl40.l(str7, "dispose")) {
                    ini0Var.e((String) obj5, ReferenceType.GEO_OBJECT);
                    ((ba20) da20Var).success(null);
                    break;
                } else {
                    ((ba20) da20Var).notImplemented();
                    break;
                }
            case 5:
                Object obj6 = x920Var.b;
                String str9 = x920Var.a;
                if (str9 != null) {
                    int hashCode = str9.hashCode();
                    if (hashCode != 236076183) {
                        if (hashCode != 1671767583) {
                            if (hashCode == 2067519011 && str9.equals("getActiveLevelId")) {
                                IndoorPlan indoorPlan = (IndoorPlan) ini0Var.d((String) ((Map) obj6).get("refId"), ReferenceType.INDOOR_PLAN);
                                ((ba20) da20Var).success(indoorPlan != null ? indoorPlan.getActiveLevelId() : null);
                                break;
                            }
                        } else if (str9.equals("dispose")) {
                            ini0Var.e((String) ((Map) obj6).get("refId"), ReferenceType.INDOOR_PLAN);
                            ((ba20) da20Var).success(null);
                            break;
                        }
                    } else if (str9.equals("setActiveLevelId")) {
                        Map map11 = (Map) obj6;
                        String str10 = (String) map11.get("levelId");
                        IndoorPlan indoorPlan2 = (IndoorPlan) ini0Var.d((String) map11.get("refId"), ReferenceType.INDOOR_PLAN);
                        if (indoorPlan2 != null) {
                            indoorPlan2.setActiveLevelId(str10);
                        }
                        ((ba20) da20Var).success(null);
                        break;
                    }
                }
                break;
            case 6:
                c(x920Var, da20Var);
                break;
            case 7:
                d(x920Var, da20Var);
                break;
            case 8:
                Object obj7 = x920Var.b;
                String str11 = x920Var.a;
                if (jl40.l(str11, "onTokenReceived")) {
                    Map map12 = (Map) obj7;
                    String str12 = (String) map12.get(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
                    TokenListener tokenListener = (TokenListener) ini0Var.e((String) map12.get("listenerId"), ReferenceType.TOKEN_LISTENER);
                    if (tokenListener != null) {
                        tokenListener.onTokenReceived(str12);
                    }
                    ((ba20) da20Var).success(null);
                    break;
                } else if (jl40.l(str11, "onTokenRefreshFailed")) {
                    Map map13 = (Map) obj7;
                    String str13 = (String) map13.get(Constants.KEY_MESSAGE);
                    TokenListener tokenListener2 = (TokenListener) ini0Var.e((String) map13.get("listenerId"), ReferenceType.TOKEN_LISTENER);
                    if (tokenListener2 != null) {
                        tokenListener2.onTokenRefreshFailed(str13);
                    }
                    ((ba20) da20Var).success(null);
                    break;
                } else {
                    ((ba20) da20Var).notImplemented();
                    break;
                }
            case 9:
                e(x920Var, da20Var);
                break;
            case 10:
                f(x920Var, da20Var);
                break;
            default:
                Object obj8 = x920Var.b;
                String str14 = x920Var.a;
                if (str14 != null) {
                    int hashCode2 = str14.hashCode();
                    if (hashCode2 != 1671767583) {
                        if (hashCode2 != 1964529811) {
                            if (hashCode2 == 2073378034 && str14.equals("isValid")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((com.yandex.mapkit.navigation.transport.layer.RouteView) ini0Var.c((String) obj8, ReferenceType.TRANSPORT_ROUTE_VIEW)).isValid()));
                                break;
                            }
                        } else if (str14.equals("getRoute")) {
                            ((ba20) da20Var).success(ini0Var.a(ReferenceType.TRANSPORT_ROUTE, ((com.yandex.mapkit.navigation.transport.layer.RouteView) ini0Var.c((String) obj8, ReferenceType.TRANSPORT_ROUTE_VIEW)).getRoute()));
                            break;
                        }
                    } else if (str14.equals("dispose")) {
                        ini0Var.e((String) obj8, ReferenceType.TRANSPORT_ROUTE_VIEW);
                        ((ba20) da20Var).success(null);
                        break;
                    }
                }
                break;
        }
    }
}

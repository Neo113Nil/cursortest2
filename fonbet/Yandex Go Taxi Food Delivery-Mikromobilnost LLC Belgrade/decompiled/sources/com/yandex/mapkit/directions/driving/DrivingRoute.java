package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.mapkit.navigation.RoutePosition;
import java.util.List;

/* loaded from: classes15.dex */
public interface DrivingRoute {
    void addConditionsListener(ConditionsListener conditionsListener);

    void addTollRoadsPriceListener(TollRoadsPriceListener tollRoadsPriceListener);

    AnnotationLanguage getAnnotationLanguage();

    List<AnnotationSchemeID> getAnnotationSchemes();

    List<Checkpoint> getCheckpoints();

    List<DirectionSign> getDirectionSigns();

    List<Event> getEvents();

    List<Ferry> getFerries();

    List<FordCrossing> getFordCrossings();

    Polyline getGeometry();

    List<HdSection> getHdSections();

    List<Highway> getHighways();

    List<JamSegment> getJamSegments();

    List<LaneSign> getLaneSigns();

    int getLegIndex();

    List<ManoeuvreVehicleRestriction> getManoeuvreVehicleRestrictions();

    DrivingRouteMetadata getMetadata();

    List<PedestrianCrossing> getPedestrianCrossings();

    PolylinePosition getPosition();

    List<RailwayCrossing> getRailwayCrossings();

    List<RequestPoint> getRequestPoints();

    List<RestrictedEntry> getRestrictedEntries();

    List<RestrictedTurn> getRestrictedTurns();

    List<RoadVehicleRestriction> getRoadVehicleRestrictions();

    String getRouteId();

    RoutePosition getRoutePosition();

    List<RuggedRoad> getRuggedRoads();

    List<DrivingSection> getSections();

    List<SpeedBump> getSpeedBumps();

    List<Float> getSpeedLimits();

    List<StandingSegment> getStandingSegments();

    List<TollRoad> getTollRoads();

    TollRoadsPrice getTollRoadsPrice();

    List<TrafficLight> getTrafficLights();

    List<Tunnel> getTunnels();

    VehicleOptions getVehicleOptions();

    List<PolylinePosition> getWayPoints();

    List<PolylinePosition> getZlevelBreakpoints();

    List<Integer> getZlevels();

    List<ZoneCrossing> getZoneCrossings();

    GraphLevel graphLevelAt(PolylinePosition polylinePosition);

    boolean isAreConditionsOutdated();

    DrivingRouteMetadata metadataAt(PolylinePosition polylinePosition);

    void removeConditionsListener(ConditionsListener conditionsListener);

    void removeTollRoadsPriceListener(TollRoadsPriceListener tollRoadsPriceListener);

    void requestConditionsUpdate();

    void requestTollRoadsPriceUpdate();

    int sectionIndex(int i);

    void setLegIndex(int i);

    void setPosition(PolylinePosition polylinePosition);
}

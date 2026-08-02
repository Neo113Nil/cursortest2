package com.yandex.mapkit.navigation.transport.layer.balloons;

import com.yandex.mapkit.navigation.transport.FitnessManoeuvre;
import com.yandex.mapkit.navigation.transport.RouteManoeuvre;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ManoeuvreBalloonDetails implements Serializable {
    private FitnessManoeuvre fitness;
    private RouteManoeuvre route;

    public static ManoeuvreBalloonDetails fromFitness(FitnessManoeuvre fitnessManoeuvre) {
        if (fitnessManoeuvre == null) {
            ny61.g("Variant value \"fitness\" cannot be null");
            return null;
        }
        ManoeuvreBalloonDetails manoeuvreBalloonDetails = new ManoeuvreBalloonDetails();
        manoeuvreBalloonDetails.fitness = fitnessManoeuvre;
        return manoeuvreBalloonDetails;
    }

    public static ManoeuvreBalloonDetails fromRoute(RouteManoeuvre routeManoeuvre) {
        if (routeManoeuvre == null) {
            ny61.g("Variant value \"route\" cannot be null");
            return null;
        }
        ManoeuvreBalloonDetails manoeuvreBalloonDetails = new ManoeuvreBalloonDetails();
        manoeuvreBalloonDetails.route = routeManoeuvre;
        return manoeuvreBalloonDetails;
    }

    public FitnessManoeuvre getFitness() {
        return this.fitness;
    }

    public RouteManoeuvre getRoute() {
        return this.route;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.fitness = (FitnessManoeuvre) archive.add((Archive) this.fitness, true, (Class<Archive>) FitnessManoeuvre.class);
        this.route = (RouteManoeuvre) archive.add((Archive) this.route, true, (Class<Archive>) RouteManoeuvre.class);
    }
}

package com.yandex.mapkit.navigation.transport;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ManoeuvreDetails implements Serializable {
    private FitnessManoeuvre fitness;
    private MasstransitManoeuvre masstransit;
    private RouteManoeuvre route;

    public static ManoeuvreDetails fromFitness(FitnessManoeuvre fitnessManoeuvre) {
        if (fitnessManoeuvre == null) {
            ny61.g("Variant value \"fitness\" cannot be null");
            return null;
        }
        ManoeuvreDetails manoeuvreDetails = new ManoeuvreDetails();
        manoeuvreDetails.fitness = fitnessManoeuvre;
        return manoeuvreDetails;
    }

    public static ManoeuvreDetails fromMasstransit(MasstransitManoeuvre masstransitManoeuvre) {
        if (masstransitManoeuvre == null) {
            ny61.g("Variant value \"masstransit\" cannot be null");
            return null;
        }
        ManoeuvreDetails manoeuvreDetails = new ManoeuvreDetails();
        manoeuvreDetails.masstransit = masstransitManoeuvre;
        return manoeuvreDetails;
    }

    public static ManoeuvreDetails fromRoute(RouteManoeuvre routeManoeuvre) {
        if (routeManoeuvre == null) {
            ny61.g("Variant value \"route\" cannot be null");
            return null;
        }
        ManoeuvreDetails manoeuvreDetails = new ManoeuvreDetails();
        manoeuvreDetails.route = routeManoeuvre;
        return manoeuvreDetails;
    }

    public FitnessManoeuvre getFitness() {
        return this.fitness;
    }

    public MasstransitManoeuvre getMasstransit() {
        return this.masstransit;
    }

    public RouteManoeuvre getRoute() {
        return this.route;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.fitness = (FitnessManoeuvre) archive.add((Archive) this.fitness, true, (Class<Archive>) FitnessManoeuvre.class);
        this.masstransit = (MasstransitManoeuvre) archive.add((Archive) this.masstransit, true, (Class<Archive>) MasstransitManoeuvre.class);
        this.route = (RouteManoeuvre) archive.add((Archive) this.route, true, (Class<Archive>) RouteManoeuvre.class);
    }
}

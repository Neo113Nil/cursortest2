package com.yandex.mapkit.navigation.transport.layer.balloons;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Balloon implements Serializable {
    private ManoeuvreBalloon manoeuvre;
    private MasstransitGetOffBalloon masstransitGetOff;
    private MasstransitGetOnBalloon masstransitGetOn;
    private MasstransitStopBalloon masstransitStop;
    private MasstransitTransferBalloon masstransitTransfer;
    private RouteSummaryBalloon routeSummary;

    public static Balloon fromManoeuvre(ManoeuvreBalloon manoeuvreBalloon) {
        if (manoeuvreBalloon == null) {
            ny61.g("Variant value \"manoeuvre\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.manoeuvre = manoeuvreBalloon;
        return balloon;
    }

    public static Balloon fromMasstransitGetOff(MasstransitGetOffBalloon masstransitGetOffBalloon) {
        if (masstransitGetOffBalloon == null) {
            ny61.g("Variant value \"masstransitGetOff\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.masstransitGetOff = masstransitGetOffBalloon;
        return balloon;
    }

    public static Balloon fromMasstransitGetOn(MasstransitGetOnBalloon masstransitGetOnBalloon) {
        if (masstransitGetOnBalloon == null) {
            ny61.g("Variant value \"masstransitGetOn\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.masstransitGetOn = masstransitGetOnBalloon;
        return balloon;
    }

    public static Balloon fromMasstransitStop(MasstransitStopBalloon masstransitStopBalloon) {
        if (masstransitStopBalloon == null) {
            ny61.g("Variant value \"masstransitStop\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.masstransitStop = masstransitStopBalloon;
        return balloon;
    }

    public static Balloon fromMasstransitTransfer(MasstransitTransferBalloon masstransitTransferBalloon) {
        if (masstransitTransferBalloon == null) {
            ny61.g("Variant value \"masstransitTransfer\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.masstransitTransfer = masstransitTransferBalloon;
        return balloon;
    }

    public static Balloon fromRouteSummary(RouteSummaryBalloon routeSummaryBalloon) {
        if (routeSummaryBalloon == null) {
            ny61.g("Variant value \"routeSummary\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.routeSummary = routeSummaryBalloon;
        return balloon;
    }

    public ManoeuvreBalloon getManoeuvre() {
        return this.manoeuvre;
    }

    public MasstransitGetOffBalloon getMasstransitGetOff() {
        return this.masstransitGetOff;
    }

    public MasstransitGetOnBalloon getMasstransitGetOn() {
        return this.masstransitGetOn;
    }

    public MasstransitStopBalloon getMasstransitStop() {
        return this.masstransitStop;
    }

    public MasstransitTransferBalloon getMasstransitTransfer() {
        return this.masstransitTransfer;
    }

    public RouteSummaryBalloon getRouteSummary() {
        return this.routeSummary;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.manoeuvre = (ManoeuvreBalloon) archive.add((Archive) this.manoeuvre, true, (Class<Archive>) ManoeuvreBalloon.class);
        this.routeSummary = (RouteSummaryBalloon) archive.add((Archive) this.routeSummary, true, (Class<Archive>) RouteSummaryBalloon.class);
        this.masstransitStop = (MasstransitStopBalloon) archive.add((Archive) this.masstransitStop, true, (Class<Archive>) MasstransitStopBalloon.class);
        this.masstransitGetOn = (MasstransitGetOnBalloon) archive.add((Archive) this.masstransitGetOn, true, (Class<Archive>) MasstransitGetOnBalloon.class);
        this.masstransitGetOff = (MasstransitGetOffBalloon) archive.add((Archive) this.masstransitGetOff, true, (Class<Archive>) MasstransitGetOffBalloon.class);
        this.masstransitTransfer = (MasstransitTransferBalloon) archive.add((Archive) this.masstransitTransfer, true, (Class<Archive>) MasstransitTransferBalloon.class);
    }
}

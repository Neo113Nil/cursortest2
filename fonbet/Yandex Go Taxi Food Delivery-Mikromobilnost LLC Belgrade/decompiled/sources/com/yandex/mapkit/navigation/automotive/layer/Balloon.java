package com.yandex.mapkit.navigation.automotive.layer;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Balloon implements Serializable {
    private AlternativeBalloon alternative;
    private LaneSignBalloon laneSign;
    private ManoeuvreBalloon manoeuvre;
    private ManoeuvreWithLaneSignBalloon manoeuvreWithLaneSign;
    private RouteSummaryBalloon routeSummary;

    public static Balloon fromAlternative(AlternativeBalloon alternativeBalloon) {
        if (alternativeBalloon == null) {
            ny61.g("Variant value \"alternative\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.alternative = alternativeBalloon;
        return balloon;
    }

    public static Balloon fromLaneSign(LaneSignBalloon laneSignBalloon) {
        if (laneSignBalloon == null) {
            ny61.g("Variant value \"laneSign\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.laneSign = laneSignBalloon;
        return balloon;
    }

    public static Balloon fromManoeuvre(ManoeuvreBalloon manoeuvreBalloon) {
        if (manoeuvreBalloon == null) {
            ny61.g("Variant value \"manoeuvre\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.manoeuvre = manoeuvreBalloon;
        return balloon;
    }

    public static Balloon fromManoeuvreWithLaneSign(ManoeuvreWithLaneSignBalloon manoeuvreWithLaneSignBalloon) {
        if (manoeuvreWithLaneSignBalloon == null) {
            ny61.g("Variant value \"manoeuvreWithLaneSign\" cannot be null");
            return null;
        }
        Balloon balloon = new Balloon();
        balloon.manoeuvreWithLaneSign = manoeuvreWithLaneSignBalloon;
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

    public AlternativeBalloon getAlternative() {
        return this.alternative;
    }

    public LaneSignBalloon getLaneSign() {
        return this.laneSign;
    }

    public ManoeuvreBalloon getManoeuvre() {
        return this.manoeuvre;
    }

    public ManoeuvreWithLaneSignBalloon getManoeuvreWithLaneSign() {
        return this.manoeuvreWithLaneSign;
    }

    public RouteSummaryBalloon getRouteSummary() {
        return this.routeSummary;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.manoeuvre = (ManoeuvreBalloon) archive.add((Archive) this.manoeuvre, true, (Class<Archive>) ManoeuvreBalloon.class);
        this.manoeuvreWithLaneSign = (ManoeuvreWithLaneSignBalloon) archive.add((Archive) this.manoeuvreWithLaneSign, true, (Class<Archive>) ManoeuvreWithLaneSignBalloon.class);
        this.laneSign = (LaneSignBalloon) archive.add((Archive) this.laneSign, true, (Class<Archive>) LaneSignBalloon.class);
        this.routeSummary = (RouteSummaryBalloon) archive.add((Archive) this.routeSummary, true, (Class<Archive>) RouteSummaryBalloon.class);
        this.alternative = (AlternativeBalloon) archive.add((Archive) this.alternative, true, (Class<Archive>) AlternativeBalloon.class);
    }
}

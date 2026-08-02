package com.yandex.go.places.experiments.map.pin_war_v2;

import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment;
import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$GeometryEasing;
import defpackage.hdc0;
import defpackage.idc0;
import defpackage.iq31;
import defpackage.jdc0;
import defpackage.jxy0;
import defpackage.w511;
import defpackage.zm91;

/* loaded from: classes13.dex */
public final class n {
    public final jxy0 a;

    public n(jxy0 jxy0Var) {
        this.a = jxy0Var;
    }

    public static hdc0 a(PlacesPinWarV2Experiment.Animation animation) {
        PlacesPinWarV2Config$GeometryEasing placesPinWarV2Config$GeometryEasing;
        PlacesPinWarV2Config$GeometryEasing placesPinWarV2Config$GeometryEasing2 = null;
        if (animation == null) {
            return null;
        }
        Float f = animation.a;
        Double d = animation.b;
        Double d2 = animation.c;
        PlacesPinWarV2Experiment.GeometryEasing geometryEasing = animation.d;
        if (geometryEasing != null) {
            int i = m.b[geometryEasing.ordinal()];
            if (i == 1) {
                placesPinWarV2Config$GeometryEasing = PlacesPinWarV2Config$GeometryEasing.LINEAR;
            } else if (i == 2) {
                placesPinWarV2Config$GeometryEasing = PlacesPinWarV2Config$GeometryEasing.EASE_IN;
            } else if (i == 3) {
                placesPinWarV2Config$GeometryEasing = PlacesPinWarV2Config$GeometryEasing.EASE_OUT;
            } else {
                if (i != 4) {
                    w511.b();
                    return null;
                }
                placesPinWarV2Config$GeometryEasing = PlacesPinWarV2Config$GeometryEasing.EASE_IN_OUT;
            }
            placesPinWarV2Config$GeometryEasing2 = placesPinWarV2Config$GeometryEasing;
        }
        return new hdc0(f, d, d2, placesPinWarV2Config$GeometryEasing2);
    }

    public static zm91 b(PlacesPinWarV2Experiment.CameraRedrawMode cameraRedrawMode) {
        jdc0 jdc0Var = jdc0.g;
        PlacesPinWarV2Experiment.CameraRedrawMode.Mode mode = cameraRedrawMode != null ? cameraRedrawMode.a : null;
        int i = mode == null ? -1 : m.d[mode.ordinal()];
        if (i != -1 && i != 1) {
            if (i == 2) {
                return jdc0.h;
            }
            if (i != 3) {
                w511.b();
                return null;
            }
            Long l = cameraRedrawMode.b;
            if (l != null) {
                return new idc0(l.longValue());
            }
        }
        return jdc0Var;
    }

    public static iq31 c(PlacesPinWarV2Experiment.PinsParameters pinsParameters, float f, float f2) {
        Float f3;
        Float f4;
        if (pinsParameters != null && (f4 = pinsParameters.a) != null) {
            f = f4.floatValue();
        }
        if (pinsParameters != null && (f3 = pinsParameters.b) != null) {
            f2 = f3.floatValue();
        }
        return new iq31(f, f2);
    }
}

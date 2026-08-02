package com.yandex.go.taxi.summary.mobilityhub.experiment;

import defpackage.h2v;
import defpackage.hgz;
import defpackage.jbh;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.yb31;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class g {
    public final qqo a;
    public final qqo b;

    public g(rqo rqoVar) {
        HubVerticalOnSummaryExperiment.Companion.getClass();
        jbh jbhVar = (jbh) rqoVar;
        this.a = jbhVar.c(HubVerticalOnSummaryExperiment.f);
        HubV2VerticalOnSummaryExperiment.Companion.getClass();
        this.b = jbhVar.c(HubV2VerticalOnSummaryExperiment.g);
    }

    public static h2v b(HubVerticalOnSummaryExperiment hubVerticalOnSummaryExperiment) {
        yb31 yb31Var;
        hgz hgzVar = null;
        if (!hubVerticalOnSummaryExperiment.b) {
            return null;
        }
        VerticalMode verticalMode = hubVerticalOnSummaryExperiment.d;
        if (verticalMode != null) {
            WalkingRouteDto walkingRouteDto = verticalMode.c;
            if (walkingRouteDto != null) {
                if (!walkingRouteDto.a) {
                    walkingRouteDto = null;
                }
                if (walkingRouteDto != null) {
                    hgzVar = new hgz(walkingRouteDto.b);
                }
            }
            yb31Var = new yb31(verticalMode.a, verticalMode.b, hgzVar, verticalMode.d, verticalMode.e, false);
        } else {
            yb31Var = new yb31(false, 372, null, 0, false, false);
        }
        return new h2v(yb31Var);
    }

    public static h2v c(HubV2VerticalOnSummaryExperiment hubV2VerticalOnSummaryExperiment) {
        yb31 yb31Var;
        hgz hgzVar = null;
        if (!hubV2VerticalOnSummaryExperiment.b) {
            return null;
        }
        VerticalMode verticalMode = hubV2VerticalOnSummaryExperiment.d;
        if (verticalMode != null) {
            WalkingRouteDto walkingRouteDto = verticalMode.c;
            if (walkingRouteDto != null) {
                if (!walkingRouteDto.a) {
                    walkingRouteDto = null;
                }
                if (walkingRouteDto != null) {
                    hgzVar = new hgz(walkingRouteDto.b);
                }
            }
            yb31Var = new yb31(verticalMode.a, verticalMode.b, hgzVar, verticalMode.d, verticalMode.e, true);
        } else {
            yb31Var = new yb31(false, 486, null, 0, false, true);
        }
        return new h2v(yb31Var);
    }

    public final m0 a() {
        return new m0(ru.yandex.taxi.experiments.d.a(this.b), ru.yandex.taxi.experiments.d.a(this.a), new HubVerticalOnSummaryExperimentRepository$configFlow$1(this, null));
    }
}

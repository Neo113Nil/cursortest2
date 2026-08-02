package com.yandex.go.places.experiments.walkroute;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/walkroute/OrganizationWalkingRouteExperiment;", "Lw96;", "Companion", "com/yandex/go/places/experiments/walkroute/a", "$serializer", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrganizationWalkingRouteExperiment extends w96 {
    public static final a Companion = new a();
    public static final OrganizationWalkingRouteExperiment e = new OrganizationWalkingRouteExperiment(0);
    public final boolean b;
    public final double c;
    public final double d;

    public /* synthetic */ OrganizationWalkingRouteExperiment(int i, boolean z, double d, double d2) {
        this.b = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.c = 1200.0d;
        } else {
            this.c = d;
        }
        if ((i & 4) == 0) {
            this.d = 1500.0d;
        } else {
            this.d = d2;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public OrganizationWalkingRouteExperiment(int i) {
        this.b = true;
        this.c = 1200.0d;
        this.d = 1500.0d;
    }

    public OrganizationWalkingRouteExperiment() {
        this(0);
    }
}

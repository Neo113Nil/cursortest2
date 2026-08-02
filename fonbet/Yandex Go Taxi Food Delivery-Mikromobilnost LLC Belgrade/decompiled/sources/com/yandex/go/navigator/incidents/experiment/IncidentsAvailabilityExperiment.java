package com.yandex.go.navigator.incidents.experiment;

import defpackage.gsq0;
import defpackage.i2v;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.n96;
import defpackage.scc;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/incidents/experiment/IncidentsAvailabilityExperiment;", "Ln96;", "Companion", "com/yandex/go/navigator/incidents/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IncidentsAvailabilityExperiment extends n96 {
    public static final a Companion = new a();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i2v(10)), null};
    public static final IncidentsAvailabilityExperiment f = new IncidentsAvailabilityExperiment(0);
    public static final List g = scc.g(Incident.Camera, Incident.Police, Incident.Accident, Incident.Reconstruction);
    public final boolean b;
    public final jsq0 c;
    public final String d;

    public /* synthetic */ IncidentsAvailabilityExperiment(int i, jsq0 jsq0Var, String str, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? ksq0.a : jsq0Var;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public IncidentsAvailabilityExperiment() {
        this(0);
    }

    public IncidentsAvailabilityExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = jsq0Var;
        this.d = null;
    }
}

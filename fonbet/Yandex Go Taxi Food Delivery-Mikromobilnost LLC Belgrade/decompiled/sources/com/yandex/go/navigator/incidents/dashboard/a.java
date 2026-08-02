package com.yandex.go.navigator.incidents.dashboard;

import com.yandex.go.navigator.incidents.experiment.c;
import defpackage.bvf0;
import defpackage.ha2;
import defpackage.ipv;
import defpackage.zuj0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final zuj0 a;
    public final r0 b;
    public final r0 c;
    public final ha2 d;

    public a(zuj0 zuj0Var, ipv ipvVar) {
        this.a = zuj0Var;
        r0 c = bvf0.c(null);
        this.b = c;
        r0 c2 = bvf0.c(null);
        this.c = c2;
        this.d = e.n(c, new c(ipvVar.b, ipvVar), c2, new DashboardIncidentsUiStateRepository$incidentStateFlow$1(this, null));
    }
}

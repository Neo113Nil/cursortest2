package com.yandex.go.places.impl.ui.main;

import defpackage.ftj;
import defpackage.mth;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class e {
    public final ftj a;
    public final com.yandex.go.places.experiments.map.map_as_main_places.b b;
    public final tpr c;

    public e(tt2 tt2Var, ftj ftjVar, com.yandex.go.places.experiments.map.map_as_main_places.b bVar) {
        this.a = ftjVar;
        this.b = bVar;
        tpr t = kotlinx.coroutines.flow.e.t(new m0(new mth(ftjVar.b, 6), ftjVar.d, new DiscoveryMainUiStateInteractor$uiStateFlow$1(this, null)));
        tt2Var.getClass();
        this.c = kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}

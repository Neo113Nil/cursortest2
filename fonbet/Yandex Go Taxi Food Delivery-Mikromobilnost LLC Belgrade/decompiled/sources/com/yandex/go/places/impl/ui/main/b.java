package com.yandex.go.places.impl.ui.main;

import com.yandex.go.places.models.ui.DiscoveryMainTab$TabType;
import com.yandex.go.places.models.ui.PlacesNativeScreenTabName;
import defpackage.c9c0;
import defpackage.h55;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.itj;
import defpackage.jl40;
import defpackage.k6c0;
import defpackage.m950;
import defpackage.pep0;
import defpackage.tje;
import defpackage.tsj;
import defpackage.vpr;
import defpackage.vsj;
import defpackage.w511;
import defpackage.xx70;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ tsj a;
    public final /* synthetic */ d b;

    public b(tsj tsjVar, d dVar) {
        this.a = tsjVar;
        this.b = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        itj itjVar = (itj) obj;
        this.a.render(itjVar);
        d dVar = this.b;
        dVar.getClass();
        i3y i3yVar = dVar.n0;
        m950 m950Var = dVar.U;
        DiscoveryMainTab$TabType discoveryMainTab$TabType = itjVar.a;
        String str = itjVar.b;
        int i = vsj.a[discoveryMainTab$TabType.ordinal()];
        zy11 zy11Var = zy11.a;
        if (i == 1) {
            ((h55) m950Var).i();
            ((k6c0) i3yVar.getValue()).i();
            tje.N(dVar.Jg(), null, null, new DiscoveryMainPresenter$openFlexScreen$1(dVar, str, null), 3);
            return zy11Var;
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        c9c0 c9c0Var = dVar.q0;
        if (c9c0Var != null) {
            c9c0Var.i();
        }
        if (jl40.l(str, PlacesNativeScreenTabName.MAP.getId())) {
            tje.N(dVar.Jg(), null, null, new DiscoveryMainPresenter$openNativeScreen$1(dVar, null), 3);
            ((h55) m950Var).i();
            ((pep0) dVar.V).f(new xx70(4, (k6c0) i3yVar.getValue(), new DiscoveryMainPresenter$openNativeScreen$2(0, dVar, d.class, "backToFirstTabOrClose", "backToFirstTabOrClose()V", 0)), zy11Var, hxx.a);
        }
        return zy11Var;
    }
}

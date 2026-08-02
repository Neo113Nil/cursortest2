package com.yandex.fintechsdk.features.bdui.internal.presentation.fragment;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import defpackage.jl40;
import defpackage.nh5;
import defpackage.ug5;
import defpackage.xg5;

/* loaded from: classes12.dex */
public final class b implements xg5 {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public static final boolean a(b bVar, ug5 ug5Var) {
        c cVar = bVar.a;
        FlexAdapter flexAdapter = cVar.N;
        ug5 ug5Var2 = cVar.A;
        nh5 currentRouteHandler = flexAdapter != null ? flexAdapter.getCurrentRouteHandler() : null;
        return jl40.l(ug5Var, ug5Var2) && jl40.l(ug5Var2, currentRouteHandler != null ? currentRouteHandler.getCurrentFragmentQuery() : null);
    }

    public final void b(ug5 ug5Var) {
        c cVar = this.a;
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(cVar, new BduiViewModel$createEventHandler$1$hideShimmersIfNeeded$1(ug5Var, this, cVar, null));
    }

    public final void c(ug5 ug5Var) {
        c cVar = this.a;
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(cVar, new BduiViewModel$createEventHandler$1$hideShimmersIfNeeded$1(ug5Var, this, cVar, null));
    }

    public final void d(ug5 ug5Var) {
        c cVar = this.a;
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(cVar, new BduiViewModel$createEventHandler$1$hideShimmersIfNeeded$1(ug5Var, this, cVar, null));
    }

    public final void e(ug5 ug5Var) {
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(this.a, new BduiViewModel$createEventHandler$1$showShimmersIfNeeded$1(ug5Var, this, null));
    }
}

package com.yandex.go.superapp.discovery.map.impl.ui.main;

import defpackage.fwv0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ fwv0 a;

    public c(fwv0 fwv0Var) {
        this.a = fwv0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        fwv0 fwv0Var = this.a;
        tje.N(fwv0Var.Jg(), null, null, new SuperAppDiscoveryMapPresenter$getMapCategoryFilters$1(fwv0Var, null), 3);
        kotlinx.coroutines.channels.a aVar = fwv0Var.M.g;
        zy11 zy11Var = zy11.a;
        aVar.d(zy11Var);
        return zy11Var;
    }
}

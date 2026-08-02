package com.yandex.go.profile.domain.divkit.variables;

import defpackage.gw00;
import defpackage.h3y;
import defpackage.k3h0;
import defpackage.nwl;
import defpackage.tje;
import defpackage.tse;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class f extends nwl {
    public static final Map c = gw00.e(new Pair("superapp.profile.verification_icon_preview", Integer.valueOf(k3h0.ic_profile_verified_checkmark)));
    public final h3y b;

    public f(h3y h3yVar, h3y h3yVar2) {
        super(h3yVar);
        this.b = h3yVar2;
    }

    @Override // defpackage.nwl
    public final void a(tse tseVar) {
        tje.N(tseVar, null, null, new UiVariableHandler$init$1(this, null), 3);
    }
}

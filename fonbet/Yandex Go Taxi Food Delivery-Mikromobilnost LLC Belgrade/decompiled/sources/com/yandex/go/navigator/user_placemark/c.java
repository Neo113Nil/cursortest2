package com.yandex.go.navigator.user_placemark;

import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.jbh;
import defpackage.rqo;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes12.dex */
public final class c {
    public final cne0 a;
    public final q b;
    public final r0 c;

    public c(rqo rqoVar, dne0 dne0Var) {
        cne0 a = dne0Var.a("com.yandex.go.navigator.user_placemark");
        this.a = a;
        UserArrowToggleExperiment.Companion.getClass();
        this.b = ((jbh) rqoVar).d(UserArrowToggleExperiment.h);
        this.c = bvf0.c(Boolean.valueOf(a.g("USER_PLACEMARK_TOGGLE", true)));
    }

    public final m0 a() {
        return new m0(d.b(this.b), this.c, new UserPlacemarkSettingsRepository$userPlacemarkFlow$1(3, null));
    }
}

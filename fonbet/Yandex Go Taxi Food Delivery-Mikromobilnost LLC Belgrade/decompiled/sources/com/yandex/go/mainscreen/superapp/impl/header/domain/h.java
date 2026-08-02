package com.yandex.go.mainscreen.superapp.impl.header.domain;

import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppConfigMenuExperiment;
import defpackage.ak10;
import defpackage.en10;
import defpackage.fn10;
import defpackage.g92;
import defpackage.m2h0;
import defpackage.tpr;
import defpackage.usv0;
import defpackage.w511;
import defpackage.yj10;
import defpackage.zj10;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes.dex */
public final class h implements en10 {
    public static final ak10 e;
    public static final yj10 f;
    public final com.yandex.go.repositories.e a;
    public final ru.yandex.taxi.widget.utils.e b;
    public final ru.yandex.taxi.am.g c;
    public final usv0 d;

    static {
        zj10 zj10Var = new zj10();
        e = new ak10(m2h0.ic_hamburger, zj10Var);
        f = new yj10(m2h0.ic_avatar_placeholder, null, zj10Var, m2h0.ic_avatar_foreground);
    }

    public h(com.yandex.go.repositories.e eVar, ru.yandex.taxi.widget.utils.e eVar2, ru.yandex.taxi.am.g gVar, usv0 usv0Var) {
        this.a = eVar;
        this.b = eVar2;
        this.c = gVar;
        this.d = usv0Var;
    }

    public final e a() {
        return new e(com.yandex.go.coroutines.b.d(new m0(this.c.a(), this.a.f, new MenuStateInteractorImpl$avatarImage$1(3, null)), new MenuStateInteractorImpl$avatarImage$$inlined$start$1(2, null)), this);
    }

    public final tpr b() {
        int i = fn10.a[((SuperAppConfigMenuExperiment) this.d.b.getValue()).b.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return new g92(i2, e);
                }
                w511.b();
                return null;
            }
        }
        return kotlinx.coroutines.flow.e.t(new g(a()));
    }
}

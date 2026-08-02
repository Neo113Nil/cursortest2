package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.bff;
import defpackage.hxx;
import defpackage.jjc0;
import defpackage.jl40;
import defpackage.k1w0;
import defpackage.kbs;
import defpackage.kjc0;
import defpackage.lg21;
import defpackage.ljc0;
import defpackage.lwz0;
import defpackage.m950;
import defpackage.mg21;
import defpackage.mjc0;
import defpackage.mwz0;
import defpackage.njc0;
import defpackage.nwz0;
import defpackage.oep0;
import defpackage.ojc0;
import defpackage.owz0;
import defpackage.pep0;
import defpackage.pjc0;
import defpackage.pwz0;
import defpackage.ru8;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.x8z;
import defpackage.y50;
import defpackage.yvf0;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes.dex */
public final class a {
    public final tse a;
    public final y50 b;
    public final k1w0 c;
    public final x8z d;
    public final ru.yandex.taxi.systemrequeirements.location.n e;
    public final oep0 f;
    public final yvf0 g;
    public final lg21 h;

    public a(tse tseVar, y50 y50Var, k1w0 k1w0Var, x8z x8zVar, ru.yandex.taxi.systemrequeirements.location.n nVar, oep0 oep0Var, yvf0 yvf0Var, lg21 lg21Var) {
        this.a = tseVar;
        this.b = y50Var;
        this.c = k1w0Var;
        this.d = x8zVar;
        this.e = nVar;
        this.f = oep0Var;
        this.g = yvf0Var;
        this.h = lg21Var;
    }

    public final void a(pjc0 pjc0Var, pwz0 pwz0Var) {
        String str;
        String str2;
        boolean z = pjc0Var instanceof ljc0;
        if (!z) {
            k1w0 k1w0Var = this.c;
            k1w0Var.getClass();
            if (pwz0Var instanceof owz0) {
                str = "SuperappMain.UnavailableLocationWidget.Tapped";
            } else if (jl40.l(pwz0Var, nwz0.a) || jl40.l(pwz0Var, mwz0.a)) {
                str = "SuperappMain.UnavailableLocationServiceWidget.Tapped";
            } else if (!jl40.l(pwz0Var, lwz0.a)) {
                w511.b();
                return;
            }
            MapBuilder mapBuilder = new MapBuilder();
            boolean z2 = pjc0Var instanceof jjc0;
            if (z2 || (pjc0Var instanceof kjc0)) {
                str2 = "change_address";
            } else if (pjc0Var instanceof ojc0) {
                str2 = "EnableLocationSettingsClicked";
            } else if (pjc0Var instanceof mjc0) {
                str2 = "openSettings";
            } else {
                if (!(pjc0Var instanceof njc0)) {
                    if (z) {
                        kbs.f(pjc0Var, "Log event isn't possible for action with type ");
                        return;
                    } else {
                        w511.b();
                        return;
                    }
                }
                str2 = "url_action";
            }
            mapBuilder.put("button_name", str2);
            if (z2) {
            } else if (pjc0Var instanceof kjc0) {
            } else if (pjc0Var instanceof ojc0) {
            } else if (pjc0Var instanceof mjc0) {
            } else {
                if (!(pjc0Var instanceof njc0)) {
                    if (z) {
                        kbs.f(pjc0Var, "Param isn't supported for action with type ");
                        return;
                    } else {
                        w511.b();
                        return;
                    }
                }
            }
            MapBuilder j = mapBuilder.j();
            ru.yandex.taxi.analytics.i d = ((ru.yandex.taxi.analytics.j) k1w0Var.a).d(str);
            d.a.putAll(j);
            d.m();
        }
        if ((pjc0Var instanceof jjc0) || (pjc0Var instanceof kjc0)) {
            ((pep0) this.f).f((m950) this.g.get(), bff.a, hxx.a);
            return;
        }
        boolean z3 = pjc0Var instanceof ojc0;
        tse tseVar = this.a;
        if (z3) {
            tje.N(tseVar, new ru8(), null, new ClarifyAddressClickActionDelegate$turnOnLocationServiceAction$1(this, null), 2);
            return;
        }
        if (pjc0Var instanceof mjc0) {
            tje.N(tseVar, null, null, new ClarifyAddressClickActionDelegate$openSettingsAction$1(this, null), 3);
            return;
        }
        if (pjc0Var instanceof njc0) {
            ((mg21) this.h).c(((njc0) pjc0Var).a());
        } else {
            if (z) {
                return;
            }
            w511.b();
        }
    }
}

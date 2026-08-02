package com.yandex.go.superapp.discovery.map.impl.ui.search;

import com.yandex.go.superapp.discovery.map.impl.ui.model.SuperAppDiscoveryMapSearchOpenedEntity;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.e7c0;
import defpackage.en30;
import defpackage.in80;
import defpackage.ixv0;
import defpackage.jhu0;
import defpackage.kxv0;
import defpackage.lwv0;
import defpackage.mwv0;
import defpackage.n3h;
import defpackage.nwv0;
import defpackage.o010;
import defpackage.owv0;
import defpackage.p010;
import defpackage.pwv0;
import defpackage.pwy0;
import defpackage.qwv0;
import defpackage.rvv0;
import defpackage.rwv0;
import defpackage.stv0;
import defpackage.swv0;
import defpackage.t6c0;
import defpackage.tje;
import defpackage.v6c0;
import defpackage.w511;
import defpackage.w6c0;
import defpackage.ygs;
import defpackage.zuj0;
import defpackage.zzs;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes14.dex */
public final class f extends ad5 {
    public final zuj0 A;
    public final pwy0 B;
    public final com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.c C;
    public final a D;
    public final rvv0 E;
    public final stv0 F;
    public final en30 G;
    public final ah00 H;
    public final jhu0 x;
    public final String y;
    public final ru.yandex.taxi.design.utils.b z;

    public f(jhu0 jhu0Var, ru.yandex.taxi.design.utils.b bVar, zuj0 zuj0Var, pwy0 pwy0Var, com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.c cVar, a aVar, rvv0 rvv0Var, stv0 stv0Var, en30 en30Var, ah00 ah00Var) {
        super(ixv0.class);
        this.x = jhu0Var;
        this.y = "";
        this.z = bVar;
        this.A = zuj0Var;
        this.B = pwy0Var;
        this.C = cVar;
        this.D = aVar;
        this.E = rvv0Var;
        this.F = stv0Var;
        this.G = en30Var;
        this.H = ah00Var;
    }

    public final void Kg(swv0 swv0Var) {
        boolean z = swv0Var instanceof mwv0;
        jhu0 jhu0Var = this.x;
        if (z) {
            ((ixv0) Dg()).hideKeyboard();
            jhu0Var.getClass();
            jhu0Var.j(new v6c0(((mwv0) swv0Var).a, null));
            ((ixv0) Dg()).hideKeyboard();
            return;
        }
        if (swv0Var instanceof nwv0) {
            ((ixv0) Dg()).hideKeyboard();
            nwv0 nwv0Var = (nwv0) swv0Var;
            jhu0Var.getClass();
            FormattedText formattedText = nwv0Var.c;
            String str = nwv0Var.a;
            jhu0Var.j(new w6c0(formattedText != null ? new in80(formattedText) : null, nwv0Var.b, str));
            ((ixv0) Dg()).hideKeyboard();
            return;
        }
        if (swv0Var instanceof owv0) {
            ((ixv0) Dg()).hideKeyboard();
            String str2 = ((owv0) swv0Var).a;
            jhu0Var.getClass();
            jhu0Var.i(new o010(str2));
            tje.N(Jg(), null, null, new SuperAppDiscoveryMapSearchPresenter$updateRouteBoundingBox$1(this, str2, null), 3);
            ((ixv0) Dg()).hideKeyboard();
            return;
        }
        if (swv0Var instanceof pwv0) {
            ((ixv0) Dg()).hideKeyboard();
            pwv0 pwv0Var = (pwv0) swv0Var;
            jhu0Var.getClass();
            jhu0Var.i(new p010(pwv0Var.b, pwv0Var.a, pwv0Var.c));
            ((ixv0) Dg()).hideKeyboard();
            return;
        }
        if (swv0Var instanceof lwv0) {
            ((ixv0) Dg()).hideKeyboard();
            ygs ygsVar = (ygs) jhu0Var.a;
            ((kxv0) ygsVar.O).a = SuperAppDiscoveryMapSearchOpenedEntity.DEEPLINK;
            ((n3h) ygsVar.P).a(((lwv0) swv0Var).a, DeeplinkSource.PLACES);
            ((e7c0) ygsVar.J).b(t6c0.a);
            ((ixv0) Dg()).hideKeyboard();
            return;
        }
        if (swv0Var instanceof qwv0) {
            zzs zzsVar = ((qwv0) swv0Var).a;
            if (zzsVar != null) {
                tje.N(Jg(), null, null, new SuperAppDiscoveryMapSearchPresenter$handleAction$6$1(this, zzsVar, swv0Var, null), 3);
                return;
            }
            return;
        }
        if (swv0Var instanceof rwv0) {
            ((ixv0) Dg()).y(((rwv0) swv0Var).a, true);
        } else {
            if (swv0Var == null) {
                return;
            }
            w511.b();
        }
    }
}

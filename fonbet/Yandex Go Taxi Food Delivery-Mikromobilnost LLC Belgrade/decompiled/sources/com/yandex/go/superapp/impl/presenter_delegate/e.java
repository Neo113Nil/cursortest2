package com.yandex.go.superapp.impl.presenter_delegate;

import com.yandex.go.external_service.view.ExternalServiceModalView;
import com.yandex.go.superapp.api.loading_tracker.EatsKitOpenType;
import com.yandex.go.superapp.model.Action;
import defpackage.d2p;
import defpackage.fsv0;
import defpackage.g1p;
import defpackage.h1p;
import defpackage.ham;
import defpackage.rvq0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.y3p;
import java.util.Map;

/* loaded from: classes12.dex */
public final class e {
    public final fsv0 a;
    public final y3p b;
    public final ru.yandex.taxi.eatskit.c c;
    public final h1p d;
    public final d e;
    public final g1p f;
    public final rvq0 g;

    public e(fsv0 fsv0Var, y3p y3pVar, ru.yandex.taxi.eatskit.c cVar, h1p h1pVar, d dVar, g1p g1pVar, rvq0 rvq0Var) {
        this.a = fsv0Var;
        this.b = y3pVar;
        this.c = cVar;
        this.d = h1pVar;
        this.e = dVar;
        this.f = g1pVar;
        this.g = rvq0Var;
    }

    public final void a(d2p d2pVar) {
        ham hamVar;
        int i;
        g1p g1pVar = this.f;
        tse tseVar = g1pVar.c;
        y3p y3pVar = this.b;
        Action action = y3pVar.a.a;
        if (y3pVar.c) {
            this.c.v = this.e.a();
            Float f = (Float) ((Map) this.a.a.getValue()).get(this.d.getValue());
            if (f != null) {
                float floatValue = f.floatValue();
                ExternalServiceModalView externalServiceModalView = d2pVar.a;
                externalServiceModalView.dismissZoneHeightPx = (int) tje.x(externalServiceModalView.getContext(), floatValue);
                hamVar = externalServiceModalView.draggableHeaderBehaviour;
                i = externalServiceModalView.dismissZoneHeightPx;
                hamVar.a = i;
            }
            g1pVar.d.getClass();
            g1pVar.e = tje.N(tseVar, uyj.a, null, new ExternalServiceCommonHeadersDelegateImpl$getCommonHeaders$1(g1pVar, d2pVar, null), 2);
            this.g.c.c = EatsKitOpenType.INITIAL;
            if (action != Action.SHOW_RELATIVE_PATH && action != Action.FORCE_RELATIVE_PATH) {
                tje.N(tseVar, null, null, new ExternalServiceCommonHeadersDelegateImpl$reloadWithHeaders$1(g1pVar, null), 3);
            }
        }
        y3pVar.c = false;
    }
}

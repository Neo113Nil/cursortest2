package com.yandex.go.places.organization.card.impl.ui.card.map.overlay;

import com.yandex.go.places.map.domain.entities.PinLayer;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.places.organization.card.impl.domain.entities.card.FocusPinMode;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.ch00;
import defpackage.ehq0;
import defpackage.gh00;
import defpackage.iaq0;
import defpackage.kn00;
import defpackage.l050;
import defpackage.pfq0;
import defpackage.q3v;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tls;
import defpackage.u55;
import defpackage.ve80;
import defpackage.wac0;
import defpackage.yac0;
import defpackage.ze80;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class c extends ad5 {
    public final u55 A;
    public final ze80 B;
    public final boolean C;
    public final yac0 D;
    public final q3v E;
    public final ah00 F;
    public final iaq0 G;
    public final boolean H;
    public final LinkedHashMap I;
    public boolean J;
    public Point K;
    public boolean L;
    public final ti80 x;
    public final String y;
    public final FocusPinMode z;

    public c(ti80 ti80Var, String str, FocusPinMode focusPinMode, u55 u55Var, ve80 ve80Var, boolean z, yac0 yac0Var, q3v q3vVar, ah00 ah00Var, iaq0 iaq0Var, boolean z2) {
        super(l050.class);
        this.x = ti80Var;
        this.y = str;
        this.z = focusPinMode;
        this.A = u55Var;
        this.B = ve80Var;
        this.C = z;
        this.D = yac0Var;
        this.E = q3vVar;
        this.F = ah00Var;
        this.G = iaq0Var;
        this.H = z2;
        this.I = new LinkedHashMap();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        super.Bg(l050Var);
        tje.N(Jg(), null, null, new OrganizationCardMapPresenter$attachView$$inlined$safeCollectIn$1(this.A.b(this.x), null, this), 3);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        boolean z = this.H;
        LinkedHashMap linkedHashMap = this.I;
        if (z) {
            ((pfq0) this.G).a(null);
        } else {
            boolean isEmpty = linkedHashMap.isEmpty();
            u55 u55Var = this.A;
            if (isEmpty) {
                String str = this.y;
                if (str != null) {
                    u55Var.getClass();
                    Iterator<E> it = PinLayer.a().iterator();
                    while (it.hasNext()) {
                        u55Var.c.e((PinLayer) it.next()).f(str);
                    }
                }
            } else {
                for (ehq0 ehq0Var : linkedHashMap.values()) {
                    boolean z2 = ehq0Var.d;
                    kn00 kn00Var = ehq0Var.b;
                    PinLayer pinLayer = ehq0Var.c;
                    if (z2) {
                        u55Var.c.e(pinLayer).p(kn00Var);
                    } else {
                        u55Var.c.e(pinLayer).f(kn00Var.getId());
                    }
                }
            }
        }
        linkedHashMap.clear();
    }

    public final void Kg(ehq0 ehq0Var, boolean z, tls tlsVar) {
        boolean z2 = this.K == null;
        Point geometry = ehq0Var.b.getGeometry();
        ah00 ah00Var = this.F;
        q3v q3vVar = this.E;
        if (!z || z2) {
            wac0 a = this.D.a(PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATION_CARD);
            ((com.yandex.go.places.impl.domain.interactors.common.a) q3vVar).b(geometry, a != null ? a.c : 17.0f);
        } else {
            float j = ((gh00) ah00Var).j();
            com.yandex.go.places.impl.domain.interactors.common.a aVar = (com.yandex.go.places.impl.domain.interactors.common.a) q3vVar;
            aVar.getClass();
            ((gh00) aVar.a).g.k(new CameraPosition(geometry, j, 0.0f, 0.0f), 500.0f, Animation.Type.SMOOTH, new ch00(1, tlsVar));
        }
        this.K = geometry;
        if (z2) {
            tje.N(Jg(), null, null, new OrganizationCardMapPresenter$updateCurrentBBox$1(((gh00) ah00Var).e.a(), this, null), 3);
        }
    }
}

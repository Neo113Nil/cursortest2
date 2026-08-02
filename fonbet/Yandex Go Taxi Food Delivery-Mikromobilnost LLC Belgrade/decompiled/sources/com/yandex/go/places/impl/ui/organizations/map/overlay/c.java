package com.yandex.go.places.impl.ui.organizations.map.overlay;

import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.go80;
import defpackage.il00;
import defpackage.l050;
import defpackage.tje;
import defpackage.ub60;
import defpackage.yac0;

/* loaded from: classes13.dex */
public final class c extends ad5 {
    public final go80 A;
    public final h B;
    public final yac0 C;
    public final ah00 D;
    public final il00 E;
    public boolean F;
    public final boolean x;
    public final PlacesMapConfig$PlacesMapScreenName y;
    public final com.yandex.go.places.impl.domain.interactors.common.a z;

    public c(boolean z, PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName, com.yandex.go.places.impl.domain.interactors.common.a aVar, go80 go80Var, h hVar, yac0 yac0Var, ah00 ah00Var) {
        super(l050.class);
        this.x = z;
        this.y = placesMapConfig$PlacesMapScreenName;
        this.z = aVar;
        this.A = go80Var;
        this.B = hVar;
        this.C = yac0Var;
        this.D = ah00Var;
        this.E = new il00();
        this.F = z;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        super.Bg(l050Var);
        if (this.x) {
            tje.N(Jg(), null, null, new OrganizationsMapPresenter$attachView$1(this, null), 3);
        } else {
            ((gh00) this.D).q(new ub60(25, this));
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.B.b();
    }
}

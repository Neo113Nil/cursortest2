package com.yandex.go.places.impl.ui.main.map.my_places;

import defpackage.ah00;
import defpackage.gh00;
import defpackage.r8;
import defpackage.t050;
import defpackage.tje;
import defpackage.xm00;
import defpackage.y050;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class b extends r8 {
    public final y050 c;
    public xm00 w;
    public final LinkedHashMap x;

    public b(y050 y050Var, ah00 ah00Var) {
        super(5, ah00Var);
        this.c = y050Var;
        this.x = new LinkedHashMap();
    }

    public final void attach() {
        if (this.w == null) {
            this.w = ((gh00) ((ah00) this.b)).i.p();
        }
        t050 t050Var = new t050(this);
        y050 y050Var = this.c;
        y050Var.Bg(t050Var);
        tje.N(y050Var.Jg(), null, null, new MyPlacesMapPresenter$loadMyPlaces$1(y050Var, null), 3);
        tje.N(y050Var.Jg(), null, null, new MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(y050Var.D.a()), null, y050Var, t050Var), 3);
        tje.N(y050Var.Jg(), null, null, new MyPlacesMapPresenter$attachView$$inlined$safeCollectIn$2(y050Var.B.b, null, y050Var, t050Var), 3);
    }
}

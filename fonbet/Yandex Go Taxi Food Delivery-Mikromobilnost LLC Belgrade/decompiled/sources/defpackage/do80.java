package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.ui.organizations.map.overlay.a;
import com.yandex.go.places.impl.ui.organizations.map.overlay.c;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.map.ui.overlay.b;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import defpackage.do80;
import defpackage.evu0;
import defpackage.hl00;
import defpackage.il00;
import defpackage.qi80;
import defpackage.tje;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes13.dex */
public final class do80 extends b {
    public final PlacesMapConfig$PlacesMapScreenName A;
    public final a3v B;
    public final fo80 C;
    public c D;
    public final i3y E;
    public final i3y F;
    public final i3y G;
    public final yh00 H;
    public final a I;
    public final com.yandex.go.places.impl.ui.organizations.map.overlay.b J;
    public final dew K;
    public final Context y;
    public final boolean z;

    /* JADX WARN: Type inference failed for: r1v8, types: [com.yandex.go.places.impl.ui.organizations.map.overlay.a] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.yandex.go.places.impl.ui.organizations.map.overlay.b] */
    public do80(Context context, boolean z, PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName, a3v a3vVar, fo80 fo80Var, h3y h3yVar, com.yandex.go.places.map.ui.overlay.a aVar, ah00 ah00Var) {
        super(ah00Var, h3yVar, aVar);
        this.y = context;
        this.z = z;
        this.A = placesMapConfig$PlacesMapScreenName;
        this.B = a3vVar;
        this.C = fo80Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: co80
            public final /* synthetic */ do80 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i2 = i;
                do80 do80Var = this.b;
                switch (i2) {
                    case 0:
                        r = tje.r(mrg0.go_design_m_space, do80Var.y);
                        break;
                    case 1:
                        r = tje.r(mrg0.go_design_l_space, do80Var.y);
                        break;
                    default:
                        r = tje.r(dug0.discovery_organizations_map_focus_rect_bottom_margin, do80Var.y);
                        break;
                }
                return Integer.valueOf(r);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.F = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: co80
            public final /* synthetic */ do80 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i2;
                do80 do80Var = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(mrg0.go_design_m_space, do80Var.y);
                        break;
                    case 1:
                        r = tje.r(mrg0.go_design_l_space, do80Var.y);
                        break;
                    default:
                        r = tje.r(dug0.discovery_organizations_map_focus_rect_bottom_margin, do80Var.y);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i3 = 2;
        this.G = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: co80
            public final /* synthetic */ do80 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i3;
                do80 do80Var = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(mrg0.go_design_m_space, do80Var.y);
                        break;
                    case 1:
                        r = tje.r(mrg0.go_design_l_space, do80Var.y);
                        break;
                    default:
                        r = tje.r(dug0.discovery_organizations_map_focus_rect_bottom_margin, do80Var.y);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        this.H = new yh00(3, this, ah00Var);
        this.I = new yzv() { // from class: com.yandex.go.places.impl.ui.organizations.map.overlay.a
            @Override // defpackage.zzv
            public final void d(Point point) {
                c cVar = do80.this.D;
                if (cVar != null) {
                    tje.N(cVar.Jg(), null, null, new OrganizationsMapPresenter$onMapTapped$1(cVar, null), 3);
                }
            }
        };
        this.J = new GeoObjectTapListener() { // from class: com.yandex.go.places.impl.ui.organizations.map.overlay.b
            @Override // com.yandex.mapkit.layers.GeoObjectTapListener
            public final boolean onObjectTap(GeoObjectTapEvent geoObjectTapEvent) {
                do80 do80Var = do80.this;
                c cVar = do80Var.D;
                if (cVar != null) {
                    cVar.E.getClass();
                    hl00 hl00Var = (hl00) il00.b(geoObjectTapEvent).orElse(null);
                    String str = hl00Var != null ? hl00Var.a : null;
                    if (((str == null || evu0.J(str)) ? null : new qi80(str, null)) != null) {
                        return false;
                    }
                }
                c cVar2 = do80Var.D;
                if (cVar2 == null) {
                    return false;
                }
                tje.N(cVar2.Jg(), null, null, new OrganizationsMapPresenter$onMapTapped$1(cVar2, null), 3);
                return false;
            }
        };
        this.K = new dew();
    }

    @Override // com.yandex.go.places.map.ui.overlay.b
    public final void Ig() {
        ki9 ki9Var = this.C.a;
        c cVar = new c(this.z, this.A, (com.yandex.go.places.impl.domain.interactors.common.a) ki9Var.a.get(), (go80) ki9Var.b.get(), (h) ki9Var.c.get(), (yac0) ki9Var.d.get(), (ah00) ki9Var.e.get());
        cVar.Bg(this.K);
        this.D = cVar;
        i3y i3yVar = this.E;
        this.B.q3(this, ((Number) i3yVar.getValue()).intValue(), ((Number) this.F.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue(), ((Number) this.G.getValue()).intValue());
        ah00 ah00Var = (ah00) this.b;
        ub60 ub60Var = new ub60(24, this);
        gh00 gh00Var = (gh00) ah00Var;
        gh00Var.q(ub60Var);
        gh00Var.d(this.I);
        gh00Var.c(this.J);
    }

    public final void Jg() {
        gh00 gh00Var = (gh00) ((ah00) this.b);
        gh00Var.u(this.H);
        this.B.Lc(this, null);
        c cVar = this.D;
        if (cVar != null) {
            cVar.Cg();
        }
        gh00Var.t(this.I);
        gh00Var.s(this.J);
    }
}

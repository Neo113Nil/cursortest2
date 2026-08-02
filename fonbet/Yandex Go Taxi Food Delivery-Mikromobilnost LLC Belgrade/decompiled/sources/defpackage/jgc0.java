package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.ui.common.map.location.PlacesUserLocationOverlay$observeSourceAddress$$inlined$safeCollectIn$1;
import com.yandex.go.places.impl.ui.common.map.location.a;
import com.yandex.mapkit.ScreenPoint;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes14.dex */
public final class jgc0 extends bhf implements igc0, r3v {
    public final lgc0 A;
    public final a B;
    public final tt2 C;
    public final pwy0 D;
    public final i E;
    public final b01 F;
    public final xm00 G;
    public ike H;
    public boolean I;
    public final Context z;

    public jgc0(Context context, lgc0 lgc0Var, a aVar, tt2 tt2Var, pwy0 pwy0Var, i iVar, ah00 ah00Var, no21 no21Var) {
        super(ah00Var, no21Var);
        this.z = context;
        this.A = lgc0Var;
        this.B = aVar;
        this.C = tt2Var;
        this.D = pwy0Var;
        this.E = iVar;
        this.F = new b01(26, this);
        this.G = new xm00();
        this.I = true;
    }

    @Override // defpackage.bhf
    public final ugf Jg() {
        ike ikeVar = this.H;
        if (ikeVar == null) {
            this.C.getClass();
            sjh sjhVar = uyj.a;
            ikeVar = bvf0.a(o400.a);
            this.H = ikeVar;
        }
        return new mgc0(this.z, this.G, ikeVar, this.B, this.D, 0);
    }

    @Override // defpackage.bhf
    public final ScreenPoint Kg() {
        es00 es00Var = ((gh00) ((ah00) this.b)).e;
        return es00Var.e(ru.yandex.taxi.map.utils.a.F(es00Var.b()));
    }

    @Override // defpackage.uo21
    public final void attach() {
        this.G.b(((gh00) ((ah00) this.b)).i);
        this.A.Bg(this);
        b2k s = e.s(this.E.j(RoutePointType.POINT_A, true), new g990(14));
        ike ikeVar = this.H;
        if (ikeVar == null) {
            this.C.getClass();
            sjh sjhVar = uyj.a;
            ikeVar = bvf0.a(o400.a);
            this.H = ikeVar;
        }
        tje.N(ikeVar, null, null, new PlacesUserLocationOverlay$observeSourceAddress$$inlined$safeCollectIn$1(s, null, this), 3);
    }

    @Override // defpackage.uo21
    public final void detach() {
        Ig();
        this.A.Cg();
        this.G.d();
        ike ikeVar = this.H;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.H = null;
        this.I = true;
    }

    @Override // defpackage.igc0
    public final void n0() {
        if (this.I) {
            Lg().setVisible(false);
        }
    }

    @Override // defpackage.bhf, defpackage.igc0
    public final void pause() {
        super.pause();
        ((gh00) ((ah00) this.b)).u(this.F);
    }

    @Override // defpackage.bhf, defpackage.igc0
    public final void resume() {
        super.resume();
        ((gh00) ((ah00) this.b)).e(this.F);
    }

    @Override // defpackage.igc0
    public final void t0() {
        Lg().setVisible(true);
    }

    @Override // defpackage.igc0
    public final void updateUserLocation(mo21 mo21Var) {
        if (this.I) {
            Ng(mo21Var.a, mo21Var.b, mo21Var.c);
        }
    }
}

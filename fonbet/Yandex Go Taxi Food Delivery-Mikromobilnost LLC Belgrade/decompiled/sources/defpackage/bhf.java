package defpackage;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import ru.yandex.taxi.interactors.c;
import ru.yandex.taxi.map.overlay.CurrentPositionOverlay$resume$$inlined$safeCollectIn$1;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes6.dex */
public abstract class bhf extends r8 {
    public final no21 c;
    public boolean w;
    public final hbp0 x;
    public ugf y;

    public bhf(ah00 ah00Var, no21 no21Var) {
        super(5, ah00Var);
        this.c = no21Var;
        String str = (2 & 1) != 0 ? null : "CurrentPositionOverlay";
        this.x = new hbp0(new czo0(14), str == null ? "" : str, null);
    }

    public final void Hg() {
        if (Lg().v0()) {
            ah00 ah00Var = (ah00) this.b;
            zzs E = a.E(Lg().getGeometry(), null);
            es00 es00Var = ((gh00) ah00Var).e;
            es00Var.getClass();
            ScreenPoint e = es00Var.e(a.F(E));
            if (Kg() == null || e == null) {
                return;
            }
            if (!this.w && Mg(e)) {
                jst.e.getClass();
                Lg().t0(false);
                this.w = true;
            } else {
                if (!this.w || Mg(e)) {
                    return;
                }
                jst.e.getClass();
                Lg().t0(true);
                this.w = false;
            }
        }
    }

    public final void Ig() {
        ugf ugfVar = this.y;
        if (ugfVar != null) {
            ugfVar.s0();
        }
        this.y = null;
    }

    public abstract ugf Jg();

    public abstract ScreenPoint Kg();

    public final ugf Lg() {
        ugf ugfVar = this.y;
        if (ugfVar != null) {
            return ugfVar;
        }
        ugf Jg = Jg();
        this.y = Jg;
        return Jg;
    }

    public final boolean Mg(ScreenPoint screenPoint) {
        ScreenPoint Kg = Kg();
        float a = Lg().a();
        Polyline polyline = a.b;
        if (Kg == null) {
            return false;
        }
        float abs = Math.abs(Kg.getX() - screenPoint.getX());
        float abs2 = Math.abs(Kg.getY() - screenPoint.getY());
        if (abs > a || abs2 > a) {
            return false;
        }
        if (abs + abs2 > a) {
            return (abs2 * abs2) + (abs * abs) <= a * a;
        }
        return true;
    }

    public void Ng(double d, double d2, float f) {
        Lg().w0(new Point(d, d2), f);
        Hg();
    }

    public void pause() {
        this.x.b();
    }

    public void resume() {
        hbp0 hbp0Var = this.x;
        hbp0Var.a();
        no21 no21Var = this.c;
        tje.N(hbp0Var, null, null, new CurrentPositionOverlay$resume$$inlined$safeCollectIn$1(new c(no21Var.a.c(), no21Var), null, this), 3);
    }

    public void s8(float f) {
        updateAzimuth(f);
    }

    public final void updateAzimuth(float f) {
        Lg().updateAzimuth(f);
    }
}

package defpackage;

import android.graphics.PointF;
import com.yandex.go.taxi.order.search.overlay.companions.b;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import com.yandex.go.taxi.order.search.ui.search_views.d;
import com.yandex.mapkit.ScreenRect;

/* loaded from: classes14.dex */
public final class cvc extends r8 implements svp0, avc {
    public final jzf0 A;
    public final l390 c;
    public final d w;
    public final b x;
    public final ndl0 y;
    public final hf2 z;

    public cvc(ah00 ah00Var, l390 l390Var, d dVar, b bVar, ndl0 ndl0Var, hf2 hf2Var, jzf0 jzf0Var) {
        super(5, ah00Var);
        this.c = l390Var;
        this.w = dVar;
        this.x = bVar;
        this.y = ndl0Var;
        this.z = hf2Var;
        this.A = jzf0Var;
    }

    @Override // defpackage.svp0
    public final void attach() {
        this.x.Bg(this);
    }

    @Override // defpackage.svp0
    public final void b9(ScreenRect screenRect) {
        if (screenRect == null) {
            return;
        }
        this.A.getClass();
        PointF a = jzf0.a(screenRect);
        SearchViews I = this.w.I();
        if (I != null) {
            I.setPulsingCirclesViewAnchor(a);
        }
        ((gh00) ((ah00) this.b)).y(this.c, screenRect);
        b bVar = this.x;
        bVar.Kg(((Number) bVar.z.f.a.getValue()).doubleValue());
    }

    @Override // defpackage.svp0
    public final void detach() {
        this.x.Cg();
    }

    @Override // defpackage.svp0
    public final yx01 p6() {
        return new bvc(this, 1);
    }

    @Override // defpackage.svp0
    public final void pause() {
        this.x.pause();
    }

    @Override // defpackage.svp0
    public final void resume() {
        this.x.resume();
        this.z.j.hideStaticFogAnimated();
    }

    @Override // defpackage.svp0
    public final yx01 s5() {
        return new bvc(this, 0);
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.yandex.go.taxi.order.queue.presentation.QueueView;
import com.yandex.go.taxi.order.search.overlay.mvp.a;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class nkg0 extends r8 implements svp0 {
    public final ow70 A;
    public final xm00 B;
    public final Context c;
    public final l390 w;
    public final QueueView x;
    public final a y;
    public final uz8 z;

    public nkg0(xm00 xm00Var, Context context, l390 l390Var, ah00 ah00Var, QueueView queueView, a aVar, uz8 uz8Var, ow70 ow70Var) {
        super(5, ah00Var);
        this.c = context;
        this.w = l390Var;
        this.x = queueView;
        this.y = aVar;
        this.z = uz8Var;
        this.A = ow70Var;
        this.B = xm00Var.p();
    }

    @Override // defpackage.svp0
    public final void attach() {
        View findViewById;
        this.y.Bg(new lkg0(this));
        ViewGroup a = this.A.a();
        if (a == null || (findViewById = a.findViewById(p8h0.queue_overlay_view)) == null) {
            return;
        }
        c.w(findViewById, this.x);
    }

    @Override // defpackage.svp0
    public final void b9(ScreenRect screenRect) {
        if (screenRect == null) {
            return;
        }
        ((gh00) ((ah00) this.b)).y(this.w, screenRect);
    }

    @Override // defpackage.svp0
    public final void detach() {
        View findViewById;
        xm00 xm00Var = this.B;
        xm00Var.m();
        xm00Var.d();
        ViewGroup a = this.A.a();
        if (a != null && (findViewById = a.findViewById(p8h0.queue_overlay_view)) != null) {
            c.w(findViewById, new ViewStub(this.c));
        }
        this.y.Cg();
    }

    @Override // defpackage.svp0
    public final yx01 p6() {
        return new mkg0(this, 1);
    }

    @Override // defpackage.svp0
    public final void pause() {
        this.y.pause();
    }

    @Override // defpackage.svp0
    public final void resume() {
        zzs Lg = this.y.Lg();
        Point point = new Point(Lg.a, Lg.b);
        Point target = ((gh00) ((ah00) this.b)).e.c.getTarget();
        if (target.getLatitude() != point.getLatitude() && target.getLongitude() != point.getLongitude()) {
            ((gh00) ((ah00) this.b)).D(point, 17.0f, 0.0f, null);
        }
        this.y.resume();
        this.B.k(1.0f);
    }

    @Override // defpackage.svp0
    public final yx01 s5() {
        return new mkg0(this, 0);
    }
}

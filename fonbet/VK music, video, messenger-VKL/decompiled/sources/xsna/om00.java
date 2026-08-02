package xsna;

import android.os.Bundle;
import android.widget.FrameLayout;

/* compiled from: MapViewContainer.kt */
/* loaded from: classes3.dex */
public abstract class om00 extends FrameLayout implements jm00 {
    public xl00 b;
    public jm00 c;

    @Override // xsna.jm00
    public final void a() {
        getMapView().a();
    }

    @Override // xsna.jm00
    public final void b() {
        getMapView().b();
    }

    @Override // xsna.jm00
    public final void c(ger0 ger0Var) {
        getMapView().c(ger0Var);
    }

    @Override // xsna.jm00
    public final void d(Bundle bundle) {
        getMapView().d(bundle);
    }

    @Override // xsna.jm00
    public final void e() {
        getMapView().e();
    }

    @Override // xsna.jm00
    public final void f() {
        getMapView().f();
    }

    @Override // xsna.jm00
    public final void g() {
        getMapView().g();
    }

    public final jm00 getMapView() {
        jm00 jm00Var = this.c;
        if (jm00Var != null) {
            return jm00Var;
        }
        return null;
    }

    public final xl00 getOptions() {
        xl00 xl00Var = this.b;
        if (xl00Var != null) {
            return xl00Var;
        }
        return null;
    }

    public abstract void h();

    public abstract void i();

    public final void setMapView(jm00 jm00Var) {
        this.c = jm00Var;
    }

    public final void setOptions(xl00 xl00Var) {
        this.b = xl00Var;
    }

    public final void setMapClickInterceptFixEnabled(boolean z) {
    }
}

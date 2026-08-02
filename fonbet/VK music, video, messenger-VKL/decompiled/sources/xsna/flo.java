package xsna;

import android.graphics.drawable.Drawable;
import com.facebook.drawee.components.DraweeEventTracker;
import xsna.cq70;
import xsna.elo;

/* compiled from: DraweeHolder.java */
/* loaded from: classes.dex */
public final class flo<DH extends elo> implements t4u0 {
    public DH d;
    public final DraweeEventTracker f;
    public boolean a = false;
    public boolean b = false;
    public boolean c = true;
    public dlo e = null;

    public flo(njt njtVar) {
        this.f = DraweeEventTracker.c ? new DraweeEventTracker() : DraweeEventTracker.b;
        if (njtVar != null) {
            i(njtVar);
        }
    }

    @Override // xsna.t4u0
    public final void a(boolean z) {
        if (this.c == z) {
            return;
        }
        this.f.a(z ? DraweeEventTracker.Event.ON_DRAWABLE_SHOW : DraweeEventTracker.Event.ON_DRAWABLE_HIDE);
        this.c = z;
        c();
    }

    public final void b() {
        if (this.a) {
            return;
        }
        this.f.a(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.a = true;
        dlo dloVar = this.e;
        if (dloVar == null || dloVar.f() == null) {
            return;
        }
        this.e.b();
    }

    public final void c() {
        if (this.b && this.c) {
            b();
            return;
        }
        if (this.a) {
            this.f.a(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.a = false;
            if (e()) {
                this.e.c();
            }
        }
    }

    public final Drawable d() {
        DH dh = this.d;
        if (dh == null) {
            return null;
        }
        return dh.a();
    }

    public final boolean e() {
        dlo dloVar = this.e;
        return dloVar != null && dloVar.f() == this.d;
    }

    public final void f() {
        this.f.a(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.b = true;
        c();
    }

    public final void g() {
        this.f.a(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.b = false;
        c();
    }

    public final void h(dlo dloVar) {
        boolean z = this.a;
        DraweeEventTracker draweeEventTracker = this.f;
        if (z && z) {
            draweeEventTracker.a(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.a = false;
            if (e()) {
                this.e.c();
            }
        }
        if (e()) {
            draweeEventTracker.a(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.e.e(null);
        }
        this.e = dloVar;
        if (dloVar != null) {
            draweeEventTracker.a(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.e.e(this.d);
        } else {
            draweeEventTracker.a(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            b();
        }
    }

    public final void i(DH dh) {
        this.f.a(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean e = e();
        Object d = d();
        if (d != null) {
            ((r4u0) d).h(null);
        }
        dh.getClass();
        this.d = dh;
        gmg0 a = dh.a();
        a(a == null || a.isVisible());
        Object d2 = d();
        if (d2 != null) {
            ((r4u0) d2).h(this);
        }
        if (e) {
            this.e.e(dh);
        }
    }

    @Override // xsna.t4u0
    public final void onDraw() {
        if (this.a) {
            return;
        }
        ahq.j(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.e)), toString());
        this.b = true;
        this.c = true;
        c();
    }

    public final String toString() {
        cq70.a b = cq70.b(this);
        b.c("controllerAttached", this.a);
        b.c("holderAttached", this.b);
        b.c("drawableVisible", this.c);
        b.b("events", this.f.a.toString());
        return b.toString();
    }
}

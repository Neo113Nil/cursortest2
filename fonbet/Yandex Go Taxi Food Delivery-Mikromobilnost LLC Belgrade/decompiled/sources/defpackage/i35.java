package defpackage;

import android.view.animation.Interpolator;
import com.airbnb.lottie.AsyncUpdates;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i35 {
    public final f35 c;
    public puz e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public i35(List list) {
        f35 h35Var;
        if (list.isEmpty()) {
            h35Var = new o501(8);
        } else {
            h35Var = list.size() == 1 ? new h35(list) : new g35(list);
        }
        this.c = h35Var;
    }

    public final void a(e35 e35Var) {
        this.a.add(e35Var);
    }

    public final rkx b() {
        AsyncUpdates asyncUpdates = upx.a;
        return this.c.e();
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.x();
        }
        return this.h;
    }

    public final float d() {
        Interpolator interpolator;
        rkx b = b();
        if (b == null || b.c() || (interpolator = b.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public final float e() {
        if (this.b) {
            return 0.0f;
        }
        rkx b = b();
        if (b.c()) {
            return 0.0f;
        }
        return (this.d - b.b()) / (b.a() - b.b());
    }

    public Object f() {
        float e = e();
        if (this.e == null && this.c.s(e) && !l()) {
            return this.f;
        }
        rkx b = b();
        Interpolator interpolator = b.e;
        Interpolator interpolator2 = b.f;
        Object g = (interpolator == null || interpolator2 == null) ? g(b, d()) : h(b, e, interpolator.getInterpolation(e), interpolator2.getInterpolation(e));
        this.f = g;
        return g;
    }

    public abstract Object g(rkx rkxVar, float f);

    public Object h(rkx rkxVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        AsyncUpdates asyncUpdates = upx.a;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                AsyncUpdates asyncUpdates2 = upx.a;
                return;
            } else {
                ((e35) arrayList.get(i)).d();
                i++;
            }
        }
    }

    public void j(float f) {
        AsyncUpdates asyncUpdates = upx.a;
        f35 f35Var = this.c;
        if (f35Var.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = f35Var.l();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = f35Var.l();
            }
            f = this.g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (f35Var.t(f)) {
            i();
        }
    }

    public final void k(puz puzVar) {
        puz puzVar2 = this.e;
        if (puzVar2 != null) {
            puzVar2.getClass();
        }
        this.e = puzVar;
    }

    public boolean l() {
        return false;
    }
}

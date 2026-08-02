package defpackage;

import com.yandex.go.taxi.cars.api.CarsOverlayLifecycle$State;
import com.yandex.go.taxi.cars.lifecycle.CarsOverlayLifecycleImpl$resume$$inlined$safeCollectIn$1;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class g09 {
    public final f09 a;
    public final ah00 b;
    public final qp00 c;
    public final i6r d;
    public final tse e;
    public h09 i;
    public xm00 j;
    public pzt0 k;
    public final r0 f = bvf0.c(CarsOverlayLifecycle$State.DETACHED);
    public final LinkedHashSet g = new LinkedHashSet();
    public final LinkedHashSet h = new LinkedHashSet();
    public final l9s l = new l9s(new kv8(1, this));

    public g09(f09 f09Var, ah00 ah00Var, qp00 qp00Var, i6r i6rVar, tse tseVar) {
        this.a = f09Var;
        this.b = ah00Var;
        this.c = qp00Var;
        this.d = i6rVar;
        this.e = tseVar;
    }

    public final void a(Object obj) {
        if (this.g.add(obj) && this.i == null) {
            xm00 xm00Var = this.j;
            if (xm00Var != null) {
                xm00Var.d();
                xm00Var.m();
            }
            this.j = null;
            xm00 xm00Var2 = new xm00();
            xm00Var2.b(((gh00) this.b).i);
            this.j = xm00Var2;
            h09 h09Var = new h09(this.d, xm00Var2);
            this.i = h09Var;
            this.a.Ig(h09Var);
            this.f.l(CarsOverlayLifecycle$State.ATTACHED);
        }
    }

    public final void b(Object obj) {
        c(obj);
        LinkedHashSet linkedHashSet = this.g;
        if (linkedHashSet.remove(obj) && linkedHashSet.isEmpty()) {
            h09 h09Var = this.i;
            if (h09Var != null) {
                f09 f09Var = this.a;
                f09Var.Hg(h09Var);
                an8 an8Var = f09Var.w;
                an8Var.getClass();
                an8Var.u(new m09(h09Var));
            }
            this.i = null;
            xm00 xm00Var = this.j;
            if (xm00Var != null) {
                xm00Var.d();
                xm00Var.m();
            }
            this.j = null;
            this.f.l(CarsOverlayLifecycle$State.DETACHED);
        }
    }

    public final void c(Object obj) {
        LinkedHashSet linkedHashSet = this.h;
        if (linkedHashSet.remove(obj) && linkedHashSet.isEmpty()) {
            l9s l9sVar = this.l;
            if (l9sVar.a) {
                l9sVar.a = false;
                if (l9sVar.b) {
                    ((cl11) l9sVar.c).onPause();
                }
                l9sVar.b = false;
            }
            pzt0 pzt0Var = this.k;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.k = null;
            this.f.l(CarsOverlayLifecycle$State.ATTACHED);
        }
    }

    public final void d(Object obj) {
        if (this.i != null && this.g.contains(obj) && this.h.add(obj) && this.k == null) {
            l9s l9sVar = this.l;
            if (!l9sVar.a || !l9sVar.b) {
                l9sVar.a = true;
                l9sVar.b = true;
                ((cl11) l9sVar.c).onResume();
            }
            rp00 rp00Var = (rp00) this.c;
            this.k = tje.N(this.e, null, null, new CarsOverlayLifecycleImpl$resume$$inlined$safeCollectIn$1(((Boolean) rp00Var.a.b()).booleanValue() ? rp00Var.c : rp00Var.d, null, this), 3);
            this.f.l(CarsOverlayLifecycle$State.RESUMED);
        }
    }
}

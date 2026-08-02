package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class o950 extends Lifecycle {
    public final WeakReference b;
    public LinkedHashMap c = new LinkedHashMap();
    public Lifecycle.State w = Lifecycle.State.INITIALIZED;

    public o950(h55 h55Var) {
        this.b = new WeakReference(h55Var);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(oey oeyVar) {
        h55 h55Var;
        Lifecycle.State state = this.w;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        n950 n950Var = new n950(oeyVar, state2);
        if (((n950) this.c.putIfAbsent(oeyVar, n950Var)) == null && (h55Var = (h55) this.b.get()) != null) {
            e(n950Var, this.w, oeyVar, h55Var);
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.w;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void d(oey oeyVar) {
        this.c.remove(oeyVar);
    }

    public final void e(n950 n950Var, Lifecycle.State state, oey oeyVar, h55 h55Var) {
        while (n950Var.a.compareTo(state) < 0 && this.c.containsKey(oeyVar)) {
            l lVar = Lifecycle.Event.Companion;
            Lifecycle.State state2 = n950Var.a;
            lVar.getClass();
            Lifecycle.Event b = l.b(state2);
            if (b == null) {
                yci0.t(n950Var.a, "no event up from ");
                return;
            }
            Lifecycle.State a = b.a();
            Lifecycle.State state3 = n950Var.a;
            if (a != null && a.compareTo(state3) < 0) {
                state3 = a;
            }
            n950Var.a = state3;
            n950Var.b.M1(h55Var, b);
            n950Var.a = a;
        }
    }
}

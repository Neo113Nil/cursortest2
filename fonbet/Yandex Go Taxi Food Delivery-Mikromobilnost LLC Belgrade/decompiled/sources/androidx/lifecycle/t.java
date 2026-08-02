package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import defpackage.bvf0;
import defpackage.c43;
import defpackage.gci0;
import defpackage.gfy;
import defpackage.lcp;
import defpackage.ny61;
import defpackage.oey;
import defpackage.oyr;
import defpackage.pey;
import defpackage.unr0;
import defpackage.uol0;
import defpackage.vol0;
import defpackage.wol0;
import defpackage.xfo;
import defpackage.yci0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public class t extends Lifecycle {
    public boolean A;
    public final ArrayList B;
    public final r0 C;
    public final boolean b;
    public lcp c = new lcp();
    public Lifecycle.State w;
    public final WeakReference x;
    public int y;
    public boolean z;

    public t(pey peyVar, boolean z) {
        this.b = z;
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.w = state;
        this.B = new ArrayList();
        this.x = new WeakReference(peyVar);
        this.C = bvf0.c(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(oey oeyVar) {
        Object obj;
        pey peyVar;
        f("addObserver");
        Lifecycle.State state = this.w;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        s sVar = new s();
        sVar.b = gfy.c(oeyVar);
        sVar.a = state2;
        lcp lcpVar = this.c;
        vol0 a = lcpVar.a(oeyVar);
        if (a != null) {
            obj = a.b;
        } else {
            HashMap hashMap = lcpVar.x;
            vol0 vol0Var = new vol0(oeyVar, sVar);
            lcpVar.w++;
            vol0 vol0Var2 = lcpVar.b;
            if (vol0Var2 == null) {
                lcpVar.a = vol0Var;
                lcpVar.b = vol0Var;
            } else {
                vol0Var2.c = vol0Var;
                vol0Var.w = vol0Var2;
                lcpVar.b = vol0Var;
            }
            hashMap.put(oeyVar, vol0Var);
            obj = null;
        }
        if (((s) obj) == null && (peyVar = (pey) this.x.get()) != null) {
            boolean z = this.y != 0 || this.z;
            Lifecycle.State e = e(oeyVar);
            this.y++;
            while (sVar.a.compareTo(e) < 0 && this.c.x.containsKey(oeyVar)) {
                Lifecycle.State state3 = sVar.a;
                ArrayList arrayList = this.B;
                arrayList.add(state3);
                l lVar = Lifecycle.Event.Companion;
                Lifecycle.State state4 = sVar.a;
                lVar.getClass();
                Lifecycle.Event b = l.b(state4);
                if (b == null) {
                    yci0.t(sVar.a, "no event up from ");
                    return;
                } else {
                    sVar.a(peyVar, b);
                    arrayList.remove(arrayList.size() - 1);
                    e = e(oeyVar);
                }
            }
            if (!z) {
                j();
            }
            this.y--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.w;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final gci0 c() {
        return kotlinx.coroutines.flow.e.d(this.C);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void d(oey oeyVar) {
        f("removeObserver");
        this.c.b(oeyVar);
    }

    public final Lifecycle.State e(oey oeyVar) {
        HashMap hashMap = this.c.x;
        vol0 vol0Var = hashMap.containsKey(oeyVar) ? ((vol0) hashMap.get(oeyVar)).w : null;
        Lifecycle.State state = vol0Var != null ? ((s) vol0Var.b).a : null;
        ArrayList arrayList = this.B;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) unr0.k(1, arrayList);
        Lifecycle.State state3 = this.w;
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void f(String str) {
        if (this.b) {
            c43.a().a.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            xfo.g(oyr.p("Method ", str, " must be called on the main thread"));
        }
    }

    public void g(Lifecycle.Event event) {
        f("handleLifecycleEvent");
        h(event.a());
    }

    public final void h(Lifecycle.State state) {
        if (this.w == state) {
            return;
        }
        pey peyVar = (pey) this.x.get();
        Lifecycle.State state2 = this.w;
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + state + "' in component " + peyVar).toString());
        }
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state2 == state3 && state2 != state) {
            throw new IllegalStateException(("State is '" + state3 + "' and cannot be moved to `" + state + "` in component " + peyVar).toString());
        }
        this.w = state;
        if (this.z || this.y != 0) {
            this.A = true;
            return;
        }
        this.z = true;
        j();
        this.z = false;
        if (this.w == state3) {
            this.c = new lcp();
        }
    }

    public final void i(Lifecycle.State state) {
        f("setCurrentState");
        h(state);
    }

    public final void j() {
        Lifecycle.State state;
        Lifecycle.State state2;
        pey peyVar = (pey) this.x.get();
        if (peyVar == null) {
            ny61.r("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            lcp lcpVar = this.c;
            if (lcpVar.w != 0 && ((state = ((s) lcpVar.a.b).a) != (state2 = ((s) lcpVar.b.b).a) || this.w != state2)) {
                this.A = false;
                int compareTo = this.w.compareTo(state);
                ArrayList arrayList = this.B;
                if (compareTo < 0) {
                    lcp lcpVar2 = this.c;
                    uol0 uol0Var = new uol0(lcpVar2.b, lcpVar2.a);
                    lcpVar2.c.put(uol0Var, Boolean.FALSE);
                    while (uol0Var.hasNext() && !this.A) {
                        Map.Entry entry = (Map.Entry) uol0Var.next();
                        oey oeyVar = (oey) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.a.compareTo(this.w) > 0 && !this.A && this.c.x.containsKey(oeyVar)) {
                            l lVar = Lifecycle.Event.Companion;
                            Lifecycle.State state3 = sVar.a;
                            lVar.getClass();
                            Lifecycle.Event a = l.a(state3);
                            if (a == null) {
                                yci0.t(sVar.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(a.a());
                                sVar.a(peyVar, a);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                vol0 vol0Var = this.c.b;
                if (!this.A && vol0Var != null && this.w.compareTo(((s) vol0Var.b).a) > 0) {
                    lcp lcpVar3 = this.c;
                    lcpVar3.getClass();
                    wol0 wol0Var = new wol0(lcpVar3);
                    lcpVar3.c.put(wol0Var, Boolean.FALSE);
                    while (wol0Var.hasNext() && !this.A) {
                        Map.Entry entry2 = (Map.Entry) wol0Var.next();
                        oey oeyVar2 = (oey) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.a.compareTo(this.w) < 0 && !this.A && this.c.x.containsKey(oeyVar2)) {
                            arrayList.add(sVar2.a);
                            l lVar2 = Lifecycle.Event.Companion;
                            Lifecycle.State state4 = sVar2.a;
                            lVar2.getClass();
                            Lifecycle.Event b = l.b(state4);
                            if (b == null) {
                                yci0.t(sVar2.a, "no event up from ");
                                return;
                            } else {
                                sVar2.a(peyVar, b);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            }
        }
        this.A = false;
        this.C.l(this.w);
    }
}

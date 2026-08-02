package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import com.yandex.go.navigation.base.internal.NavigationRouterException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.a;
import ru.yandex.taxi.lifecycle.c;

/* loaded from: classes8.dex */
public abstract class h55 extends ha50 implements pey {
    public WeakReference A;
    public boolean B;
    public o950 C;
    public sy60 w;
    public Object x;
    public final i3y y;
    public boolean z;

    public h55(String str) {
        this.y = a.a(new ou(7, str, this));
        this.A = new WeakReference(null);
    }

    public final void A(m950 m950Var, Object obj, sy60 sy60Var) {
        B(m950Var, obj, sy60Var, p1j0.a);
    }

    public final void B(m950 m950Var, Object obj, sy60 sy60Var, q1j0 q1j0Var) {
        if (!p().a(Lifecycle.State.CREATED)) {
            p950.a.j(new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not launched for launching child router")));
            return;
        }
        boolean z = q1j0Var instanceof p1j0;
        q950 q950Var = this.b;
        if (!z) {
            if (q1j0Var instanceof k1j0) {
                j(dpb.a);
            } else if (q1j0Var instanceof l1j0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = q950Var.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (j73.y(((l1j0) q1j0Var).a(), (m950) next)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = kotlin.collections.a.q0(arrayList).iterator();
                while (it2.hasNext()) {
                    ((h55) ((m950) it2.next())).i();
                }
            } else if (q1j0Var instanceof m1j0) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = q950Var.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (((m950) next2).getClass() == m950Var.getClass()) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it4 = kotlin.collections.a.q0(arrayList2).iterator();
                while (it4.hasNext()) {
                    ((h55) ((m950) it4.next())).i();
                }
            } else if (q1j0Var instanceof n1j0) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = q950Var.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    if (!j73.y(((n1j0) q1j0Var).a(), (m950) next3)) {
                        arrayList3.add(next3);
                    }
                }
                Iterator it6 = kotlin.collections.a.q0(arrayList3).iterator();
                while (it6.hasNext()) {
                    ((h55) ((m950) it6.next())).i();
                }
            } else {
                if (!(q1j0Var instanceof o1j0)) {
                    w511.b();
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it7 = q950Var.iterator();
                boolean z2 = false;
                while (it7.hasNext()) {
                    Object next4 = it7.next();
                    if (z2) {
                        arrayList4.add(next4);
                    } else if (jl40.l((m950) next4, ((o1j0) q1j0Var).a())) {
                        arrayList4.add(next4);
                        z2 = true;
                    }
                }
                Iterator it8 = kotlin.collections.a.q0(arrayList4).iterator();
                while (it8.hasNext()) {
                    ((h55) ((m950) it8.next())).i();
                }
            }
        }
        h55 b = gtq0.b(m950Var);
        if (b.w()) {
            wby wbyVar = p950.a;
            new NavigationRouterException(qv10.m(b.getClass(), "Attempt to launch child router ", " that already launched"));
            wbyVar.getClass();
            return;
        }
        b.a = this;
        q950Var.a.add(b);
        tls tlsVar = this.c;
        if (tlsVar != null) {
            tlsVar.invoke(Integer.valueOf(q950Var.a.size()));
        }
        w950 w950Var = (w950) this.A.get();
        if (w950Var != null) {
            b.A = new WeakReference(w950Var);
        }
        if (this.A.get() == null) {
            wby wbyVar2 = p950.a;
            new NavigationRouterException("NavigationScreenStack is null");
            wbyVar2.getClass();
        }
        ((h55) m950Var).y(obj, sy60Var);
        if (this.A.get() == null || !b.w()) {
            return;
        }
        if (u() && !b.u()) {
            b.g();
        }
        if (!x() || b.x()) {
            return;
        }
        b.M();
    }

    public final void C(m950 m950Var, sy60 sy60Var) {
        B(m950Var, zy11.a, sy60Var, k1j0.a);
    }

    public final void D(m950 m950Var, Object obj, sy60 sy60Var) {
        B(m950Var, obj, sy60Var, k1j0.a);
    }

    public final void E(m950 m950Var, Object obj, sy60 sy60Var, kxx kxxVar) {
        w950 w950Var = (w950) this.A.get();
        if (w950Var == null) {
            p950.a.w(new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not attached to NavigationScreenStack for launching router with backStack!")));
            return;
        }
        pep0 pep0Var = w950Var.b;
        if (!gtq0.u(this)) {
            jst.e.a(15, "ScreenStackNavigator", new IllegalStateException("Trying to launch router on stack from dismissed parent!"), null);
        } else {
            c.a(getLifecycle(), new ssu(29, m950Var));
            pep0Var.g(m950Var, obj, sy60Var, kxxVar);
        }
    }

    public void G(Object obj) {
    }

    public void H(Object obj) {
    }

    public void I(Object obj) {
    }

    public void J(Object obj) {
    }

    public void K(Object obj) {
    }

    public void L(Object obj) {
    }

    public final void M() {
        if (!u()) {
            p950.a.j(new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not attached for resume")));
            return;
        }
        if (x()) {
            wby wbyVar = p950.a;
            new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is already in resumed state"));
            wbyVar.getClass();
            return;
        }
        N(Lifecycle.State.RESUMED);
        Object obj = this.x;
        if (obj != null) {
            K(obj);
        } else {
            xby.t(p950.a, "NavigationRouter:" + p() + ":missingPayload", new NavigationRouterException("Router [" + b64.f(this) + "] can't get payload on state " + p()), null, 10);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof h55) {
                arrayList.add(next);
            }
        }
        for (h55 h55Var : kotlin.collections.a.q0(arrayList)) {
            if (!h55Var.x()) {
                h55Var.M();
            }
        }
    }

    public final void N(Lifecycle.State state) {
        o950 o950Var = this.C;
        if (o950Var != null) {
            WeakReference weakReference = o950Var.b;
            Lifecycle.State state2 = o950Var.w;
            if (state2 == state) {
                return;
            }
            if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
                xfo.m("no event down from ", state2, " in component ", weakReference.get());
                return;
            }
            boolean z = state.compareTo(state2) > 0;
            o950Var.w = state;
            for (Map.Entry entry : kotlin.collections.a.J0(o950Var.c.entrySet())) {
                oey oeyVar = (oey) entry.getKey();
                n950 n950Var = (n950) entry.getValue();
                h55 h55Var = (h55) weakReference.get();
                if (h55Var == null) {
                    return;
                }
                if (z) {
                    o950Var.e(n950Var, state, oeyVar, h55Var);
                } else {
                    while (n950Var.a.compareTo(state) > 0 && o950Var.c.containsKey(oeyVar)) {
                        l lVar = Lifecycle.Event.Companion;
                        Lifecycle.State state3 = n950Var.a;
                        lVar.getClass();
                        Lifecycle.Event a = l.a(state3);
                        if (a == null) {
                            yci0.t(n950Var.a, "no event down from ");
                            return;
                        }
                        Lifecycle.State a2 = a.a();
                        Lifecycle.State state4 = n950Var.a;
                        if (a2 != null && a2.compareTo(state4) < 0) {
                            state4 = a2;
                        }
                        n950Var.a = state4;
                        n950Var.b.M1(h55Var, a);
                        n950Var.a = a2;
                    }
                }
            }
            if (o950Var.w == Lifecycle.State.DESTROYED) {
                o950Var.c = new LinkedHashMap();
            }
        }
    }

    public final void O() {
        if (!x()) {
            wby wbyVar = p950.a;
            new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not in resumed state for suspend"));
            wbyVar.getClass();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof h55) {
                arrayList.add(next);
            }
        }
        Iterator it2 = kotlin.collections.a.q0(arrayList).iterator();
        while (it2.hasNext()) {
            ((h55) it2.next()).O();
        }
        N(Lifecycle.State.STARTED);
        Object obj = this.x;
        if (obj != null) {
            L(obj);
            return;
        }
        xby.t(p950.a, "NavigationRouter:" + p() + ":missingPayload", new NavigationRouterException("Router [" + b64.f(this) + "] can't get payload on state " + p()), null, 10);
    }

    public final void g() {
        if (!w()) {
            p950.a.j(new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not launched for attach")));
            return;
        }
        if (u()) {
            wby wbyVar = p950.a;
            new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is already in attached state"));
            wbyVar.getClass();
            return;
        }
        N(Lifecycle.State.STARTED);
        Object obj = this.x;
        if (obj != null) {
            G(obj);
        } else {
            xby.t(p950.a, "NavigationRouter:" + p() + ":missingPayload", new NavigationRouterException("Router [" + b64.f(this) + "] can't get payload on state " + p()), null, 10);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof h55) {
                arrayList.add(next);
            }
        }
        for (h55 h55Var : kotlin.collections.a.q0(arrayList)) {
            if (!h55Var.u()) {
                h55Var.g();
            }
        }
    }

    public final void h() {
        if (!u()) {
            wby wbyVar = p950.a;
            new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not in attached state for detach"));
            wbyVar.getClass();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof h55) {
                arrayList.add(next);
            }
        }
        Iterator it2 = kotlin.collections.a.q0(arrayList).iterator();
        while (it2.hasNext()) {
            ((h55) it2.next()).h();
        }
        N(Lifecycle.State.CREATED);
        Object obj = this.x;
        if (obj != null) {
            H(obj);
            return;
        }
        xby.t(p950.a, "NavigationRouter:" + p() + ":missingPayload", new NavigationRouterException("Router [" + b64.f(this) + "] can't get payload on state " + p()), null, 10);
    }

    public final void i() {
        p950.a();
        if (!w()) {
            wby wbyVar = p950.a;
            new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not launched for dismiss"));
            wbyVar.getClass();
            return;
        }
        Object obj = this.x;
        if (obj != null) {
            l(obj);
        } else {
            xby.t(p950.a, "NavigationRouter:" + p() + ":missingPayload", new NavigationRouterException("Router [" + b64.f(this) + "] can't get payload on state " + p()), null, 10);
        }
        if (w()) {
            return;
        }
        this.x = null;
    }

    public final void j(gpb gpbVar) {
        if (!w()) {
            wby wbyVar = p950.a;
            new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not launched for dismissing child routers"));
            wbyVar.getClass();
            return;
        }
        boolean l = jl40.l(gpbVar, dpb.a);
        q950 q950Var = this.b;
        if (l) {
            Iterator it = kotlin.collections.a.q0(q950Var).iterator();
            while (it.hasNext()) {
                ((h55) ((m950) it.next())).i();
            }
            return;
        }
        if (gpbVar instanceof epb) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = q950Var.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (j73.y(((epb) gpbVar).a, (m950) next)) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = kotlin.collections.a.q0(arrayList).iterator();
            while (it3.hasNext()) {
                ((h55) ((m950) it3.next())).i();
            }
            return;
        }
        if (!(gpbVar instanceof fpb)) {
            w511.b();
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = q950Var.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (!j73.y(((fpb) gpbVar).a, (m950) next2)) {
                arrayList2.add(next2);
            }
        }
        Iterator it5 = kotlin.collections.a.q0(arrayList2).iterator();
        while (it5.hasNext()) {
            ((h55) ((m950) it5.next())).i();
        }
    }

    public final void l(Object obj) {
        this.z = true;
        if (x()) {
            O();
        }
        if (u()) {
            h();
        }
        h55 h55Var = this.a;
        if (h55Var != null) {
            h55 b = gtq0.b(h55Var);
            q950 q950Var = b.b;
            q950Var.a.remove(this);
            tls tlsVar = b.c;
            if (tlsVar != null) {
                tlsVar.invoke(Integer.valueOf(q950Var.a.size()));
            }
        } else {
            wby wbyVar = p950.a;
            new NavigationRouterException("No parent router");
            wbyVar.getClass();
        }
        this.a = null;
        j(dpb.a);
        this.A = new WeakReference(null);
        N(Lifecycle.State.DESTROYED);
        this.w = null;
        ((hbp0) this.y.getValue()).b();
        I(obj);
        this.z = false;
    }

    @Override // defpackage.pey
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final o950 getLifecycle() {
        o950 o950Var = this.C;
        if (o950Var != null) {
            return o950Var;
        }
        o950 o950Var2 = new o950(this);
        p950.a();
        this.C = o950Var2;
        return o950Var2;
    }

    public final Object n() {
        Object obj = this.x;
        if (obj != null) {
            return obj;
        }
        throw new NavigationRouterException("Never should happen - P type is always non nullable");
    }

    public final tse o() {
        i3y i3yVar = this.y;
        if (!((hbp0) i3yVar.getValue()).d() && w()) {
            ((hbp0) i3yVar.getValue()).a();
        }
        return ((hbp0) i3yVar.getValue()).c();
    }

    public final Lifecycle.State p() {
        Lifecycle.State state;
        o950 o950Var = this.C;
        return (o950Var == null || (state = o950Var.w) == null) ? Lifecycle.State.INITIALIZED : state;
    }

    public boolean q() {
        return false;
    }

    public final void r(tls tlsVar) {
        p950.a();
        if (!u() && !this.B) {
            xby.t(p950.a, "NavigationRouter:goBack:invalidState", new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not attached for goBack")), null, 10);
            return;
        }
        sy60 sy60Var = this.w;
        Object obj = this.x;
        if (obj != null) {
            l(obj);
        } else {
            xby.t(p950.a, "NavigationRouter:" + p() + ":missingPayload", new NavigationRouterException("Router [" + b64.f(this) + "] can't get payload on state " + p()), null, 10);
        }
        if (sy60Var != null) {
            tlsVar.invoke(sy60Var);
        }
        if (w()) {
            return;
        }
        this.x = null;
    }

    public final boolean t() {
        if (w()) {
            return kotlin.collections.a.E(this.b);
        }
        wby wbyVar = p950.a;
        new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not launched for checking if child launched"));
        wbyVar.getClass();
        return false;
    }

    public final boolean u() {
        return p().a(Lifecycle.State.STARTED);
    }

    public final boolean v(m950 m950Var) {
        if (w()) {
            return kotlin.collections.a.G(this.b, m950Var);
        }
        wby wbyVar = p950.a;
        new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is not launched for checking if child launched"));
        wbyVar.getClass();
        return false;
    }

    public final boolean w() {
        return this.w != null;
    }

    public final boolean x() {
        return p().a(Lifecycle.State.RESUMED);
    }

    public final void y(Object obj, sy60 sy60Var) {
        p950.a();
        if (w()) {
            p950.a.j(new NavigationRouterException(oyr.p("Router [", b64.f(this), "] is already launched")));
            return;
        }
        this.w = sy60Var;
        this.x = obj;
        o950 o950Var = this.C;
        if ((o950Var != null ? o950Var.w : null) != Lifecycle.State.INITIALIZED) {
            this.C = new o950(this);
        }
        wby wbyVar = p950.a;
        qoi0.a(getClass()).d();
        wbyVar.getClass();
        if (this.A.get() != null) {
            N(Lifecycle.State.CREATED);
            this.B = true;
            J(obj);
            this.B = false;
            return;
        }
        N(Lifecycle.State.RESUMED);
        J(obj);
        G(obj);
        K(obj);
    }

    public final void z(m950 m950Var, sy60 sy60Var) {
        B(m950Var, zy11.a, sy60Var, p1j0.a);
    }

    public h55() {
        this(null);
    }
}

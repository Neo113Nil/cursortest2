package xsna;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.drawee.components.DraweeEventTracker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.Executor;
import xsna.cq70;
import xsna.fsl;
import xsna.jqj;

/* compiled from: AbstractDraweeController.java */
/* loaded from: classes12.dex */
public abstract class ce<T, INFO> implements dlo, fsl.a {
    public static final Map<String, Object> t = ImmutableMap.a("component_tag", "drawee");
    public static final Map<String, Object> u = ImmutableMap.b("origin", "memory_bitmap", "origin_sub", "shortcut");
    public static final Class<?> v = ce.class;
    public final DraweeEventTracker a;
    public final fsl b;
    public final Executor c;
    public hfg0 d;
    public eot e;
    public kqj<INFO> f;
    public final g9s<INFO> g;
    public kzi0 h;
    public q2l i;
    public String j;
    public Object k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public zuk<T> p;
    public T q;
    public boolean r;
    public Drawable s;

    /* compiled from: AbstractDraweeController.java */
    public class a extends ic6<T> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // xsna.ic6, xsna.vvk
        public final void b(zuk<T> zukVar) {
            boolean c = zukVar.c();
            float progress = zukVar.getProgress();
            String str = this.a;
            ce ceVar = ce.this;
            if (!ceVar.p(str, zukVar)) {
                ceVar.q("ignore_old_datasource @ onProgress", null);
                zukVar.close();
            } else {
                if (c) {
                    return;
                }
                ceVar.h.c(progress, false);
            }
        }

        @Override // xsna.ic6
        public final void e(zuk<T> zukVar) {
            ce.this.u(this.a, zukVar, zukVar.b(), true);
        }

        @Override // xsna.ic6
        public final void f(zuk<T> zukVar) {
            boolean c = zukVar.c();
            float progress = zukVar.getProgress();
            T result = zukVar.getResult();
            ce ceVar = ce.this;
            if (result != null) {
                ceVar.w(this.a, zukVar, result, progress, c, this.b, false);
            } else if (c) {
                ceVar.u(this.a, zukVar, new NullPointerException(), true);
            }
        }
    }

    /* compiled from: AbstractDraweeController.java */
    public static class b<INFO> extends h9s<INFO> {
    }

    public ce(fsl fslVar, Executor executor) {
        this.a = DraweeEventTracker.c ? new DraweeEventTracker() : DraweeEventTracker.b;
        this.g = new g9s<>();
        this.r = true;
        this.b = fslVar;
        this.c = executor;
        o(null, null);
    }

    public final void A(String str, T t2, zuk<T> zukVar) {
        mjw l = l(t2);
        kqj<INFO> i = i();
        Object obj = this.s;
        i.e(str, l, obj instanceof Animatable ? (Animatable) obj : null);
        this.g.f(str, l, s(zukVar != null ? zukVar.getExtras() : null, t(l)));
    }

    public final boolean B() {
        hfg0 hfg0Var;
        return this.n && (hfg0Var = this.d) != null && hfg0Var.a && hfg0Var.c < hfg0Var.b;
    }

    public void C() {
        if (lhs.d()) {
            lhs.a("AbstractDraweeController#submitRequest");
        }
        T h = h();
        DraweeEventTracker draweeEventTracker = this.a;
        if (h == null) {
            draweeEventTracker.a(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
            this.h.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            this.m = true;
            this.n = false;
            zuk<T> j = j();
            this.p = j;
            i().f(this.k, this.j);
            String str = this.j;
            Object obj = this.k;
            m();
            this.g.c(str, obj, s(j == null ? null : j.getExtras(), t(null)));
            if (ahq.a.a(2)) {
                ahq.h(v, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.j, Integer.valueOf(System.identityHashCode(this.p)));
            }
            this.p.d(new a(this.j, this.p.a()), this.c);
            if (lhs.d()) {
                lhs.b();
                return;
            }
            return;
        }
        if (lhs.d()) {
            lhs.a("AbstractDraweeController#submitRequest->cache");
        }
        this.p = null;
        this.m = true;
        this.n = false;
        draweeEventTracker.a(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
        zuk<T> zukVar = this.p;
        mjw l = l(h);
        i().f(this.k, this.j);
        String str2 = this.j;
        Object obj2 = this.k;
        m();
        this.g.c(str2, obj2, s(zukVar != null ? zukVar.getExtras() : null, t(l)));
        v(h);
        w(this.j, this.p, h, 1.0f, true, true, true);
        if (lhs.d()) {
            lhs.b();
        }
        if (lhs.d()) {
            lhs.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(kqj<? super INFO> kqjVar) {
        kqjVar.getClass();
        kqj<INFO> kqjVar2 = this.f;
        if (kqjVar2 instanceof b) {
            ((b) kqjVar2).g(kqjVar);
            return;
        }
        if (kqjVar2 == null) {
            this.f = kqjVar;
            return;
        }
        if (lhs.d()) {
            lhs.a("AbstractDraweeController#createInternal");
        }
        b bVar = new b();
        bVar.g(kqjVar2);
        bVar.g(kqjVar);
        if (lhs.d()) {
            lhs.b();
        }
        this.f = bVar;
    }

    @Override // xsna.dlo
    public final void b() {
        if (lhs.d()) {
            lhs.a("AbstractDraweeController#onAttach");
        }
        if (ahq.a.a(2)) {
            ahq.h(v, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.j, this.m ? "request already submitted" : "request needs submit");
        }
        this.a.a(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.h.getClass();
        this.b.a(this);
        this.l = true;
        if (!this.m) {
            C();
        }
        if (lhs.d()) {
            lhs.b();
        }
    }

    @Override // xsna.dlo
    public final void c() {
        if (lhs.d()) {
            lhs.a("AbstractDraweeController#onDetach");
        }
        if (ahq.a.a(2)) {
            ahq.g(v, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.j);
        }
        this.a.a(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
        this.l = false;
        gsl gslVar = (gsl) this.b;
        gslVar.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            synchronized (gslVar.b) {
                try {
                    if (!gslVar.d.contains(this)) {
                        gslVar.d.add(this);
                        boolean z = gslVar.d.size() == 1;
                        if (z) {
                            gslVar.c.post(gslVar.f);
                        }
                    }
                } finally {
                }
            }
        } else {
            release();
        }
        if (lhs.d()) {
            lhs.b();
        }
    }

    @Override // xsna.dlo
    public final boolean d(MotionEvent motionEvent) {
        ce ceVar;
        boolean a2 = ahq.a.a(2);
        Class<?> cls = v;
        if (a2) {
            ahq.h(cls, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.j, motionEvent);
        }
        eot eotVar = this.e;
        if (eotVar == null || (!eotVar.c && !B())) {
            return false;
        }
        eot eotVar2 = this.e;
        float f = eotVar2.b;
        int action = motionEvent.getAction();
        if (action == 0) {
            eotVar2.c = true;
            eotVar2.d = true;
            eotVar2.e = motionEvent.getEventTime();
            eotVar2.f = motionEvent.getX();
            eotVar2.g = motionEvent.getY();
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    eotVar2.c = false;
                    eotVar2.d = false;
                    return true;
                }
            } else if (Math.abs(motionEvent.getX() - eotVar2.f) > f || Math.abs(motionEvent.getY() - eotVar2.g) > f) {
                eotVar2.d = false;
                return true;
            }
            return true;
        }
        eotVar2.c = false;
        if (Math.abs(motionEvent.getX() - eotVar2.f) > f || Math.abs(motionEvent.getY() - eotVar2.g) > f) {
            eotVar2.d = false;
        }
        if (eotVar2.d && motionEvent.getEventTime() - eotVar2.e <= ViewConfiguration.getLongPressTimeout() && (ceVar = eotVar2.a) != null) {
            if (ahq.a.a(2)) {
                ahq.g(cls, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(ceVar)), ceVar.j);
            }
            if (ceVar.B()) {
                ceVar.d.c++;
                ceVar.h.reset();
                ceVar.C();
            }
        }
        eotVar2.d = false;
        return true;
    }

    @Override // xsna.dlo
    public void e(elo eloVar) {
        if (ahq.a.a(2)) {
            ahq.h(v, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.j, eloVar);
        }
        this.a.a(eloVar != null ? DraweeEventTracker.Event.ON_SET_HIERARCHY : DraweeEventTracker.Event.ON_CLEAR_HIERARCHY);
        if (this.m) {
            this.b.a(this);
            release();
        }
        kzi0 kzi0Var = this.h;
        if (kzi0Var != null) {
            kzi0Var.e(null);
            this.h = null;
        }
        if (eloVar != null) {
            if (!(eloVar instanceof kzi0)) {
                throw new IllegalArgumentException();
            }
            kzi0 kzi0Var2 = (kzi0) eloVar;
            this.h = kzi0Var2;
            kzi0Var2.e(this.i);
        }
    }

    @Override // xsna.dlo
    public final kzi0 f() {
        return this.h;
    }

    public abstract Drawable g(T t2);

    public T h() {
        return null;
    }

    public final kqj<INFO> i() {
        kqj<INFO> kqjVar = this.f;
        return kqjVar == null ? fc6.b : kqjVar;
    }

    public abstract zuk<T> j();

    public int k(T t2) {
        return System.identityHashCode(t2);
    }

    public abstract mjw l(Object obj);

    public Uri m() {
        return null;
    }

    public final kzi0 n() {
        kzi0 kzi0Var = this.h;
        if (kzi0Var != null) {
            return kzi0Var;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.k);
    }

    public final synchronized void o(Object obj, String str) {
        fsl fslVar;
        try {
            if (lhs.d()) {
                lhs.a("AbstractDraweeController#init");
            }
            this.a.a(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
            if (!this.r && (fslVar = this.b) != null) {
                fslVar.a(this);
            }
            this.l = false;
            y();
            this.o = false;
            hfg0 hfg0Var = this.d;
            if (hfg0Var != null) {
                hfg0Var.a = false;
                hfg0Var.b = 4;
                hfg0Var.c = 0;
            }
            eot eotVar = this.e;
            if (eotVar != null) {
                eotVar.a = null;
                eotVar.c = false;
                eotVar.d = false;
                eotVar.a = this;
            }
            kqj<INFO> kqjVar = this.f;
            if (kqjVar instanceof b) {
                b bVar = (b) kqjVar;
                synchronized (bVar) {
                    bVar.b.clear();
                }
            } else {
                this.f = null;
            }
            kzi0 kzi0Var = this.h;
            if (kzi0Var != null) {
                kzi0Var.reset();
                this.h.e(null);
                this.h = null;
            }
            this.i = null;
            if (ahq.a.a(2)) {
                ahq.h(v, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.j, str);
            }
            this.j = str;
            this.k = obj;
            if (lhs.d()) {
                lhs.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean p(String str, zuk<T> zukVar) {
        if (zukVar == null && this.p == null) {
            return true;
        }
        return str.equals(this.j) && zukVar == this.p && this.m;
    }

    public final void q(String str, Throwable th) {
        if (ahq.a.a(2)) {
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            if (ahq.a.a(2)) {
                bhq.b(2, v.getSimpleName(), String.format(null, "controller %x %s: %s: failure: %s", valueOf, str2, str, th));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(Object obj, String str) {
        if (ahq.a.a(2)) {
            Object[] objArr = {Integer.valueOf(System.identityHashCode(this)), this.j, str, obj != 0 ? obj.getClass().getSimpleName() : "<null>", Integer.valueOf(k(obj))};
            if (ahq.a.a(2)) {
                bhq.b(2, v.getSimpleName(), String.format(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    @Override // xsna.fsl.a
    public final void release() {
        this.a.a(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
        hfg0 hfg0Var = this.d;
        if (hfg0Var != null) {
            hfg0Var.c = 0;
        }
        eot eotVar = this.e;
        if (eotVar != null) {
            eotVar.c = false;
            eotVar.d = false;
        }
        kzi0 kzi0Var = this.h;
        if (kzi0Var != null) {
            kzi0Var.reset();
        }
        y();
    }

    public final jqj.a s(Map map, Map map2) {
        kzi0 kzi0Var = this.h;
        if (kzi0Var instanceof njt) {
            njt njtVar = (njt) kzi0Var;
            String.valueOf(!(njtVar.k(2) instanceof a5h0) ? null : njtVar.l(2).f);
            if (njtVar.k(2) instanceof a5h0) {
                PointF pointF = njtVar.l(2).h;
            }
        }
        kzi0 kzi0Var2 = this.h;
        Rect bounds = kzi0Var2 != null ? kzi0Var2.getBounds() : null;
        Object obj = this.k;
        jqj.a aVar = new jqj.a();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        aVar.e = obj;
        aVar.c = map;
        aVar.d = map2;
        aVar.b = u;
        aVar.a = t;
        return aVar;
    }

    public abstract Map<String, Object> t(INFO info);

    public String toString() {
        cq70.a b2 = cq70.b(this);
        b2.c("isAttached", this.l);
        b2.c("isRequestSubmitted", this.m);
        b2.c("hasFetchFailed", this.n);
        b2.a(k(this.q), "fetchedImage");
        b2.d(this.a.a.toString(), "events");
        return b2.toString();
    }

    public final void u(String str, zuk<T> zukVar, Throwable th, boolean z) {
        Drawable drawable;
        if (lhs.d()) {
            lhs.a("AbstractDraweeController#onFailureInternal");
        }
        if (!p(str, zukVar)) {
            q("ignore_old_datasource @ onFailure", th);
            zukVar.close();
            if (lhs.d()) {
                lhs.b();
                return;
            }
            return;
        }
        this.a.a(z ? DraweeEventTracker.Event.ON_DATASOURCE_FAILURE : DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT);
        g9s<INFO> g9sVar = this.g;
        if (z) {
            q("final_failed @ onFailure", th);
            this.p = null;
            this.n = true;
            kzi0 kzi0Var = this.h;
            if (kzi0Var != null) {
                if (this.o && (drawable = this.s) != null) {
                    kzi0Var.d(drawable, 1.0f, true);
                } else if (B()) {
                    kzi0Var.f();
                } else {
                    kzi0Var.b();
                }
            }
            jqj.a s = s(zukVar == null ? null : zukVar.getExtras(), t(null));
            i().b(this.j, th);
            g9sVar.e(this.j, th, s);
        } else {
            q("intermediate_failed @ onFailure", th);
            i().c(this.j, th);
            g9sVar.b(this.j);
        }
        if (lhs.d()) {
            lhs.b();
        }
    }

    public final void w(String str, zuk<T> zukVar, T t2, float f, boolean z, boolean z2, boolean z3) {
        try {
            if (lhs.d()) {
                lhs.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!p(str, zukVar)) {
                r(t2, "ignore_old_datasource @ onNewResult");
                z(t2);
                zukVar.close();
                if (lhs.d()) {
                    lhs.b();
                    return;
                }
                return;
            }
            this.a.a(z ? DraweeEventTracker.Event.ON_DATASOURCE_RESULT : DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable g = g(t2);
                T t3 = this.q;
                Drawable drawable = this.s;
                this.q = t2;
                this.s = g;
                try {
                    if (z) {
                        r(t2, "set_final_result @ onNewResult");
                        this.p = null;
                        n().d(g, 1.0f, z2);
                        A(str, t2, zukVar);
                    } else if (z3) {
                        r(t2, "set_temporary_result @ onNewResult");
                        n().d(g, 1.0f, z2);
                        A(str, t2, zukVar);
                    } else {
                        r(t2, "set_intermediate_result @ onNewResult");
                        n().d(g, f, z2);
                        mjw l = l(t2);
                        i().a(l, str);
                        this.g.a(l, str);
                    }
                    if (drawable != null && drawable != g) {
                        x(drawable);
                    }
                    if (t3 != null && t3 != t2) {
                        r(t3, "release_previous_result @ onNewResult");
                        z(t3);
                    }
                    if (lhs.d()) {
                        lhs.b();
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != g) {
                        x(drawable);
                    }
                    if (t3 != null && t3 != t2) {
                        r(t3, "release_previous_result @ onNewResult");
                        z(t3);
                    }
                    throw th;
                }
            } catch (Exception e) {
                r(t2, "drawable_failed @ onNewResult");
                z(t2);
                u(str, zukVar, e, z);
                if (lhs.d()) {
                    lhs.b();
                }
            }
        } catch (Throwable th2) {
            if (lhs.d()) {
                lhs.b();
            }
            throw th2;
        }
    }

    public abstract void x(Drawable drawable);

    public final void y() {
        Map<String, Object> map;
        boolean z = this.m;
        this.m = false;
        this.n = false;
        zuk<T> zukVar = this.p;
        Map<String, Object> map2 = null;
        if (zukVar != null) {
            map = zukVar.getExtras();
            this.p.close();
            this.p = null;
        } else {
            map = null;
        }
        Drawable drawable = this.s;
        if (drawable != null) {
            x(drawable);
        }
        this.s = null;
        T t2 = this.q;
        if (t2 != null) {
            Map<String, Object> t3 = t(l(t2));
            r(this.q, "release");
            z(this.q);
            this.q = null;
            map2 = t3;
        }
        if (z) {
            i().d(this.j);
            this.g.d(this.j, s(map, map2));
        }
    }

    public abstract void z(T t2);

    public void v(Object obj) {
    }
}

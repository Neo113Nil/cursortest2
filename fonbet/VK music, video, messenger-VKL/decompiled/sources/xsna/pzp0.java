package xsna;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.log.L;
import java.util.UUID;
import xsna.mzp0;

/* compiled from: UiMeasuringSessionCoreImpl.kt */
/* loaded from: classes17.dex */
public final class pzp0 implements mzp0 {
    public static final az60 y = new az60(8);
    public static final yil0 z = new yil0(2);
    public final UUID a;
    public final UiMeasuringScreen b;
    public final irk0 c;
    public final boolean d;
    public final mzp0.d e;
    public final mzp0.b f;
    public volatile String g;
    public volatile boolean h;
    public volatile boolean i;
    public final a j;
    public final a k;
    public final a l;
    public final a m;
    public final a n;
    public volatile boolean o;
    public final a p;
    public volatile Boolean q = null;
    public volatile Boolean r = null;
    public final a s;
    public final a t;
    public final a u;
    public final a v;
    public final a w;
    public volatile boolean x;

    /* compiled from: UiMeasuringSessionCoreImpl.kt */
    public final class b implements Runnable {
        public final gzs<a> b;
        public final gzs<a> c;
        public long d;
        public final long e;

        public /* synthetic */ b(pzp0 pzp0Var, gzs gzsVar, gzs gzsVar2) {
            this(gzsVar, gzsVar2, -1L);
        }

        @Override // java.lang.Runnable
        public final void run() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.e > 50) {
                this.d = elapsedRealtime;
            } else {
                long j = this.d;
                if (j == -1) {
                    j = this.c.invoke().d();
                }
                if (elapsedRealtime - j > 1000) {
                    a invoke = this.b.invoke();
                    if (!invoke.a()) {
                        invoke.c = Long.valueOf(j);
                    }
                    pzp0.this.m();
                    return;
                }
            }
            if (pzp0.this.h) {
                return;
            }
            i0q0.d(25L, pzp0.this.new b(this.b, this.c, this.d));
        }

        public b(gzs<a> gzsVar, gzs<a> gzsVar2, long j) {
            this.b = gzsVar;
            this.c = gzsVar2;
            this.d = j;
            this.e = SystemClock.elapsedRealtime();
        }
    }

    /* compiled from: UiMeasuringSessionCoreImpl.kt */
    public static final class c implements ViewTreeObserver.OnDrawListener {
        public boolean b;
        public final /* synthetic */ View d;

        public c(View view) {
            this.d = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            if (this.b) {
                return;
            }
            this.b = true;
            pzp0 pzp0Var = pzp0.this;
            pzp0Var.m.b();
            View view = this.d;
            if (view != null) {
                view.post(new zz9(4, view, this));
            }
            i0q0.d(25L, new b(pzp0Var, new tfm0(pzp0Var, 5), new ye80(pzp0Var, 26)));
        }
    }

    /* compiled from: UiMeasuringSessionCoreImpl.kt */
    public static final class d implements ViewTreeObserver.OnDrawListener {
        public boolean b;
        public final /* synthetic */ View d;

        public d(View view) {
            this.d = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            if (this.b) {
                return;
            }
            this.b = true;
            pzp0 pzp0Var = pzp0.this;
            pzp0Var.k.b();
            View view = this.d;
            view.post(new od6(6, view, this));
            i0q0.d(25L, new b(pzp0Var, new stg0(pzp0Var, 14), new yei0(pzp0Var, 8)));
        }
    }

    public pzp0(UUID uuid, UiMeasuringScreen uiMeasuringScreen, irk0 irk0Var, String str, boolean z2, boolean z3, mzp0.d dVar, mzp0.b bVar) {
        this.a = uuid;
        this.b = uiMeasuringScreen;
        this.c = irk0Var;
        this.d = z3;
        this.e = dVar;
        this.f = bVar;
        this.g = str;
        this.i = z2;
        this.j = new a(uiMeasuringScreen, "sessionStart");
        this.k = new a(uiMeasuringScreen, "fcp");
        this.l = new a(uiMeasuringScreen, "tti");
        this.m = new a(uiMeasuringScreen, "content_fcp");
        this.n = new a(uiMeasuringScreen, "content_tti");
        this.p = new a(uiMeasuringScreen, "sessionInit");
        this.s = new a(uiMeasuringScreen, "dataLoadStart");
        this.t = new a(uiMeasuringScreen, "dataLoaded");
        this.u = new a(uiMeasuringScreen, "firstViewCreated");
        this.v = new a(uiMeasuringScreen, "interactive");
        this.w = new a(uiMeasuringScreen, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
    }

    @Override // xsna.mzp0
    public final UUID Y0() {
        return this.a;
    }

    @Override // xsna.mzp0
    public final void a() {
        this.s.b();
        m();
    }

    @Override // xsna.mzp0
    public final void b() {
        this.q = Boolean.TRUE;
        m();
    }

    @Override // xsna.mzp0
    public final void c(boolean z2) {
        if (this.q == null) {
            this.q = Boolean.valueOf(z2);
        }
        this.t.b();
        m();
    }

    @Override // xsna.mzp0
    public final void d(View view) {
        ViewTreeObserver viewTreeObserver;
        this.w.b();
        m();
        if (this.d) {
            c cVar = new c(view);
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnDrawListener(cVar);
        }
    }

    @Override // xsna.mzp0
    public final void e(View view) {
        this.u.b();
        view.getViewTreeObserver().addOnDrawListener(new d(view));
    }

    @Override // xsna.mzp0
    public final void f() {
        this.h = true;
    }

    @Override // xsna.mzp0
    public final void g() {
        L.e("onLeaveContent");
        this.h = true;
    }

    @Override // xsna.mzp0
    public final void h() {
        this.v.b();
        m();
    }

    @Override // xsna.mzp0
    public final void i() {
        this.r = Boolean.TRUE;
        m();
    }

    @Override // xsna.mzp0
    public final void init() {
        this.p.b();
    }

    @Override // xsna.mzp0
    public final void j() {
        this.i = true;
        m();
    }

    @Override // xsna.mzp0
    public final void k(String str) {
        this.g = str;
    }

    public final int l(a aVar, a aVar2) {
        if (epx.f(this.r, Boolean.TRUE)) {
            return -1;
        }
        return aVar.c(aVar2);
    }

    public final void m() {
        if (this.i && !this.h) {
            if (!this.o && ((epx.f(this.r, Boolean.TRUE) || (this.k.a() && this.l.a())) && (!this.d || (this.m.a() && this.n.a())))) {
                this.o = true;
                final int l = l(this.k, this.j);
                final int l2 = l(this.l, this.j);
                int c2 = !this.d ? -1 : this.m.c(this.w);
                final int c3 = !this.d ? -1 : this.n.c(this.w);
                L.c("W3_UI_MEASURE", new gzs() { // from class: xsna.ozp0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        pzp0 pzp0Var = pzp0.this;
                        int i = l;
                        int i2 = c3;
                        int i3 = l2;
                        StringBuilder sb = new StringBuilder("\n            screen = ");
                        sb.append(pzp0Var.b);
                        sb.append(",\n            screenTag = ");
                        nyh0.a(i, pzp0Var.g, ",\n            fcp = ", ",\n            content_tti = ", sb);
                        return bd3.b(",\n            tti = ", i2, i3, sb);
                    }
                });
                this.e.a(new mzp0.c(l, l2, c2, c3, this.b, this.g, this.a, this.c));
            }
            if (!this.x) {
                Boolean bool = this.q;
                Boolean bool2 = Boolean.TRUE;
                boolean z2 = false;
                boolean z3 = epx.f(bool, bool2) || (this.s.a() && epx.f(this.q, Boolean.FALSE));
                boolean z4 = epx.f(this.r, bool2) && this.w.a();
                if (this.u.a() && this.v.a() && this.k.a() && this.w.a()) {
                    z2 = true;
                }
                if ((z4 || z2) && z3 && (epx.f(this.q, bool2) || (this.t.a() && epx.f(this.q, Boolean.FALSE)))) {
                    this.x = true;
                    int c4 = epx.f(this.q, bool2) ? -1 : this.s.c(this.p);
                    final int c5 = epx.f(this.q, bool2) ? -1 : this.t.c(this.p);
                    final int l3 = l(this.k, this.p);
                    final int l4 = l(this.v, this.p);
                    final int l5 = l(this.u, this.p);
                    final int i = c4;
                    L.c("UI_MEASURE", new gzs() { // from class: xsna.nzp0
                        @Override // xsna.gzs
                        public final Object invoke() {
                            pzp0 pzp0Var = pzp0.this;
                            int i2 = l5;
                            int i3 = l4;
                            int i4 = i;
                            int i5 = c5;
                            int i6 = l3;
                            StringBuilder sb = new StringBuilder("\n            screen = ");
                            sb.append(pzp0Var.b);
                            sb.append(",\n            screenTag = ");
                            nyh0.a(i2, pzp0Var.g, ",\n            timeToFirstViewCreated = ", ",\n            timeToInteractive = ", sb);
                            cgn.a(i3, i4, ",\n            timeToDataLoadStart = ", ",\n            timeToDataLoaded = ", sb);
                            sb.append(i5);
                            sb.append(",\n            timeToContent = ");
                            sb.append(pzp0Var.w.c(pzp0Var.p));
                            sb.append(",\n            timeToFirstFrameDrawn = ");
                            sb.append(i6);
                            return sb.toString();
                        }
                    });
                    this.f.a(new mzp0.a(l5, l4, i, this.w.c(this.p), c5, this.b, Integer.valueOf(l3), this.g, this.a, this.c));
                }
            }
        }
    }

    @Override // xsna.mzp0
    public final void start() {
        this.j.b();
    }

    /* compiled from: UiMeasuringSessionCoreImpl.kt */
    public static final class a {
        public final UiMeasuringScreen a;
        public final String b;
        public volatile Long c;

        public a(UiMeasuringScreen uiMeasuringScreen, String str) {
            this.a = uiMeasuringScreen;
            this.b = str;
            this.c = null;
        }

        public final boolean a() {
            return this.c != null;
        }

        public final void b() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (a()) {
                return;
            }
            this.c = Long.valueOf(elapsedRealtime);
        }

        public final int c(a aVar) {
            String str;
            long j;
            if (aVar.a() && a()) {
                j = d() - aVar.d();
            } else {
                if (!BuildInfo.m()) {
                    StringBuilder a = t33.a("Time ", !aVar.a() ? aVar.b : this.b, " not marked in ");
                    UiMeasuringScreen uiMeasuringScreen = this.a;
                    if (uiMeasuringScreen == null || (str = uiMeasuringScreen.h()) == null) {
                        str = "unspecified";
                    }
                    a.append(str);
                    throw new IllegalStateException(a.toString().toString());
                }
                j = Long.MAX_VALUE;
            }
            return (int) j;
        }

        public final long d() {
            Long l = this.c;
            if (l != null) {
                return l.longValue();
            }
            if (BuildInfo.m()) {
                return Long.MAX_VALUE;
            }
            throw null;
        }

        public a() {
            this(null, "");
        }
    }
}

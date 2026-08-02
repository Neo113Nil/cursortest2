package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.u870;

/* compiled from: PushSubscriberNew.kt */
/* loaded from: classes.dex */
public abstract class nke0 implements kke0 {
    public static final a k = new a(0);
    public final bpn0 b;
    public final u870.a.C3789a c;
    public final ohp0 d;
    public int e;
    public io.reactivex.rxjava3.disposables.b f;
    public volatile er6 g;
    public final bpn0 h;
    public volatile boolean i;
    public Boolean j;

    /* compiled from: PushSubscriberNew.kt */
    public static final class a {
        public final long a;
        public final String b;
        public final int c;
        public final String d;
        public final boolean e;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthData(uid=");
            sb.append(this.a);
            sb.append(", token=");
            sb.append(this.b);
            sb.append(", appVersion=");
            sb.append(this.c);
            sb.append(", companionApps=");
            return ho8.a(sb, this.d, ')');
        }

        public /* synthetic */ a(int i) {
            this(0, "", "", 0L);
        }

        public a(int i, String str, String str2, long j) {
            this.a = j;
            this.b = str;
            this.c = i;
            this.d = str2;
            this.e = j > 0;
        }
    }

    public nke0(bpn0 bpn0Var, u870.a.C3789a c3789a) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        this.b = bpn0Var;
        this.c = c3789a;
        this.d = bVar;
        this.f = new io.reactivex.rxjava3.disposables.b();
        this.g = new er6(8);
        this.h = new bpn0(new fr6(13));
        this.i = true;
    }

    @Override // xsna.kke0
    public final void a(boolean z, Boolean bool) {
        h(z, false, bool);
    }

    @Override // xsna.kke0
    public final void b(String str, gzs gzsVar) {
        this.f.dispose();
        this.f = new io.reactivex.rxjava3.disposables.b();
        asu0.a.getClass();
        ((ScheduledExecutorService) asu0.Z.getValue()).execute(new hhv(this, str, gzsVar));
    }

    @Override // xsna.kke0
    public final void c() {
        boolean f = zqn0.a.f();
        if (this.j == null || Boolean.valueOf(f).equals(this.j)) {
            return;
        }
        this.j = Boolean.valueOf(f);
        a((r2 & 1) == 0, null);
    }

    @Override // xsna.kke0
    public final void e() {
        a((r2 & 1) == 0, null);
    }

    public abstract String f();

    public abstract String g();

    public final void h(final boolean z, final boolean z2, final Boolean bool) {
        this.f.dispose();
        this.f = new io.reactivex.rxjava3.disposables.b();
        com.vk.core.utils.newtork.b.a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.b1 b1Var = new io.reactivex.rxjava3.internal.operators.observable.b1(new io.reactivex.rxjava3.internal.operators.observable.i0(com.vk.core.utils.newtork.b.e.A(1L, TimeUnit.SECONDS), new j45(new haj(1), 1)).t0(1L));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        bpn0 bpn0Var = asu0.a0;
        io.reactivex.rxjava3.internal.operators.completable.y q = b1Var.q((io.reactivex.rxjava3.core.w) bpn0Var.getValue());
        asu0Var.getClass();
        this.f.b(q.o((io.reactivex.rxjava3.core.w) bpn0Var.getValue()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.lke0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                ohp0 ohp0Var;
                nke0 nke0Var = nke0.this;
                try {
                    nke0Var.j(z, z2, bool);
                } catch (Throwable th) {
                    if (!(th instanceof InterruptedException) && (ohp0Var = nke0Var.d) != null) {
                        ohp0Var.a(th);
                    }
                    throw th;
                }
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void i(String str) {
        io.reactivex.rxjava3.core.x w0;
        uev0 uev0Var = (uev0) this;
        if (myc0.f(uev0Var.g())) {
            boolean z = Preference.f("multi_push_settings_prefs").getBoolean("is_multi_push_disabled", true);
            String g = uev0Var.g();
            int S = z4g.d().S();
            String f = uev0Var.f();
            mxv c = g2v.c();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            oh00 oh00Var = new oh00(g, S, f, c.f(context), z4g.d().d(), Collections.singletonList(str), z);
            a1w a1wVar = q1w.a;
            w0 = (a1wVar != null ? a1wVar : null).C(rsr.x("PushSubscriberNew", new Throwable()), oh00Var);
        } else {
            xsg0 xsg0Var = new xsg0();
            xsg0Var.c = true;
            o25.a().getClass();
            xsg0Var.l = str;
            xsg0Var.m = "";
            xsg0Var.p = true;
            Context context2 = e43.a;
            xsg0Var.K("device_id", b6m.b(context2 != null ? context2 : null));
            xsg0Var.G("exchange_tokens", (List) uev0Var.o.getValue());
            w0 = rsg0.w0(xsg0Var);
        }
        this.f.b(hg1.i(w0, new t6c0(3)));
        if (o25.a().b()) {
            return;
        }
        ((ebl) uev0Var.m.getValue()).b(k);
        z4g.d().b();
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void j(boolean z, boolean z2, Boolean bool) {
        uev0 uev0Var = (uev0) this;
        a a2 = ((ebl) uev0Var.m.getValue()).a();
        if (g().length() == 0) {
            if (!((yjq) this.b.getValue()).a()) {
                h(z, z2, bool);
                return;
            }
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"[Push][Subscriber] Started fallback engine, reason = EmptyPushToken"});
            }
            if (((Boolean) this.h.getValue()).booleanValue()) {
                a201.a().a();
            }
            i0q0.f(new pxv(this, 6));
            this.f.dispose();
            return;
        }
        if (!o25.a().b() || z2) {
            if (a2.e && !z2) {
                i(o25.a().h());
                return;
            } else {
                if (z2 && ((Boolean) this.g.invoke()).booleanValue()) {
                    this.e++;
                    this.f.b(hg1.i(uev0Var.l(uev0Var.k(false, Boolean.FALSE).i(), true), new c220(17)));
                    return;
                }
                return;
            }
        }
        this.e++;
        a aVar = new a(z4g.d().S(), g(), f(), o25.a().c().b);
        a a3 = ((ebl) uev0Var.m.getValue()).a();
        if (this.i || z || !a3.equals(aVar)) {
            Pair<le6<s3q0>, akq> k2 = uev0Var.k(true, bool);
            Pair pair = new Pair(uev0Var.l(k2.i(), false), k2.j());
            this.f.b(((io.reactivex.rxjava3.core.x) pair.d()).m(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new oyr(new mke0(this, aVar, (akq) pair.g(), z, bool), 17)));
        }
    }
}

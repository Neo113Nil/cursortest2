package xsna;

import android.content.Context;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.FeedFeatures;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;
import xsna.c63;
import xsna.p1v;

/* compiled from: NewsfeedHeater.kt */
/* loaded from: classes4.dex */
public final class yk60 {
    public static final yk60 a = new yk60();
    public static final ac60 b;
    public static final ojl c;
    public static final cl60 d;
    public static final AtomicInteger e;
    public static final AtomicInteger f;
    public static final AtomicReference<io.reactivex.rxjava3.disposables.c> g;
    public static final AtomicReference<io.reactivex.rxjava3.disposables.c> h;
    public static final AtomicBoolean i;
    public static final AtomicBoolean j;
    public static final AtomicBoolean k;
    public static final AtomicBoolean l;
    public static final AtomicBoolean m;
    public static final AtomicBoolean n;
    public static final io.reactivex.rxjava3.disposables.b o;
    public static final Object p;
    public static final a q;

    /* compiled from: NewsfeedHeater.kt */
    public static final class a extends c63.b {
        @Override // xsna.c63.b
        public final void s() {
            yk60 yk60Var = yk60.a;
            yk60.n.set(false);
            yk60.l.set(false);
            io.reactivex.rxjava3.disposables.c andSet = yk60.g.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            yk60.c();
        }
    }

    static {
        com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP);
        com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT);
        b = new ac60();
        ojl ojlVar = new ojl();
        ojlVar.a = io.reactivex.rxjava3.subjects.g.O0(2).M0();
        ojlVar.b = io.reactivex.rxjava3.subjects.g.O0(2).M0();
        c = ojlVar;
        cl60 cl60Var = new cl60();
        cl60Var.a = io.reactivex.rxjava3.subjects.g.O0(2).M0();
        cl60Var.b = io.reactivex.rxjava3.subjects.g.O0(2).M0();
        d = cl60Var;
        e = new AtomicInteger(0);
        f = new AtomicInteger(0);
        g = new AtomicReference<>(null);
        h = new AtomicReference<>(null);
        i = new AtomicBoolean(false);
        j = new AtomicBoolean(false);
        k = new AtomicBoolean(false);
        l = new AtomicBoolean(false);
        m = new AtomicBoolean(false);
        n = new AtomicBoolean(false);
        o = new io.reactivex.rxjava3.disposables.b();
        p = msy.a(LazyThreadSafetyMode.NONE, new r(17));
        q = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.p1v$a] */
    public static void a(p1v.c cVar, int i2) {
        ?? r0 = p1v.a.a;
        if ((i2 & 2) != 0) {
            cVar = r0;
        }
        ojl ojlVar = c;
        io.reactivex.rxjava3.subjects.h hVar = ojlVar.b;
        if (hVar != null) {
            hVar.onNext(r0);
        }
        io.reactivex.rxjava3.subjects.h hVar2 = ojlVar.b;
        if (hVar2 != null) {
            hVar2.onComplete();
        }
        cl60 cl60Var = d;
        io.reactivex.rxjava3.subjects.h hVar3 = cl60Var.b;
        if (hVar3 != null) {
            hVar3.onNext(cVar);
        }
        io.reactivex.rxjava3.subjects.h hVar4 = cl60Var.b;
        if (hVar4 != null) {
            hVar4.onComplete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.p1v$a] */
    public static void b(yk60 yk60Var, p1v.d dVar, int i2) {
        ?? r1 = p1v.a.a;
        if ((i2 & 2) != 0) {
            dVar = r1;
        }
        ojl ojlVar = c;
        io.reactivex.rxjava3.subjects.h hVar = ojlVar.a;
        if (hVar != null) {
            hVar.onNext(r1);
        }
        io.reactivex.rxjava3.subjects.h hVar2 = ojlVar.a;
        if (hVar2 != null) {
            hVar2.onComplete();
        }
        cl60 cl60Var = d;
        io.reactivex.rxjava3.subjects.h hVar3 = cl60Var.a;
        if (hVar3 != null) {
            hVar3.onNext(dVar);
        }
        io.reactivex.rxjava3.subjects.h hVar4 = cl60Var.a;
        if (hVar4 != null) {
            hVar4.onComplete();
        }
    }

    public static void c() {
        k.set(false);
        io.reactivex.rxjava3.disposables.c andSet = h.getAndSet(null);
        if (andSet != null) {
            andSet.dispose();
        }
    }

    public static io.reactivex.rxjava3.core.x d(int i2, io.reactivex.rxjava3.internal.operators.single.n nVar) {
        io.reactivex.rxjava3.subjects.h hVar;
        if (l.get() && i2 == 0) {
            int andIncrement = e.getAndIncrement();
            if (f.get() == 0) {
                c();
            }
            if (andIncrement == 0 && (hVar = d.a) != null) {
                io.reactivex.rxjava3.core.q<R> L = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.i0(hVar, new o7(new wo40(5), 26)).C(new wk60()), io.reactivex.rxjava3.internal.functions.a.d, new xk60()).L(new ga40(new or50(nVar, 2), 3), false);
                if (L != 0) {
                    return L.K().n(nVar);
                }
            }
        }
        return nVar;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(Context context) {
        zk60 j3uVar;
        rgd0.a.getClass();
        if (rgd0.b(context)) {
            final int i2 = 0;
            f.set(0);
            j.set(false);
            FeedFeatures feedFeatures = FeedFeatures.FEED_CODEGEN_NEWSFEED;
            feedFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (bVar.a(feedFeatures)) {
                j3uVar = new yzf();
            } else {
                FeedFeatures feedFeatures2 = FeedFeatures.API_GO_REQUEST;
                feedFeatures2.getClass();
                j3uVar = bVar.a(feedFeatures2) ? new j3u(new sua()) : new rz2(b);
            }
            io.reactivex.rxjava3.internal.operators.observable.l2 a2 = j3uVar.a();
            final int i3 = 1;
            k.set(true);
            int i4 = 3;
            h.set(new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(a2, io.reactivex.rxjava3.internal.functions.a.d, new sk60()), new o8k(1)).subscribe(new y730(new oey(11), i4), new w250(new z410(8), i4)));
            e.set(0);
            i.set(false);
            c63 c63Var = c63.a;
            c63.a(q);
            l.set(true);
            new kh60();
            Random random = txz.c;
            io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new aef(i3));
            io.reactivex.rxjava3.internal.operators.single.v vVar2 = new io.reactivex.rxjava3.internal.operators.single.v(new tk60());
            ce60.b.getClass();
            io.reactivex.rxjava3.core.x A = io.reactivex.rxjava3.core.x.A(vVar, vVar2, (((Boolean) p.getValue()).booleanValue() && ce60.m()) ? new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.jh60
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i5 = i3;
                    JSONObject b2 = zeq0.b();
                    if ((i5 & 1) != 0) {
                        e1j0.a.getClass();
                        b2.put("volume", e1j0.d);
                    }
                    return b2.toString();
                }
            }) : new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.jh60
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i5 = i2;
                    JSONObject b2 = zeq0.b();
                    if ((i5 & 1) != 0) {
                        e1j0.a.getClass();
                        b2.put("volume", e1j0.d);
                    }
                    return b2.toString();
                }
            }), new s7(new dji(i4), 25));
            asu0 asu0Var = asu0.a;
            int i5 = 4;
            int i6 = 7;
            g.set(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.r(A.q(asu0Var.c()).m(asu0.r()), new j630(new b140(j3uVar, i5), i6)), new nt1(this, i5)), new rk60()).subscribe(new gl30(new xpt(10), i6), new afs(new bqt(12), 13)));
            FeedFeatures feedFeatures3 = FeedFeatures.WARMUP_GLYPHS;
            feedFeatures3.getClass();
            if (bVar.a(feedFeatures3)) {
                o.b(itg0.l(io.reactivex.rxjava3.core.a.l(new fo1(context, i5)).q(asu0Var.c())));
            }
        }
    }
}

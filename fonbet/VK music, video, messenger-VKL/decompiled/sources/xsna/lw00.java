package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import xsna.jw00;

/* compiled from: MarketCountersManagerImpl.kt */
/* loaded from: classes18.dex */
public final class lw00 implements kw00 {
    public final fy00 a;
    public final mw00 b;
    public final LinkedHashMap c;
    public final io.reactivex.rxjava3.subjects.d<Map<jw00.d, jw00>> d;
    public final Object e;
    public final io.reactivex.rxjava3.disposables.c f;

    /* compiled from: MarketCountersManagerImpl.kt */
    public static final class a {
        public final io.reactivex.rxjava3.disposables.c a;
        public final List<jw00.d> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.reactivex.rxjava3.disposables.c cVar, List<? extends jw00.d> list) {
            this.a = cVar;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubscriptionData(disposable=");
            sb.append(this.a);
            sb.append(", types=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: MarketCountersManagerImpl.kt */
    public static final class b implements ay00 {
        public final UserId a;

        public b() {
            this(null);
        }

        @Override // xsna.ay00
        public final UserId q() {
            return this.a;
        }

        public b(UserId userId) {
            this.a = userId;
        }
    }

    /* compiled from: MarketCountersManagerImpl.kt */
    public static final class c implements ay00 {
        @Override // xsna.ay00
        public final UserId q() {
            return null;
        }
    }

    public lw00(fy00 fy00Var) {
        mw00 mw00Var = new mw00();
        this.a = fy00Var;
        this.b = mw00Var;
        this.c = new LinkedHashMap();
        io.reactivex.rxjava3.core.w b2 = io.reactivex.rxjava3.schedulers.a.b();
        this.d = io.reactivex.rxjava3.subjects.d.O0(new LinkedHashMap());
        this.e = new Object();
        io.reactivex.rxjava3.internal.operators.observable.i0 c2 = hg1.c(new io.reactivex.rxjava3.internal.operators.observable.i0(fy00Var.a(), new rt0(new zqh(this, 28), 20)), ju00.class, ku00.class, hu00.class, iu00.class, gu00.class, fu00.class, b.class);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f = io.reactivex.rxjava3.core.q.V(c2.y(300L, timeUnit).a0(b2).s0(new o7(new yr00(this, 1), 21)), hg1.c(new io.reactivex.rxjava3.internal.operators.observable.i0(fy00Var.a(), new yi2(new ugm(this, 16), 26)), hy00.class, c.class).y(300L, timeUnit).a0(b2).s0(new h7(new qi00(this, 2), 26)), new io.reactivex.rxjava3.internal.operators.observable.i0(hg1.c(fy00Var.a(), ju00.class, ku00.class, hu00.class, iu00.class, gu00.class, fu00.class, b.class), new qa(new vam(this, 23), 26)).a0(b2).s0(new k7(new tcn(this, 16), 21))).h0(Long.MAX_VALUE).subscribe(new jsv(new qpj(this, 28), 3));
    }

    @Override // xsna.kw00
    public final void a(String str, jw00.d[] dVarArr, izs izsVar) {
        io.reactivex.rxjava3.core.w b2 = io.reactivex.rxjava3.android.schedulers.a.b();
        synchronized (this.e) {
            b(str);
            this.c.put(str, new a(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(this.d.U(new w7(new h2s(dVarArr, 12), 25)), new gs00(new ot(28), 1)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).h0(Long.MAX_VALUE).a0(b2).subscribe(new ff3(new y87(izsVar, 4), 17)), rl3.u0(dVarArr)));
            c(str);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.kw00
    public final void b(String str) {
        a aVar = (a) this.c.remove(str);
        if (aVar != null) {
            aVar.a.dispose();
            for (jw00.d dVar : aVar.b) {
                if (!e(dVar)) {
                    io.reactivex.rxjava3.subjects.d<Map<jw00.d, jw00>> dVar2 = this.d;
                    Map<jw00.d, jw00> P0 = dVar2.P0();
                    if (P0 != null) {
                        P0.remove(dVar);
                    }
                    dVar2.onNext(P0);
                }
            }
        }
    }

    @Override // xsna.kw00
    public final void c(String str) {
        a aVar = (a) this.c.get(str);
        if (aVar != null) {
            jw00.d[] dVarArr = (jw00.d[]) aVar.b.toArray(new jw00.d[0]);
            for (jw00.d dVar : (jw00.d[]) Arrays.copyOf(dVarArr, dVarArr.length)) {
                boolean z = dVar instanceof jw00.a.C3150a;
                fy00 fy00Var = this.a;
                if (z) {
                    fy00Var.b(new b(null));
                } else if (dVar instanceof jw00.c.a) {
                    fy00Var.b(new c());
                } else if (dVar instanceof jw00.b.a) {
                    fy00Var.b(new b(((jw00.b.a) dVar).a));
                }
            }
        }
    }

    @Override // xsna.kw00
    public final Map<jw00.d, jw00> d(jw00.d... dVarArr) {
        int length = dVarArr.length;
        io.reactivex.rxjava3.subjects.d<Map<jw00.d, jw00>> dVar = this.d;
        if (length == 0) {
            return dVar.P0();
        }
        Map<jw00.d, jw00> P0 = dVar.P0();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<jw00.d, jw00> entry : P0.entrySet()) {
            if (rl3.G(dVarArr, entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final boolean e(jw00.d dVar) {
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((a) ((Map.Entry) it.next()).getValue()).b.contains(dVar)) {
                return true;
            }
        }
        return false;
    }
}

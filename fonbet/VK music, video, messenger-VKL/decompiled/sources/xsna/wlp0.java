package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* compiled from: Transition.kt */
/* loaded from: classes11.dex */
public final class wlp0<S> {
    public final z46 a;
    public final wlp0<?> b;
    public final String c;
    public final wh50 d;
    public final wh50 e;
    public final ah50 f;
    public final ah50 g;
    public final wh50 h;
    public final SnapshotStateList<wlp0<S>.d<?, ?>> i;
    public final SnapshotStateList<wlp0<?>> j;
    public final wh50 k;

    /* compiled from: Transition.kt */
    public final class a<T, V extends wq2> {
        public final jtp0 a;
        public final wh50 b = androidx.compose.runtime.k.b(null);

        /* compiled from: Transition.kt */
        /* renamed from: xsna.wlp0$a$a, reason: collision with other inner class name */
        public final class C3941a<T, V extends wq2> implements mtk0<T> {
            public final wlp0<S>.d<T, V> b;
            public izs<? super b<S>, ? extends phr<T>> c;
            public Lambda d;

            /* JADX WARN: Multi-variable type inference failed */
            public C3941a(wlp0<S>.d<T, V> dVar, izs<? super b<S>, ? extends phr<T>> izsVar, izs<? super S, ? extends T> izsVar2) {
                this.b = dVar;
                this.c = izsVar;
                this.d = (Lambda) izsVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
            /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
            public final void c(b<S> bVar) {
                Object invoke = this.d.invoke(bVar.f());
                boolean g = wlp0.this.g();
                wlp0<S>.d<T, V> dVar = this.b;
                if (g) {
                    dVar.m(this.d.invoke(bVar.b()), invoke, this.c.invoke(bVar));
                } else {
                    dVar.n(invoke, this.c.invoke(bVar));
                }
            }

            @Override // xsna.mtk0
            public final T getValue() {
                c(wlp0.this.e());
                return (T) ((zak0) this.b.i).getValue();
            }
        }

        public a(jtp0 jtp0Var, String str) {
            this.a = jtp0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C3941a a(izs izsVar, izs izsVar2) {
            wh50 wh50Var = this.b;
            C3941a c3941a = (C3941a) ((zak0) wh50Var).getValue();
            wlp0<S> wlp0Var = wlp0.this;
            if (c3941a == null) {
                Object invoke = izsVar2.invoke(wlp0Var.a.B());
                Object invoke2 = izsVar2.invoke(wlp0Var.a.B());
                jtp0 jtp0Var = this.a;
                wq2 wq2Var = (wq2) jtp0Var.a().invoke(invoke2);
                wq2Var.d();
                wlp0<S>.d<?, ?> dVar = wlp0Var.new d<>(invoke, wq2Var, jtp0Var);
                c3941a = new C3941a(dVar, izsVar, izsVar2);
                ((zak0) wh50Var).setValue(c3941a);
                wlp0Var.i.add(dVar);
            }
            c3941a.d = (Lambda) izsVar2;
            c3941a.c = izsVar;
            c3941a.c(wlp0Var.e());
            return c3941a;
        }
    }

    /* compiled from: Transition.kt */
    public interface b<S> {
        default boolean a(S s, S s2) {
            return epx.f(s, b()) && epx.f(s2, f());
        }

        S b();

        S f();
    }

    /* compiled from: Transition.kt */
    public static final class c<S> implements b<S> {
        public final S a;
        public final S b;

        public c(S s, S s2) {
            this.a = s;
            this.b = s2;
        }

        @Override // xsna.wlp0.b
        public final S b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.b()) && epx.f(this.b, bVar.f());
        }

        @Override // xsna.wlp0.b
        public final S f() {
            return this.b;
        }

        public final int hashCode() {
            S s = this.a;
            int hashCode = (s != null ? s.hashCode() : 0) * 31;
            S s2 = this.b;
            return hashCode + (s2 != null ? s2.hashCode() : 0);
        }
    }

    /* compiled from: Transition.kt */
    public final class d<T, V extends wq2> implements mtk0<T> {
        public final itp0<T, V> b;
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;
        public final kg50 g;
        public boolean h;
        public final wh50 i;
        public V j;
        public final ah50 k;
        public boolean l;
        public final xmk0 m;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.util.Map] */
        public d(Object obj, wq2 wq2Var, itp0 itp0Var) {
            this.b = itp0Var;
            wh50 b = androidx.compose.runtime.k.b(obj);
            this.c = b;
            T t = null;
            wh50 b2 = androidx.compose.runtime.k.b(jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7));
            this.d = b2;
            this.e = androidx.compose.runtime.k.b(new w3o0((phr) ((zak0) b2).getValue(), itp0Var, obj, ((zak0) b).getValue(), wq2Var));
            this.f = androidx.compose.runtime.k.b(Boolean.TRUE);
            this.g = androidx.compose.runtime.d.a(-1.0f);
            this.i = androidx.compose.runtime.k.b(obj);
            this.j = wq2Var;
            this.k = androidx.compose.runtime.j.a(c().b());
            Float f = (Float) c5u0.a.get(itp0Var);
            if (f != null) {
                float floatValue = f.floatValue();
                V invoke = itp0Var.a().invoke(obj);
                int b3 = invoke.b();
                for (int i = 0; i < b3; i++) {
                    invoke.e(floatValue, i);
                }
                t = this.b.b().invoke(invoke);
            }
            this.m = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, t, 3);
        }

        public final w3o0<T, V> c() {
            return (w3o0) ((zak0) this.e).getValue();
        }

        @Override // xsna.mtk0
        public final T getValue() {
            return (T) ((zak0) this.i).getValue();
        }

        public final void h() {
            if (((vak0) this.g).getFloatValue() == -1.0f) {
                this.l = true;
                boolean f = epx.f(c().c, c().d);
                wh50 wh50Var = this.i;
                if (f) {
                    ((zak0) wh50Var).setValue(c().c);
                } else {
                    ((zak0) wh50Var).setValue(c().e(0L));
                    this.j = c().g(0L);
                }
            }
        }

        public final void j(T t, boolean z) {
            zak0 zak0Var = (zak0) this.c;
            boolean f = epx.f(null, zak0Var.getValue());
            ah50 ah50Var = this.k;
            wh50 wh50Var = this.e;
            phr phrVar = this.m;
            if (f) {
                ((zak0) wh50Var).setValue(new w3o0(phrVar, this.b, t, t, this.j.c()));
                this.h = true;
                ((xak0) ah50Var).p(c().b());
                return;
            }
            wh50 wh50Var2 = this.d;
            if (!z || this.l) {
                phrVar = (phr) ((zak0) wh50Var2).getValue();
            } else if (((phr) ((zak0) wh50Var2).getValue()) instanceof xmk0) {
                phrVar = (phr) ((zak0) wh50Var2).getValue();
            }
            wlp0<S> wlp0Var = wlp0.this;
            long d = wlp0Var.d();
            wh50 wh50Var3 = wlp0Var.h;
            long j = 0;
            ((zak0) wh50Var).setValue(new w3o0(d <= 0 ? phrVar : new vpk0(phrVar, wlp0Var.d()), this.b, t, zak0Var.getValue(), this.j));
            ((xak0) ah50Var).p(c().b());
            this.h = false;
            ((zak0) wh50Var3).setValue(Boolean.TRUE);
            if (wlp0Var.g()) {
                SnapshotStateList<wlp0<S>.d<?, ?>> snapshotStateList = wlp0Var.i;
                int size = snapshotStateList.size();
                for (int i = 0; i < size; i++) {
                    wlp0<S>.d<?, ?> dVar = snapshotStateList.get(i);
                    j = Math.max(j, ((xak0) dVar.k).i());
                    dVar.h();
                }
                ((zak0) wh50Var3).setValue(Boolean.FALSE);
            }
        }

        public final void m(T t, T t2, phr<T> phrVar) {
            ((zak0) this.c).setValue(t2);
            ((zak0) this.d).setValue(phrVar);
            if (epx.f(c().d, t) && epx.f(c().c, t2)) {
                return;
            }
            j(t, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void n(T t, phr<T> phrVar) {
            if (this.h && epx.f(t, null)) {
                return;
            }
            wh50 wh50Var = this.c;
            boolean f = epx.f(((zak0) wh50Var).getValue(), t);
            kg50 kg50Var = this.g;
            if (f && ((vak0) kg50Var).getFloatValue() == -1.0f) {
                return;
            }
            ((zak0) wh50Var).setValue(t);
            ((zak0) this.d).setValue(phrVar);
            vak0 vak0Var = (vak0) kg50Var;
            float floatValue = vak0Var.getFloatValue();
            wh50 wh50Var2 = this.i;
            Object value = floatValue == -3.0f ? t : ((zak0) wh50Var2).getValue();
            wh50 wh50Var3 = this.f;
            j(value, !((Boolean) ((zak0) wh50Var3).getValue()).booleanValue());
            ((zak0) wh50Var3).setValue(Boolean.valueOf(vak0Var.getFloatValue() == -3.0f));
            if (vak0Var.getFloatValue() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ((zak0) wh50Var2).setValue(c().e((long) (vak0Var.getFloatValue() * c().b())));
            } else if (vak0Var.getFloatValue() == -3.0f) {
                ((zak0) wh50Var2).setValue(t);
            }
            this.h = false;
            ((vak0) kg50Var).g(-1.0f);
        }

        public final String toString() {
            return "current value: " + ((zak0) this.i).getValue() + ", target: " + ((zak0) this.c).getValue() + ", spec: " + ((phr) ((zak0) this.d).getValue());
        }
    }

    /* compiled from: Transition.kt */
    @b6l(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1222}, m = "invokeSuspend", v = 1)
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        float F$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ wlp0<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wlp0<S> wlp0Var, spj<? super e> spjVar) {
            super(2, spjVar);
            this.this$0 = wlp0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            e eVar = new e(this.this$0, spjVar);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final float h;
            yvj yvjVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar2 = (yvj) this.L$0;
                h = nkn0.h(yvjVar2.getCoroutineContext());
                yvjVar = yvjVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h = this.F$0;
                yvjVar = (yvj) this.L$0;
                kotlin.a.a(obj);
            }
            while (zvj.f(yvjVar)) {
                final wlp0<S> wlp0Var = this.this$0;
                izs izsVar = new izs() { // from class: xsna.ylp0
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        long longValue = ((Long) obj2).longValue();
                        wlp0 wlp0Var2 = wlp0.this;
                        boolean g = wlp0Var2.g();
                        ah50 ah50Var = wlp0Var2.g;
                        if (!g) {
                            xak0 xak0Var = (xak0) ah50Var;
                            if (xak0Var.i() == Long.MIN_VALUE) {
                                ((xak0) ah50Var).p(longValue);
                                ((zak0) ((wh50) wlp0Var2.a.c)).setValue(Boolean.TRUE);
                            }
                            long i2 = longValue - xak0Var.i();
                            float f = h;
                            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                i2 = an10.c(i2 / f);
                            }
                            if (wlp0Var2.b == null) {
                                ((xak0) wlp0Var2.f).p(i2);
                            }
                            wlp0Var2.h(i2, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        return s3q0.a;
                    }
                };
                this.L$0 = yvjVar;
                this.F$0 = h;
                this.label = 1;
                if (i830.a(getContext()).k(izsVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
    }

    public wlp0() {
        throw null;
    }

    public wlp0(z46 z46Var, wlp0<?> wlp0Var, String str) {
        this.a = z46Var;
        this.b = wlp0Var;
        this.c = str;
        this.d = androidx.compose.runtime.k.b(z46Var.B());
        this.e = androidx.compose.runtime.k.b(new c(z46Var.B(), z46Var.B()));
        this.f = androidx.compose.runtime.j.a(0L);
        this.g = androidx.compose.runtime.j.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.h = androidx.compose.runtime.k.b(bool);
        this.i = new SnapshotStateList<>();
        this.j = new SnapshotStateList<>();
        this.k = androidx.compose.runtime.k.b(bool);
        bbk0.b(new ejf0(this, 11));
        z46Var.f0(this);
    }

    public final void a(S s, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(s) : M.y(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1200)");
            }
            if (g()) {
                M.K(467722849);
                M.j();
            } else {
                M.K(466062241);
                k(s);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = bbk0.b(new orj0(this, 11));
                    M.R(x);
                }
                if (((Boolean) ((mtk0) x).getValue()).booleanValue()) {
                    M.K(466470356);
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = bap.j(EmptyCoroutineContext.b, M);
                        M.R(x2);
                    }
                    yvj yvjVar = (yvj) x2;
                    boolean y = M.y(yvjVar) | (i3 == 32);
                    Object x3 = M.x();
                    if (y || x3 == c0012a) {
                        x3 = new lx60(15, yvjVar, this);
                        M.R(x3);
                    }
                    bap.b(yvjVar, this, (izs) x3, M, i3);
                    M.j();
                } else {
                    M.K(467712929);
                    M.j();
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new e8k(this, s, i, 3);
        }
    }

    public final long b() {
        SnapshotStateList<wlp0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((xak0) snapshotStateList.get(i).k).i());
        }
        SnapshotStateList<wlp0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, snapshotStateList2.get(i2).b());
        }
        return j;
    }

    public final boolean c() {
        SnapshotStateList<wlp0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).getClass();
        }
        SnapshotStateList<wlp0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (snapshotStateList2.get(i2).c()) {
                return true;
            }
        }
        return false;
    }

    public final long d() {
        wlp0<?> wlp0Var = this.b;
        return wlp0Var != null ? wlp0Var.d() : this.f.i();
    }

    public final b<S> e() {
        return (b) ((zak0) this.e).getValue();
    }

    public final S f() {
        return (S) ((zak0) this.d).getValue();
    }

    public final boolean g() {
        return ((Boolean) ((zak0) this.k).getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [V extends xsna.wq2, xsna.wq2] */
    public final void h(long j, boolean z) {
        ah50 ah50Var = this.g;
        long i = ((xak0) ah50Var).i();
        z46 z46Var = this.a;
        if (i == Long.MIN_VALUE) {
            ((xak0) ah50Var).p(j);
            ((zak0) ((wh50) z46Var.c)).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((zak0) ((wh50) z46Var.c)).getValue()).booleanValue()) {
            ((zak0) ((wh50) z46Var.c)).setValue(Boolean.TRUE);
        }
        ((zak0) this.h).setValue(Boolean.FALSE);
        SnapshotStateList<wlp0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            wlp0<S>.d<?, ?> dVar = snapshotStateList.get(i2);
            wh50 wh50Var = dVar.f;
            wh50 wh50Var2 = dVar.f;
            if (!((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                long b2 = z ? dVar.c().b() : j;
                ((zak0) dVar.i).setValue(dVar.c().e(b2));
                dVar.j = dVar.c().g(b2);
                if (dVar.c().c(b2)) {
                    ((zak0) wh50Var2).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((zak0) wh50Var2).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList<wlp0<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            wlp0<?> wlp0Var = snapshotStateList2.get(i3);
            wh50 wh50Var3 = wlp0Var.d;
            z46 z46Var2 = wlp0Var.a;
            if (!epx.f(((zak0) wh50Var3).getValue(), z46Var2.B())) {
                wlp0Var.h(j, z);
            }
            if (!epx.f(((zak0) wlp0Var.d).getValue(), z46Var2.B())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        ((xak0) this.g).p(Long.MIN_VALUE);
        z46 z46Var = this.a;
        if (z46Var instanceof bi50) {
            ((bi50) z46Var).S(((zak0) this.d).getValue());
        }
        if (this.b == null) {
            ((xak0) this.f).p(0L);
        }
        ((zak0) ((wh50) z46Var.c)).setValue(Boolean.FALSE);
        SnapshotStateList<wlp0<?>> snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).i();
        }
    }

    public final void j(Object obj, Object obj2) {
        ((xak0) this.g).p(Long.MIN_VALUE);
        z46 z46Var = this.a;
        ((zak0) ((wh50) z46Var.c)).setValue(Boolean.FALSE);
        boolean g = g();
        wh50 wh50Var = this.d;
        if (!g || !epx.f(z46Var.B(), obj) || !epx.f(((zak0) wh50Var).getValue(), obj2)) {
            if (!epx.f(z46Var.B(), obj) && (z46Var instanceof bi50)) {
                ((bi50) z46Var).S(obj);
            }
            ((zak0) wh50Var).setValue(obj2);
            ((zak0) this.k).setValue(Boolean.TRUE);
            ((zak0) this.e).setValue(new c(obj, obj2));
        }
        SnapshotStateList<wlp0<?>> snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            wlp0<?> wlp0Var = snapshotStateList.get(i);
            if (wlp0Var.g()) {
                wlp0Var.j(wlp0Var.a.B(), ((zak0) wlp0Var.d).getValue());
            }
        }
        SnapshotStateList<wlp0<S>.d<?, ?>> snapshotStateList2 = this.i;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).h();
        }
    }

    public final void k(S s) {
        wh50 wh50Var = this.d;
        zak0 zak0Var = (zak0) wh50Var;
        if (epx.f(zak0Var.getValue(), s)) {
            return;
        }
        ((zak0) this.e).setValue(new c(zak0Var.getValue(), s));
        z46 z46Var = this.a;
        if (!epx.f(z46Var.B(), zak0Var.getValue())) {
            z46Var.S(zak0Var.getValue());
        }
        ((zak0) wh50Var).setValue(s);
        if (((xak0) this.g).i() == Long.MIN_VALUE) {
            ((zak0) this.h).setValue(Boolean.TRUE);
        }
        SnapshotStateList<wlp0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((vak0) snapshotStateList.get(i).g).g(-2.0f);
        }
    }

    public final String toString() {
        SnapshotStateList<wlp0<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + snapshotStateList.get(i) + ", ";
        }
        return str;
    }

    /* compiled from: Effects.kt */
    public static final class f implements kgn {
        @Override // xsna.kgn
        public final void dispose() {
        }
    }
}

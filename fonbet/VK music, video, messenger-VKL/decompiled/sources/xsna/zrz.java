package xsna;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.drz;
import xsna.frz;
import xsna.zrz;

/* compiled from: LoaderImpl.kt */
/* loaded from: classes3.dex */
public final class zrz<Data extends frz, Update, Anchor> implements drz<Data> {
    public final yuk<Data, Anchor> a;
    public final zy1<Data, Anchor> b;
    public final yuk<Data, Anchor> c;
    public final zy1<Data, Anchor> d;
    public final i920<Data, Anchor> e;
    public final qsz<Data, Update> f;
    public final gzs<Data> g;
    public final io.reactivex.rxjava3.core.w h;
    public final int i;
    public final d000 j;
    public final dsz<Data> k;
    public final esz l;
    public final boolean m;
    public final io.reactivex.rxjava3.subjects.h n;
    public final io.reactivex.rxjava3.subjects.d<a<Data>> o;
    public final io.reactivex.rxjava3.disposables.b p;
    public final AtomicBoolean q;
    public final LinkedHashMap r;
    public final LinkedHashMap s;

    /* compiled from: LoaderImpl.kt */
    public static final class a<Data> {
        public final Data a;
        public final b b;
        public final b c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public a(Data data, b bVar, b bVar2, boolean z, boolean z2, boolean z3) {
            this.a = data;
            this.b = bVar;
            this.c = bVar2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        public static a a(a aVar, Object obj, b bVar, b bVar2, boolean z, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                obj = aVar.a;
            }
            Object obj2 = obj;
            if ((i & 2) != 0) {
                bVar = aVar.b;
            }
            b bVar3 = bVar;
            if ((i & 4) != 0) {
                bVar2 = aVar.c;
            }
            b bVar4 = bVar2;
            if ((i & 8) != 0) {
                z = aVar.d;
            }
            boolean z4 = z;
            if ((i & 16) != 0) {
                z2 = aVar.e;
            }
            boolean z5 = z2;
            if ((i & 32) != 0) {
                z3 = aVar.f;
            }
            aVar.getClass();
            return new a(obj2, bVar3, bVar4, z4, z5, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            Data data = this.a;
            return Boolean.hashCode(this.f) + qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + ((data == null ? 0 : data.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InnerState(cache=");
            sb.append(this.b);
            sb.append(", network=");
            sb.append(this.c);
            sb.append(", hasMoreInCache=");
            sb.append(this.d);
            sb.append(", hasMoreInNetwork=");
            sb.append(this.e);
            sb.append(", isResetting=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: LoaderImpl.kt */
    public static abstract class b {

        /* compiled from: LoaderImpl.kt */
        public static final class a extends b {
            public static final a a = new a();

            public final String toString() {
                return "Idle";
            }
        }

        /* compiled from: LoaderImpl.kt */
        /* renamed from: xsna.zrz$b$b, reason: collision with other inner class name */
        public static final class C4195b extends b {
            public final int a;

            public C4195b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4195b) && this.a == ((C4195b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Loading("), this.a, ')');
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zrz(yuk<Data, Anchor> yukVar, zy1<Data, Anchor> zy1Var, yuk<Data, Anchor> yukVar2, zy1<Data, Anchor> zy1Var2, i920<Data, Anchor> i920Var, qsz<Data, Update> qszVar, gzs<? extends Data> gzsVar, io.reactivex.rxjava3.core.w wVar, io.reactivex.rxjava3.core.w wVar2, int i, d000 d000Var, dsz<Data> dszVar, esz eszVar, boolean z) {
        this.a = yukVar;
        this.b = zy1Var;
        this.c = yukVar2;
        this.d = zy1Var2;
        this.e = i920Var;
        this.f = qszVar;
        this.g = gzsVar;
        this.h = wVar2;
        this.i = i;
        this.j = d000Var;
        this.k = dszVar;
        this.l = eszVar;
        this.m = z;
        io.reactivex.rxjava3.subjects.h M0 = new io.reactivex.rxjava3.subjects.f().M0();
        this.n = M0;
        Object invoke = gzsVar.invoke();
        b.a aVar = b.a.a;
        io.reactivex.rxjava3.subjects.d<a<Data>> O0 = io.reactivex.rxjava3.subjects.d.O0(new a(invoke, aVar, aVar, true, false, false));
        this.o = O0;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.p = bVar;
        this.q = new AtomicBoolean(false);
        this.r = new LinkedHashMap();
        this.s = new LinkedHashMap();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = M0.a0(wVar).U(new r2v(new bbw(this, 2), 3));
        jad jadVar = new jad(this, 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        U.E(lVar, lVar, io.reactivex.rxjava3.internal.functions.a.c, jadVar).subscribe(O0);
        bVar.b(qszVar.a().subscribe(new xn(new xgv(this, 7), 26)));
    }

    public static boolean e(a aVar) {
        boolean z = aVar.f;
        boolean z2 = aVar.d;
        if (z) {
            return false;
        }
        if (z2 && !epx.f(aVar.b, b.a.a)) {
            return false;
        }
        if (z2 || aVar.e) {
            return z2 || epx.f(aVar.c, b.a.a);
        }
        return false;
    }

    @Override // xsna.drz
    public final void a(final int i) {
        final a<Data> P0 = this.o.P0();
        if (P0 == null) {
            Data invoke = this.g.invoke();
            b.a aVar = b.a.a;
            P0 = new a<>(invoke, aVar, aVar, true, false, false);
        }
        if (e(P0)) {
            AtomicBoolean atomicBoolean = this.q;
            if (atomicBoolean.compareAndSet(false, true)) {
                atomicBoolean.set(true);
                this.l.b();
                this.j.b(new gzs() { // from class: xsna.orz
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return "state: " + zrz.a.this + " load of " + i + " items approved";
                    }
                });
                this.n.onNext(new n6(this, i, 1));
            }
        }
    }

    @Override // xsna.drz
    public final void b(String str) {
        this.l.b();
        this.n.onNext(new az2(17, this, str));
    }

    public final void c() {
        this.j.b(new o6(18));
        LinkedHashMap linkedHashMap = this.r;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.disposables.c) it.next()).dispose();
        }
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = this.s;
        Iterator it2 = linkedHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((io.reactivex.rxjava3.disposables.c) it2.next()).dispose();
        }
        linkedHashMap2.clear();
    }

    public final a<Data> d(a<Data> aVar, String str) {
        foi foiVar = new foi(aVar, 18);
        d000 d000Var = this.j;
        d000Var.b(foiVar);
        if (aVar.f) {
            return aVar;
        }
        if (!aVar.a.c()) {
            d000Var.b(new b1z(aVar, 3));
            return aVar;
        }
        d000Var.b(new n1i(aVar, 21));
        return f(this.i, true, aVar, fo8.a(str, " -> checkExpAndLnchNetLoadIfExpired"));
    }

    public final a<Data> f(final int i, final boolean z, final a<Data> aVar, String str) {
        l2 l2Var = new l2(aVar, i, 2);
        d000 d000Var = this.j;
        d000Var.b(l2Var);
        if (!epx.f(aVar.c, b.a.a)) {
            return aVar;
        }
        d000Var.b(new gzs() { // from class: xsna.srz
            @Override // xsna.gzs
            public final Object invoke() {
                return "state: " + zrz.a.this + " load of " + i + " items from network approved";
            }
        });
        final b.C4195b c4195b = new b.C4195b(i);
        final Anchor n = this.d.n(aVar.a);
        LinkedHashMap linkedHashMap = this.s;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(n);
        if (cVar != null) {
            cVar.dispose();
        }
        linkedHashMap.put(n, io.reactivex.rxjava3.kotlin.c.e(this.c.b(i, str + " -> launchNetworkLoad", n).q(this.h), new jbo(this, str, aVar, 2), new izs() { // from class: xsna.trz
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                final utk utkVar = (utk) obj;
                final zrz zrzVar = zrz.this;
                io.reactivex.rxjava3.subjects.h hVar = zrzVar.n;
                final Object obj2 = n;
                final int i2 = i;
                final zrz.b.C4195b c4195b2 = c4195b;
                final boolean z2 = z;
                hVar.onNext(new izs() { // from class: xsna.wrz
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        zrz.a aVar2 = (zrz.a) obj3;
                        zrz zrzVar2 = zrz.this;
                        d000 d000Var2 = zrzVar2.j;
                        zrz.b bVar = aVar2.c;
                        int i3 = i2;
                        if (c4195b2 != bVar) {
                            d000Var2.b(new rrz(aVar2, i3, 0));
                            return aVar2;
                        }
                        utk utkVar2 = utkVar;
                        d000Var2.b(new y0t(aVar2, utkVar2, i3));
                        i920<Data, Anchor> i920Var = zrzVar2.e;
                        frz frzVar = (frz) aVar2.a;
                        Data data = utkVar2.a;
                        boolean z3 = utkVar2.b;
                        Object obj4 = obj2;
                        frz a2 = i920Var.a(frzVar, (frz) data, obj4);
                        zrzVar2.n.onNext(new w7u(zrzVar2, 7));
                        zrz.b.a aVar3 = zrz.b.a.a;
                        if (z2 && (!zrzVar2.m || !zrzVar2.d.D(obj4))) {
                            z3 = aVar2.e;
                        }
                        zrz.a a3 = zrz.a.a(aVar2, a2, null, aVar3, false, z3, false, 42);
                        zrzVar2.h(a3);
                        return a3;
                    }
                });
                return s3q0.a;
            }
        }));
        return a.a(aVar, null, null, c4195b, false, false, false, 59);
    }

    public final a<Data> g(final int i, final a<Data> aVar, String str) {
        prz przVar = new prz(aVar, i, 0);
        d000 d000Var = this.j;
        d000Var.b(przVar);
        boolean z = aVar.d;
        boolean z2 = aVar.f;
        Data data = aVar.a;
        if (!z && !z2) {
            Data data2 = data;
            if (data2.c()) {
                d000Var.b(new gzs() { // from class: xsna.qrz
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return "state: " + zrz.a.this + " load of " + i + " items from network was rejected because of expiration update";
                    }
                });
                return aVar;
            }
            StringBuilder b2 = xy6.b(i, " ", str, " -> load limit=", " size=");
            b2.append(data2.getSize());
            return f(i, false, aVar, b2.toString());
        }
        final String str2 = str + " -> load state= " + aVar;
        d000Var.b(new gzs() { // from class: xsna.urz
            @Override // xsna.gzs
            public final Object invoke() {
                return "state: " + zrz.a.this + " start load of " + i + " items from cache";
            }
        });
        final b.C4195b c4195b = new b.C4195b(i);
        final Object n = this.b.n(z2 ? this.g.invoke() : data);
        LinkedHashMap linkedHashMap = this.r;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(n);
        if (cVar != null) {
            cVar.dispose();
        }
        linkedHashMap.put(n, io.reactivex.rxjava3.kotlin.c.e(this.a.b(i, "unknown", n).q(this.h), new com.vk.movika.sdk.base.logic.interactor.i(17, this, aVar), new izs() { // from class: xsna.vrz
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                final utk utkVar = (utk) obj;
                final zrz zrzVar = zrz.this;
                io.reactivex.rxjava3.subjects.h hVar = zrzVar.n;
                final Object obj2 = n;
                final int i2 = i;
                final zrz.b.C4195b c4195b2 = c4195b;
                final String str3 = str2;
                hVar.onNext(new izs() { // from class: xsna.xrz
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        final zrz.a aVar2 = (zrz.a) obj3;
                        String a2 = fo8.a(str3, " -> launchCacheLoad");
                        zrz zrzVar2 = zrz.this;
                        d000 d000Var2 = zrzVar2.j;
                        zrz.b bVar = aVar2.b;
                        final int i3 = i2;
                        if (c4195b2 != bVar) {
                            d000Var2.b(new qn1(aVar2, i3, 2));
                            return aVar2;
                        }
                        d000Var2.b(new gzs() { // from class: xsna.yrz
                            @Override // xsna.gzs
                            public final Object invoke() {
                                return "state: " + zrz.a.this + " loaded from cache " + i3 + " items";
                            }
                        });
                        boolean z3 = aVar2.f;
                        frz frzVar = z3 ? (frz) zrzVar2.g.invoke() : (frz) aVar2.a;
                        i920<Data, Anchor> i920Var = zrzVar2.e;
                        utk utkVar2 = utkVar;
                        frz a3 = i920Var.a(frzVar, (frz) utkVar2.a, obj2);
                        zrzVar2.n.onNext(new com.vk.im.engine.commands.messages.a(24, zrzVar2, a2));
                        zrz.b.a aVar3 = zrz.b.a.a;
                        boolean z4 = utkVar2.b;
                        zrz.a a4 = zrz.a.a(aVar2, a3, aVar3, null, z4, !z4 ? zrzVar2.k.d(a3) : aVar2.e, false, 4);
                        if (!z3) {
                            zrzVar2.h(a4);
                        }
                        return a4;
                    }
                });
                return s3q0.a;
            }
        }));
        return a.a(aVar, null, c4195b, null, false, false, false, 61);
    }

    @Override // xsna.drz
    public final io.reactivex.rxjava3.core.q<drz.a<Data>> getState() {
        io.reactivex.rxjava3.subjects.d<a<Data>> dVar = this.o;
        dVar.getClass();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        return new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.y(dVar, qVar, aVar).U(new s41(new per(7), 20)), qVar, aVar);
    }

    public final void h(a<Data> aVar) {
        boolean z = aVar.a.getSize() > 0;
        if (z || !(aVar.d || aVar.e)) {
            this.l.a(z);
        }
    }

    @Override // xsna.drz
    public final void onDestroy() {
        this.n.onComplete();
        this.o.onComplete();
        this.p.e();
    }
}

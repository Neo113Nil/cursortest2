package xsna;

import java.util.function.Consumer;

/* compiled from: DefaultMeter.java */
/* loaded from: classes8.dex */
public final class ril implements yi20 {
    public static final ril a = new ril();
    public static final k b = new k();
    public static final q c = new q();
    public static final g d = new g();
    public static final e e = new e();
    public static final a f = new a();
    public static final r g = new r();
    public static final s h = new s();

    /* compiled from: DefaultMeter.java */
    public class a implements uu6 {
    }

    /* compiled from: DefaultMeter.java */
    public static class b implements h6o {
        @Override // xsna.h6o
        public final void add(double d, q94 q94Var, wmj wmjVar) {
        }

        @Override // xsna.h6o
        public final void add(double d, q94 q94Var) {
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class d implements n6o {
    }

    /* compiled from: DefaultMeter.java */
    public static class f implements p6o {
        @Override // xsna.p6o
        public final void record(double d, q94 q94Var, wmj wmjVar) {
        }

        @Override // xsna.p6o
        public final void record(double d, q94 q94Var) {
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class h implements k7o {
        @Override // xsna.k7o
        public final void add(double d, q94 q94Var, wmj wmjVar) {
        }

        @Override // xsna.k7o
        public final void add(double d, q94 q94Var) {
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class j implements e300 {
        @Override // xsna.e300
        public final void add(long j, q94 q94Var, wmj wmjVar) {
        }

        @Override // xsna.e300
        public final void add(long j, q94 q94Var) {
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class l implements i300 {
    }

    /* compiled from: DefaultMeter.java */
    public static class n implements k300 {
        @Override // xsna.k300
        public final void record(long j, q94 q94Var, wmj wmjVar) {
        }

        @Override // xsna.k300
        public final void record(long j, q94 q94Var) {
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class p implements c600 {
        @Override // xsna.c600
        public final void add(long j, q94 q94Var, wmj wmjVar) {
        }

        @Override // xsna.c600
        public final void add(long j, q94 q94Var) {
        }
    }

    @Override // xsna.yi20
    public final f300 counterBuilder(String str) {
        return b;
    }

    @Override // xsna.yi20
    public final o6o gaugeBuilder(String str) {
        return e;
    }

    @Override // xsna.yi20
    public final q6o histogramBuilder(String str) {
        return d;
    }

    @Override // xsna.yi20
    public final d600 upDownCounterBuilder(String str) {
        return c;
    }

    /* compiled from: DefaultMeter.java */
    public static class c implements i6o {
        public static final b a = new b();
        public static final a b = new a();

        /* compiled from: DefaultMeter.java */
        public class a implements jq70 {
        }

        @Override // xsna.i6o
        public final h6o build() {
            return a;
        }

        @Override // xsna.i6o
        public final jq70 buildWithCallback(Consumer<lq70> consumer) {
            return b;
        }

        @Override // xsna.i6o
        public final i6o setDescription(String str) {
            return this;
        }

        @Override // xsna.i6o
        public final i6o setUnit(String str) {
            return this;
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class e implements o6o {
        public static final a a = new a();
        public static final m b = new m();
        public static final d c = new d();

        /* compiled from: DefaultMeter.java */
        public class a implements kq70 {
        }

        @Override // xsna.o6o
        public final kq70 buildWithCallback(Consumer<lq70> consumer) {
            return a;
        }

        @Override // xsna.o6o
        public final j300 ofLongs() {
            return b;
        }

        @Override // xsna.o6o
        public final o6o setDescription(String str) {
            return this;
        }

        @Override // xsna.o6o
        public final o6o setUnit(String str) {
            return this;
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class g implements q6o {
        public static final f a = new f();
        public static final o b = new o();

        @Override // xsna.q6o
        public final p6o build() {
            return a;
        }

        @Override // xsna.q6o
        public final l300 ofLongs() {
            return b;
        }

        @Override // xsna.q6o
        public final q6o setDescription(String str) {
            return this;
        }

        @Override // xsna.q6o
        public final q6o setUnit(String str) {
            return this;
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class i implements l7o {
        public static final a a = new a();
        public static final b b = new b();

        /* compiled from: DefaultMeter.java */
        public class a extends h {
        }

        /* compiled from: DefaultMeter.java */
        public class b implements mq70 {
        }

        @Override // xsna.l7o
        public final k7o build() {
            return a;
        }

        @Override // xsna.l7o
        public final mq70 buildWithCallback(Consumer<lq70> consumer) {
            return b;
        }

        @Override // xsna.l7o
        public final l7o setDescription(String str) {
            return this;
        }

        @Override // xsna.l7o
        public final l7o setUnit(String str) {
            return this;
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class k implements f300 {
        public static final j a = new j();
        public static final a b = new a();
        public static final c c = new c();

        /* compiled from: DefaultMeter.java */
        public class a implements oq70 {
        }

        @Override // xsna.f300
        public final e300 build() {
            return a;
        }

        @Override // xsna.f300
        public final oq70 buildWithCallback(Consumer<qq70> consumer) {
            return b;
        }

        @Override // xsna.f300
        public final i6o ofDoubles() {
            return c;
        }

        @Override // xsna.f300
        public final f300 setDescription(String str) {
            return this;
        }

        @Override // xsna.f300
        public final f300 setUnit(String str) {
            return this;
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class m implements j300 {
        public static final a a = new a();
        public static final l b = new l();

        /* compiled from: DefaultMeter.java */
        public class a implements pq70 {
        }

        @Override // xsna.j300
        public final pq70 buildWithCallback(Consumer<qq70> consumer) {
            return a;
        }

        @Override // xsna.j300
        public final j300 setDescription(String str) {
            return this;
        }

        @Override // xsna.j300
        public final j300 setUnit(String str) {
            return this;
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class o implements l300 {
        public static final n a = new n();

        @Override // xsna.l300
        public final k300 build() {
            return a;
        }

        @Override // xsna.l300
        public final l300 setDescription(String str) {
            return this;
        }

        @Override // xsna.l300
        public final l300 setUnit(String str) {
            return this;
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class q implements d600 {
        public static final a a = new a();
        public static final b b = new b();
        public static final i c = new i();

        /* compiled from: DefaultMeter.java */
        public class a extends p {
        }

        /* compiled from: DefaultMeter.java */
        public class b implements rq70 {
        }

        @Override // xsna.d600
        public final c600 build() {
            return a;
        }

        @Override // xsna.d600
        public final rq70 buildWithCallback(Consumer<qq70> consumer) {
            return b;
        }

        @Override // xsna.d600
        public final l7o ofDoubles() {
            return c;
        }

        @Override // xsna.d600
        public final d600 setDescription(String str) {
            return this;
        }

        @Override // xsna.d600
        public final d600 setUnit(String str) {
            return this;
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class r implements lq70 {
        @Override // xsna.lq70
        public final void record(double d, q94 q94Var) {
        }
    }

    /* compiled from: DefaultMeter.java */
    public static class s implements qq70 {
        @Override // xsna.qq70
        public final void record(long j, q94 q94Var) {
        }
    }
}

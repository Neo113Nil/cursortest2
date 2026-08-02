package xsna;

import androidx.fragment.app.FragmentManager;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import xsna.or2;
import xsna.r5x0;

/* compiled from: CallVmojiDelegate.kt */
/* loaded from: classes7.dex */
public abstract class va9 {
    public static final b r = new b();
    public final com.vk.voip.b a;
    public final chr0 b;
    public final r5x0.b c;
    public final r5x0.a d;
    public final bpn0 e;
    public final Lazy f;
    public final bpn0 g = new bpn0(new defpackage.e(this, 10));
    public final io.reactivex.rxjava3.subjects.d<g> h = io.reactivex.rxjava3.subjects.d.O0(new g(r, false));
    public final io.reactivex.rxjava3.subjects.f<a> i;
    public final io.reactivex.rxjava3.disposables.b j;
    public io.reactivex.rxjava3.disposables.c k;
    public io.reactivex.rxjava3.disposables.c l;
    public boolean m;
    public String n;
    public final bpn0 o;
    public boolean p;
    public boolean q;

    /* compiled from: CallVmojiDelegate.kt */
    public interface a {
    }

    /* compiled from: CallVmojiDelegate.kt */
    public static final class b implements w5w0 {
        @Override // xsna.w5w0
        public final io.reactivex.rxjava3.core.x<byte[]> a() {
            return io.reactivex.rxjava3.internal.operators.single.a0.b;
        }

        @Override // xsna.w5w0
        public final String b() {
            return "";
        }

        @Override // xsna.w5w0
        public final int getHeight() {
            return 0;
        }

        @Override // xsna.w5w0
        public final int getWidth() {
            return 0;
        }
    }

    /* compiled from: CallVmojiDelegate.kt */
    public interface c extends a {

        /* compiled from: CallVmojiDelegate.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -894665740;
            }

            public final String toString() {
                return "Clear";
            }
        }

        /* compiled from: CallVmojiDelegate.kt */
        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1275605367;
            }

            public final String toString() {
                return "Init";
            }
        }
    }

    /* compiled from: CallVmojiDelegate.kt */
    public static final class d implements a {
        public final w5w0 a;
        public final boolean b;

        public d(w5w0 w5w0Var, boolean z) {
            this.a = w5w0Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetAvatar(avatar=");
            sb.append(this.a);
            sb.append(", byUserRequest=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CallVmojiDelegate.kt */
    public interface e {
        void e();

        void g();

        void h();
    }

    /* compiled from: CallVmojiDelegate.kt */
    public static final class f {
        public final w5w0 a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public f(w5w0 w5w0Var, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = w5w0Var;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VmojiComponentsState(avatar=");
            sb.append(this.a);
            sb.append(", setByUserRequest=");
            sb.append(this.b);
            sb.append(", isInCall=");
            sb.append(this.c);
            sb.append(", isVmojiInited=");
            sb.append(this.d);
            sb.append(", isOwnCameraEnabled=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: CallVmojiDelegate.kt */
    public static final class g {
        public final w5w0 a;
        public final boolean b;

        public g(w5w0 w5w0Var, boolean z) {
            this.a = w5w0Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && this.b == gVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VmojiInternalState(vmoji=");
            sb.append(this.a);
            sb.append(", setByUser=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CallVmojiDelegate.kt */
    public static final class h implements or2.a.InterfaceC3466a {
        public final r5x0.a a;
        public final com.vk.voip.b b;
        public final rew0 c;

        public h(r5x0.a aVar, com.vk.voip.b bVar, rew0 rew0Var) {
            this.a = aVar;
            this.b = bVar;
            this.c = rew0Var;
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final UserId a() {
            return this.c.f();
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final CallId b() {
            return this.b.b();
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final xdw0 c() {
            return this.b.d().a();
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final void d(String str) {
            this.b.d().g(str);
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final boolean e() {
            return this.a.a();
        }
    }

    public va9(com.vk.voip.b bVar, chr0 chr0Var, r5x0.b bVar2, r5x0.a aVar, bpn0 bpn0Var, Lazy lazy) {
        this.a = bVar;
        this.b = chr0Var;
        this.c = bVar2;
        this.d = aVar;
        this.e = bpn0Var;
        this.f = lazy;
        io.reactivex.rxjava3.subjects.f<a> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.i = fVar;
        io.reactivex.rxjava3.disposables.b bVar3 = new io.reactivex.rxjava3.disposables.b();
        this.j = bVar3;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.k = emptyDisposable;
        this.l = emptyDisposable;
        this.o = new bpn0(new defpackage.i(this, 11));
        bVar3.b(fVar.F(new v8(new hv7(L.a, 1), 13)).a0(asu0.a.d()).subscribe(new ph3(new ua9(1, this, va9.class, "applyCommand", "applyCommand(Lcom/vk/voip/ui/vmoji/CallVmojiDelegate$Command;)V", 0), 8)));
        bVar3.b(io.reactivex.rxjava3.kotlin.c.d(a201.b().b().a(), new com.vk.movika.sdk.base.logic.interactor.j(this, 12), new y8(4)));
    }

    public static void c(r5x0 r5x0Var, FragmentManager fragmentManager) {
        r5x0Var.getClass();
        k(new com.vk.movika.sdk.base.ui.r0(6, r5x0Var, fragmentManager));
    }

    public static void k(gzs gzsVar) {
        io.reactivex.rxjava3.kotlin.c.d(a201.b().b().a(), gzsVar, new tw4(L.a, 1));
    }

    public final void a(w5w0 w5w0Var, boolean z) {
        this.i.onNext(new d(w5w0Var, z));
    }

    public final void b() {
        this.i.onNext(c.a.a);
    }

    public final w5w0 d(UserId userId) {
        o5x0 o5x0Var;
        or2 or2Var = (or2) this.b.invoke();
        or2.a aVar = (or2.a) this.o.getValue();
        if (aVar != null) {
            o5x0Var = aVar.a(new h(this.d, this.a, (rew0) this.f.getValue()));
        } else {
            o5x0Var = null;
        }
        return or2Var.f(o5x0Var, userId);
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return this.d.a();
    }

    public final boolean g() {
        return this.q;
    }

    public final io.reactivex.rxjava3.internal.operators.mixed.a h() {
        return a201.b().b().a().d(io.reactivex.rxjava3.core.q.q(new io.reactivex.rxjava3.internal.operators.observable.q2(new io.reactivex.rxjava3.internal.operators.observable.y(io.reactivex.rxjava3.core.q.P(0L, 1000L, TimeUnit.MILLISECONDS).U(new t7(new e60(7), 3)).a0(asu0.a.d()).U(new w7(new jy(this, 19), 9)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new fq(5, new ot(10))), io.reactivex.rxjava3.core.q.T(Boolean.TRUE)));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.p1 i() {
        return new io.reactivex.rxjava3.internal.operators.observable.p1(new io.reactivex.rxjava3.internal.operators.observable.y(this.h.U(new et(new xx0(6), 7)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new mq(new nt(9), 8));
    }

    public final void j(boolean z) {
        boolean z2;
        if (!this.q || this.m == (!z)) {
            return;
        }
        this.m = z2;
        this.a.c(z2, false);
    }

    public final void l() {
        this.i.onNext(c.b.a);
    }
}

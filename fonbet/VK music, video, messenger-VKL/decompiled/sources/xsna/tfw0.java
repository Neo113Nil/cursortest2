package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.utils.Logger;
import xsna.rew0;
import xsna.usi0;

/* compiled from: VoipCallAuthDataProviderImpl.kt */
/* loaded from: classes7.dex */
public final class tfw0 implements rew0, w8i {
    public final d b;
    public b c;
    public final io.reactivex.rxjava3.subjects.d<UserId> d;
    public io.reactivex.rxjava3.disposables.c e;
    public final io.reactivex.rxjava3.disposables.c f;
    public final io.reactivex.rxjava3.disposables.c g;
    public final pfw0 h;

    /* compiled from: VoipCallAuthDataProviderImpl.kt */
    public interface a {
        boolean a(UserId userId);

        String b();

        UserId c();

        io.reactivex.rxjava3.core.q<Boolean> d();

        void e();

        io.reactivex.rxjava3.core.a f(UserId userId);

        List<UserId> g();

        boolean h();

        String i();
    }

    /* compiled from: VoipCallAuthDataProviderImpl.kt */
    public static final class b {
        public static final b d = new b(UserId.d, c.c, false);
        public final UserId a;
        public final c b;
        public final boolean c;

        public b(UserId userId, c cVar, boolean z) {
            this.a = userId;
            this.b = cVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurrentUserInfo(userId=");
            sb.append(this.a);
            sb.append(", presentation=");
            sb.append(this.b);
            sb.append(", isEduAccount=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VoipCallAuthDataProviderImpl.kt */
    public static final class c {
        public static final c c = new c("", "");
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurrentUserPresentation(fullName=");
            sb.append(this.a);
            sb.append(", avatarUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipCallAuthDataProviderImpl.kt */
    public interface d {
        a a();

        mui0 b();

        com.vk.superapp.multiaccount.api.d c();
    }

    public tfw0() {
        ufw0 ufw0Var = new ufw0(this);
        this.b = ufw0Var;
        this.e = EmptyDisposable.INSTANCE;
        this.h = new pfw0();
        b m = m(l());
        this.c = m;
        io.reactivex.rxjava3.subjects.d<UserId> O0 = io.reactivex.rxjava3.subjects.d.O0(m.a);
        this.d = O0;
        io.reactivex.rxjava3.core.q<Boolean> d2 = ufw0Var.a().d();
        asu0 asu0Var = asu0.a;
        this.f = io.reactivex.rxjava3.kotlin.c.f(2, d2.a0(asu0Var.d()), null, new sfw0(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), new fvq0(this, 17));
        this.g = io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(O0.a0(asu0Var.d()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, new hwi0(21), new r0r0(this, 17));
    }

    @Override // xsna.rew0
    public final boolean a() {
        return fkq0.c(this.c.a);
    }

    @Override // xsna.rew0
    public final void b(izs<? super Boolean, s3q0> izsVar) {
        UserId userId = this.c.a;
        if (fkq0.c(userId)) {
            d dVar = this.b;
            if (dVar.b().b() && !epx.f(userId, l())) {
                this.e.dispose();
                io.reactivex.rxjava3.core.a f = dVar.a().f(userId);
                sbb sbbVar = new sbb(izsVar, 7);
                f.getClass();
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                this.e = hg1.g(new io.reactivex.rxjava3.internal.operators.completable.w(f, lVar, lVar, kVar, kVar, sbbVar, kVar).o(asu0.a.d()), new ufm0(10));
                return;
            }
        }
        L.e("VoipCallAuthDataProviderImpl", "Account switch not required, starting onSwitched action");
        i0q0.f(new tw(izsVar, 8));
    }

    @Override // xsna.rew0
    public final io.reactivex.rxjava3.core.q<rew0.a> c() {
        return io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.q(new u1j0(this, 9)).a0(asu0.a.d()), this.d, new xq70(new bv4((byte) 0, 12), 25));
    }

    @Override // xsna.rew0
    public final boolean d() {
        return epx.f(this.c.a, l());
    }

    @Override // xsna.rew0
    public final void e() {
        this.b.a().e();
    }

    @Override // xsna.rew0
    public final UserId f() {
        return this.c.a;
    }

    @Override // xsna.rew0
    public final void g(UserId userId) {
        if (epx.f(this.c.a, userId)) {
            return;
        }
        this.c = m(userId);
        this.d.onNext(userId);
    }

    @Override // xsna.rew0
    public final boolean h() {
        return this.c.c;
    }

    @Override // xsna.rew0
    public final String i() {
        return this.c.b.b;
    }

    @Override // xsna.rew0
    public final void j(rew0.b bVar) {
        this.h.a.add(bVar);
        bVar.a(this.c.a);
    }

    @Override // xsna.rew0
    public final void k(rew0.b bVar) {
        this.h.a.remove(bVar);
    }

    public final UserId l() {
        d dVar = this.b;
        return !dVar.b().g().isEmpty() ? dVar.b().a() : dVar.a().c();
    }

    public final b m(UserId userId) {
        Object obj;
        Object obj2;
        if (!fkq0.c(userId)) {
            return b.d;
        }
        d dVar = this.b;
        if (dVar.a().a(userId)) {
            return new b(userId, new c(dVar.a().b(), dVar.a().i()), dVar.a().h());
        }
        Iterator<T> it = dVar.c().d().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((com.vk.superapp.multiaccount.api.f) obj2).a().b, userId)) {
                break;
            }
        }
        com.vk.superapp.multiaccount.api.f fVar = (com.vk.superapp.multiaccount.api.f) obj2;
        c cVar = fVar != null ? new c(fVar.a().c, fVar.a().d) : c.c;
        Iterator it2 = dVar.b().e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (epx.f(((usi0.a) next).c().a, userId)) {
                obj = next;
                break;
            }
        }
        usi0.a aVar = (usi0.a) obj;
        if (aVar == null) {
            return b.d;
        }
        AccountProfileType accountProfileType = aVar.c().b;
        accountProfileType.getClass();
        return new b(userId, cVar, accountProfileType == AccountProfileType.EDU);
    }

    @Override // xsna.rew0
    public final void reset() {
        g(l());
    }
}

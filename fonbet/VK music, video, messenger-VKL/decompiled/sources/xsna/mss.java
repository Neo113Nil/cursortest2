package xsna;

import android.content.Context;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.fss;

/* compiled from: FriendsRequestsHolderActionHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class mss implements lss<fss> {
    public final String a;
    public final MobileOfficialAppsCoreNavStat$EventScreen b;
    public final boolean c;
    public final rfz d;
    public final kss e;
    public final a f;
    public final b g;
    public final Context h;
    public final io.reactivex.rxjava3.disposables.b i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final bpn0 o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;

    /* compiled from: FriendsRequestsHolderActionHandlerImpl.kt */
    public static final class a {
        public final o0r0 a;
        public final sw50 b;
        public final mxv c;
        public final gd60 d;
        public final zls e;

        public a(o0r0 o0r0Var, sw50 sw50Var, mxv mxvVar, gd60 gd60Var, zls zlsVar) {
            this.a = o0r0Var;
            this.b = sw50Var;
            this.c = mxvVar;
            this.d = gd60Var;
            this.e = zlsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Bridges(usersBridge=" + this.a + ", navBridge=" + this.b + ", imBridge=" + this.c + ", newsfeedBridge=" + this.d + ", friendsBridge=" + this.e + ')';
        }
    }

    /* compiled from: FriendsRequestsHolderActionHandlerImpl.kt */
    public static final class b {
        public final rj70 a;
        public final otl0 b;

        public b(rj70 rj70Var, otl0 otl0Var) {
            this.a = rj70Var;
            this.b = otl0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Interactors(notificationsInteractor=" + this.a + ", storiesLoadInteractor=" + this.b + ')';
        }
    }

    public mss(String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z, rfz rfzVar, kss kssVar, a aVar, b bVar, Context context, io.reactivex.rxjava3.disposables.b bVar2) {
        this.a = str;
        this.b = mobileOfficialAppsCoreNavStat$EventScreen;
        this.c = z;
        this.d = rfzVar;
        this.e = kssVar;
        this.f = aVar;
        this.g = bVar;
        this.h = context;
        this.i = bVar2;
        hy2 hy2Var = new hy2(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, hy2Var);
        this.k = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.g(16));
        this.l = msy.a(lazyThreadSafetyMode, new qe3(21));
        this.m = msy.a(lazyThreadSafetyMode, new m1i(this, 15));
        this.n = msy.a(lazyThreadSafetyMode, new l9h(this, 19));
        bpn0 bpn0Var = new bpn0(new fgm(this, 11));
        this.o = bpn0Var;
        this.p = msy.a(lazyThreadSafetyMode, new maj(this, 16));
        int i = 8;
        this.q = msy.a(lazyThreadSafetyMode, new foi(this, i));
        this.r = msy.a(lazyThreadSafetyMode, new n1i(this, i));
        this.s = msy.a(lazyThreadSafetyMode, new h1j(this, 16));
        this.t = msy.a(lazyThreadSafetyMode, new wzh(this, 13));
        g2r0 g2r0Var = (g2r0) bpn0Var.getValue();
        bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.i0(g2r0Var.b.a(), new kxa0(new mmm0(g2r0Var, 10), 11)).a0(asu0.a.d()).subscribe(new g600(new fvq0(g2r0Var, 2), 25)));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lss
    public final void a(fss fssVar) {
        if (fssVar instanceof fss.d) {
            ((uzb0) this.p.getValue()).a((fss.d) fssVar);
            return;
        }
        if (fssVar instanceof fss.c) {
            ((m060) this.q.getValue()).a((fss.c) fssVar);
            return;
        }
        if (fssVar instanceof fss.a) {
            ((yp9) this.r.getValue()).a((fss.a) fssVar);
        } else if (fssVar instanceof fss.e) {
            ((iii0) this.s.getValue()).a((fss.e) fssVar);
        } else {
            if (!(fssVar instanceof fss.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ((mw50) this.t.getValue()).a((fss.b) fssVar);
        }
    }
}

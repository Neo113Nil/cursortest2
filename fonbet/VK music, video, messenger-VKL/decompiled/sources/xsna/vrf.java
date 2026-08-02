package xsna;

import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.c63;
import xsna.iuf;
import xsna.ruf;
import xsna.ypf;

/* compiled from: ClipsWrapperInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class vrf implements urf {
    public final jtf a;
    public final ClipsDownloadComponent b;
    public final tuf c;

    /* compiled from: ClipsWrapperInteractorImpl.kt */
    public static final class a extends c63.b {
        public final io.reactivex.rxjava3.disposables.c b;

        public a(io.reactivex.rxjava3.disposables.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.c63.b
        public final void w() {
            c63 c63Var = c63.a;
            c63.c(this);
            this.b.dispose();
        }
    }

    public vrf(jtf jtfVar, ClipsDownloadComponent clipsDownloadComponent, sdq0 sdq0Var) {
        this.a = jtfVar;
        this.b = clipsDownloadComponent;
        this.c = new tuf(sdq0Var);
        a aVar = new a(new io.reactivex.rxjava3.internal.operators.observable.y(ysg0.b.a.b0(zqc.class).U(new jh(new com.vk.movika.sdk.base.observable.i(17), 9)).U(new ju1(new com.vk.movika.sdk.base.observable.k(this, 23), 15)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new defpackage.d(new com.vk.movika.sdk.base.observable.m(this, 28), 14)));
        c63 c63Var = c63.a;
        c63.a(aVar);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<aqf> A(String str) {
        return this.a.w(str);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<vsf> a(String str) {
        return this.a.a(str);
    }

    @Override // xsna.urf
    public final void b(String str, quf qufVar) {
        this.a.b(str, qufVar);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<ClipFeedTab> c(String str) {
        return this.a.c(str);
    }

    @Override // xsna.urf
    public final void d(String str, iuf.a aVar) {
        this.a.d(str, aVar);
    }

    @Override // xsna.urf
    public final void e(String str, psf psfVar) {
        this.a.e(str, psfVar);
    }

    @Override // xsna.urf
    public final void f(String str, tlo0 tlo0Var) {
        this.a.f(str, tlo0Var);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<psf> g(String str) {
        return this.a.g(str);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<guf> h(String str) {
        return this.a.h(str);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<Integer> i(String str) {
        return this.a.i(str);
    }

    @Override // xsna.urf
    public final void j(int i, String str) {
        this.a.j(i, str);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<s3q0> k(String str) {
        return this.a.k(str);
    }

    @Override // xsna.urf
    public final duf l(String str) {
        return this.a.l(str);
    }

    @Override // xsna.urf
    public final void m(String str, a7j<ClipFeedOpenAction> a7jVar) {
        this.a.m(str, a7jVar);
    }

    @Override // xsna.urf
    public final void n(String str, int i, hfz hfzVar, boolean z) {
        this.a.n(str, i, hfzVar, z);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<quf> o(String str) {
        return this.a.o(str);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<a7j<ClipFeedOpenAction>> p(String str) {
        return this.a.p(str);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<iuf> q(String str) {
        return this.a.q(str);
    }

    @Override // xsna.urf
    public final void r(String str) {
        this.a.t(str);
    }

    @Override // xsna.urf
    public final void s(String str, aqf aqfVar) {
        this.a.z(str, aqfVar);
    }

    @Override // xsna.urf
    public final void t(String str, rfc rfcVar) {
        List<ClipFeedTab> s = this.a.s(str);
        g620.f().h().getClass();
        Iterator<ClipFeedTab> it = s.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (rfcVar.c(it.next())) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || i >= s.size()) {
            return;
        }
        j(i, str);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.internal.operators.observable.y u() {
        tuf tufVar = this.c;
        sdq0 sdq0Var = tufVar.a;
        return new io.reactivex.rxjava3.internal.operators.observable.y((sdq0Var.a.getValue().k() ? sdq0Var.b.getValue().b().U(new r41(new kp1(tufVar, 1), 18)) : sdq0Var.c.getValue().b().U(new com.vk.movika.sdk.base.hooks.k(new lp1(tufVar, 2), 15))).j0(new ruf.f(EmptySet.b), new mj1(new s77(tufVar, 1), 14)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q<tqf> v(String str) {
        return this.a.x(str);
    }

    @Override // xsna.urf
    public final io.reactivex.rxjava3.core.q w() {
        return this.a.y();
    }

    @Override // xsna.urf
    public final void x(String str) {
        this.a.u(str);
    }

    @Override // xsna.urf
    public final void y() {
        jtf jtfVar = this.a;
        ypf T0 = jtfVar.T0();
        if (!(T0 instanceof ypf.a) && !(T0 instanceof ypf.c)) {
            if (!(T0 instanceof ypf.b) && !(T0 instanceof ypf.d)) {
                throw new NoWhenBranchMatchedException();
            }
            zqc a2 = T0.a();
            if (a2 != null) {
                this.b.Gc().b(a2.a);
            }
        }
        jtfVar.v(ypf.c.a);
    }

    @Override // xsna.urf
    public final duf z(int i, String str, List list) {
        int i2;
        Integer valueOf = Integer.valueOf(i);
        if (i < 0 || i >= list.size()) {
            valueOf = null;
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        } else {
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    ClipFeedTab clipFeedTab = (ClipFeedTab) next;
                    if (!(clipFeedTab instanceof ClipFeedTab.MyClips) && !(clipFeedTab instanceof ClipFeedTab.UserSubscriptions)) {
                        i2 = i3;
                        break;
                    }
                    i3 = i4;
                } else {
                    i2 = list.isEmpty() ? -1 : 0;
                }
            }
        }
        duf dufVar = new duf(list, i2);
        jtf jtfVar = this.a;
        if (!dufVar.equals(jtfVar.l(str))) {
            jtfVar.r(str, dufVar);
        }
        return dufVar;
    }
}

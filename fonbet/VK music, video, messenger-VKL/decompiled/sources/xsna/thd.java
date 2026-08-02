package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import xsna.chd;

/* compiled from: ClipsAuthorsPickerInteractorImpl.kt */
/* loaded from: classes14.dex */
public final class thd implements rhd {
    public final oid a;
    public final qhd b;
    public final bpn0 c = new bpn0(new ek(6));
    public final bpn0 d = new bpn0(new t61(this, 10));
    public final bpn0 e;
    public io.reactivex.rxjava3.disposables.c f;
    public boolean g;

    public thd(oid oidVar, lbk lbkVar, qhd qhdVar) {
        this.a = oidVar;
        this.b = qhdVar;
        this.e = new bpn0(new y6(lbkVar, 19));
    }

    @Override // xsna.rhd
    public final void a() {
        ((rid) this.e.getValue()).a();
    }

    @Override // xsna.rhd
    public final void b(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        ((rid) this.e.getValue()).b(mobileOfficialAppsCoreNavStat$EventScreen);
    }

    @Override // xsna.rhd
    public final void c(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        dhr0.a.getClass();
        ((gid) this.c.getValue()).a(new lpj(context, dhr0.u().c), mobileOfficialAppsCoreNavStat$EventScreen, new t6(this, 20));
    }

    @Override // xsna.rhd
    public final io.reactivex.rxjava3.core.q<dhd> d() {
        io.reactivex.rxjava3.subjects.d<chd> j = j();
        da daVar = new da(new nj(6), 13);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return j.E(daVar, lVar, kVar, kVar).L(new e05(new tl0(this, 27), 10), false).U(new lp0(new ak(9), 14));
    }

    @Override // xsna.rhd
    public final View e(Context context) {
        dhr0.a.getClass();
        return new xwd(new lpj(context, dhr0.u().c));
    }

    @Override // xsna.rhd
    public final chd f() {
        return j().P0();
    }

    @Override // xsna.rhd
    public final io.reactivex.rxjava3.core.x<Optional<Pair<dhd, List<Group>>>> g() {
        io.reactivex.rxjava3.internal.operators.observable.j1 a;
        if (!o25.a().b()) {
            return io.reactivex.rxjava3.core.x.k(Optional.empty());
        }
        boolean z = this.g;
        this.g = false;
        oid oidVar = this.a;
        if (z) {
            a = oidVar.a();
        } else {
            oidVar.getClass();
            a = xee.e.b().U(new lq(9, new d37(6)));
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(a.K(), new mj1(new v9(this, 22), 8));
    }

    @Override // xsna.rhd
    public final void h(chd chdVar, boolean z) {
        this.g = z;
        j().onNext(chdVar);
    }

    @Override // xsna.rhd
    public final void i() {
        UserId id;
        boolean b = o25.a().b();
        chd.c cVar = chd.c.a;
        if (!b) {
            j().onNext(cVar);
        } else if (epx.f(j().P0(), cVar) || !((id = j().P0().getId()) == null || fkq0.c(id))) {
            j().onNext(new chd.d(o25.a().o()));
        }
    }

    public final io.reactivex.rxjava3.subjects.d<chd> j() {
        return (io.reactivex.rxjava3.subjects.d) this.d.getValue();
    }

    @Override // xsna.rhd
    public final View w1(Context context) {
        dhr0.a.getClass();
        return new wkd(new lpj(context, dhr0.u().c));
    }
}

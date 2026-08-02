package xsna;

import android.os.Bundle;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeMultiaccountsItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkidEcosystemNavigationItem;
import com.vk.superapp.bridges.LogoutReason;
import com.vk.superapp.multiaccount.api.AgeGroup;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.api.a;
import com.vk.superapp.multiaccount.api.f;
import com.vk.superapp.multiaccount.api.j;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import xsna.hxo;
import xsna.nxo;
import xsna.rxo;
import xsna.usi0;

/* compiled from: EcosystemMultiAccountFeature.kt */
/* loaded from: classes6.dex */
public final class mxo extends wk50<uxo, sxo, hxo, nxo> {
    public final SwitcherUiMode f;
    public final i340 g;
    public final x140 h;
    public final mui0 i;
    public final v140 j;
    public final wxo k;
    public final bon0 l;
    public final SwitcherLaunchMode m;
    public final MultiAccountEntryPoint n;
    public final f4z o;
    public final io.reactivex.rxjava3.disposables.b p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mxo(SwitcherUiMode switcherUiMode, i340 i340Var, x140 x140Var, mui0 mui0Var, v140 v140Var, wxo wxoVar, bon0 bon0Var, SwitcherLaunchMode switcherLaunchMode, jzq0 jzq0Var) {
        super(r0, new oxo(r2, new ynn0(jzq0Var)));
        hxo.c cVar = hxo.c.b;
        int size = mui0Var.e().size();
        r55 r55Var = r55.a;
        to10 to10Var = r55.f().b;
        this.f = switcherUiMode;
        this.g = i340Var;
        this.h = x140Var;
        this.i = mui0Var;
        this.j = v140Var;
        this.k = wxoVar;
        this.l = bon0Var;
        this.m = switcherLaunchMode;
        MultiAccountEntryPoint multiAccountEntryPoint = v140Var.a;
        this.n = multiAccountEntryPoint == null ? MultiAccountEntryPoint.Unknown.d : multiAccountEntryPoint;
        this.o = new f4z();
        this.p = new io.reactivex.rxjava3.disposables.b();
        T(new nxo.d(switcherUiMode));
    }

    @Override // xsna.wk50
    public final void N(sxo sxoVar, hxo hxoVar) {
        Object obj;
        hxo hxoVar2 = hxoVar;
        boolean z = hxoVar2 instanceof hxo.c;
        int i = 20;
        int i2 = 1;
        io.reactivex.rxjava3.disposables.b bVar = this.p;
        SwitcherLaunchMode switcherLaunchMode = this.m;
        mui0 mui0Var = this.i;
        Object obj2 = null;
        i340 i340Var = this.g;
        if (z) {
            T(new nxo.b.a(mui0Var.e().size()));
            bVar.b(hg1.h((switcherLaunchMode instanceof SwitcherLaunchMode.DefaultMode ? i340Var.e : new io.reactivex.rxjava3.internal.operators.observable.s0(new zge(this, i2)).r0(io.reactivex.rxjava3.schedulers.a.b())).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new h60(new nhe(this, 18), 23)).U(new c8(new t1e(this, 15), 12)), new wze(this, i)));
            v140 v140Var = this.j;
            com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, v140Var.b, v140Var.a(null, null), null, null, 28);
            return;
        }
        boolean z2 = hxoVar2 instanceof hxo.a;
        MultiAccountEntryPoint multiAccountEntryPoint = this.n;
        f4z f4zVar = this.o;
        wxo wxoVar = this.k;
        if (z2) {
            wxoVar.getClass();
            wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.MULTIACC_ADD_ANOTHER_ACCOUNT_TAP, null, 6);
            v140.c(this.j, SchemeStatSak$TypeRegistrationItem.EventType.MULTIACC_ADD_ANOTHER_ACCOUNT_TAP, null, null, null, 14);
            ArrayList e = mui0Var.e();
            ArrayList arrayList = new ArrayList(c5g.u(e, 10));
            Iterator it = e.iterator();
            while (it.hasNext()) {
                arrayList.add(((usi0.a) it.next()).c().a);
            }
            f4zVar.b(new rxo.c(arrayList, multiAccountEntryPoint));
            return;
        }
        if (!(hxoVar2 instanceof hxo.k)) {
            if (hxoVar2 instanceof hxo.g) {
                com.vk.superapp.multiaccount.api.f fVar = ((hxo.g) hxoVar2).b;
                wxoVar.getClass();
                wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.MULTIACC_DROP_ACCOUNT_TAP, null, 6);
                v140.c(this.j, SchemeStatSak$TypeRegistrationItem.EventType.MULTIACC_DROP_ACCOUNT_TAP, fVar.a().b, null, null, 12);
                return;
            }
            if (hxoVar2 instanceof hxo.h) {
                V(((hxo.h) hxoVar2).b);
                return;
            }
            if (hxoVar2 instanceof hxo.f) {
                bVar.dispose();
                T(new nxo.b.C3423b());
                com.vk.superapp.multiaccount.api.f fVar2 = (com.vk.superapp.multiaccount.api.f) j5g.a0(i340Var.d());
                if (fVar2 != null) {
                    v140.c(this.j, SchemeStatSak$TypeRegistrationItem.EventType.MULTIACC_DROP_ACCOUNT_TAP, fVar2.a().b, null, null, 12);
                    return;
                }
                return;
            }
            if (hxoVar2 instanceof hxo.i) {
                T(new nxo.b.a(mui0Var.e().size()));
                i340Var.c();
                return;
            }
            if (hxoVar2 instanceof hxo.d) {
                wxoVar.getClass();
                wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.LOGOUT, null, 6);
                f4zVar.b(rxo.d.a);
                return;
            }
            if (hxoVar2 instanceof hxo.e) {
                com.vk.superapp.multiaccount.api.f fVar3 = (com.vk.superapp.multiaccount.api.f) j5g.a0(i340Var.d());
                if (fVar3 == null) {
                    return;
                }
                V(fVar3);
                return;
            }
            if (hxoVar2 instanceof hxo.b) {
                U();
                return;
            }
            if (!(hxoVar2 instanceof hxo.j)) {
                throw new NoWhenBranchMatchedException();
            }
            UserId userId = ((hxo.j) hxoVar2).b;
            Iterator it2 = mui0Var.e().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (epx.f(((usi0.a) next).c().a, userId)) {
                    obj2 = next;
                    break;
                }
            }
            usi0.a aVar = (usi0.a) obj2;
            if (aVar != null) {
                W(aVar);
                return;
            }
            return;
        }
        com.vk.superapp.multiaccount.api.f fVar4 = ((hxo.k) hxoVar2).b;
        wxoVar.getClass();
        wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.SWITCH_ACCOUNT_TAP, null, 6);
        Iterator it3 = mui0Var.e().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it3.next();
                if (epx.f(((usi0.a) obj).c().a, fVar4.a().b)) {
                    break;
                }
            }
        }
        usi0.a aVar2 = (usi0.a) obj;
        if (switcherLaunchMode instanceof SwitcherLaunchMode.SwitcherCallbackMode) {
            Iterator<T> it4 = i340Var.d().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                if (epx.f(((com.vk.superapp.multiaccount.api.f) next2).a().b, fVar4.a().b)) {
                    obj2 = next2;
                    break;
                }
            }
            com.vk.superapp.multiaccount.api.f fVar5 = (com.vk.superapp.multiaccount.api.f) obj2;
            if (fVar5 != null) {
                f4zVar.b(new rxo.f((SwitcherLaunchMode.SwitcherCallbackMode) switcherLaunchMode, fVar5));
            }
            U();
            return;
        }
        if (epx.f(aVar2, mui0Var.i())) {
            U();
            return;
        }
        com.vk.superapp.multiaccount.api.f fVar6 = (com.vk.superapp.multiaccount.api.f) j5g.a0(i340Var.d());
        v140.c(this.j, SchemeStatSak$TypeRegistrationItem.EventType.SWITCH_ACCOUNT_TAP, null, c8u0.b(fVar6), c8u0.b(fVar4), 2);
        if ((fVar4 instanceof f.c.b) || (fVar4 instanceof f.c.a)) {
            UserId userId2 = fVar4.a().b;
            x140 x140Var = this.h;
            x140Var.getClass();
            r55 r55Var = r55.a;
            io.reactivex.rxjava3.internal.operators.observable.b0 F = new io.reactivex.rxjava3.internal.operators.mixed.q(((yui) r55.j()).c(x140Var.a, false), new s7(new r330(x140Var, userId2, fVar6, fVar4, 1), 22)).F(new ho1(new com.vk.libvideo.b(14, this, userId2), i));
            fu0 fu0Var = new fu0(new fre(this, i), 21);
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.c0(F, fu0Var, kVar).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            mtb mtbVar = new mtb(this, i2);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            this.e.b(hg1.h(a0.E(lVar, lVar, kVar, mtbVar), new lxo(fVar6, this, userId2, fVar4)));
            return;
        }
        if (fVar4 instanceof f.c.C1893c) {
            UserId userId3 = ((f.c.C1893c) fVar4).d.b;
            f4zVar.b(new rxo.b(multiAccountEntryPoint));
            U();
            i340Var.a(userId3);
            return;
        }
        if (fVar6 != null) {
            AgeGroup.a aVar3 = AgeGroup.Companion;
            AgeGroup ageGroup = fVar4.a().l;
            aVar3.getClass();
            if (AgeGroup.a.b(fVar6, ageGroup)) {
                f4zVar.b(new rxo.e(fVar4.a().b));
                return;
            }
        }
        if (aVar2 != null) {
            W(aVar2);
        }
    }

    public final void U() {
        this.o.b(rxo.a.a);
    }

    public final void V(final com.vk.superapp.multiaccount.api.f fVar) {
        Object obj;
        final UserId userId;
        final UserId userId2 = fVar.a().b;
        mui0 mui0Var = this.i;
        usi0.a i = mui0Var.i();
        final fhq0 c = i != null ? i.c() : null;
        final boolean f = epx.f(c != null ? c.a : null, userId2);
        Iterator it = mui0Var.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            usi0.a aVar = (usi0.a) obj;
            if (!epx.f(aVar.c().a, userId2) && aVar.c().b != AccountProfileType.RELATED) {
                break;
            }
        }
        usi0.a aVar2 = (usi0.a) obj;
        final fhq0 c2 = aVar2 != null ? aVar2.c() : null;
        if (c2 == null || (userId = c2.a) == null) {
            userId = UserId.d;
        }
        io.reactivex.rxjava3.core.q a0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.jxo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (!(com.vk.superapp.multiaccount.api.f.this instanceof f.c)) {
                    wdx0 wdx0Var = e370.f;
                    if (wdx0Var == null) {
                        wdx0Var = null;
                    }
                    wdx0Var.a(LogoutReason.MULTIACCOUNT_LOGOUT, userId2, !fkq0.c(userId));
                }
                return s3q0.a;
            }
        }).C(new io.reactivex.rxjava3.functions.a() { // from class: xsna.kxo
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                com.vk.superapp.multiaccount.api.f fVar2 = fVar;
                boolean z = fVar2 instanceof f.c.a;
                j.c cVar = j.c.b;
                if (z ? ((f.c.a) fVar2).e.equals(cVar) : fVar2 instanceof f.c.b ? ((f.c.b) fVar2).e.equals(cVar) : false) {
                    r55 r55Var = r55.a;
                    ((yui) r55.j()).b(r55.a(), fVar2.a().b);
                }
                mxo mxoVar = mxo.this;
                com.vk.superapp.multiaccount.api.a aVar3 = mxoVar.k.a;
                fhq0 fhq0Var = c;
                UserId userId3 = fhq0Var != null ? fhq0Var.a : null;
                fhq0 fhq0Var2 = c2;
                if (!epx.f(userId3, fhq0Var2 != null ? fhq0Var2.a : null)) {
                    if (fhq0Var != null) {
                        aVar3.e(new a.f(SchemeStatSak$EventScreen.ECOSYSTEM_NAVIGATION, SchemeStatSak$TypeRegistrationItem.EventType.SWITCH_FROM_ACCOUNT, fhq0Var.a, new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.PROFILE_TYPE, "", "", c8u0.a(fhq0Var.b).i())));
                    }
                    if (fhq0Var2 != null) {
                        aVar3.e(new a.f(SchemeStatSak$EventScreen.ECOSYSTEM_NAVIGATION, SchemeStatSak$TypeRegistrationItem.EventType.SWITCH_TO_ACCOUNT, fhq0Var2.a, new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.PROFILE_TYPE, "", "", c8u0.a(fhq0Var2.b).i())));
                    }
                }
                if (f) {
                    v140.b(mxoVar.j, SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH, userId2);
                }
            }
        }).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        if (f) {
            a0 = new io.reactivex.rxjava3.internal.operators.observable.c0(a0, new fu0(new fre(this, 20), 21), kVar);
        }
        if (f) {
            mtb mtbVar = new mtb(this, 1);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a0 = a0.E(lVar, lVar, kVar, mtbVar);
        }
        this.e.b(hg1.h(a0, new o43(19, this, userId2)));
    }

    public final void W(usi0.a aVar) {
        this.p.dispose();
        usi0.a i = this.i.i();
        Bundle bundle = Bundle.EMPTY;
        this.h.getClass();
        io.reactivex.rxjava3.internal.operators.observable.b0 a = x140.a(aVar, this.n, i);
        fu0 fu0Var = new fu0(new fre(this, 20), 21);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(a, fu0Var, kVar);
        mtb mtbVar = new mtb(this, 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        this.e.b(hg1.h(c0Var.E(lVar, lVar, kVar, mtbVar), new gvs(26)));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        this.p.dispose();
        super.onDestroy();
    }
}

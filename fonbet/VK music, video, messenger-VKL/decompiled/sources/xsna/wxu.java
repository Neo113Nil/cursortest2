package xsna;

import android.annotation.SuppressLint;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$SettingsEvent;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import xsna.ghc0;

/* compiled from: HeaderPostingPresenter.kt */
/* loaded from: classes4.dex */
public final class wxu implements sxu {
    public final qdc0 b;
    public final txu c;
    public final com.vk.newsfeed.impl.posting.a d;
    public final GroupsFilterDto e;
    public final jbc0 f;
    public final fhc0 g;
    public com.vk.lists.c h;
    public UserId i;
    public UserId j;
    public boolean k;
    public boolean l;
    public final Target m;
    public Target n;
    public PostingMetricsCreationEntryPoint o;
    public final p60 p;
    public final bpn0 q;

    public wxu(qdc0 qdc0Var, txu txuVar, com.vk.newsfeed.impl.posting.a aVar, jbc0 jbc0Var, fhc0 fhc0Var) {
        GroupsFilterDto groupsFilterDto = GroupsFilterDto.EDITOR;
        this.b = qdc0Var;
        this.c = txuVar;
        this.d = aVar;
        this.e = groupsFilterDto;
        this.f = jbc0Var;
        this.g = fhc0Var;
        UserId userId = UserId.d;
        this.i = userId;
        this.j = userId;
        this.m = new Target(hd60.a().a().H());
        this.o = PostingMetricsCreationEntryPoint.Other;
        this.p = new p60(27);
        this.q = new bpn0(new bzj(this, 16));
    }

    @Override // xsna.sxu
    public final void G() {
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.G();
        }
    }

    @Override // xsna.sxu
    public final void K6() {
        this.c.ak();
    }

    public final void Z(Group group, boolean z, boolean z2) {
        com.vk.lists.c cVar = this.h;
        if (cVar != null) {
            cVar.r(false);
        }
        if (!z && !z2) {
            e6(this.m, (r3 & 2) != 0, false);
        }
        if (group == null) {
            return;
        }
        Target target = new Target(group);
        this.j = target.c;
        this.c.nj(target);
        if (z || z2) {
            e6(target, (r3 & 2) != 0, false);
        }
    }

    @Override // xsna.f180
    public final void b(Target target) {
        this.p.getClass();
        s3q0 s3q0Var = s3q0.a;
        e6(target, (r3 & 2) != 0, false);
        ghc0.j x = this.g.x();
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = this.o;
        x.getClass();
        ghc0.j.m(x, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CHANGE_AUTHOR, postingMetricsCreationEntryPoint, null, null, 12);
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.f.g();
    }

    public final void d0(Target target) {
        this.n = target;
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.ll(target);
        }
    }

    public final void e0(boolean z) {
        this.c.Ph(z, !this.k);
        if (!z || this.k) {
            return;
        }
        this.k = true;
    }

    @Override // xsna.sxu
    public final void e6(Target target, boolean z, boolean z2) {
        UserId userId = target.c;
        Target target2 = this.m;
        boolean f = epx.f(userId, target2.c);
        if (f) {
            target = target2;
        }
        this.n = target;
        txu txuVar = this.c;
        txuVar.ce(target, f);
        txuVar.Tc(true, z);
        txuVar.ed(false, z);
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.ll(target);
        }
        if (this.l && !z2) {
            g0(false);
        }
        this.g.c(target.c);
    }

    @SuppressLint({"CheckResult"})
    public final void f0() {
        com.vk.newsfeed.impl.posting.a aVar = this.d;
        aVar.getClass();
        new io.reactivex.rxjava3.internal.operators.single.v(new ha20(aVar, 1)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new oz(new wje(this, 26), 19), new qz(new sop(this, 13), 19));
    }

    @Override // xsna.f180
    public final void g() {
        g0(!this.l);
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.B1();
        }
        ghc0.j x = this.g.x();
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = this.o;
        x.getClass();
        ghc0.j.m(x, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.SELECT_AUTHOR, postingMetricsCreationEntryPoint, null, null, 12);
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.f.g();
    }

    public final void g0(boolean z) {
        txu txuVar = this.c;
        if (txuVar.Rd()) {
            if (z) {
                txuVar.P8();
            } else {
                txuVar.Ed();
            }
            this.l = z;
        }
    }

    @Override // xsna.sxu
    public final void o() {
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.o();
        }
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.ik6
    public final void onStart() {
        e0(false);
        Target target = this.m;
        txu txuVar = this.c;
        txuVar.nj(target);
        RecyclerPaginatedView hi = txuVar.hi();
        if (hi != null) {
            c.h hVar = new c.h((vxu) this.q.getValue());
            hVar.i = 20;
            hVar.g = false;
            hVar.q = false;
            this.h = com.vk.lists.f.a(hVar, hi);
        }
    }

    @Override // xsna.ik6
    public final void onStop() {
        com.vk.lists.c cVar = this.h;
        if (cVar != null) {
            cVar.v();
        }
    }

    @Override // xsna.sxu
    public final void w3(boolean z, boolean z2) {
        e6(this.m, z, z2);
    }

    public final void x(VKList<Group> vKList, boolean z) {
        if (fkq0.c(this.j)) {
            return;
        }
        boolean c = fkq0.c(this.i);
        txu txuVar = this.c;
        if (!c) {
            if (z && vKList.isEmpty()) {
                Target target = this.m;
                d0(target);
                qdc0 qdc0Var = this.b;
                if (qdc0Var != null) {
                    qdc0Var.ll(target);
                }
                txuVar.Tc(false, false);
                txuVar.ed(true, false);
                return;
            }
            w3(false, true);
        }
        for (Group group : vKList) {
            int size = txuVar.Q2().size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                z2 = epx.f(group.c, txuVar.Q2().get(i).c);
                if (z2) {
                    break;
                }
            }
            if (!epx.f(group.c, this.j) && !z2 && group.n != 0) {
                Target target2 = new Target(group);
                txuVar.nj(target2);
                if (target2.equals(this.n)) {
                    txuVar.ce(target2, false);
                }
            }
        }
        com.vk.lists.c cVar = this.h;
        if (cVar != null) {
            cVar.l(vKList.i());
        }
    }

    @Override // xsna.sxu
    public final void x6() {
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.w();
        }
    }

    public final void z() {
        if (this.l) {
            g0(false);
        }
    }
}

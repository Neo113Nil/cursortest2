package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.SectionIdType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeGameCatalogItem;
import com.vk.stat.scheme.SchemeStat$TypeGamesCatalogClick;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import xsna.djc;
import xsna.ect;
import xsna.edt;
import xsna.hzp0;
import xsna.iet;
import xsna.o9t;
import xsna.q7t;

/* compiled from: GamesCatalogFeature.kt */
/* loaded from: classes17.dex */
public final class xbt extends wk50<xet, jet, o9t, edt> {
    public final ddt f;
    public final lbt g;
    public final w9t h;
    public final mzp0 i;
    public boolean j;
    public boolean k;
    public final hpj l;
    public final f4z m;
    public final Object n;

    public xbt(ddt ddtVar, lbt lbtVar, w9t w9tVar, mzp0 mzp0Var, boolean z, String str, boolean z2, boolean z3) {
        super(new o9t.o(str, z2, z3), new gdt());
        ovj b;
        this.f = ddtVar;
        this.g = lbtVar;
        this.h = w9tVar;
        this.i = mzp0Var;
        if (z) {
            b = hqu0.a();
        } else {
            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
            b = qu5.b(je00.b);
        }
        this.l = zvj.a(d.a.a(whn0.a(), b));
        this.m = new f4z();
        this.n = msy.a(LazyThreadSafetyMode.NONE, new bv0(20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(jet jetVar, o9t o9tVar) {
        SchemeStat$TypeGamesCatalogClick.Type type;
        jet jetVar2 = jetVar;
        o9t o9tVar2 = o9tVar;
        GamesCatalogScreenTab gamesCatalogScreenTab = jetVar2.d;
        v7t v7tVar = jetVar2.e;
        boolean z = o9tVar2 instanceof o9t.o;
        hpj hpjVar = this.l;
        Boolean bool = null;
        Object[] objArr = 0;
        if (z) {
            o9t.o oVar = (o9t.o) o9tVar2;
            T(new edt.e(oVar.b, oVar.c, oVar.d));
            V(GamesCatalogScreenTab.CATALOG);
            V(GamesCatalogScreenTab.CATEGORIES);
            myc0.h(hpjVar, null, null, new vbt(this, null), 3);
            return;
        }
        if (o9tVar2 instanceof o9t.r) {
            o9t.r rVar = (o9t.r) o9tVar2;
            T(new edt.h(rVar.b, rVar.c, rVar.d));
            return;
        }
        if (o9tVar2 instanceof o9t.m) {
            X(new iet.j(((o9t.m) o9tVar2).b));
            return;
        }
        if (o9tVar2 instanceof o9t.k) {
            X(new iet.e(((o9t.k) o9tVar2).b.e));
            return;
        }
        if (o9tVar2 instanceof o9t.l) {
            X(new iet.i());
            return;
        }
        if (o9tVar2.equals(o9t.g.b) || o9tVar2.equals(o9t.f.b) || o9tVar2.equals(o9t.h.b)) {
            return;
        }
        if (o9tVar2 instanceof o9t.i) {
            X(new iet.e(((o9t.i) o9tVar2).b));
            return;
        }
        if (o9tVar2 instanceof o9t.q) {
            o9t.q qVar = (o9t.q) o9tVar2;
            if (qVar instanceof o9t.q.f) {
                X(new iet.k(((o9t.q.f) qVar).b));
                return;
            }
            if (qVar.equals(o9t.q.a.b)) {
                X(iet.g.a);
                return;
            }
            if (qVar.equals(o9t.q.e.b)) {
                X(iet.a.a);
                return;
            }
            if (qVar.equals(o9t.q.d.b)) {
                X(iet.h.a);
                return;
            } else if (qVar.equals(o9t.q.b.b)) {
                X(iet.c.a);
                return;
            } else {
                if (!(qVar instanceof o9t.q.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                X(new iet.b(((o9t.q.c) qVar).b));
                return;
            }
        }
        boolean z2 = o9tVar2 instanceof o9t.j;
        int i = 2;
        w9t w9tVar = this.h;
        if (z2) {
            q7t q7tVar = ((o9t.j) o9tVar2).b;
            if (epx.f(q7tVar, q7t.d.a)) {
                T(edt.c.b);
                w9tVar.getClass();
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeGamesCatalogClick(SchemeStat$TypeGamesCatalogClick.Type.NOTIFICATION, Boolean.TRUE), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                this.j = true;
                X(new iet.j(new djc.c(new GamesHeaderSectionInfo.Section(SectionIdType.Notifications.c, null), null)));
                return;
            }
            boolean f = epx.f(q7tVar, q7t.a.a);
            lbt lbtVar = this.g;
            if (f) {
                if (this.j) {
                    return;
                }
                this.j = true;
                T(edt.c.b);
                lbtVar.a(ect.e.a);
                return;
            }
            if (q7tVar instanceof q7t.b) {
                lbtVar.a(new ect.a(((q7t.b) q7tVar).a));
                return;
            }
            if (!(q7tVar instanceof q7t.c)) {
                throw new NoWhenBranchMatchedException();
            }
            q7t.c cVar = (q7t.c) q7tVar;
            sbt sbtVar = cVar.b;
            int i2 = cVar.a;
            X(new iet.j(new djc.b(sbtVar, cVar.c, Integer.valueOf(i2), cVar.d)));
            lbtVar.a(new ect.a(i2));
            return;
        }
        if (o9tVar2.equals(p9t.b)) {
            V(GamesCatalogScreenTab.CATALOG);
            return;
        }
        if (o9tVar2.equals(t9t.b)) {
            V(GamesCatalogScreenTab.CATEGORIES);
            return;
        }
        if (o9tVar2.equals(q9t.b)) {
            U(GamesCatalogScreenTab.CATALOG, v7tVar.h);
            return;
        }
        if (o9tVar2.equals(u9t.b)) {
            U(GamesCatalogScreenTab.CATEGORIES, jetVar2.f.h);
            return;
        }
        if (o9tVar2.equals(s9t.b)) {
            W(GamesCatalogScreenTab.CATALOG, true);
            return;
        }
        if (o9tVar2.equals(v9t.b)) {
            W(GamesCatalogScreenTab.CATEGORIES, true);
            return;
        }
        if (o9tVar2.equals(r9t.b)) {
            if (!this.k || v7tVar.a == null) {
                return;
            }
            W(GamesCatalogScreenTab.CATALOG, false);
            return;
        }
        if (o9tVar2.equals(o9t.d.b)) {
            this.k = true;
            return;
        }
        if (o9tVar2.equals(o9t.c.b)) {
            this.k = false;
            return;
        }
        if (o9tVar2.equals(o9t.e.b)) {
            myc0.h(hpjVar, null, null, new tbt(this, gamesCatalogScreenTab, null), 3);
            return;
        }
        if (o9tVar2 instanceof o9t.n) {
            mhp0 mhp0Var = ((o9t.n) o9tVar2).b;
            LinkedHashSet linkedHashSet = w9tVar.f;
            if (w9tVar.e || linkedHashSet.contains(mhp0Var.b())) {
                return;
            }
            hzp0.u uVar = new hzp0.u(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GAMES_CATALOG_SECTION, null, null, null, null, null, 62, null), new SchemeStat$TypeGameCatalogItem(mhp0Var.b(), SchemeStat$TypeGameCatalogItem.Subtype.SECTION_VIEW, null, null, null, mhp0Var.c(), 28, null));
            linkedHashSet.add(mhp0Var.b());
            uVar.a();
            return;
        }
        if (o9tVar2 instanceof o9t.b) {
            w9tVar.d(((o9t.b) o9tVar2).b);
            return;
        }
        if (o9tVar2 instanceof o9t.a) {
            w9tVar.c(((o9t.a) o9tVar2).b);
            return;
        }
        if (!(o9tVar2 instanceof o9t.p)) {
            throw new NoWhenBranchMatchedException();
        }
        GamesCatalogScreenTab gamesCatalogScreenTab2 = ((o9t.p) o9tVar2).b;
        if (gamesCatalogScreenTab != gamesCatalogScreenTab2) {
            T(new edt.d(gamesCatalogScreenTab2));
            w9tVar.getClass();
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
            int i3 = x9t.$EnumSwitchMapping$0[gamesCatalogScreenTab2.ordinal()];
            if (i3 == 1) {
                type = SchemeStat$TypeGamesCatalogClick.Type.MAIN_TAB;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                type = SchemeStat$TypeGamesCatalogClick.Type.CATALOG_TAB;
            }
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new SchemeStat$TypeGamesCatalogClick(type, bool, i, objArr == true ? 1 : 0), 2);
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var2 = UiTracker.h;
            uzp0Var2.getClass();
            new bjc(c2, b2, uzp0Var2.a).q();
            w9tVar.f.clear();
            w9tVar.g.clear();
            w9tVar.h.clear();
        }
    }

    public final void U(GamesCatalogScreenTab gamesCatalogScreenTab, int i) {
        hn0 hn0Var = new hn0(15, this, gamesCatalogScreenTab);
        lh lhVar = new lh(16, this, gamesCatalogScreenTab);
        T(new edt.f.h(gamesCatalogScreenTab));
        s3q0 s3q0Var = s3q0.a;
        myc0.h(this.l, null, null, new ubt(this, gamesCatalogScreenTab, i, lhVar, hn0Var, null), 3);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void V(GamesCatalogScreenTab gamesCatalogScreenTab) {
        ey8 i = this.f.a.i(gamesCatalogScreenTab);
        hpj hpjVar = this.l;
        mzp0 mzp0Var = this.i;
        if (i != null && ((Boolean) this.n.getValue()).booleanValue()) {
            if (mzp0Var != null) {
                mzp0Var.c(true);
            }
            T(new edt.f.e(i.d, null, vdt.a(i.a), i.b, i.c, gamesCatalogScreenTab));
            myc0.h(hpjVar, null, null, new wbt(this, gamesCatalogScreenTab, null), 3);
            return;
        }
        bi0 bi0Var = new bi0(19, this, gamesCatalogScreenTab);
        k82 k82Var = new k82(9, this, gamesCatalogScreenTab);
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        T(new edt.f.g(gamesCatalogScreenTab, false));
        s3q0 s3q0Var = s3q0.a;
        myc0.h(hpjVar, null, null, new ubt(this, gamesCatalogScreenTab, 0, k82Var, bi0Var, null), 3);
    }

    public final void W(GamesCatalogScreenTab gamesCatalogScreenTab, boolean z) {
        this.j = false;
        this.f.a.k(gamesCatalogScreenTab);
        com.vk.libvideo.design.view.video.a aVar = new com.vk.libvideo.design.view.video.a(15, this, gamesCatalogScreenTab);
        zf1 zf1Var = new zf1(14, this, gamesCatalogScreenTab);
        T(new edt.f.g(gamesCatalogScreenTab, z));
        s3q0 s3q0Var = s3q0.a;
        myc0.h(this.l, null, null, new ubt(this, gamesCatalogScreenTab, 0, zf1Var, aVar, null), 3);
    }

    public final void X(iet ietVar) {
        this.m.b(ietVar);
    }
}

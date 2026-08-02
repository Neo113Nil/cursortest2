package xsna;

import android.os.SystemClock;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketItemPicker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.p810;
import xsna.v810;
import xsna.z710;

/* compiled from: MarketMultiPickerFeature.kt */
/* loaded from: classes18.dex */
public final class f810 extends wk50<c910, y810, z710, p810> {
    public final List<MultipickerProduct> f;
    public final int g;
    public final String h;
    public final UserId i;
    public final boolean j;
    public final boolean k;
    public final a810 l;
    public final bpn0 m;
    public final f4z n;
    public final io.reactivex.rxjava3.disposables.g o;

    public f810(List list, int i, String str, UserId userId, boolean z, boolean z2, a810 a810Var, u810 u810Var) {
        super(z710.e.b, u810Var);
        this.f = list;
        this.g = i;
        this.h = str;
        this.i = userId;
        this.j = z;
        this.k = z2;
        this.l = a810Var;
        this.m = new bpn0(new qo0(21));
        this.n = new f4z();
        this.o = new io.reactivex.rxjava3.disposables.g();
    }

    public static boolean W(nlu nluVar) {
        return (nluVar == null || nluVar.a) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026e  */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(y810 y810Var, z710 z710Var) {
        UserId userId;
        boolean z;
        Object obj;
        UserId userId2;
        UserId userId3;
        Object obj2;
        UserId userId4;
        Object obj3;
        nlu nluVar;
        UserId userId5;
        Set S0;
        Object obj4;
        Object obj5;
        y810 y810Var2 = y810Var;
        z710 z710Var2 = z710Var;
        a910 a910Var = y810Var2.x;
        Set<MultipickerProduct> set = y810Var2.e;
        String str = y810Var2.k;
        int i = y810Var2.y;
        List<glu> list = y810Var2.f;
        if (z710Var2 instanceof z710.e) {
            T(p810.f.b);
            b0(y810Var2);
            return;
        }
        boolean z2 = z710Var2 instanceof z710.m;
        f4z f4zVar = this.n;
        a810 a810Var = this.l;
        UserId userId6 = this.i;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        if (z2) {
            z710.m mVar = (z710.m) z710Var2;
            List<glu> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj4 = it.next();
                    if (((glu) obj4).e) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            glu gluVar = (glu) obj4;
            UserId userId7 = gluVar != null ? gluVar.b : null;
            UserId userId8 = mVar.b;
            if (epx.f(userId7, userId8)) {
                return;
            }
            a810Var.a(Long.valueOf(userId8.b), userId6 != null ? Long.valueOf(userId6.b) : null, i == 0);
            T(p810.b.b);
            f4zVar.b(v810.a.a);
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (glu gluVar2 : list2) {
                arrayList.add(new glu(gluVar2.b, gluVar2.c, gluVar2.d, epx.f(gluVar2.b, userId8), gluVar2.f, gluVar2.g));
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj5 = it2.next();
                    if (((glu) obj5).e) {
                        break;
                    }
                } else {
                    obj5 = null;
                    break;
                }
            }
            glu gluVar3 = (glu) obj5;
            if (!W(gluVar3 != null ? gluVar3.g : null)) {
                T(p810.a.b);
            }
            T(new p810.r(arrayList));
            if (gluVar3 == null || W(gluVar3.g)) {
                return;
            }
            T(p810.g.b);
            X(userId8, "", list);
            return;
        }
        if (z710Var2 instanceof z710.k) {
            T(p810.f.b);
            b0(y810Var2);
            return;
        }
        if (z710Var2 instanceof z710.l) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((glu) next).e) {
                    obj7 = next;
                    break;
                }
            }
            glu gluVar4 = (glu) obj7;
            if (gluVar4 == null || W(gluVar4.g)) {
                return;
            }
            T(p810.g.b);
            X(gluVar4.b, str, list);
            return;
        }
        if (z710Var2 instanceof z710.j) {
            c0(j5g.O0(set), y810Var2);
            return;
        }
        if (z710Var2 instanceof z710.h.b) {
            if (y810Var2.G || !y810Var2.z || y810Var2.m) {
                return;
            }
            T(p810.i.b);
            Z(y810Var2);
            return;
        }
        if (z710Var2 instanceof z710.h.a) {
            if (y810Var2.F || !y810Var2.A || y810Var2.u) {
                return;
            }
            T(p810.e.b);
            Y(y810Var2);
            return;
        }
        if (!(z710Var2 instanceof z710.d)) {
            if (z710Var2 instanceof z710.h.d) {
                T(p810.i.b);
                Z(y810Var2);
                return;
            }
            if (z710Var2 instanceof z710.h.c) {
                T(p810.e.b);
                Y(y810Var2);
                return;
            }
            if (z710Var2 instanceof z710.r) {
                z710.r rVar = (z710.r) z710Var2;
                if (!(rVar instanceof z710.r.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                long j = ((z710.r.a) rVar).b;
                f4zVar.b(new x810(a910.a(a910Var, Long.valueOf(j), null, 11)));
                T(new p810.n.b(j));
                return;
            }
            if (z710Var2 instanceof z710.f) {
                throw new NoWhenBranchMatchedException();
            }
            if (z710Var2 instanceof z710.g) {
                z710.g gVar = (z710.g) z710Var2;
                if (gVar instanceof z710.g.b) {
                    if (a910Var.b) {
                        return;
                    }
                    T(p810.n.a.b);
                    f4zVar.b(w810.a);
                    return;
                }
                if (!(gVar instanceof z710.g.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (a910Var.b) {
                    return;
                }
                T(p810.n.a.b);
                f4zVar.b(w810.a);
                return;
            }
            long j2 = 0;
            if (z710Var2 instanceof z710.b) {
                List<glu> list3 = list;
                Iterator<T> it4 = list3.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj3 = it4.next();
                        if (((glu) obj3).e) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                glu gluVar5 = (glu) obj3;
                if (gluVar5 == null || (nluVar = gluVar5.g) == null) {
                    return;
                }
                z = i == 0;
                Long valueOf = userId6 != null ? Long.valueOf(userId6.b) : null;
                Iterator<T> it5 = list3.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next2 = it5.next();
                    if (((glu) next2).e) {
                        obj8 = next2;
                        break;
                    }
                }
                glu gluVar6 = (glu) obj8;
                if (gluVar6 != null && (userId5 = gluVar6.b) != null) {
                    j2 = userId5.b;
                }
                a810Var.getClass();
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEMS_MULTIPICKER;
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketItemPicker(CommonMarketStat$TypeMarketItemPicker.EventName.CLICK_PRODUCT_CREATION, valueOf, z ? CommonMarketStat$TypeMarketItemPicker.TabName.COMMUNITY : CommonMarketStat$TypeMarketItemPicker.TabName.BOOKMARKS, Long.valueOf(j2), a810Var.a, a810Var.b), 63), 2);
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(mobileOfficialAppsCoreNavStat$EventScreen, b, uzp0Var.a).q();
                StringBuilder b2 = ho8.b(nluVar.d, "&time=");
                b2.append(System.currentTimeMillis());
                f4zVar.b(new v810.c.a(b2.toString()));
                if (nluVar.a) {
                    return;
                }
                U(gluVar5);
                return;
            }
            if (z710Var2 instanceof z710.c) {
                Iterator<T> it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next3 = it6.next();
                    if (((glu) next3).e) {
                        obj9 = next3;
                        break;
                    }
                }
                glu gluVar7 = (glu) obj9;
                if (gluVar7 == null) {
                    return;
                }
                nlu nluVar2 = gluVar7.g;
                if (nluVar2 != null ? nluVar2.c : false) {
                    U(gluVar7);
                    return;
                }
                return;
            }
            boolean z3 = z710Var2 instanceof z710.n;
            boolean z4 = this.j;
            if (z3) {
                Iterator<T> it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    Object next4 = it7.next();
                    if (((glu) next4).e) {
                        obj10 = next4;
                        break;
                    }
                }
                glu gluVar8 = (glu) obj10;
                if (gluVar8 == null || W(gluVar8.g)) {
                    return;
                }
                a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(V().c(userId6, z4), rsg0.w0(yfb.x(xd10.A(V().a, fkq0.e(gluVar8.b), null, 20, 0, null, 1010))), new d22(new xwl(gluVar8, this, y810Var2, 2), 25)), new f1j(this, 27), new g1j(this, 24), 1);
                return;
            }
            if (z710Var2 instanceof z710.q) {
                int i2 = ((z710.q) z710Var2).b;
                z = i2 == 0;
                if (z) {
                    Iterator<T> it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj2 = it8.next();
                            if (((glu) obj2).e) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    glu gluVar9 = (glu) obj2;
                    if (gluVar9 != null && (userId4 = gluVar9.b) != null) {
                        j2 = userId4.b;
                    }
                }
                a810Var.a(Long.valueOf(j2), userId6 != null ? Long.valueOf(userId6.b) : null, z);
                T(new p810.m(i2));
                return;
            }
            if (z710Var2 instanceof z710.i) {
                z710.i iVar = (z710.i) z710Var2;
                boolean z5 = i == 0;
                Long valueOf2 = userId6 != null ? Long.valueOf(userId6.b) : null;
                Iterator<T> it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next5 = it9.next();
                    if (((glu) next5).e) {
                        obj11 = next5;
                        break;
                    }
                }
                glu gluVar10 = (glu) obj11;
                if (gluVar10 != null && (userId3 = gluVar10.b) != null) {
                    j2 = userId3.b;
                }
                a810Var.getClass();
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEMS_MULTIPICKER;
                SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketItemPicker(CommonMarketStat$TypeMarketItemPicker.EventName.CLICK_CHANGE_MARKET_VISIBILITY, valueOf2, z5 ? CommonMarketStat$TypeMarketItemPicker.TabName.COMMUNITY : CommonMarketStat$TypeMarketItemPicker.TabName.BOOKMARKS, Long.valueOf(j2), a810Var.a, a810Var.b), 63), 2);
                uzp0 uzp0Var2 = UiTracker.h;
                uzp0Var2.getClass();
                new bjc(mobileOfficialAppsCoreNavStat$EventScreen2, b3, uzp0Var2.a).q();
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.r(V().c(userId6, z4), new sj4(new c2k(iVar, y810Var2, this, 1), 20)), new zxo(this, 25), new d9j(this, 25), 1);
                return;
            }
            if (z710Var2 instanceof z710.a) {
                z = i == 0;
                if (z) {
                    Iterator<T> it10 = list.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            obj = it10.next();
                            if (((glu) obj).e) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    glu gluVar11 = (glu) obj;
                    if (gluVar11 != null && (userId2 = gluVar11.b) != null) {
                        j2 = userId2.b;
                    }
                }
                Long valueOf3 = userId6 != null ? Long.valueOf(userId6.b) : null;
                a810Var.getClass();
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen3 = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEMS_MULTIPICKER;
                SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketItemPicker(CommonMarketStat$TypeMarketItemPicker.EventName.CLICK_CLOSE_ITEM_PICKER, valueOf3, z ? CommonMarketStat$TypeMarketItemPicker.TabName.COMMUNITY : CommonMarketStat$TypeMarketItemPicker.TabName.BOOKMARKS, Long.valueOf(j2), a810Var.a, a810Var.b), 63), 2);
                uzp0 uzp0Var3 = UiTracker.h;
                uzp0Var3.getClass();
                new bjc(mobileOfficialAppsCoreNavStat$EventScreen3, b4, uzp0Var3.a).q();
                return;
            }
            if (z710Var2 instanceof z710.p) {
                String str2 = ((z710.p) z710Var2).b;
                if (epx.f(str2, str)) {
                    return;
                }
                Iterator<T> it11 = list.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        break;
                    }
                    Object next6 = it11.next();
                    if (((glu) next6).e) {
                        obj12 = next6;
                        break;
                    }
                }
                glu gluVar12 = (glu) obj12;
                if (gluVar12 == null) {
                    return;
                }
                T(new p810.l(str2));
                T(p810.g.b);
                X(gluVar12.b, str2, list);
                return;
            }
            if (!(z710Var2 instanceof z710.o)) {
                throw new NoWhenBranchMatchedException();
            }
            Long valueOf4 = userId6 != null ? Long.valueOf(userId6.b) : null;
            Iterator<T> it12 = list.iterator();
            while (true) {
                if (!it12.hasNext()) {
                    break;
                }
                Object next7 = it12.next();
                if (((glu) next7).e) {
                    obj6 = next7;
                    break;
                }
            }
            glu gluVar13 = (glu) obj6;
            if (gluVar13 != null && (userId = gluVar13.b) != null) {
                j2 = userId.b;
            }
            a810Var.getClass();
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen4 = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEMS_MULTIPICKER;
            SchemeStat$TypeClick b5 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketItemPicker(CommonMarketStat$TypeMarketItemPicker.EventName.CLICK_SEARCH_PRODUCT, valueOf4, CommonMarketStat$TypeMarketItemPicker.TabName.COMMUNITY, Long.valueOf(j2), a810Var.a, a810Var.b), 63), 2);
            uzp0 uzp0Var4 = UiTracker.h;
            uzp0Var4.getClass();
            new bjc(mobileOfficialAppsCoreNavStat$EventScreen4, b5, uzp0Var4.a).q();
            return;
        }
        z710.d dVar = (z710.d) z710Var2;
        List<ha10> list4 = y810Var2.g;
        int i3 = y810Var2.b;
        ArrayList u0 = j5g.u0(y810Var2.q, list4);
        ArrayList arrayList2 = new ArrayList();
        Iterator it13 = u0.iterator();
        while (it13.hasNext()) {
            Object next8 = it13.next();
            if (((ha10) next8).a.b.equals(dVar.b)) {
                arrayList2.add(next8);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it14 = arrayList2.iterator();
        while (it14.hasNext()) {
            arrayList3.add(((ha10) it14.next()).a);
        }
        MultipickerProduct multipickerProduct = (MultipickerProduct) j5g.a0(arrayList3);
        if (multipickerProduct == null) {
            return;
        }
        MultipickerProductId multipickerProductId = multipickerProduct.b;
        if (i3 == 1) {
            c0(Collections.singletonList(multipickerProduct), y810Var2);
            return;
        }
        Set<MultipickerProduct> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator<T> it15 = set2.iterator();
            while (it15.hasNext()) {
                MultipickerProductId multipickerProductId2 = ((MultipickerProduct) it15.next()).b;
                if (multipickerProductId2.b == multipickerProductId.b && multipickerProductId2.c.equals(multipickerProductId.c)) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj13 : set2) {
                        MultipickerProductId multipickerProductId3 = ((MultipickerProduct) obj13).b;
                        if (multipickerProductId3.b != multipickerProductId.b || !multipickerProductId3.c.equals(multipickerProductId.c)) {
                            arrayList4.add(obj13);
                        }
                    }
                    S0 = j5g.S0(arrayList4);
                    if (S0.size() <= i3) {
                        f4zVar.b(new v810.d(this.h));
                        return;
                    } else {
                        T(new p810.s(S0));
                        return;
                    }
                }
            }
        }
        S0 = p4g.e(set, multipickerProduct);
        if (S0.size() <= i3) {
        }
    }

    @Override // xsna.wk50
    public final List<z710> Q(y810 y810Var, y810 y810Var2, p810 p810Var) {
        y810 y810Var3 = y810Var;
        y810 y810Var4 = y810Var2;
        p810 p810Var2 = p810Var;
        if (p810Var2 instanceof p810.k) {
            return Collections.singletonList(z710.g.b.b);
        }
        if (p810Var2 instanceof p810.j) {
            return Collections.singletonList(new z710.g.a());
        }
        super.Q(y810Var3, y810Var4, p810Var2);
        return null;
    }

    public final void U(glu gluVar) {
        ma10 V = V();
        UserId userId = gluVar.b;
        V.b.getClass();
        tfx tfxVar = new tfx("groups.setGroupSettings", new bo(20), new sr(14));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfxVar.j("market_enabled", true);
        s3q0 s3q0Var = s3q0.a;
        a7f0.a.f(this, rsg0.w0(yfb.x(tfxVar)), new yu1(16, this, gluVar), new e810(this, 0), 1);
    }

    public final ma10 V() {
        return (ma10) this.m.getValue();
    }

    public final void X(UserId userId, String str, List list) {
        int i = 18;
        this.o.b(a7f0.a.f(this, V().b(0, userId, str).l(new iw3(new ku1(i, this, list), i)), new p010(this, 2), new d410(this, 2), 1));
    }

    public final void Y(y810 y810Var) {
        Integer num = y810Var.r;
        if (num != null) {
            a7f0.a.f(this, V().a(num.intValue(), this.i, this.j).l(new u5(new defpackage.v(14, y810Var, this), 20)), new r3h(this, 23), new lrk(this, 28), 1);
        }
    }

    public final void Z(y810 y810Var) {
        Object obj;
        Iterator<T> it = y810Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((glu) obj).e) {
                    break;
                }
            }
        }
        glu gluVar = (glu) obj;
        if (gluVar == null || W(gluVar.g)) {
            return;
        }
        int i = y810Var.i;
        a7f0.a.f(this, V().b(i, gluVar.b, y810Var.k).l(new pj4(new prm(i, y810Var, this), 26)), new sop(this, 27), new owv(this, 6), 1);
    }

    public final void b0(y810 y810Var) {
        ma10 V = V();
        UserId userId = this.i;
        boolean z = this.j;
        int i = 27;
        a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.B(V.c(userId, z), V().a(0, userId, z), new d810(new xk6(this, 6), 0)), new gv(new defpackage.c(21, this, y810Var), i)), new kdn(this, 18), new igh(this, i), 1);
    }

    public final void c0(List list, y810 y810Var) {
        this.n.b(new v810.c.b(list, a910.a(y810Var.x, null, Long.valueOf(SystemClock.elapsedRealtime()), 7)));
    }
}

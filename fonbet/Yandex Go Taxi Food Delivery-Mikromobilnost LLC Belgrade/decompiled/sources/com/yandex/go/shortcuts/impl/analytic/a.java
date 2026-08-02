package com.yandex.go.shortcuts.impl.analytic;

import com.yandex.go.dto.response.Action$Deeplink;
import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import com.yandex.go.shortcuts.view.adapter.model.HeaderService$Type;
import defpackage.as6;
import defpackage.ayr0;
import defpackage.b52;
import defpackage.bv;
import defpackage.cv;
import defpackage.cyr0;
import defpackage.ebu;
import defpackage.evu0;
import defpackage.ex00;
import defpackage.fyr0;
import defpackage.ga5;
import defpackage.ghf;
import defpackage.gwz0;
import defpackage.hbp0;
import defpackage.iyr0;
import defpackage.jl40;
import defpackage.lsy;
import defpackage.lx4;
import defpackage.lxt0;
import defpackage.ma1;
import defpackage.na1;
import defpackage.nc6;
import defpackage.nxk0;
import defpackage.ofa0;
import defpackage.pcu;
import defpackage.pyr0;
import defpackage.q22;
import defpackage.qyr0;
import defpackage.r22;
import defpackage.r27;
import defpackage.r3h;
import defpackage.st0;
import defpackage.sxr0;
import defpackage.t4s0;
import defpackage.tt2;
import defpackage.txr0;
import defpackage.u4s0;
import defpackage.vxr0;
import defpackage.w511;
import defpackage.w5b0;
import defpackage.wxr0;
import defpackage.x5b0;
import defpackage.yj11;
import defpackage.yyr0;
import defpackage.z660;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.credentials.e;
import ru.yandex.taxi.superapp.adjust.SupportedAdjustEvents;

/* loaded from: classes8.dex */
public final class a implements sxr0 {
    public final lx4 a;
    public final r22 b;
    public final ma1 c;
    public final t4s0 d;
    public final ghf e;
    public final z660 f;
    public final e g;
    public final hbp0 h;
    public final ofa0 i;
    public String k;
    public String l;
    public Boolean m;
    public boolean n;
    public final txr0 q;
    public final ArrayList j = new ArrayList();
    public List o = EmptyList.a;
    public final LinkedHashSet p = new LinkedHashSet();

    public a(lx4 lx4Var, r22 r22Var, ma1 ma1Var, t4s0 t4s0Var, ghf ghfVar, z660 z660Var, e eVar, tt2 tt2Var) {
        this.a = lx4Var;
        this.b = r22Var;
        this.c = ma1Var;
        this.d = t4s0Var;
        this.e = ghfVar;
        this.f = z660Var;
        this.g = eVar;
        this.h = new hbp0(new ShortcutAnalyticsImpl$scope$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
        this.i = new ofa0(ghfVar.b());
        ShortcutAnalyticsImpl$BehaviorState shortcutAnalyticsImpl$BehaviorState = ShortcutAnalyticsImpl$BehaviorState.COLLAPSED;
        this.q = new txr0();
    }

    public static List c(List list, BaseShortcutModel$Source baseShortcutModel$Source, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yyr0 yyr0Var = (yyr0) it.next();
            String e = baseShortcutModel$Source == yyr0Var.getSource() ? yyr0Var.e() : null;
            if (e != null) {
                arrayList.add(e);
            }
        }
        return kotlin.collections.a.A0(arrayList, i);
    }

    public final void b(st0 st0Var, i iVar) {
        int indexOf;
        String analyticKey = (this.n ? ShortcutAnalyticsImpl$CardMode.OPENED : ShortcutAnalyticsImpl$CardMode.CLOSED).getAnalyticKey();
        LinkedHashMap linkedHashMap = iVar.a;
        linkedHashMap.put("CardMode", analyticKey);
        iVar.d("MainScreenVersion", "shortcuts");
        if (!st0Var.k().isEmpty()) {
            iVar.e("shortcuts_list", st0Var.k());
        }
        if (st0Var.f().isEmpty()) {
            b52 i = st0Var.i();
            if (i != null) {
                linkedHashMap.put("services", i.a());
            }
        } else {
            linkedHashMap.put("services", st0Var.f());
        }
        String d = st0Var.d();
        if (d != null && !evu0.J(d)) {
            iVar.d("EventPayload", st0Var.d());
        }
        yyr0 h = st0Var.h();
        if (h != null) {
            boolean z = h instanceof pcu;
            List list = this.o;
            if (z) {
                Iterator it = list.iterator();
                indexOf = 0;
                while (true) {
                    if (!it.hasNext()) {
                        indexOf = -1;
                        break;
                    } else if (jl40.l(((yyr0) it.next()).e(), ((pcu) h).e())) {
                        break;
                    } else {
                        indexOf++;
                    }
                }
            } else {
                indexOf = list.indexOf(h);
            }
            iVar.b(indexOf, "Position");
        }
        ShortcutAnalyticsImpl$Type l = st0Var.l();
        if (l != null) {
            linkedHashMap.put("Type", l.getAnalyticKey());
        }
        if (st0Var.j() != null && (!evu0.J(r5))) {
            iVar.d("ShortcutID", st0Var.j());
        }
        if (st0Var.e() != null && (!evu0.J(r5))) {
            iVar.d("GridID", st0Var.e());
        }
        if (st0Var.c() != null && (!evu0.J(r5))) {
            iVar.d("DeepLink", st0Var.c());
        }
        if (!st0Var.g().isEmpty()) {
            iVar.e("ButtonID", st0Var.g());
        }
        if (st0Var.b() == null || !(!evu0.J(r5))) {
            return;
        }
        iVar.d("action", st0Var.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final st0 d(yyr0 yyr0Var) {
        ShortcutAnalyticsImpl$Type shortcutAnalyticsImpl$Type;
        b52 b;
        String a;
        switch (wxr0.a[yyr0Var.getSource().ordinal()]) {
            case 1:
                shortcutAnalyticsImpl$Type = ShortcutAnalyticsImpl$Type.SHORTCUT;
                break;
            case 2:
                shortcutAnalyticsImpl$Type = ShortcutAnalyticsImpl$Type.ACTION;
                break;
            case 3:
                if (yyr0Var instanceof pcu) {
                    shortcutAnalyticsImpl$Type = ShortcutAnalyticsImpl$Type.ACTION;
                    break;
                }
                return null;
            case 4:
                shortcutAnalyticsImpl$Type = ShortcutAnalyticsImpl$Type.BUTTON;
                break;
            case 5:
                shortcutAnalyticsImpl$Type = ShortcutAnalyticsImpl$Type.SHORTCUT;
                break;
            case 6:
                shortcutAnalyticsImpl$Type = ShortcutAnalyticsImpl$Type.SHORTCUT;
                break;
            case 7:
                shortcutAnalyticsImpl$Type = ShortcutAnalyticsImpl$Type.STACK_ITEM;
                break;
            case 8:
                shortcutAnalyticsImpl$Type = ShortcutAnalyticsImpl$Type.STACK_ITEM;
                break;
            default:
                return null;
        }
        this.b.getClass();
        if (!(yyr0Var instanceof ga5)) {
            if (yyr0Var instanceof r27) {
                b = r22.a(((r27) yyr0Var).y());
            } else if (yyr0Var instanceof ex00) {
                b = r22.a(((ex00) yyr0Var).v());
            } else if (yyr0Var instanceof yj11) {
                yj11 yj11Var = (yj11) yyr0Var;
                b = r22.b(yj11Var.getC(), yj11Var.v());
            } else if (yyr0Var instanceof gwz0) {
                b = r22.b(((gwz0) yyr0Var).getC(), null);
            } else {
                if (yyr0Var instanceof nc6) {
                    b = r22.b(((nc6) yyr0Var).getC(), null);
                }
                b = null;
            }
            if (yyr0Var instanceof ex00) {
            }
            q1 c = yyr0Var.getC();
            if (!(c instanceof Action$Deeplink)) {
            }
            vxr0 vxr0Var = new vxr0(0);
            vxr0Var.i(shortcutAnalyticsImpl$Type);
            vxr0Var.h(yyr0Var.e());
            vxr0Var.e(yyr0Var.f());
            vxr0Var.g(b);
            vxr0Var.c(r2);
            vxr0Var.d(r1);
            vxr0Var.f(yyr0Var);
            a = this.q.a(yyr0Var);
            if (a != null) {
            }
            return vxr0Var.a();
        }
        ga5 ga5Var = (ga5) yyr0Var;
        int i = q22.a[ga5Var.getType().ordinal()];
        b = pyr0.a;
        switch (i) {
            case 1:
                b = null;
                break;
            case 2:
            case 3:
                break;
            case 4:
                if (((ebu) yyr0Var).w() == HeaderService$Type.DELIVERY) {
                    b = cyr0.a;
                    break;
                }
                break;
            case 5:
                b = r22.a(((r3h) yyr0Var).v());
                break;
            case 6:
                b = r22.a(((ebu) yyr0Var).w());
                break;
            case 7:
                b = iyr0.a;
                break;
            case 8:
                b = r22.a(((ebu) yyr0Var).w());
                break;
            case 9:
                b = r22.b(ga5Var.getC(), ((w5b0) yyr0Var).v());
                break;
            case 10:
                b = r22.b(ga5Var.getC(), ((x5b0) yyr0Var).v());
                break;
            case 11:
                b = fyr0.a;
                break;
            case 12:
                b = r22.b(ga5Var.getC(), ((bv) yyr0Var).w());
                break;
            case 13:
                b = r22.b(ga5Var.getC(), ((cv) yyr0Var).v());
                break;
            case 14:
                b = r22.b(ga5Var.getC(), ((ebu) yyr0Var).w());
                break;
            case 15:
                b = r22.b(ga5Var.getC(), ((ebu) yyr0Var).w());
                break;
            case 16:
                b = qyr0.a;
                break;
            case 17:
                b52 b2 = r22.b(ga5Var.getC(), ((lsy) yyr0Var).w());
                if (b2 != null) {
                    b = b2;
                    break;
                }
                break;
            case 18:
                b = r22.b(ga5Var.getC(), ((ebu) yyr0Var).w());
                break;
            case 19:
                b = r22.b(ga5Var.getC(), ((nxk0) yyr0Var).v());
                break;
            case 20:
                b = r22.b(ga5Var.getC(), ((lxt0) yyr0Var).v());
                break;
            default:
                w511.b();
                return null;
        }
        String d = yyr0Var instanceof ex00 ? ((ex00) yyr0Var).d() : null;
        q1 c2 = yyr0Var.getC();
        String str = !(c2 instanceof Action$Deeplink) ? ((Action$Deeplink) c2).a : "";
        vxr0 vxr0Var2 = new vxr0(0);
        vxr0Var2.i(shortcutAnalyticsImpl$Type);
        vxr0Var2.h(yyr0Var.e());
        vxr0Var2.e(yyr0Var.f());
        vxr0Var2.g(b);
        vxr0Var2.c(str);
        vxr0Var2.d(d);
        vxr0Var2.f(yyr0Var);
        a = this.q.a(yyr0Var);
        if (a != null) {
            vxr0Var2.b(a);
        }
        return vxr0Var2.a();
    }

    public final void e(ShortcutAnalyticsImpl$ScrollDirection shortcutAnalyticsImpl$ScrollDirection, String str, int i, String str2) {
        i d = ((j) this.a).d((String) this.i.w);
        d.d("Direction", shortcutAnalyticsImpl$ScrollDirection.getType());
        d.d("last_shortcut_id", str);
        d.e("shortcuts_list", ((u4s0) this.d).a());
        d.b(i, "shortcut_shown_part");
        if (this.l != null && (!evu0.J(r3))) {
            d.d("GridID", this.l);
        }
        d.d("MainScreenVersion", "shortcuts");
        if (str2 != null && !evu0.J(str2)) {
            d.d("EventPayload", str2);
        }
        d.m();
    }

    public final void f(yyr0 yyr0Var, ayr0 ayr0Var) {
        st0 d = d(yyr0Var);
        if (d == null) {
            return;
        }
        String str = (String) this.i.c;
        j jVar = (j) this.a;
        i d2 = jVar.d(str);
        b(d, d2);
        if (ayr0Var != null) {
            d2.d("services", ayr0Var.a());
        }
        d2.m();
        b52 b52Var = ayr0Var;
        if (ayr0Var == null) {
            b52Var = d.i();
        }
        if (jl40.l(b52Var, pyr0.a)) {
            ((na1) this.c).getClass();
            jVar.v(as6.A());
        } else if (b52Var != null) {
            String a = this.g.a(SupportedAdjustEvents.SHORTCUT_CLICKED, b52Var.a());
            if (a != null) {
                jVar.v(a);
            }
        }
    }
}

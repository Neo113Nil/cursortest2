package com.yandex.go.shortcuts.impl.view.adapter;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.impl.view.adapter.p;
import com.yandex.go.shortcuts.impl.view.adapter.u;
import com.yandex.go.shortcuts.models.OfferType;
import defpackage.at5;
import defpackage.ays;
import defpackage.b8k0;
import defpackage.bhc0;
import defpackage.bnt0;
import defpackage.bv;
import defpackage.bys;
import defpackage.c1f;
import defpackage.cnt0;
import defpackage.cuy0;
import defpackage.cv;
import defpackage.cx00;
import defpackage.d1q0;
import defpackage.dia0;
import defpackage.dnt0;
import defpackage.dv;
import defpackage.e6g;
import defpackage.e6v;
import defpackage.ea5;
import defpackage.ebu;
import defpackage.ekh0;
import defpackage.ent0;
import defpackage.ev;
import defpackage.ex00;
import defpackage.fnt0;
import defpackage.fv;
import defpackage.g0c;
import defpackage.g9s;
import defpackage.ga5;
import defpackage.he7;
import defpackage.i0s0;
import defpackage.i1z;
import defpackage.ip11;
import defpackage.j1s0;
import defpackage.j1z;
import defpackage.jsy;
import defpackage.k2s0;
import defpackage.k3s0;
import defpackage.kf10;
import defpackage.kl3;
import defpackage.kx00;
import defpackage.l2s0;
import defpackage.l4q0;
import defpackage.lf10;
import defpackage.lsy;
import defpackage.lug0;
import defpackage.lx00;
import defpackage.lxo0;
import defpackage.lxt0;
import defpackage.mf10;
import defpackage.mmp0;
import defpackage.mqv0;
import defpackage.mug0;
import defpackage.n170;
import defpackage.n3q0;
import defpackage.nxk0;
import defpackage.ny61;
import defpackage.o5r0;
import defpackage.o990;
import defpackage.oo31;
import defpackage.pdc;
import defpackage.ppr0;
import defpackage.prq0;
import defpackage.qoi0;
import defpackage.qry0;
import defpackage.qux0;
import defpackage.r3h;
import defpackage.rbu;
import defpackage.rs5;
import defpackage.s5o;
import defpackage.scc;
import defpackage.sxr0;
import defpackage.t3s0;
import defpackage.t4s0;
import defpackage.tls;
import defpackage.u50;
import defpackage.uh6;
import defpackage.vfm;
import defpackage.vmz;
import defpackage.w3s0;
import defpackage.w511;
import defpackage.w5b0;
import defpackage.wfm;
import defpackage.wls;
import defpackage.wor0;
import defpackage.ww90;
import defpackage.wys;
import defpackage.x1s0;
import defpackage.x3q0;
import defpackage.x3s0;
import defpackage.x5b0;
import defpackage.xpy;
import defpackage.ykn0;
import defpackage.yln;
import defpackage.zj11;
import defpackage.zxs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public class t extends bys implements fnt0 {
    public final w3s0 A;
    public final Resources z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(Resources resources, final com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, w3s0 w3s0Var, final ru.yandex.taxi.widget.c cVar, x3s0 x3s0Var, ays aysVar, x3s0 x3s0Var2, wor0 wor0Var, List list, i0s0 i0s0Var, c1f c1fVar, n170 n170Var, final t4s0 t4s0Var, k3s0 k3s0Var, final j1s0 j1s0Var, x1s0 x1s0Var, yln ylnVar, mmp0 mmp0Var, ru.yandex.taxi.widget.utils.e eVar, mqv0 mqv0Var, final ru.yandex.taxi.design.utils.a aVar2, pdc pdcVar, ip11 ip11Var, sxr0 sxr0Var, ykn0 ykn0Var, String str) {
        super(x3s0Var, r0);
        int i = o.Z;
        List singletonList = Collections.singletonList(new s5o(RidaTariffsViewHolder$Companion$itemType$1.b));
        g0c a = qoi0.a(b8k0.class);
        zxs zxsVar = new zxs(a.a(), 0, null, singletonList, null, new o990(20, aVar, ykn0Var));
        List list2 = g.f0;
        zxs zxsVar2 = new zxs(qoi0.a(ebu.class), ekh0.action_list_item, g.f0, new rs5(cVar, t4s0Var, c1fVar, n170Var, x3s0Var, eVar, j1s0Var, 3));
        List list3 = i.Z;
        zxs zxsVar3 = new zxs(qoi0.a(cx00.class), ekh0.market_items_placeholder, i.Z, new vmz(12, cVar, t4s0Var));
        ArrayList arrayList = e.q0;
        zxs zxsVar4 = new zxs(qoi0.a(r3h.class), ekh0.deeplink_shortcut_list_item, e.q0, new rs5(aVar, t4s0Var, c1fVar, n170Var, cVar, j1s0Var, x3s0Var2, 1));
        ArrayList arrayList2 = v.m0;
        zxs zxsVar5 = new zxs(qoi0.a(qux0.class), ekh0.taxi_shortcut_list_item, v.m0, new wfm(w3s0Var, t4s0Var, c1fVar, n170Var, aVar, cVar, j1s0Var, mqv0Var));
        ArrayList arrayList3 = f.m0;
        zxs zxsVar6 = new zxs(qoi0.a(vfm.class), ekh0.action_driven_shortcut_list_item, f.m0, new wfm(w3s0Var, t4s0Var, c1fVar, n170Var, cVar, aVar, j1s0Var, mqv0Var));
        ArrayList arrayList4 = a.o0;
        zxs zxsVar7 = new zxs(qoi0.a(bv.class), ekh0.action_driven_shortcut_list_item, a.o0, new fv(w3s0Var, t4s0Var, c1fVar, n170Var, cVar, aVar, j1s0Var, mqv0Var, x1s0Var, 0));
        int i2 = mf10.l0;
        g0c a2 = qoi0.a(kf10.class);
        int i3 = ekh0.simple_shortcut_list_item;
        ArrayList arrayList5 = c.g0;
        zxs zxsVar8 = new zxs(a2, i3, arrayList5, new lf10(w3s0Var, t4s0Var, c1fVar, n170Var, aVar, cVar, j1s0Var, x3s0Var2, 0));
        int i4 = prq0.S;
        g0c a3 = qoi0.a(rbu.class);
        int i5 = ekh0.space_list_item;
        SeparatorViewHolder$Companion$itemType$1 separatorViewHolder$Companion$itemType$1 = SeparatorViewHolder$Companion$itemType$1.b;
        Class a4 = a3.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar9 = new zxs(a4, i5, null, emptyList, separatorViewHolder$Companion$itemType$1, null);
        g0c a5 = qoi0.a(t3s0.class);
        zxs zxsVar10 = new zxs(a5.a(), ekh0.space_list_item, null, emptyList, separatorViewHolder$Companion$itemType$1, null);
        List list4 = w.f0;
        zxs zxsVar11 = new zxs(zj11.class, ekh0.turbo_buttons_section, w.f0, new lf10(x3s0Var, aVar, t4s0Var, c1fVar, cVar, w3s0Var, n170Var, j1s0Var));
        List list5 = q.V;
        zxs zxsVar12 = new zxs(qoi0.a(d1q0.class), ekh0.section_header, q.V, new lxo0(5, cVar, t4s0Var, j1s0Var));
        List list6 = s.e0;
        zxs zxsVar13 = new zxs(qoi0.a(l4q0.class), ekh0.section_typed_header, s.e0, new u50(aVar, cVar, t4s0Var, j1s0Var, ip11Var, 21));
        List list7 = r.Z;
        zxs zxsVar14 = new zxs(qoi0.a(n3q0.class), ekh0.section_scrollable, r.Z, new lxo0(new k2s0(i0s0Var, resources, aVar, w3s0Var, cVar, x3s0Var, aysVar, x3s0Var2, wor0Var, j1s0Var, ylnVar, mmp0Var, eVar, pdcVar, aVar2, sxr0Var, ykn0Var, str), wor0Var, t4s0Var, k3s0Var));
        List list8 = com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.b.U;
        zxs zxsVar15 = new zxs(qoi0.a(kx00.class), ekh0.market_recommendations_section_item, com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.b.U, new rs5(cVar, t4s0Var, k3s0Var, aVar, x3s0Var, new lx00(), new e6g(resources), 5));
        ArrayList arrayList6 = j.q0;
        zxs zxsVar16 = new zxs(qoi0.a(w5b0.class), ekh0.personal_shortcut_item, j.q0, new dv(c1fVar, n170Var, t4s0Var, cVar, j1s0Var, aVar));
        l2s0 l2s0Var = new l2s0(resources, aVar, w3s0Var, cVar, x3s0Var, aysVar, x3s0Var2, wor0Var, i0s0Var, c1fVar, n170Var, t4s0Var, k3s0Var, j1s0Var, x1s0Var, ylnVar, mmp0Var, eVar, mqv0Var, aVar2, pdcVar, ip11Var, sxr0Var, ykn0Var, str);
        List list9 = n.e0;
        g0c a6 = qoi0.a(x5b0.class);
        dia0 dia0Var = new dia0(18);
        ww90 ww90Var = new ww90(10, sxr0Var, l2s0Var);
        final int i6 = 1;
        zxs zxsVar17 = new zxs(a6.a(), 0, dia0Var, list9, new he7(1, ww90Var), null);
        int i7 = o5r0.S;
        zxs zxsVar18 = new zxs(bhc0.class, ekh0.plain_button_item, new tls() { // from class: rsy
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i8 = i6;
                j1s0 j1s0Var2 = j1s0Var;
                View view = (View) obj;
                switch (i8) {
                    case 0:
                        x3q0 x3q0Var = new x3q0(view, 1);
                        int a7 = j1s0Var2.a(32);
                        ListItemComponent listItemComponent = (ListItemComponent) view;
                        listItemComponent.setSubtitleTextSizePx(j1s0Var2.a(16));
                        listItemComponent.setTitleTextSizePx(a7);
                        return x3q0Var;
                    case 1:
                        o5r0 o5r0Var = new o5r0(view, 1);
                        ((ButtonComponent) view).setTextSize(1, 16.0f * j1s0Var2.a);
                        return o5r0Var;
                    default:
                        return new cuy0(view, j1s0Var2);
                }
            }
        });
        int i8 = x3q0.S;
        final int i9 = 0;
        zxs zxsVar19 = new zxs(jsy.class, ekh0.list_item, new tls() { // from class: rsy
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i82 = i9;
                j1s0 j1s0Var2 = j1s0Var;
                View view = (View) obj;
                switch (i82) {
                    case 0:
                        x3q0 x3q0Var = new x3q0(view, 1);
                        int a7 = j1s0Var2.a(32);
                        ListItemComponent listItemComponent = (ListItemComponent) view;
                        listItemComponent.setSubtitleTextSizePx(j1s0Var2.a(16));
                        listItemComponent.setTitleTextSizePx(a7);
                        return x3q0Var;
                    case 1:
                        o5r0 o5r0Var = new o5r0(view, 1);
                        ((ButtonComponent) view).setTextSize(1, 16.0f * j1s0Var2.a);
                        return o5r0Var;
                    default:
                        return new cuy0(view, j1s0Var2);
                }
            }
        });
        List list10 = h.g0;
        zxs zxsVar20 = new zxs(lsy.class, ekh0.shortcut_list_item, h.g0, new at5(aVar, t4s0Var, cVar, j1s0Var, aysVar, pdcVar, 4));
        int i10 = cuy0.S;
        final int i11 = 2;
        zxs zxsVar21 = new zxs(qry0.class, ekh0.text_item, new tls() { // from class: rsy
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i82 = i11;
                j1s0 j1s0Var2 = j1s0Var;
                View view = (View) obj;
                switch (i82) {
                    case 0:
                        x3q0 x3q0Var = new x3q0(view, 1);
                        int a7 = j1s0Var2.a(32);
                        ListItemComponent listItemComponent = (ListItemComponent) view;
                        listItemComponent.setSubtitleTextSizePx(j1s0Var2.a(16));
                        listItemComponent.setTitleTextSizePx(a7);
                        return x3q0Var;
                    case 1:
                        o5r0 o5r0Var = new o5r0(view, 1);
                        ((ButtonComponent) view).setTextSize(1, 16.0f * j1s0Var2.a);
                        return o5r0Var;
                    default:
                        return new cuy0(view, j1s0Var2);
                }
            }
        });
        int i12 = j1z.R;
        zxs zxsVar22 = new zxs(i1z.class, ekh0.loading_title, new xpy(7));
        int i13 = ev.j0;
        zxs zxsVar23 = new zxs(qoi0.a(cv.class), ekh0.action_driven_thumb_item, arrayList5, new dv(aVar, t4s0Var, c1fVar, n170Var, cVar, j1s0Var));
        int i14 = p.j0;
        final int i15 = 0;
        zxs zxsVar24 = new zxs(qoi0.a(nxk0.class), ekh0.round_button_shortcut_item, emptyList, new tls() { // from class: pxk0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return new p((View) obj, t4s0Var, cVar, aVar, aVar2);
                    default:
                        return new u((View) obj, t4s0Var, cVar, aVar, aVar2);
                }
            }
        });
        int i16 = u.m0;
        final int i17 = 1;
        zxs zxsVar25 = new zxs(qoi0.a(lxt0.class), ekh0.square_button_shortcut_item, emptyList, new tls() { // from class: pxk0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        return new p((View) obj, t4s0Var, cVar, aVar, aVar2);
                    default:
                        return new u((View) obj, t4s0Var, cVar, aVar, aVar2);
                }
            }
        });
        List list11 = com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.a.e0;
        ArrayList c = scc.c(zxsVar, zxsVar2, zxsVar3, zxsVar4, zxsVar5, zxsVar6, zxsVar7, zxsVar8, zxsVar9, zxsVar10, zxsVar11, zxsVar12, zxsVar13, zxsVar14, zxsVar15, zxsVar16, zxsVar17, zxsVar18, zxsVar19, zxsVar20, zxsVar21, zxsVar22, zxsVar23, zxsVar24, zxsVar25, new zxs(qoi0.a(ex00.class), ekh0.market_recommendation_item, com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.a.e0, new rs5(t4s0Var, new lx00(), new e6g(resources), cVar, aVar, ProductMode$Taxi.SectionType.VERTICAL_STACK_SECTION, x3s0Var, 4)));
        c.addAll(list);
        this.z = resources;
        this.A = w3s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    @Override // defpackage.fnt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kl3 a(int i) {
        int unitSizeToPixels;
        int unitSizeToPixels2;
        int dimensionPixelSize;
        Object obj;
        Object obj2;
        int i2;
        int applyDimension;
        Integer num;
        Integer valueOf;
        int dimensionPixelSize2;
        Object obj3;
        Object obj4;
        int i3;
        Integer num2;
        e6v e6vVar = (e6v) getItem(i);
        boolean z = e6vVar instanceof rbu;
        boolean z2 = false;
        Resources resources = this.z;
        if (z) {
            return new bnt0(resources.getDimensionPixelSize(mug0.shortcuts_grid_big_row_space), false, 6);
        }
        if (e6vVar instanceof d1q0) {
            if (i == 0) {
                FormattedText formattedText = ((d1q0) e6vVar).b;
                Iterator it = formattedText.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (((ru.yandex.taxi.common_models.net.o) obj3) instanceof FormattedText.d) {
                        break;
                    }
                }
                FormattedText.d dVar = obj3 instanceof FormattedText.d ? (FormattedText.d) obj3 : null;
                Iterator it2 = formattedText.a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it2.next();
                    if (((ru.yandex.taxi.common_models.net.o) obj4) instanceof FormattedText.h) {
                        break;
                    }
                }
                FormattedText.h hVar = obj4 instanceof FormattedText.h ? (FormattedText.h) obj4 : null;
                if (dVar != null) {
                    int i4 = dVar.e;
                    valueOf = i4 > 0 ? Integer.valueOf(i4) : null;
                    if (valueOf != null) {
                        i3 = valueOf.intValue();
                        dimensionPixelSize2 = (resources.getDimensionPixelSize(lug0.shortcuts_section_title_vertical_padding) * 2) + ((int) uh6.o(Math.max(i3, (hVar != null || (num2 = hVar.d) == null) ? 0 : num2.intValue())));
                    }
                }
                i3 = dVar != null ? dVar.d : 0;
                dimensionPixelSize2 = (resources.getDimensionPixelSize(lug0.shortcuts_section_title_vertical_padding) * 2) + ((int) uh6.o(Math.max(i3, (hVar != null || (num2 = hVar.d) == null) ? 0 : num2.intValue())));
            } else {
                dimensionPixelSize2 = resources.getDimensionPixelSize(mug0.shortcuts_section_title_height);
            }
            return new bnt0(dimensionPixelSize2, false, 6);
        }
        if (e6vVar instanceof l4q0) {
            if (i == 0) {
                l4q0 l4q0Var = (l4q0) e6vVar;
                g9s g9sVar = l4q0Var.b;
                Iterator it3 = g9sVar.b.a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (((ru.yandex.taxi.common_models.net.o) obj) instanceof FormattedText.d) {
                        break;
                    }
                }
                FormattedText.d dVar2 = obj instanceof FormattedText.d ? (FormattedText.d) obj : null;
                Iterator it4 = g9sVar.b.a.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it4.next();
                    if (((ru.yandex.taxi.common_models.net.o) obj2) instanceof FormattedText.h) {
                        break;
                    }
                }
                FormattedText.h hVar2 = obj2 instanceof FormattedText.h ? (FormattedText.h) obj2 : null;
                int dimensionPixelSize3 = l4q0Var.d.length() > 0 ? resources.getDimensionPixelSize(lug0.shortcuts_section_typed_icon_height) : 0;
                if (dVar2 != null) {
                    int i5 = dVar2.e;
                    valueOf = i5 > 0 ? Integer.valueOf(i5) : null;
                    if (valueOf != null) {
                        i2 = valueOf.intValue();
                        dimensionPixelSize = Math.max((int) TypedValue.applyDimension(1, Math.max(i2, (hVar2 != null || (num = hVar2.d) == null) ? 0 : num.intValue()), resources.getDisplayMetrics()), dimensionPixelSize3);
                        applyDimension = (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
                        if (dimensionPixelSize < applyDimension) {
                            dimensionPixelSize = applyDimension;
                        }
                    }
                }
                i2 = dVar2 != null ? dVar2.d : 0;
                dimensionPixelSize = Math.max((int) TypedValue.applyDimension(1, Math.max(i2, (hVar2 != null || (num = hVar2.d) == null) ? 0 : num.intValue()), resources.getDisplayMetrics()), dimensionPixelSize3);
                applyDimension = (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
                if (dimensionPixelSize < applyDimension) {
                }
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(mug0.shortcuts_section_title_height);
            }
            return new bnt0(dimensionPixelSize, false, 6);
        }
        if (e6vVar instanceof ga5) {
            if (!(e6vVar instanceof ebu)) {
                if (e6vVar instanceof lsy) {
                    return new bnt0(resources.getDimensionPixelSize(mug0.shortcuts_navigation_list_item_height), ((lsy) e6vVar).h, 2);
                }
                ga5 ga5Var = (ga5) e6vVar;
                return new cnt0(ga5Var.getBase().a, ga5Var.getBase().b, ga5Var.t());
            }
            ebu ebuVar = (ebu) e6vVar;
            boolean z3 = ebuVar.g;
            ea5 ea5Var = ebuVar.b;
            if (ea5Var.f == OfferType.TAXI_ROUTE_INPUT && ebuVar.i) {
                z2 = true;
            }
            if (z2) {
                return new bnt0(resources.getDimensionPixelSize(mug0.shortcuts_navigation_header_height), z3, 2);
            }
            if (!z2) {
                return new cnt0(ea5Var.a, ea5Var.b, z3);
            }
            w511.b();
            return null;
        }
        if (e6vVar instanceof t3s0) {
            return new bnt0(((t3s0) e6vVar).a, false, 6);
        }
        boolean z4 = e6vVar instanceof zj11;
        w3s0 w3s0Var = this.A;
        if (z4) {
            int i6 = ((zj11) e6vVar).a;
            unitSizeToPixels2 = w3s0Var.a.unitSizeToPixels(1.0f);
            return new bnt0(unitSizeToPixels2 + i6, false, 6);
        }
        if (e6vVar instanceof n3q0) {
            unitSizeToPixels = w3s0Var.a.unitSizeToPixels(((n3q0) e6vVar).b);
            return new bnt0(unitSizeToPixels, false, 6);
        }
        if (e6vVar instanceof kx00) {
            return ((kx00) e6vVar).c;
        }
        if (e6vVar instanceof bhc0) {
            return new bnt0(resources.getDimensionPixelSize(mug0.plain_button_height), false, 6);
        }
        if (e6vVar instanceof jsy) {
            return new bnt0(((jsy) e6vVar).b, false, 6);
        }
        if (e6vVar instanceof qry0) {
            return new bnt0(((qry0) e6vVar).b, false, 6);
        }
        if (e6vVar instanceof ex00) {
            return new dnt0(false);
        }
        if (e6vVar instanceof b8k0) {
            return ent0.b;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((e6v) getItem(i)).getId().hashCode();
    }

    @Override // defpackage.bys, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: p */
    public final wys onCreateViewHolder(ViewGroup viewGroup, int i) {
        View f;
        wys wysVar;
        List list = this.w;
        if (list.isEmpty()) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        zxs zxsVar = (zxs) list.get(i);
        wls wlsVar = zxsVar.f;
        if (wlsVar != null) {
            wysVar = (wys) wlsVar.invoke(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        } else {
            tls tlsVar = zxsVar.e;
            if (tlsVar == null) {
                ny61.r("Invalid item type");
                return null;
            }
            tls tlsVar2 = zxsVar.c;
            if (tlsVar2 == null || (f = (View) tlsVar2.invoke(viewGroup)) == null) {
                f = oo31.f(viewGroup, zxsVar.b, viewGroup, false);
            }
            wysVar = (wys) tlsVar.invoke(f);
        }
        if (wysVar.X()) {
            ru.yandex.taxi.design.utils.c.z(new ppr0(5, wysVar, this), wysVar.a);
        }
        return wysVar;
    }
}

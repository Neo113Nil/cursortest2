package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.ai_widget.ui.a;
import com.yandex.go.design.view.GoFrameLayout;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.preorder.summary.selector.verticals.VerticalsWithBackgroundView;

/* loaded from: classes12.dex */
public final /* synthetic */ class cp1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;

    public /* synthetic */ cp1(int i, int i2, wls wlsVar) {
        this.a = i2;
        this.b = wlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        l1m0 l1m0Var;
        zy11 verticalsAdapter$lambda$0;
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        wls wlsVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.c(wlsVar, (fid) obj, vng.O(7));
                return zy11Var;
            case 1:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 j = vfc.j(x4c.G, an91.j(c530Var, cr1.b));
                    z910 d = pi6.d(x4c.b, false);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, j);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar2 = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar, S, wlsVar2);
                    }
                    qje.W(btsVar, d.d, d2);
                    xvz.u(0, wlsVar, btsVar, true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    f530 j2 = vfc.j(x4c.G, an91.j(new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), cr1.c));
                    z910 d3 = pi6.d(x4c.b, false);
                    int S2 = cma1.S(btsVar2);
                    r1b0 o2 = btsVar2.o();
                    f530 d4 = b.d(btsVar2, j2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, d3);
                    qje.W(btsVar2, d.e, o2);
                    wls wlsVar3 = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S2))) {
                        b64.z(S2, btsVar2, S2, wlsVar3);
                    }
                    qje.W(btsVar2, d.d, d4);
                    xvz.u(0, wlsVar, btsVar2, true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 3:
                ((Integer) obj).intValue();
                ob31 ob31Var = (ob31) obj2;
                wlsVar.invoke(ob31Var.a, ob31Var.b);
                return zy11Var;
            case 4:
                g1m0 g1m0Var = (g1m0) obj;
                List list = (List) wlsVar.invoke(g1m0Var, obj2);
                List list2 = list;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (l1m0Var = g1m0Var.b) != null && !l1m0Var.d(obj3)) {
                        vg10.c(i2, " can't be saved: ", obj3, "item at index ");
                        return null;
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            case 5:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    f530 o3 = an91.o(new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 0.0f, 0.0f, 0.0f, 0.0f, 10);
                    z910 d5 = pi6.d(x4c.b, false);
                    int S3 = cma1.S(btsVar3);
                    r1b0 o4 = btsVar3.o();
                    f530 d6 = b.d(btsVar3, o3);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar3);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, d5);
                    qje.W(btsVar3, d.e, o4);
                    wls wlsVar4 = d.g;
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S3))) {
                        b64.z(S3, btsVar3, S3, wlsVar4);
                    }
                    qje.W(btsVar3, d.d, d6);
                    xvz.u(0, wlsVar, btsVar3, true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                hlb1.a(wlsVar, (fid) obj, vng.O(7));
                return zy11Var;
            case 7:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    wlsVar.invoke(btsVar4, 0);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 8:
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    z910 d7 = pi6.d(x4c.b, false);
                    int S4 = cma1.S(btsVar5);
                    r1b0 o5 = btsVar5.o();
                    f530 d8 = b.d(btsVar5, c530Var);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar4);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, d.f, d7);
                    qje.W(btsVar5, d.e, o5);
                    wls wlsVar5 = d.g;
                    if (btsVar5.S || !jl40.l(btsVar5.Q(), Integer.valueOf(S4))) {
                        b64.z(S4, btsVar5, S4, wlsVar5);
                    }
                    qje.W(btsVar5, d.d, d8);
                    xvz.u(0, wlsVar, btsVar5, true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 9:
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    z910 d9 = pi6.d(x4c.b, false);
                    int S5 = cma1.S(btsVar6);
                    r1b0 o6 = btsVar6.o();
                    f530 d10 = b.d(btsVar6, c530Var);
                    ohd.G1.getClass();
                    sls slsVar5 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar5);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, d9);
                    qje.W(btsVar6, d.e, o6);
                    wls wlsVar6 = d.g;
                    if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(S5))) {
                        b64.z(S5, btsVar6, S5, wlsVar6);
                    }
                    qje.W(btsVar6, d.d, d10);
                    xvz.u(0, wlsVar, btsVar6, true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 10:
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    z910 d11 = pi6.d(x4c.b, false);
                    int S6 = cma1.S(btsVar7);
                    r1b0 o7 = btsVar7.o();
                    f530 d12 = b.d(btsVar7, c530Var);
                    ohd.G1.getClass();
                    sls slsVar6 = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar6);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, d11);
                    qje.W(btsVar7, d.e, o7);
                    wls wlsVar7 = d.g;
                    if (btsVar7.S || !jl40.l(btsVar7.Q(), Integer.valueOf(S6))) {
                        b64.z(S6, btsVar7, S6, wlsVar7);
                    }
                    qje.W(btsVar7, d.d, d12);
                    xvz.u(0, wlsVar, btsVar7, true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 11:
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    z910 d13 = pi6.d(x4c.b, false);
                    int S7 = cma1.S(btsVar8);
                    r1b0 o8 = btsVar8.o();
                    f530 d14 = b.d(btsVar8, c530Var);
                    ohd.G1.getClass();
                    sls slsVar7 = d.b;
                    if (btsVar8.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar8.i0();
                    if (btsVar8.S) {
                        btsVar8.n(slsVar7);
                    } else {
                        btsVar8.r0();
                    }
                    qje.W(btsVar8, d.f, d13);
                    qje.W(btsVar8, d.e, o8);
                    wls wlsVar8 = d.g;
                    if (btsVar8.S || !jl40.l(btsVar8.Q(), Integer.valueOf(S7))) {
                        b64.z(S7, btsVar8, S7, wlsVar8);
                    }
                    qje.W(btsVar8, d.d, d14);
                    xvz.u(0, wlsVar, btsVar8, true);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 12:
                Object obj4 = (Boolean) obj2;
                obj4.getClass();
                Boolean bool = (Boolean) wlsVar.invoke((g9r0) obj, obj4);
                bool.getClass();
                return bool;
            case 13:
                Object obj5 = (Boolean) obj2;
                obj5.getClass();
                Boolean bool2 = (Boolean) wlsVar.invoke((g9r0) obj, obj5);
                bool2.getClass();
                return bool2;
            case 14:
                View inflate = ((LayoutInflater) obj).inflate(cth0.detailed_price_slot_line_item, (ViewGroup) obj2, false);
                int i3 = eih0.firstColumn;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i3, inflate);
                if (listItemComponent != null) {
                    i3 = eih0.secondColumn;
                    ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i3, inflate);
                    if (listItemComponent2 != null) {
                        i3 = eih0.tooltipAnchor;
                        Space space = (Space) cma1.O(i3, inflate);
                        if (space != null) {
                            return new sts0(new u3j((GoFrameLayout) inflate, listItemComponent, listItemComponent2, space), wlsVar);
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 15:
                View inflate2 = ((LayoutInflater) obj).inflate(yrh0.surge_price_feedback_option_item, (ViewGroup) obj2, false);
                int i4 = zfh0.check_component;
                ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) cma1.O(i4, inflate2);
                if (listItemCheckComponent != null) {
                    return new zji0(new bvw0((LinearLayout) inflate2, listItemCheckComponent), wlsVar);
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
                return null;
            case 16:
                fid fidVar9 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    wlsVar.invoke(btsVar9, 6);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 17:
                Object obj6 = (List) obj;
                Object obj7 = (uhx0) kotlin.collections.a.R((List) obj2);
                if (obj7 != null) {
                    wlsVar.invoke(obj6, obj7);
                }
                return zy11Var;
            case 18:
                fid fidVar10 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 3) != 2)) {
                    f530 h = pj91.h(c530Var, "Container");
                    z910 d15 = pi6.d(x4c.b, true);
                    int S8 = cma1.S(btsVar10);
                    r1b0 o9 = btsVar10.o();
                    f530 d16 = b.d(btsVar10, h);
                    ohd.G1.getClass();
                    sls slsVar8 = d.b;
                    if (btsVar10.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar10.i0();
                    if (btsVar10.S) {
                        btsVar10.n(slsVar8);
                    } else {
                        btsVar10.r0();
                    }
                    qje.W(btsVar10, d.f, d15);
                    qje.W(btsVar10, d.e, o9);
                    wls wlsVar9 = d.g;
                    if (btsVar10.S || !jl40.l(btsVar10.Q(), Integer.valueOf(S8))) {
                        b64.z(S8, btsVar10, S8, wlsVar9);
                    }
                    qje.W(btsVar10, d.d, d16);
                    xvz.u(0, wlsVar, btsVar10, true);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 19:
                verticalsAdapter$lambda$0 = VerticalsWithBackgroundView.verticalsAdapter$lambda$0(wlsVar, ((Integer) obj).intValue(), (ob31) obj2);
                return verticalsAdapter$lambda$0;
            case 20:
                fid fidVar11 = (fid) obj;
                int intValue11 = ((Integer) obj2).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 3) != 2)) {
                    rzo.a(wwg.S(1795942141, true, new cp1(wlsVar, 21), btsVar11), btsVar11, 6);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            default:
                fid fidVar12 = (fid) obj;
                int intValue12 = ((Integer) obj2).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 3) != 2)) {
                    wlsVar.invoke(btsVar12, 0);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ cp1(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }
}

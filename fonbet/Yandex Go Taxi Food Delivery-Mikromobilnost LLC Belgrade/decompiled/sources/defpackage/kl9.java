package defpackage;

import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto;
import com.yandex.go.chargers.error.data.a;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto$Deeplink;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto$PlusHome;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto$Promotion;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderBannerDecorationDto$Animation;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderBannerDecorationDto$Image;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderDetailsItemDto$Header;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderDetailsItemDto$Item;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderDto;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$Banner;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$Button;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$ButtonsGroup;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$ListItem;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemMetadataDto$Promo;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderMultiOrderDto;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderStatusDto;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrdersResponse;
import com.yandex.go.chargers.order.data.model.ChargersMultiOrderHeaderDto;
import com.yandex.go.chargers.order.data.model.ChargersMultiOrderItemDto$Button;
import com.yandex.go.chargers.order.data.model.ChargersMultiOrderItemDto$Orders;
import com.yandex.go.chargers.order.data.model.ChargersMultiOrderUiDto;
import com.yandex.go.chargers.order.data.model.ChargersOrderNotificationActionDto$ShowPopupById;
import com.yandex.go.chargers.order.data.model.ChargersOrdersTabModeDto;
import com.yandex.go.chargers.order.data.model.Notification;
import com.yandex.go.chargers.order.data.model.PopupDto;
import com.yandex.go.chargers.order.data.model.b;
import com.yandex.go.chargers.order.data.model.c;
import com.yandex.go.chargers.order.data.model.d0;
import com.yandex.go.chargers.order.data.model.e;
import com.yandex.go.chargers.order.data.model.e0;
import com.yandex.go.chargers.order.data.model.f;
import com.yandex.go.chargers.order.data.model.g;
import com.yandex.go.chargers.order.data.model.g0;
import com.yandex.go.chargers.order.data.model.h;
import com.yandex.go.chargers.order.data.model.h0;
import com.yandex.go.chargers.order.data.model.k;
import com.yandex.go.chargers.order.data.model.l;
import com.yandex.go.chargers.order.data.model.m;
import com.yandex.go.chargers.order.data.model.n;
import com.yandex.go.chargers.order.data.model.o;
import com.yandex.go.chargers.order.data.model.p0;
import com.yandex.go.chargers.order.data.model.q0;
import com.yandex.go.chargers.order.data.model.r;
import com.yandex.go.chargers.order.data.model.s;
import com.yandex.go.chargers.order.data.model.t0;
import com.yandex.go.chargers.order.data.model.u0;
import com.yandex.go.chargers.order.data.model.v;
import com.yandex.go.chargers.order.data.model.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes.dex */
public final class kl9 {
    public final xdf a;
    public final j5a b;
    public final a c;

    public kl9(xdf xdfVar, j5a j5aVar, a aVar) {
        this.a = xdfVar;
        this.b = j5aVar;
        this.c = aVar;
    }

    public static ArrayList a(List list) {
        List<Notification> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (Notification notification : list2) {
            String a = notification.getA();
            String b = notification.getB();
            FormattedText c = notification.getC();
            FormattedText d = notification.getD();
            u0 e = notification.getE();
            vca vcaVar = null;
            if (e != null) {
                if (e instanceof ChargersOrderNotificationActionDto$ShowPopupById) {
                    vcaVar = new tca(((ChargersOrderNotificationActionDto$ShowPopupById) e).getA());
                } else {
                    if (!e.equals(t0.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    vcaVar = uca.a;
                }
            }
            arrayList.add(new c6a(a, b, c, d, vcaVar));
        }
        return arrayList;
    }

    public static ArrayList b(List list) {
        List<PopupDto> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (PopupDto popupDto : list2) {
            arrayList.add(new pma(popupDto.getA(), popupDto.getB(), popupDto.getC(), popupDto.getD()));
        }
        return arrayList;
    }

    public static hba c(o oVar) {
        if (oVar instanceof ChargersActiveOrderActionDto$Deeplink) {
            return new waa(((ChargersActiveOrderActionDto$Deeplink) oVar).getA());
        }
        if (oVar instanceof e) {
            return xaa.a;
        }
        if (oVar instanceof l) {
            return eba.a;
        }
        if (oVar instanceof ChargersActiveOrderActionDto$Promotion) {
            return new cba(((ChargersActiveOrderActionDto$Promotion) oVar).getA());
        }
        if (oVar instanceof g) {
            return zaa.a;
        }
        if (oVar instanceof n) {
            return gba.a;
        }
        if (oVar instanceof c) {
            return vaa.a;
        }
        if (oVar instanceof m) {
            return fba.a;
        }
        if (oVar instanceof ChargersActiveOrderActionDto$PlusHome) {
            return new aba(((ChargersActiveOrderActionDto$PlusHome) oVar).getA());
        }
        if (oVar instanceof h) {
            return bba.a;
        }
        if (oVar instanceof k) {
            return dba.a;
        }
        if (oVar instanceof b) {
            return uaa.a;
        }
        if (oVar instanceof f) {
            return yaa.a;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03a1  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [f5a] */
    /* JADX WARN: Type inference failed for: r14v3, types: [e5a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r5v29, types: [d18] */
    /* JADX WARN: Type inference failed for: r5v34, types: [nar] */
    /* JADX WARN: Type inference failed for: r6v4, types: [krj0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [qko] */
    /* JADX WARN: Type inference failed for: r8v15, types: [z8y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rl9 d(ChargersActiveOrdersResponse chargersActiveOrdersResponse, String str) {
        String str2;
        List list;
        ChargersOrdersTabModeDto chargersOrdersTabModeDto;
        String a;
        c4a c4aVar;
        ?? r11;
        List singletonList;
        List<q0> list2;
        rl9 rl9Var;
        rl9 rl9Var2;
        q3a q3aVar;
        List list3;
        ChargersMultiOrderHeaderDto.ChargersLabelDto chargersLabelDto;
        ChargersMultiOrderHeaderDto.Button button;
        c4a c4aVar2;
        q3a q3aVar2;
        Iterator it;
        FormattedText c;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        Iterator it2;
        FormattedText c2;
        FormattedText c3;
        tba tbaVar;
        tba tbaVar2;
        FormattedText c4;
        Iterator it3;
        FormattedText formattedText;
        kca hcaVar;
        FormattedText c5;
        FormattedText c6;
        kba jbaVar;
        Map map;
        kca kcaVar;
        FormattedText c7;
        FormattedText c8;
        Map map2;
        r8f r8fVar;
        List list4 = chargersActiveOrdersResponse.b;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list4.iterator();
        while (true) {
            r8f z8yVar = null;
            if (!it4.hasNext()) {
                rl9 rl9Var3 = null;
                this.b.getClass();
                ChargersMultiOrderUiDto chargersMultiOrderUiDto = chargersActiveOrdersResponse.c;
                ChargersMultiOrderHeaderDto chargersMultiOrderHeaderDto = chargersActiveOrdersResponse.a;
                if (chargersMultiOrderUiDto == null || (a = chargersMultiOrderUiDto.a) == null) {
                    if (chargersMultiOrderUiDto == null || (list = chargersMultiOrderUiDto.c) == null || (chargersOrdersTabModeDto = (ChargersOrdersTabModeDto) kotlin.collections.a.R(list)) == null) {
                        str2 = null;
                        FormattedText formattedText2 = chargersMultiOrderHeaderDto == null ? chargersMultiOrderHeaderDto.a : null;
                        q3a q3aVar3 = o3a.a;
                        q3a q3aVar4 = p3a.a;
                        if (chargersMultiOrderHeaderDto != null || (button = chargersMultiOrderHeaderDto.b) == null) {
                            c4aVar = null;
                        } else {
                            if (button.getA() == null) {
                                c4aVar2 = null;
                            } else {
                                FormattedText a2 = button.getA();
                                Boolean b = button.getB();
                                boolean booleanValue = b != null ? b.booleanValue() : false;
                                String c9 = button.getC();
                                w3a d = button.getD();
                                if (d instanceof u3a) {
                                    q3aVar2 = q3aVar4;
                                } else {
                                    if (!(d instanceof v3a) && d != null) {
                                        w511.b();
                                        return null;
                                    }
                                    q3aVar2 = q3aVar3;
                                }
                                c4aVar2 = new c4a(a2, booleanValue, c9, q3aVar2);
                            }
                            c4aVar = c4aVar2;
                        }
                        d4a d4aVar = (chargersMultiOrderHeaderDto != null || (chargersLabelDto = chargersMultiOrderHeaderDto.c) == null || chargersLabelDto.getA() == null) ? null : new d4a(chargersLabelDto.getB(), chargersLabelDto.getA());
                        if (chargersMultiOrderUiDto != null || (list3 = chargersMultiOrderUiDto.c) == null) {
                            r11 = EmptyList.a;
                        } else {
                            List<ChargersOrdersTabModeDto> list5 = list3;
                            r11 = new ArrayList(tcc.n(list5, 10));
                            for (ChargersOrdersTabModeDto chargersOrdersTabModeDto2 : list5) {
                                r11.add(new h5a(chargersOrdersTabModeDto2.getA(), chargersOrdersTabModeDto2.getB(), chargersOrdersTabModeDto2.getC()));
                            }
                        }
                        if (chargersMultiOrderUiDto != null || (list2 = chargersMultiOrderUiDto.b) == null) {
                            singletonList = Collections.singletonList(new f5a(str2));
                        } else {
                            singletonList = new ArrayList();
                            for (q0 q0Var : list2) {
                                if (q0Var instanceof ChargersMultiOrderItemDto$Button) {
                                    ChargersMultiOrderItemDto$Button chargersMultiOrderItemDto$Button = (ChargersMultiOrderItemDto$Button) q0Var;
                                    String f = chargersMultiOrderItemDto$Button.getF();
                                    FormattedText a3 = chargersMultiOrderItemDto$Button.getA();
                                    String b2 = chargersMultiOrderItemDto$Button.getB();
                                    w3a c10 = chargersMultiOrderItemDto$Button.getC();
                                    rl9Var = rl9Var3;
                                    if (c10 instanceof u3a) {
                                        q3aVar = q3aVar4;
                                    } else {
                                        if (!(c10 instanceof v3a) && c10 != null) {
                                            w511.b();
                                            return rl9Var;
                                        }
                                        q3aVar = q3aVar3;
                                    }
                                    rl9Var2 = new e5a(f, a3, b2, q3aVar, chargersMultiOrderItemDto$Button.getD(), chargersMultiOrderItemDto$Button.getE());
                                } else {
                                    rl9Var = rl9Var3;
                                    if (q0Var instanceof ChargersMultiOrderItemDto$Orders) {
                                        rl9Var2 = new f5a(((ChargersMultiOrderItemDto$Orders) q0Var).getA());
                                    } else {
                                        if (!jl40.l(q0Var, p0.INSTANCE)) {
                                            w511.b();
                                            return rl9Var;
                                        }
                                        rl9Var2 = rl9Var;
                                    }
                                }
                                if (rl9Var2 != null) {
                                    singletonList.add(rl9Var2);
                                }
                                rl9Var3 = rl9Var;
                            }
                        }
                        return new rl9(arrayList3, new i5a(formattedText2, c4aVar, d4aVar, str2, r11, singletonList), str);
                    }
                    a = chargersOrdersTabModeDto.getA();
                }
                str2 = a;
                if (chargersMultiOrderHeaderDto == null) {
                }
                q3a q3aVar32 = o3a.a;
                q3a q3aVar42 = p3a.a;
                if (chargersMultiOrderHeaderDto != null) {
                }
                c4aVar = null;
                if (chargersMultiOrderHeaderDto != null) {
                }
                if (chargersMultiOrderUiDto != null) {
                }
                r11 = EmptyList.a;
                if (chargersMultiOrderUiDto != null) {
                }
                singletonList = Collections.singletonList(new f5a(str2));
                return new rl9(arrayList3, new i5a(formattedText2, c4aVar, d4aVar, str2, r11, singletonList), str);
            }
            ChargersActiveOrderDto chargersActiveOrderDto = (ChargersActiveOrderDto) it4.next();
            ChargersActiveOrderStatusDto b3 = chargersActiveOrderDto.getB();
            if (b3 == null) {
                yx9.a(ChargersError.Companion, ChargersError.ActiveOrder, "order_status_null", 4);
                whb1.c(null, new IllegalStateException("orderStatus is null"));
            } else {
                String a4 = chargersActiveOrderDto.getA();
                if (a4 != null) {
                    FormattedText h = chargersActiveOrderDto.getH();
                    fef h2 = gwk0.h(chargersActiveOrderDto.getK());
                    switch (jl9.a[b3.ordinal()]) {
                        case 1:
                            it = it4;
                            z8yVar = new r8f(a4, h, f(chargersActiveOrderDto.getO(), h2));
                            if (z8yVar != null) {
                                arrayList3.add(z8yVar);
                            }
                            it4 = it;
                        case 2:
                            it = it4;
                            z8yVar = new krj0(a4, h, f(chargersActiveOrderDto.getO(), h2));
                            if (z8yVar != null) {
                            }
                            it4 = it;
                            break;
                        case 3:
                            it = it4;
                            z8yVar = new qko(a4, h, f(chargersActiveOrderDto.getO(), h2));
                            if (z8yVar != null) {
                            }
                            it4 = it;
                            break;
                        case 4:
                            ief k = chargersActiveOrderDto.getK();
                            xdf xdfVar = this.a;
                            FormattedText d2 = d9s.d(h, xdfVar, k);
                            sca f2 = f(chargersActiveOrderDto.getO(), h2);
                            FormattedText c11 = chargersActiveOrderDto.getC();
                            FormattedText d3 = chargersActiveOrderDto.getD();
                            String e = chargersActiveOrderDto.getE();
                            FormattedText f3 = chargersActiveOrderDto.getF();
                            String g = chargersActiveOrderDto.getG();
                            c = d9s.c(chargersActiveOrderDto.getI(), xdfVar, h2, true);
                            FormattedText j = chargersActiveOrderDto.getJ();
                            it = it4;
                            List l = chargersActiveOrderDto.getL();
                            ArrayList arrayList4 = new ArrayList(tcc.n(l, 10));
                            Iterator it5 = l.iterator();
                            while (it5.hasNext()) {
                                e0 e0Var = (e0) it5.next();
                                if (e0Var instanceof d0) {
                                    it3 = it5;
                                    hcaVar = jca.a;
                                } else {
                                    if (e0Var instanceof ChargersActiveOrderItemDto$ListItem) {
                                        ChargersActiveOrderItemDto$ListItem chargersActiveOrderItemDto$ListItem = (ChargersActiveOrderItemDto$ListItem) e0Var;
                                        c7 = d9s.c(chargersActiveOrderItemDto$ListItem.getA(), xdfVar, h2, true);
                                        c8 = d9s.c(chargersActiveOrderItemDto$ListItem.getB(), xdfVar, h2, true);
                                        String c12 = chargersActiveOrderItemDto$ListItem.getC();
                                        hba c13 = c(chargersActiveOrderItemDto$ListItem.getD());
                                        String e2 = chargersActiveOrderItemDto$ListItem.getE();
                                        h0 f4 = chargersActiveOrderItemDto$ListItem.getF();
                                        if (f4 instanceof ChargersActiveOrderItemMetadataDto$Promo) {
                                            map2 = ((ChargersActiveOrderItemMetadataDto$Promo) f4).getA();
                                        } else if (!(f4 instanceof g0)) {
                                            w511.b();
                                            break;
                                        } else {
                                            map2 = null;
                                        }
                                        it3 = it5;
                                        kcaVar = new ica(c7, c8, c12, c13, e2, map2);
                                    } else if (!(e0Var instanceof ChargersActiveOrderItemDto$Banner)) {
                                        it3 = it5;
                                        if (e0Var instanceof ChargersActiveOrderItemDto$Button) {
                                            hcaVar = e((ChargersActiveOrderItemDto$Button) e0Var, h2);
                                        } else if (!(e0Var instanceof ChargersActiveOrderItemDto$ButtonsGroup)) {
                                            w511.b();
                                            break;
                                        } else {
                                            ChargersActiveOrderItemDto$ButtonsGroup chargersActiveOrderItemDto$ButtonsGroup = (ChargersActiveOrderItemDto$ButtonsGroup) e0Var;
                                            List a5 = chargersActiveOrderItemDto$ButtonsGroup.getA();
                                            formattedText = d2;
                                            ArrayList arrayList5 = new ArrayList(tcc.n(a5, 10));
                                            Iterator it6 = a5.iterator();
                                            while (it6.hasNext()) {
                                                arrayList5.add(e((ChargersActiveOrderItemDto$Button) it6.next(), h2));
                                            }
                                            hcaVar = new hca(arrayList5, chargersActiveOrderItemDto$ButtonsGroup.getB());
                                            arrayList4.add(hcaVar);
                                            it5 = it3;
                                            d2 = formattedText;
                                        }
                                    } else {
                                        ChargersActiveOrderItemDto$Banner chargersActiveOrderItemDto$Banner = (ChargersActiveOrderItemDto$Banner) e0Var;
                                        c5 = d9s.c(chargersActiveOrderItemDto$Banner.getA(), xdfVar, h2, true);
                                        c6 = d9s.c(chargersActiveOrderItemDto$Banner.getB(), xdfVar, h2, true);
                                        s c14 = chargersActiveOrderItemDto$Banner.getC();
                                        it3 = it5;
                                        if (c14 instanceof ChargersActiveOrderBannerDecorationDto$Animation) {
                                            jbaVar = new iba(((ChargersActiveOrderBannerDecorationDto$Animation) c14).getA());
                                        } else if (c14 instanceof ChargersActiveOrderBannerDecorationDto$Image) {
                                            jbaVar = new jba(((ChargersActiveOrderBannerDecorationDto$Image) c14).getA());
                                        } else if (!(c14 instanceof r)) {
                                            w511.b();
                                            break;
                                        } else {
                                            jbaVar = new jba("");
                                        }
                                        kba kbaVar = jbaVar;
                                        hba c15 = c(chargersActiveOrderItemDto$Banner.getD());
                                        String e3 = chargersActiveOrderItemDto$Banner.getE();
                                        h0 f5 = chargersActiveOrderItemDto$Banner.getF();
                                        if (f5 instanceof ChargersActiveOrderItemMetadataDto$Promo) {
                                            map = ((ChargersActiveOrderItemMetadataDto$Promo) f5).getA();
                                        } else if (!(f5 instanceof g0)) {
                                            w511.b();
                                            break;
                                        } else {
                                            map = null;
                                        }
                                        kcaVar = new fca(c5, c6, kbaVar, c15, e3, map);
                                    }
                                    formattedText = d2;
                                    hcaVar = kcaVar;
                                    arrayList4.add(hcaVar);
                                    it5 = it3;
                                    d2 = formattedText;
                                }
                                formattedText = d2;
                                arrayList4.add(hcaVar);
                                it5 = it3;
                                d2 = formattedText;
                            }
                            FormattedText formattedText3 = d2;
                            List m = chargersActiveOrderDto.getM();
                            ArrayList arrayList6 = new ArrayList(tcc.n(m, 10));
                            Iterator it7 = m.iterator();
                            while (it7.hasNext()) {
                                w wVar = (w) it7.next();
                                if (wVar instanceof v) {
                                    tbaVar2 = sba.a;
                                    it2 = it7;
                                } else {
                                    if (wVar instanceof ChargersActiveOrderDetailsItemDto$Header) {
                                        c4 = d9s.c(((ChargersActiveOrderDetailsItemDto$Header) wVar).getA(), xdfVar, h2, true);
                                        it2 = it7;
                                        tbaVar = new qba(c4);
                                    } else if (!(wVar instanceof ChargersActiveOrderDetailsItemDto$Item)) {
                                        w511.b();
                                        break;
                                    } else {
                                        ChargersActiveOrderDetailsItemDto$Item chargersActiveOrderDetailsItemDto$Item = (ChargersActiveOrderDetailsItemDto$Item) wVar;
                                        it2 = it7;
                                        c2 = d9s.c(chargersActiveOrderDetailsItemDto$Item.getA(), xdfVar, h2, true);
                                        c3 = d9s.c(chargersActiveOrderDetailsItemDto$Item.getB(), xdfVar, h2, true);
                                        tbaVar = new rba(c2, c3);
                                    }
                                    tbaVar2 = tbaVar;
                                }
                                arrayList6.add(tbaVar2);
                                it7 = it2;
                            }
                            y8y y8yVar = null;
                            FormattedText c16 = chargersActiveOrderDto.getC();
                            ChargersActiveOrderDto.ActiveCardModes p = chargersActiveOrderDto.getP();
                            if (p != null) {
                                String a6 = p.getA();
                                List<ChargersOrdersTabModeDto> b4 = p.getB();
                                ArrayList arrayList7 = new ArrayList(tcc.n(b4, 10));
                                for (ChargersOrdersTabModeDto chargersOrdersTabModeDto3 : b4) {
                                    arrayList7.add(new x8y(chargersOrdersTabModeDto3.getA(), chargersOrdersTabModeDto3.getB(), chargersOrdersTabModeDto3.getC()));
                                    arrayList4 = arrayList4;
                                    y8yVar = y8yVar;
                                    arrayList6 = arrayList6;
                                }
                                Object obj2 = y8yVar;
                                arrayList = arrayList4;
                                arrayList2 = arrayList6;
                                y8yVar = new y8y(a6, arrayList7);
                                obj = obj2;
                            } else {
                                arrayList = arrayList4;
                                arrayList2 = arrayList6;
                                obj = null;
                            }
                            Integer q = chargersActiveOrderDto.getQ();
                            ArrayList arrayList8 = arrayList2;
                            Integer r = chargersActiveOrderDto.getR();
                            List s = chargersActiveOrderDto.getS();
                            ?? b5 = s != null ? b(s) : obj;
                            List t = chargersActiveOrderDto.getT();
                            z8yVar = new z8y(a4, formattedText3, f2, c11, d3, e, f3, g, c, j, c16, arrayList, arrayList8, y8yVar, q, r, t != null ? a(t) : obj, b5);
                            if (z8yVar != null) {
                            }
                            it4 = it;
                            break;
                        case 5:
                            ChargersErrorDetailsDto n = chargersActiveOrderDto.getN();
                            this.c.getClass();
                            if (n == null) {
                                ChargersErrorDetailsDto.Companion.getClass();
                                n = com.yandex.go.chargers.error.api.a.a();
                            }
                            cy9 cy9Var = new cy9(n.getA(), str, n.getB(), n.getC());
                            yx9.a(ChargersError.Companion, ChargersError.ActiveOrderCancelled, cy9Var.a(), 4);
                            r8fVar = new d18(cy9Var, a4);
                            it = it4;
                            z8yVar = r8fVar;
                            if (z8yVar != null) {
                            }
                            it4 = it;
                            break;
                        case 6:
                            List s2 = chargersActiveOrderDto.getS();
                            ArrayList b6 = s2 != null ? b(s2) : null;
                            List t2 = chargersActiveOrderDto.getT();
                            r8fVar = new nar(a4, h, t2 != null ? a(t2) : null, b6);
                            it = it4;
                            z8yVar = r8fVar;
                            if (z8yVar != null) {
                            }
                            it4 = it;
                            break;
                        default:
                            w511.b();
                            break;
                    }
                    return null;
                }
                yx9.a(ChargersError.Companion, ChargersError.ActiveOrder, "order_status_null", 4);
                whb1.c(null, new IllegalStateException("orderId is null"));
            }
            it = it4;
            if (z8yVar != null) {
            }
            it4 = it;
        }
    }

    public final gca e(ChargersActiveOrderItemDto$Button chargersActiveOrderItemDto$Button, fef fefVar) {
        FormattedText c;
        c = d9s.c(chargersActiveOrderItemDto$Button.getA(), this.a, fefVar, true);
        Boolean c2 = chargersActiveOrderItemDto$Button.getC();
        return new gca(c, c2 != null ? c2.booleanValue() : false, chargersActiveOrderItemDto$Button.getB(), c(chargersActiveOrderItemDto$Button.getD()), chargersActiveOrderItemDto$Button.getE(), chargersActiveOrderItemDto$Button.getF(), chargersActiveOrderItemDto$Button.getG(), chargersActiveOrderItemDto$Button.getH());
    }

    public final sca f(ChargersActiveOrderMultiOrderDto chargersActiveOrderMultiOrderDto, fef fefVar) {
        FormattedText c;
        FormattedText c2;
        if (chargersActiveOrderMultiOrderDto == null) {
            sca scaVar = sca.e;
            return kib1.a();
        }
        String a = chargersActiveOrderMultiOrderDto.getA();
        FormattedText b = chargersActiveOrderMultiOrderDto.getB();
        xdf xdfVar = this.a;
        c = d9s.c(b, xdfVar, fefVar, true);
        c2 = d9s.c(chargersActiveOrderMultiOrderDto.getC(), xdfVar, fefVar, true);
        return new sca(a, c, c2, chargersActiveOrderMultiOrderDto.getD());
    }
}

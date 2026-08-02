package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.yandex.delivery.mapper.model.CancelType;
import com.yandex.go.superapp.order.multi.old.router.a;
import com.yandex.go.superapp.orders.card.OrderCardView;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Cancellation$Type;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Details$State;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import kotlin.collections.b;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.logistics.delivery_state.DeliveryStateBaseParams;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.superapp.orders.models.ActionType;
import ru.yandex.taxi.superapp.orders.ui.c;

/* loaded from: classes14.dex */
public final class am00 implements w301 {
    public final String a;
    public final m601 b;
    public final tls c;
    public final Context d;
    public final n3h e;
    public final a f;
    public final h0o0 g;
    public final ciz h;
    public final joy i;

    public am00(String str, m601 m601Var, tls tlsVar, Context context, n3h n3hVar, a aVar, h0o0 h0o0Var, ciz cizVar, joy joyVar) {
        this.a = str;
        this.b = m601Var;
        this.c = tlsVar;
        this.d = context;
        this.e = n3hVar;
        this.f = aVar;
        this.g = h0o0Var;
        this.h = cizVar;
        this.i = joyVar;
    }

    public static void b(String str) {
        jst.e.w(new IllegalStateException(g8e.o("There is no tracking with id ", str)));
    }

    @Override // defpackage.w301
    public final void a(a201 a201Var) {
        LogisticsOrderTracking$Details$State logisticsOrderTracking$Details$State;
        CancelType cancelType;
        uiz uizVar;
        tiz tizVar;
        ziz zizVar;
        View trailViewAs;
        s501 s501Var = (s501) a201Var.c;
        String str = (String) a201Var.b;
        boolean equals = s501Var.equals(m501.b);
        String str2 = this.a;
        m601 m601Var = this.b;
        a aVar = this.f;
        tls tlsVar = this.c;
        if (equals) {
            w201 w201Var = (w201) tlsVar.invoke(str);
            if (w201Var == null) {
                b(str);
                return;
            }
            if (w201Var instanceof q6o0) {
                q0o0 q0o0Var = this.g.a;
                q0o0Var.getClass();
                q0o0Var.a.a("ScootersMultiorderCard.Tapped", new HashMap(), 1, new HashMap());
            } else if (!(w201Var instanceof q6y0) && !(w201Var instanceof z4y0) && !(w201Var instanceof v7y0) && !(w201Var instanceof y2y0) && !(w201Var instanceof jem) && !(w201Var instanceof bjz) && !(w201Var instanceof xda) && !(w201Var instanceof d3p) && !(w201Var instanceof qg50) && !(w201Var instanceof pu6)) {
                w511.b();
                return;
            }
            aVar.b(w201Var, false, m601Var, str2);
            return;
        }
        boolean z = s501Var instanceof n501;
        LogisticsOrderTracking$Details$State logisticsOrderTracking$Details$State2 = null;
        r13 = null;
        iw7 iw7Var = null;
        ciz cizVar = this.h;
        if (z) {
            OrderCardView orderCardView = ((n501) s501Var).a;
            w201 w201Var2 = (w201) tlsVar.invoke(str);
            if (w201Var2 instanceof y2y0) {
                q48 q48Var = ((y2y0) w201Var2).g;
                if (q48Var == null) {
                    return;
                }
                joy joyVar = this.i;
                joyVar.getClass();
                if (!web1.i(q48Var) || (trailViewAs = orderCardView.header().getTrailViewAs(View.class)) == null) {
                    return;
                }
                ((m48) joyVar.a).b(q48Var, trailViewAs, joyVar.b, joyVar.c, CopySource.LIST_ITEM, 0);
                return;
            }
            if (!(w201Var2 instanceof bjz)) {
                if ((w201Var2 instanceof q6y0) || (w201Var2 instanceof z4y0) || (w201Var2 instanceof v7y0) || (w201Var2 instanceof jem) || (w201Var2 instanceof q6o0) || (w201Var2 instanceof xda) || (w201Var2 instanceof d3p) || (w201Var2 instanceof qg50) || (w201Var2 instanceof pu6)) {
                    return;
                }
                if (w201Var2 == null) {
                    b(str);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            bjz bjzVar = (bjz) w201Var2;
            cizVar.getClass();
            int i = biz.a[bjzVar.h.ordinal()];
            if (i == 1 || i == 2) {
                return;
            }
            if (i != 3 && i != 4) {
                w511.b();
                return;
            }
            p48 p48Var = new p48();
            ajz ajzVar = bjzVar.k;
            p48Var.a = ajzVar != null ? ajzVar.a : null;
            p48Var.c = ajzVar != null ? ajzVar.b : null;
            q48 q48Var2 = new q48(p48Var);
            if (web1.i(q48Var2)) {
                ((c) ((i3y) cizVar.a.z).getValue()).a(q48Var2, orderCardView.header(), -tje.r(mrg0.go_design_l_space, orderCardView.header().getContext()), tje.v(orderCardView.header().getContext(), 40.0f), CopySource.LOGISTICS, 8388661);
                return;
            }
            return;
        }
        if (!(s501Var instanceof l501)) {
            if (!(s501Var instanceof k501)) {
                if (!s501Var.equals(r501.b)) {
                    if ((s501Var instanceof p501) || s501Var.equals(o501.b) || s501Var.equals(q501.b)) {
                        jst.e.w(new IllegalStateException("Trying to handle superapp tracking card action for map screen tracking card"));
                        return;
                    } else {
                        w511.b();
                        return;
                    }
                }
                w201 w201Var3 = (w201) tlsVar.invoke(str);
                if (w201Var3 instanceof v7y0) {
                    aVar.a(((v7y0) w201Var3).b);
                    return;
                }
                if ((w201Var3 instanceof q6y0) || (w201Var3 instanceof z4y0) || (w201Var3 instanceof y2y0) || (w201Var3 instanceof jem) || (w201Var3 instanceof q6o0) || (w201Var3 instanceof bjz) || (w201Var3 instanceof xda) || (w201Var3 instanceof d3p) || (w201Var3 instanceof qg50) || (w201Var3 instanceof pu6)) {
                    return;
                }
                if (w201Var3 == null) {
                    b(str);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            ke6 ke6Var = ((k501) s501Var).a;
            if (!jl40.l(ke6Var, ie6.a)) {
                if (ke6Var instanceof he6) {
                    this.e.a(Uri.parse(((he6) ke6Var).a), DeeplinkSource.UNSPECIFIED);
                    return;
                } else if (!(ke6Var instanceof je6)) {
                    w511.b();
                    return;
                } else {
                    je6 je6Var = (je6) ke6Var;
                    q5z.c0(je6Var.b, je6Var.a, this.d, 0);
                    return;
                }
            }
            w201 w201Var4 = (w201) tlsVar.invoke(str);
            if (!(w201Var4 instanceof bjz)) {
                if ((w201Var4 instanceof q6y0) || (w201Var4 instanceof z4y0) || (w201Var4 instanceof v7y0) || (w201Var4 instanceof y2y0) || (w201Var4 instanceof jem) || (w201Var4 instanceof q6o0) || (w201Var4 instanceof xda) || (w201Var4 instanceof d3p) || (w201Var4 instanceof qg50) || (w201Var4 instanceof pu6)) {
                    return;
                }
                if (w201Var4 == null) {
                    b(str);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            bjz bjzVar2 = (bjz) w201Var4;
            bsi bsiVar = cizVar.b;
            Iterator it = bjzVar2.o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jiz jizVar = ((kiz) it.next()).a;
                if (jizVar instanceof fiz) {
                    logisticsOrderTracking$Details$State = ((fiz) jizVar).a;
                } else {
                    if (!jizVar.equals(giz.a) && !(jizVar instanceof eiz) && !(jizVar instanceof hiz) && !(jizVar instanceof iiz)) {
                        w511.b();
                        return;
                    }
                    logisticsOrderTracking$Details$State = null;
                }
                if (logisticsOrderTracking$Details$State != null) {
                    logisticsOrderTracking$Details$State2 = logisticsOrderTracking$Details$State;
                    break;
                }
            }
            if (logisticsOrderTracking$Details$State2 == null) {
                w511.i("No element of the collection was transformed to a non-null value.");
                return;
            }
            bsiVar.getClass();
            DeliveryStateBaseParams a = bsi.a(bjzVar2, logisticsOrderTracking$Details$State2);
            if (a != null) {
                cizVar.c.d(a);
                return;
            }
            return;
        }
        ActionType actionType = ((l501) s501Var).a;
        w201 w201Var5 = (w201) tlsVar.invoke(str);
        if (!(w201Var5 instanceof bjz)) {
            if ((w201Var5 instanceof q6y0) || (w201Var5 instanceof z4y0) || (w201Var5 instanceof v7y0) || (w201Var5 instanceof y2y0) || (w201Var5 instanceof jem) || (w201Var5 instanceof q6o0) || (w201Var5 instanceof xda) || (w201Var5 instanceof d3p) || (w201Var5 instanceof qg50) || (w201Var5 instanceof pu6)) {
                return;
            }
            if (w201Var5 == null) {
                b(str);
                return;
            } else {
                w511.b();
                return;
            }
        }
        bjz bjzVar3 = (bjz) w201Var5;
        diz dizVar = bjzVar3.q;
        ru.yandex.taxi.logistics.deliveries.multiorder.c cVar = cizVar.c;
        cizVar.d.a(bjzVar3, actionType.getAnalyticAlias(), m601Var, str2);
        int i2 = biz.b[actionType.ordinal()];
        if (i2 == 1) {
            cizVar.b.getClass();
            DeliveryStateBaseParams a2 = bsi.a(bjzVar3, null);
            if (a2 != null) {
                cVar.d(a2);
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                wiz wizVar = bjzVar3.j;
                if (wizVar == null || (uizVar = wizVar.d) == null || (tizVar = uizVar.c) == null) {
                    return;
                }
                cVar.c(tizVar, dizVar != null ? dizVar.b : null);
                return;
            }
            if (i2 == 4) {
                Map map = dizVar != null ? dizVar.b : null;
                fjz fjzVar = cVar.a;
                if (map == null) {
                    map = b.f();
                }
                yxe0.b(fjzVar.f, map.toString(), "courierinfo", null, null, null, null, null, null, null, null, 2044);
                return;
            }
            if (i2 == 5 && (zizVar = bjzVar3.m) != null) {
                String str3 = zizVar.b;
                Map map2 = dizVar != null ? dizVar.b : null;
                if (map2 == null) {
                    map2 = b.f();
                }
                yxe0.b(cVar.a.f, map2.toString(), "show_delivery_from_market_content", null, null, null, null, null, null, null, null, 2044);
                whz whzVar = cVar.f;
                ((pep0) whzVar.b).f((m950) whzVar.a.get(), Optional.ofNullable(str3), hxx.a);
                return;
            }
            return;
        }
        String str4 = bjzVar3.b;
        miz mizVar = bjzVar3.n;
        LogisticsOrderTracking$Cancellation$Type logisticsOrderTracking$Cancellation$Type = mizVar != null ? mizVar.a : null;
        liz lizVar = mizVar != null ? mizVar.c : null;
        Map map3 = dizVar != null ? dizVar.b : null;
        if (str4 == null) {
            cVar.getClass();
            return;
        }
        yxe0.b(cVar.a.f, (map3 == null ? b.f() : map3).toString(), "cancel", null, null, null, null, null, null, null, null, 2044);
        if (lizVar != null) {
            String str5 = lizVar.d;
            f fVar = cVar.n;
            String str6 = lizVar.a;
            String str7 = lizVar.b;
            hw7 hw7Var = new hw7(lizVar.c);
            if (logisticsOrderTracking$Cancellation$Type != null && str5 != null) {
                int i3 = thz.a[logisticsOrderTracking$Cancellation$Type.ordinal()];
                if (i3 == 1) {
                    cancelType = CancelType.FREE;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return;
                    }
                    cancelType = CancelType.PAID;
                }
                iw7Var = new iw7(str5, cancelType);
            }
            jw7 jw7Var = new jw7(str6, str7, hw7Var, iw7Var);
            if (map3 == null) {
                map3 = b.f();
            }
            fVar.a(str4, new ms10(jw7Var, map3));
        }
    }
}

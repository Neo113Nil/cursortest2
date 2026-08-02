package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOrderStatus;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersPlusToggleState;
import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import com.yandex.go.chargers.attention.data.e;
import com.yandex.go.chargers.domain.ChargersCompositePaymentInteractor$ChargersCompositePaymentState;
import com.yandex.go.chargers.map.combined.a;
import com.yandex.go.shortcuts.dto.response.ProductMode$Chargers;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.y0;
import com.yandex.go.taxi.order.search.overlay.companions.b;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationViewState$CodeState;
import com.ybsdk.screens.registration.codeconfirmation.presentation.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.preorder.source.domain.g;

/* loaded from: classes12.dex */
public final class eo9 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eo9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        ChargersAnalytics$ChargersPlusToggleState chargersAnalytics$ChargersPlusToggleState;
        qqd0 qqd0Var;
        String str;
        switch (this.a) {
            case 0:
                ((co9) this.b).render((oo9) obj);
                return zy11.a;
            case 1:
                ((a) this.b).P(((Boolean) obj).booleanValue());
                return zy11.a;
            case 2:
                r0 r0Var = ((vp9) this.b).a;
                rp9 rp9Var = new rp9((String) obj);
                r0Var.getClass();
                r0Var.m(null, rp9Var);
                return zy11.a;
            case 3:
                ((qp9) this.b).render((sq9) obj);
                return zy11.a;
            case 4:
                ((gq9) this.b).render((u3u0) obj);
                return zy11.a;
            case 5:
                ProductMode$Chargers productMode$Chargers = (ProductMode$Chargers) obj;
                bx9 bx9Var = (bx9) this.b;
                bx9Var.B.a.a.l(productMode$Chargers.b);
                Iterator it = productMode$Chargers.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((y0) obj2).a() == ProductMode$Taxi.AboveCardObjectType.ATTENTION) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ProductMode$Taxi.AttentionAboveCardObject attentionAboveCardObject = obj2 instanceof ProductMode$Taxi.AttentionAboveCardObject ? (ProductMode$Taxi.AttentionAboveCardObject) obj2 : null;
                ((e) bx9Var.y).d.g(attentionAboveCardObject != null ? attentionAboveCardObject.a : null);
                return zy11.a;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    yx9.a(ChargersError.Companion, ChargersError.Discovery, null, 6);
                }
                ((ix9) this.b).updateAnchorHeight(booleanValue);
                return zy11.a;
            case 7:
                ((hy9) this.b).render((sy9) obj);
                return zy11.a;
            case 8:
                ((e1a) this.b).render((t1a) obj);
                return zy11.a;
            case 9:
                ((o4a) this.b).render((v5a) obj);
                return zy11.a;
            case 10:
                ((y4a) this.b).render((c5a) obj);
                return zy11.a;
            case 11:
                if (((Boolean) obj).booleanValue()) {
                    ((ej1) ((z4a) this.b).y.b).r(new qu(9));
                }
                return zy11.a;
            case 12:
                j6a.b((j6a) ((u7a) ((u7a) this.b).Z.b).Q.get(), (k6a) obj);
                return zy11.a;
            case 13:
                ((s8a) this.b).Jf((paa) obj);
                return zy11.a;
            case 14:
                if (((taa) obj).b() != ChargersActiveOrderStatus.LEASING) {
                    ((f28) ((zba) this.b).B.b).r(new qu(9));
                }
                return zy11.a;
            case 15:
                ((xba) this.b).render(new dca(((dca) obj).a));
                return zy11.a;
            case 16:
                jda jdaVar = (jda) obj;
                hda hdaVar = (hda) this.b;
                em9 em9Var = hdaVar.x;
                ChargersAnalytics$ChargersOrderStatus e = mib1.e(jdaVar.c);
                String str2 = hdaVar.C;
                HashMap w = b64.w(em9Var);
                if (e != null) {
                    w.put("order_status", e.getEventValue());
                }
                if (str2 != null) {
                    w.put("order_id", str2);
                }
                em9Var.a.a("Chargers.CreatingOrder.Shown", w, 1, new HashMap());
                ((fda) hdaVar.Dg()).render(jdaVar);
                return zy11.a;
            case 17:
                com.yandex.go.chargers.plus.a aVar = (com.yandex.go.chargers.plus.a) this.b;
                em9 em9Var2 = aVar.a;
                int i = kma.a[((ChargersCompositePaymentInteractor$ChargersCompositePaymentState) obj).ordinal()];
                if (i == 1) {
                    chargersAnalytics$ChargersPlusToggleState = ChargersAnalytics$ChargersPlusToggleState.Spend;
                } else {
                    if (i != 2 && i != 3) {
                        w511.b();
                        return null;
                    }
                    chargersAnalytics$ChargersPlusToggleState = ChargersAnalytics$ChargersPlusToggleState.Accumulate;
                }
                gci0 gci0Var = aVar.i;
                if (gci0Var != null && (qqd0Var = (qqd0) gci0Var.a.getValue()) != null && (str = qqd0Var.a) != null) {
                    r3 = bvu0.l(10, str);
                }
                HashMap w2 = b64.w(em9Var2);
                w2.put(ClidProvider.STATE, chargersAnalytics$ChargersPlusToggleState.getEventValue());
                if (r3 != null) {
                    w2.put("plus_bonuses_amount", r3);
                }
                em9Var2.a.a("Chargers.PlusToggle.Tapped", w2, 1, new HashMap());
                return zy11.a;
            case 18:
                ((tma) this.b).render((zma) obj);
                return zy11.a;
            case 19:
                j6a.b((j6a) ((hsa) ((sra) this.b).H.a).N.get(), (k6a) obj);
                return zy11.a;
            case 20:
                u0b u0bVar = (u0b) this.b;
                ((t0b) ((jxx0) u0bVar.Dg())).updateActions(u0bVar.A.b().a, (List) obj);
                return zy11.a;
            case 21:
                ((zfb) this.b).applyCheckInState((yfb) obj);
                return zy11.a;
            case 22:
                ((zfb) ((com.yandex.go.taxi.order.state.checkin.a) this.b).Dg()).updateTopActionButtons((List) obj);
                return zy11.a;
            case 23:
                com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.processor.e eVar = (com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.processor.e) this.b;
                llc llcVar = (llc) eVar.b.invoke();
                if (llcVar != null) {
                    return com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.processor.e.a(eVar, llcVar.a, continuation);
                }
                eVar.b();
                return zy11.a;
            case 24:
                ((ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.e) this.b).y.l((qkg) obj);
                return zy11.a;
            case 25:
                g gVar = (g) this.b;
                if (((Boolean) obj).booleanValue()) {
                    gVar.a.a(MapPositionAction.DEFAULT);
                    if (!gVar.b.a()) {
                        ket0 ket0Var = gVar.d;
                        ((nwx0) ket0Var.c).a.c().d2(((avj0) ket0Var.a).h(kyh0.address_resolving_error));
                        gVar.c.b(AddressResolveRepository.State.ERROR);
                    }
                }
                return zy11.a;
            case 26:
                ((c) this.b).Z(new o9c(CodeConfirmationViewState$CodeState.DEFAULT));
                return zy11.a;
            case 27:
                com.ybsdk.common.a aVar2 = (com.ybsdk.common.a) this.b;
                boolean z = ((lzq0) obj).a;
                fcy0 fcy0Var = aVar2.a.m0;
                Boolean valueOf = Boolean.valueOf(z);
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("has_pin", valueOf);
                fcy0Var.a.a("tech.communications_shown_info.clear", linkedHashMap);
                synchronized (aVar2.e) {
                    aVar2.d.clear();
                }
                return zy11.a;
            case 28:
                Double d = ((SearchState) obj).s;
                if (d != null) {
                    com.yandex.go.taxi.order.search.overlay.companions.a aVar3 = (com.yandex.go.taxi.order.search.overlay.companions.a) this.b;
                    double doubleValue = d.doubleValue();
                    r0 r0Var2 = aVar3.e;
                    Double d2 = new Double(doubleValue);
                    r0Var2.getClass();
                    r0Var2.m(null, d2);
                }
                return zy11.a;
            default:
                ((b) this.b).Kg(((Number) obj).doubleValue());
                return zy11.a;
        }
    }
}

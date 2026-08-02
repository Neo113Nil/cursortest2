package defpackage;

import androidx.compose.foundation.e;
import androidx.compose.foundation.text.c;
import androidx.compose.foundation.text.selection.j;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.due.data.api.dto.ScheduledOrderButton;
import com.yandex.go.feed.global.div.custom.payment_icon.PaymentIconViewHolder;
import com.yandex.go.masstransit.sdk.ble.impl.ble.MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.permission.b;
import com.yandex.go.shortcuts.dto.response.ProductsScreenResponse;
import com.yandex.go.shortcuts.impl.interactors.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonPosition;
import ru.yandex.taxi.due_selector.impl.domain.interactor.a;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$RouteOptionsScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.modal.f;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes10.dex */
public final class fre implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ fre(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i;
        DeliveryFormStepType deliveryFormStepType;
        tqo tqoVar;
        Object value;
        Object value2;
        xj31 xj31Var;
        int i2 = this.a;
        int i3 = 3;
        int i4 = 6;
        f411 f411Var = f411.c;
        EmptyList emptyList = EmptyList.a;
        int i5 = 0;
        int i6 = 4;
        int i7 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i2) {
            case 0:
                j jVar = (j) obj3;
                oay oayVar = (oay) obj5;
                if (!((Boolean) obj).booleanValue() || !oayVar.b()) {
                    c.f(oayVar);
                    break;
                } else {
                    c.h((vpy0) obj4, oayVar, jVar.o(), (eiv) obj2, jVar.b);
                    break;
                }
                break;
            case 1:
                g8w g8wVar = (g8w) obj;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj4;
                Ref$IntRef ref$IntRef3 = (Ref$IntRef) obj5;
                if (g8wVar instanceof jxe0) {
                    ref$IntRef3.element++;
                } else if (g8wVar instanceof kxe0) {
                    ref$IntRef3.element--;
                } else if (g8wVar instanceof ixe0) {
                    ref$IntRef3.element--;
                } else if (g8wVar instanceof ltu) {
                    ref$IntRef2.element++;
                } else if (g8wVar instanceof mtu) {
                    ref$IntRef2.element--;
                } else if (g8wVar instanceof ztr) {
                    ref$IntRef.element++;
                } else if (g8wVar instanceof aur) {
                    ref$IntRef.element--;
                }
                boolean z = ref$IntRef3.element > 0;
                boolean z2 = ref$IntRef2.element > 0;
                boolean z3 = ref$IntRef.element > 0;
                e eVar = (e) obj2;
                if (eVar.b != z) {
                    eVar.b = z;
                    i = 1;
                } else {
                    i = 0;
                }
                if (eVar.c != z2) {
                    eVar.c = z2;
                    i = 1;
                }
                if (eVar.w != z3) {
                    eVar.w = z3;
                } else {
                    i7 = i;
                }
                if (i7 != 0) {
                    rzo.D(eVar);
                    break;
                }
                break;
            case 2:
                ll0 ll0Var = (ll0) obj;
                kvh kvhVar = (kvh) obj5;
                String str = (String) obj4;
                kvhVar.getClass();
                boolean z4 = ll0Var instanceof jl0;
                kl0 kl0Var = kl0.a;
                if (!z4) {
                    if (!jl40.l(ll0Var, kl0Var)) {
                        w511.b();
                        break;
                    }
                } else if (str == null || evu0.J(str)) {
                    kvhVar.a.a.l(kl0Var);
                    break;
                }
                jvh jvhVar = new jvh();
                jvhVar.a = (tls) obj2;
                int i8 = ivh.b[((PointType) obj3).ordinal()];
                int i9 = 2;
                if (i8 == 1) {
                    deliveryFormStepType = DeliveryFormStepType.SOURCE;
                } else if (i8 != 2) {
                    w511.b();
                    break;
                } else {
                    deliveryFormStepType = DeliveryFormStepType.DESTINATION;
                }
                zuh zuhVar = kvhVar.b;
                if (!z4) {
                    if (!(ll0Var instanceof kl0)) {
                        w511.b();
                        break;
                    }
                } else {
                    jl0 jl0Var = (jl0) ll0Var;
                    kvhVar.f = jl0Var;
                    kvhVar.e = jl0Var.c;
                    int i10 = ivh.a[deliveryFormStepType.ordinal()];
                    if (i10 == 1) {
                        yuh a = zuhVar.a();
                        String Y = d6z.Y(a, a.d);
                        yuh a2 = zuhVar.a();
                        String Y2 = d6z.Y(a2, a2.e);
                        yuh a3 = zuhVar.a();
                        String Y3 = d6z.Y(a3, a3.f);
                        yuh a4 = zuhVar.a();
                        String Y4 = d6z.Y(a4, a4.g);
                        yuh a5 = zuhVar.a();
                        String Y5 = d6z.Y(a5, a5.h);
                        yuh a6 = zuhVar.a();
                        String Y6 = d6z.Y(a6, a6.i);
                        yuh a7 = zuhVar.a();
                        String Y7 = d6z.Y(a7, a7.j);
                        yuh a8 = zuhVar.a();
                        String Y8 = d6z.Y(a8, a8.k);
                        yuh a9 = zuhVar.a();
                        String Y9 = d6z.Y(a9, a9.m);
                        yuh a10 = zuhVar.a();
                        String Y10 = d6z.Y(a10, a10.n);
                        yuh a11 = zuhVar.a();
                        tqoVar = new tqo(Y, Y2, Y3, Y4, Y5, Y6, Y7, Y8, Y9, Y10, "", d6z.Y(a11, a11.q), false);
                    } else if (i10 != 2) {
                        w511.b();
                        break;
                    } else {
                        yuh a12 = zuhVar.a();
                        String Y11 = d6z.Y(a12, a12.d);
                        yuh a13 = zuhVar.a();
                        String Y12 = d6z.Y(a13, a13.e);
                        yuh a14 = zuhVar.a();
                        String Y13 = d6z.Y(a14, a14.f);
                        yuh a15 = zuhVar.a();
                        String Y14 = d6z.Y(a15, a15.g);
                        yuh a16 = zuhVar.a();
                        String Y15 = d6z.Y(a16, a16.h);
                        yuh a17 = zuhVar.a();
                        String Y16 = d6z.Y(a17, a17.i);
                        yuh a18 = zuhVar.a();
                        String Y17 = d6z.Y(a18, a18.j);
                        yuh a19 = zuhVar.a();
                        String Y18 = d6z.Y(a19, a19.k);
                        yuh a20 = zuhVar.a();
                        String Y19 = d6z.Y(a20, a20.l);
                        yuh a21 = zuhVar.a();
                        String Y20 = d6z.Y(a21, a21.n);
                        yuh a22 = zuhVar.a();
                        tqoVar = new tqo(Y11, Y12, Y13, Y14, Y15, Y16, Y17, Y18, Y19, Y20, "", d6z.Y(a22, a22.p), false);
                    }
                    zgf zgfVar = kvhVar.c;
                    bvh bvhVar = new bvh(jl0Var.a, jl0Var.b, tqoVar, deliveryFormStepType);
                    bu0 bu0Var = (bu0) zgfVar.b;
                    dyf dyfVar = new dyf(bu0Var, i7);
                    n3w a23 = n3w.a(bvhVar);
                    gmh gmhVar = new gmh(new srb(new dyf(bu0Var, i6), 15), i9);
                    dyf dyfVar2 = new dyf(bu0Var, i5);
                    kk kkVar = new kk(a23, 21);
                    int i11 = 9;
                    wif wifVar = new wif((Object) a23, (xvf0) new dyf(bu0Var, i9), i11);
                    n3w a24 = n3w.a(new pvh(new xjg(dyfVar, new ncb((xvf0) a23, (xvf0) gmhVar, (xvf0) dyfVar2, (xvf0) kkVar, (xvf0) wifVar, (xvf0) new ncb(new dyf(bu0Var, 5), wifVar, gmhVar, new dyf(bu0Var, 7), new dyf(bu0Var, i4), new dyf(bu0Var, i3), 12), 13), false, i11)));
                    i130 i130Var = (i130) bu0Var.b;
                    q5z.h(i130Var);
                    int i12 = 2;
                    ((pep0) kvhVar.d).f(new zsa(10, new zc(i12, i130Var, (pvh) a24.a), new amh(4, kvhVar), new bmh(i12, jvhVar, kvhVar)), zy11Var, hxx.a);
                }
                break;
            case 3:
                ((a) obj5).b((DuePickerButtonPosition) obj4, (ScheduledOrderButton) obj3, (swm) obj2, (jwm) obj);
                break;
            case 4:
                zl30 zl30Var = (zl30) obj;
                xrr xrrVar = (xrr) obj5;
                pl30 pl30Var = (pl30) xrrVar.w;
                if (!(zl30Var instanceof tl30)) {
                    if (!(zl30Var instanceof vl30)) {
                        if (!(zl30Var instanceof xl30)) {
                            w511.b();
                            break;
                        } else {
                            ArrayList arrayList = ((xl30) zl30Var).a;
                            pl30Var.a(arrayList);
                            if (!xrrVar.b && !arrayList.isEmpty()) {
                                xrrVar.b = true;
                                p310 p310Var = (p310) xrrVar.y;
                                String str2 = ((yk30) xrrVar.z).a.a;
                                n310 n310Var = p310Var.a;
                                n310Var.getClass();
                                HashMap hashMap = new HashMap();
                                if (str2 != null) {
                                    hashMap.put("request_id", str2);
                                }
                                n310Var.a.a("MasstransitPayment.BleVehicles.FirstLoaded", hashMap, 1, new HashMap());
                            }
                        }
                    } else {
                        pl30Var.a(((vl30) zl30Var).a);
                    }
                } else {
                    MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode = ((tl30) zl30Var).a;
                    int i13 = mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode == null ? -1 : fk30.a[mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.ordinal()];
                    if (i13 == -1) {
                        pl30Var.a(emptyList);
                    } else if (i13 != 1) {
                        w511.b();
                        break;
                    } else if (jl40.l(((s411) ((sr4) xrrVar.A).b).a(), f411Var)) {
                        pl30Var.a(emptyList);
                    } else {
                        ((pk30) obj4).c(new b700(i6, xrrVar, (n26) obj3, (tse) obj2));
                    }
                    break;
                }
                break;
            case 5:
                yl30 yl30Var = (yl30) obj;
                f fVar = (f) obj5;
                ol30 ol30Var = fVar.b;
                if (!(yl30Var instanceof sl30)) {
                    if (!(yl30Var instanceof ul30)) {
                        if (!(yl30Var instanceof wl30)) {
                            w511.b();
                            break;
                        } else {
                            ru.yandex.taxi.masstransit.geopayment.adapter.a aVar = fVar.f;
                            ol30Var.a(((wl30) yl30Var).a);
                            ek30 ek30Var = fVar.d;
                            boolean a25 = ((b) aVar.a).a(11);
                            boolean a26 = ((b) aVar.a).a(3);
                            String str3 = fVar.e.a.a;
                            List list = (List) ol30Var.b.a.getValue();
                            if (!ek30Var.d) {
                                d411 d411Var = ek30Var.a;
                                TransportPaymentAnalytics$RouteOptionsScreenOpenReason transportPaymentAnalytics$RouteOptionsScreenOpenReason = TransportPaymentAnalytics$RouteOptionsScreenOpenReason.ButtonBuy;
                                ArrayList b = ek30.b(list);
                                String c = ek30Var.c();
                                d411Var.getClass();
                                HashMap hashMap2 = new HashMap();
                                if (str3 != null) {
                                    hashMap2.put("request_id", str3);
                                }
                                hashMap2.put("source", transportPaymentAnalytics$RouteOptionsScreenOpenReason.getEventValue());
                                hashMap2.put("has_bluetooth_access", Boolean.valueOf(a25));
                                hashMap2.put("has_camera_access", Boolean.valueOf(a26));
                                if (b != null) {
                                    ArrayList arrayList2 = new ArrayList(tcc.n(b, 10));
                                    Iterator it = b.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((c411) it.next()).c);
                                    }
                                    hashMap2.put("vehicle_list", arrayList2);
                                }
                                d411Var.a.a("TransportPayment.RouteOptions.FirstLoaded", hashMap2, 1, tse0.r("zone_name", hashMap2, c));
                                ek30Var.d = true;
                            }
                        }
                    } else {
                        ol30Var.a(((ul30) yl30Var).a);
                    }
                } else {
                    sl30 sl30Var = (sl30) yl30Var;
                    if (sl30Var.c) {
                        r0 r0Var = ol30Var.c;
                        do {
                            value = r0Var.getValue();
                            ((Boolean) value).getClass();
                        } while (!r0Var.k(value, Boolean.TRUE));
                        r0 r0Var2 = ol30Var.a;
                        do {
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, emptyList));
                    } else if (sl30Var.a != ru.yandex.taxi.masstransit.geopayment.ble.MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.MOS_METRO_AUTH_REQUIRED) {
                        ol30Var.a(emptyList);
                    } else if (jl40.l(((s411) fVar.g.b).a(), f411Var)) {
                        ol30Var.a(emptyList);
                    } else {
                        ((pk30) obj4).c(new b700(i4, fVar, (n26) obj3, (tse) obj2));
                    }
                }
                break;
            case 6:
                m1a0 m1a0Var = (m1a0) obj;
                String str4 = (String) obj5;
                if (str4 != null && str4.length() != 0) {
                    ((Div2View) obj4).setVariable(str4, m1a0Var.a);
                }
                ((PaymentIconViewHolder) obj3).renderViewItem((CompositePaymentIconsView) obj2, m1a0Var);
                break;
            case 7:
                w.a((w) obj5, (ProductsScreenResponse) obj, (Address) obj4, (raf0) obj3, (zzs) obj2, continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            default:
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.getFirst()).intValue();
                if (!((Boolean) pair.getSecond()).booleanValue() && intValue != ((Number) ((m3u0) obj5).getValue()).intValue() && (xj31Var = (xj31) kotlin.collections.a.S(intValue, (List) ((m3u0) obj4).getValue())) != null) {
                    ((tls) ((m3u0) obj2).getValue()).invoke(new jmq0(xj31Var));
                    ((fgd) obj3).a(HapticEffect.ClickMedium);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}

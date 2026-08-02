package com.yandex.go.taxi.order.multi.tracking;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a7y;
import defpackage.an91;
import defpackage.b2k;
import defpackage.bkx0;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dl01;
import defpackage.dmw0;
import defpackage.exw0;
import defpackage.f530;
import defpackage.f811;
import defpackage.fid;
import defpackage.g811;
import defpackage.gub1;
import defpackage.h611;
import defpackage.h711;
import defpackage.hub1;
import defpackage.i811;
import defpackage.j611;
import defpackage.j811;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k7y0;
import defpackage.k911;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m611;
import defpackage.m7y0;
import defpackage.mth;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.qu40;
import defpackage.r1b0;
import defpackage.r3y0;
import defpackage.rzo;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tfx;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vng;
import defpackage.vuz;
import defpackage.w8a1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.x711;
import defpackage.xor;
import defpackage.xya1;
import defpackage.z910;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderMultimodalRoutesView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lx711;", "transportRoutePartComposableHolder", "Lcom/yandex/go/taxi/order/domain/repositories/f0;", "taxiOrderTrackingViewStateRepository", "Lm7y0;", "delegate", "<init>", "(Landroid/content/Context;Lx711;Lcom/yandex/go/taxi/order/domain/repositories/f0;Lm7y0;)V", "Lzy11;", "onAttachedToWindow", "()V", "", ClidProvider.STATE, "bottomSheetStateChanged", "(I)V", "Lx711;", "Lcom/yandex/go/taxi/order/domain/repositories/f0;", "Lm7y0;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderMultimodalRoutesView extends GoFrameLayout {
    public static final int $stable = 8;
    private final ComposeView composeView;
    private final m7y0 delegate;
    private final f0 taxiOrderTrackingViewStateRepository;
    private final x711 transportRoutePartComposableHolder;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TaxiOrderMultimodalRoutesView(Context context, x711 x711Var, f0 f0Var, m7y0 m7y0Var) {
        super(context, null, 0, r4, 14, r6);
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 0;
        this.transportRoutePartComposableHolder = x711Var;
        this.taxiOrderTrackingViewStateRepository = f0Var;
        this.delegate = m7y0Var;
        this.composeView = new ComposeView(context, null, i, 6, defaultConstructorMarker);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(TaxiOrderMultimodalRoutesView taxiOrderMultimodalRoutesView, boolean z, boolean z2) {
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        anchorBottomSheetBehavior = ((k7y0) taxiOrderMultimodalRoutesView.delegate).a.bottomSheetBehavior;
        boolean z3 = anchorBottomSheetBehavior.E == 3;
        if (z && z3 && z2) {
            ((k7y0) taxiOrderMultimodalRoutesView.delegate).a.setCanDrag(false);
        } else {
            ((k7y0) taxiOrderMultimodalRoutesView.delegate).a.setCanDrag(true);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1(TaxiOrderMultimodalRoutesView taxiOrderMultimodalRoutesView, fid fidVar, int i) {
        int i2 = 2;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            Object Q = btsVar.Q();
            int i3 = 6;
            if (Q == did.a) {
                x711 x711Var = taxiOrderMultimodalRoutesView.transportRoutePartComposableHolder;
                final b2k l = vng.l(kotlinx.coroutines.flow.e.X(new mth(taxiOrderMultimodalRoutesView.taxiOrderTrackingViewStateRepository.q, i3), new TaxiOrderMultimodalRoutesView$onAttachedToWindow$lambda$1$0$$inlined$flatMapLatest$1(3, null)), new bkx0(21), vng.c);
                final f811 f811Var = (f811) x711Var;
                f811Var.getClass();
                Q = new androidx.compose.runtime.internal.a(241578603, new zls() { // from class: com.yandex.go.multimodal_route.ui.transport_route_part.i
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v11, types: [kotlin.coroutines.Continuation] */
                    /* JADX WARN: Type inference failed for: r20v6 */
                    /* JADX WARN: Type inference failed for: r20v7, types: [obm] */
                    /* JADX WARN: Type inference failed for: r20v8 */
                    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r6v5 */
                    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection] */
                    /* JADX WARN: Type inference failed for: r8v14 */
                    /* JADX WARN: Type inference failed for: r8v15, types: [h611] */
                    /* JADX WARN: Type inference failed for: r8v19 */
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Throwable th;
                        ArrayList arrayList;
                        List list;
                        boolean z;
                        final f811 f811Var2;
                        androidx.compose.foundation.lazy.b bVar;
                        c530 c530Var;
                        k911 k911Var;
                        f530 f530Var = (f530) obj;
                        fid fidVar2 = (fid) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= ((bts) fidVar2).k(f530Var) ? 4 : 2;
                        }
                        int i4 = 1;
                        bts btsVar2 = (bts) fidVar2;
                        boolean V = btsVar2.V(intValue & 1, (intValue & 19) != 18);
                        dmw0 dmw0Var = btsVar2.a;
                        zy11 zy11Var = zy11.a;
                        if (!V) {
                            btsVar2.Y();
                            return zy11Var;
                        }
                        b2k b2kVar = b2k.this;
                        boolean k = btsVar2.k(b2kVar);
                        Object Q2 = btsVar2.Q();
                        f811 f811Var3 = f811Var;
                        o430 o430Var = did.a;
                        if (k || Q2 == o430Var) {
                            qu40 qu40Var = f811Var3.d;
                            String str = f811Var3.c;
                            qu40Var.getClass();
                            Q2 = kotlinx.coroutines.flow.e.X(new jqr(new d(new b(new jqr(b2kVar, new MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$1(qu40Var, null), 3)), qu40Var), new MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$4(qu40Var, str, null), 3), new MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1(qu40Var, null));
                            btsVar2.o0(Q2);
                        }
                        i811 i811Var = i811.a;
                        Throwable th2 = null;
                        oz40 a = androidx.compose.runtime.f.a((tpr) Q2, i811Var, null, btsVar2, 48, 2);
                        z910 d = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar2, f530Var);
                        ohd.G1.getClass();
                        sls slsVar = androidx.compose.ui.node.d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
                        qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                        qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, androidx.compose.ui.node.d.h);
                        qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
                        j811 j811Var = (j811) a.getValue();
                        if (j811Var instanceof g811) {
                            btsVar2.e0(530484843);
                            g811 g811Var = (g811) j811Var;
                            List list2 = g811Var.c;
                            if (list2 != null) {
                                arrayList = new ArrayList();
                                boolean z2 = false;
                                for (Object obj4 : list2) {
                                    Object obj5 = (h711) obj4;
                                    Throwable th3 = th2;
                                    boolean z3 = (obj5 instanceof j611 ? (j611) obj5 : th3) != null ? true : z2;
                                    if (z2) {
                                        arrayList.add(obj4);
                                    }
                                    z2 = z3;
                                    th2 = th3;
                                }
                                th = th2;
                            } else {
                                th = null;
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                list = new ArrayList(tcc.n(arrayList, 10));
                                int i5 = 0;
                                for (Object obj6 : arrayList) {
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        scc.m();
                                        throw th;
                                    }
                                    h711 h711Var = (h711) obj6;
                                    if (i5 == 0 && (h711Var instanceof m611)) {
                                        h711 h711Var2 = (h711) kotlin.collections.a.S(i4, arrayList);
                                        m611 m611Var = (m611) h711Var;
                                        String obj7 = m611Var.a.toString();
                                        String str2 = m611Var.c;
                                        Object R = kotlin.collections.a.R(list2);
                                        ?? r8 = R instanceof h611 ? (h611) R : th;
                                        ?? r20 = r8 != 0 ? r8.d : th;
                                        String str3 = m611Var.e;
                                        if (h711Var2 == null || (k911Var = h711Var2.j()) == null) {
                                            k911Var = m611Var.g;
                                        }
                                        h711Var = new h611(obj7, str2, null, r20, null, str3, k911Var, m611Var.h);
                                    }
                                    list.add(h711Var);
                                    i5 = i6;
                                    i4 = 1;
                                }
                            } else {
                                list = th;
                            }
                            if (list == 0 || list.isEmpty()) {
                                btsVar2.e0(531420485);
                                boolean e = btsVar2.e(f811Var3);
                                Object Q3 = btsVar2.Q();
                                if (e || Q3 == o430Var) {
                                    Q3 = new TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$1$1(0, f811Var3, f811.class, "onErrorShown", "onErrorShown()V", 0);
                                    btsVar2.o0(Q3);
                                }
                                zpn.i((sls) ((tfx) Q3), btsVar2);
                                z = false;
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(531606919);
                                androidx.compose.foundation.lazy.b a2 = a7y.a(0, 3, btsVar2);
                                Object Q4 = btsVar2.Q();
                                if (Q4 == o430Var) {
                                    Q4 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                                    btsVar2.o0(Q4);
                                }
                                tse tseVar = (tse) Q4;
                                boolean e2 = btsVar2.e(f811Var3) | btsVar2.e(j811Var) | btsVar2.e(tseVar) | btsVar2.k(a2);
                                Object Q5 = btsVar2.Q();
                                if (e2 || Q5 == o430Var) {
                                    Q5 = new TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$2$1(f811Var3, j811Var, tseVar, a2, null);
                                    f811Var2 = f811Var3;
                                    bVar = a2;
                                    btsVar2.o0(Q5);
                                } else {
                                    f811Var2 = f811Var3;
                                    bVar = a2;
                                }
                                zpn.e(btsVar2, (wls) Q5, zy11Var);
                                boolean e3 = btsVar2.e(f811Var2) | btsVar2.e(j811Var);
                                Object Q6 = btsVar2.Q();
                                if (e3 || Q6 == o430Var) {
                                    Q6 = new dl01(13, f811Var2, g811Var);
                                    btsVar2.o0(Q6);
                                }
                                zpn.a(zy11Var, (tls) Q6, btsVar2);
                                oz40 oz40Var = f811Var2.f;
                                Object value = oz40Var.getValue();
                                boolean e4 = btsVar2.e(f811Var2) | btsVar2.k(bVar);
                                Object Q7 = btsVar2.Q();
                                if (e4 || Q7 == o430Var) {
                                    Q7 = new TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$4$1(f811Var2, bVar, th);
                                    btsVar2.o0(Q7);
                                }
                                zpn.e(btsVar2, (wls) Q7, value);
                                sic a3 = qic.a(lr20.c, x4c.G, btsVar2, 0);
                                int hashCode2 = Long.hashCode(btsVar2.T);
                                r1b0 o2 = btsVar2.o();
                                c530 c530Var2 = c530.a;
                                f530 d3 = androidx.compose.ui.b.d(btsVar2, c530Var2);
                                ohd.G1.getClass();
                                sls slsVar2 = androidx.compose.ui.node.d.b;
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar2);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, androidx.compose.ui.node.d.f, a3);
                                qje.W(btsVar2, androidx.compose.ui.node.d.e, o2);
                                qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar2, androidx.compose.ui.node.d.h);
                                qje.W(btsVar2, androidx.compose.ui.node.d.d, d3);
                                CharSequence charSequence = g811Var.b;
                                if (charSequence == null) {
                                    btsVar2.e0(-407459836);
                                    btsVar2.t(false);
                                    c530Var = c530Var2;
                                } else {
                                    btsVar2.e0(-407459835);
                                    c530Var = c530Var2;
                                    qgy.b(charSequence, null, an91.k(c530Var2, 16.0f), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).f.c, null, btsVar2, 384, 0, 12282);
                                    btsVar2 = btsVar2;
                                    btsVar2.t(false);
                                }
                                boolean e5 = btsVar2.e(f811Var2) | btsVar2.k(bVar);
                                Object Q8 = btsVar2.Q();
                                if (e5 || Q8 == o430Var) {
                                    Q8 = new j(f811Var2, bVar);
                                    btsVar2.o0(Q8);
                                }
                                f530 a4 = exw0.a(c530Var, zy11Var, (PointerInputEventHandler) Q8);
                                boolean z4 = g811Var.d;
                                boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                                boolean e6 = btsVar2.e(f811Var2);
                                Object Q9 = btsVar2.Q();
                                if (e6 || Q9 == o430Var) {
                                    final int i7 = 0;
                                    Q9 = new tls() { // from class: e811
                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj8) {
                                            int i8 = i7;
                                            zy11 zy11Var2 = zy11.a;
                                            f811 f811Var4 = f811Var2;
                                            switch (i8) {
                                                case 0:
                                                    f811Var4.e.a(new o711((h711) obj8), null);
                                                    break;
                                                case 1:
                                                    f811Var4.e.a(new q711((bzy0) obj8), null);
                                                    break;
                                                case 2:
                                                    f811Var4.e.a(new p711((ee01) obj8), null);
                                                    break;
                                                default:
                                                    f811Var4.e.a(new r711((ge01) obj8), null);
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar2.o0(Q9);
                                }
                                tls tlsVar = (tls) Q9;
                                boolean e7 = btsVar2.e(f811Var2);
                                Object Q10 = btsVar2.Q();
                                if (e7 || Q10 == o430Var) {
                                    final int i8 = 1;
                                    Q10 = new tls() { // from class: e811
                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj8) {
                                            int i82 = i8;
                                            zy11 zy11Var2 = zy11.a;
                                            f811 f811Var4 = f811Var2;
                                            switch (i82) {
                                                case 0:
                                                    f811Var4.e.a(new o711((h711) obj8), null);
                                                    break;
                                                case 1:
                                                    f811Var4.e.a(new q711((bzy0) obj8), null);
                                                    break;
                                                case 2:
                                                    f811Var4.e.a(new p711((ee01) obj8), null);
                                                    break;
                                                default:
                                                    f811Var4.e.a(new r711((ge01) obj8), null);
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar2.o0(Q10);
                                }
                                tls tlsVar2 = (tls) Q10;
                                boolean e8 = btsVar2.e(f811Var2);
                                Object Q11 = btsVar2.Q();
                                if (e8 || Q11 == o430Var) {
                                    final int i9 = 2;
                                    Q11 = new tls() { // from class: e811
                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj8) {
                                            int i82 = i9;
                                            zy11 zy11Var2 = zy11.a;
                                            f811 f811Var4 = f811Var2;
                                            switch (i82) {
                                                case 0:
                                                    f811Var4.e.a(new o711((h711) obj8), null);
                                                    break;
                                                case 1:
                                                    f811Var4.e.a(new q711((bzy0) obj8), null);
                                                    break;
                                                case 2:
                                                    f811Var4.e.a(new p711((ee01) obj8), null);
                                                    break;
                                                default:
                                                    f811Var4.e.a(new r711((ge01) obj8), null);
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar2.o0(Q11);
                                }
                                tls tlsVar3 = (tls) Q11;
                                boolean e9 = btsVar2.e(f811Var2);
                                Object Q12 = btsVar2.Q();
                                if (e9 || Q12 == o430Var) {
                                    final int i10 = 3;
                                    Q12 = new tls() { // from class: e811
                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj8) {
                                            int i82 = i10;
                                            zy11 zy11Var2 = zy11.a;
                                            f811 f811Var4 = f811Var2;
                                            switch (i82) {
                                                case 0:
                                                    f811Var4.e.a(new o711((h711) obj8), null);
                                                    break;
                                                case 1:
                                                    f811Var4.e.a(new q711((bzy0) obj8), null);
                                                    break;
                                                case 2:
                                                    f811Var4.e.a(new p711((ee01) obj8), null);
                                                    break;
                                                default:
                                                    f811Var4.e.a(new r711((ge01) obj8), null);
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar2.o0(Q12);
                                }
                                bts btsVar3 = btsVar2;
                                gub1.b(list, a4, tlsVar, tlsVar2, tlsVar3, (tls) Q12, null, null, bVar, false, z4, null, booleanValue, btsVar3, 0, 0, 2752);
                                btsVar2 = btsVar3;
                                btsVar2.t(true);
                                Boolean valueOf = Boolean.valueOf(bVar.b());
                                Object value2 = oz40Var.getValue();
                                boolean e10 = btsVar2.e(f811Var2) | btsVar2.k(bVar) | btsVar2.e(j811Var);
                                Object Q13 = btsVar2.Q();
                                if (e10 || Q13 == o430Var) {
                                    Q13 = new TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$6$1(f811Var2, bVar, j811Var, null);
                                    btsVar2.o0(Q13);
                                }
                                zpn.f(valueOf, value2, (wls) Q13, btsVar2);
                                z = false;
                                btsVar2.t(false);
                            }
                            btsVar2.t(z);
                        } else if (jl40.l(j811Var, i811Var)) {
                            btsVar2.e0(848561395);
                            hub1.a(btsVar2, 0);
                            btsVar2.t(false);
                        } else {
                            btsVar2.e0(848562463);
                            boolean e11 = btsVar2.e(f811Var3);
                            Object Q14 = btsVar2.Q();
                            if (e11 || Q14 == o430Var) {
                                Q14 = new TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$7$1(0, f811Var3, f811.class, "onErrorShown", "onErrorShown()V", 0);
                                btsVar2.o0(Q14);
                            }
                            zpn.i((sls) ((tfx) Q14), btsVar2);
                            btsVar2.t(false);
                        }
                        btsVar2.t(true);
                        return zy11Var;
                    }
                }, true);
                btsVar.o0(Q);
            }
            rzo.a(wwg.S(2129834963, true, new xor((zls) Q, i2), btsVar), btsVar, 6);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DriveState onAttachedToWindow$lambda$1$0$1(TaxiOrder taxiOrder) {
        return taxiOrder.h.getB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1$1(zls zlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            zlsVar.invoke(bzk0.c(an91.o(an91.m(c530.a, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, w8a1.f(vuz.o(btsVar).g, btsVar).a() + 48.0f, 7).k(ljs0.b), AppColor$Palette.Background, cyk0.c(24.0f)), btsVar, 48);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    public final void bottomSheetStateChanged(int state) {
        ((f811) this.transportRoutePartComposableHolder).f.setValue(Boolean.valueOf(state == 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeAllViews();
        ((f811) this.transportRoutePartComposableHolder).g = new r3y0(this, 0);
        this.composeView.setContent(new androidx.compose.runtime.internal.a(-1300743640, new r3y0(this, 1), true));
        addView(this.composeView);
    }
}

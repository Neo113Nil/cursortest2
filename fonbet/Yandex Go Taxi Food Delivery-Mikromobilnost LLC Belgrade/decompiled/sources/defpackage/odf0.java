package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.ui.semantics.f;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.c;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.rida.header.ui.RidaHeaderView;
import com.yandex.go.taxi.order.details.v2.navigation.d;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment;
import com.yandex.xplat.payment.sdk.AvailableMethods;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerFragment;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.view.QrReaderErrorView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.b;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation.QrPaymentsSubscriptionFragment;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.ceg0;
import defpackage.i7k0;
import defpackage.tje;
import defpackage.y6k0;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.domain.RequirementAddressInputType;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceSelectorWithHeaderView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.e;
import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;

/* loaded from: classes14.dex */
public final /* synthetic */ class odf0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ odf0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 viewBinding$lambda$2$lambda$0;
        r0 r0Var;
        Object value;
        g9g0 g9g0Var;
        zy11 renderCommonScreenData$lambda$38$lambda$37;
        zy11 render$lambda$5$lambda$4$lambda$3;
        YbButtonView.a render$lambda$2$lambda$1;
        zy11 performHandwritingGesture$lambda$0;
        zy11 onViewCreated$lambda$4;
        boolean _init_$lambda$1;
        int i = this.a;
        Object obj2 = null;
        char c = 1;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, ((a37) obj3).a);
                f.p(mnq0Var, 0);
                return zy11Var;
            case 1:
                f.l((mnq0) obj, ((dif0) obj3).c);
                return zy11Var;
            case 2:
                f.l((mnq0) obj, ((slf0) ((ulf0) obj3)).c);
                return zy11Var;
            case 3:
                q6c0 q6c0Var = (q6c0) obj3;
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                Window window = fragmentActivity.getWindow();
                if (window != null) {
                    window.clearFlags(8192);
                }
                WeakReference weakReference = (WeakReference) q6c0Var.c;
                if ((weakReference != null ? (FragmentActivity) weakReference.get() : null) == fragmentActivity) {
                    q6c0Var.c = null;
                    q6c0Var.w = null;
                }
                return zy11Var;
            case 4:
                viewBinding$lambda$2$lambda$0 = QrContainerFragment.getViewBinding$lambda$2$lambda$0((QrContainerFragment) obj3, ((Integer) obj).intValue());
                return viewBinding$lambda$2$lambda$0;
            case 5:
                b bVar = (b) ((a) obj3).c.b;
                d9g0 b = qca1.b((h9g0) bVar.X());
                if (b != null) {
                    pz40 Y = bVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                        g9g0Var = ((h9g0) value).a;
                        if (g9g0Var instanceof f9g0) {
                            g9g0Var = d9g0.c(b, null, null, null, null, null, null, null, false, null, 65279);
                        }
                    } while (!r0Var.k(value, new h9g0(g9g0Var)));
                }
                return zy11Var;
            case 6:
                renderCommonScreenData$lambda$38$lambda$37 = QrPaymentsMainFragment.renderCommonScreenData$lambda$38$lambda$37((t461) obj3, (Drawable) obj);
                return renderCommonScreenData$lambda$38$lambda$37;
            case 7:
                render$lambda$5$lambda$4$lambda$3 = QrPaymentsSubscriptionFragment.render$lambda$5$lambda$4$lambda$3((QrPaymentsSubscriptionFragment) obj3, ((Boolean) obj).booleanValue());
                return render$lambda$5$lambda$4$lambda$3;
            case 8:
                render$lambda$2$lambda$1 = QrReaderErrorView.render$lambda$2$lambda$1((ybg0) obj3, (YbButtonView.a) obj);
                return render$lambda$2$lambda$1;
            case 9:
                final c cVar = (c) obj3;
                yfd yfdVar = (yfd) obj;
                final peg0 peg0Var = new peg0(cVar);
                ((agd) yfdVar).e = new tls() { // from class: com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        c cVar2 = c.this;
                        tje.N(cVar2.o(), null, null, new QrScanRouterImpl$content$1$1$1(cVar2, (ceg0) obj4, peg0Var, null), 3);
                        return zy11.a;
                    }
                };
                qad.a.getClass();
                ((agd) yfdVar).g = qad.b;
                return zy11Var;
            case 10:
                j1v0 j1v0Var = (j1v0) obj;
                String str = ((p0v0) obj3).a;
                u8j0 u8j0Var = j1v0Var.a;
                z1v0 z1v0Var = (z1v0) u8j0Var.a();
                if (z1v0Var == null) {
                    return j1v0Var;
                }
                if (!(z1v0Var instanceof z1v0)) {
                    w511.b();
                    return null;
                }
                List<wj1> list = z1v0Var.a;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (wj1 wj1Var : list) {
                    List list2 = wj1Var.d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (!jl40.l(((p0v0) obj4).a, str)) {
                            arrayList2.add(obj4);
                        }
                    }
                    arrayList.add(wj1.a(wj1Var, arrayList2));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!((wj1) next).d.isEmpty()) {
                        arrayList3.add(next);
                    }
                }
                return j1v0.a(j1v0Var, zka1.d(u8j0Var, new lzu0(c == true ? 1 : 0, z1v0Var, arrayList3)));
            case 11:
                return ((w9i0) obj3).d.a((AvailableMethods) obj);
            case 12:
                performHandwritingGesture$lambda$0 = RecordingInputConnection.performHandwritingGesture$lambda$0((RecordingInputConnection) obj3, (zkn) obj);
                return performHandwritingGesture$lambda$0;
            case 13:
                return Boolean.valueOf(((l0j0) ((l3y) obj)).a() != ((l0j0) ((l3y) obj3)).a());
            case 14:
                onViewCreated$lambda$4 = ReportFormFragment.onViewCreated$lambda$4((ReportFormFragment) obj3, (ValueCallback) obj);
                return onViewCreated$lambda$4;
            case 15:
                z2j0 z2j0Var = (z2j0) obj3;
                int intValue = ((Integer) obj).intValue();
                vfc0 vfc0Var = z2j0Var.a;
                x2j0 x2j0Var = (x2j0) z2j0Var.b.get(intValue);
                l3j0 l3j0Var = ((o3j0) vfc0Var.b).c;
                p3j0 p3j0Var = l3j0Var.D;
                if (!x2j0Var.d) {
                    p3j0Var.j = true;
                    p3j0Var.g = l3j0Var.C.e;
                    for (x2j0 x2j0Var2 : p3j0Var.f) {
                        x2j0Var2.d = jl40.l(x2j0Var2.c, x2j0Var.c);
                    }
                    l3j0Var.Ng();
                    l3j0Var.z.G(p3j0Var, SharedPaymentAnalytics$Button.FREQUENCY_SELECTED);
                }
                return zy11Var;
            case 16:
                return (RequiredAltChoiceSelectorWithHeaderView) ((tgb0) ((aye0) obj3).b).get();
            case 17:
                e eVar = (e) obj3;
                eVar.Mg((String) obj);
                eVar.H.f = false;
                return zy11Var;
            case 18:
                ((ubj0) obj3).b.invoke(RequirementAddressInputType.COMMENT, (String) obj, Boolean.FALSE);
                return zy11Var;
            case 19:
                dcj0 dcj0Var = (dcj0) obj3;
                nbj0 nbj0Var = (nbj0) obj;
                ru.yandex.taxi.ui.form.constructor.a aVar = dcj0Var.y.a;
                String str2 = nbj0Var.b;
                Iterator it2 = aVar.b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                    } else if (!(((wu0) it2.next()) instanceof j2c)) {
                        i2++;
                    }
                }
                Object obj5 = aVar.b().get(i2);
                j2c j2cVar = obj5 instanceof j2c ? (j2c) obj5 : null;
                if (j2cVar != null) {
                    aVar.b().set(i2, new j2c(j2cVar.a, str2));
                    r0 r0Var2 = aVar.d;
                    List J0 = kotlin.collections.a.J0(aVar.b());
                    r0Var2.getClass();
                    r0Var2.m(null, J0);
                }
                dcj0Var.B.d = nbj0Var;
                return zy11Var;
            case 20:
                return Boolean.valueOf(!jl40.l(((mi31) obj).a, (pex0) obj3));
            case 21:
                b580 b580Var = (b580) obj3;
                Iterator it3 = ((ZoneTariffInfo) obj).o.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next2 = it3.next();
                        ru.yandex.taxi.requirements.models.net.c cVar2 = (ru.yandex.taxi.requirements.models.net.c) next2;
                        if (jl40.l(cVar2.c, b580Var.a)) {
                            f1b0 f1b0Var = cVar2.u;
                            if ((f1b0Var != null ? f1b0Var.a : null) == PersistenceTypeDto.LOCAL) {
                                obj2 = next2;
                            }
                        }
                    }
                }
                return (ru.yandex.taxi.requirements.models.net.c) obj2;
            case 22:
                ((com.ybsdk.core.common.data.cache.b) obj3).d.m0.a.a("tech.insta_cache.warm_up.finish", null);
                return zy11Var;
            case 23:
                s7k0 s7k0Var = (s7k0) obj3;
                CompositePaymentIconsView.update$default((CompositePaymentIconsView) obj, s7k0Var.a, s7k0Var.b, false, null, 8, null);
                return zy11Var;
            case 24:
                _init_$lambda$1 = RidaHeaderView._init_$lambda$1((RidaHeaderView) obj3, (t1w) obj);
                return Boolean.valueOf(_init_$lambda$1);
            case 25:
                final y6k0 y6k0Var = (y6k0) obj3;
                yfd yfdVar2 = (yfd) obj;
                ((agd) yfdVar2).f = me4.a;
                agd agdVar = (agd) yfdVar2;
                agdVar.c = y6k0Var.L.a();
                agdVar.e = new tls() { // from class: com.yandex.go.taxi.summary.rida_summary.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj6) {
                        y6k0 y6k0Var2 = y6k0.this;
                        tje.N(y6k0Var2.o(), null, null, new RidaSummaryComposeRouter$content$1$1$1(y6k0Var2, (i7k0) obj6, null), 3);
                        return zy11.a;
                    }
                };
                bov0 a = y6k0Var.J.a();
                if (a != null && a.a) {
                    i2 = 1;
                }
                final boolean z = i2 ^ 1;
                agdVar.g = new androidx.compose.runtime.internal.a(-1843492367, new bms() { // from class: w6k0
                    @Override // defpackage.bms
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i3;
                        xfd xfdVar = (xfd) obj6;
                        u7k0 u7k0Var = (u7k0) obj7;
                        fid fidVar = (fid) obj8;
                        int intValue2 = ((Integer) obj9).intValue();
                        if ((intValue2 & 6) == 0) {
                            i3 = ((intValue2 & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue2;
                        } else {
                            i3 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i3 |= ((bts) fidVar).k(u7k0Var) ? 32 : 16;
                        }
                        bts btsVar = (bts) fidVar;
                        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
                            y6k0 y6k0Var2 = y6k0.this;
                            boolean e = btsVar.e(y6k0Var2);
                            Object Q = btsVar.Q();
                            if (e || Q == did.a) {
                                Q = new zfj0(y6k0Var2);
                                btsVar.o0(Q);
                            }
                            hpb1.a((sls) Q, wwg.S(-701151894, true, new mr1(u7k0Var, z, xfdVar, 19), btsVar), btsVar, 48);
                        } else {
                            btsVar.Y();
                        }
                        return zy11.a;
                    }
                }, true);
                return zy11Var;
            case 26:
                n12 n12Var = (n12) obj3;
                yfd yfdVar3 = (yfd) obj;
                ((agd) yfdVar3).c = ((com.yandex.go.rida.unavailable.ui.a) n12Var.I).c;
                agd agdVar2 = (agd) yfdVar3;
                agdVar2.e = new vxj0(2, n12Var, new sue0(24, n12Var));
                yad.a.getClass();
                agdVar2.g = yad.b;
                return zy11Var;
            case 27:
                com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar2 = ((jbk0) obj3).m;
                aVar2.getClass();
                aVar2.g(new wwb((String) obj, 29));
                aVar2.b();
                aVar2.f();
                return zy11Var;
            case 28:
                aek0 aek0Var = (aek0) ((View) obj);
                aek0Var.disableNestedScrolling();
                View view = aek0Var.getView();
                view.setImportantForAccessibility(0);
                ViewGroup viewGroup = ((bek0) obj3).S;
                viewGroup.removeAllViews();
                viewGroup.addView(view);
                return zy11Var;
            default:
                return new bek0((View) obj, (d) obj3);
        }
    }
}

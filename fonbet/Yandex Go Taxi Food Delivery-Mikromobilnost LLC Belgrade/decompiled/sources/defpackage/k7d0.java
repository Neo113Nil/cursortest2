package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersPlusOptionPaymentResult;
import com.yandex.go.payments.shared.family.postcard.ui.PostcardView;
import com.yandex.go.plus.pay.presentation.a;
import com.yandex.go.preorder.navigation.h;
import com.yandex.go.preorder.navigation.n;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.impl.interactors.x;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.BoundingBoxHelper;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.messaging.domain.poll.PollMessageVote$OperationType;
import com.yandex.messaging.ui.polloptioninfo.PollOptionInfoActivity;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.PlusPanelStatusView;
import com.yandex.plus.home.feature.webviews.internal.smart.PlusSmartWebView;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.rt.ebs.cryptosdk.presentation.processing.ProcessingFragment;
import ru.yandex.taxi.address.entrances.ui.v1.PorchNumberInputModalView;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.d;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.repository.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class k7d0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k7d0(x xVar, Layout layout) {
        this.a = 29;
        this.b = layout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        if (r1.d.equals(r8.d) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r1.equals(r8) != false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [ijv0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zy11 actionTextDrawable$lambda$1;
        PlusSdkBrandType plusSdkBrandType;
        zy11 onCreate$lambda$4;
        WebResourceResponse webViewController_delegate$lambda$3$lambda$2;
        PollMessageVote$OperationType pollMessageVote$OperationType;
        zy11 insetsType$lambda$0;
        zy11 insetsType$lambda$02;
        zy11 zy11Var;
        kdb kdbVar;
        zy11 onViewCreated$lambda$3;
        zy11 onCreate$lambda$1;
        zy11 initView$lambda$1;
        k7z k7zVar;
        k7z k7zVar2;
        int i = this.a;
        int i2 = 3;
        boolean z = true;
        int i3 = 0;
        k7z k7zVar3 = 0;
        k7zVar3 = 0;
        k7zVar3 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                actionTextDrawable$lambda$1 = PlusPanelStatusView.setActionTextDrawable$lambda$1((PlusPanelStatusView) obj2, ((Integer) obj).intValue());
                return actionTextDrawable$lambda$1;
            case 1:
                fbd0 fbd0Var = (fbd0) obj2;
                nad0 nad0Var = (nad0) obj;
                nad0Var.a = fbd0Var.d;
                nad0Var.j = fbd0Var.e;
                nad0Var.e = fbd0Var.a;
                nad0Var.d = new vfc0(2, fbd0Var);
                nad0Var.f = fbd0Var.c;
                nad0Var.m = new s400();
                nad0Var.c = "ANDROID";
                nad0Var.g = fbd0Var.g;
                nad0Var.k = fbd0Var.h;
                String str = fbd0Var.i;
                if (str != null) {
                    nad0Var.b = str;
                }
                int i4 = xbd0.a[fbd0Var.k.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    plusSdkBrandType = PlusSdkBrandType.YANDEX;
                } else {
                    if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                    plusSdkBrandType = PlusSdkBrandType.YANGO;
                }
                nad0Var.i = plusSdkBrandType;
                nad0Var.l = fbd0Var.j;
                nad0Var.h = new zbd0(fbd0Var.f);
                return nad0Var;
            case 2:
                mta mtaVar = (mta) obj;
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = ((a) obj2).E.getOptionOffers();
                ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                Iterator<T> it = optionOffers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                }
                n12 n12Var = mtaVar.a;
                ((em9) n12Var.H).q(ChargersAnalytics$ChargersPlusOptionPaymentResult.Success);
                n12Var.r(new nk2(arrayList, i2));
                return zy11.a;
            case 3:
                dfd0 dfd0Var = (dfd0) obj2;
                PlusPayPaymentAnalyticsParams.a aVar = (PlusPayPaymentAnalyticsParams.a) obj;
                String str2 = dfd0Var.a;
                if (str2 != null) {
                    aVar.c = str2;
                }
                String str3 = dfd0Var.b;
                if (str3 != null) {
                    aVar.b = str3;
                }
                String str4 = dfd0Var.c;
                if (str4 != null) {
                    aVar.a = str4;
                }
                return zy11.a;
            case 4:
                ut20 ut20Var = (ut20) obj;
                gci0 gci0Var = (gci0) ((y4a0) obj2).c;
                ut20Var.a = new qc20(gci0Var);
                zia0 zia0Var = new zia0();
                zia0Var.c = gci0Var;
                zy11 zy11Var2 = zy11.a;
                mhd0 mhd0Var = zia0Var.a;
                zia0.a(mhd0Var, "themeProvider");
                vg10 vg10Var = zia0Var.b;
                n4u0 n4u0Var = zia0Var.c;
                zia0.a(n4u0Var, "themeFlow");
                ut20Var.b = new ofa0(mhd0Var, (e5o) vg10Var, n4u0Var, (xyj) zia0Var.d).w();
                return zy11Var2;
            case 5:
                onCreate$lambda$4 = PlusPayYbWebActivity.onCreate$lambda$4((PlusPayYbWebActivity) obj2, (mx60) obj);
                return onCreate$lambda$4;
            case 6:
                c cVar = (c) obj2;
                Throwable th = (Throwable) obj;
                if ((th instanceof GoApiHttpException) && ((GoApiHttpException) th).getCode() == 409) {
                    c.d(cVar, PurchaseStatus.SUBSCRIPTION_EXISTS, null, null, 6);
                } else {
                    c.d(cVar, PurchaseStatus.NETWORK_OR_SERVER_ERROR, null, null, 6);
                }
                return zy11.a;
            case 7:
                Integer num = (Integer) obj;
                num.getClass();
                return new Pair((uld0) obj2, num);
            case 8:
                webViewController_delegate$lambda$3$lambda$2 = PlusSmartWebView.webViewController_delegate$lambda$3$lambda$2((PlusSmartWebView) obj2, (WebResourceRequest) obj);
                return webViewController_delegate$lambda$3$lambda$2;
            case 9:
                com.yandex.messaging.ui.pollinfo.a aVar2 = (com.yandex.messaging.ui.pollinfo.a) obj2;
                int intValue = ((Integer) obj).intValue();
                j620 j620Var = j620.d;
                wwd0 wwd0Var = aVar2.w;
                qxd0 qxd0Var = new qxd0(j620Var, wwd0Var.b, wwd0Var.c, wwd0Var.d, wwd0Var.e, intValue);
                r770 r770Var = aVar2.c;
                r770Var.getClass();
                Activity activity = r770Var.a;
                Intent intent = new Intent(activity, (Class<?>) PollOptionInfoActivity.class);
                Bundle c = qxd0Var.c();
                c.putString("message_chat_id", qxd0Var.b);
                c.putLong("message_timestamp", qxd0Var.c);
                String str5 = qxd0Var.d;
                if (str5 != null) {
                    c.putString("original_message_chat_id", str5);
                }
                Long l = qxd0Var.e;
                if (l != null) {
                    c.putLong("original_message_timestamp", l.longValue());
                }
                c.putInt("answer_id", qxd0Var.f);
                intent.putExtras(c);
                activity.startActivity(intent);
                return zy11.a;
            case 10:
                dta0 dta0Var = (dta0) obj2;
                lxd0 lxd0Var = (lxd0) obj;
                lxd0Var.b = dta0Var.b;
                lxd0Var.a = Long.valueOf(dta0Var.a);
                int i5 = dta0Var.c;
                ArrayList arrayList2 = new ArrayList();
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((1 << i6) & i5) != 0) {
                        arrayList2.add(Integer.valueOf(i6));
                    }
                }
                lxd0Var.c = arrayList2;
                mxd0 mxd0Var = PollMessageVote$OperationType.Companion;
                int i7 = dta0Var.d;
                mxd0Var.getClass();
                PollMessageVote$OperationType[] values = PollMessageVote$OperationType.values();
                int length = values.length;
                while (true) {
                    if (i3 < length) {
                        pollMessageVote$OperationType = values[i3];
                        if (pollMessageVote$OperationType.getType() != i7) {
                            i3++;
                        }
                    } else {
                        pollMessageVote$OperationType = null;
                    }
                }
                if (pollMessageVote$OperationType == null) {
                    ny61.r(qv10.g(i7, "Unsupported type: "));
                    return null;
                }
                lxd0Var.d = pollMessageVote$OperationType;
                lxd0Var.f = dta0Var.f;
                lxd0Var.e = dta0Var.e;
                return zy11.a;
            case 11:
                Polygon polygon = (Polygon) obj2;
                li6 li6Var = (li6) obj;
                li6Var.getClass();
                if (!el00.a) {
                    ny61.r("MapKit must be initialized before building a BoundingBox");
                    return null;
                }
                BoundingBox bounds = BoundingBoxHelper.getBounds(polygon);
                Point southWest = bounds.getSouthWest();
                if (k.t(southWest.getLatitude(), southWest.getLongitude())) {
                    Point northEast = bounds.getNorthEast();
                    if (k.t(northEast.getLatitude(), northEast.getLongitude())) {
                        li6Var.b.add(bounds);
                    }
                }
                return zy11.a;
            case 12:
                v5e0 v5e0Var = (v5e0) obj2;
                h0c h0cVar = (h0c) obj;
                h0cVar.a("type", auu0.b, (r3 & 8) == 0);
                h0cVar.a("value", d6z.i("kotlinx.serialization.Polymorphic<" + ((g0c) v5e0Var.a).d() + '>', esq0.g, new SerialDescriptor[0]), (r3 & 8) == 0);
                h0cVar.b = v5e0Var.b;
                return zy11.a;
            case 13:
                insetsType$lambda$0 = PorchNumberInputModalView.insetsType$lambda$0((PorchNumberInputModalView) obj2, (t1w) obj);
                return insetsType$lambda$0;
            case 14:
                return new w50(16, (d) obj2);
            case 15:
                insetsType$lambda$02 = PostcardView.insetsType$lambda$0((PostcardView) obj2, (t1w) obj);
                return insetsType$lambda$02;
            case 16:
                zy11Var = PreGeoAuthOnboardingModalView.setupAgreementBlock$lambda$1((PreGeoAuthOnboardingModalView) obj2, (String) obj);
                return zy11Var;
            case 17:
                ConstraintLayout constraintLayout = ((com.yandex.go.splash.preload.c) obj2).c;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), ((t1w) obj).g);
                return Boolean.FALSE;
            case 18:
                ((zqe0) obj).n1((t0j) obj2);
                return zy11.a;
            case 19:
                xus xusVar = (xus) obj2;
                Result result = (Result) obj;
                Object value = result.getValue();
                if (!(value instanceof Result.Failure)) {
                    Preorder preorder = ((dqe0) xusVar.G).a;
                    ((com.yandex.go.preorder.confirm.a) xusVar.I).a(preorder);
                    ((ra00) xusVar.H).b((m950) ((yvf0) xusVar.E).get(), new b5y0("create order", preorder));
                }
                Throwable a = Result.a(result.getValue());
                if (a != null) {
                    jst.e.k(new IllegalStateException(a), "Failed to authorize user after orderTaxi command");
                    xusVar.r(new qu(9));
                }
                return zy11.a;
            case 20:
                h hVar = (h) obj2;
                hVar.D((m950) hVar.U.get(), new hse0((t7z) obj), new gre0(hVar));
                q4l0 q4l0Var = hVar.J;
                q4l0Var.a = null;
                q4l0Var.b = false;
                return Boolean.TRUE;
            case 21:
                n.X(((rht0) obj).a, (xse0) obj2);
                return zy11.a;
            case 22:
                sht0 sht0Var = (sht0) obj;
                xse0 xse0Var = new xse0(ghv0.a, k7zVar3, (k9s0) obj2, 56);
                sht0Var.getClass();
                yse0 yse0Var = new yse0(xse0Var);
                n nVar = sht0Var.a;
                h0g h0gVar = nVar.s0;
                if (h0gVar != null && (kdbVar = h0gVar.h6) != null) {
                    nVar.D((wse0) kdbVar.get(), yse0Var, new rht0(nVar));
                }
                return zy11.a;
            case 23:
                onViewCreated$lambda$3 = PresaleFragment.onViewCreated$lambda$3((PresaleFragment) obj2, (mx60) obj);
                return onViewCreated$lambda$3;
            case 24:
                onCreate$lambda$1 = PreselectActivity.onCreate$lambda$1((PreselectActivity) obj2, (mx60) obj);
                return onCreate$lambda$1;
            case 25:
                rwe0 rwe0Var = (rwe0) obj2;
                ArrayList arrayList3 = new ArrayList((List) obj);
                rwe0Var.C = arrayList3;
                if (arrayList3.size() == 1) {
                    rwe0Var.Y((PaymentMethod) kotlin.collections.a.P(rwe0Var.C), false);
                } else {
                    rwe0Var.X();
                }
                return zy11.a;
            case 26:
                initView$lambda$1 = ProcessingFragment.initView$lambda$1((ProcessingFragment) obj2, (View) obj);
                return initView$lambda$1;
            case 27:
                z5u0 z5u0Var = (z5u0) obj;
                ArrayList arrayList4 = new ArrayList();
                TimestampSelector timestampSelector = ((ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.d) obj2).a;
                wzv wzvVar = z5u0Var.b;
                vzv vzvVar = wzvVar instanceof vzv ? (vzv) wzvVar : null;
                if (vzvVar != null && (k7zVar = vzvVar.b) != null) {
                    wzv wzvVar2 = z5u0Var.a;
                    vzv vzvVar2 = wzvVar2 instanceof vzv ? (vzv) wzvVar2 : null;
                    if (vzvVar2 == null || (k7zVar2 = vzvVar2.b) == null || timestampSelector.compare(k7zVar.a, k7zVar2.a) > 0) {
                        k7zVar3 = k7zVar;
                    }
                }
                if (k7zVar3 != 0) {
                    arrayList4.add(new ubz(k7zVar3));
                }
                wzv wzvVar3 = z5u0Var.b;
                wzv wzvVar4 = z5u0Var.a;
                if (wzvVar4 != null) {
                    if (!(wzvVar4 instanceof vzv) || !(wzvVar3 instanceof vzv)) {
                        if (wzvVar4 instanceof uzv) {
                            if (wzvVar3 instanceof uzv) {
                                break;
                            }
                        }
                    } else {
                        vzv vzvVar3 = (vzv) wzvVar4;
                        vzv vzvVar4 = (vzv) wzvVar3;
                        if (jl40.l(vzvVar3.a, vzvVar4.a)) {
                            break;
                        }
                    }
                    return arrayList4;
                }
                arrayList4.add(z5u0Var);
                return arrayList4;
            case 28:
                return ((j1) obj2).b((haf0) obj);
            default:
                e6v e6vVar = (e6v) obj;
                int i8 = ((Layout) obj2).b;
                if (e6vVar instanceof ga5) {
                    ga5 ga5Var = (ga5) e6vVar;
                    if (ga5Var.getBase().a <= 0 || ga5Var.getBase().b <= 0 || ga5Var.getBase().a > i8) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ k7d0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

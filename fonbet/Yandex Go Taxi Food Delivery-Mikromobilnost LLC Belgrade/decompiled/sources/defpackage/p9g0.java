package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.compose.material3.z;
import com.yandex.go.beginners.safety.photo.main.c;
import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.dto.response.ActionType;
import com.yandex.go.dto.response.m1;
import com.yandex.go.dto.response.q1;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Reason;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Service;
import com.yandex.go.preorder.map.CameraAnimationFinishType;
import com.yandex.go.rida.bids.router.g;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.impl.next.button.NextButtonAnalytics$ProceedButtonType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import com.yandex.go.taxi.main.h;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$RideCardDataSource;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$RideCardLoadedReason;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$RideCardPresentation;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$TaxiOrderStatus;
import com.yandex.go.zone.model.Zone;
import com.yandex.messaging.data.e;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoLoadedVersion;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.qr.payments.api.QrPaymentsArguments;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSubscriptionScreenParams;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import com.ybsdk.feature.qr.payments.api.data.TryToRefreshEntity;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.AmountScreenStatus;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.b;
import com.ybsdk.feature.qr.payments.internal.screens.refresh.presentation.QrRefreshArguments;
import com.ybsdk.feature.qr.payments.internal.screens.refresh.presentation.QrRefreshFragment;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation.QrPaymentsSubscriptionFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardFragment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Reason;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Service;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.summary.solid.l;
import ru.yandex.taxi.scooters.experiments.FinishCard;
import ru.yandex.taxi.scooters.presentation.finish_info.d;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes14.dex */
public final class p9g0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p9g0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:402:0x09c9, code lost:
    
        if (r9 == null) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x09cc, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x09d8, code lost:
    
        r14 = com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoLoadedVersion.CREDLIM;
        r4 = android.net.Uri.parse(r3);
        r5 = r4.getScheme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x09e2, code lost:
    
        if (r5 == null) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x09e8, code lost:
    
        if (r5.length() != 0) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x09eb, code lost:
    
        r5 = r4.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x09ef, code lost:
    
        if (r5 == null) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x09f5, code lost:
    
        if (r5.length() != 0) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x09f8, code lost:
    
        r3 = defpackage.evu0.S("/", r4.buildUpon().clearQuery().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0a0a, code lost:
    
        defpackage.rt1.z(r12, r3, r14, r15, null, r17, (java.lang.String) r1.b, null, 152);
        r0 = r0.Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0a1e, code lost:
    
        r1 = (kotlinx.coroutines.flow.r0) r0;
        r3 = r1.getValue();
        r4 = (defpackage.h9g0) r3;
        r4 = r11.a.b();
        r5 = r11.a.getAmount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0a36, code lost:
    
        if ((r2 instanceof com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException.Network) == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a38, code lost:
    
        r7 = new defpackage.z8g0(r4, r5, (com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException.Network) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0a53, code lost:
    
        if (r1.k(r3, new defpackage.h9g0(r7)) == false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0a41, code lost:
    
        r7 = new defpackage.a9g0(r4, r5, defpackage.uja1.c(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x09d5, code lost:
    
        r9 = "something went wrong";
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x09d3, code lost:
    
        if (r9 == null) goto L387;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x07a2  */
    /* JADX WARN: Type inference failed for: r4v28, types: [T, kotlin.Pair] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String X;
        d9g0 d9g0Var;
        r0 r0Var;
        Object value;
        String str;
        rhj0 a;
        Object putIfAbsent;
        TaxiOrderAnalytics$RideCardDataSource taxiOrderAnalytics$RideCardDataSource;
        sxr0 sxr0Var;
        Layout layout;
        Object obj2;
        q1 q1Var;
        ActionType a2;
        pcu pcuVar;
        Object emit;
        boolean isGuidelinesWidgetFit;
        int i = this.a;
        int i2 = 9;
        String str2 = null;
        r9 = null;
        r9 = null;
        String str3 = null;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Object value2 = ((Result) obj).getValue();
                b bVar = (b) obj4;
                h9g0 h9g0Var = (h9g0) obj3;
                Throwable a3 = Result.a(value2);
                if (a3 != null) {
                    String qrLink = bVar.B.getQrLink();
                    List singletonList = Collections.singletonList(lrp0.x);
                    boolean isEmpty = singletonList.isEmpty();
                    if (isEmpty) {
                        X = null;
                    } else {
                        if (isEmpty) {
                            w511.b();
                            return null;
                        }
                        X = a.X(singletonList, "", null, null, new dsg(16), 30);
                    }
                    trp0 trp0Var = trp0.a;
                    trp0.e(new jqp0(a3, "Failed to resolve qr", qrLink, X));
                    yxf0 yxf0Var = bVar.I;
                    String qrLink2 = bVar.B.getQrLink();
                    rt1 rt1Var = ((AppAnalyticsReporter) yxf0Var.a).Y;
                    QrPaymentEvents$QrPaymentInfoLoadedResult qrPaymentEvents$QrPaymentInfoLoadedResult = QrPaymentEvents$QrPaymentInfoLoadedResult.ERROR;
                    if (uja1.c(a3) != null) {
                        FailDataException failDataException = a3 instanceof FailDataException ? (FailDataException) a3 : null;
                        if (failDataException != null) {
                            str2 = failDataException.getTechInfo();
                            break;
                        }
                    } else {
                        str2 = a3.getMessage();
                        break;
                    }
                } else {
                    l8g0 l8g0Var = (l8g0) value2;
                    d9g0 b = qca1.b(h9g0Var);
                    mag0 mag0Var = bVar.E;
                    tfl0 tfl0Var = bVar.C;
                    yxf0 yxf0Var2 = bVar.I;
                    if (jl40.l(l8g0Var, f8g0.a)) {
                        ((AppAnalyticsReporter) yxf0Var2.a).Y.a.a("qr.payment_info.polling", null);
                    } else if (l8g0Var instanceof g8g0) {
                        rt1.z(((AppAnalyticsReporter) yxf0Var2.a).Y, null, QrPaymentEvents$QrPaymentInfoLoadedVersion.CREDLIM, QrPaymentEvents$QrPaymentInfoLoadedResult.REDIRECT, null, null, (String) yxf0Var2.b, null, 185);
                        h791.e(bVar.D, ((g8g0) l8g0Var).a, false, null, 14);
                    } else if (l8g0Var instanceof h8g0) {
                        gpi0 gpi0Var = ((h8g0) l8g0Var).a;
                        rt1.z(((AppAnalyticsReporter) yxf0Var2.a).Y, null, QrPaymentEvents$QrPaymentInfoLoadedVersion.CREDLIM, QrPaymentEvents$QrPaymentInfoLoadedResult.REFRESH, null, null, (String) yxf0Var2.b, gpi0Var.f, 57);
                        QrRefreshArguments qrRefreshArguments = new QrRefreshArguments(new TryToRefreshEntity(gpi0Var.a, gpi0Var.b, gpi0Var.c, new TryToRefreshEntity.Header.Image(gpi0Var.d), gpi0Var.e));
                        mag0Var.getClass();
                        tfl0Var.l(new FragmentScreen("QrRefreshScreen", false, qrRefreshArguments, null, qoi0.a(QrRefreshFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null));
                    } else if (l8g0Var instanceof i8g0) {
                        v1a0 v1a0Var = ((i8g0) l8g0Var).a;
                        yxf0.r(yxf0Var2, null, v1a0Var, 1);
                        if (b != null) {
                            d9g0Var = d9g0.c(b, null, null, null, null, null, v1a0Var.e, null, false, null, 61439);
                        } else {
                            ThemedImageUrlEntity themedImageUrlEntity = v1a0Var.b.c;
                            Money money = v1a0Var.c;
                            String currency = money.getCurrency();
                            BigDecimal amount = money.getAmount();
                            String str4 = v1a0Var.b.a;
                            PageImageHeaderEntity pageImageHeaderEntity = v1a0Var.a;
                            bcp0 bcp0Var = v1a0Var.f;
                            String str5 = v1a0Var.d;
                            boolean z = v1a0Var.g;
                            d9g0Var = new d9g0(themedImageUrlEntity, currency, str4, pageImageHeaderEntity, str5, null, amount, null, null, bcp0Var, (z && jl40.l(money.getAmount(), BigDecimal.ZERO)) ? AmountScreenStatus.EDIT_AMOUNT : AmountScreenStatus.SELECT_AGREEMENT, z, v1a0Var.e, o031.a, false, null);
                        }
                        pz40 Y = bVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, new h9g0(d9g0Var)));
                    } else {
                        if (!(l8g0Var instanceof j8g0)) {
                            w511.b();
                            return null;
                        }
                        a1v0 a1v0Var = ((j8g0) l8g0Var).a;
                        yxf0.r(yxf0Var2, a1v0Var, null, 2);
                        String str6 = ((h9g0) bVar.X()).b;
                        QrPaymentsArguments qrPaymentsArguments = bVar.B;
                        QrPaymentsSubscriptionScreenParams qrPaymentsSubscriptionScreenParams = new QrPaymentsSubscriptionScreenParams(str6, qrPaymentsArguments.getQrLink(), a1v0Var.a, a1v0Var.b, qrPaymentsArguments.getOrigin(), false, 32, null);
                        mag0Var.getClass();
                        tfl0Var.l(new FragmentScreen("QrPaymentSubscriptionScreen", false, qrPaymentsSubscriptionScreenParams, TransitionPolicyType.POPUP, qoi0.a(QrPaymentsSubscriptionFragment.class), OpenScreenRequirement.WithBuid.INSTANCE));
                    }
                }
                return zy11Var;
            case 1:
                lmw0 lmw0Var = (lmw0) obj;
                hjj0 hjj0Var = (hjj0) obj3;
                gjj0 gjj0Var = (gjj0) obj4;
                if (lmw0Var instanceof jmw0) {
                    jmw0 jmw0Var = (jmw0) lmw0Var;
                    if (jmw0Var.u()) {
                        str = jmw0Var.getDescription();
                        gjj0Var.showDescription(str);
                        Zone c = hjj0Var.x.c();
                        a = lmw0Var != null ? shj0.a(lmw0Var, c == null ? (oqj0) c.d(oqj0.e) : oqj0.e) : null;
                        hjj0Var.B = a;
                        if (a != null) {
                            String str7 = a.d;
                            gjj0Var.showTopSubtitle(a.c);
                            if (str7 != null && str7.length() != 0 && !a.e.isEmpty()) {
                                r7 = true;
                            }
                            gjj0Var.showInfoButton(str7 != null ? str7 : "", r7);
                        }
                        return zy11Var;
                    }
                }
                str = null;
                gjj0Var.showDescription(str);
                Zone c2 = hjj0Var.x.c();
                if (lmw0Var != null) {
                }
                hjj0Var.B = a;
                if (a != null) {
                }
                return zy11Var;
            case 2:
                u8j0 u8j0Var = (u8j0) obj;
                ConcurrentHashMap concurrentHashMap = ((com.ybsdk.core.common.data.cache.b) obj4).k;
                String str8 = ((vvj0) obj3).b;
                Object obj5 = concurrentHashMap.get(str8);
                if (obj5 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str8, (obj5 = bvf0.c(u8j0Var)))) != null) {
                    obj5 = putIfAbsent;
                }
                ((r0) ((pz40) obj5)).l(u8j0Var);
                return zy11Var;
            case 3:
                g gVar = (g) obj4;
                if (!((Boolean) obj).booleanValue()) {
                    gVar.j(dpb.a);
                    gVar.F.b((m950) gVar.L.get(), new a5y0("open from rida bids", (o2y0) obj3, null, 28));
                }
                return zy11Var;
            case 4:
                qnk0 qnk0Var = (qnk0) obj;
                DriveState driveState = qnk0Var.d;
                vfk0 vfk0Var = qnk0Var.e;
                ?? pair = new Pair(driveState, vfk0Var);
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                if (!pair.equals(ref$ObjectRef.element)) {
                    ListBuilder f = qpa1.f(qnk0Var.a);
                    T t = ref$ObjectRef.element;
                    TaxiOrderAnalytics$RideCardLoadedReason taxiOrderAnalytics$RideCardLoadedReason = t == 0 ? TaxiOrderAnalytics$RideCardLoadedReason.Opened : ((DriveState) ((Pair) t).c()) != driveState ? TaxiOrderAnalytics$RideCardLoadedReason.StatusChanged : TaxiOrderAnalytics$RideCardLoadedReason.SourceChanged;
                    ref$ObjectRef.element = pair;
                    com.yandex.go.taxi.order.details.v2.analytics.g gVar2 = (com.yandex.go.taxi.order.details.v2.analytics.g) obj3;
                    TaxiOrderAnalytics$RideCardPresentation f2 = kpa1.f(qnk0Var.c);
                    if (f2 != null) {
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = f.listIterator(0);
                        while (true) {
                            qqy qqyVar = (qqy) listIterator;
                            if (qqyVar.hasNext()) {
                                Object obj6 = ((zjk0) qqyVar.next()).getAnalytics().getExtras().get("analytics_id");
                                String str9 = obj6 instanceof String ? (String) obj6 : null;
                                if (str9 != null) {
                                    arrayList.add(str9);
                                }
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (((String) next).length() > 0) {
                                        arrayList2.add(next);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    yxx0 yxx0Var = gVar2.f;
                                    String str10 = gVar2.a.b().a;
                                    TaxiOrderAnalytics$TaxiOrderStatus g = kpa1.g(driveState);
                                    if (vfk0Var instanceof tfk0) {
                                        taxiOrderAnalytics$RideCardDataSource = TaxiOrderAnalytics$RideCardDataSource.Initial;
                                    } else {
                                        if (!(vfk0Var instanceof ufk0)) {
                                            w511.b();
                                            return null;
                                        }
                                        taxiOrderAnalytics$RideCardDataSource = TaxiOrderAnalytics$RideCardDataSource.Backend;
                                    }
                                    yxx0Var.getClass();
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("order_id", str10);
                                    hashMap.put("order_status", g.getEventValue());
                                    hashMap.put("presentation", f2.getEventValue());
                                    hashMap.put("items_flattened", arrayList2);
                                    hashMap.put("source", taxiOrderAnalytics$RideCardDataSource.getEventValue());
                                    hashMap.put(CRLReasonCodeExtension.REASON, taxiOrderAnalytics$RideCardLoadedReason.getEventValue());
                                    yxx0Var.a.a("TaxiOrder.RideCard.Loaded", hashMap, 2, new HashMap());
                                }
                            }
                        }
                    }
                }
                return zy11Var;
            case 5:
                z30 z30Var = (z30) obj;
                Uri uri = z30Var != null ? z30Var.b : null;
                swl0 swl0Var = (swl0) obj4;
                if (uri != null) {
                    ohb0 ohb0Var = new ohb0(uri, true);
                    switch (swl0Var.a) {
                        case 0:
                            ((c) swl0Var.b).r(new ohk0(21, ohb0Var));
                            break;
                        default:
                            com.yandex.go.beginners.safety.photo.upload.b bVar2 = (com.yandex.go.beginners.safety.photo.upload.b) swl0Var.b;
                            bVar2.J.a(bVar2.o(), ohb0Var, bVar2.M, bVar2.L);
                            break;
                    }
                } else {
                    swl0Var.getClass();
                }
                ((com.yandex.go.beginners.safety.photo.domain.a) obj3).b.b(HProv.PP_CONTAINER_STATUS);
                return zy11Var;
            case 6:
                return !((Boolean) ((oz40) obj3).getValue()).booleanValue() ? ((androidx.compose.animation.core.a) obj4).f(new Float(((Number) obj).floatValue()), continuation) : zy11Var;
            case 7:
                jwo0 jwo0Var = (jwo0) obj;
                d dVar = (d) obj4;
                l050 Dg = dVar.Dg();
                ru.yandex.taxi.scooters.presentation.feedback.domain.c cVar = dVar.O;
                imn0 imn0Var = dVar.L;
                wmn0 wmn0Var = (wmn0) Dg;
                FinishCard finishCard = (FinishCard) obj3;
                if (finishCard != null && finishCard.d) {
                    r7 = true;
                }
                wmn0Var.Zc(r7, imn0Var, ((sln0) cVar.e.c).a, jwo0Var);
                ((wmn0) dVar.Dg()).mg(cVar.d.f(imn0Var.a));
                return zy11Var;
            case 8:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj4;
                Object obj7 = (List) ref$ObjectRef2.element;
                ref$ObjectRef2.element = null;
                vpr vprVar = (vpr) obj3;
                if (obj7 == null) {
                    obj7 = EmptyList.a;
                }
                return vprVar.emit(obj7, continuation);
            case 9:
                dro0 dro0Var = (dro0) obj;
                if (dro0Var != bro0.a) {
                    ((xqo0) obj4).render(dro0Var);
                } else {
                    ((vdm) ((zqo0) obj3).A.b).r(new qu(i2));
                }
                return zy11Var;
            case 10:
                p3p0 p3p0Var = (p3p0) obj;
                if (p3p0Var != n3p0.a) {
                    ((k3p0) obj4).render(p3p0Var);
                } else {
                    ((l3p0) obj3).A.invoke();
                }
                return zy11Var;
            case 11:
                dap0 dap0Var = (dap0) obj;
                if (dap0Var != bap0.a) {
                    ((t9p0) obj4).render(dap0Var);
                } else {
                    ((v9p0) obj3).A.invoke();
                }
                return zy11Var;
            case 12:
                zap0 zap0Var = (zap0) obj;
                if (zap0Var != xap0.a) {
                    ((nap0) obj4).render(zap0Var);
                } else {
                    ((pap0) obj3).A.invoke();
                }
                return zy11Var;
            case 13:
                ph31 ph31Var = (ph31) obj3;
                vep0 vep0Var = (vep0) obj4;
                oev0 oev0Var = (oev0) obj;
                if (oev0Var instanceof gdv0) {
                    vep0.a(vep0Var, ph31Var, ((gdv0) oev0Var).a);
                } else if (oev0Var instanceof edv0) {
                    vep0.a(vep0Var, ph31Var, ((edv0) oev0Var).a);
                }
                return zy11Var;
            case 14:
                ((e9e) obj4).accept(new Long(((e) obj3).c()));
                return zy11Var;
            case 15:
                CameraAnimationFinishType cameraAnimationFinishType = (CameraAnimationFinishType) obj;
                if (!((h) obj4).F.f()) {
                    ((q2s0) obj3).Q0(cameraAnimationFinishType);
                }
                return zy11Var;
            case 16:
                ShortcutsView shortcutsView = (ShortcutsView) obj4;
                sxr0Var = shortcutsView.shortcutAnalytics;
                layout = shortcutsView.currentLayout;
                String str11 = layout.c;
                List list = (List) obj3;
                com.yandex.go.shortcuts.impl.analytic.a aVar = (com.yandex.go.shortcuts.impl.analytic.a) sxr0Var;
                if (!jl40.l(aVar.l, str11)) {
                    aVar.l = str11;
                    vxr0 vxr0Var = new vxr0(0);
                    vxr0Var.d = str11;
                    ArrayList m0 = a.m0(com.yandex.go.shortcuts.impl.analytic.a.c(aVar.o, BaseShortcutModel$Source.VERTICAL_STACK_ITEM, Integer.MAX_VALUE), a.m0(com.yandex.go.shortcuts.impl.analytic.a.c(aVar.o, BaseShortcutModel$Source.HORIZONTAL_STACK_ITEM, Integer.MAX_VALUE), a.m0(com.yandex.go.shortcuts.impl.analytic.a.c(aVar.o, BaseShortcutModel$Source.BOTTOM_ITEMS, Integer.MAX_VALUE), a.m0(com.yandex.go.shortcuts.impl.analytic.a.c(aVar.o, BaseShortcutModel$Source.TOP_ITEMS, Integer.MAX_VALUE), a.m0(com.yandex.go.shortcuts.impl.analytic.a.c(aVar.o, BaseShortcutModel$Source.TURBO_BUTTONS, Integer.MAX_VALUE), com.yandex.go.shortcuts.impl.analytic.a.c(aVar.o, BaseShortcutModel$Source.HEADER, Integer.MAX_VALUE))))));
                    ArrayList arrayList3 = vxr0Var.h;
                    arrayList3.clear();
                    arrayList3.addAll(m0);
                    vxr0Var.j = aVar.k;
                    List c3 = com.yandex.go.shortcuts.impl.analytic.a.c(aVar.o, BaseShortcutModel$Source.ITEMS, 3);
                    ArrayList arrayList4 = vxr0Var.g;
                    arrayList4.clear();
                    arrayList4.addAll(c3);
                    u4s0 u4s0Var = (u4s0) aVar.d;
                    u4s0Var.getClass();
                    List<hx31> list2 = list;
                    ArrayList arrayList5 = new ArrayList(tcc.n(list2, 10));
                    for (hx31 hx31Var : list2) {
                        arrayList5.add(u4s0Var.b((View) u4s0Var.a.get(hx31Var.c()), hx31Var).a());
                    }
                    vxr0Var.i.addAll(arrayList5);
                    st0 a4 = vxr0Var.a();
                    i d = ((j) aVar.a).d((String) aVar.i.a);
                    aVar.b(a4, d);
                    d.j((r2 & 1) == 0);
                    d.m();
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            hx31 hx31Var2 = (hx31) obj2;
                            if ((hx31Var2 instanceof ebu) && (pcuVar = ((ebu) hx31Var2).f) != null) {
                                if (!((pcuVar != null ? pcuVar.c : null) instanceof m1)) {
                                    if (!((pcuVar != null ? pcuVar.c : null) instanceof Action$RouteInput)) {
                                        if ((pcuVar != null ? pcuVar.c : null) instanceof Action$SummaryRedirect) {
                                        }
                                    }
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    hx31 hx31Var3 = (hx31) obj2;
                    if (hx31Var3 != null) {
                        z660 z660Var = aVar.f;
                        String a5 = aVar.e.a();
                        pcu pcuVar2 = ((ebu) hx31Var3).f;
                        if (pcuVar2 != null && (q1Var = pcuVar2.c) != null && (a2 = q1Var.a()) != null) {
                            str3 = a2.name();
                        }
                        String str12 = str3 != null ? str3 : "";
                        w660 w660Var = z660Var.c;
                        Zone g2 = z660Var.a.g();
                        ic00 ic00Var = ((kc00) z660Var.b).a;
                        ic00Var.getClass();
                        boolean z2 = ic00Var instanceof hc00;
                        boolean z3 = g2 != null && g2.b;
                        w660Var.getClass();
                        NextButtonAnalytics$ProceedButtonType nextButtonAnalytics$ProceedButtonType = NextButtonAnalytics$ProceedButtonType.ARROW_ON_SHORTCUT;
                        u660 u660Var = new u660(nextButtonAnalytics$ProceedButtonType, z3, "shortcuts", z2, a5);
                        if (!jl40.l(w660Var.a().a, u660Var)) {
                            w660Var.a().a = u660Var;
                            t61 t61Var = w660Var.b;
                            String value3 = nextButtonAnalytics$ProceedButtonType.getValue();
                            Boolean valueOf = Boolean.valueOf(z2);
                            Boolean valueOf2 = Boolean.valueOf(z3);
                            t61Var.getClass();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("main_screen_version", "shortcuts");
                            hashMap2.put("action", str12);
                            if (value3 != null) {
                                hashMap2.put("button_type", value3);
                            }
                            hashMap2.put("is_flex", valueOf);
                            if (a5 != null) {
                                hashMap2.put(MetaDataField.SCREEN_FIELD, a5);
                            }
                            t61Var.a.a("AddressSelectionSkipButtonShown", hashMap2, 1, g8e.v(hashMap2, "skip_req_destination", valueOf2));
                        }
                    }
                }
                return zy11Var;
            case 17:
                m6t0 m6t0Var = (m6t0) obj3;
                l lVar = (l) obj4;
                uqv0 uqv0Var = (uqv0) obj;
                if (uqv0Var instanceof oqv0) {
                    oqv0 oqv0Var = (oqv0) uqv0Var;
                    lVar.Lg(oqv0Var.a, oqv0Var.b);
                } else if (uqv0Var instanceof nqv0) {
                    lVar.Og(((nqv0) uqv0Var).a);
                } else if (uqv0Var instanceof pqv0) {
                    pqv0 pqv0Var = (pqv0) uqv0Var;
                    lVar.Pg(pqv0Var.a, pqv0Var.b);
                } else if (uqv0Var instanceof rqv0) {
                    rqv0 rqv0Var = (rqv0) uqv0Var;
                    lVar.Rg(c8r.b(lVar.h0, rqv0Var.a.a, null, null, 6), rqv0Var.b);
                    Runnable runnable = rqv0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else if (uqv0Var instanceof sqv0) {
                    sqv0 sqv0Var = (sqv0) uqv0Var;
                    m6t0Var.Vf(sqv0Var.a, sqv0Var.b);
                } else if (uqv0Var instanceof tqv0) {
                    lVar.Mg(((tqv0) uqv0Var).a);
                } else {
                    if (!jl40.l(uqv0Var, qqv0.a)) {
                        w511.b();
                        return null;
                    }
                    m6t0Var.yf();
                }
                return zy11Var;
            case 18:
                bv80 bv80Var = (bv80) obj;
                vpr vprVar2 = (vpr) obj3;
                if (jl40.l((String) obj4, bv80Var.b)) {
                    emit = vprVar2.emit(new xlv(bv80Var.a, bv80Var.c, bv80Var.d), continuation);
                    if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return zy11Var;
                    }
                } else {
                    emit = vprVar2.emit(null, continuation);
                    if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return zy11Var;
                    }
                }
                return emit;
            case 19:
                lx40 lx40Var = (lx40) obj3;
                wg6 wg6Var = (wg6) obj4;
                hdv0 hdv0Var = (hdv0) obj;
                if (hdv0Var instanceof fdv0) {
                    Object d2 = com.yandex.go.design.compose.modal.bottomsheet.c.d(wg6Var, lx40Var.b, continuation);
                    if (d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return d2;
                    }
                } else if (hdv0Var instanceof ddv0) {
                    com.yandex.go.design.compose.modal.bottomsheet.c.b(wg6Var, lx40Var.b);
                } else if (hdv0Var instanceof gdv0) {
                    Object d3 = com.yandex.go.design.compose.modal.bottomsheet.c.d(wg6Var, -2, continuation);
                    if (d3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return d3;
                    }
                } else {
                    if (!(hdv0Var instanceof edv0)) {
                        w511.b();
                        return null;
                    }
                    com.yandex.go.design.compose.modal.bottomsheet.c.b(wg6Var, -2);
                }
                return zy11Var;
            case 20:
                rjw0 rjw0Var = (rjw0) obj4;
                wjw0 wjw0Var = (wjw0) obj;
                if (wjw0Var instanceof ujw0) {
                    piw0 piw0Var = rjw0Var.A;
                    piw0Var.b(piw0.a("MainScreen", piw0Var.b.compareAndSet(false, true) ? "Appear" : "Update"), new Pair("ride_status", rjw0Var.y.c().name()), new Pair("items", a.X(((ujw0) wjw0Var).c, Extension.FIX_SPACE, null, null, new oxv0(i2), 30)));
                    ((qjw0) obj3).render(wjw0Var);
                } else if (jl40.l(wjw0Var, vjw0.a)) {
                    a3y0.d((a3y0) rjw0Var.B.getValue(), "SUPPORT_FLOW_ERROR", null, m94.T, 2);
                    ((tjw0) rjw0Var.x.a).r(new qu(i2));
                }
                return zy11Var;
            case 21:
                Pair pair2 = (Pair) obj;
                ((tls) obj4).invoke(new vdx0(((Number) pair2.getFirst()).intValue(), ((Boolean) pair2.getSecond()).booleanValue(), (ob5) obj3));
                return zy11Var;
            case 22:
                m3y0 m3y0Var = (m3y0) obj4;
                n3y0 n3y0Var = m3y0Var.D;
                int i3 = l3y0.b[m3y0Var.F.ordinal()];
                if (i3 == 1) {
                    m3y0Var.B.a(NativeMessengerAnalyticsFacade$Service.TAXI, n3y0Var.b, NativeMessengerAnalyticsFacade$Reason.STATUS_CHANGED);
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    m3y0Var.C.b(WebMessengerAnalyticsFacade$Service.TAXI, n3y0Var.b, WebMessengerAnalyticsFacade$Reason.STATUS_CHANGED);
                }
                ((k3y0) obj3).close();
                return zy11Var;
            case 23:
                w5y0 w5y0Var = (w5y0) obj;
                o5y0 o5y0Var = (o5y0) obj4;
                if (w5y0Var == null) {
                    ((zc) o5y0Var.z.a).r(new bkx0(22));
                } else {
                    ((n5y0) obj3).renderUiState(w5y0Var);
                    if (!o5y0Var.C) {
                        o5y0Var.A.c(o5y0Var.y);
                    }
                    o5y0Var.C = true;
                }
                return zy11Var;
            case 24:
                return com.yandex.go.taxi.order.net.xiva.d.b((com.yandex.go.taxi.order.net.xiva.d) obj4, (String) obj3, ((Boolean) obj).booleanValue(), continuation);
            case 25:
                g8w g8wVar = (g8w) obj;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                if (g8wVar instanceof jxe0) {
                    ref$IntRef.element++;
                } else if (g8wVar instanceof kxe0) {
                    ref$IntRef.element--;
                } else if (g8wVar instanceof ixe0) {
                    ref$IntRef.element--;
                }
                r7 = ref$IntRef.element > 0;
                z zVar = (z) obj3;
                if (zVar.w != r7) {
                    zVar.w = r7;
                    qje.P(zVar).C();
                }
                return zy11Var;
            case 26:
                if (((Boolean) obj).booleanValue()) {
                    ((r101) obj4).u2(((com.yandex.go.agreement.trackable.mvp.b) obj3).I);
                }
                return zy11Var;
            case 27:
                mc01 mc01Var = (mc01) obj;
                if (mc01Var == null) {
                    w511.b();
                    return null;
                }
                int i4 = hc01.a[mc01Var.a.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    yur.b((yur) obj4);
                } else {
                    if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                    yur.b((yur) obj3);
                }
                return zy11Var;
            case 28:
                View view = (View) obj;
                TransfersDashboardFragment transfersDashboardFragment = (TransfersDashboardFragment) obj4;
                com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.a access$getViewModel = TransfersDashboardFragment.access$getViewModel(transfersDashboardFragment);
                isGuidelinesWidgetFit = transfersDashboardFragment.isGuidelinesWidgetFit();
                pz40 Y2 = access$getViewModel.Y();
                while (true) {
                    r0 r0Var2 = (r0) Y2;
                    Object value4 = r0Var2.getValue();
                    boolean z4 = isGuidelinesWidgetFit;
                    if (r0Var2.k(value4, vv01.a((vv01) value4, null, null, false, false, isGuidelinesWidgetFit, 31))) {
                        if (!((ru01) access$getViewModel.G.b).a.a()) {
                            access$getViewModel.E.b(z4);
                        }
                        transfersDashboardFragment.safeDoOnLayout(view, new hv01((ha61) obj3, transfersDashboardFragment));
                        return zy11Var;
                    }
                    isGuidelinesWidgetFit = z4;
                }
            default:
                Object emit2 = ((vpr) obj4).emit(((sls) obj3).invoke(), continuation);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : zy11Var;
        }
    }
}

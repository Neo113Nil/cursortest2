package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.webkit.WebSettings;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.go.taxi.order.perf.session.a;
import com.yandex.go.xiva.domain.f;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupRecurrentWidgetShownState;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupRecurrentWidgetShownType;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.masstransit.overlay.d;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class jpx0 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jpx0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        TopupEvents$TopupRecurrentWidgetShownState topupEvents$TopupRecurrentWidgetShownState;
        TopupEvents$TopupRecurrentWidgetShownType topupEvents$TopupRecurrentWidgetShownType;
        BigDecimal amount;
        BigDecimal amount2;
        String paymentMethodId;
        switch (this.a) {
            case 0:
                ((ipx0) this.b).I9((hpx0) obj);
                return zy11.a;
            case 1:
                h6y0 h6y0Var = (h6y0) obj;
                a aVar = (a) this.b;
                aVar.getClass();
                if (h6y0Var.a != null && h6y0Var.c()) {
                    cfs cfsVar = aVar.c.b;
                    if (cfsVar != null) {
                        cfsVar.b(new lzu0(27, aVar, h6y0Var));
                    }
                    oa1 oa1Var = aVar.b;
                    List list = h6y0Var.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof wmk0) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        wmk0 wmk0Var = (wmk0) it.next();
                        RideCardPresentationType rideCardPresentationType = wmk0Var.d;
                        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint = wmk0Var.a;
                        int i = e6y0.a[rideCardPresentationType.ordinal()];
                        if (i == 1) {
                            oa1Var.getClass();
                            int i2 = d6y0.a[taxiOrderSessionCheckpoint.ordinal()];
                            if (i2 == 1) {
                                oa1Var.c("Perf.Screen.RideCardCompact.FirstContentfulPaint", h6y0Var, wmk0Var);
                            } else if (i2 == 2 || i2 == 3) {
                                oa1Var.e("Perf.Screen.RideCardCompact.LargestContentfulPaint", h6y0Var, wmk0Var);
                            }
                        } else if (i == 2) {
                            oa1Var.getClass();
                            int i3 = d6y0.a[taxiOrderSessionCheckpoint.ordinal()];
                            if (i3 == 1) {
                                oa1Var.c("Perf.Screen.RideCardDetails.FirstContentfulPaint", h6y0Var, wmk0Var);
                            } else if (i3 == 2 || i3 == 3) {
                                oa1Var.e("Perf.Screen.RideCardDetails.LargestContentfulPaint", h6y0Var, wmk0Var);
                            }
                        }
                    }
                    aVar.d.getClass();
                    a3y0.h(new String[]{"reportSession"});
                    hst hstVar = jst.e;
                }
                return zy11.a;
            case 2:
                return f.a((f) this.b, (ce51) obj, continuation);
            case 3:
                ((sqz0) this.b).c4((wi70) obj);
                return zy11.a;
            case 4:
                ym01 ym01Var = (ym01) obj;
                sh01 sh01Var = (sh01) this.b;
                em3 em3Var = sh01Var.a.q0;
                String str = ym01Var.a;
                int i4 = ym01Var.b;
                String str2 = sh01Var.b;
                LinkedHashMap w = g8e.w(3, "suggested_receivers", str);
                w.put("total_contacts", Integer.valueOf(i4));
                w.put("transfer_session_id", str2);
                em3Var.a.a("transfer.cross_border_by_phone.shown", w);
                zy11 zy11Var = zy11.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 5:
                ym01 ym01Var2 = (ym01) obj;
                xm01 xm01Var = (xm01) this.b;
                em3 em3Var2 = xm01Var.a.q0;
                String str3 = ym01Var2.a;
                int i5 = ym01Var2.b;
                String str4 = xm01Var.b;
                LinkedHashMap w2 = g8e.w(3, "suggested_receivers", str3);
                w2.put("total_contacts", Integer.valueOf(i5));
                w2.put("transfer_session_id", str4);
                em3Var2.a.a("transfer.phone.shown", w2);
                zy11 zy11Var2 = zy11.a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var2;
            case 6:
                mw3 mw3Var = (mw3) obj;
                z94 z94Var = ((com.ybsdk.feature.autotopup.internal.domain.a) this.b).b.b.o0;
                String str5 = mw3Var.b;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                String str7 = mw3Var.a;
                String str8 = mw3Var.c;
                Boolean bool = mw3Var.d;
                String str9 = null;
                if (jl40.l(bool, Boolean.TRUE)) {
                    topupEvents$TopupRecurrentWidgetShownState = TopupEvents$TopupRecurrentWidgetShownState.ON;
                } else if (jl40.l(bool, Boolean.FALSE)) {
                    topupEvents$TopupRecurrentWidgetShownState = TopupEvents$TopupRecurrentWidgetShownState.OFF;
                } else {
                    if (bool != null) {
                        w511.b();
                        return null;
                    }
                    topupEvents$TopupRecurrentWidgetShownState = null;
                }
                y1b1 y1b1Var = mw3Var.e;
                if (jl40.l(y1b1Var, bu3.a)) {
                    topupEvents$TopupRecurrentWidgetShownType = TopupEvents$TopupRecurrentWidgetShownType.LIMIT_EXACT;
                } else if (jl40.l(y1b1Var, cu3.a)) {
                    topupEvents$TopupRecurrentWidgetShownType = TopupEvents$TopupRecurrentWidgetShownType.LIMIT_FILL;
                } else if (jl40.l(y1b1Var, du3.a)) {
                    topupEvents$TopupRecurrentWidgetShownType = TopupEvents$TopupRecurrentWidgetShownType.REGULAR_PERIOD;
                } else {
                    if (y1b1Var != null) {
                        w511.b();
                        return null;
                    }
                    topupEvents$TopupRecurrentWidgetShownType = null;
                }
                String str10 = mw3Var.h;
                PaymentMethodInfoDto paymentMethodInfoDto = mw3Var.j;
                if (paymentMethodInfoDto != null && (paymentMethodId = paymentMethodInfoDto.getPaymentMethodId()) != null) {
                    str6 = paymentMethodId;
                }
                Money money = mw3Var.f;
                String plainString = (money == null || (amount2 = money.getAmount()) == null) ? null : amount2.toPlainString();
                Money money2 = mw3Var.g;
                if (money2 != null && (amount = money2.getAmount()) != null) {
                    str9 = amount.toPlainString();
                }
                LinkedHashMap w3 = g8e.w(9, "title", str5);
                if (str7 != null) {
                    w3.put("autoTopUpId", str7);
                }
                if (str8 != null) {
                    w3.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str8);
                }
                if (topupEvents$TopupRecurrentWidgetShownState != null) {
                    w3.put(ClidProvider.STATE, topupEvents$TopupRecurrentWidgetShownState.getOriginalValue());
                }
                if (topupEvents$TopupRecurrentWidgetShownType != null) {
                    w3.put("type", topupEvents$TopupRecurrentWidgetShownType.getOriginalValue());
                }
                if (str10 != null) {
                    w3.put("agreementId", str10);
                }
                w3.put("paymentMethodId", str6);
                if (plainString != null) {
                    w3.put("money", plainString);
                }
                if (str9 != null) {
                    w3.put("threshold", str9);
                }
                z94Var.a.a("topup.recurrent.widget_shown", w3);
                zy11 zy11Var3 = zy11.a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var3;
            case 7:
                f631 f631Var = (f631) obj;
                d dVar = (d) this.b;
                dVar.getClass();
                Bitmap bitmap = f631Var.b;
                g631 g631Var = f631Var.a;
                if (bitmap == null) {
                    bitmap = dVar.a(g631Var.a, g631Var.b);
                }
                dVar.e.put(g631Var, new t531(ImageProvider.fromBitmap(bitmap)));
                return zy11.a;
            case 8:
                gp41.g((WebSettings) this.b, (ThemeType) obj);
                return zy11.a;
            case 9:
                ((com.yandex.go.where_you_are.impl.presentation.d) this.b).b().setTranslationY(((Rect) obj).top - r9.b().getHeight());
                return zy11.a;
            default:
                ((YbDivView) this.b).setSpoilerEnabled(((Boolean) obj).booleanValue());
                zy11 zy11Var4 = zy11.a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var4;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 9:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new AdaptedFunctionReference(2, (ipx0) obj, ipx0.class, "render", "render(Lru/yandex/taxi/summary/topnotification/tariff_unavailable/model/TariffUnavailableNotificationModel;)V", 4);
            case 1:
                return new AdaptedFunctionReference(2, (a) obj, a.class, "reportSession", "reportSession(Lcom/yandex/go/taxi/order/perf/session/TaxiOrderSessionTimelineTracker$Session;)V", 4);
            case 2:
                return new FunctionReferenceImpl(2, (f) obj, f.class, "handleXivaPush", "handleXivaPush(Lcom/yandex/go/xiva/domain/model/XivaPushMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 3:
                return new AdaptedFunctionReference(2, (sqz0) obj, sqz0.class, "renderButton", "renderButton(Lru/yandex/taxi/design/button/OrderButtonModel;)V", 4);
            case 4:
                return new AdaptedFunctionReference(2, (sh01) obj, sh01.class, "logData", "logData(Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/domain/TransferPhoneAnalyticsInteractorBase$StateAnalyticsData;)V", 4);
            case 5:
                return new AdaptedFunctionReference(2, (xm01) obj, xm01.class, "logData", "logData(Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/domain/TransferPhoneAnalyticsInteractorBase$StateAnalyticsData;)V", 4);
            case 6:
                return new AdaptedFunctionReference(2, (com.ybsdk.feature.autotopup.internal.domain.a) obj, com.ybsdk.feature.autotopup.internal.domain.a.class, "logAutoTopupWidgetShown", "logAutoTopupWidgetShown(Lcom/ybsdk/feature/autotopup/api/domain/AutoTopupOffer;)V", 4);
            case 7:
                return new AdaptedFunctionReference(2, (d) obj, d.class, "handleImageResult", "handleImageResult(Lru/yandex/taxi/masstransit/overlay/VehicleVariantImageRepositoryImpl$ImageResult;)V", 4);
            case 8:
                return new AdaptedFunctionReference(2, (WebSettings) obj, gp41.class, "setDarkMode", "setDarkMode(Landroid/webkit/WebSettings;Lru/yandex/taxi/theme/ThemeType;)V", 5);
            case 9:
                return new AdaptedFunctionReference(2, (com.yandex.go.where_you_are.impl.presentation.d) obj, com.yandex.go.where_you_are.impl.presentation.d.class, "refreshBubblePosition", "refreshBubblePosition(Landroid/graphics/Rect;)V", 4);
            default:
                return new AdaptedFunctionReference(2, (YbDivView) obj, YbDivView.class, "setSpoilerEnabled", "setSpoilerEnabled(Z)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.style.URLSpan;
import android.view.View;
import androidx.compose.ui.tooling.PreviewActivity;
import com.squareup.wire.Message;
import com.squareup.wire.internal.ReflectionKt;
import com.yandex.go.navigator.rate_route.RateRouteModalView;
import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;
import com.yandex.go.taxi.order.rate.RateView;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.overlay.ReactionsView;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebView;
import com.yandex.plus.pay.inapp.google.internal.operation.f;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.qr.api.QrReaderContentInfo;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation.QrPaymentsSubscriptionFragment;
import com.ybsdk.rconfig.b;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.PlatformHelper$observeCallState$listener$1;
import ru.yandex.taxi.PlatformHelper$observeCallStateApi31$callback$1;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.component.RequiredAltChoiceComponentView;

/* loaded from: classes13.dex */
public final /* synthetic */ class agc0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ agc0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r3d0 loadingController_delegate$lambda$2;
        b450 nativePayButtonViewController_delegate$lambda$4;
        zy11 parameterizedContent$lambda$0$1$0$0;
        zy11 animateToNextKeyframe$lambda$1;
        String action;
        Uri parse;
        Deeplink e;
        zy11 renderButton$lambda$59;
        zy11 onViewCreated$lambda$20$lambda$19$lambda$18;
        View render$lambda$1;
        zy11 consumeSideEffect$lambda$21;
        TaxiMapView taxiMapView_delegate$lambda$0;
        zy11 renderDriverPhoneButton$lambda$0;
        Message.Builder createRuntimeMessageAdapter$lambda$0;
        BadgeView titleBadge_delegate$lambda$0;
        BaseDeeplinkAction baseDeeplinkAction = null;
        switch (this.a) {
            case 0:
                w040 w040Var = (w040) this.c;
                break;
            case 1:
                w040 w040Var2 = (w040) this.c;
                break;
            case 2:
                ((TelephonyManager) this.c).unregisterTelephonyCallback(te10.j((PlatformHelper$observeCallStateApi31$callback$1) this.b));
                break;
            case 3:
                ((TelephonyManager) this.c).listen((PlatformHelper$observeCallState$listener$1) this.b, 0);
                break;
            case 4:
                loadingController_delegate$lambda$2 = PlusHomeWebView.loadingController_delegate$lambda$2((PlusHomeWebView) this.c, (ppu) this.b);
                break;
            case 5:
                nativePayButtonViewController_delegate$lambda$4 = PlusHomeWebView.nativePayButtonViewController_delegate$lambda$4((PlusHomeWebView) this.c, (PlusSdkBrandType) this.b);
                break;
            case 6:
                ((w7d0) this.c).a.k(((URLSpan) this.b).getURL());
                break;
            case 7:
                wls wlsVar = (wls) this.c;
                PlusPayRichText.Item.Link link = (PlusPayRichText.Item.Link) this.b;
                wlsVar.invoke(link.getData(), link.getLink());
                break;
            case 8:
                xus xusVar = (xus) this.c;
                qxx0 qxx0Var = (qxx0) this.b;
                ((ney) xusVar.F).b(xusVar, new vb3(10, xusVar));
                xusVar.P(qxx0Var);
                break;
            case 9:
                qyj0 qyj0Var = (qyj0) this.c;
                rwe0 rwe0Var = (rwe0) this.b;
                if (!(qyj0Var instanceof hyj0)) {
                    if (!(qyj0Var instanceof kyj0)) {
                        w511.b();
                        break;
                    } else {
                        List a = a8a0.a((List) ((kyj0) qyj0Var).a);
                        rwe0Var.z.l(a);
                        ArrayList arrayList = new ArrayList(a);
                        rwe0Var.C = arrayList;
                        if (arrayList.size() == 1) {
                            rwe0Var.Y((PaymentMethod) a.P(rwe0Var.C), false);
                        } else {
                            rwe0Var.X();
                        }
                    }
                } else {
                    dy40 dy40Var = rwe0Var.A;
                    PaymentKitError paymentKitError = ((hyj0) qyj0Var).a;
                    xry0 xry0Var = yry0.a;
                    dy40Var.l(new kwe0(paymentKitError, yry0.a.o));
                }
                break;
            case 10:
                parameterizedContent$lambda$0$1$0$0 = PreviewActivity.setParameterizedContent$lambda$0$1$0$0((yx40) this.c, (Object[]) this.b);
                break;
            case 11:
                animateToNextKeyframe$lambda$1 = PrintAnimationTextView.animateToNextKeyframe$lambda$1((PrintAnimationTextView) this.c, (x2f0) this.b);
                break;
            case 12:
                ((f) this.c).d.remove((c0g0) this.b);
                break;
            case 13:
                b bVar = (b) this.c;
                a3h a3hVar = (a3h) this.b;
                QrReaderContentInfo info = bVar.h().getInfo();
                if (info != null && (action = info.getAction()) != null && (parse = Uri.parse(action)) != null && (e = w691.e(a3hVar, parse, true, null, false, 12)) != null) {
                    baseDeeplinkAction = e.getAction();
                }
                break;
            case 14:
                renderButton$lambda$59 = QrPaymentsMainFragment.renderButton$lambda$59((YbButtonView.a) this.c, (QrPaymentsMainFragment) this.b);
                break;
            case 15:
                onViewCreated$lambda$20$lambda$19$lambda$18 = QrPaymentsMainFragment.onViewCreated$lambda$20$lambda$19$lambda$18((QrPaymentsMainFragment) this.c, (t9g0) this.b);
                break;
            case 16:
                render$lambda$1 = QrPaymentsSubscriptionFragment.render$lambda$1((QrPaymentsSubscriptionFragment) this.c, (dma0) this.b);
                break;
            case 17:
                consumeSideEffect$lambda$21 = QrReaderFragment.consumeSideEffect$lambda$21((QrReaderFragment) this.c, (tcg0) this.b);
                break;
            case 18:
                taxiMapView_delegate$lambda$0 = RateRouteModalView.taxiMapView_delegate$lambda$0((Context) this.c, (RateRouteModalView) this.b);
                break;
            case 19:
                renderDriverPhoneButton$lambda$0 = RateView.renderDriverPhoneButton$lambda$0((RateView) this.c, (vim) this.b);
                break;
            case 20:
                bbi0 bbi0Var = (bbi0) this.c;
                ServerMessageRef serverMessageRef = (ServerMessageRef) this.b;
                bbi0Var.i.i(serverMessageRef.getTimestamp());
                bbi0Var.e.a(bbi0Var.c.a.a, serverMessageRef.getTimestamp());
                break;
            case 21:
                ebi0 ebi0Var = (ebi0) this.c;
                fbi0 fbi0Var = (fbi0) this.b;
                ReactionsView reactionsView = (ReactionsView) ebi0Var.a().findViewById(e9h0.reactions);
                reactionsView.setup(fbi0Var.a, fbi0Var.b);
                break;
            case 22:
                ((tls) this.c).invoke(((zgi0) this.b).e);
                break;
            case 23:
                createRuntimeMessageAdapter$lambda$0 = ReflectionKt.createRuntimeMessageAdapter$lambda$0((Class) this.c, (Class) this.b);
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                titleBadge_delegate$lambda$0 = RequiredAltChoiceComponentView.titleBadge_delegate$lambda$0((RequiredAltChoiceComponentView) this.c, (Context) this.b);
                break;
            case 27:
                ((tls) this.c).invoke(new ghj0((mhj0) this.b));
                break;
            case 28:
                ((com.yandex.go.taxi.order.controller.a) ((c29) this.c).b).h((l5k0) this.b);
                break;
            default:
                r7k0 r7k0Var = (r7k0) this.c;
                tls tlsVar = (tls) this.b;
                if (r7k0Var instanceof p7k0) {
                    tlsVar.invoke(g7k0.d);
                }
                break;
        }
        return zy11.a;
    }
}

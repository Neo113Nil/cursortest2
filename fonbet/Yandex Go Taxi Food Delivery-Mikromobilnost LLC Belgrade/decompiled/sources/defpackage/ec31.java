package defpackage;

import android.R;
import android.app.DownloadManager;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.fintechsdk.features.webview.internal.presentation.b;
import com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.places.organization.card.impl.ui.card.flex.actions.web_custom_tabs.a;
import com.yandex.go.taxi.experiments.BadgeDto;
import com.yandex.go.taxi.experiments.BoldVerticalsDesignDto;
import com.yandex.go.taxi.experiments.ShadowDto;
import com.yandex.go.taxi.experiments.VerticalSelectorSettingsExperiment;
import com.yandex.go.taxi.experiments.VerticalSettingsDto;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.taxi.summary.verticalsummary.router.c;
import com.yandex.go.taxi.summary.verticalsummary.router.d;
import com.yandex.go.walking.navigation.impl.guidance.e;
import com.yandex.go.walking.navigation.impl.guidance.service.WalkNavGuidanceService;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import com.yandex.mapkit.styling.transportnavigation.TransportNavigationStyleProvider;
import com.yandex.messaging.input.voice.record.VoiceRecordControllerProvider;
import com.yandex.messaging.input.voice.record.api.VoiceRecordController;
import com.yandex.mobile.drive.uikit.window.DecorationColor;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.runtime.image.ImageProvider;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.f;
import ru.yandex.taxi.web.deeplink.m;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ec31 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ec31(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [kdc] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [kdc] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [kdc] */
    /* JADX WARN: Type inference failed for: r15v2 */
    @Override // defpackage.sls
    public final Object invoke() {
        int shownItemsDelegate$lambda$0;
        BoldVerticalsDesignDto boldVerticalsDesignDto;
        ShadowDto shadowDto;
        ShadowDto shadowDto2;
        ShadowDto shadowDto3;
        String str;
        String str2;
        VoiceRecordController pluginProbe;
        w241 presenter_delegate$lambda$0;
        rwo eventReporter_delegate$lambda$0;
        b viewModel_delegate$lambda$0;
        com.yandex.fintechsdk.features.webview.payment.internal.presentation.b viewModel_delegate$lambda$02;
        zy11 openSourcePicker$lambda$1;
        String locale;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str3 = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                shownItemsDelegate$lambda$0 = VerticalHubV1ModalView.shownItemsDelegate$lambda$0((VerticalHubV1ModalView) obj);
                return Integer.valueOf(shownItemsDelegate$lambda$0);
            case 1:
                return (ksd) ((qc31) obj).L.get();
            case 2:
                return (ksd) ((dd31) obj).c0.get();
            case 3:
                return new c((d) obj);
            case 4:
                ((f) obj).p1.run();
                return zy11Var;
            case 5:
                q qVar = (q) obj;
                yp2 yp2Var = qVar.b;
                pdc pdcVar = qVar.a;
                VerticalSelectorSettingsExperiment verticalSelectorSettingsExperiment = (VerticalSelectorSettingsExperiment) qVar.c.b();
                if (!verticalSelectorSettingsExperiment.b || (boldVerticalsDesignDto = verticalSelectorSettingsExperiment.f) == null) {
                    return null;
                }
                Map map = boldVerticalsDesignDto.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    BadgeDto badgeDto = ((VerticalSettingsDto) entry.getValue()).a;
                    String str4 = badgeDto != null ? badgeDto.a : null;
                    if (str4 != null && d6z.Z(verticalSelectorSettingsExperiment, str4)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    BadgeDto badgeDto2 = ((VerticalSettingsDto) entry2.getValue()).a;
                    String str5 = badgeDto2 != null ? badgeDto2.a : str3;
                    if (str5 == null) {
                        str5 = "";
                    }
                    linkedHashMap2.put(key, new vl4(d6z.Y(verticalSelectorSettingsExperiment, str5), (badgeDto2 == null || (str2 = badgeDto2.b) == null) ? str3 : ((ufu) pdcVar).i(str2), yp2Var.a(badgeDto2 != null ? badgeDto2.b : str3, AppColor$Palette.Text), (badgeDto2 == null || (str = badgeDto2.c) == null) ? str3 : ((ufu) pdcVar).e(str), yp2Var.a(badgeDto2 != null ? badgeDto2.c : str3, AppColor$Palette.Background), (badgeDto2 == null || (shadowDto3 = badgeDto2.d) == null) ? str3 : ((ufu) pdcVar).e(shadowDto3.a), ly3.g(up2.b, yp2Var, (badgeDto2 == null || (shadowDto2 = badgeDto2.d) == null) ? str3 : shadowDto2.a), (badgeDto2 == null || (shadowDto = badgeDto2.d) == null) ? null : Float.valueOf(shadowDto.b), badgeDto2 != null ? badgeDto2.e : null));
                    str3 = null;
                }
                return new g86(linkedHashMap2);
            case 6:
                qr31 qr31Var = (qr31) obj;
                View inflate = LayoutInflater.from(qr31Var.a.getContext()).inflate(bsh0.view_group_tooltip, (ViewGroup) null, false);
                int i2 = cgh0.action_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate);
                if (appCompatImageView != null) {
                    i2 = cgh0.tooltip_content;
                    AccessibilityLiveRegionTextView accessibilityLiveRegionTextView = (AccessibilityLiveRegionTextView) cma1.O(i2, inflate);
                    if (accessibilityLiveRegionTextView != null) {
                        BubbleComponent bubbleComponent = (BubbleComponent) inflate;
                        nr31 nr31Var = new nr31(bubbleComponent, appCompatImageView, accessibilityLiveRegionTextView);
                        bubbleComponent.setDecorator(qr31Var.c);
                        bubbleComponent.setVisibility(8);
                        return nr31Var;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 7:
                pmm0 pmm0Var = (pmm0) ((mj31) obj).b;
                return Boolean.valueOf(pmm0Var.e == PlusSdkBrandType.YANDEX && ffx.K(((vt20) ((xt20) pmm0Var.x.a.a())).s));
            case 8:
                pluginProbe = ((VoiceRecordControllerProvider) obj).pluginProbe();
                return pluginProbe;
            case 9:
                ((e) obj).U(e341.a, false);
                return zy11Var;
            case 10:
                presenter_delegate$lambda$0 = WalkNavGuidanceService.presenter_delegate$lambda$0((WalkNavGuidanceService) obj);
                return presenter_delegate$lambda$0;
            case 11:
                return new TransportNavigationStyleProvider(((h441) obj).a);
            case 12:
                return ImageProvider.fromBitmap(u8b1.h(vwg0.walk_nav_user_location_arrow, ((mgc0) obj).b));
            case 13:
                return ((a) obj).a;
            case 14:
                return ((x2d0) obj).c.b();
            case 15:
                return (DownloadManager) ((mo41) obj).a.getSystemService("download");
            case 16:
                eventReporter_delegate$lambda$0 = WebViewFragment.eventReporter_delegate$lambda$0((WebViewFragment) obj);
                return eventReporter_delegate$lambda$0;
            case 17:
                viewModel_delegate$lambda$0 = com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment.viewModel_delegate$lambda$0((com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment) obj);
                return viewModel_delegate$lambda$0;
            case 18:
                return ((m) obj).E.a();
            case 19:
                viewModel_delegate$lambda$02 = WebViewPaymentFragment.viewModel_delegate$lambda$0((WebViewPaymentFragment) obj);
                return viewModel_delegate$lambda$02;
            case 20:
                mm91 mm91Var = ((hu41) ((com.ybsdk.feature.webview.internal.presentation.b) obj).X()).b;
                if (mm91Var instanceof eu41) {
                    eu41 eu41Var = (eu41) mm91Var;
                    return new lu41(eu41Var.b, eu41Var.c);
                }
                if (mm91Var instanceof fu41) {
                    return new mu41(((fu41) mm91Var).b, false);
                }
                if (mm91Var.equals(gu41.b)) {
                    return nu41.a;
                }
                w511.b();
                return null;
            case 21:
                hmd0 c = ((com.yandex.plus.home.feature.webviews.internalapi.factory.a) obj).a.k.a.c();
                if (c != null) {
                    return c.a();
                }
                return null;
            case 22:
                ((bw41) obj).a();
                return zy11Var;
            case 23:
                openSourcePicker$lambda$1 = WhereYouAreModalView.openSourcePicker$lambda$1((WhereYouAreModalView) obj);
                return openSourcePicker$lambda$1;
            case 24:
                c051 c051Var = (c051) obj;
                x08 x08Var = c051Var.c;
                if (x08Var != null) {
                    x08Var.cancel();
                }
                c051Var.c = null;
                return zy11Var;
            case 25:
                h651 h651Var = (h651) obj;
                try {
                    TypedValue typedValue = h651Var.c;
                    if (h651Var.b.getTheme().resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                        return typedValue.data == 0 ? DecorationColor.Transparent : DecorationColor.SemiTransparent;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                } catch (IllegalArgumentException unused) {
                    return DecorationColor.SemiTransparent;
                }
            case 26:
                tk51 tk51Var = (tk51) obj;
                int i3 = yyg0.ic_address_search;
                int i4 = mqg0.component_red_toxic;
                Drawable a = tk51Var.a(i3);
                if (a == null) {
                    return null;
                }
                Drawable mutate = a.mutate();
                mutate.setTint(((avj0) tk51Var.a).a(i4));
                return mutate;
            case 27:
                Locale locale2 = (Locale) obj;
                return (locale2 == null || (locale = locale2.toString()) == null) ? Locale.getDefault().toString() : locale;
            case 28:
                fs51 fs51Var = (fs51) obj;
                return v4r0.i(fs51Var.d, fs51Var.f);
            default:
                return (com.yandex.go.yb.c) ((dv51) obj).b.get();
        }
    }
}

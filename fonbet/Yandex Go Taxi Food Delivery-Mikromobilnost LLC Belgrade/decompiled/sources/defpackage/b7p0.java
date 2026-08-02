package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.compose.foundation.c;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawableImpl;
import com.yandex.go.sdk_registry.b;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.messaging.input.f;
import com.yandex.payment.sdk.flex.impl.extensions.shimmer.ShimmerDrawable;
import com.yandex.plus.home.feature.webviews.internalapi.factory.a;
import com.ybsdk.feature.divkit.internal.ui.DivActionsView;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view.SelectorListView;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.contacts.SelectContactMvpView;
import ru.yandex.taxi.contacts.d;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.favorites.rides.settings_modal.ui.SettingsModalView;
import ru.yandex.taxi.sdc.router.e;
import ru.yandex.taxi.widget.SearchProgressBar;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes6.dex */
public final /* synthetic */ class b7p0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7p0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 stopAndHide$lambda$0;
        qa3 selectorsAdapter_delegate$lambda$0;
        View insetsType$lambda$0;
        Shader shaderState$lambda$0;
        Interpolator defaultInterpolator_delegate$lambda$0;
        Interpolator defaultInterpolator_delegate$lambda$02;
        Interpolator defaultInterpolator_delegate$lambda$1;
        SlideableModalView onAttachedToWindow$lambda$1;
        int i = this.a;
        int i2 = 9;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e7p0 e7p0Var = (e7p0) obj;
                View inflate = LayoutInflater.from(e7p0Var.a.getContext()).inflate(vjh0.scooters_vehicle_actual_photo_tooltip, (ViewGroup) null, false);
                int i3 = k7h0.tooltip_content;
                AccessibilityLiveRegionTextView accessibilityLiveRegionTextView = (AccessibilityLiveRegionTextView) cma1.O(i3, inflate);
                if (accessibilityLiveRegionTextView == null) {
                    ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    return null;
                }
                BubbleComponent bubbleComponent = (BubbleComponent) inflate;
                a7p0 a7p0Var = new a7p0(bubbleComponent, accessibilityLiveRegionTextView);
                bubbleComponent.setDecorator(e7p0Var.b);
                bubbleComponent.setVisibility(8);
                return a7p0Var;
            case 1:
                xz4 xz4Var = (xz4) obj;
                return xz4Var.j(xz4Var.a);
            case 2:
                ujp0 ujp0Var = (ujp0) obj;
                i92 i92Var = (i92) npb1.c(ujp0Var, m290.a);
                ujp0Var.F = i92Var;
                ujp0Var.G = i92Var != null ? new c(i92Var.a, i92Var.b, i92Var.c, i92Var.d) : null;
                return zy11Var;
            case 3:
                ((e) obj).m.l(null);
                return zy11Var;
            case 4:
                return (a) ((ru.yandex.taxi.plus.sdk.modal.a) obj).c.get();
            case 5:
                b bVar = (b) obj;
                return new com.yandex.go.sdk_registry.a(bVar.b, bVar.c);
            case 6:
                com.yandex.go.sdk_registry.c cVar = (com.yandex.go.sdk_registry.c) obj;
                return new com.yandex.go.sdk_registry.a(cVar.b, cVar.c);
            case 7:
                stopAndHide$lambda$0 = SearchProgressBar.stopAndHide$lambda$0((SearchProgressBar) obj);
                return stopAndHide$lambda$0;
            case 8:
                a7q0 a7q0Var = (a7q0) obj;
                p1b p1bVar = a7q0Var.b;
                try {
                    p1bVar.p();
                    p1bVar.o(a7q0Var.d);
                    return zy11Var;
                } catch (Exception e) {
                    a7q0Var.a.failVerifyIntegrity(e);
                    throw e;
                }
            case 9:
                d dVar = (d) obj;
                dVar.F = false;
                ((SelectContactMvpView) dVar.Dg()).g0();
                dVar.Rg((SelectContactMvpView) dVar.Dg());
                return zy11Var;
            case 10:
                selectorsAdapter_delegate$lambda$0 = SelectorListView.selectorsAdapter_delegate$lambda$0((SelectorListView) obj);
                return selectorsAdapter_delegate$lambda$0;
            case 11:
                ((bkv) obj).r(new qu(i2));
                return zy11Var;
            case 12:
                return (dw) ((yvf0) ((bpw) obj).b).get();
            case 13:
                ((f) obj).d();
                return zy11Var;
            case 14:
                return (dw) ((com.yandex.go.morphlex.action.select_due.b) obj).a.get();
            case 15:
                return (dw) ((com.yandex.go.morphlex.action.route_address.c) obj).a.get();
            case 16:
                insetsType$lambda$0 = SettingsModalView.insetsType$lambda$0((SettingsModalView) obj);
                return insetsType$lambda$0;
            case 17:
                ((gdr0) obj).r(new qu(i2));
                return zy11Var;
            case 18:
                ((com.yandex.go.settings.domain.a) obj).l.b(false);
                return zy11Var;
            case 19:
                t8j0 t8j0Var = new t8j0();
                ((com.ybsdk.feature.settings.internal.screens.settings.domain.a) obj).a();
                return new wdr0(t8j0Var, EmptySet.a, null, null, false, null, null, null, null, null, false, true);
            case 20:
                shaderState$lambda$0 = ShaderBrushSpan.shaderState$lambda$0((ShaderBrushSpan) obj);
                return shaderState$lambda$0;
            case 21:
                fcj0 fcj0Var = (fcj0) obj;
                Context context = (Activity) fcj0Var.b;
                if (context == null) {
                    context = (Context) fcj0Var.a;
                }
                return b64.j(context.getPackageName(), ".flutter.share_provider");
            case 22:
                defaultInterpolator_delegate$lambda$0 = ShimmerDrawable.defaultInterpolator_delegate$lambda$0((ShimmerDrawable) obj);
                return defaultInterpolator_delegate$lambda$0;
            case 23:
                defaultInterpolator_delegate$lambda$02 = com.yandex.payment.sdk.transportcards.ui.ShimmerDrawable.defaultInterpolator_delegate$lambda$0((com.yandex.payment.sdk.transportcards.ui.ShimmerDrawable) obj);
                return defaultInterpolator_delegate$lambda$02;
            case 24:
                defaultInterpolator_delegate$lambda$1 = ShimmerDrawableImpl.defaultInterpolator_delegate$lambda$1((ShimmerDrawableImpl) obj);
                return defaultInterpolator_delegate$lambda$1;
            case 25:
                com.yandex.go.taxi.main.shortcuts.ui.modalview.d dVar2 = (com.yandex.go.taxi.main.shortcuts.ui.modalview.d) obj;
                RotatableFloatButton rotatableFloatButton = dVar2.o;
                if (rotatableFloatButton != null) {
                    rotatableFloatButton.setVisibilityAnimated(false);
                }
                qr31 qr31Var = dVar2.l;
                if (qr31Var != null) {
                    qr31Var.a();
                }
                return zy11Var;
            case 26:
                onAttachedToWindow$lambda$1 = ShortcutsMainScreen.onAttachedToWindow$lambda$1((ShortcutsMainScreen) obj);
                return onAttachedToWindow$lambda$1;
            case 27:
                return (DivActionsView) obj;
            case 28:
                return ((com.yandex.go.places.organization.card.impl.ui.card.flex.actions.favourites.a) obj).a;
            default:
                return ((com.yandex.go.vault.flexsdk.descriptors.widget.actions.b) obj).b;
        }
    }
}

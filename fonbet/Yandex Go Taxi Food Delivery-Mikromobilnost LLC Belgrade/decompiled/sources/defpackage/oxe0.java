package defpackage;

import android.widget.TextView;
import androidx.camera.camera2.internal.x;
import androidx.camera.core.g;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.e;
import androidx.camera.video.f;
import androidx.camera.video.k;
import com.yandex.go.navigator.rate_route.RateRouteModalView;
import com.yandex.go.taxi.order.map.overlay.recenter.b;
import com.yandex.messaging.internal.view.timeline.QuoteTextSelectionCallback;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import com.ybsdk.feature.main.internal.widgets.gradient.ProductsV4GradientView;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import java.util.Objects;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.preorder.mainscreen.redirect.RedirectModalView;
import ru.yandex.taxi.requirements.modal.RequirementInfoModalView;
import ru.yandex.taxi.requirements.ui.RequirementOptionDetailsView;
import ru.yandex.taxi.settings.presentation.menu_item.PushDisabledMenuItem;
import ru.yandex.taxi.settings.presentation.settings.PushSettingsView;
import ru.yandex.taxi.settings.presentation.settings.a;
import ru.yandex.taxi.settings.presentation.system_disabled.PushSystemDisabledView;
import ru.yandex.taxi.ui.form.RequirementAddressFormModalView;
import ru.yandex.video.m3.previews.PreviewsManagerImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class oxe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oxe0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((g) obj).s();
                break;
            case 1:
                ((PreviewsManagerImpl.PlayerObserverImpl) obj).startFetchRawThumbnailsInfoIfNeededOnPlayerThread();
                break;
            case 2:
                ((d0f0) obj).invoke();
                break;
            case 3:
                ((d0f0) obj).invoke();
                break;
            case 4:
                ((d0f0) obj).invoke();
                break;
            case 5:
                sgb1.g(3, "ProcessingCaptureSession");
                ((x) obj).a.c();
                break;
            case 6:
                ProductsFragment.renderViewStateContent$lambda$28$lambda$26((r761) obj);
                break;
            case 7:
                ((ProductsV4GradientView) obj).startGradientAnimation();
                break;
            case 8:
                qlf0 qlf0Var = (qlf0) obj;
                TextView textView = qlf0Var.a;
                TextView textView2 = qlf0Var.b;
                int lineCount = textView.getLineCount();
                if (lineCount == 1) {
                    textView2.setMaxLines(2);
                    break;
                } else if (lineCount == 2) {
                    textView2.setMaxLines(1);
                    break;
                }
                break;
            case 9:
                ((wmf0) obj).n5();
                break;
            case 10:
                ((inf0) ((ymf0) obj).Dg()).goBack();
                break;
            case 11:
                PushDisabledMenuItem._init_$onItemClicked((l1g0) obj);
                break;
            case 12:
                PushSettingsView.setupToolbar$navigateBack((a) obj);
                break;
            case 13:
                PushSystemDisabledView._init_$openNotificationSettings((w4g0) obj);
                break;
            case 14:
                ((h5g0) obj).b();
                break;
            case 15:
                QrReaderFragment.onResume$lambda$20((QrReaderFragment) obj);
                break;
            case 16:
                QuoteTextSelectionCallback.onDestroyActionMode$lambda$1((QuoteTextSelectionCallback) obj);
                break;
            case 17:
                f7i0 f7i0Var = (f7i0) obj;
                long j = f7i0Var.d;
                if (j != 0) {
                    f7i0Var.a(j - 1);
                    break;
                }
                break;
            case 18:
                RateRouteModalView.lambda$0$onDoneClicked((p7i0) obj);
                break;
            case 19:
                rai0 rai0Var = ((sai0) obj).b;
                if (rai0Var != null) {
                    rai0Var.r();
                    break;
                }
                break;
            case 20:
                mtg mtgVar = (mtg) obj;
                boolean a = mtgVar.a(RecenterType.USER_LOCATION);
                boolean a2 = mtgVar.a(RecenterType.ALL_ROUTE);
                b bVar = (b) mtgVar.c;
                he61 he61Var = bVar.h;
                float j2 = ((gh00) bVar.b).j();
                if (Math.abs(j2 - he61Var.e) > 0.3f) {
                    if (he61Var.e == -1.0f) {
                        he61Var.e = j2;
                    }
                    String str = j2 > he61Var.e ? "zoom_in" : "zoom_out";
                    he61Var.e = j2;
                    he61Var.a.b(str, Boolean.valueOf(a), Boolean.valueOf(a2));
                }
                if (a != he61Var.c || a2 != he61Var.d) {
                    he61Var.c = a;
                    he61Var.d = a2;
                    he61Var.a.b(null, Boolean.valueOf(a), Boolean.valueOf(a2));
                    break;
                }
                break;
            case 21:
                oii0 oii0Var = ((f) obj).b;
                if (!oii0Var.d) {
                    sgb1.g(3, "Recorder");
                    znw0 znw0Var = oii0Var.a;
                    Timebase timebase = oii0Var.b;
                    androidx.camera.video.g gVar = oii0Var.g;
                    Objects.toString(gVar.G);
                    sgb1.g(3, "Recorder");
                    k kVar = gVar.e0;
                    kVar.a();
                    ni91.g(kVar.j).c(new e(oii0Var, znw0Var, timebase), gVar.d);
                    break;
                }
                break;
            case 22:
                rji0 rji0Var = (rji0) obj;
                rji0Var.g = false;
                rji0Var.b();
                break;
            case 23:
                RedirectModalView.onAttachedToWindow$lambda$0((RedirectModalView) obj);
                break;
            case 24:
                ((v1j0) obj).h();
                break;
            case 25:
                ((s2j0) obj).h();
                break;
            case 26:
                RequirementAddressFormModalView.onAttachedToWindow$lambda$0((RequirementAddressFormModalView) obj);
                break;
            case 27:
                ((RequirementInfoModalView) obj).dismiss();
                break;
            case 28:
                ((xmf0) obj).run();
                break;
            default:
                RequirementOptionDetailsView.infoIconView$lambda$0$infoButtonClicked((hjj0) obj);
                break;
        }
    }
}

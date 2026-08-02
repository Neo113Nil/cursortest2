package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.processing.SurfaceProcessorNode$Out;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.flex.main_screen.presentation.divkit.azimuth.SuperappAzimuthRotatableIconView;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.e;
import com.yandex.go.mainscreen.superapp.popup.presentation.SuperAppMainScreenPopupView;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView;
import com.yandex.go.tariffcard.ui.view.TariffCardScrollButtonView;
import com.yandex.go.taxi.order.support.ui.details.SupportDetailsModalView;
import com.yandex.go.taxi.order.support.ui.support_menu.SupportMenuModalView;
import com.yandex.go.taxi.summary.ui.TariffPopupModalView;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.superapp.chat.a;
import ru.yandex.taxi.superapp.chat.view.SuperAppChatView;
import ru.yandex.taxi.surge.dialog.feedback_sent.SurgeFeedbackSentModalView;
import ru.yandex.taxi.surge.dialog.price_complain.SurgePriceComplainModalView;
import ru.yandex.taxi.surge.modal.SurgeShortcutModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProviderImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class lnv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lnv0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((mnv0) obj).g.b(new byx(Screen.SUMMARY, new c430(Mode.NORMAL, (b) null, (un0) null)));
                return;
            case 1:
                a aVar = (a) obj;
                ((d2x0) aVar.G).b(qoi0.a(a.class));
                aVar.r(new qu(9));
                return;
            case 2:
                SuperAppChatView._init_$lambda$0((SuperAppChatView) obj);
                return;
            case 3:
                SuperAppMainOnboardingView.initTextView$lambda$2((RobotoTextView) obj);
                return;
            case 4:
                ((ogu0) obj).invoke();
                return;
            case 5:
                SuperAppMainScreenFlexModalView.myLocationButton_delegate$lambda$0$0$onMyLocationClicked((e) obj);
                return;
            case 6:
                ((xlp0) obj).invoke();
                return;
            case 7:
                ((xlp0) obj).invoke();
                return;
            case 8:
                ((SuperAppMainScreenPopupView) obj).shadowAnimation = null;
                return;
            case 9:
                ((SuperappAzimuthRotatableIconView) obj).finishIntro();
                return;
            case 10:
                ((SupportDetailsModalView) obj).onBackPressed();
                return;
            case 11:
                SupportDetailsModalView.onAttachedToWindow$onTouchOutside((ejw0) obj);
                return;
            case 12:
                ((SupportMenuModalView) obj).onBackPressed();
                return;
            case 13:
                SupportMenuModalView.onAttachedToWindow$onTouchOutside((rjw0) obj);
                return;
            case 14:
                SurfaceProcessorNode$Out surfaceProcessorNode$Out = (SurfaceProcessorNode$Out) ((cjw0) obj).c;
                if (surfaceProcessorNode$Out != null) {
                    Iterator<enw0> it = surfaceProcessorNode$Out.values().iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                    return;
                }
                return;
            case 15:
                ((CountDownLatch) obj).countDown();
                return;
            case 16:
                ((androidx.camera.view.e) obj).a();
                return;
            case 17:
                SurgeFeedbackSentModalView._init_$closeClick((ipw0) obj);
                return;
            case 18:
                SurgePriceComplainModalView._init_$closeClick((wuw0) obj);
                return;
            case 19:
                SurgeShortcutModalView._init_$lambda$0((SurgeShortcutModalView) obj);
                return;
            case 20:
                d1x0 d1x0Var = (d1x0) obj;
                d1x0Var.g(d1x0Var);
                return;
            case 21:
                e1x0 e1x0Var = (e1x0) obj;
                e1x0.o();
                d6z.v(e1x0Var.f, "Need to call openCaptureSession before using this API.");
                u uVar = e1x0Var.b;
                synchronized (uVar.b) {
                    uVar.d.add(e1x0Var);
                }
                ((CameraCaptureSession) ((hh5) e1x0Var.f.b).b).close();
                e1x0Var.c.execute(new lnv0(20, e1x0Var));
                return;
            case 22:
                View view = ((androidx.core.view.insets.a) obj).a;
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                    return;
                }
                return;
            case 23:
                ((SystemMediaVolumeProviderImpl) obj).updateSystemVolume();
                return;
            case 24:
                TariffCardScrollButtonView.hide$lambda$0((TariffCardScrollButtonView) obj);
                return;
            case 25:
                Object obj2 = (u45) obj;
                OneShotPreDrawListener.add((View) obj2, new h3s0(4, obj2));
                return;
            case 26:
                mkx0 mkx0Var = (mkx0) obj;
                if (mkx0Var.j0 || !mkx0Var.k0) {
                    return;
                }
                mkx0Var.j0 = true;
                mkx0Var.r(new bkx0(3));
                return;
            case 27:
                ((TariffPopupModalView) obj).dismiss();
                return;
            case 28:
                ((ys0) obj).invoke();
                return;
            default:
                ((cne0) ((u49) ((hrx0) obj).y).a.b).u("ru.yandex.taxi.cashback.onboarding.CASHBACK_FOR_TRIP_SHOWED", true);
                return;
        }
    }
}

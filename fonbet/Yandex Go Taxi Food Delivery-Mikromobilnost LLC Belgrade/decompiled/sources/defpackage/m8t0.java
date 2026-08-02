package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.yandex.go.payments.summary.domain.f;
import com.yandex.go.preorder.address.e;
import com.yandex.go.preorder.map.a;
import com.yandex.go.preorder.map.b;
import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.something_wrong_screen.ui.SomethingWrongScreenModalView;
import java.util.HashMap;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.preorder.source.SourcePointFragment;
import ru.yandex.taxi.preorder.source.domain.p;
import ru.yandex.taxi.preorder.summary.tariffpage.badge.i;
import ru.yandex.taxi.stories.presentation.story.StoryTopView;
import ru.yandex.taxi.summary.requirements.list.ui.SpecialNeedsModalView;
import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.video.m3.player.impl.utils.observable.StatefulProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class m8t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m8t0(xrt0 xrt0Var, qrt0 qrt0Var) {
        this.a = 17;
        this.b = xrt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View focusedExpandedView;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((SomethingWrongScreenModalView) obj).onBackPressed();
                break;
            case 1:
                ((e) obj).v.b();
                break;
            case 2:
                ((p) obj).b();
                break;
            case 3:
                SourceDestinationComponent.applyRouteTime$lambda$0((SourceDestinationComponent) obj);
                break;
            case 4:
                SourcePointFragment.onViewCreated$lambda$0((SourcePointFragment) obj);
                break;
            case 5:
                SourcePointFragment.onViewCreated$onSplashFadeOut((eht0) obj);
                break;
            case 6:
                ((xvw) ((b) obj).g.get()).a();
                break;
            case 7:
                fgt0 fgt0Var = (fgt0) ((egt0) ((ru.yandex.taxi.preorder.source.mode.interactor.e) obj).l.get());
                if (!fgt0Var.f.f) {
                    f0l0 f0l0Var = fgt0Var.g;
                    SourcePointMode sourcePointMode = SourcePointMode.ROUTE;
                    boolean k = sourcePointMode.k();
                    boolean w = sourcePointMode.w();
                    a aVar = (a) f0l0Var;
                    aVar.getClass();
                    aVar.b(new ohk0(12, aVar), k, w);
                    break;
                }
                break;
            case 8:
                ((cft0) ((l7s0) obj).a).e.g();
                break;
            case 9:
                ((rgt0) obj).a.g();
                break;
            case 10:
                ((vgt0) obj).v2();
                break;
            case 11:
                ygt0 ygt0Var = (ygt0) obj;
                pzt0 pzt0Var = ygt0Var.J;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                ((gh00) ygt0Var.z).u(ygt0Var.K);
                ((wgt0) ygt0Var.Dg()).pause();
                break;
            case 12:
                kjt0 kjt0Var = (kjt0) obj;
                kjt0Var.e.g();
                kjt0Var.g.a();
                break;
            case 13:
                SpecialNeedsModalView.onAttachedToWindow$onConfirmClick((vot0) obj);
                break;
            case 14:
                SpecialNeedsModalView.onAttachedToWindow$lambda$0((SpecialNeedsModalView) obj);
                break;
            case 15:
                rpt0 rpt0Var = (rpt0) obj;
                f fVar = rpt0Var.j;
                if (fVar != null) {
                    fVar.i();
                    rpt0Var.j = null;
                    break;
                }
                break;
            case 16:
                ((SphericalGLSurfaceView) obj).lambda$onDetachedFromWindow$0();
                break;
            case 17:
                androidx.core.splashscreen.a aVar2 = ((xrt0) obj).a;
                aVar2.b().bringToFront();
                aVar2.c();
                break;
            case 18:
                ((uxt0) obj).i();
                break;
            case 19:
                ((a5u0) obj).a(x4u0.a);
                break;
            case 20:
                StatefulProvider.notifyObservers$lambda$1((StatefulProvider) obj);
                break;
            case 21:
                kdu0 kdu0Var = (kdu0) obj;
                xo3 xo3Var = kdu0Var.x;
                if (xo3Var != null) {
                    xo3Var.cancel();
                    kdu0Var.x = null;
                    break;
                }
                break;
            case 22:
                udu0 udu0Var = (udu0) obj;
                ValueAnimator valueAnimator = udu0Var.a;
                ValueAnimator valueAnimator2 = udu0Var.b;
                if (!valueAnimator2.isRunning() && udu0Var.c != 0) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                        valueAnimator2.setCurrentPlayTime((udu0Var.c * 500) / 255);
                    }
                    valueAnimator2.start();
                    break;
                }
                break;
            case 23:
                ((da0) obj).r(new x8t0(21));
                break;
            case 24:
                StoryTopView._init_$lambda$0((StoryTopView) obj);
                break;
            case 25:
                ((j61) obj).O();
                break;
            case 26:
                piv0 piv0Var = (piv0) obj;
                piv0Var.k = piv0Var.c.b();
                break;
            case 27:
                i iVar = (i) obj;
                dkx0 dkx0Var = iVar.c;
                ubx0 ubx0Var = dkx0Var.e;
                String str = ((a7t0) dkx0Var.b).a().b;
                o7r0 o7r0Var = ubx0Var.a;
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put("summary_state", str);
                }
                o7r0Var.a.a("TariffCard.Payment", hashMap, 1, new HashMap());
                iVar.d.a();
                break;
            case 28:
                focusedExpandedView = ((g7t0) obj).b.getFocusedExpandedView();
                if (focusedExpandedView != null) {
                    View findViewById = focusedExpandedView.findViewById(xfh0.tariff_card_scroll_view);
                    if (findViewById instanceof NestedScrollViewAdvanced) {
                        ((NestedScrollViewAdvanced) findViewById).fullScroll(130);
                        break;
                    }
                }
                break;
            default:
                SummaryPromotionModalWindowsModalView.onAttachedToWindow$lambda$0((SummaryPromotionModalWindowsModalView) obj);
                break;
        }
    }

    public /* synthetic */ m8t0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

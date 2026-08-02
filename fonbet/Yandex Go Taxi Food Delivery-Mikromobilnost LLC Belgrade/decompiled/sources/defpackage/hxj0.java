package defpackage;

import android.os.HandlerThread;
import androidx.compose.material.ripple.RippleHostView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.navigator.route_stops.RouteStopsModalView;
import com.yandex.go.payments.sbp.ui.home.SbpHomeModalView;
import com.yandex.go.payments.shared.wizard.accountsaving.b;
import com.yandex.go.safety.center.contacts.SafetyCenterAddContactView;
import com.yandex.go.safety.center.contacts.SafetyCenterContactsView;
import com.yandex.go.safety.center.instructions.web.SafetyCenterWebInstructionsView;
import com.yandex.go.safety.center.main.SafetyCenterMainView;
import com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorView;
import com.yandex.go.scooters.misc.action_dialog.ScootersActionDialogModalView;
import com.yandex.go.scooters.passes.active.ScootersActivePassesModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardAiBubbleView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.navigation.a;
import com.yandex.mobile.drive.scan.ui.c;
import com.yandex.payment.sdk.ui.common.ResultFragment;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.multiorder.i;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.ScootersArbitraryDestinationSelectionModalView;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.d;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final /* synthetic */ class hxj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hxj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xgm0 binding;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ixj0) obj).a();
                break;
            case 1:
                ((ResultFragment) obj).finish();
                break;
            case 2:
                i iVar = (i) obj;
                u8w u8wVar = iVar.m;
                u8wVar.getClass();
                u8wVar.a.a("MultiorderNotification.Tapped", new HashMap(), 1, new HashMap());
                Iterator it = iVar.v.iterator();
                while (it.hasNext()) {
                    ((a) ((e5y0) ((gf4) it.next()).a.b.get())).S();
                }
                break;
            case 3:
                RideCardAiBubbleView.renderButtons$lambda$0$0$0((e2y) obj);
                break;
            case 4:
                RideCardAiBubbleView.renderButtons$lambda$0((RideCardAiBubbleView) obj);
                break;
            case 5:
                RideCardModalView.onAttachedToWindow$lambda$1$0((RideCardModalView) obj);
                break;
            case 6:
                RideCardTimelineBannerView.addOptionsButtonViewIfNeed$lambda$0((RideCardTimelineBannerView) obj);
                break;
            case 7:
                RippleHostView.setRippleState$lambda$1((RippleHostView) obj);
                break;
            case 8:
                p0l0 p0l0Var = (p0l0) obj;
                r0 r0Var = p0l0Var.a.d;
                r0Var.getClass();
                r0Var.m(null, cgv0.a);
                p0l0Var.c = null;
                break;
            case 9:
                ((AlertDialog) obj).setTag(agh0.confirm, Boolean.TRUE);
                break;
            case 10:
                ((s) ((ru.yandex.taxi.routeselector.a) obj).F).c();
                break;
            case 11:
                RouteStopsModalView.render$lambda$1((RouteStopsModalView) obj);
                break;
            case 12:
                ((com.yandex.go.routestops.RouteStopsModalView) obj).onBackPressed();
                break;
            case 13:
                ((HandlerThread) obj).quit();
                break;
            case 14:
                ((SafetyCenterAddContactView) obj).requestFocus();
                break;
            case 15:
                ((com.yandex.go.safety.center.car.crash.share.a) obj).onBackPressed();
                break;
            case 16:
                SafetyCenterContactsView._init_$lambda$0((SafetyCenterContactsView) obj);
                break;
            case 17:
                SafetyCenterMainView._init_$lambda$1((SafetyCenterMainView) obj);
                break;
            case 18:
                x4e.B(((ktl0) obj).y.a.a, "SafetyCenter.SharePromo.Shown", new HashMap(), 1);
                break;
            case 19:
                SafetyCenterWebErrorView.initViews$lambda$0$onReloadButtonClicked((nul0) obj);
                break;
            case 20:
                SafetyCenterWebInstructionsView._init_$lambda$0((SafetyCenterWebInstructionsView) obj);
                break;
            case 21:
                b bVar = (b) obj;
                bVar.B.a(bVar.E.b().a, SharedPaymentContext.WIZARD);
                bVar.x.b.a.d();
                break;
            case 22:
                n70 n70Var = (n70) obj;
                ((w561) n70Var.N).b.scrollToPosition(scc.f(((d9m0) n70Var.Z()).h));
                break;
            case 23:
                ((ram0) obj).invoke();
                break;
            case 24:
                binding = ((SbpHomeModalView) obj).getBinding();
                ((RecyclerView) binding.b.d).smoothScrollToPosition(0);
                break;
            case 25:
                ((c) obj).j.setVisibility(4);
                break;
            case 26:
                ScootersActionDialogModalView.bindCloseButton$close((eqm0) obj);
                break;
            case 27:
                ScootersActivePassesModalView.onAttachedToWindow$lambda$0((ScootersActivePassesModalView) obj);
                break;
            case 28:
                ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$onLocationClick((d) obj);
                break;
            default:
                ((hd30) obj).r(new qu(9));
                break;
        }
    }
}

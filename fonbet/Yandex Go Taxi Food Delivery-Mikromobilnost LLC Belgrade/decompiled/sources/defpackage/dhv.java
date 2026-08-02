package defpackage;

import android.os.SystemClock;
import android.widget.ImageView;
import androidx.customview.widget.a;
import com.google.android.material.listitem.ListItemLayout;
import com.yandex.go.inapp_calls.api.navigation.ResumeInAppCallSource;
import com.yandex.go.inapp_calls.navigation.g;
import com.yandex.go.inapp_calls.ui.loader.InAppCallsLoadingLoadingModalView;
import com.yandex.go.intercity.flex.dashboard.point_selection.IntercityPointSelectionModalView;
import com.yandex.go.settings.lang.LanguageModalView;
import com.yandex.go.taxi.intercity.dashboard.impl.feedback.presentation.modal.IntercityDashboardFeedbackModalView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests.IntercityDashboardCommentSuggestsModalView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardModalView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.popup.IntercityDashboardPopupView;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import io.appmetrica.analytics.impl.J1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.VideoFrame;
import ru.yandex.taxi.communications.information.InformationModalView;
import ru.yandex.taxi.design.ListButtonComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.intercity.ui.IntercityDiscoveryModalView;
import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;
import ru.yandex.taxi.order.services.AbstractKeepAliveService;
import ru.yandex.taxi.order.services.d;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.zalogin.LinkAccountsFullscreen;

/* loaded from: classes14.dex */
public final /* synthetic */ class dhv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dhv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        int i;
        a aVar2;
        int i2 = this.a;
        int i3 = 2;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((ImageView) ((jhv) obj).D.d).setVisibility(8);
                return;
            case 1:
                InAppCallsLoadingLoadingModalView.onAttachedToWindow$lambda$0$defaultCall((com.yandex.go.inapp_calls.ui.loader.a) obj);
                return;
            case 2:
                ru.yandex.taxi.inapp_calls.a aVar3 = (ru.yandex.taxi.inapp_calls.a) obj;
                ((pep0) aVar3.l).f(new ap9(i3, (g) aVar3.k.get()), ResumeInAppCallSource.CALLS_ROUTER, hxx.a);
                return;
            case 3:
                ((InformationModalView) obj).dismiss();
                return;
            case 4:
                IntercityDashboardCommentSuggestsModalView._init_$lambda$0((IntercityDashboardCommentSuggestsModalView) obj);
                return;
            case 5:
                IntercityDashboardFeedbackModalView.lambda$0$2((IntercityDashboardFeedbackModalView) obj);
                return;
            case 6:
                ((IntercityDashboardModalView) obj).onBackPressed();
                return;
            case 7:
                ((IntercityDashboardPopupView) obj).handleReloadButtonClick();
                return;
            case 8:
                ((IntercityDiscoveryModalView) obj).onBackPressed();
                return;
            case 9:
                IntercityPointSelectionModalView._init_$onLocationButtonPressed((knw) obj);
                return;
            case 10:
                ((rvw) obj).h();
                return;
            case 11:
                J1.a((Object[]) obj);
                return;
            case 12:
                ((J1) obj).d();
                return;
            case 13:
                ((VideoFrame.I420Buffer) obj).release();
                return;
            case 14:
                ((g9x) obj).h();
                return;
            case 15:
                ((sgx) obj).a();
                return;
            case 16:
                d dVar = (d) obj;
                AbstractKeepAliveService abstractKeepAliveService = dVar.j;
                if (abstractKeepAliveService == null) {
                    xby.l(jst.e, "KEEP_ALIVE_SERVICE:DATA_SYNC_TIMEOUT:NOT_ATTACHED_SERVICE", null, null, g8e.o("Service is not attached to stop self, experimentTag=", dVar.s), 6);
                    return;
                }
                dVar.i(abstractKeepAliveService).f();
                hst hstVar = jst.e;
                String serviceName = abstractKeepAliveService.getServiceName();
                dVar.d.getClass();
                long uptimeMillis = SystemClock.uptimeMillis() - dVar.l;
                xby.l(hstVar, "KEEP_ALIVE_SERVICE:DATA_SYNC_TIMEOUT", null, null, oyr.t(x4e.l("KeepAliveService[", serviceName, "] was created ", uptimeMillis), "ms ago as data sync service and should be stopped, experimentTag=", dVar.s), 6);
                return;
            case 17:
                LanguageModalView.onAttachedToWindow$lambda$0((LanguageModalView) obj);
                return;
            case 18:
                LaunchBrowserActivity.finishRunnable$lambda$0((LaunchBrowserActivity) obj);
                return;
            case 19:
                rdy rdyVar = (rdy) obj;
                rdyVar.g();
                tdy tdyVar = rdyVar.d;
                Set<e74> set = rdyVar.h;
                synchronized (tdyVar.a) {
                    if (set == null) {
                        try {
                            set = tdyVar.b.keySet();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (e74 e74Var : set) {
                        if (tdyVar.b.containsKey(e74Var)) {
                            tdyVar.l((ody) tdyVar.b.get(e74Var));
                        }
                    }
                }
                return;
            case 20:
                ArrayList arrayList = ((sey) obj).b;
                Iterator it = kotlin.collections.a.q0(arrayList).iterator();
                while (it.hasNext()) {
                    ((g18) it.next()).cancel();
                }
                arrayList.clear();
                return;
            case 21:
                ((sjy) obj).a(new c90(6));
                return;
            case 22:
                LinkAccountsFullscreen.showLinkageErrorDialog$lambda$0((LinkAccountsFullscreen) obj);
                return;
            case 23:
                ((zky) obj).a = null;
                return;
            case 24:
                ((LinkedOrderInfoModalView) obj).collapse();
                return;
            case 25:
                hx9 hx9Var = (hx9) obj;
                zzs b = ((gh00) ((ah00) hx9Var.N)).e.b();
                ((wit0) ((tft0) hx9Var.O).a(true)).c(b, "auto", PositionInitAction.MAP);
                return;
            case 26:
                ListButtonComponent.addButtons$lambda$0$0((ny6) obj);
                return;
            case 27:
                ListItemCheckComponent.updateCheckedChangeListener$lambda$0((ListItemCheckComponent) obj);
                return;
            case 28:
                hsy hsyVar = (hsy) obj;
                hsyVar.c = false;
                ListItemLayout listItemLayout = hsyVar.e;
                aVar = listItemLayout.viewDragHelper;
                if (aVar != null) {
                    aVar2 = listItemLayout.viewDragHelper;
                    if (aVar2.h()) {
                        int i4 = hsyVar.a;
                        int i5 = hsyVar.b;
                        hsyVar.a = i4;
                        hsyVar.b = i5;
                        if (hsyVar.c) {
                            return;
                        }
                        listItemLayout.post(hsyVar.d);
                        hsyVar.c = true;
                        return;
                    }
                }
                i = listItemLayout.swipeState;
                if (i == 2) {
                    listItemLayout.setSwipeStateInternal(hsyVar.a, hsyVar.b);
                    return;
                }
                return;
            default:
                ((izy) obj).a.invoke();
                return;
        }
    }
}

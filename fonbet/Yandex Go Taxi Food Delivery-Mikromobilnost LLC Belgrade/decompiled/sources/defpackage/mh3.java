package defpackage;

import android.app.job.JobParameters;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewParent;
import androidx.camera.core.impl.SessionConfig$SessionError;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.go.navigator.ui.a;
import com.yandex.go.payments.shared.business.accountcreation.BusinessAccountCreationView;
import com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView;
import com.yandex.go.shortcuts.impl.view.adapter.b;
import com.yandex.go.shortcuts.impl.view.adapter.c;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadInitializer;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadJob;
import com.yandex.messaging.activity.calls.MessengerCallFeedbackActivity;
import com.yandex.messaging.core.net.entities.PersonalUserData;
import com.yandex.messaging.internal.BackendCompatibilityStatus;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import io.appmetrica.analytics.blecollecting.internal.BleReporterJobService;
import java.util.ArrayList;
import java.util.HashSet;
import ru.yandex.taxi.am.AuthStateRepository;
import ru.yandex.taxi.am.l;
import ru.yandex.taxi.battery.BatteryReceiver;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.multiorder.BubbleModalView;
import ru.yandex.taxi.search.view.BaseAddressSearchView;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.web.calljsinterface.CallJsInterfaceApi;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes10.dex */
public final /* synthetic */ class mh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mh3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float c;
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((AudioSwitchManager) obj2).lambda$selectAudioOutput$5((Class) obj);
                break;
            case 1:
                ((i00) ((h3y) ((mrj) obj2).c).get()).a(new n0m0((PersonalUserData) obj));
                break;
            case 2:
                ((um3) obj2).b.onSuccess();
                ((l) obj).h.a.l(AuthStateRepository.AuthState.DONE);
                break;
            case 3:
                AutoTopupRegularFragment.consumeSideEffect$lambda$45((AutoTopupRegularFragment) obj2, (qas0) obj);
                break;
            case 4:
                AutoTopupSummaryView.render$lambda$3((AutoTopupSummaryView) obj2, (l24) obj);
                break;
            case 5:
                BackendCompatibilityStatus backendCompatibilityStatus = (BackendCompatibilityStatus) obj;
                uhx uhxVar = ((sf4) obj2).c;
                if (uhxVar != null) {
                    MessengerCallFeedbackActivity.onDefaultProfile$lambda$2((MessengerCallFeedbackActivity) uhxVar.b, backendCompatibilityStatus);
                    break;
                }
                break;
            case 6:
                ((BackgroundDownloadJob) obj2).lambda$doWork$0((BackgroundDownloadInitializer) obj);
                break;
            case 7:
                zp1 zp1Var = (zp1) obj2;
                Object mo489apply = ((jy4) obj).mo489apply(zp1Var.y);
                zp1Var.y = mo489apply;
                ((a3x0) zp1Var.c).e(new ci4(zp1Var, mo489apply, i2));
                break;
            case 8:
                ((vw4) obj2).z((ArrayList) obj);
                break;
            case 9:
                BaseAddressSearchView.setActiveInputListeners$lambda$5((AddressInputComponent) obj2, (BaseAddressSearchView) obj);
                break;
            case 10:
                BaseDialog.createButton$lambda$0((BaseDialog) obj2, (tz4) obj);
                break;
            case 11:
                BaseOrganizationCardModalView.setMapEnabledMode$lambda$1$0((BaseOrganizationCardModalView) obj2, (AnchorBottomSheetBehavior) obj);
                break;
            case 12:
                b bVar = (b) obj2;
                RobotoTextView robotoTextView = bVar.e0;
                c.i0(bVar, robotoTextView, ((ga5) obj).getBase().h);
                cma1.z0(robotoTextView, null);
                break;
            case 13:
                ((bg5) obj2).a.unregisterReceiver((BatteryReceiver) obj);
                break;
            case 14:
                BleReporterJobService.a((BleReporterJobService) obj2, (JobParameters) obj);
                break;
            case 15:
                qe6 qe6Var = (qe6) obj;
                tls tlsVar = ((re6) obj2).T;
                if (tlsVar != null) {
                    tlsVar.invoke(qe6Var.f);
                    break;
                }
                break;
            case 16:
                BottomSheetDialogView.dismissInternal$lambda$11((Runnable) obj2, (BottomSheetDialogView) obj);
                break;
            case 17:
                BottomSheetDialogView.render$lambda$4$lambda$1((BottomSheetDialogView) obj2, (BottomSheetDialogView.State) obj);
                break;
            case 18:
                xg6 xg6Var = (xg6) obj2;
                View view = (View) obj;
                BottomSheetBehavior bottomSheetBehavior = xg6Var.a;
                if (view.getHeight() > 0) {
                    ViewParent parent = view.getParent();
                    CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
                    if (coordinatorLayout == null) {
                        c = xg6Var.h;
                    } else {
                        int height = coordinatorLayout.getHeight();
                        if (height <= 0) {
                            c = -1.0f;
                        } else {
                            int bottom = view.getBottom();
                            c = height - bottomSheetBehavior.G() <= bottomSheetBehavior.F() ? 0.0f : y6i0.c((r5 - bottom) / (r5 - r3), 0.0f, 1.0f);
                        }
                    }
                    if (c >= 0.0f) {
                        int i3 = c > 0.5f ? 3 : 5;
                        if (bottomSheetBehavior.k0 != i3) {
                            bottomSheetBehavior.W(i3);
                            break;
                        }
                    }
                }
                break;
            case 19:
                um6 um6Var = (um6) obj;
                vl6 vl6Var = ((a) obj2).h;
                if (vl6Var != null) {
                    vl6Var.c(um6Var.b, !um6Var.d);
                    break;
                }
                break;
            case 20:
                BubbleModalView.animateShow$lambda$0((Runnable) obj2, (BubbleModalView) obj);
                break;
            case 21:
                BusinessAccountCreationView.updateViews$lambda$0((BusinessAccountCreationView) obj2, (aue) obj);
                break;
            case 22:
                ((zw6) obj2).f.a();
                ((Runnable) obj).run();
                break;
            case 23:
                u500 u500Var = ((zw6) obj2).g;
                u500Var.getClass();
                u500Var.d(MainMenuProcessor$MenuEntry.FAMILY_GROUP, (String) obj);
                break;
            case 24:
                ((ButtonsView) obj2).handleClick((my6) obj);
                break;
            case 25:
                ButtonsView.renderButtonsWithCorrection$lambda$0((ButtonsView) obj2, (q47) obj);
                break;
            case 26:
                CallJsInterfaceApi.postEvaluateJavascript$lambda$0((CallJsInterfaceApi) obj2, (String) obj);
                break;
            case 27:
                ru.yandex.taxi.logistics.sdk.webview.api.js.CallJsInterfaceApi.postEvaluateJavascript$lambda$0((ru.yandex.taxi.logistics.sdk.webview.api.js.CallJsInterfaceApi) obj2, (String) obj);
                break;
            case 28:
                uo7 uo7Var = (uo7) obj;
                hm7 hm7Var = ((androidx.camera.camera2.internal.b) obj2).B;
                ((HashSet) hm7Var.b).remove(uo7Var);
                ((ArrayMap) hm7Var.c).remove(uo7Var);
                break;
            default:
                ((fyq0) obj2).a((jyq0) obj, SessionConfig$SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
                break;
        }
    }
}

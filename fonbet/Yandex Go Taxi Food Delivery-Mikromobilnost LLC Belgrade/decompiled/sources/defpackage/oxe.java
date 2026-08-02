package defpackage;

import android.os.SystemClock;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.BeginSignIn.a;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import androidx.media3.exoplayer.audio.c;
import androidx.media3.ui.DefaultTimeBar;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.fintechsdk.core.ui.impl.api.bottomsheet.CustomBottomSheetBehavior;
import com.yandex.go.inapp_calls.ui.defaultoutgoingcall.DefaultCallTypeModalView;
import com.yandex.go.overdraft.ui.DebtsModalView;
import com.yandex.go.payments.shared.wizard.welcome.CreateAccountView;
import com.yandex.go.taxi.order.custom_tips_input.mvp.CustomTipsInputModalView;
import com.yandex.go.taxi.order.db.DbOrderImpl$Data;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.objects.SaveTime;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.divkit.verify.DKVerifyCardFragment;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import ru.yandex.taxi.costcenters.selection.CostCenterSelectionModalView;
import ru.yandex.taxi.themes.ui.DarkThemeModeModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class oxe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oxe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 2;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CostCenterSelectionModalView) obj).closeKeyboard();
                return;
            case 1:
                CreateAccountView._init_$lambda$2((CreateAccountView) obj);
                return;
            case 2:
                c9f c9fVar = ((a) obj).f;
                (c9fVar != null ? c9fVar : null).c(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 3:
                c9f c9fVar2 = ((androidx.credentials.playservices.controllers.CreatePassword.a) obj).f;
                (c9fVar2 != null ? c9fVar2 : null).c(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 4:
                int i3 = CustomBottomSheetBehavior.P0;
                ((CustomBottomSheetBehavior) obj).W(3);
                return;
            case 5:
                CustomTipsInputModalView._init_$cancelClicked((gmf) obj);
                return;
            case 6:
                DKResultFragment.finishRunnable$lambda$0((DKResultFragment) obj);
                return;
            case 7:
                DKVerifyCardFragment.observeDivData$lambda$1$1((DKVerifyCardFragment) obj);
                return;
            case 8:
                ((DarkThemeModeModalView) obj).onBackPressed();
                return;
            case 9:
                ((DashboardFragment) obj).showAutotopupTooltip();
                return;
            case 10:
                hqg hqgVar = (hqg) obj;
                ArrayList arrayList = hqgVar.f;
                while (!arrayList.isEmpty() && hqgVar.l == null) {
                    ((blg0) arrayList.get(0)).a.run();
                    arrayList.remove(0);
                }
                return;
            case 11:
                ysg ysgVar = (ysg) obj;
                synchronized (ysgVar) {
                    try {
                        DbOrderImpl$Data d = ysgVar.d();
                        d.getClass();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(d.a);
                        DbOrderImpl$Data dbOrderImpl$Data = new DbOrderImpl$Data(linkedHashSet, new LinkedHashSet(d.b), new LinkedHashMap(d.c), d.d);
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            TaxiOrder taxiOrder = (TaxiOrder) it.next();
                            taxiOrder.getClass();
                            synchronized (taxiOrder) {
                                TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                                SaveTime.Companion.getClass();
                                SaveTime saveTime = new SaveTime(SystemClock.uptimeMillis(), System.currentTimeMillis());
                                taxiOrderLocalData.getClass();
                                taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, saveTime, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16777214);
                            }
                        }
                        ysgVar.f.b(dbOrderImpl$Data);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 12:
                otg otgVar = (otg) obj;
                otgVar.f = false;
                otgVar.c.a(false);
                qt00 qt00Var = otgVar.h;
                wwo wwoVar = qt00Var instanceof wwo ? (wwo) qt00Var : null;
                if (wwoVar != null) {
                    wwoVar.onCameraMoveFromUserGestureFinished();
                    return;
                }
                return;
            case 13:
                DebtsModalView._init_$lambda$2((DebtsModalView) obj);
                return;
            case 14:
                j5h j5hVar = (j5h) obj;
                h42 a = j5hVar.a();
                j5hVar.f(a, 1028, new w4h(a, i2));
                j5hVar.y.d();
                return;
            case 15:
                ((r8c0) obj).invoke();
                return;
            case 16:
                c cVar = (c) obj;
                if (cVar.i0 >= MapiClientImpl.RETRIES_TIME_MILLIS) {
                    cVar.s.l();
                    cVar.i0 = 0L;
                    return;
                }
                return;
            case 17:
                DefaultCallTypeModalView._init_$lambda$0((DefaultCallTypeModalView) obj);
                return;
            case 18:
                ((vu8) obj).r(new qu(9));
                return;
            case 19:
                qah qahVar = (qah) obj;
                if (qahVar.c) {
                    return;
                }
                jmm jmmVar = qahVar.b;
                if (jmmVar != null) {
                    jmmVar.h(qahVar.a);
                }
                qahVar.w.n.remove(qahVar);
                qahVar.c = true;
                return;
            case 20:
                ((androidx.media3.exoplayer.drm.a) obj).h(null);
                return;
            case 21:
                ((gjh) obj).a.V();
                return;
            case 22:
                ees.d(4, (ArrayList) obj);
                return;
            case 23:
                f fVar = (f) obj;
                FragmentManager.O(2);
                Iterator it2 = fVar.c.iterator();
                while (it2.hasNext()) {
                    ((skh) it2.next()).a.c(fVar);
                }
                return;
            case 24:
                ((DefaultSurfaceProcessor) obj).lambda$release$5();
                return;
            case 25:
                ((qnw0) obj).close();
                return;
            case 26:
                ((DefaultTimeBar) obj).lambda$new$0();
                return;
            case 27:
                ((gl7) obj).cancel(true);
                return;
            case 28:
                ((bmh) obj).invoke();
                return;
            default:
                ru.yandex.taxi.delivery.ui.recycler.a aVar = (ru.yandex.taxi.delivery.ui.recycler.a) obj;
                hki hkiVar = aVar.e0;
                if (hkiVar != null) {
                    aVar.c0();
                    aVar.a0.a(new jo(hkiVar));
                    return;
                }
                return;
        }
    }
}

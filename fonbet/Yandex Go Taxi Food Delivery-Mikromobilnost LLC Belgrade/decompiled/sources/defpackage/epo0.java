package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.places.impl.ui.search.SearchModalView;
import com.yandex.go.places.impl.ui.search.f;
import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;
import com.yandex.go.scooters.offers.v2.components.tariffs.ScootersTariffListView;
import com.yandex.go.scooters.qr.domain.ScootersQrProximityTooCloseInteractor$isTooCloseFlow$1$listener$1;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$CardButton;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionModalView;
import com.yandex.go.scooters.tariff_fix.selection.a;
import com.yandex.go.scooters.tariff_fix.selection.b;
import com.yandex.go.screenshot_screencast_tracker.impl.trackers.h;
import com.yandex.go.something_wrong_screen.ui.SomethingWrongScreenModalView;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import java.util.Arrays;
import java.util.HashMap;
import just.adapter.scroll.ScrollControlGridLayoutManager;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.contacts.SelectContactMvpView;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.contacts.d;
import ru.yandex.taxi.favorites.rides.settings_modal.ui.SettingsModalView;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.solid.l;
import ru.yandex.taxi.scooters.presentation.common.ui.preview.ScootersVehiclePreviewView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.share_favorites.view.ShareFavoritesModalView;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class epo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ epo0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        n4p0 n4p0Var;
        d dVar;
        l lVar;
        String str;
        v8t0 v8t0Var;
        int i = this.a;
        int i2 = 2;
        int i3 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ScootersQrModalView.refreshManualEnterField$lambda$0$0$0((ScootersQrModalView) obj2, (mpo0) obj);
                break;
            case 1:
                ((SensorManager) ((cjm0) obj2).b).unregisterListener((ScootersQrProximityTooCloseInteractor$isTooCloseFlow$1$listener$1) obj);
                break;
            case 2:
                ((sls) obj2).invoke();
                ((com.yandex.go.scooters.subscription.pci_dss.web.b) obj).D.h();
                break;
            case 3:
                ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = (ScootersTariffFixSelectionModalView) obj2;
                bVar = scootersTariffFixSelectionModalView.scootersTariffFixPresenter;
                qgn0 qgn0Var = bVar.J;
                a aVar = new a(bVar, (con0) obj);
                b5p0 b5p0Var = (b5p0) qgn0Var.b;
                b5p0Var.A((m950) b5p0Var.I.get(), new lzn0(new hzn0(ScootersMosRuActionDialogOpenReason.OFFER_SCREEN)), new b0o0(i3, aVar));
                n4p0Var = scootersTariffFixSelectionModalView.scootersTariffFixAnalytics;
                n4p0Var.a(ScootersTariffFixSelectionAnalytics$CardButton.BOOK);
                break;
            case 4:
                ScootersTariffListView.success$lambda$0((ScootersTariffListView) obj2, (y5n0) obj);
                break;
            case 5:
                ScootersVehiclePreviewView.nearestScooter$lambda$0((ScootersVehiclePreviewView) obj2, (w7p0) obj);
                break;
            case 6:
                ((h) obj2).b.unregisterScreenCaptureCallback((ggp0) obj);
                break;
            case 7:
                ((ScrollControlGridLayoutManager) obj2).p0.invoke(Integer.valueOf(((RecyclerView.k) obj).b() - 1));
                break;
            case 8:
                amp0 amp0Var = (amp0) obj2;
                ((pep0) ((oep0) amp0Var.c)).f((m950) ((yvf0) amp0Var.b).get(), new kre0((vmn0) obj), hxx.a);
                break;
            case 9:
                kup0 kup0Var = (kup0) obj;
                SearchModalView searchModalView = (SearchModalView) ((com.yandex.go.places.impl.ui.search.viewholder.a) obj2).U.b;
                f presenter = searchModalView.getPresenter();
                String valueOf = String.valueOf(SearchModalView.access$getBinding(searchModalView).e.getInput().getText());
                com.yandex.go.places.impl.analytics.a aVar2 = presenter.F;
                vy vyVar = aVar2.x;
                zsp0 zsp0Var = kup0Var.d;
                vyVar.getClass();
                nwj a = vy.a(zsp0Var);
                if (a != null) {
                    aVar2.k(new f89(24, (Object) valueOf, (Object) a, com.yandex.go.places.impl.analytics.a.n(valueOf)), "Discovery.PlacesSearch.Tapped");
                }
                presenter.Kg(kup0Var.d);
                break;
            case 10:
                ((bqe0) obj2).c((abz0) obj);
                break;
            case 11:
                SelectContactView.setKeyboardCloseListener$lambda$0((SelectContactView) obj2, (Runnable) obj);
                break;
            case 12:
                dVar = ((SelectContactView) obj2).presenter;
                dVar.z.x(((bgq0) obj).b);
                SelectContactMvpView selectContactMvpView = (SelectContactMvpView) dVar.Dg();
                SelectContactMvpView.UiState uiState = dVar.H;
                dgq0 dgq0Var = dVar.z;
                selectContactMvpView.xf(dgq0Var.e(), uiState);
                dVar.Ng(dgq0Var.e(), dVar.y.d);
                break;
            case 13:
                ((SelectedMessagesPanel) obj2).lambda$onDelete$8((ServerMessageRef[]) obj);
                break;
            case 14:
                ((juq0) obj2).b((fuq0) obj);
                break;
            case 15:
                ((p57) obj2).a.d.invoke(((j5r0) obj).b);
                break;
            case 16:
                ((tls) ((ru.yandex.taxi.settings.presentation.list.viewholder.a) obj2).N.c).invoke(y5r0.b((y5r0) obj, !r3.i));
                break;
            case 17:
                SettingsModalView.renderButton$lambda$0$0((SettingsModalView) obj2, (har0) obj);
                break;
            case 18:
                ShareFavoritesModalView.showFavorites$lambda$0$2((ShareFavoritesModalView) obj2, (jqr0) obj);
                break;
            case 19:
                ((tls) ((mt6) obj2).T).invoke(((nlr0) obj).b.a);
                break;
            case 20:
                ((o0s0) obj2).a.accept((fwz0) obj);
                break;
            case 21:
                ((o0s0) obj2).a.accept((rwz0) obj);
                break;
            case 22:
                ((ShortcutsMainScreen) ((p2s0) obj2).c.get()).showAddressesPicker(SourcePicker.A_FROM_HOME, (PointType) obj);
                break;
            case 23:
                ((ebs0) obj2).c.accept((v751) obj);
                break;
            case 24:
                Runnable runnable = (Runnable) obj;
                SimpleSpinnerModalView.Companion.getClass();
                yes0.b((ViewGroup) obj2);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 25:
                qhs0 qhs0Var = (qhs0) obj2;
                qhs0Var.x = (ru10) obj;
                mmp0 mmp0Var = qhs0Var.w;
                if (mmp0Var != null) {
                    mmp0Var.run();
                    break;
                }
                break;
            case 26:
                SolidSummaryView._init_$lambda$5((SolidSummaryView) obj2, (Context) obj);
                break;
            case 27:
                String str2 = (String) obj;
                lVar = ((SolidSummaryView) obj2).presenter;
                pex0 m = ((k) lVar.e0.a).m();
                lmw0 g = m == null ? null : ru.yandex.taxi.tariffs.model.b.g(m, str2);
                if (g != null) {
                    pex0 m2 = ((k) lVar.x).m();
                    if (m2 == null) {
                        jst.e.k(new NullPointerException(), "Selected tariff should not be null");
                        str = null;
                    } else {
                        str = m2.b;
                    }
                    if (str != null) {
                        boolean z = g instanceof jmw0;
                        jmw0 jmw0Var = z ? (jmw0) g : null;
                        if (jmw0Var != null && jmw0Var.s().c.size() >= 2) {
                            lVar.Qg(g, str, lVar.I.a());
                            break;
                        } else if (!(g instanceof fmw0)) {
                            if (z) {
                                jmw0 jmw0Var2 = (jmw0) g;
                                if (jmw0Var2.t()) {
                                    lVar.Kg(g.getName(), q5z.u(jmw0Var2, jmw0Var2.s().c));
                                    break;
                                }
                            }
                            lVar.Mg(SummaryExpandReason.AUTO_UNSUPPORTED_REQUIREMENT_ON_ORDER);
                            break;
                        } else {
                            fmw0 fmw0Var = (fmw0) g;
                            String str3 = fmw0Var.a;
                            lVar.Kg(str3, gi.e(str3, fmw0Var.b));
                            break;
                        }
                    } else {
                        jst.e.x(new NullPointerException(), "Tariff class is null. Do not show requirement selector.");
                        break;
                    }
                } else {
                    jst.e.k(new NullPointerException(), String.format("%s not found in supported requirements", Arrays.copyOf(new Object[]{str2}, 1)));
                    break;
                }
            case 28:
                z8t0 z8t0Var = (z8t0) obj;
                v8t0Var = ((SomethingWrongScreenModalView) obj2).presenter;
                String str4 = z8t0Var.g;
                String str5 = z8t0Var.h;
                g8t0 g8t0Var = v8t0Var.A;
                g8t0Var.getClass();
                g8t0Var.a.a("SomethingWrongScreen.ActionButtonTapped", new HashMap(), 1, new HashMap());
                ((pep0) v8t0Var.C).f(new pw1(9, (ypc) v8t0Var.B.get(), new xlp0(12, v8t0Var, str4, str5)), new wpc(bqc.c, i2), hxx.a);
                break;
            default:
                ((View) obj2).removeOnLayoutChangeListener((ons0) obj);
                break;
        }
    }
}

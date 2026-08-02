package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.compose.ui.semantics.f;
import com.yandex.go.scooters.offers.v2.components.ScootersComponentsView;
import com.yandex.go.scooters.passes.active.ScootersActivePassesModalView;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerErrorFragment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.SavingsDragAndDropWidgetTypeSavings;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsDashboardDragAndDropInitiatedType;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.feature.savings.internal.screens.account.a;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsIncomeProgressView;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardFragmentV4;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.b;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;
import com.ybsdk.feature.savings.internal.views.SavingsNoAccountsView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.g;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.d;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.ScootersCompletionPhotoView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes3.dex */
public final /* synthetic */ class g8m0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g8m0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        r0 r0Var;
        Object value;
        boolean recyclerHelper$lambda$0;
        zy11 renderContent$lambda$6$lambda$5$lambda$4;
        r0 r0Var2;
        Object value2;
        zy11 createPeriodsAdapter$lambda$7;
        YbButtonView.a render$lambda$2$lambda$0;
        zy11 accountsRecyclerHelper$lambda$1;
        zy11 initBinding$lambda$1;
        r0 r0Var3;
        Object value3;
        BottomSheetDialogView.State consumeSideEffect$lambda$21;
        g renderAccordingToViewState$lambda$19$lambda$17$lambda$16;
        g renderAccordingToViewState$lambda$15$lambda$12$lambda$11;
        zy11 insetsType$lambda$0;
        zy11 insetsType$lambda$02;
        zy11 _init_$lambda$0;
        int i = this.a;
        s7m0 s7m0Var = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lur0 lur0Var = (lur0) obj;
                pz40 Y = ((a) obj2).Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, r7m0.a((r7m0) value, lur0Var, null, null, null, null, null, false, false, 510)));
                return zy11Var;
            case 1:
                v9m0 v9m0Var = (v9m0) obj2;
                r7m0 r7m0Var = (r7m0) obj;
                x6m0 x6m0Var = r7m0Var.b;
                if (x6m0Var != null) {
                    Iterator it = x6m0Var.n.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (jl40.l(((s7m0) next).a, v9m0Var.a)) {
                                s7m0Var = next;
                            }
                        }
                    }
                    s7m0Var = s7m0Var;
                }
                return r7m0.a(r7m0Var, null, null, null, null, null, s7m0Var, false, false, 463);
            case 2:
                recyclerHelper$lambda$0 = SavingsDashboardFragmentV2.recyclerHelper$lambda$0((SavingsDashboardFragmentV2) obj2, (Uri) obj);
                return Boolean.valueOf(recyclerHelper$lambda$0);
            case 3:
                renderContent$lambda$6$lambda$5$lambda$4 = SavingsDashboardFragmentV4.renderContent$lambda$6$lambda$5$lambda$4((SavingsDashboardFragmentV4) obj2, (View) obj);
                return renderContent$lambda$6$lambda$5$lambda$4;
            case 4:
                rt1.K(((AppAnalyticsReporter) ((c) ((b) obj2).a).H.a).f0, null, ((Integer) obj).intValue(), SavingsEvents$SavingsDashboardDragAndDropInitiatedType.NONE, SavingsDragAndDropWidgetTypeSavings.SHELF, 9);
                return zy11Var;
            case 5:
                lur0 lur0Var2 = (lur0) obj;
                pz40 Y2 = ((com.ybsdk.feature.savings.internal.screens.dashboard.a) obj2).Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, ebm0.a((ebm0) value2, lur0Var2, false, null, false, null, null, 0, false, false, null, 1022)));
                return zy11Var;
            case 6:
                createPeriodsAdapter$lambda$7 = SavingsIncomeProgressView.createPeriodsAdapter$lambda$7((SavingsIncomeProgressView) obj2, (n70) obj);
                return createPeriodsAdapter$lambda$7;
            case 7:
                n70 n70Var = (n70) obj;
                n70Var.W(new vam0(4, n70Var, (bab) obj2));
                return zy11Var;
            case 8:
                render$lambda$2$lambda$0 = SavingsNoAccountsView.render$lambda$2$lambda$0((kdm0) obj2, (YbButtonView.a) obj);
                return render$lambda$2$lambda$0;
            case 9:
                accountsRecyclerHelper$lambda$1 = SavingsShelfView.accountsRecyclerHelper$lambda$1((SavingsShelfView) obj2, ((Integer) obj).intValue());
                return accountsRecyclerHelper$lambda$1;
            case 10:
                initBinding$lambda$1 = SbpChallengerErrorFragment.initBinding$lambda$1((SbpChallengerErrorFragment) obj2, (cgm0) obj);
                return initBinding$lambda$1;
            case 11:
                lur0 lur0Var3 = (lur0) obj;
                pz40 Y3 = ((com.ybsdk.feature.sbp.old.internal.screens.a) obj2).Y();
                do {
                    r0Var3 = (r0) Y3;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, mhm0.b((mhm0) value3, null, null, lur0Var3, 11)));
                return zy11Var;
            case 12:
                consumeSideEffect$lambda$21 = SbpPartnersFragment.consumeSideEffect$lambda$21((iim0) obj2, (BottomSheetDialogView.State) obj);
                return consumeSideEffect$lambda$21;
            case 13:
                renderAccordingToViewState$lambda$19$lambda$17$lambda$16 = SbpPartnersFragment.renderAccordingToViewState$lambda$19$lambda$17$lambda$16((jim0) obj2, (g) obj);
                return renderAccordingToViewState$lambda$19$lambda$17$lambda$16;
            case 14:
                renderAccordingToViewState$lambda$15$lambda$12$lambda$11 = SbpPartnersFragment.renderAccordingToViewState$lambda$15$lambda$12$lambda$11((mim0) obj2, (g) obj);
                return renderAccordingToViewState$lambda$15$lambda$12$lambda$11;
            case 15:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new zdk0(18, ((a361) n70Var2.N).a, n70Var2, (lbb0) obj2));
                n70Var2.b0(new t8b0(n70Var2, 5));
                return zy11Var;
            case 16:
                ((j) ((dfm0) ((kk5) obj2).J).a).d("SBPOpenBankFailed.Modal.Shown").m();
                return zy11Var;
            case 17:
                qim0 qim0Var = (qim0) obj;
                ((t7l0) obj2).invoke(qim0Var.a, qim0Var.b);
                return zy11Var;
            case 18:
                okm0 okm0Var = (okm0) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                f.q(mnq0Var, okm0Var.d);
                f.p(mnq0Var, 3);
                StringBuilder sb = new StringBuilder();
                sb.append(okm0Var.a.toString());
                CharSequence charSequence = okm0Var.b;
                if (charSequence != null) {
                    sb.append(Extension.FIX_SPACE + ((Object) charSequence));
                }
                qj4 qj4Var = okm0Var.c;
                if (qj4Var != null) {
                    sb.append(Extension.FIX_SPACE + qj4Var.a);
                }
                f.l(mnq0Var, sb.toString());
                return zy11Var;
            case 19:
                return obj == ((iz40) obj2) ? "(this)" : String.valueOf(obj);
            case 20:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.p(mnq0Var2, 3);
                f.q(mnq0Var2, ((wmm0) obj2).b);
                return zy11Var;
            case 21:
                insetsType$lambda$0 = ScootersActivePassesModalView.insetsType$lambda$0((ScootersActivePassesModalView) obj2, (t1w) obj);
                return insetsType$lambda$0;
            case 22:
                kdx kdxVar = (kdx) obj;
                r7p0 r7p0Var = (r7p0) ((aym0) obj2).f;
                abb1.d(kdxVar, "number", r7p0Var.a);
                abb1.d(kdxVar, DRMInfoProvider.MediaDRMKeys.VENDOR, r7p0Var.b.k());
                return zy11Var;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                r0 r0Var4 = ((d) obj2).J.c;
                r0Var4.getClass();
                r0Var4.m(null, bool);
                return zy11Var;
            case 24:
                return new igw(2, (m0n0) obj2);
            case 25:
                insetsType$lambda$02 = ScootersCompletionPhotoView.insetsType$lambda$0((ScootersCompletionPhotoView) obj2, (t1w) obj);
                return insetsType$lambda$02;
            case 26:
                _init_$lambda$0 = ScootersComponentsView._init_$lambda$0((ScootersComponentsView) obj2, ((Boolean) obj).booleanValue());
                return _init_$lambda$0;
            case 27:
                ((com.yandex.go.scooters.utils.data.a) obj2).c.clear();
                return zy11Var;
            case 28:
                return Boolean.valueOf(jl40.l(((kpm0) obj2).b, ((ppm0) obj).a.b));
            default:
                return Boolean.valueOf(jl40.l(((ppm0) obj2).a.b, ((ppm0) obj).a.b));
        }
    }
}

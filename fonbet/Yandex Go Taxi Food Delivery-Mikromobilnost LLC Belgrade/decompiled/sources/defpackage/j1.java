package defpackage;

import android.bluetooth.BluetoothGatt;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.compose.foundation.text.KeyCommand;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.dto.response.Action$Media;
import com.yandex.go.dto.response.Action$MediaStory;
import com.yandex.go.dto.response.q1;
import com.yandex.go.navigator.main_screen.MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1$invokeSuspend$$inlined$suspendCallbackApi$2;
import com.yandex.go.shortcuts.impl.view.adapter.n;
import com.yandex.go.suggest.DestinationSuggest;
import com.yandex.go.taxi.order.cancel.reasons.view.v2.CancelReasonsV2View;
import com.yandex.go.taxi.order.cancel.reasons.view.v2.d;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.search.SuggestSession;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.cashback.impl.entities.SuggestedCashbackPromoEntity;
import com.ybsdk.feature.cashback.impl.entities.types.PromoID;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesFragment;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesScreenParams;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardFragment;
import com.ybsdk.feature.cashback.impl.screens.dashboard.a;
import com.ybsdk.feature.main.internal.widgets.ProductCardListView;
import com.ybsdk.feature.main.internal.widgets.ProductCardView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.segmented.SegmentedControlView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Ref$IntRef;
import retrofit2.Call;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.preorder.source.SourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class j1 implements tls {
    public final /* synthetic */ int a;
    public final Object b;

    public j1() {
        this.a = 21;
        this.b = new AtomicReference();
    }

    public Long b(haf0 haf0Var) {
        return Long.valueOf(((haf0) ((AtomicReference) this.b).getAndSet(haf0Var)) != null ? 1000L : 0L);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        d dVar;
        a viewModel;
        dbv0 dbv0Var;
        Object obj2;
        com.yandex.go.shortcuts.impl.analytic.a aVar;
        st0 d;
        Action$Media action$Media;
        String str;
        int i = this.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((yf7) obj3).cancel();
                break;
            case 1:
                ((SuggestSession) obj3).reset();
                break;
            case 2:
                ((w51) obj3).rh((ic61) obj);
                break;
            case 3:
                ((ViewPropertyAnimator) obj3).cancel();
                break;
            case 4:
                String str2 = ((vw7) obj).a;
                dVar = ((CancelReasonsV2View) obj3).presenter;
                dVar.Lg(new ux7(str2));
                break;
            case 5:
                String m415unboximpl = ((PromoID) obj).m415unboximpl();
                viewModel = ((CashbackDashboardFragment) obj3).getViewModel();
                o39 o39Var = ((e39) viewModel.X()).a;
                if (o39Var != null && (dbv0Var = o39Var.f) != null) {
                    Iterator it = dbv0Var.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (PromoID.m411equalsimpl0(((SuggestedCashbackPromoEntity) obj2).m385getPromoIdy5i_914(), m415unboximpl)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    SuggestedCashbackPromoEntity suggestedCashbackPromoEntity = (SuggestedCashbackPromoEntity) obj2;
                    if (suggestedCashbackPromoEntity != null) {
                        viewModel.G.m.a.a("cashback.select_new_category_clicked", null);
                        tfl0 tfl0Var = viewModel.D;
                        ucp0 ucp0Var = viewModel.E;
                        String agreementId = viewModel.B.getAgreementId();
                        ucp0Var.getClass();
                        tfl0Var.h(new FragmentScreen("CashbackCategoryFragment", false, new CashbackCategoriesScreenParams.Prefetched(agreementId, suggestedCashbackPromoEntity), null, qoi0.a(CashbackCategoriesFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null));
                        break;
                    }
                }
                break;
            case 6:
                KeyEvent keyEvent = ((eix) obj).a;
                if (mhx.a(c9y.c(keyEvent), mhx.a) && c9y.f(keyEvent) == 1) {
                    dur.b((dur) obj3);
                }
                break;
            case 7:
                ((xo3) obj3).cancel();
                break;
            case 8:
                Future future = (Future) obj3;
                if (!future.isDone()) {
                    future.cancel(true);
                    break;
                }
                break;
            case 9:
                ((Boolean) obj).getClass();
                Iterator it2 = ((bhk) obj3).c.iterator();
                while (it2.hasNext()) {
                    ((sls) it2.next()).invoke();
                }
                break;
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    ((tfl0) obj3).e();
                    break;
                }
                break;
            case 11:
                ((Ref$IntRef) obj3).element = ((Integer) obj).intValue();
                break;
            case 12:
                ((DrivingSession) obj3).cancel();
                break;
            case 13:
                ((yn50) ((g9v) obj3)).a();
                break;
            case 14:
                ((Call) obj3).cancel();
                break;
            case 15:
                List<DestinationSuggest> list = ((ic61) obj).a;
                ArrayList arrayList = new ArrayList();
                for (DestinationSuggest destinationSuggest : list) {
                    PlainAddress plainAddress = destinationSuggest instanceof PlainAddress ? (PlainAddress) destinationSuggest : null;
                    if (plainAddress != null) {
                        arrayList.add(plainAddress);
                    }
                }
                ((MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1$invokeSuspend$$inlined$suspendCallbackApi$2) obj3).invoke(kotlin.collections.a.A0(arrayList, 2));
                break;
            case 16:
                ((Map) obj3).setMapLoadedListener(null);
                break;
            case 17:
                ((com.yandex.go.image.domain.requests.a) obj3).cancel();
                break;
            case 18:
                ((s8x) obj3).j0();
                break;
            case 19:
                int intValue = ((Number) obj).intValue();
                n nVar = (n) obj3;
                if (intValue != nVar.d0) {
                    nVar.d0 = intValue;
                    e6v item = nVar.T.getItem(intValue);
                    yyr0 yyr0Var = item instanceof yyr0 ? (yyr0) item : null;
                    if (yyr0Var != null && (d = (aVar = (com.yandex.go.shortcuts.impl.analytic.a) nVar.S).d(yyr0Var)) != null) {
                        aVar.p.add(yyr0Var.e());
                        i d2 = ((j) aVar.a).d((String) aVar.i.b);
                        aVar.b(d, d2);
                        q1 c = yyr0Var.getC();
                        Action$MediaStory action$MediaStory = c instanceof Action$MediaStory ? (Action$MediaStory) c : null;
                        if (action$MediaStory != null && (action$Media = action$MediaStory.a) != null && (str = action$Media.a) != null) {
                            d2.a.put("promo_id", str);
                        }
                        d2.m();
                        break;
                    }
                }
                break;
            case 20:
                View view = (View) obj;
                if (view instanceof ProductCardView) {
                    break;
                } else {
                    ((ProductCardListView) obj3).removeView(view);
                    break;
                }
            case 21:
                break;
            case 22:
                ((r2l0) obj3).getClass();
                ((m6y) ((u6y) obj)).f(0, null, new gm5(5, t2l0.a), new androidx.compose.runtime.internal.a(802480018, new u2l0(), true));
                break;
            case 23:
                ((yx40) obj3).setIntValue(((Number) obj).intValue());
                break;
            case 24:
                BluetoothGatt bluetoothGatt = (BluetoothGatt) obj3;
                bluetoothGatt.close();
                bluetoothGatt.disconnect();
                break;
            case 25:
                ((AlertDialog) obj3).dismiss();
                break;
            case 26:
                View view2 = (View) obj;
                if (view2 instanceof YbButtonView) {
                    break;
                } else {
                    ((SegmentedControlView) obj3).removeView(view2);
                    break;
                }
            case 27:
                androidx.compose.foundation.text.selection.i iVar = (androidx.compose.foundation.text.selection.i) obj3;
                if (oj91.a.F(((eix) obj).a) == KeyCommand.COPY) {
                    iVar.b();
                    z = true;
                }
                break;
            case 28:
                ((x08) obj3).cancel();
                break;
            default:
                ((SourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$2) obj3).invoke(zy11Var);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ j1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.g;
import com.yandex.go.agreement.trackable.mvp.TrackableAcceptanceModalView;
import com.yandex.go.summary.ui.compose.common.bottomsheet.i;
import com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerDistrictCoverageProgressView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2ModalView;
import com.yandex.go.superapp_carts.analytics.SuperappCartsAnalytics$ScreenState;
import com.yandex.go.transfer_requirement.mvp.TransferRequirementModalView;
import com.yandex.go.transfer_requirement.ui.date_selector.TransferDateSelectorItemView;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.stories.ChangeStoryReason;
import com.ybsdk.feature.main.internal.screens.userCards.UserCardsFragment;
import com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusFragment;
import com.ybsdk.feature.stories.internal.screens.stories.StoriesFragment;
import com.ybsdk.feature.stories.internal.screens.verticalstories.view.StoriesPageView;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.list.TransactionsFragment;
import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.channels.b;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;

/* loaded from: classes14.dex */
public final /* synthetic */ class but0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ but0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 onCreate$lambda$0;
        zy11 onViewCreated$lambda$17$lambda$12;
        zy11 lambda$7$lambda$3;
        ExplorerDistrictCoverageProgressView coverageProgressView;
        zy11 loadDistrictFinishedIcon$lambda$0$0;
        zy11 _init_$lambda$0;
        zy11 buttons$lambda$0$0$0;
        boolean adapter_delegate$lambda$2$lambda$0;
        boolean adapter_delegate$lambda$1$lambda$0;
        zy11 onCreate$lambda$02;
        zy11 adapter$lambda$1;
        zy11 zy11Var;
        zy11 adapter$lambda$0;
        zy11 onCreate$lambda$03;
        int i = this.a;
        zy11 zy11Var2 = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                onCreate$lambda$0 = SplitDepositPaymentStatusFragment.onCreate$lambda$0((SplitDepositPaymentStatusFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$0;
            case 1:
                ((Integer) obj2).getClass();
                cgb1.a((m8u0) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 2:
                onViewCreated$lambda$17$lambda$12 = StoriesFragment.onViewCreated$lambda$17$lambda$12((StoriesFragment) obj3, ((Integer) obj).intValue(), (ChangeStoryReason) obj2);
                return onViewCreated$lambda$17$lambda$12;
            case 3:
                lambda$7$lambda$3 = StoriesPageView.lambda$7$lambda$3((StoriesPageView) obj3, ((Integer) obj).intValue(), (ChangeStoryReason) obj2);
                return lambda$7$lambda$3;
            case 4:
                int I = evu0.I((CharSequence) obj, (char[]) obj3, ((Integer) obj2).intValue(), false);
                if (I < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(I), 1);
            case 5:
                ((a60) ((kcv0) obj3).b).c((String) obj, (v770) obj2);
                return zy11Var2;
            case 6:
                ((Integer) obj2).getClass();
                i.c((tpr) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 7:
                coverageProgressView = ((SuperAppDiscoveryMapModalView) obj3).getCoverageProgressView();
                coverageProgressView.setFinishedImage((Drawable) obj2);
                return zy11Var2;
            case 8:
                loadDistrictFinishedIcon$lambda$0$0 = SuperAppDiscoveryMapV2ModalView.loadDistrictFinishedIcon$lambda$0$0((ExplorerDistrictCoverageProgressView) obj3, (ExplorerDistrictCoverageProgressView) obj, (Drawable) obj2);
                return loadDistrictFinishedIcon$lambda$0$0;
            case 9:
                i9w0 i9w0Var = (i9w0) obj3;
                ((s9w0) i9w0Var.c.get()).a(SuperappCartsAnalytics$ScreenState.Loading, i9w0Var.b.a);
                i9w0Var.a.backward(((Boolean) obj).booleanValue(), (Map) obj2);
                return zy11Var2;
            case 10:
                ((k870) ((m) obj3).e).a((o2y0) obj, (String) obj2);
                return zy11Var2;
            case 11:
                ((Integer) obj2).getClass();
                ckb1.c((d6z0) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 12:
                _init_$lambda$0 = TariffsRibbonView._init_$lambda$0((TariffsRibbonView) obj3, ((Integer) obj).intValue(), (mr31) obj2);
                return _init_$lambda$0;
            case 13:
                ((Integer) obj2).getClass();
                bts btsVar = (bts) ((fid) obj);
                btsVar.e0(950061013);
                String valueOf = String.valueOf(((TextClassification) obj3).getLabel());
                btsVar.t(false);
                return valueOf;
            case 14:
                ((Integer) obj2).intValue();
                bts btsVar2 = (bts) ((fid) obj);
                btsVar2.e0(-1376593684);
                String obj4 = ((RemoteAction) obj3).getTitle().toString();
                btsVar2.t(false);
                return obj4;
            case 15:
                jpy0 jpy0Var = (jpy0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar;
                if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    ymb1.c(jpy0Var.e, null, ((el51) btsVar3.m(gl51.a)).o(), null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar3, 0, 0, 65530);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 16:
                ((Integer) obj2).getClass();
                ((g) obj3).a((fid) obj, vng.O(1));
                return zy11Var2;
            case 17:
                buttons$lambda$0$0$0 = TrackableAcceptanceModalView.setButtons$lambda$0$0$0((TrackableAcceptanceModalView) obj3, (nqs0) obj, (wrs0) obj2);
                return buttons$lambda$0$0$0;
            case 18:
                wts0 wts0Var = (wts0) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar2;
                if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qrb1.a(wts0Var.a, btsVar4, 0);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 19:
                adapter_delegate$lambda$2$lambda$0 = TransactionsFeedFragment.adapter_delegate$lambda$2$lambda$0((TransactionsFeedFragment) obj3, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(adapter_delegate$lambda$2$lambda$0);
            case 20:
                adapter_delegate$lambda$1$lambda$0 = TransactionsFragment.adapter_delegate$lambda$1$lambda$0((TransactionsFragment) obj3, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(adapter_delegate$lambda$1$lambda$0);
            case 21:
                hex0 hex0Var = (hex0) obj3;
                View inflate = ((LayoutInflater) obj).inflate(flh0.item_transfer_date_selector, (ViewGroup) obj2, false);
                if (inflate != null) {
                    TransferDateSelectorItemView transferDateSelectorItemView = (TransferDateSelectorItemView) inflate;
                    return new psg(new nzm(transferDateSelectorItemView, 4, transferDateSelectorItemView), hex0Var);
                }
                ny61.t("rootView");
                return null;
            case 22:
                onCreate$lambda$02 = TransferMe2MeConfirmPullFragment.onCreate$lambda$0((TransferMe2MeConfirmPullFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$02;
            case 23:
                adapter$lambda$1 = TransferPhoneInputFragment.adapter$lambda$1((TransferPhoneInputFragment) obj3, (bj01) obj, ((Integer) obj2).intValue());
                return adapter$lambda$1;
            case 24:
                zy11Var = TransferRequirementModalView.setupListeners$lambda$0$0((TransferRequirementModalView) obj3, ((Integer) obj).intValue(), (wh01) obj2);
                return zy11Var;
            case 25:
                wq01 wq01Var = (wq01) obj3;
                View inflate2 = ((LayoutInflater) obj).inflate(noh0.ybsdk_transfer_item_requisite_button, (ViewGroup) obj2, false);
                if (inflate2 == null) {
                    ny61.t("rootView");
                    return null;
                }
                YbButtonView ybButtonView = (YbButtonView) inflate2;
                p961 p961Var = new p961(ybButtonView);
                ybButtonView.setOnClickListener(new vmu0(19, wq01Var));
                return p961Var;
            case 26:
                adapter$lambda$0 = TransferTargetsFragment.adapter$lambda$0((TransferTargetsFragment) obj3, (bry) obj, ((Integer) obj2).intValue());
                return adapter$lambda$0;
            case 27:
                b.c((y6f0) obj3, new bc21(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                return zy11Var2;
            case 28:
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.b) obj3).A.k((String) obj2);
                return zy11Var2;
            default:
                onCreate$lambda$03 = UserCardsFragment.onCreate$lambda$0((UserCardsFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$03;
        }
    }

    public /* synthetic */ but0(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}

package defpackage;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import coil.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.messaging.ChatRequest;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.ybsdk.feature.accountdetails.internal.screens.accountdetails.AccountDetailsFragment;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2Fragment;
import com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueFragment;
import com.ybsdk.feature.card.internal.presentation.cardterm.CardSettingsTermFragment;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesFragment;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardFragment;
import com.ybsdk.feature.resolver.internal.screens.empty.EmptyLinkResolverFragment;
import com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarFragment;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.payment.methods.AutoTopupPaymentMethodsFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit.DivTransactionInfoFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.requisites.BudgetChargesRequisitesFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.BudgetChargesSearchStatusFragment;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import ru.yandex.taxi.logistics.delivery_state.DeliveryStateBaseParams;
import ru.yandex.taxi.logistics.sdk.tracking.preparer.a;

/* loaded from: classes3.dex */
public final class kk implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;

    public /* synthetic */ kk(n3w n3wVar, int i) {
        this.a = i;
        this.b = n3wVar;
    }

    public static a a(DeliveryStateBaseParams deliveryStateBaseParams) {
        x601 x601Var = (x601) bvf0.u().l1.get();
        String deliveryId = deliveryStateBaseParams.getDeliveryId();
        UUID localUuid = deliveryStateBaseParams.getLocalUuid();
        x601Var.getClass();
        Object b701Var = deliveryId != null ? new b701(deliveryId) : localUuid != null ? new z601(localUuid) : a701.a;
        ConcurrentHashMap concurrentHashMap = x601Var.b;
        Object obj = concurrentHashMap.get(b701Var);
        Object obj2 = obj;
        if (obj == null) {
            kcz0 kcz0Var = x601Var.a;
            kcz0Var.getClass();
            mbg mbgVar = new mbg();
            n3w a = n3w.a(b701Var);
            mbgVar.a = a;
            lbg lbgVar = new lbg(kcz0Var, 1);
            mbgVar.b = lbgVar;
            lbg lbgVar2 = new lbg(kcz0Var, 0);
            mbgVar.c = lbgVar2;
            mbgVar.d = i5m.b(new gpx0(a, lbgVar, lbgVar2, 14));
            i5m.b(new vu(mbgVar.a, mbgVar.c, mbgVar.b, 13));
            Object putIfAbsent = concurrentHashMap.putIfAbsent(b701Var, mbgVar);
            obj2 = mbgVar;
            if (putIfAbsent != null) {
                obj2 = putIfAbsent;
            }
        }
        a aVar = (a) ((mbg) obj2).d.get();
        q5z.i(aVar);
        return aVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new AccountDetailsFragment((sk) n3wVar.a);
            case 1:
                return new AutoTopupPaymentMethodsFragment((uw3) n3wVar.a);
            case 2:
                return new AutoTopupResultFragment((xy3) n3wVar.a);
            case 3:
                return new AutoTopupSetupV2Fragment((y04) n3wVar.a);
            case 4:
                return new pcy((PaymentSdkEnvironment) n3wVar.a);
            case 5:
                return new BudgetChargesRequisitesFragment((wo6) n3wVar.a);
            case 6:
                return new BudgetChargesSearchStatusFragment((fp6) n3wVar.a);
            case 7:
                return new sr4(14, (zu6) n3wVar.a);
            case 8:
                return new mh7((TaxiOrder) n3wVar.a);
            case 9:
                return new CardIssueFragment((th8) n3wVar.a);
            case 10:
                return new CardSettingsTermFragment((so8) n3wVar.a);
            case 11:
                return new ks8((hs8) n3wVar.a);
            case 12:
                return new CashbackCategoriesFragment((n29) n3wVar.a);
            case 13:
                return new CashbackDashboardFragment((f39) n3wVar.a);
            case 14:
                return new me0((Context) n3wVar.a, (byte) 0);
            case 15:
                return (FragmentActivity) n3wVar.a;
            case 16:
                ChatRequest chatRequest = ((l7f) n3wVar.a).a;
                q5z.i(chatRequest);
                return chatRequest;
            case 17:
                if (n3wVar.a == null) {
                    return new sif();
                }
                ny61.u();
                return null;
            case 18:
                ((h9g) ((tw51) n3wVar.a)).f();
                return null;
            case 19:
                ((h9g) ((tw51) n3wVar.a)).f();
                return null;
            case 20:
                ((h9g) ((tw51) n3wVar.a)).f();
                return null;
            case 21:
                return new qnh((bvh) n3wVar.a);
            case 22:
                return a((DeliveryStateBaseParams) n3wVar.a);
            case 23:
                return new DiffRateCalendarFragment((mij) n3wVar.a);
            case 24:
                return ((Application) n3wVar.a).getApplicationContext();
            case 25:
                return new DivTransactionInfoFragment((ojl) n3wVar.a);
            case 26:
                return new b(((wxk) n3wVar.a).a).a();
            case 27:
                return new yzh((rgn) n3wVar.a);
            case 28:
                return new EmptyLinkResolverFragment((xvn) n3wVar.a);
            default:
                return ((x6w0) n3wVar.a).a;
        }
    }

    public /* synthetic */ kk(Object obj, n3w n3wVar, int i) {
        this.a = i;
        this.b = n3wVar;
    }
}

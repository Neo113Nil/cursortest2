package defpackage;

import android.os.Bundle;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.deeplink.api.actions.CloseFlow;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositProcessing;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositRepayment;
import com.ybsdk.feature.split.deposit.internal.ui.payment.status.c;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class fut0 implements a3z {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeeplinkHandleResult$DeeplinkType b;
    public final /* synthetic */ c c;

    public /* synthetic */ fut0(DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType, c cVar, int i) {
        this.a = i;
        this.b = deeplinkHandleResult$DeeplinkType;
        this.c = cVar;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = this.b;
        EmptyList emptyList = EmptyList.a;
        c cVar = this.c;
        switch (i) {
            case 0:
                if (deeplink.getAction() instanceof CloseFlow) {
                    tfl0.b(cVar.G, cVar.I.a(), null, true, 2);
                    break;
                }
                break;
            case 1:
                if (deeplink.getAction() instanceof SplitDepositRepayment) {
                    SplitDepositRepayment splitDepositRepayment = (SplitDepositRepayment) deeplink.getAction();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("split_deposit_repayment", splitDepositRepayment);
                    cVar.Z(new fka0(bundle));
                    tfl0.b(cVar.G, cVar.I.a(), null, false, 2);
                    break;
                }
                break;
            default:
                if (deeplink.getAction() instanceof SplitDepositProcessing) {
                    cVar.G.c(cVar.I.a(), cVar.J.b(((SplitDepositProcessing) deeplink.getAction()).getTransactionParameters()));
                    break;
                }
                break;
        }
        return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
    }
}

package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.split.deposit.internal.ui.deposit.SplitDepositFragment;
import com.ybsdk.feature.split.deposit.internal.ui.deposit.SplitDepositScreenParams;
import com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusFragment;
import com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusScreenParams;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gtt0 implements kcs {
    public final /* synthetic */ tc9 a;
    public final sut0 b;

    public gtt0(sut0 sut0Var, Map map) {
        this.a = new tc9(map, 10);
        this.b = sut0Var;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final FragmentScreen b(String str) {
        SplitDepositPaymentStatusScreenParams splitDepositPaymentStatusScreenParams = new SplitDepositPaymentStatusScreenParams(str);
        this.b.getClass();
        return new FragmentScreen("SplitDepositPaymentStatusScreen", false, splitDepositPaymentStatusScreenParams, TransitionPolicyType.POPUP, qoi0.a(SplitDepositPaymentStatusFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null);
    }

    public final FragmentScreen c(String str, String str2) {
        SplitDepositScreenParams splitDepositScreenParams = new SplitDepositScreenParams(str, str2);
        this.b.getClass();
        return new FragmentScreen("SplitDepositScreen", false, splitDepositScreenParams, null, qoi0.a(SplitDepositFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }
}

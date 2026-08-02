package defpackage;

import com.yandex.div.core.Div2Context;
import com.yandex.payment.divkit.verify.DKVerifyCardFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class gvf implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKVerifyCardFragment b;

    public /* synthetic */ gvf(DKVerifyCardFragment dKVerifyCardFragment, int i) {
        this.a = i;
        this.b = dKVerifyCardFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tc5 activityViewModel_delegate$lambda$0;
        Div2Context divContext_delegate$lambda$0;
        hs31 viewModel_delegate$lambda$0;
        zy11 onViewCreated$lambda$0;
        zy11 onViewCreated$lambda$4;
        int i = this.a;
        DKVerifyCardFragment dKVerifyCardFragment = this.b;
        switch (i) {
            case 0:
                activityViewModel_delegate$lambda$0 = DKVerifyCardFragment.activityViewModel_delegate$lambda$0(dKVerifyCardFragment);
                return activityViewModel_delegate$lambda$0;
            case 1:
                divContext_delegate$lambda$0 = DKVerifyCardFragment.divContext_delegate$lambda$0(dKVerifyCardFragment);
                return divContext_delegate$lambda$0;
            case 2:
                viewModel_delegate$lambda$0 = DKVerifyCardFragment.viewModel_delegate$lambda$0(dKVerifyCardFragment);
                return viewModel_delegate$lambda$0;
            case 3:
                onViewCreated$lambda$0 = DKVerifyCardFragment.onViewCreated$lambda$0(dKVerifyCardFragment);
                return onViewCreated$lambda$0;
            default:
                onViewCreated$lambda$4 = DKVerifyCardFragment.onViewCreated$lambda$4(dKVerifyCardFragment);
                return onViewCreated$lambda$4;
        }
    }
}

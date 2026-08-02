package defpackage;

import com.yandex.div.core.Div2Context;
import com.yandex.payment.divkit.bind.DKBindCardFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class brf implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKBindCardFragment b;

    public /* synthetic */ brf(DKBindCardFragment dKBindCardFragment, int i) {
        this.a = i;
        this.b = dKBindCardFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tc5 activityViewModel_delegate$lambda$0;
        Div2Context divContext_delegate$lambda$0;
        zy11 onViewCreated$lambda$0;
        zy11 onViewCreated$lambda$2;
        hs31 viewModel_delegate$lambda$0;
        int i = this.a;
        DKBindCardFragment dKBindCardFragment = this.b;
        switch (i) {
            case 0:
                activityViewModel_delegate$lambda$0 = DKBindCardFragment.activityViewModel_delegate$lambda$0(dKBindCardFragment);
                return activityViewModel_delegate$lambda$0;
            case 1:
                divContext_delegate$lambda$0 = DKBindCardFragment.divContext_delegate$lambda$0(dKBindCardFragment);
                return divContext_delegate$lambda$0;
            case 2:
                onViewCreated$lambda$0 = DKBindCardFragment.onViewCreated$lambda$0(dKBindCardFragment);
                return onViewCreated$lambda$0;
            case 3:
                onViewCreated$lambda$2 = DKBindCardFragment.onViewCreated$lambda$2(dKBindCardFragment);
                return onViewCreated$lambda$2;
            default:
                viewModel_delegate$lambda$0 = DKBindCardFragment.viewModel_delegate$lambda$0(dKBindCardFragment);
                return viewModel_delegate$lambda$0;
        }
    }
}

package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardFragment;
import java.util.Collections;
import kotlin.Result;

/* loaded from: classes3.dex */
public final /* synthetic */ class hv01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransfersDashboardFragment b;

    public /* synthetic */ hv01(ha61 ha61Var, TransfersDashboardFragment transfersDashboardFragment) {
        this.a = 2;
        this.b = transfersDashboardFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$9$lambda$5;
        zy11 onViewCreated$lambda$9$lambda$8;
        Object failure;
        int i = this.a;
        TransfersDashboardFragment transfersDashboardFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$9$lambda$5 = TransfersDashboardFragment.onViewCreated$lambda$9$lambda$5(transfersDashboardFragment, (jo01) obj);
                return onViewCreated$lambda$9$lambda$5;
            case 1:
                onViewCreated$lambda$9$lambda$8 = TransfersDashboardFragment.onViewCreated$lambda$9$lambda$8(transfersDashboardFragment, (tb6) obj);
                return onViewCreated$lambda$9$lambda$8;
            default:
                zy11 zy11Var = zy11.a;
                try {
                    transfersDashboardFragment.initSlideSubscription();
                    failure = zy11Var;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    x4c.g("Something went wrong when doing initSlideSubscription", a, null, Collections.singletonList(orp0.f), 4);
                }
                return zy11Var;
        }
    }

    public /* synthetic */ hv01(TransfersDashboardFragment transfersDashboardFragment, int i) {
        this.a = i;
        this.b = transfersDashboardFragment;
    }
}

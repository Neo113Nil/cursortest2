package defpackage;

import android.net.Uri;
import com.ybsdk.feature.dashboard.internal.domain.entities.TopButtonTag;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class mjg implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DashboardFragment b;

    public /* synthetic */ mjg(DashboardFragment dashboardFragment, int i) {
        this.a = i;
        this.b = dashboardFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean adapter$lambda$2;
        zy11 zy11Var;
        int i = this.a;
        DashboardFragment dashboardFragment = this.b;
        switch (i) {
            case 0:
                adapter$lambda$2 = DashboardFragment.adapter$lambda$2(dashboardFragment, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(adapter$lambda$2);
            default:
                zy11Var = DashboardFragment.topButtonAdapter$lambda$4(dashboardFragment, (String) obj, (TopButtonTag) obj2);
                return zy11Var;
        }
    }
}

package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class cmg implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DashboardV3Fragment b;

    public /* synthetic */ cmg(DashboardV3Fragment dashboardV3Fragment, int i) {
        this.a = i;
        this.b = dashboardV3Fragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 onViewCreated$lambda$18;
        boolean widgetsAdapter_delegate$lambda$9$lambda$5;
        int i = this.a;
        DashboardV3Fragment dashboardV3Fragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$18 = DashboardV3Fragment.onViewCreated$lambda$18(dashboardV3Fragment, (String) obj, (Bundle) obj2);
                return onViewCreated$lambda$18;
            default:
                widgetsAdapter_delegate$lambda$9$lambda$5 = DashboardV3Fragment.widgetsAdapter_delegate$lambda$9$lambda$5(dashboardV3Fragment, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(widgetsAdapter_delegate$lambda$9$lambda$5);
        }
    }
}

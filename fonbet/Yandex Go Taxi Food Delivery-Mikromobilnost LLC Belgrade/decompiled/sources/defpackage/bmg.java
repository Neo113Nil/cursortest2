package defpackage;

import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class bmg implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DashboardV3Fragment b;

    public /* synthetic */ bmg(DashboardV3Fragment dashboardV3Fragment, int i) {
        this.a = i;
        this.b = dashboardV3Fragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 leftToolbarButtonAdapter_delegate$lambda$2$lambda$1;
        zy11 rightToolbarButtonAdapter_delegate$lambda$4$lambda$3;
        r0 r0Var;
        Object value;
        int i = this.a;
        DashboardV3Fragment dashboardV3Fragment = this.b;
        switch (i) {
            case 0:
                leftToolbarButtonAdapter_delegate$lambda$2$lambda$1 = DashboardV3Fragment.leftToolbarButtonAdapter_delegate$lambda$2$lambda$1(dashboardV3Fragment, (qsz0) obj);
                return leftToolbarButtonAdapter_delegate$lambda$2$lambda$1;
            case 1:
                rightToolbarButtonAdapter_delegate$lambda$4$lambda$3 = DashboardV3Fragment.rightToolbarButtonAdapter_delegate$lambda$4$lambda$3(dashboardV3Fragment, (qsz0) obj);
                return rightToolbarButtonAdapter_delegate$lambda$4$lambda$3;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                pz40 Y = DashboardV3Fragment.access$getViewModel(dashboardV3Fragment).Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, nmg.a((nmg) value, null, null, false, false, false, booleanValue, false, null, 7679)));
                return zy11.a;
        }
    }
}

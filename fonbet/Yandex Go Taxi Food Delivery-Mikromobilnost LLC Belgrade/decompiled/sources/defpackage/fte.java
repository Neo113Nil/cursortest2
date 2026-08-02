package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.analytics.B2BAccountFlowAnalytics$B2BNavigatorModalButtonType;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class fte implements yt11 {
    public final r0 a;
    public final mth b;

    public fte() {
        r0 c = bvf0.c(null);
        this.a = c;
        this.b = new mth(c, 6);
    }

    public static B2BAccountFlowAnalytics$B2BNavigatorModalButtonType b(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type) {
        int i = ete.a[corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type.ordinal()];
        if (i == 1) {
            return B2BAccountFlowAnalytics$B2BNavigatorModalButtonType.AddCompany;
        }
        if (i == 2) {
            return B2BAccountFlowAnalytics$B2BNavigatorModalButtonType.EmployeeAccess;
        }
        if (i == 3) {
            return B2BAccountFlowAnalytics$B2BNavigatorModalButtonType.RestoreAccess;
        }
        if (i == 4) {
            return B2BAccountFlowAnalytics$B2BNavigatorModalButtonType.HireDriver;
        }
        if (i == 5) {
            return null;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.b;
    }
}

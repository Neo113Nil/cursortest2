package com.yandex.go.payments.shared.business.accountcreation.corp.experiment;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class n extends xqt {
    public static final n e = new n();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, o.INSTANCE.serializer(), qoi0.a(o.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("add_company", CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$AddCompanyButton.Companion.serializer(), qoi0.a(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$AddCompanyButton.class)), new f9("employee_access", CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$EmployeeAccessButton.Companion.serializer(), qoi0.a(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$EmployeeAccessButton.class)), new f9("restore_access", CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$RestoreAccessButton.Companion.serializer(), qoi0.a(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$RestoreAccessButton.class)), new f9("hire_driver", CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$HireDriverButton.Companion.serializer(), qoi0.a(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$HireDriverButton.class)));
    }
}

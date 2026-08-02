package com.yandex.go.payments.shared.business.accountcreation.corp.experiment;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type", "", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type;", "ADD_COMPANY", "EMPLOYEE_ACCESS", "RESTORE_ACCESS", "HIRE_DRIVER", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type[] $VALUES;
    public static final CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type ADD_COMPANY;
    public static final CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type EMPLOYEE_ACCESS;
    public static final CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type HIRE_DRIVER;
    public static final CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type RESTORE_ACCESS;
    public static final CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type UNKNOWN;

    static {
        CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type = new CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type("ADD_COMPANY", 0);
        ADD_COMPANY = corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type;
        CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type2 = new CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type("EMPLOYEE_ACCESS", 1);
        EMPLOYEE_ACCESS = corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type2;
        CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type3 = new CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type("RESTORE_ACCESS", 2);
        RESTORE_ACCESS = corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type3;
        CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type4 = new CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type("HIRE_DRIVER", 3);
        HIRE_DRIVER = corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type4;
        CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type5 = new CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type("UNKNOWN", 4);
        UNKNOWN = corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type5;
        CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type[] corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$TypeArr = {corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type, corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type2, corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type3, corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type4, corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type5};
        $VALUES = corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$TypeArr;
        $ENTRIES = kotlin.enums.a.a(corpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$TypeArr);
    }

    public static CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type valueOf(String str) {
        return (CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type) Enum.valueOf(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type.class, str);
    }

    public static CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type[] values() {
        return (CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type[]) $VALUES.clone();
    }
}

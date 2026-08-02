package com.yandex.passport.internal.report.reporters;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/passport/internal/report/reporters/EsiaBindingReporter$FinishStatus", "", "Lcom/yandex/passport/internal/report/reporters/EsiaBindingReporter$FinishStatus;", "SUCCESS", "CANCELLED", "ERROR", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EsiaBindingReporter$FinishStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EsiaBindingReporter$FinishStatus[] $VALUES;
    public static final EsiaBindingReporter$FinishStatus CANCELLED;
    public static final EsiaBindingReporter$FinishStatus ERROR;
    public static final EsiaBindingReporter$FinishStatus SUCCESS;

    static {
        EsiaBindingReporter$FinishStatus esiaBindingReporter$FinishStatus = new EsiaBindingReporter$FinishStatus("SUCCESS", 0);
        SUCCESS = esiaBindingReporter$FinishStatus;
        EsiaBindingReporter$FinishStatus esiaBindingReporter$FinishStatus2 = new EsiaBindingReporter$FinishStatus("CANCELLED", 1);
        CANCELLED = esiaBindingReporter$FinishStatus2;
        EsiaBindingReporter$FinishStatus esiaBindingReporter$FinishStatus3 = new EsiaBindingReporter$FinishStatus("ERROR", 2);
        ERROR = esiaBindingReporter$FinishStatus3;
        EsiaBindingReporter$FinishStatus[] esiaBindingReporter$FinishStatusArr = {esiaBindingReporter$FinishStatus, esiaBindingReporter$FinishStatus2, esiaBindingReporter$FinishStatus3};
        $VALUES = esiaBindingReporter$FinishStatusArr;
        $ENTRIES = kotlin.enums.a.a(esiaBindingReporter$FinishStatusArr);
    }

    public static EsiaBindingReporter$FinishStatus valueOf(String str) {
        return (EsiaBindingReporter$FinishStatus) Enum.valueOf(EsiaBindingReporter$FinishStatus.class, str);
    }

    public static EsiaBindingReporter$FinishStatus[] values() {
        return (EsiaBindingReporter$FinishStatus[]) $VALUES.clone();
    }
}

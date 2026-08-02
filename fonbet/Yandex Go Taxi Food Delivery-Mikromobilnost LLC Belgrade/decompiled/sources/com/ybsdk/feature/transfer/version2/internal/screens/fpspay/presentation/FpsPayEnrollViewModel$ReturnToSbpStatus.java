package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/fpspay/presentation/FpsPayEnrollViewModel$ReturnToSbpStatus", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/fpspay/presentation/FpsPayEnrollViewModel$ReturnToSbpStatus;", "", TarifficatorScenarioActivity.RESULT_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "FAILED", "SUCCESS", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FpsPayEnrollViewModel$ReturnToSbpStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FpsPayEnrollViewModel$ReturnToSbpStatus[] $VALUES;
    public static final FpsPayEnrollViewModel$ReturnToSbpStatus FAILED = new FpsPayEnrollViewModel$ReturnToSbpStatus("FAILED", 0, "failed");
    public static final FpsPayEnrollViewModel$ReturnToSbpStatus SUCCESS = new FpsPayEnrollViewModel$ReturnToSbpStatus("SUCCESS", 1, "success");
    private final String result;

    private static final /* synthetic */ FpsPayEnrollViewModel$ReturnToSbpStatus[] $values() {
        return new FpsPayEnrollViewModel$ReturnToSbpStatus[]{FAILED, SUCCESS};
    }

    static {
        FpsPayEnrollViewModel$ReturnToSbpStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FpsPayEnrollViewModel$ReturnToSbpStatus(String str, int i, String str2) {
        this.result = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FpsPayEnrollViewModel$ReturnToSbpStatus valueOf(String str) {
        return (FpsPayEnrollViewModel$ReturnToSbpStatus) Enum.valueOf(FpsPayEnrollViewModel$ReturnToSbpStatus.class, str);
    }

    public static FpsPayEnrollViewModel$ReturnToSbpStatus[] values() {
        return (FpsPayEnrollViewModel$ReturnToSbpStatus[]) $VALUES.clone();
    }

    public final String getResult() {
        return this.result;
    }
}

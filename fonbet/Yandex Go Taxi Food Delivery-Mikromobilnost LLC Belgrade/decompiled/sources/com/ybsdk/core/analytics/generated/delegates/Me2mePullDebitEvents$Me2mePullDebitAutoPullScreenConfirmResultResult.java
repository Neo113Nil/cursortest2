package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult", "", "Lcom/ybsdk/core/analytics/generated/delegates/Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "OK", "ERROR", "TWO_FA", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult[] $VALUES;
    private final String originalValue;
    public static final Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult OK = new Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult("OK", 0, WriteBlocks.OK);
    public static final Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult ERROR = new Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult("ERROR", 1, "error");
    public static final Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult TWO_FA = new Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult("TWO_FA", 2, "two_fa");

    private static final /* synthetic */ Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult[] $values() {
        return new Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult[]{OK, ERROR, TWO_FA};
    }

    static {
        Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult valueOf(String str) {
        return (Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult) Enum.valueOf(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult.class, str);
    }

    public static Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult[] values() {
        return (Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}

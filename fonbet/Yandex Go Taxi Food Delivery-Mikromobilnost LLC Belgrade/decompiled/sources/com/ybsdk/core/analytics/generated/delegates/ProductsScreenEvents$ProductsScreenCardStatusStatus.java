package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/ProductsScreenEvents$ProductsScreenCardStatusStatus", "", "Lcom/ybsdk/core/analytics/generated/delegates/ProductsScreenEvents$ProductsScreenCardStatusStatus;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "EXISTED_ISSUED", "EXISTED", "EXISTED_FEATURED", "ABSENT", "LOADING", "ISSUE_FAILED", "ERROR", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsScreenEvents$ProductsScreenCardStatusStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductsScreenEvents$ProductsScreenCardStatusStatus[] $VALUES;
    private final String originalValue;
    public static final ProductsScreenEvents$ProductsScreenCardStatusStatus EXISTED_ISSUED = new ProductsScreenEvents$ProductsScreenCardStatusStatus("EXISTED_ISSUED", 0, "existed_issued");
    public static final ProductsScreenEvents$ProductsScreenCardStatusStatus EXISTED = new ProductsScreenEvents$ProductsScreenCardStatusStatus("EXISTED", 1, "existed");
    public static final ProductsScreenEvents$ProductsScreenCardStatusStatus EXISTED_FEATURED = new ProductsScreenEvents$ProductsScreenCardStatusStatus("EXISTED_FEATURED", 2, "existed_featured");
    public static final ProductsScreenEvents$ProductsScreenCardStatusStatus ABSENT = new ProductsScreenEvents$ProductsScreenCardStatusStatus("ABSENT", 3, "absent");
    public static final ProductsScreenEvents$ProductsScreenCardStatusStatus LOADING = new ProductsScreenEvents$ProductsScreenCardStatusStatus("LOADING", 4, ResultType.RESULT_TYPE_LOADING);
    public static final ProductsScreenEvents$ProductsScreenCardStatusStatus ISSUE_FAILED = new ProductsScreenEvents$ProductsScreenCardStatusStatus("ISSUE_FAILED", 5, "issue_failed");
    public static final ProductsScreenEvents$ProductsScreenCardStatusStatus ERROR = new ProductsScreenEvents$ProductsScreenCardStatusStatus("ERROR", 6, "error");

    private static final /* synthetic */ ProductsScreenEvents$ProductsScreenCardStatusStatus[] $values() {
        return new ProductsScreenEvents$ProductsScreenCardStatusStatus[]{EXISTED_ISSUED, EXISTED, EXISTED_FEATURED, ABSENT, LOADING, ISSUE_FAILED, ERROR};
    }

    static {
        ProductsScreenEvents$ProductsScreenCardStatusStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProductsScreenEvents$ProductsScreenCardStatusStatus(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProductsScreenEvents$ProductsScreenCardStatusStatus valueOf(String str) {
        return (ProductsScreenEvents$ProductsScreenCardStatusStatus) Enum.valueOf(ProductsScreenEvents$ProductsScreenCardStatusStatus.class, str);
    }

    public static ProductsScreenEvents$ProductsScreenCardStatusStatus[] values() {
        return (ProductsScreenEvents$ProductsScreenCardStatusStatus[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}

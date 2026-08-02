package com.ybsdk.feature.savings.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/ybsdk/feature/savings/internal/entities/FundRequestStatusSuccessResponseEntity$ResultScreen$Type", "", "Lcom/ybsdk/feature/savings/internal/entities/FundRequestStatusSuccessResponseEntity$ResultScreen$Type;", "<init>", "(Ljava/lang/String;I)V", "POLLING_TIMEOUT", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundRequestStatusSuccessResponseEntity$ResultScreen$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FundRequestStatusSuccessResponseEntity$ResultScreen$Type[] $VALUES;
    public static final FundRequestStatusSuccessResponseEntity$ResultScreen$Type POLLING_TIMEOUT = new FundRequestStatusSuccessResponseEntity$ResultScreen$Type("POLLING_TIMEOUT", 0);

    private static final /* synthetic */ FundRequestStatusSuccessResponseEntity$ResultScreen$Type[] $values() {
        return new FundRequestStatusSuccessResponseEntity$ResultScreen$Type[]{POLLING_TIMEOUT};
    }

    static {
        FundRequestStatusSuccessResponseEntity$ResultScreen$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FundRequestStatusSuccessResponseEntity$ResultScreen$Type(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FundRequestStatusSuccessResponseEntity$ResultScreen$Type valueOf(String str) {
        return (FundRequestStatusSuccessResponseEntity$ResultScreen$Type) Enum.valueOf(FundRequestStatusSuccessResponseEntity$ResultScreen$Type.class, str);
    }

    public static FundRequestStatusSuccessResponseEntity$ResultScreen$Type[] values() {
        return (FundRequestStatusSuccessResponseEntity$ResultScreen$Type[]) $VALUES.clone();
    }
}

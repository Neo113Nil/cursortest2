package com.ybsdk.api.pro;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/api/pro/CardActivationCallback$ActivationResult", "", "Lcom/ybsdk/api/pro/CardActivationCallback$ActivationResult;", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardActivationCallback$ActivationResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardActivationCallback$ActivationResult[] $VALUES;
    public static final CardActivationCallback$ActivationResult SUCCESS = new CardActivationCallback$ActivationResult("SUCCESS", 0);
    public static final CardActivationCallback$ActivationResult FAIL = new CardActivationCallback$ActivationResult("FAIL", 1);

    private static final /* synthetic */ CardActivationCallback$ActivationResult[] $values() {
        return new CardActivationCallback$ActivationResult[]{SUCCESS, FAIL};
    }

    static {
        CardActivationCallback$ActivationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardActivationCallback$ActivationResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardActivationCallback$ActivationResult valueOf(String str) {
        return (CardActivationCallback$ActivationResult) Enum.valueOf(CardActivationCallback$ActivationResult.class, str);
    }

    public static CardActivationCallback$ActivationResult[] values() {
        return (CardActivationCallback$ActivationResult[]) $VALUES.clone();
    }
}

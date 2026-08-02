package com.yandex.go.platform.sdk.models;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/platform/sdk/models/PhonishUpgradeResult;", "", "(Ljava/lang/String;I)V", "OK", "FAILURE", "CANCELLED", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhonishUpgradeResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhonishUpgradeResult[] $VALUES;
    public static final PhonishUpgradeResult OK = new PhonishUpgradeResult("OK", 0);
    public static final PhonishUpgradeResult FAILURE = new PhonishUpgradeResult("FAILURE", 1);
    public static final PhonishUpgradeResult CANCELLED = new PhonishUpgradeResult("CANCELLED", 2);

    private static final /* synthetic */ PhonishUpgradeResult[] $values() {
        return new PhonishUpgradeResult[]{OK, FAILURE, CANCELLED};
    }

    static {
        PhonishUpgradeResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PhonishUpgradeResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PhonishUpgradeResult valueOf(String str) {
        return (PhonishUpgradeResult) Enum.valueOf(PhonishUpgradeResult.class, str);
    }

    public static PhonishUpgradeResult[] values() {
        return (PhonishUpgradeResult[]) $VALUES.clone();
    }
}

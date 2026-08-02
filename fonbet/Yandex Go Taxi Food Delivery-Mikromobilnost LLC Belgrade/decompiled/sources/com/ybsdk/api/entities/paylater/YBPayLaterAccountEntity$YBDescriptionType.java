package com.ybsdk.api.entities.paylater;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/api/entities/paylater/YBPayLaterAccountEntity$YBDescriptionType", "", "Lcom/ybsdk/api/entities/paylater/YBPayLaterAccountEntity$YBDescriptionType;", "<init>", "(Ljava/lang/String;I)V", "INFO", "WARNING", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBPayLaterAccountEntity$YBDescriptionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBPayLaterAccountEntity$YBDescriptionType[] $VALUES;
    public static final YBPayLaterAccountEntity$YBDescriptionType INFO = new YBPayLaterAccountEntity$YBDescriptionType("INFO", 0);
    public static final YBPayLaterAccountEntity$YBDescriptionType WARNING = new YBPayLaterAccountEntity$YBDescriptionType("WARNING", 1);

    private static final /* synthetic */ YBPayLaterAccountEntity$YBDescriptionType[] $values() {
        return new YBPayLaterAccountEntity$YBDescriptionType[]{INFO, WARNING};
    }

    static {
        YBPayLaterAccountEntity$YBDescriptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBPayLaterAccountEntity$YBDescriptionType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBPayLaterAccountEntity$YBDescriptionType valueOf(String str) {
        return (YBPayLaterAccountEntity$YBDescriptionType) Enum.valueOf(YBPayLaterAccountEntity$YBDescriptionType.class, str);
    }

    public static YBPayLaterAccountEntity$YBDescriptionType[] values() {
        return (YBPayLaterAccountEntity$YBDescriptionType[]) $VALUES.clone();
    }
}

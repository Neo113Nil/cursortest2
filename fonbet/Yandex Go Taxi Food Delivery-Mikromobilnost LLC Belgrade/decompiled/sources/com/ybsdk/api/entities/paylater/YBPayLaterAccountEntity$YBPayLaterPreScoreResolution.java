package com.ybsdk.api.entities.paylater;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/api/entities/paylater/YBPayLaterAccountEntity$YBPayLaterPreScoreResolution", "", "Lcom/ybsdk/api/entities/paylater/YBPayLaterAccountEntity$YBPayLaterPreScoreResolution;", "<init>", "(Ljava/lang/String;I)V", "ALLOW", "DENY", "COMPLETED", "BLOCKED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBPayLaterAccountEntity$YBPayLaterPreScoreResolution {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBPayLaterAccountEntity$YBPayLaterPreScoreResolution[] $VALUES;
    public static final YBPayLaterAccountEntity$YBPayLaterPreScoreResolution ALLOW = new YBPayLaterAccountEntity$YBPayLaterPreScoreResolution("ALLOW", 0);
    public static final YBPayLaterAccountEntity$YBPayLaterPreScoreResolution DENY = new YBPayLaterAccountEntity$YBPayLaterPreScoreResolution("DENY", 1);
    public static final YBPayLaterAccountEntity$YBPayLaterPreScoreResolution COMPLETED = new YBPayLaterAccountEntity$YBPayLaterPreScoreResolution("COMPLETED", 2);
    public static final YBPayLaterAccountEntity$YBPayLaterPreScoreResolution BLOCKED = new YBPayLaterAccountEntity$YBPayLaterPreScoreResolution("BLOCKED", 3);

    private static final /* synthetic */ YBPayLaterAccountEntity$YBPayLaterPreScoreResolution[] $values() {
        return new YBPayLaterAccountEntity$YBPayLaterPreScoreResolution[]{ALLOW, DENY, COMPLETED, BLOCKED};
    }

    static {
        YBPayLaterAccountEntity$YBPayLaterPreScoreResolution[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBPayLaterAccountEntity$YBPayLaterPreScoreResolution(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBPayLaterAccountEntity$YBPayLaterPreScoreResolution valueOf(String str) {
        return (YBPayLaterAccountEntity$YBPayLaterPreScoreResolution) Enum.valueOf(YBPayLaterAccountEntity$YBPayLaterPreScoreResolution.class, str);
    }

    public static YBPayLaterAccountEntity$YBPayLaterPreScoreResolution[] values() {
        return (YBPayLaterAccountEntity$YBPayLaterPreScoreResolution[]) $VALUES.clone();
    }
}

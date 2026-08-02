package com.ybsdk.feature.dashboard.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/dashboard/api/model/SupportState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "HAS_UNREAD_MESSAGES", "feature-dashboard-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SupportState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportState[] $VALUES;
    public static final SupportState DEFAULT = new SupportState("DEFAULT", 0);
    public static final SupportState HAS_UNREAD_MESSAGES = new SupportState("HAS_UNREAD_MESSAGES", 1);

    private static final /* synthetic */ SupportState[] $values() {
        return new SupportState[]{DEFAULT, HAS_UNREAD_MESSAGES};
    }

    static {
        SupportState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SupportState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SupportState valueOf(String str) {
        return (SupportState) Enum.valueOf(SupportState.class, str);
    }

    public static SupportState[] values() {
        return (SupportState[]) $VALUES.clone();
    }
}

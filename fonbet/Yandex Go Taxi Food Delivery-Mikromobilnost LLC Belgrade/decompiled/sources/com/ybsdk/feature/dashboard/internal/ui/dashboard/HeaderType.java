package com.ybsdk.feature.dashboard.internal.ui.dashboard;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard/HeaderType;", "", "<init>", "(Ljava/lang/String;I)V", "PLUS_BALANCE", "ACCOUNT_HEADER", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HeaderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HeaderType[] $VALUES;
    public static final HeaderType PLUS_BALANCE = new HeaderType("PLUS_BALANCE", 0);
    public static final HeaderType ACCOUNT_HEADER = new HeaderType("ACCOUNT_HEADER", 1);

    private static final /* synthetic */ HeaderType[] $values() {
        return new HeaderType[]{PLUS_BALANCE, ACCOUNT_HEADER};
    }

    static {
        HeaderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private HeaderType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static HeaderType valueOf(String str) {
        return (HeaderType) Enum.valueOf(HeaderType.class, str);
    }

    public static HeaderType[] values() {
        return (HeaderType[]) $VALUES.clone();
    }
}

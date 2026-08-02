package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TechEvents$TechOverlayContentSkipReason", "", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechOverlayContentSkipReason;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SHOW_TASK_IN_PROGRESS", "FORBIDDEN_BY_POLICY", "ANOTHER_VIEW_SHOWING", "NO_ACTION", "WRONG_DEEPLINK", "NAVIGATION_ERROR", "CANCELLED", "NO_TARGET_VIEW", "NO_HOLDER_VIEW", "ALREADY_SHOWING", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TechEvents$TechOverlayContentSkipReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TechEvents$TechOverlayContentSkipReason[] $VALUES;
    private final String originalValue;
    public static final TechEvents$TechOverlayContentSkipReason SHOW_TASK_IN_PROGRESS = new TechEvents$TechOverlayContentSkipReason("SHOW_TASK_IN_PROGRESS", 0, "show_task_in_progress");
    public static final TechEvents$TechOverlayContentSkipReason FORBIDDEN_BY_POLICY = new TechEvents$TechOverlayContentSkipReason("FORBIDDEN_BY_POLICY", 1, "forbidden_by_policy");
    public static final TechEvents$TechOverlayContentSkipReason ANOTHER_VIEW_SHOWING = new TechEvents$TechOverlayContentSkipReason("ANOTHER_VIEW_SHOWING", 2, "another_view_showing");
    public static final TechEvents$TechOverlayContentSkipReason NO_ACTION = new TechEvents$TechOverlayContentSkipReason("NO_ACTION", 3, "no_action");
    public static final TechEvents$TechOverlayContentSkipReason WRONG_DEEPLINK = new TechEvents$TechOverlayContentSkipReason("WRONG_DEEPLINK", 4, "wrong_deeplink");
    public static final TechEvents$TechOverlayContentSkipReason NAVIGATION_ERROR = new TechEvents$TechOverlayContentSkipReason("NAVIGATION_ERROR", 5, "navigation_error");
    public static final TechEvents$TechOverlayContentSkipReason CANCELLED = new TechEvents$TechOverlayContentSkipReason("CANCELLED", 6, "cancelled");
    public static final TechEvents$TechOverlayContentSkipReason NO_TARGET_VIEW = new TechEvents$TechOverlayContentSkipReason("NO_TARGET_VIEW", 7, "no_target_view");
    public static final TechEvents$TechOverlayContentSkipReason NO_HOLDER_VIEW = new TechEvents$TechOverlayContentSkipReason("NO_HOLDER_VIEW", 8, "no_holder_view");
    public static final TechEvents$TechOverlayContentSkipReason ALREADY_SHOWING = new TechEvents$TechOverlayContentSkipReason("ALREADY_SHOWING", 9, "already_showing");

    private static final /* synthetic */ TechEvents$TechOverlayContentSkipReason[] $values() {
        return new TechEvents$TechOverlayContentSkipReason[]{SHOW_TASK_IN_PROGRESS, FORBIDDEN_BY_POLICY, ANOTHER_VIEW_SHOWING, NO_ACTION, WRONG_DEEPLINK, NAVIGATION_ERROR, CANCELLED, NO_TARGET_VIEW, NO_HOLDER_VIEW, ALREADY_SHOWING};
    }

    static {
        TechEvents$TechOverlayContentSkipReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TechEvents$TechOverlayContentSkipReason(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TechEvents$TechOverlayContentSkipReason valueOf(String str) {
        return (TechEvents$TechOverlayContentSkipReason) Enum.valueOf(TechEvents$TechOverlayContentSkipReason.class, str);
    }

    public static TechEvents$TechOverlayContentSkipReason[] values() {
        return (TechEvents$TechOverlayContentSkipReason[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}

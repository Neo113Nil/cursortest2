package com.yandex.go.analytics.view_tracking;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"com/yandex/go/analytics/view_tracking/ViewVisibilityTracker$SingleState", "", "Lcom/yandex/go/analytics/view_tracking/ViewVisibilityTracker$SingleState;", "Initial", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewVisibilityTracker$SingleState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ViewVisibilityTracker$SingleState[] $VALUES;
    public static final ViewVisibilityTracker$SingleState Initial;

    static {
        ViewVisibilityTracker$SingleState viewVisibilityTracker$SingleState = new ViewVisibilityTracker$SingleState("Initial", 0);
        Initial = viewVisibilityTracker$SingleState;
        ViewVisibilityTracker$SingleState[] viewVisibilityTracker$SingleStateArr = {viewVisibilityTracker$SingleState};
        $VALUES = viewVisibilityTracker$SingleStateArr;
        $ENTRIES = kotlin.enums.a.a(viewVisibilityTracker$SingleStateArr);
    }

    public static ViewVisibilityTracker$SingleState valueOf(String str) {
        return (ViewVisibilityTracker$SingleState) Enum.valueOf(ViewVisibilityTracker$SingleState.class, str);
    }

    public static ViewVisibilityTracker$SingleState[] values() {
        return (ViewVisibilityTracker$SingleState[]) $VALUES.clone();
    }
}

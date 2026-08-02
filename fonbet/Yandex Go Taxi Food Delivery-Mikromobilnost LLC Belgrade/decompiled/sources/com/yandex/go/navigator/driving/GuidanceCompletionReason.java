package com.yandex.go.navigator.driving;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/driving/GuidanceCompletionReason;", "", "END_OF_ROUTE_ACHIEVED", "COMPLETED_BY_USER", "GUIDANCE_ROUTE_IS_NULL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GuidanceCompletionReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GuidanceCompletionReason[] $VALUES;
    public static final GuidanceCompletionReason COMPLETED_BY_USER;
    public static final GuidanceCompletionReason END_OF_ROUTE_ACHIEVED;
    public static final GuidanceCompletionReason GUIDANCE_ROUTE_IS_NULL;

    static {
        GuidanceCompletionReason guidanceCompletionReason = new GuidanceCompletionReason("END_OF_ROUTE_ACHIEVED", 0);
        END_OF_ROUTE_ACHIEVED = guidanceCompletionReason;
        GuidanceCompletionReason guidanceCompletionReason2 = new GuidanceCompletionReason("COMPLETED_BY_USER", 1);
        COMPLETED_BY_USER = guidanceCompletionReason2;
        GuidanceCompletionReason guidanceCompletionReason3 = new GuidanceCompletionReason("GUIDANCE_ROUTE_IS_NULL", 2);
        GUIDANCE_ROUTE_IS_NULL = guidanceCompletionReason3;
        GuidanceCompletionReason[] guidanceCompletionReasonArr = {guidanceCompletionReason, guidanceCompletionReason2, guidanceCompletionReason3};
        $VALUES = guidanceCompletionReasonArr;
        $ENTRIES = kotlin.enums.a.a(guidanceCompletionReasonArr);
    }

    public static GuidanceCompletionReason valueOf(String str) {
        return (GuidanceCompletionReason) Enum.valueOf(GuidanceCompletionReason.class, str);
    }

    public static GuidanceCompletionReason[] values() {
        return (GuidanceCompletionReason[]) $VALUES.clone();
    }
}

package com.yandex.plus.home.feature.webviews.internal.overlap;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/feature/webviews/internal/overlap/ViewOverlappingDetector$State", "", "Lcom/yandex/plus/home/feature/webviews/internal/overlap/ViewOverlappingDetector$State;", "VIEW_IS_OVERLAPPED", "VIEW_IS_NOT_OVERLAPPED", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewOverlappingDetector$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ViewOverlappingDetector$State[] $VALUES;
    public static final ViewOverlappingDetector$State VIEW_IS_NOT_OVERLAPPED;
    public static final ViewOverlappingDetector$State VIEW_IS_OVERLAPPED;

    static {
        ViewOverlappingDetector$State viewOverlappingDetector$State = new ViewOverlappingDetector$State("VIEW_IS_OVERLAPPED", 0);
        VIEW_IS_OVERLAPPED = viewOverlappingDetector$State;
        ViewOverlappingDetector$State viewOverlappingDetector$State2 = new ViewOverlappingDetector$State("VIEW_IS_NOT_OVERLAPPED", 1);
        VIEW_IS_NOT_OVERLAPPED = viewOverlappingDetector$State2;
        ViewOverlappingDetector$State[] viewOverlappingDetector$StateArr = {viewOverlappingDetector$State, viewOverlappingDetector$State2};
        $VALUES = viewOverlappingDetector$StateArr;
        $ENTRIES = a.a(viewOverlappingDetector$StateArr);
    }

    public static ViewOverlappingDetector$State valueOf(String str) {
        return (ViewOverlappingDetector$State) Enum.valueOf(ViewOverlappingDetector$State.class, str);
    }

    public static ViewOverlappingDetector$State[] values() {
        return (ViewOverlappingDetector$State[]) $VALUES.clone();
    }
}

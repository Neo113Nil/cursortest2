package com.yandex.go.search.router;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/search/router/FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection", "", "Lcom/yandex/go/search/router/FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;", "FORWARD", "BACKWARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection[] $VALUES;
    public static final FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection BACKWARD;
    public static final FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection FORWARD;

    static {
        FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection = new FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection("FORWARD", 0);
        FORWARD = fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
        FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection2 = new FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection("BACKWARD", 1);
        BACKWARD = fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection2;
        FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection[] fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirectionArr = {fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection, fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection2};
        $VALUES = fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirectionArr;
        $ENTRIES = a.a(fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirectionArr);
    }

    public static FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection valueOf(String str) {
        return (FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection) Enum.valueOf(FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection.class, str);
    }

    public static FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection[] values() {
        return (FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection[]) $VALUES.clone();
    }
}

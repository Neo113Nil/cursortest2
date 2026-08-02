package com.yandex.go.navigator.analitycs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/navigator/analitycs/NavigatorRevealCardAnalytics$DrivingModalState", "", "Lcom/yandex/go/navigator/analitycs/NavigatorRevealCardAnalytics$DrivingModalState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Expanded", "Collapsed", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigatorRevealCardAnalytics$DrivingModalState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigatorRevealCardAnalytics$DrivingModalState[] $VALUES;
    public static final NavigatorRevealCardAnalytics$DrivingModalState Collapsed;
    public static final NavigatorRevealCardAnalytics$DrivingModalState Expanded;
    private final String eventValue;

    static {
        NavigatorRevealCardAnalytics$DrivingModalState navigatorRevealCardAnalytics$DrivingModalState = new NavigatorRevealCardAnalytics$DrivingModalState("Expanded", 0, "expanded");
        Expanded = navigatorRevealCardAnalytics$DrivingModalState;
        NavigatorRevealCardAnalytics$DrivingModalState navigatorRevealCardAnalytics$DrivingModalState2 = new NavigatorRevealCardAnalytics$DrivingModalState("Collapsed", 1, "collapsed");
        Collapsed = navigatorRevealCardAnalytics$DrivingModalState2;
        NavigatorRevealCardAnalytics$DrivingModalState[] navigatorRevealCardAnalytics$DrivingModalStateArr = {navigatorRevealCardAnalytics$DrivingModalState, navigatorRevealCardAnalytics$DrivingModalState2};
        $VALUES = navigatorRevealCardAnalytics$DrivingModalStateArr;
        $ENTRIES = kotlin.enums.a.a(navigatorRevealCardAnalytics$DrivingModalStateArr);
    }

    public NavigatorRevealCardAnalytics$DrivingModalState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static NavigatorRevealCardAnalytics$DrivingModalState valueOf(String str) {
        return (NavigatorRevealCardAnalytics$DrivingModalState) Enum.valueOf(NavigatorRevealCardAnalytics$DrivingModalState.class, str);
    }

    public static NavigatorRevealCardAnalytics$DrivingModalState[] values() {
        return (NavigatorRevealCardAnalytics$DrivingModalState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}

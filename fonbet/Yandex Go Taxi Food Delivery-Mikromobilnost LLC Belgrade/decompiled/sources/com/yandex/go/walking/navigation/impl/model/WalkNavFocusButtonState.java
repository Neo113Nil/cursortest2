package com.yandex.go.walking.navigation.impl.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/model/WalkNavFocusButtonState;", "", "FOCUS_ROUTE", "FOCUS_USER_LOCATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalkNavFocusButtonState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WalkNavFocusButtonState[] $VALUES;
    public static final WalkNavFocusButtonState FOCUS_ROUTE;
    public static final WalkNavFocusButtonState FOCUS_USER_LOCATION;

    static {
        WalkNavFocusButtonState walkNavFocusButtonState = new WalkNavFocusButtonState("FOCUS_ROUTE", 0);
        FOCUS_ROUTE = walkNavFocusButtonState;
        WalkNavFocusButtonState walkNavFocusButtonState2 = new WalkNavFocusButtonState("FOCUS_USER_LOCATION", 1);
        FOCUS_USER_LOCATION = walkNavFocusButtonState2;
        WalkNavFocusButtonState[] walkNavFocusButtonStateArr = {walkNavFocusButtonState, walkNavFocusButtonState2};
        $VALUES = walkNavFocusButtonStateArr;
        $ENTRIES = a.a(walkNavFocusButtonStateArr);
    }

    public static WalkNavFocusButtonState valueOf(String str) {
        return (WalkNavFocusButtonState) Enum.valueOf(WalkNavFocusButtonState.class, str);
    }

    public static WalkNavFocusButtonState[] values() {
        return (WalkNavFocusButtonState[]) $VALUES.clone();
    }
}

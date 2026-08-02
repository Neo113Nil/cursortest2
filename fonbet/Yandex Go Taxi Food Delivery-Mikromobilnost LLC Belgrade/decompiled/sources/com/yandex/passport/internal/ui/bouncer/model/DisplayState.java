package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/DisplayState;", "", "Simple", "FirstInGroup", "MidInGroup", "LastInGroup", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DisplayState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DisplayState[] $VALUES;
    public static final DisplayState FirstInGroup;
    public static final DisplayState LastInGroup;
    public static final DisplayState MidInGroup;
    public static final DisplayState Simple;

    static {
        DisplayState displayState = new DisplayState("Simple", 0);
        Simple = displayState;
        DisplayState displayState2 = new DisplayState("FirstInGroup", 1);
        FirstInGroup = displayState2;
        DisplayState displayState3 = new DisplayState("MidInGroup", 2);
        MidInGroup = displayState3;
        DisplayState displayState4 = new DisplayState("LastInGroup", 3);
        LastInGroup = displayState4;
        DisplayState[] displayStateArr = {displayState, displayState2, displayState3, displayState4};
        $VALUES = displayStateArr;
        $ENTRIES = kotlin.enums.a.a(displayStateArr);
    }

    public static DisplayState valueOf(String str) {
        return (DisplayState) Enum.valueOf(DisplayState.class, str);
    }

    public static DisplayState[] values() {
        return (DisplayState[]) $VALUES.clone();
    }
}

package com.yandex.go.walking.navigation.impl.guidance.interactor;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/guidance/interactor/FocusAction;", "", "FOCUS_USER", "FOCUS_ROUTE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FocusAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FocusAction[] $VALUES;
    public static final FocusAction FOCUS_ROUTE;
    public static final FocusAction FOCUS_USER;

    static {
        FocusAction focusAction = new FocusAction("FOCUS_USER", 0);
        FOCUS_USER = focusAction;
        FocusAction focusAction2 = new FocusAction("FOCUS_ROUTE", 1);
        FOCUS_ROUTE = focusAction2;
        FocusAction[] focusActionArr = {focusAction, focusAction2};
        $VALUES = focusActionArr;
        $ENTRIES = kotlin.enums.a.a(focusActionArr);
    }

    public static FocusAction valueOf(String str) {
        return (FocusAction) Enum.valueOf(FocusAction.class, str);
    }

    public static FocusAction[] values() {
        return (FocusAction[]) $VALUES.clone();
    }
}

package com.yandex.go.navigator.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/navigator/domain/FocusMode;", "", "FOLLOWING", "FREE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FocusMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FocusMode[] $VALUES;
    public static final FocusMode FOLLOWING;
    public static final FocusMode FREE;

    static {
        FocusMode focusMode = new FocusMode("FOLLOWING", 0);
        FOLLOWING = focusMode;
        FocusMode focusMode2 = new FocusMode("FREE", 1);
        FREE = focusMode2;
        FocusMode[] focusModeArr = {focusMode, focusMode2};
        $VALUES = focusModeArr;
        $ENTRIES = kotlin.enums.a.a(focusModeArr);
    }

    public static FocusMode valueOf(String str) {
        return (FocusMode) Enum.valueOf(FocusMode.class, str);
    }

    public static FocusMode[] values() {
        return (FocusMode[]) $VALUES.clone();
    }
}

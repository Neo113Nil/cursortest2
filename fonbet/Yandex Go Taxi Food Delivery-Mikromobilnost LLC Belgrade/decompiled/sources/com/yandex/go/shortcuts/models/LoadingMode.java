package com.yandex.go.shortcuts.models;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/models/LoadingMode;", "", "LOADING_ALL", "LOADING_SINGLE", "IDLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadingMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LoadingMode[] $VALUES;
    public static final LoadingMode IDLE;
    public static final LoadingMode LOADING_ALL;
    public static final LoadingMode LOADING_SINGLE;

    static {
        LoadingMode loadingMode = new LoadingMode("LOADING_ALL", 0);
        LOADING_ALL = loadingMode;
        LoadingMode loadingMode2 = new LoadingMode("LOADING_SINGLE", 1);
        LOADING_SINGLE = loadingMode2;
        LoadingMode loadingMode3 = new LoadingMode("IDLE", 2);
        IDLE = loadingMode3;
        LoadingMode[] loadingModeArr = {loadingMode, loadingMode2, loadingMode3};
        $VALUES = loadingModeArr;
        $ENTRIES = kotlin.enums.a.a(loadingModeArr);
    }

    public static LoadingMode valueOf(String str) {
        return (LoadingMode) Enum.valueOf(LoadingMode.class, str);
    }

    public static LoadingMode[] values() {
        return (LoadingMode[]) $VALUES.clone();
    }
}

package com.yandex.go.due_timetable.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due_timetable/domain/model/LoadingState;", "", "NON_BLOCKING_LOADING", "BLOCKING_LOADING", "LOADED", "ERROR", "EMPTY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoadingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LoadingState[] $VALUES;
    public static final LoadingState BLOCKING_LOADING;
    public static final LoadingState EMPTY;
    public static final LoadingState ERROR;
    public static final LoadingState LOADED;
    public static final LoadingState NON_BLOCKING_LOADING;

    static {
        LoadingState loadingState = new LoadingState("NON_BLOCKING_LOADING", 0);
        NON_BLOCKING_LOADING = loadingState;
        LoadingState loadingState2 = new LoadingState("BLOCKING_LOADING", 1);
        BLOCKING_LOADING = loadingState2;
        LoadingState loadingState3 = new LoadingState("LOADED", 2);
        LOADED = loadingState3;
        LoadingState loadingState4 = new LoadingState("ERROR", 3);
        ERROR = loadingState4;
        LoadingState loadingState5 = new LoadingState("EMPTY", 4);
        EMPTY = loadingState5;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4, loadingState5};
        $VALUES = loadingStateArr;
        $ENTRIES = a.a(loadingStateArr);
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) $VALUES.clone();
    }
}

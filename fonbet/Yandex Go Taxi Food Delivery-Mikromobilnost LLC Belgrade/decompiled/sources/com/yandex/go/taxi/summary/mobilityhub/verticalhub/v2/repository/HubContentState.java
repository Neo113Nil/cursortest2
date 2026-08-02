package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.repository;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/HubContentState;", "", "LOADING", "ERROR", "CONTENT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubContentState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HubContentState[] $VALUES;
    public static final HubContentState CONTENT;
    public static final HubContentState ERROR;
    public static final HubContentState LOADING;

    static {
        HubContentState hubContentState = new HubContentState("LOADING", 0);
        LOADING = hubContentState;
        HubContentState hubContentState2 = new HubContentState("ERROR", 1);
        ERROR = hubContentState2;
        HubContentState hubContentState3 = new HubContentState("CONTENT", 2);
        CONTENT = hubContentState3;
        HubContentState[] hubContentStateArr = {hubContentState, hubContentState2, hubContentState3};
        $VALUES = hubContentStateArr;
        $ENTRIES = a.a(hubContentStateArr);
    }

    public static HubContentState valueOf(String str) {
        return (HubContentState) Enum.valueOf(HubContentState.class, str);
    }

    public static HubContentState[] values() {
        return (HubContentState[]) $VALUES.clone();
    }
}

package com.yandex.go.masstransit.sdk.ble.impl.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/impl/domain/ResponseLoadingState;", "", "LOADING", "ERROR", "LOADED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ResponseLoadingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ResponseLoadingState[] $VALUES;
    public static final ResponseLoadingState ERROR;
    public static final ResponseLoadingState LOADED;
    public static final ResponseLoadingState LOADING;

    static {
        ResponseLoadingState responseLoadingState = new ResponseLoadingState("LOADING", 0);
        LOADING = responseLoadingState;
        ResponseLoadingState responseLoadingState2 = new ResponseLoadingState("ERROR", 1);
        ERROR = responseLoadingState2;
        ResponseLoadingState responseLoadingState3 = new ResponseLoadingState("LOADED", 2);
        LOADED = responseLoadingState3;
        ResponseLoadingState[] responseLoadingStateArr = {responseLoadingState, responseLoadingState2, responseLoadingState3};
        $VALUES = responseLoadingStateArr;
        $ENTRIES = kotlin.enums.a.a(responseLoadingStateArr);
    }

    public static ResponseLoadingState valueOf(String str) {
        return (ResponseLoadingState) Enum.valueOf(ResponseLoadingState.class, str);
    }

    public static ResponseLoadingState[] values() {
        return (ResponseLoadingState[]) $VALUES.clone();
    }
}

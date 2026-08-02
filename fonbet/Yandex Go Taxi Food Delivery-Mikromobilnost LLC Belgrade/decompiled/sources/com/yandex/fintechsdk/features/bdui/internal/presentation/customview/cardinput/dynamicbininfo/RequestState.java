package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/dynamicbininfo/RequestState;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FAILED", "PENDING", "SUCCESS", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
final class RequestState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequestState[] $VALUES;
    public static final RequestState FAILED;
    public static final RequestState PENDING;
    public static final RequestState SUCCESS;
    private final String value;

    static {
        RequestState requestState = new RequestState("FAILED", 0, "failed");
        FAILED = requestState;
        RequestState requestState2 = new RequestState("PENDING", 1, "pending");
        PENDING = requestState2;
        RequestState requestState3 = new RequestState("SUCCESS", 2, "success");
        SUCCESS = requestState3;
        RequestState[] requestStateArr = {requestState, requestState2, requestState3};
        $VALUES = requestStateArr;
        $ENTRIES = kotlin.enums.a.a(requestStateArr);
    }

    public RequestState(String str, int i, String str2) {
        this.value = str2;
    }

    public static RequestState valueOf(String str) {
        return (RequestState) Enum.valueOf(RequestState.class, str);
    }

    public static RequestState[] values() {
        return (RequestState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}

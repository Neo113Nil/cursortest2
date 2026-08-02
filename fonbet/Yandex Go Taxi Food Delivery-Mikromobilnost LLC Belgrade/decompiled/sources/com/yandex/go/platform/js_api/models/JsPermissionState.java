package com.yandex.go.platform.js_api.models;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsPermissionState;", "", "", "stateName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "GRANTED", "DENIED", "PROMPT", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsPermissionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ JsPermissionState[] $VALUES;
    public static final JsPermissionState DENIED;
    public static final JsPermissionState GRANTED;
    public static final JsPermissionState PROMPT;
    private final String stateName;

    static {
        JsPermissionState jsPermissionState = new JsPermissionState("GRANTED", 0, "granted");
        GRANTED = jsPermissionState;
        JsPermissionState jsPermissionState2 = new JsPermissionState("DENIED", 1, "denied");
        DENIED = jsPermissionState2;
        JsPermissionState jsPermissionState3 = new JsPermissionState("PROMPT", 2, "prompt");
        PROMPT = jsPermissionState3;
        JsPermissionState[] jsPermissionStateArr = {jsPermissionState, jsPermissionState2, jsPermissionState3};
        $VALUES = jsPermissionStateArr;
        $ENTRIES = kotlin.enums.a.a(jsPermissionStateArr);
    }

    public JsPermissionState(String str, int i, String str2) {
        this.stateName = str2;
    }

    public static JsPermissionState valueOf(String str) {
        return (JsPermissionState) Enum.valueOf(JsPermissionState.class, str);
    }

    public static JsPermissionState[] values() {
        return (JsPermissionState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getStateName() {
        return this.stateName;
    }
}

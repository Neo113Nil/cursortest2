package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics;

import defpackage.c5n;
import defpackage.g8e;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0080\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/analytics/DynamicBinInfoEventName;", "", "", "value", "Ljava/lang/String;", "Companion", "c5n", "INIT_EVENT", "REQUEST_STARTED", "REQUEST_SUCCESS", "REQUEST_FAILED", "ICON_LOAD_STARTED", "ICON_LOAD_SUCCESS", "ICON_LOAD_FAILED", "DATA_APPLIED", "FALLBACK_TO_STATIC", "DATA_STATE_ON_SUBMIT", "REQUESTS_RACE", "REQUEST_CACHED", "DATA_RESET", "STATIC_DATA_APPLIED", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DynamicBinInfoEventName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DynamicBinInfoEventName[] $VALUES;
    public static final c5n Companion;
    public static final DynamicBinInfoEventName DATA_APPLIED;
    public static final DynamicBinInfoEventName DATA_RESET;
    public static final DynamicBinInfoEventName DATA_STATE_ON_SUBMIT;
    private static final String EVENT_PREFIX = "dynamic_bin_";
    public static final DynamicBinInfoEventName FALLBACK_TO_STATIC;
    public static final DynamicBinInfoEventName ICON_LOAD_FAILED;
    public static final DynamicBinInfoEventName ICON_LOAD_STARTED;
    public static final DynamicBinInfoEventName ICON_LOAD_SUCCESS;
    public static final DynamicBinInfoEventName INIT_EVENT;
    public static final DynamicBinInfoEventName REQUESTS_RACE;
    public static final DynamicBinInfoEventName REQUEST_CACHED;
    public static final DynamicBinInfoEventName REQUEST_FAILED;
    public static final DynamicBinInfoEventName REQUEST_STARTED;
    public static final DynamicBinInfoEventName REQUEST_SUCCESS;
    public static final DynamicBinInfoEventName STATIC_DATA_APPLIED;
    private final String value;

    static {
        DynamicBinInfoEventName dynamicBinInfoEventName = new DynamicBinInfoEventName("INIT_EVENT", 0, "init");
        INIT_EVENT = dynamicBinInfoEventName;
        DynamicBinInfoEventName dynamicBinInfoEventName2 = new DynamicBinInfoEventName("REQUEST_STARTED", 1, "request_started");
        REQUEST_STARTED = dynamicBinInfoEventName2;
        DynamicBinInfoEventName dynamicBinInfoEventName3 = new DynamicBinInfoEventName("REQUEST_SUCCESS", 2, "request_success");
        REQUEST_SUCCESS = dynamicBinInfoEventName3;
        DynamicBinInfoEventName dynamicBinInfoEventName4 = new DynamicBinInfoEventName("REQUEST_FAILED", 3, "request_failed");
        REQUEST_FAILED = dynamicBinInfoEventName4;
        DynamicBinInfoEventName dynamicBinInfoEventName5 = new DynamicBinInfoEventName("ICON_LOAD_STARTED", 4, "icon_load_started");
        ICON_LOAD_STARTED = dynamicBinInfoEventName5;
        DynamicBinInfoEventName dynamicBinInfoEventName6 = new DynamicBinInfoEventName("ICON_LOAD_SUCCESS", 5, "icon_load_success");
        ICON_LOAD_SUCCESS = dynamicBinInfoEventName6;
        DynamicBinInfoEventName dynamicBinInfoEventName7 = new DynamicBinInfoEventName("ICON_LOAD_FAILED", 6, "icon_load_failed");
        ICON_LOAD_FAILED = dynamicBinInfoEventName7;
        DynamicBinInfoEventName dynamicBinInfoEventName8 = new DynamicBinInfoEventName("DATA_APPLIED", 7, "data_applied");
        DATA_APPLIED = dynamicBinInfoEventName8;
        DynamicBinInfoEventName dynamicBinInfoEventName9 = new DynamicBinInfoEventName("FALLBACK_TO_STATIC", 8, "fallback_to_static");
        FALLBACK_TO_STATIC = dynamicBinInfoEventName9;
        DynamicBinInfoEventName dynamicBinInfoEventName10 = new DynamicBinInfoEventName("DATA_STATE_ON_SUBMIT", 9, "data_state_on_submit");
        DATA_STATE_ON_SUBMIT = dynamicBinInfoEventName10;
        DynamicBinInfoEventName dynamicBinInfoEventName11 = new DynamicBinInfoEventName("REQUESTS_RACE", 10, "requests_race");
        REQUESTS_RACE = dynamicBinInfoEventName11;
        DynamicBinInfoEventName dynamicBinInfoEventName12 = new DynamicBinInfoEventName("REQUEST_CACHED", 11, "request_cached");
        REQUEST_CACHED = dynamicBinInfoEventName12;
        DynamicBinInfoEventName dynamicBinInfoEventName13 = new DynamicBinInfoEventName("DATA_RESET", 12, "data_reset");
        DATA_RESET = dynamicBinInfoEventName13;
        DynamicBinInfoEventName dynamicBinInfoEventName14 = new DynamicBinInfoEventName("STATIC_DATA_APPLIED", 13, "static_data_applied");
        STATIC_DATA_APPLIED = dynamicBinInfoEventName14;
        DynamicBinInfoEventName[] dynamicBinInfoEventNameArr = {dynamicBinInfoEventName, dynamicBinInfoEventName2, dynamicBinInfoEventName3, dynamicBinInfoEventName4, dynamicBinInfoEventName5, dynamicBinInfoEventName6, dynamicBinInfoEventName7, dynamicBinInfoEventName8, dynamicBinInfoEventName9, dynamicBinInfoEventName10, dynamicBinInfoEventName11, dynamicBinInfoEventName12, dynamicBinInfoEventName13, dynamicBinInfoEventName14};
        $VALUES = dynamicBinInfoEventNameArr;
        $ENTRIES = a.a(dynamicBinInfoEventNameArr);
        Companion = new c5n();
    }

    public DynamicBinInfoEventName(String str, int i, String str2) {
        this.value = str2;
    }

    public static DynamicBinInfoEventName valueOf(String str) {
        return (DynamicBinInfoEventName) Enum.valueOf(DynamicBinInfoEventName.class, str);
    }

    public static DynamicBinInfoEventName[] values() {
        return (DynamicBinInfoEventName[]) $VALUES.clone();
    }

    public final String a() {
        return g8e.o(EVENT_PREFIX, this.value);
    }
}

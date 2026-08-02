package com.yandex.plus.core.debug.panel.internal.model.log;

import defpackage.fez;
import defpackage.k4o;
import defpackage.uyh0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0080\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/plus/core/debug/panel/internal/model/log/LogDisplayConfig;", "", "", "resId", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "fez", "TIMESTAMP", "TAG", "LEVEL", "RAW_LEVEL", IDialogId.INTENT_EXTRA_IN_MESSAGE, "LOCATION", "FUNCTION", "THREAD", "THREAD_SEQUENCE", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "UNSPECIFIED", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogDisplayConfig {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogDisplayConfig[] $VALUES;
    public static final fez Companion;
    public static final LogDisplayConfig DEBUG;
    public static final LogDisplayConfig ERROR;
    public static final LogDisplayConfig FUNCTION;
    public static final LogDisplayConfig INFO;
    public static final LogDisplayConfig LEVEL;
    public static final LogDisplayConfig LOCATION;
    public static final LogDisplayConfig MESSAGE;
    public static final LogDisplayConfig RAW_LEVEL;
    public static final LogDisplayConfig TAG;
    public static final LogDisplayConfig THREAD;
    public static final LogDisplayConfig THREAD_SEQUENCE;
    public static final LogDisplayConfig TIMESTAMP;
    public static final LogDisplayConfig UNSPECIFIED;
    public static final LogDisplayConfig VERBOSE;
    public static final LogDisplayConfig WARN;
    private final int resId;

    static {
        LogDisplayConfig logDisplayConfig = new LogDisplayConfig("TIMESTAMP", 0, uyh0.plus_sdk_debug_panel_timestamp);
        TIMESTAMP = logDisplayConfig;
        LogDisplayConfig logDisplayConfig2 = new LogDisplayConfig("TAG", 1, uyh0.plus_sdk_debug_panel_tag);
        TAG = logDisplayConfig2;
        LogDisplayConfig logDisplayConfig3 = new LogDisplayConfig("LEVEL", 2, uyh0.plus_sdk_debug_panel_level);
        LEVEL = logDisplayConfig3;
        LogDisplayConfig logDisplayConfig4 = new LogDisplayConfig("RAW_LEVEL", 3, uyh0.plus_sdk_debug_panel_raw_level);
        RAW_LEVEL = logDisplayConfig4;
        LogDisplayConfig logDisplayConfig5 = new LogDisplayConfig(IDialogId.INTENT_EXTRA_IN_MESSAGE, 4, uyh0.plus_sdk_debug_panel_message);
        MESSAGE = logDisplayConfig5;
        LogDisplayConfig logDisplayConfig6 = new LogDisplayConfig("LOCATION", 5, uyh0.plus_sdk_debug_panel_location);
        LOCATION = logDisplayConfig6;
        LogDisplayConfig logDisplayConfig7 = new LogDisplayConfig("FUNCTION", 6, uyh0.plus_sdk_debug_panel_function);
        FUNCTION = logDisplayConfig7;
        LogDisplayConfig logDisplayConfig8 = new LogDisplayConfig("THREAD", 7, uyh0.plus_sdk_debug_panel_thread);
        THREAD = logDisplayConfig8;
        LogDisplayConfig logDisplayConfig9 = new LogDisplayConfig("THREAD_SEQUENCE", 8, uyh0.plus_sdk_debug_panel_thread_sequence);
        THREAD_SEQUENCE = logDisplayConfig9;
        LogDisplayConfig logDisplayConfig10 = new LogDisplayConfig("VERBOSE", 9, uyh0.plus_sdk_debug_panel_verbose);
        VERBOSE = logDisplayConfig10;
        LogDisplayConfig logDisplayConfig11 = new LogDisplayConfig("DEBUG", 10, uyh0.plus_sdk_debug_panel_debug);
        DEBUG = logDisplayConfig11;
        LogDisplayConfig logDisplayConfig12 = new LogDisplayConfig("INFO", 11, uyh0.plus_sdk_debug_panel_info);
        INFO = logDisplayConfig12;
        LogDisplayConfig logDisplayConfig13 = new LogDisplayConfig("WARN", 12, uyh0.plus_sdk_debug_panel_warn);
        WARN = logDisplayConfig13;
        LogDisplayConfig logDisplayConfig14 = new LogDisplayConfig("ERROR", 13, uyh0.plus_sdk_debug_panel_error);
        ERROR = logDisplayConfig14;
        LogDisplayConfig logDisplayConfig15 = new LogDisplayConfig("UNSPECIFIED", 14, uyh0.plus_sdk_debug_panel_unspecified);
        UNSPECIFIED = logDisplayConfig15;
        LogDisplayConfig[] logDisplayConfigArr = {logDisplayConfig, logDisplayConfig2, logDisplayConfig3, logDisplayConfig4, logDisplayConfig5, logDisplayConfig6, logDisplayConfig7, logDisplayConfig8, logDisplayConfig9, logDisplayConfig10, logDisplayConfig11, logDisplayConfig12, logDisplayConfig13, logDisplayConfig14, logDisplayConfig15};
        $VALUES = logDisplayConfigArr;
        $ENTRIES = a.a(logDisplayConfigArr);
        Companion = new fez();
    }

    public LogDisplayConfig(String str, int i, int i2) {
        this.resId = i2;
    }

    public static LogDisplayConfig valueOf(String str) {
        return (LogDisplayConfig) Enum.valueOf(LogDisplayConfig.class, str);
    }

    public static LogDisplayConfig[] values() {
        return (LogDisplayConfig[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getResId() {
        return this.resId;
    }
}

package com.yandex.plus.core.debug.panel.api.data;

import defpackage.k4o;
import io.appmetrica.analytics.impl.C0689ro;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/plus/core/debug/panel/api/data/DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey", "", "Lcom/yandex/plus/core/debug/panel/api/data/DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey;", "USER_ID", C0689ro.f, "DEVICE_ID", "DEVICE_MODEL", "OS_VERSION", "SDK_VERSION", "METRICS_UUID", "ENVIRONMENT", "WEB_VIEW_VERSION", "USER_AGENT", "ERROR_MESSAGE", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey[] $VALUES;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey DEVICE_ID;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey DEVICE_MODEL;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey ENVIRONMENT;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey ERROR_MESSAGE;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey METRICS_UUID;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey OS_VERSION;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey SDK_VERSION;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey SESSION_ID;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey USER_AGENT;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey USER_ID;
    public static final DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey WEB_VIEW_VERSION;

    static {
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("USER_ID", 0);
        USER_ID = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey2 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey(C0689ro.f, 1);
        SESSION_ID = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey2;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey3 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("DEVICE_ID", 2);
        DEVICE_ID = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey3;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey4 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("DEVICE_MODEL", 3);
        DEVICE_MODEL = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey4;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey5 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("OS_VERSION", 4);
        OS_VERSION = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey5;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey6 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("SDK_VERSION", 5);
        SDK_VERSION = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey6;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey7 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("METRICS_UUID", 6);
        METRICS_UUID = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey7;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey8 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("ENVIRONMENT", 7);
        ENVIRONMENT = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey8;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey9 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("WEB_VIEW_VERSION", 8);
        WEB_VIEW_VERSION = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey9;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey10 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("USER_AGENT", 9);
        USER_AGENT = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey10;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey11 = new DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey("ERROR_MESSAGE", 10);
        ERROR_MESSAGE = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey11;
        DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey[] debugPanelInfoItem$DebugPanelGeneralInfo$FieldKeyArr = {debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey2, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey3, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey4, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey5, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey6, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey7, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey8, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey9, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey10, debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey11};
        $VALUES = debugPanelInfoItem$DebugPanelGeneralInfo$FieldKeyArr;
        $ENTRIES = a.a(debugPanelInfoItem$DebugPanelGeneralInfo$FieldKeyArr);
    }

    public static DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey valueOf(String str) {
        return (DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey) Enum.valueOf(DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.class, str);
    }

    public static DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey[] values() {
        return (DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey[]) $VALUES.clone();
    }
}

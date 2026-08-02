package defpackage;

import com.yandex.plus.core.debug.panel.api.data.DebugPanelInfoItem$LogDetails$DebugPanelLogLevel;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class dlz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.values().length];
        try {
            iArr[DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.VERBOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.WARN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.UNSPECIFIED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}

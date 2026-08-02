package ru.ok.android.commons.os;

/* loaded from: classes9.dex */
public class TraceCompatSwitch {
    static volatile boolean enabled = false;

    public static boolean isEnabled() {
        return enabled;
    }

    public static void setEnabled(boolean z) {
        enabled = z;
    }
}

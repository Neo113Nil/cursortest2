package ru.ok.android.commons.os;

import android.os.Trace;

/* loaded from: classes9.dex */
public class TraceCompat {
    private static final String COMMON_CLASS_NAME_PREFIX = "ru.ok.android.";
    private static final int COMMON_CLASS_NAME_START = 13;
    private static final int TRACE_MAX_LENGTH = 127;

    public static void beginTraceSection(String str) {
        if (str.startsWith(COMMON_CLASS_NAME_PREFIX)) {
            str = str.substring(COMMON_CLASS_NAME_START);
        }
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void endSection() {
        Trace.endSection();
    }
}

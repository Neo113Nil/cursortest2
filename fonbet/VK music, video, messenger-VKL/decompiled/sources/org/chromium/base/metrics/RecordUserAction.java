package org.chromium.base.metrics;

import org.chromium.base.TimeUtils;

/* loaded from: classes8.dex */
public class RecordUserAction {
    public static void record(String str) {
        UmaRecorderHolder.get().recordUserAction(str, TimeUtils.elapsedRealtimeMillis());
    }
}

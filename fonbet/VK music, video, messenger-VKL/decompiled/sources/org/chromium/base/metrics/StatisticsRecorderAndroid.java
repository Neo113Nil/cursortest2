package org.chromium.base.metrics;

/* loaded from: classes8.dex */
public final class StatisticsRecorderAndroid {

    public interface Natives {
        String toJson(int i);
    }

    private StatisticsRecorderAndroid() {
    }

    public static String toJson(int i) {
        return StatisticsRecorderAndroidJni.get().toJson(i);
    }
}

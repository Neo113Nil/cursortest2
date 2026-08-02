package com.yandex.div.histogram;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public interface HistogramBridge {
    void recordTimeHistogram(@NonNull String str, long j, long j2, long j3, @NonNull TimeUnit timeUnit, int i);
}

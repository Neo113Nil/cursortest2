package com.yandex.runtime.real_time_clock;

/* loaded from: classes2.dex */
public interface TestClock {
    TestTimestamp getTestTimestamp();

    boolean isSynced();

    boolean isValid();
}

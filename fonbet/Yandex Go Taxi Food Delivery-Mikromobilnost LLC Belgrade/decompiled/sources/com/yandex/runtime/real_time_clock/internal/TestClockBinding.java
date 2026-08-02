package com.yandex.runtime.real_time_clock.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.real_time_clock.TestClock;
import com.yandex.runtime.real_time_clock.TestTimestamp;

/* loaded from: classes2.dex */
public class TestClockBinding implements TestClock {
    private final NativeObject nativeObject;

    public TestClockBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.real_time_clock.TestClock
    public native TestTimestamp getTestTimestamp();

    @Override // com.yandex.runtime.real_time_clock.TestClock
    public native boolean isSynced();

    @Override // com.yandex.runtime.real_time_clock.TestClock
    public native boolean isValid();
}

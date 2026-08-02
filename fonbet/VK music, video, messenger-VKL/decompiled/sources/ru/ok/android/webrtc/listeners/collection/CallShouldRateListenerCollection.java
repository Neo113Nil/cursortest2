package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.ShouldRateCallListener;

/* loaded from: classes9.dex */
public interface CallShouldRateListenerCollection {
    void addCallShouldRateListener(ShouldRateCallListener shouldRateCallListener);

    void removeShouldRateCallListener(ShouldRateCallListener shouldRateCallListener);
}

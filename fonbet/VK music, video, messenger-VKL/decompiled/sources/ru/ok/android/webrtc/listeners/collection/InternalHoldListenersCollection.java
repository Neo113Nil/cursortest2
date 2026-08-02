package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.InternalHoldStateListener;

/* loaded from: classes9.dex */
public interface InternalHoldListenersCollection {
    void addInternalHoldListener(InternalHoldStateListener internalHoldStateListener);

    void removeInternalHoldListener(InternalHoldStateListener internalHoldStateListener);
}

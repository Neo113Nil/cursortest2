package ru.ok.android.webrtc.mediaadaptation;

import ru.ok.android.webrtc.mediaadaptation.MediaAdaptation;

/* loaded from: classes9.dex */
public interface NetworkConditionProvider {
    void addEventListener(MediaAdaptation.EventListener eventListener);

    void removeEventListener(MediaAdaptation.EventListener eventListener);
}

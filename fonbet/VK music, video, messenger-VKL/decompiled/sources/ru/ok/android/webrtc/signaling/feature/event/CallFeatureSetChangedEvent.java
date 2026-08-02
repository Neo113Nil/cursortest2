package ru.ok.android.webrtc.signaling.feature.event;

import java.util.Set;
import ru.ok.android.webrtc.features.CallFeature;

/* loaded from: classes9.dex */
public final class CallFeatureSetChangedEvent {
    public final Set a;

    public CallFeatureSetChangedEvent(Set<? extends CallFeature> set) {
        this.a = set;
    }

    public final Set<CallFeature> getFeatures() {
        return this.a;
    }
}

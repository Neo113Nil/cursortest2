package ru.ok.android.webrtc.signaling.feature.event;

import java.util.Map;
import java.util.Set;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class CallFeaturesPerRoleChangedEvent {
    public final Map a;

    public CallFeaturesPerRoleChangedEvent(Map<CallFeature, ? extends Set<? extends CallParticipant.Role>> map) {
        this.a = map;
    }

    public final Map<CallFeature, Set<CallParticipant.Role>> getFeaturesPerRole() {
        return this.a;
    }
}

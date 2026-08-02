package ru.ok.android.webrtc;

import java.util.Collections;
import java.util.Map;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class e implements DelayedVideoRendererSource {
    public final /* synthetic */ Call a;

    public e(Call call) {
        this.a = call;
    }

    @Override // ru.ok.android.webrtc.DelayedVideoRendererSource
    public final Map getRemoteVideoRenderers(CallParticipant.ParticipantId participantId) {
        DelayedVideoRendererSource delayedVideoRendererSource = this.a.j0;
        return delayedVideoRendererSource != null ? delayedVideoRendererSource.getRemoteVideoRenderers(participantId) : Collections.EMPTY_MAP;
    }

    @Override // ru.ok.android.webrtc.DelayedVideoRendererSource
    public final boolean isEnabled() {
        return this.a.j0 != null;
    }
}

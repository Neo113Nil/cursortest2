package ru.ok.android.webrtc.topology.server.layout;

import androidx.annotation.NonNull;
import java.util.List;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public interface DisplayLayouts {
    @NonNull
    List<CallDisplayLayoutItem> getLatestDisplayLayouts();

    void removeDisplayLayoutsForParticipant(@NonNull CallParticipant.ParticipantId participantId);

    void resendLatestDisplayLayouts();

    void updateDisplayLayouts(@NonNull List<CallDisplayLayoutItem> list);
}

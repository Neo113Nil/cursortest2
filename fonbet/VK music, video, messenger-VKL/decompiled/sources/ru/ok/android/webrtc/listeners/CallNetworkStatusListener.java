package ru.ok.android.webrtc.listeners;

import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public interface CallNetworkStatusListener {
    void onCallParticipantNetworkStatusChanged(List<CallParticipant> list);
}

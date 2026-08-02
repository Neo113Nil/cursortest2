package ru.ok.android.webrtc.topology;

import androidx.annotation.NonNull;
import org.webrtc.CropAndScaleParamsProvider;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.CallTimings;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.listeners.collection.CallListenersCollection;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.nno;

/* loaded from: classes9.dex */
public final class DummyCallTopology extends CallTopology {
    public DummyCallTopology(@NonNull CallParticipants callParticipants, @NonNull CallParams callParams, @NonNull RTCLog rTCLog, @NonNull CallListenersCollection callListenersCollection, @NonNull TimeProvider timeProvider, @NonNull CallTimings callTimings, @NonNull CropAndScaleParamsProvider cropAndScaleParamsProvider) {
        super(callParticipants, new MutableMediaSettings(), callParams, rTCLog, null, null, callListenersCollection, null, null, timeProvider, callTimings, cropAndScaleParamsProvider, null, new nno());
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public Runnable getConnectivityControlRunnable() {
        return null;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    @NonNull
    public Topology getIdentity() {
        return Topology.DUMMY;
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    @NonNull
    public String getTag() {
        return "DummyCallTopology";
    }

    @Override // ru.ok.android.webrtc.topology.CallTopology
    public void updatePeerVideoSettings(PeerVideoSettings peerVideoSettings) {
    }
}

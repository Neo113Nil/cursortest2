package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallFingerprintListener;
import ru.ok.android.webrtc.listeners.collection.FingerprintListenersCollection;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class FingerprintListenerProxyImpl implements FingerprintListenersCollection, FingerprintListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.FingerprintListenersCollection
    public void addFingerprintListener(CallFingerprintListener callFingerprintListener) {
        this.a.add(callFingerprintListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallFingerprintListener
    public void onCallParticipantFingerprint(CallParticipant callParticipant, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallFingerprintListener) it.next()).onCallParticipantFingerprint(callParticipant, j);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.FingerprintListenersCollection
    public void removeFingerprintListener(CallFingerprintListener callFingerprintListener) {
        this.a.remove(callFingerprintListener);
    }
}

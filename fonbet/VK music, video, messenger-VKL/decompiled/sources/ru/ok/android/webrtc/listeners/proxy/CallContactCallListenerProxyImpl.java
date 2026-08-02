package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallContactCallListener;
import ru.ok.android.webrtc.listeners.collection.ContactCallListenersCollection;

/* loaded from: classes9.dex */
public final class CallContactCallListenerProxyImpl implements ContactCallListenersCollection, ContactCallListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.ContactCallListenersCollection
    public void addContactCallListener(CallContactCallListener callContactCallListener) {
        this.a.add(callContactCallListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallContactCallListener
    public void onDecorativeParticipantIdChanged(CallContactCallListener.DecorativeParticipantIdChanged decorativeParticipantIdChanged) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallContactCallListener) it.next()).onDecorativeParticipantIdChanged(decorativeParticipantIdChanged);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ContactCallListenersCollection
    public void removeContactCallListener(CallContactCallListener callContactCallListener) {
        this.a.remove(callContactCallListener);
    }
}

package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.InternalHoldStateListener;
import ru.ok.android.webrtc.listeners.collection.InternalHoldListenersCollection;

/* loaded from: classes9.dex */
public final class InternalHoldStateListenerProxyImpl implements InternalHoldStateListenerProxy, InternalHoldListenersCollection {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.InternalHoldListenersCollection
    public void addInternalHoldListener(InternalHoldStateListener internalHoldStateListener) {
        this.a.add(internalHoldStateListener);
    }

    @Override // ru.ok.android.webrtc.listeners.InternalHoldStateListener
    public void onParticipantHoldStateChanged(String str, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InternalHoldStateListener) it.next()).onParticipantHoldStateChanged(str, z);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.InternalHoldListenersCollection
    public void removeInternalHoldListener(InternalHoldStateListener internalHoldStateListener) {
        this.a.remove(internalHoldStateListener);
    }
}

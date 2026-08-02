package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallSessionRoomRecordInfoListener;
import ru.ok.android.webrtc.listeners.collection.SessionRoomRecordInfoListenersCollection;

/* loaded from: classes9.dex */
public final class SessionRoomRecordInfoListenerProxyImpl implements SessionRoomRecordInfoListenersCollection, SessionRoomRecordInfoListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomRecordInfoListenersCollection
    public void addSessionRoomRecordInfoListener(CallSessionRoomRecordInfoListener callSessionRoomRecordInfoListener) {
        this.a.add(callSessionRoomRecordInfoListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomRecordInfoListener
    public void onSessionRoomRecordInfo(CallSessionRoomRecordInfoListener.SessionRoomRecordInfoState sessionRoomRecordInfoState) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallSessionRoomRecordInfoListener) it.next()).onSessionRoomRecordInfo(sessionRoomRecordInfoState);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomRecordInfoListenersCollection
    public void removeSessionRoomRecordInfoListener(CallSessionRoomRecordInfoListener callSessionRoomRecordInfoListener) {
        this.a.remove(callSessionRoomRecordInfoListener);
    }
}

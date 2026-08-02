package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallSessionRoomAsrRecordListener;
import ru.ok.android.webrtc.listeners.collection.SessionRoomAsrRecordInfoListenersCollection;

/* loaded from: classes9.dex */
public final class SessionRoomAsrRecordInfoListenerProxyImpl implements SessionRoomAsrRecordInfoListenersCollection, SessionRoomAsrRecordListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomAsrRecordInfoListenersCollection
    public void addSessionRoomAsrRecordInfoListener(CallSessionRoomAsrRecordListener callSessionRoomAsrRecordListener) {
        this.a.add(callSessionRoomAsrRecordListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomAsrRecordListener
    public void onSessionRoomAsrRecordInfo(CallSessionRoomAsrRecordListener.SessionRoomAsrRecordState sessionRoomAsrRecordState) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallSessionRoomAsrRecordListener) it.next()).onSessionRoomAsrRecordInfo(sessionRoomAsrRecordState);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomAsrRecordInfoListenersCollection
    public void removeSessionRoomAsrRecordInfoListener(CallSessionRoomAsrRecordListener callSessionRoomAsrRecordListener) {
        this.a.remove(callSessionRoomAsrRecordListener);
    }
}

package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallUrlSharingListener;
import ru.ok.android.webrtc.listeners.collection.CallUrlSharingListenerCollection;

/* loaded from: classes9.dex */
public final class UrlSharingListenerProxyImpl implements CallUrlSharingListenerCollection, UrlSharingListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.CallUrlSharingListenerCollection
    public void addUrlSharingListener(CallUrlSharingListener callUrlSharingListener) {
        this.a.add(callUrlSharingListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallUrlSharingListener
    public void onUrlSharingInfoUpdated(CallUrlSharingListener.UrlSharingState urlSharingState) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallUrlSharingListener) it.next()).onUrlSharingInfoUpdated(urlSharingState);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.CallUrlSharingListenerCollection
    public void removeUrlSharingListener(CallUrlSharingListener callUrlSharingListener) {
        this.a.remove(callUrlSharingListener);
    }
}

package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallOptionChangedListener;
import ru.ok.android.webrtc.listeners.collection.CallOptionChangedCollection;

/* loaded from: classes9.dex */
public final class CallOptionChangedListenerProxyImpl implements CallOptionChangedListenerProxy, CallOptionChangedCollection {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.CallOptionChangedCollection
    public void addCallOptionChangedListener(CallOptionChangedListener callOptionChangedListener) {
        this.a.add(callOptionChangedListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
    public void onAdminInCallChanged() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallOptionChangedListener) it.next()).onAdminInCallChanged();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
    public void onAnonJoinForbiddenChanged() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallOptionChangedListener) it.next()).onAnonJoinForbiddenChanged();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
    public void onAsrOnlineAvailableChanged() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallOptionChangedListener) it.next()).onAsrOnlineAvailableChanged();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
    public void onFeedbackEnabledChanged() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallOptionChangedListener) it.next()).onFeedbackEnabledChanged();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
    public void onRecurringChanged() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallOptionChangedListener) it.next()).onRecurringChanged();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
    public void onWaitForAdminChanged() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallOptionChangedListener) it.next()).onWaitForAdminChanged();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
    public void onWaitingHallEnabledChanged() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallOptionChangedListener) it.next()).onWaitingHallEnabledChanged();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.CallOptionChangedCollection
    public void removeCallOptionChangedListener(CallOptionChangedListener callOptionChangedListener) {
        this.a.remove(callOptionChangedListener);
    }
}

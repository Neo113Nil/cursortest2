package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.chatroom.CallWaitingRoomEvent;
import ru.ok.android.webrtc.listeners.CallWaitingRoomListener;
import ru.ok.android.webrtc.listeners.collection.WaitingRoomListenersCollection;

/* loaded from: classes9.dex */
public final class WaitingRoomListenerProxyImpl implements WaitingRoomListenersCollection, WaitingRoomListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.WaitingRoomListenersCollection
    public void addWaitingRoomListener(CallWaitingRoomListener callWaitingRoomListener) {
        this.a.add(callWaitingRoomListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onAttendee(CallWaitingRoomEvent.Attendee attendee) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallWaitingRoomListener) it.next()).onAttendee(attendee);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onFeedback(CallWaitingRoomEvent.Feedback feedback) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallWaitingRoomListener) it.next()).onFeedback(feedback);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onHandUp(CallWaitingRoomEvent.HandUp handUp) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallWaitingRoomListener) it.next()).onHandUp(handUp);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallWaitingRoomListener) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onPromotionUpdated(CallWaitingRoomEvent.PromotionApproved promotionApproved) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallWaitingRoomListener) it.next()).onPromotionUpdated(promotionApproved);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.WaitingRoomListenersCollection
    public void removeWaitingRoomListener(CallWaitingRoomListener callWaitingRoomListener) {
        this.a.remove(callWaitingRoomListener);
    }
}

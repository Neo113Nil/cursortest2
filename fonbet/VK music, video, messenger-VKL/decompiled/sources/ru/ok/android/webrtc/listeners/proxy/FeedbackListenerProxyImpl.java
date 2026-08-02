package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallFeedbackListener;
import ru.ok.android.webrtc.listeners.collection.FeedbackListenersCollection;

/* loaded from: classes9.dex */
public final class FeedbackListenerProxyImpl implements FeedbackListenersCollection, FeedbackListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.FeedbackListenersCollection
    public void addFeedbackListener(CallFeedbackListener callFeedbackListener) {
        this.a.add(callFeedbackListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallFeedbackListener
    public void onFeedback(CallFeedbackListener.Feedback feedback) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallFeedbackListener) it.next()).onFeedback(feedback);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.FeedbackListenersCollection
    public void removeFeedbackListener(CallFeedbackListener callFeedbackListener) {
        this.a.remove(callFeedbackListener);
    }
}

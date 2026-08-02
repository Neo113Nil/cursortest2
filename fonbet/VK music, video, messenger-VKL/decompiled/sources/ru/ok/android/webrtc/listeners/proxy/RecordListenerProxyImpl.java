package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallRecordListener;
import ru.ok.android.webrtc.listeners.collection.RecordListenersCollection;

/* loaded from: classes9.dex */
public final class RecordListenerProxyImpl implements RecordListenersCollection, RecordListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.RecordListenersCollection
    public void addRecordListener(CallRecordListener callRecordListener) {
        this.a.add(callRecordListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallRecordListener
    public void onRecordError(CallRecordListener.RecordErrorInfo recordErrorInfo) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallRecordListener) it.next()).onRecordError(recordErrorInfo);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallRecordListener
    public void onRecordStarted(CallRecordListener.RecordStartInfo recordStartInfo) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallRecordListener) it.next()).onRecordStarted(recordStartInfo);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallRecordListener
    public void onRecordStopped(CallRecordListener.RecordStopInfo recordStopInfo) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallRecordListener) it.next()).onRecordStopped(recordStopInfo);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.RecordListenersCollection
    public void removeRecordListener(CallRecordListener callRecordListener) {
        this.a.remove(callRecordListener);
    }
}

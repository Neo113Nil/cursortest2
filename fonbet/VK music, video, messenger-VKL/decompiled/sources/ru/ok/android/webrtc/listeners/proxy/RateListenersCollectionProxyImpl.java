package ru.ok.android.webrtc.listeners.proxy;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import ru.ok.android.webrtc.listeners.ShouldRateCallListener;
import ru.ok.android.webrtc.listeners.collection.CallShouldRateListenerCollection;

/* loaded from: classes9.dex */
public final class RateListenersCollectionProxyImpl implements CallShouldRateListenerCollection, RateCallListenerProxy {
    public final HashSet a = new HashSet();

    @Override // ru.ok.android.webrtc.listeners.collection.CallShouldRateListenerCollection
    public void addCallShouldRateListener(ShouldRateCallListener shouldRateCallListener) {
        this.a.add(shouldRateCallListener);
    }

    @Override // ru.ok.android.webrtc.listeners.ShouldRateCallListener
    public void onRateCall(JSONObject jSONObject) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ShouldRateCallListener) it.next()).onRateCall(jSONObject);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.CallShouldRateListenerCollection
    public void removeShouldRateCallListener(ShouldRateCallListener shouldRateCallListener) {
        this.a.remove(shouldRateCallListener);
    }
}

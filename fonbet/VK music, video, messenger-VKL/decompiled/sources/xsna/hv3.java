package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineChunk;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;

/* compiled from: AsrOnlineListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class hv3 implements AsrOnlineListener {
    public final iv3 a;

    public hv3(iv3 iv3Var) {
        this.a = iv3Var;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener
    public final void onAsrAvailableChanged(boolean z) {
        Iterator it = ((CopyOnWriteArraySet) this.a.a).iterator();
        while (it.hasNext()) {
            ((AsrOnlineListener) it.next()).onAsrAvailableChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener
    public final void onAsrChunk(AsrOnlineChunk asrOnlineChunk) {
        Iterator it = ((CopyOnWriteArraySet) this.a.a).iterator();
        while (it.hasNext()) {
            ((AsrOnlineListener) it.next()).onAsrChunk(asrOnlineChunk);
        }
    }
}

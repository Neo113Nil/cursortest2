package one.video.cast.receiver;

import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.ez9;
import xsna.m0a;
import xsna.ssi0;
import xsna.xsi0;

/* compiled from: CastMediaIntentReceiver.kt */
/* loaded from: classes8.dex */
public final class CastMediaIntentReceiver extends MediaIntentReceiver {
    @Override // com.google.android.gms.cast.framework.media.MediaIntentReceiver
    public final void onReceiveActionTogglePlayback(ssi0 ssi0Var) {
        CopyOnWriteArrayList<ez9> copyOnWriteArrayList = xsi0.a;
        CopyOnWriteArrayList<m0a> copyOnWriteArrayList2 = xsi0.e;
        if (copyOnWriteArrayList2.isEmpty()) {
            super.onReceiveActionTogglePlayback(ssi0Var);
            return;
        }
        Iterator<T> it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            ((m0a) it.next()).a();
        }
    }
}

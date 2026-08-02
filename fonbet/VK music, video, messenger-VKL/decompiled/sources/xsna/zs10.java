package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.participant.media.MuteEvent;

/* compiled from: MediaOptionsStateListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class zs10 implements ys10 {
    public final CopyOnWriteArrayList<ys10> a = new CopyOnWriteArrayList<>();

    @Override // xsna.ys10
    public final void a(MuteEvent muteEvent, boolean z) {
        Iterator<ys10> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(muteEvent, z);
        }
    }
}

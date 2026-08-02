package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.participant.media.MuteEvent;

/* compiled from: MediaMuteListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class us10 implements ss10 {
    public final CopyOnWriteArraySet<ss10> a = new CopyOnWriteArraySet<>();

    @Override // xsna.ss10
    public final void onMuteChanged(MuteEvent muteEvent) {
        Iterator<ss10> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onMuteChanged(muteEvent);
        }
    }

    @Override // xsna.ss10
    public final void onMuteStateInitialized(MuteEvent muteEvent) {
        Iterator<ss10> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onMuteStateInitialized(muteEvent);
        }
    }
}

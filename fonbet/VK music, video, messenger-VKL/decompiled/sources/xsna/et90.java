package xsna;

import org.webrtc.PeerConnection;
import ru.ok.android.webrtc.utils.Consumer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class et90 implements Consumer {
    @Override // ru.ok.android.webrtc.utils.Consumer
    public final void accept(Object obj) {
        ((PeerConnection) obj).restartIce();
    }
}

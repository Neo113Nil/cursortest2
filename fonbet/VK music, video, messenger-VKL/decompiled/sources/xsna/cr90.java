package xsna;

import android.os.Handler;
import android.os.Message;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.pattern.visualization.PatternMatchVisualizer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class cr90 implements Handler.Callback {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cr90(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean accept;
        switch (this.b) {
            case 0:
                accept = ((PatternMatchVisualizer) this.c).accept(message);
                return accept;
            default:
                return SignalingTransport.a((SignalingTransport) this.c, message);
        }
    }
}

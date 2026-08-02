package xsna;

import android.media.MediaCodec;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.media.StreamerBase;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class jaj0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jaj0(SharedPeerConnectionFactory sharedPeerConnectionFactory, boolean z) {
        this.b = 0;
        this.d = sharedPeerConnectionFactory;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((SharedPeerConnectionFactory) this.d).b(this.c);
                break;
            case 1:
                StreamerBase.reachabilityChanged$lambda$13(this.c, (StreamerBase) this.d);
                break;
            default:
                MediaCodec mediaCodec = (MediaCodec) this.d;
                if (this.c && mediaCodec != null) {
                    mediaCodec.release();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jaj0(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}

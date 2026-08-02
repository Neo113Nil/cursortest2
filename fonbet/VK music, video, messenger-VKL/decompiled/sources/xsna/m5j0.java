package xsna;

import java.util.concurrent.Callable;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class m5j0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m5j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VideoFrame.I420Buffer lambda$toI420$1;
        switch (this.b) {
            case 0:
                return (Boolean) ((mb8) this.c).invoke();
            default:
                lambda$toI420$1 = ((TextureBufferImpl) this.c).lambda$toI420$1();
                return lambda$toI420$1;
        }
    }
}

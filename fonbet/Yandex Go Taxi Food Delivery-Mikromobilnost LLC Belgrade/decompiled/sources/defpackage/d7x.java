package defpackage;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

/* loaded from: classes10.dex */
public final /* synthetic */ class d7x implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d7x(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VideoFrame.I420Buffer lambda$toI420$1;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new e7x((JsReplyProxyBoundaryInterface) obj);
            case 1:
                lambda$toI420$1 = ((TextureBufferImpl) obj).lambda$toI420$1();
                return lambda$toI420$1;
            default:
                return i781.a((cb) obj);
        }
    }
}

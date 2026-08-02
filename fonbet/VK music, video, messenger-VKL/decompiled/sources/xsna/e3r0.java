package xsna;

import java.util.concurrent.atomic.AtomicInteger;
import one.video.player.model.FrameSize;

/* compiled from: Utils.kt */
/* loaded from: classes8.dex */
public final class e3r0 {
    public static final AtomicInteger a = new AtomicInteger(1);

    public static FrameSize a(int i, int i2) {
        int min = Math.min(i, i2);
        FrameSize.Companion.getClass();
        FrameSize frameSize = FrameSize._144p;
        int i3 = Integer.MAX_VALUE;
        for (FrameSize frameSize2 : FrameSize.h()) {
            int abs = Math.abs(frameSize2.getHeight() - min);
            if (abs >= i3) {
                break;
            }
            frameSize = frameSize2;
            i3 = abs;
        }
        return frameSize;
    }
}

package xsna;

import java.nio.ByteBuffer;

/* compiled from: Extension.java */
/* loaded from: classes8.dex */
public abstract class pt50 {
    public final int a(ByteBuffer byteBuffer, int i, int i2) throws one.video.calls.sdk_private.j {
        if (byteBuffer.limit() - byteBuffer.position() < 4) {
            throw new one.video.calls.sdk_private.j("extension underflow");
        }
        if ((byteBuffer.getShort() & 65535) != i) {
            throw new IllegalStateException();
        }
        int i3 = byteBuffer.getShort() & 65535;
        if (i3 >= i2) {
            if (byteBuffer.limit() - byteBuffer.position() >= i3) {
                return i3;
            }
            throw new one.video.calls.sdk_private.j("extension underflow");
        }
        throw new one.video.calls.sdk_private.j(getClass().getSimpleName() + " can't be less than " + i2 + " bytes");
    }

    public abstract byte[] b();
}

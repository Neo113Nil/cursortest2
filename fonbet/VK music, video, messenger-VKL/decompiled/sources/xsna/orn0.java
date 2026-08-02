package xsna;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.f;

/* compiled from: ServerPreSharedKeyExtension.java */
/* loaded from: classes8.dex */
public final class orn0 extends ame0 {
    public int a;

    @Override // xsna.pt50
    public final byte[] b() {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.putShort(f.c.pre_shared_key.k);
        allocate.putShort((short) 2);
        allocate.putShort((short) this.a);
        return allocate.array();
    }
}

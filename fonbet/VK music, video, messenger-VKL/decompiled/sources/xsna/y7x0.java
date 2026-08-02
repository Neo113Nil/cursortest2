package xsna;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.f;

/* compiled from: SupportedVersionsExtension.java */
/* loaded from: classes8.dex */
public final class y7x0 extends pt50 {
    public final f.d a;
    public final short b;

    public y7x0(f.d dVar) {
        this.a = dVar;
        this.b = (short) 772;
    }

    @Override // xsna.pt50
    public final byte[] b() {
        f.d dVar = f.d.client_hello;
        f.d dVar2 = this.a;
        ByteBuffer allocate = ByteBuffer.allocate(dVar2.equals(dVar) ? 7 : 6);
        allocate.putShort(f.c.supported_versions.k);
        if (dVar2.equals(dVar)) {
            allocate.putShort((short) 3);
            allocate.put((byte) 2);
            allocate.put(new byte[]{3, 4});
        } else {
            allocate.putShort((short) 2);
            allocate.put(new byte[]{3, 4});
        }
        return allocate.array();
    }

    public y7x0(ByteBuffer byteBuffer, f.d dVar) throws one.video.calls.sdk_private.g {
        this.a = dVar;
        int a = a(byteBuffer, f.c.supported_versions.k, 2);
        if (dVar == f.d.client_hello) {
            int i = byteBuffer.get() & 255;
            if (i % 2 != 0 || a != i + 1) {
                throw new one.video.calls.sdk_private.j("invalid versions length");
            }
            for (int i2 = 0; i2 < i; i2 += 2) {
                short s = byteBuffer.getShort();
                if (s == 772 || this.b == 0) {
                    this.b = s;
                }
            }
            return;
        }
        if (dVar != f.d.server_hello) {
            throw new IllegalArgumentException();
        }
        if (a == 2) {
            this.b = byteBuffer.getShort();
            return;
        }
        throw new one.video.calls.sdk_private.j("Incorrect extension length");
    }
}

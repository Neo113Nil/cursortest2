package xsna;

import java.nio.ByteBuffer;
import java.util.UUID;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;

/* compiled from: GenericHeader.java */
/* loaded from: classes13.dex */
public final class rjt extends l8e0 {
    public ByteBuffer b;

    static {
        l8e0.a.put(UUID.fromString(DeviceIdUtils.NULL_UUID), rjt.class);
    }

    @Override // xsna.l8e0
    public final ByteBuffer a() {
        return this.b;
    }

    @Override // xsna.l8e0
    public final void b(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }
}

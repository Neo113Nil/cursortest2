package xsna;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ru.ok.android.webrtc.protocol.screenshare.Codec;
import ru.ok.android.webrtc.protocol.screenshare.ScreensharePacketFlags;

/* loaded from: classes8.dex */
public final class z3z0 extends ScreensharePacketFlags {
    public final int h;
    public final Codec i;
    public final int j;
    public final ByteBuffer k;

    public z3z0(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        wrap.get();
        this.h = wrap.getShort() & 65535;
        wrap.getInt();
        this.i = Codec.safeValueOf(wrap.get());
        this.j = wrap.getShort() & 65535;
        setFlagValue(wrap.get());
        this.k = wrap.slice();
    }
}

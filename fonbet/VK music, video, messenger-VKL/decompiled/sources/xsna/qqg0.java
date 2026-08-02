package xsna;

import java.nio.ByteBuffer;
import one.video.player.live.proto.rtmp.ProtocolException;
import xsna.aqg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class qqg0 implements aqg0.d {
    @Override // xsna.aqg0.d
    public final void a(ByteBuffer byteBuffer) {
        lqg0 lqg0Var = new lqg0();
        lqg0Var.deserialize(byteBuffer);
        mqg0 mqg0Var = lqg0Var.d;
        if ("error".equalsIgnoreCase(mqg0Var.a.a)) {
            throw new ProtocolException("Failed to connect: response = " + lqg0Var.toString());
        }
        if (mqg0Var.b.a.equals("NetConnection.Connect.Success")) {
            return;
        }
        throw new ProtocolException("Unexpected connect response: " + lqg0Var.toString());
    }
}

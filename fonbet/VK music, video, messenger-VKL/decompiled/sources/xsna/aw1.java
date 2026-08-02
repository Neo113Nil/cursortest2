package xsna;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import one.video.player.live.proto.rtmp.ProtocolException;
import xsna.bw1;

/* compiled from: AmfObject.java */
/* loaded from: classes8.dex */
public final class aw1 extends bw1 {
    public final HashMap a = new HashMap();

    @Override // xsna.bw1
    public final void a(bw1.e eVar) throws ProtocolException {
        for (Map.Entry entry : this.a.entrySet()) {
            eVar.a((String) entry.getKey(), (wv1) entry.getValue());
        }
    }

    @Override // xsna.bw1, xsna.wv1
    public final void deserialize(ByteBuffer byteBuffer) throws ProtocolException {
        while (true) {
            String a = cw1.a(byteBuffer);
            byte b = byteBuffer.get();
            if (b == 9) {
                return;
            }
            wv1 yv1Var = b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 5 ? null : new yv1() : new aw1() : new cw1() : new vv1() : new zv1();
            if (yv1Var == null) {
                sdy.u(b, byteBuffer);
            } else {
                yv1Var.deserialize(byteBuffer);
                this.a.put(a, b != 5 ? yv1Var : null);
            }
        }
    }

    @Override // xsna.bw1, xsna.wv1
    public final void serialize(ByteBuffer byteBuffer) throws ProtocolException {
        for (Map.Entry entry : this.a.entrySet()) {
            cw1.b(byteBuffer, (String) entry.getKey());
            wv1 wv1Var = (wv1) entry.getValue();
            if (wv1Var == null) {
                wv1Var = yv1.a;
            }
            byteBuffer.put(wv1Var.getType());
            wv1Var.serialize(byteBuffer);
        }
        byteBuffer.putShort((short) 0);
        byteBuffer.put((byte) 9);
    }
}

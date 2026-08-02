package xsna;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import one.video.player.live.proto.rtmp.ProtocolException;

/* compiled from: AmfObjectBase.java */
/* loaded from: classes8.dex */
public class bw1 implements wv1 {

    /* compiled from: AmfObjectBase.java */
    public static class a implements e {
        public HashMap a;

        @Override // xsna.bw1.e
        public final void a(String str, wv1 wv1Var) throws ProtocolException {
            this.a.put(str, wv1Var);
        }
    }

    /* compiled from: AmfObjectBase.java */
    public static class b implements e {
        public ByteBuffer a;

        @Override // xsna.bw1.e
        public final void a(String str, wv1 wv1Var) throws ProtocolException {
            ByteBuffer byteBuffer = this.a;
            cw1.b(byteBuffer, str);
            if (wv1Var == null) {
                byteBuffer.put((byte) 5);
            } else {
                byteBuffer.put(wv1Var.getType());
                wv1Var.serialize(byteBuffer);
            }
        }
    }

    /* compiled from: AmfObjectBase.java */
    public static class c implements e {
        public int a;

        @Override // xsna.bw1.e
        public final void a(String str, wv1 wv1Var) throws ProtocolException {
            this.a = str.getBytes(Charset.forName(C.UTF8_NAME)).length + 3 + (wv1Var == null ? 0 : wv1Var.getSize()) + this.a;
        }
    }

    /* compiled from: AmfObjectBase.java */
    public static class d implements e {
        public boolean a;
        public StringBuilder b;

        @Override // xsna.bw1.e
        public final void a(String str, wv1 wv1Var) throws ProtocolException {
            StringBuilder sb = this.b;
            if (!this.a) {
                sb.append(StringUtils.COMMA);
            }
            this.a = false;
            sb.append(str);
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(wv1Var == null ? "null" : wv1Var.toString());
        }
    }

    /* compiled from: AmfObjectBase.java */
    public interface e {
        void a(String str, wv1 wv1Var) throws ProtocolException;
    }

    @Override // xsna.wv1
    public void deserialize(ByteBuffer byteBuffer) throws ProtocolException {
        a aVar = new a();
        HashMap hashMap = new HashMap(30);
        aVar.a = hashMap;
        a(aVar);
        while (byteBuffer.hasRemaining()) {
            String a2 = cw1.a(byteBuffer);
            byte b2 = byteBuffer.get();
            if (b2 == 9) {
                return;
            }
            wv1 wv1Var = (wv1) hashMap.get(a2);
            if (wv1Var == null) {
                sdy.u(b2, byteBuffer);
            } else {
                if (wv1Var.getType() != b2) {
                    StringBuilder a3 = t33.a("AMF unexpected type for property \"", a2, "\"; expected=");
                    a3.append((int) wv1Var.getType());
                    a3.append("; received=");
                    a3.append((int) b2);
                    throw new ProtocolException(a3.toString());
                }
                wv1Var.deserialize(byteBuffer);
            }
        }
    }

    @Override // xsna.wv1
    public final int getSize() throws ProtocolException {
        c cVar = new c();
        a(cVar);
        return cVar.a + 3;
    }

    @Override // xsna.wv1
    public final byte getType() {
        return (byte) 3;
    }

    @Override // xsna.wv1
    public void serialize(ByteBuffer byteBuffer) throws ProtocolException {
        b bVar = new b();
        bVar.a = byteBuffer;
        a(bVar);
        byteBuffer.putShort((short) 0);
        byteBuffer.put((byte) 9);
    }

    public final String toString() {
        d dVar = new d();
        dVar.b = new StringBuilder();
        dVar.a = true;
        try {
            a(dVar);
        } catch (ProtocolException e2) {
            Log.e("xsna.bw1", "toString failed", e2);
        }
        return "{" + ((Object) dVar.b) + "}";
    }

    public void a(e eVar) throws ProtocolException {
    }
}

package xsna;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import one.video.player.live.proto.rtmp.ProtocolException;

/* compiled from: AmfMessageBase.java */
/* loaded from: classes8.dex */
public class xv1 implements wv1 {

    /* compiled from: AmfMessageBase.java */
    public static class a implements e {
        public ByteBuffer a;

        @Override // xsna.xv1.e
        public final void a(wv1 wv1Var) throws ProtocolException {
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            if (5 == b) {
                return;
            }
            if (wv1Var.getType() == b) {
                wv1Var.deserialize(byteBuffer);
                return;
            }
            throw new ProtocolException("Unexpected AMF type: expected=" + ((int) wv1Var.getType()) + "; received=" + ((int) b));
        }
    }

    /* compiled from: AmfMessageBase.java */
    public static class b implements e {
        public ByteBuffer a;

        @Override // xsna.xv1.e
        public final void a(wv1 wv1Var) throws ProtocolException {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.put(wv1Var.getType());
            wv1Var.serialize(byteBuffer);
        }
    }

    /* compiled from: AmfMessageBase.java */
    public static class c implements e {
        public int a;

        @Override // xsna.xv1.e
        public final void a(wv1 wv1Var) throws ProtocolException {
            this.a = wv1Var.getSize() + 1 + this.a;
        }
    }

    /* compiled from: AmfMessageBase.java */
    public static class d implements e {
        public boolean a;
        public StringBuilder b;

        @Override // xsna.xv1.e
        public final void a(wv1 wv1Var) throws ProtocolException {
            StringBuilder sb = this.b;
            if (!this.a) {
                sb.append(StringUtils.COMMA);
            }
            this.a = false;
            sb.append(wv1Var.toString());
        }
    }

    /* compiled from: AmfMessageBase.java */
    public interface e {
        void a(wv1 wv1Var) throws ProtocolException;
    }

    public void a(e eVar) throws ProtocolException {
        throw null;
    }

    @Override // xsna.wv1
    public final void deserialize(ByteBuffer byteBuffer) throws ProtocolException {
        a aVar = new a();
        aVar.a = byteBuffer;
        a(aVar);
    }

    @Override // xsna.wv1
    public final int getSize() throws ProtocolException {
        c cVar = new c();
        a(cVar);
        return cVar.a;
    }

    @Override // xsna.wv1
    public final byte getType() {
        return (byte) 3;
    }

    @Override // xsna.wv1
    public final void serialize(ByteBuffer byteBuffer) throws ProtocolException {
        b bVar = new b();
        bVar.a = byteBuffer;
        a(bVar);
    }

    public final String toString() {
        d dVar = new d();
        dVar.b = new StringBuilder();
        dVar.a = true;
        try {
            a(dVar);
        } catch (ProtocolException e2) {
            Log.e("xsna.xv1", "toString failed", e2);
        }
        return "{" + dVar.b.toString() + "}";
    }
}

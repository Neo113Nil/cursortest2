package xsna;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.function.BiConsumer;
import one.video.calls.sdk_private.bF;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: MaxDataFrame.java */
/* loaded from: classes8.dex */
public final class dcy0 extends ihy0 {
    public long b;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.b) + 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(AmfConstants.TYPE_TYPED_OBJECT_MARKER);
        alk.g(this.b, byteBuffer);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        final vjy0 vjy0Var = bFVar.o;
        synchronized (vjy0Var) {
            try {
                long j = this.b;
                long j2 = vjy0Var.f;
                if (j > j2) {
                    boolean z = j2 == vjy0Var.g;
                    vjy0Var.f = j;
                    if (z) {
                        vjy0Var.j.forEach(new BiConsumer() { // from class: xsna.ujy0
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                Integer num = (Integer) obj;
                                wjy0 wjy0Var = (wjy0) obj2;
                                vjy0 vjy0Var2 = vjy0.this;
                                if (((Long) vjy0Var2.i.get(num)).equals(vjy0Var2.h.get(num))) {
                                    return;
                                }
                                num.getClass();
                                wjy0Var.c();
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return qlb0.a(this.b, "MaxDataFrame[", X3.j.e);
    }
}

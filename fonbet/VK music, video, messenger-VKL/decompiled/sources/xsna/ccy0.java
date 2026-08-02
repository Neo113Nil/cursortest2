package xsna;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;

/* compiled from: HandshakeDoneFrame.java */
/* loaded from: classes8.dex */
public final class ccy0 extends ihy0 {
    @Override // xsna.ihy0
    public final int a() {
        return 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 30);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        final bE bEVar = (bE) bFVar;
        synchronized (bEVar.g) {
            try {
                one.video.calls.sdk_private.bv bvVar = bEVar.f;
                one.video.calls.sdk_private.bv bvVar2 = one.video.calls.sdk_private.bv.d;
                if (bvVar.ordinal() < bvVar2.ordinal()) {
                    bEVar.f = bvVar2;
                    bEVar.h.forEach(new Consumer() { // from class: xsna.bgy0
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((uhy0) obj).a(bE.this.f);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bEVar.B.c(aG.b);
        sby0 sby0Var = bEVar.e;
        aF aFVar = aF.c;
        sby0Var.j[aFVar.ordinal()] = true;
        sby0Var.f[aFVar.ordinal()] = null;
        sby0Var.g[aFVar.ordinal()] = null;
    }

    public final String toString() {
        return "HandshakeDoneFrame[]";
    }
}

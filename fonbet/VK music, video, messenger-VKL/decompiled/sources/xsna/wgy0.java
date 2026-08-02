package xsna;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.bF;

/* compiled from: Padding.java */
/* loaded from: classes8.dex */
public final class wgy0 extends ihy0 {
    public int b;

    public wgy0(int i) {
        this.b = i;
    }

    @Override // xsna.ihy0
    public final int a() {
        return this.b;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[this.b]);
    }

    @Override // xsna.ihy0
    public final boolean h() {
        return false;
    }

    public final String toString() {
        return tgw.b(this.b, "Padding(", ")");
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
    }
}

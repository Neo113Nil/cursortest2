package xsna;

import com.vk.medianative.AudioNative;
import java.nio.ByteBuffer;
import xsna.xq4;

/* compiled from: AudioMessageUtils.java */
/* loaded from: classes15.dex */
public final class yq4 implements Runnable {
    public final /* synthetic */ ByteBuffer b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xq4.c d;

    /* compiled from: AudioMessageUtils.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            yq4 yq4Var = yq4.this;
            xq4.this.j.add(yq4Var.b);
        }
    }

    public yq4(xq4.c cVar, ByteBuffer byteBuffer, boolean z) {
        this.d = cVar;
        this.b = byteBuffer;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        xq4 xq4Var = xq4.this;
        while (true) {
            ByteBuffer byteBuffer = this.b;
            if (!byteBuffer.hasRemaining()) {
                xq4Var.e.i(new a());
                return;
            }
            if (byteBuffer.remaining() > xq4Var.f.remaining()) {
                i = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + xq4Var.f.remaining());
            } else {
                i = -1;
            }
            xq4Var.f.put(byteBuffer);
            int position = xq4Var.f.position();
            int limit = xq4Var.f.limit();
            boolean z = this.c;
            if (position == limit || z) {
                ByteBuffer byteBuffer2 = xq4Var.f;
                if (AudioNative.audioWriteFrame(byteBuffer2, z ? byteBuffer.position() : byteBuffer2.limit()) != 0) {
                    xq4Var.f.rewind();
                    xq4Var.w = Math.round((xq4Var.f.limit() / 2) * (1000.0d / xq4Var.p.h())) + xq4Var.w;
                }
            }
            if (i != -1) {
                byteBuffer.limit(i);
            }
        }
    }
}

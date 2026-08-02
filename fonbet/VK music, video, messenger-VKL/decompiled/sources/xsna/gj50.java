package xsna;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Muxer.java */
/* loaded from: classes8.dex */
public final class gj50 {
    public final MediaMuxer a;
    public boolean b = false;
    public int c = -1;
    public int d = -1;
    public boolean e = false;
    public boolean f = false;
    public final ArrayList g = new ArrayList();

    /* compiled from: Muxer.java */
    public static class a {
        public final int a;
        public final ByteBuffer b;
        public final MediaCodec.BufferInfo c;

        public a(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.a = i;
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
            this.b = allocate;
            allocate.put(byteBuffer);
            allocate.limit(byteBuffer.limit());
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            this.c = bufferInfo2;
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        }
    }

    public gj50(String str) throws IOException {
        this.a = new MediaMuxer(str, 0);
    }

    public final void a() {
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            this.a.writeSampleData(aVar.a, aVar.b, aVar.c);
        }
        arrayList.clear();
    }

    public final boolean b() {
        boolean z = this.e;
        boolean z2 = (z && this.c != -1) || (!z && this.c == -1);
        boolean z3 = this.f;
        return z2 && ((z3 && this.d != -1) || (!z3 && this.d == -1));
    }

    public final void c() {
        this.a.release();
    }
}

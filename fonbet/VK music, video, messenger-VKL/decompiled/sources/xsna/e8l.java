package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* compiled from: DecoderConfigDescriptor.java */
@x2m(tags = {4})
/* loaded from: classes13.dex */
public final class e8l extends sc6 {
    public static final Logger n = Logger.getLogger(e8l.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public o8l j;
    public zx4 k;
    public final ArrayList l = new ArrayList();
    public byte[] m;

    public e8l() {
        this.a = 4;
    }

    @Override // xsna.sc6
    public final int a() {
        zx4 zx4Var = this.k;
        int b = (zx4Var == null ? 0 : zx4Var.b()) + 13;
        o8l o8lVar = this.j;
        int b2 = b + (o8lVar != null ? o8lVar.b() : 0);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            b2 += ((dyd0) it.next()).b();
        }
        return b2;
    }

    @Override // xsna.sc6
    public final void d(ByteBuffer byteBuffer) throws IOException {
        this.d = crx0.e(byteBuffer.get());
        int e = crx0.e(byteBuffer.get());
        this.e = e >>> 2;
        this.f = (e >> 1) & 1;
        this.g = crx0.v(byteBuffer);
        this.h = crx0.w(byteBuffer);
        this.i = crx0.w(byteBuffer);
        while (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            sc6 a = lp70.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            n.finer(a + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a.b()));
            int b = a.b();
            if (position2 < b) {
                byte[] bArr = new byte[b - position2];
                this.m = bArr;
                byteBuffer.get(bArr);
            }
            if (a instanceof o8l) {
                this.j = (o8l) a;
            } else if (a instanceof zx4) {
                this.k = (zx4) a;
            } else if (a instanceof dyd0) {
                this.l.add((dyd0) a);
            }
        }
    }

    @Override // xsna.sc6
    public final String toString() {
        return "DecoderConfigDescriptor{objectTypeIndication=" + this.d + ", streamType=" + this.e + ", upStream=" + this.f + ", bufferSizeDB=" + this.g + ", maxBitRate=" + this.h + ", avgBitRate=" + this.i + ", decoderSpecificInfo=" + this.j + ", audioSpecificInfo=" + this.k + ", configDescriptorDeadBytes=" + skd.c(0, this.m) + ", profileLevelIndicationDescriptors=" + Arrays.asList(this.l).toString() + '}';
    }
}

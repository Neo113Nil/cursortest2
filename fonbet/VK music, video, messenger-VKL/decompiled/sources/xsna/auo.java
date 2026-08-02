package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.logging.Logger;

/* compiled from: ESDescriptor.java */
@x2m(tags = {3})
/* loaded from: classes13.dex */
public final class auo extends sc6 {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String j;
    public int k;
    public int l;
    public e8l m;
    public cyg0 n;
    public int i = 0;
    public final ArrayList o = new ArrayList();

    static {
        Logger.getLogger(auo.class.getName());
    }

    public auo() {
        this.a = 3;
    }

    @Override // xsna.sc6
    public final int a() {
        int i = this.e > 0 ? 5 : 3;
        if (this.f > 0) {
            i += this.i + 1;
        }
        if (this.g > 0) {
            i += 2;
        }
        int b = this.n.b() + this.m.b() + i;
        if (this.o.size() <= 0) {
            return b;
        }
        throw new RuntimeException(" Doesn't handle other descriptors yet");
    }

    @Override // xsna.sc6
    public final void d(ByteBuffer byteBuffer) throws IOException {
        this.d = crx0.u(byteBuffer);
        int e = crx0.e(byteBuffer.get());
        int i = e >>> 7;
        this.e = i;
        this.f = (e >>> 6) & 1;
        this.g = (e >>> 5) & 1;
        this.h = e & 31;
        if (i == 1) {
            this.k = crx0.u(byteBuffer);
        }
        if (this.f == 1) {
            int e2 = crx0.e(byteBuffer.get());
            this.i = e2;
            this.j = crx0.s(e2, byteBuffer);
        }
        if (this.g == 1) {
            this.l = crx0.u(byteBuffer);
        }
        while (byteBuffer.remaining() > 1) {
            sc6 a = lp70.a(-1, byteBuffer);
            if (a instanceof e8l) {
                this.m = (e8l) a;
            } else if (a instanceof cyg0) {
                this.n = (cyg0) a;
            } else {
                this.o.add(a);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || auo.class != obj.getClass()) {
            return false;
        }
        auo auoVar = (auo) obj;
        ArrayList arrayList = auoVar.o;
        if (this.f != auoVar.f || this.i != auoVar.i || this.k != auoVar.k || this.d != auoVar.d || this.l != auoVar.l || this.g != auoVar.g || this.e != auoVar.e || this.h != auoVar.h) {
            return false;
        }
        String str = this.j;
        if (str != null) {
            if (!str.equals(auoVar.j)) {
                return false;
            }
        } else if (auoVar.j != null) {
            return false;
        }
        return this.m.equals(auoVar.m) && this.o.equals(arrayList) && this.n.equals(auoVar.n);
    }

    public final int hashCode() {
        int i = ((((((((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str = this.j;
        return this.o.hashCode() + ((((this.m.hashCode() + ((((((i + (str != null ? str.hashCode() : 0)) * 961) + this.k) * 31) + this.l) * 31)) * 31) + this.n.d) * 31);
    }

    @Override // xsna.sc6
    public final String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f + ", oCRstreamFlag=" + this.g + ", streamPriority=" + this.h + ", URLLength=" + this.i + ", URLString='" + this.j + "', remoteODFlag=0, dependsOnEsId=" + this.k + ", oCREsId=" + this.l + ", decoderConfigDescriptor=" + this.m + ", slConfigDescriptor=" + this.n + '}';
    }
}

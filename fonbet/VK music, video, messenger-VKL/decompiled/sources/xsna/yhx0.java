package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import okio.ByteString;
import xsna.vl8;

/* compiled from: WebSocketWriter.kt */
/* loaded from: classes8.dex */
public final class yhx0 implements Closeable {
    public final an8 b;
    public final Random c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final vl8 h;
    public boolean i;
    public l920 j;
    public final vl8 g = new vl8();
    public final byte[] k = new byte[4];
    public final vl8.c l = new vl8.c();

    public yhx0(an8 an8Var, Random random, boolean z, boolean z2, long j) {
        this.b = an8Var;
        this.c = random;
        this.d = z;
        this.e = z2;
        this.f = j;
        this.h = an8Var.C();
    }

    public final void b(int i, ByteString byteString) throws IOException {
        if (this.i) {
            throw new IOException("closed");
        }
        int n = byteString.n();
        if (n > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        vl8 vl8Var = this.h;
        vl8Var.I(i | 128);
        vl8Var.I(n | 128);
        Random random = this.c;
        byte[] bArr = this.k;
        random.nextBytes(bArr);
        vl8Var.write(bArr, 0, bArr.length);
        if (n > 0) {
            long j = vl8Var.c;
            byteString.B(vl8Var, byteString.n());
            vl8.c cVar = this.l;
            b.a(vl8Var, cVar);
            cVar.i(j);
            vhx0.a(cVar, bArr);
            cVar.close();
        }
        this.b.flush();
    }

    public final void c(int i, ByteString byteString) throws IOException {
        if (this.i) {
            throw new IOException("closed");
        }
        vl8 vl8Var = this.g;
        vl8Var.getClass();
        byteString.B(vl8Var, byteString.n());
        int i2 = i | 128;
        if (this.d && byteString.n() >= this.f) {
            l920 l920Var = this.j;
            if (l920Var == null) {
                l920Var = new l920(this.e);
                this.j = l920Var;
            }
            nsl nslVar = l920Var.e;
            vl8 vl8Var2 = l920Var.c;
            if (vl8Var2.c != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (l920Var.b) {
                l920Var.d.reset();
            }
            nslVar.n1(vl8Var, vl8Var.c);
            nslVar.flush();
            if (vl8Var2.t(vl8Var2.c - r12.n(), m920.a)) {
                long j = vl8Var2.c - 4;
                vl8.c a = b.a(vl8Var2, e.a);
                try {
                    a.h(j);
                    a.close();
                } finally {
                }
            } else {
                vl8Var2.I(0);
            }
            vl8Var.n1(vl8Var2, vl8Var2.c);
            i2 = i | PsExtractor.AUDIO_STREAM;
        }
        long j2 = vl8Var.c;
        vl8 vl8Var3 = this.h;
        vl8Var3.I(i2);
        if (j2 <= 125) {
            vl8Var3.I(((int) j2) | 128);
        } else if (j2 <= 65535) {
            vl8Var3.I(254);
            vl8Var3.P((int) j2);
        } else {
            vl8Var3.I(255);
            vl8Var3.O(j2);
        }
        Random random = this.c;
        byte[] bArr = this.k;
        random.nextBytes(bArr);
        vl8Var3.write(bArr, 0, bArr.length);
        if (j2 > 0) {
            vl8.c cVar = this.l;
            b.a(vl8Var, cVar);
            cVar.i(0L);
            vhx0.a(cVar, bArr);
            cVar.close();
        }
        vl8Var3.n1(vl8Var, j2);
        this.b.t3();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l920 l920Var = this.j;
        if (l920Var != null) {
            l920Var.close();
        }
    }
}

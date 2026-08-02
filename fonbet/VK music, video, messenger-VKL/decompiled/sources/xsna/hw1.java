package xsna;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import xsna.n3i0;

/* compiled from: AmrExtractor.java */
/* loaded from: classes12.dex */
public final class hw1 implements pgq {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final k0n b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public rgq j;
    public rgp0 k;
    public rgp0 l;
    public n3i0 m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = y2r0.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public hw1() {
        k0n k0nVar = new k0n();
        this.b = k0nVar;
        this.l = k0nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        qgq qgqVar2;
        this.k.getClass();
        String str = y2r0.a;
        if (qgqVar.getPosition() == 0 && !g(qgqVar)) {
            throw ParserException.a(null, "Could not find AMR header.");
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str2 = MimeTypes.AUDIO_AMR_WB;
            String str3 = z ? MimeTypes.AUDIO_AMR_WB : "audio/amr";
            if (!z) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            }
            int i = z ? 16000 : 8000;
            int i2 = z ? r[8] : q[7];
            rgp0 rgp0Var = this.k;
            a.C0043a c0043a = new a.C0043a();
            c0043a.l = io20.q(str3);
            c0043a.m = io20.q(str2);
            c0043a.n = i2;
            c0043a.E = 1;
            c0043a.F = i;
            zjh0.d(c0043a, rgp0Var);
        }
        int i3 = 0;
        if (this.f == 0) {
            try {
                int f = f(qgqVar);
                this.e = f;
                this.f = f;
                if (this.g == -1) {
                    qgqVar.getPosition();
                    this.g = this.e;
                }
                if (this.g == this.e) {
                    this.h++;
                }
                n3i0 n3i0Var = this.m;
                if (n3i0Var instanceof utw) {
                    utw utwVar = (utw) n3i0Var;
                    long j = this.i + this.d + 20000;
                    long position = qgqVar.getPosition() + this.e;
                    ouw ouwVar = utwVar.b;
                    int i4 = ouwVar.a;
                    if (i4 == 0 || j - ouwVar.c(i4 - 1) >= 100000) {
                        ouw ouwVar2 = utwVar.a;
                        ouw ouwVar3 = utwVar.b;
                        if (ouwVar3.a == 0 && j > 0) {
                            ouwVar2.a(0L);
                            ouwVar3.a(0L);
                        }
                        ouwVar2.a(position);
                        ouwVar3.a(j);
                    }
                    if (this.n && Math.abs(this.o - j) < 20000) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
            } catch (EOFException unused) {
                qgqVar2 = qgqVar;
            }
        }
        qgqVar2 = qgqVar;
        int g = this.l.g(qgqVar2, this.f, true);
        if (g != -1) {
            int i5 = this.f - g;
            this.f = i5;
            if (i5 <= 0) {
                this.l.a(this.d + this.i, 1, this.e, 0, null);
                this.d += 20000;
            }
            qgqVar2.getLength();
            if (this.m == null) {
                n3i0.b bVar = new n3i0.b(C.TIME_UNSET);
                this.m = bVar;
                this.j.f(bVar);
            }
            if (i3 == -1) {
                n3i0 n3i0Var2 = this.m;
                if (n3i0Var2 instanceof utw) {
                    long j2 = this.i + this.d;
                    ((utw) n3i0Var2).c = j2;
                    this.j.f(n3i0Var2);
                    this.k.e(j2);
                }
            }
            return i3;
        }
        i3 = -1;
        qgqVar2.getLength();
        if (this.m == null) {
        }
        if (i3 == -1) {
        }
        return i3;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        return g(qgqVar);
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.j = rgqVar;
        rgp0 track = rgqVar.track(0, 1);
        this.k = track;
        this.l = track;
        rgqVar.endTracks();
    }

    public final int f(qgq qgqVar) throws IOException {
        boolean z;
        qgqVar.resetPeekPosition();
        byte[] bArr = this.a;
        qgqVar.peekFully(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    public final boolean g(qgq qgqVar) throws IOException {
        qgqVar.resetPeekPosition();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        qgqVar.peekFully(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            qgqVar.skipFully(bArr.length);
            return true;
        }
        qgqVar.resetPeekPosition();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        qgqVar.peekFully(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        qgqVar.skipFully(bArr3.length);
        return true;
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        n3i0 n3i0Var = this.m;
        if (!(n3i0Var instanceof utw)) {
            if (j == 0 || !(n3i0Var instanceof h5j)) {
                this.i = 0L;
                return;
            } else {
                this.i = (Math.max(0L, j - ((h5j) n3i0Var).b) * 8000000) / r7.e;
                return;
            }
        }
        utw utwVar = (utw) n3i0Var;
        ouw ouwVar = utwVar.b;
        long c = ouwVar.a == 0 ? C.TIME_UNSET : ouwVar.c(y2r0.d(utwVar.a, j));
        this.i = c;
        if (Math.abs(this.o - c) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    @Override // xsna.pgq
    public final void release() {
    }
}

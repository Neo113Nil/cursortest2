package defpackage;

import androidx.media3.common.a;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class j2v0 implements b5p {
    public final q2v0 a;
    public final a c;
    public final ArrayList d;
    public g001 g;
    public int h;
    public int i;
    public long[] j;
    public long k;
    public final qdf b = new qdf();
    public byte[] f = tw21.c;
    public final ef90 e = new ef90();

    public j2v0(q2v0 q2v0Var, a aVar) {
        a aVar2;
        this.a = q2v0Var;
        if (aVar != null) {
            f7s a = aVar.a();
            a.m = eh20.q("application/x-media3-cues");
            a.j = aVar.n;
            a.I = q2v0Var.f();
            aVar2 = new a(a);
        } else {
            aVar2 = null;
        }
        this.c = aVar2;
        this.d = new ArrayList();
        this.i = 0;
        this.j = tw21.d;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        int i = this.i;
        d6z.x((i == 0 || i == 5) ? false : true);
        this.k = j2;
        if (this.i == 2) {
            this.i = 1;
        }
        if (this.i == 4) {
            this.i = 3;
        }
    }

    public final void b(i2v0 i2v0Var) {
        d6z.z(this.g);
        byte[] bArr = i2v0Var.b;
        int length = bArr.length;
        ef90 ef90Var = this.e;
        ef90Var.getClass();
        ef90Var.I(bArr.length, bArr);
        this.g.a(ef90Var, length, 0);
        this.g.c(i2v0Var.a, 1, length, 0, null);
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        d6z.x(this.i == 0);
        g001 B = d5pVar.B(0, 3);
        this.g = B;
        a aVar = this.c;
        if (aVar != null) {
            B.d(aVar);
            d5pVar.A();
            d5pVar.w(new frv(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.i = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r20.h != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r2 == (-1)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        r4 = r20.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        r2 = new defpackage.p2v0(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        r20.a.b(r20.f, 0, r20.h, r2, new defpackage.ykn0(29, r20));
        java.util.Collections.sort(r11);
        r20.j = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r2 >= r11.size()) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r20.j[r2] = ((defpackage.i2v0) r11.get(r2)).a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c7, code lost:
    
        r20.f = defpackage.tw21.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
    
        r20.i = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
    
        r2 = defpackage.p2v0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d5, code lost:
    
        throw androidx.media3.common.ParserException.a(r0, "SubtitleParser failed.");
     */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        int i;
        int i2 = this.i;
        d6z.x((i2 == 0 || i2 == 5) ? false : true);
        if (this.i == 1) {
            int b = c5pVar.getLength() != -1 ? com.google.common.primitives.a.b(c5pVar.getLength()) : 1024;
            if (b > this.f.length) {
                this.f = new byte[b];
            }
            this.h = 0;
            this.i = 2;
        }
        int i3 = this.i;
        ArrayList arrayList = this.d;
        if (i3 == 2) {
            byte[] bArr = this.f;
            if (bArr.length == this.h) {
                this.f = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f;
            int i4 = this.h;
            int read = c5pVar.read(bArr2, i4, bArr2.length - i4);
            if (read != -1) {
                this.h += read;
            }
            long length = c5pVar.getLength();
            if (length != -1) {
                i = 0;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (this.i == 3) {
            if (c5pVar.z(c5pVar.getLength() != -1 ? com.google.common.primitives.a.b(c5pVar.getLength()) : 1024) == -1) {
                long j = this.k;
                for (int e = j == -9223372036854775807L ? i : tw21.e(this.j, j, true); e < arrayList.size(); e++) {
                    b((i2v0) arrayList.get(e));
                }
                this.i = 4;
            }
        }
        if (this.i == 4) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        return true;
    }

    @Override // defpackage.b5p
    public final void release() {
        if (this.i == 5) {
            return;
        }
        this.a.reset();
        this.i = 5;
    }
}

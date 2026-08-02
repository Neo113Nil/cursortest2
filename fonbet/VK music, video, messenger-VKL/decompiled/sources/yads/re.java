package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class re implements nq0 {
    public static final int[] q;
    public static final int t;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int j;
    public long k;
    public qq0 l;
    public q83 m;
    public zx2 n;
    public boolean o;
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] r = mc3.c("#!AMR\n");
    public static final byte[] s = mc3.c("#!AMR-WB\n");
    public final int b = 0;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        t = iArr[8];
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.l = qq0Var;
        this.m = qq0Var.a(0, 1);
        qq0Var.a();
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            zx2 zx2Var = this.n;
            if (zx2Var instanceof gz) {
                gz gzVar = (gz) zx2Var;
                this.k = gz.a(gzVar.e, j, gzVar.b);
                return;
            }
        }
        this.k = 0L;
    }

    public final int a(ld0 ld0Var) {
        boolean z;
        ld0Var.f = 0;
        ld0Var.b(this.a, 0, 1, false);
        byte b = this.a[0];
        if ((b & 131) > 0) {
            throw new pc2(nh2.a("Invalid padding bits for frame header ", b), null, true, 1);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? q[i] : p[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw new pc2(sb.toString(), null, true, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        int i;
        int i2;
        if (this.m != null) {
            int i3 = mc3.a;
            ld0 ld0Var = (ld0) oq0Var;
            if (ld0Var.d == 0) {
                byte[] bArr = r;
                ld0Var.f = 0;
                byte[] bArr2 = new byte[bArr.length];
                ld0Var.b(bArr2, 0, bArr.length, false);
                if (Arrays.equals(bArr2, bArr)) {
                    this.c = false;
                    ld0Var.a(bArr.length);
                } else {
                    byte[] bArr3 = s;
                    ld0Var.f = 0;
                    byte[] bArr4 = new byte[bArr3.length];
                    ld0Var.b(bArr4, 0, bArr3.length, false);
                    if (Arrays.equals(bArr4, bArr3)) {
                        this.c = true;
                        ld0Var.a(bArr3.length);
                    } else {
                        throw new pc2("Could not find AMR header.", null, true, 1);
                    }
                }
            }
            if (!this.o) {
                this.o = true;
                boolean z = this.c;
                String str = z ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB;
                int i4 = z ? 16000 : 8000;
                q83 q83Var = this.m;
                mx0 mx0Var = new mx0();
                mx0Var.k = str;
                mx0Var.l = t;
                mx0Var.x = 1;
                mx0Var.y = i4;
                q83Var.a(new nx0(mx0Var));
            }
            if (this.f == 0) {
                try {
                    int a = a((ld0) oq0Var);
                    this.e = a;
                    this.f = a;
                    if (this.i == -1) {
                        this.h = ld0Var.d;
                        this.i = a;
                    }
                    if (this.i == a) {
                        this.j++;
                    }
                } catch (EOFException unused) {
                }
            }
            int a2 = this.m.a(oq0Var, this.f, true);
            if (a2 != -1) {
                int i5 = this.f - a2;
                this.f = i5;
                if (i5 <= 0) {
                    this.m.a(this.k + this.d, 1, this.e, 0, null);
                    this.d += 20000;
                }
                i = 0;
                long j = ld0Var.c;
                if (!this.g) {
                    int i6 = this.b;
                    if ((i6 & 1) != 0 && j != -1 && ((i2 = this.i) == -1 || i2 == this.e)) {
                        if (this.j >= 20 || i == -1) {
                            gz gzVar = new gz((int) ((i2 * 8000000) / 20000), i2, j, this.h, (i6 & 2) != 0);
                            this.n = gzVar;
                            this.l.a(gzVar);
                            this.g = true;
                        }
                    } else {
                        yx2 yx2Var = new yx2(C.TIME_UNSET, 0L);
                        this.n = yx2Var;
                        this.l.a(yx2Var);
                        this.g = true;
                    }
                }
                return i;
            }
            i = -1;
            long j2 = ld0Var.c;
            if (!this.g) {
            }
            return i;
        }
        throw new IllegalStateException();
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        byte[] bArr = r;
        ld0Var.f = 0;
        byte[] bArr2 = new byte[bArr.length];
        ld0Var.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            ld0Var.a(bArr.length);
            return true;
        }
        byte[] bArr3 = s;
        ld0Var.f = 0;
        byte[] bArr4 = new byte[bArr3.length];
        ld0Var.b(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        ld0Var.a(bArr3.length);
        return true;
    }

    public static nq0[] a() {
        return new nq0[]{new re()};
    }
}

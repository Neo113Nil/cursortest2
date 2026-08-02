package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import xsna.tsp0;

/* compiled from: H263Reader.java */
/* loaded from: classes12.dex */
public final class gsu implements zap {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    @Nullable
    public final hhq0 a;

    @Nullable
    public final xi90 b;
    public final boolean[] c = new boolean[4];
    public final a d;

    @Nullable
    public final qt50 e;
    public b f;
    public long g;
    public String h;
    public rgp0 i;
    public boolean j;
    public long k;

    /* compiled from: H263Reader.java */
    public static final class a {
        public static final byte[] f = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e;

        public final void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c + i3;
                if (length < i4) {
                    this.e = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }
    }

    /* compiled from: H263Reader.java */
    public static final class b {
        public final rgp0 a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(rgp0 rgp0Var) {
            this.a = rgp0Var;
        }

        public final void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = (i2 - i) + i3;
                } else {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
        }

        public final void b(int i, long j, boolean z) {
            fxc0.z(this.h != C.TIME_UNSET);
            if (this.e == 182 && z && this.b) {
                this.a.a(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
            }
            if (this.e != 179) {
                this.g = j;
            }
        }
    }

    public gsu(@Nullable hhq0 hhq0Var) {
        this.a = hhq0Var;
        a aVar = new a();
        aVar.e = new byte[128];
        this.d = aVar;
        this.k = C.TIME_UNSET;
        this.e = new qt50(178);
        this.b = new xi90();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    @Override // xsna.zap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xi90 xi90Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i4 = xi90Var.b;
        int i5 = xi90Var.c;
        byte[] bArr = xi90Var.a;
        this.g += xi90Var.a();
        this.i.d(xi90Var.a(), xi90Var);
        while (true) {
            int b2 = rt50.b(bArr, i4, i5, this.c);
            a aVar = this.d;
            qt50 qt50Var = this.e;
            if (b2 == i5) {
                if (!this.j) {
                    aVar.a(bArr, i4, i5);
                }
                this.f.a(bArr, i4, i5);
                if (qt50Var != null) {
                    qt50Var.a(bArr, i4, i5);
                    return;
                }
                return;
            }
            int i6 = b2 + 3;
            byte b3 = xi90Var.a[i6];
            int i7 = b3 & 255;
            int i8 = b2 - i4;
            if (this.j) {
                i = i5;
            } else {
                if (i8 > 0) {
                    aVar.a(bArr, i4, b2);
                }
                int i9 = i8 < 0 ? -i8 : 0;
                int i10 = aVar.b;
                if (i10 == 0) {
                    i = i5;
                    i3 = 0;
                    if (i7 == 176) {
                        aVar.b = 1;
                        aVar.a = true;
                    }
                } else if (i10 == 1) {
                    i = i5;
                    i3 = 0;
                    if (i7 != 181) {
                        ahn.F("Unexpected start code value");
                        aVar.a = false;
                        aVar.c = 0;
                        aVar.b = 0;
                    } else {
                        aVar.b = 2;
                    }
                } else if (i10 == 2) {
                    i = i5;
                    i3 = 0;
                    if (i7 > 31) {
                        ahn.F("Unexpected start code value");
                        aVar.a = false;
                        aVar.c = 0;
                        aVar.b = 0;
                    } else {
                        aVar.b = 3;
                    }
                } else if (i10 == 3) {
                    i = i5;
                    if ((b3 & 240) != 32) {
                        ahn.F("Unexpected start code value");
                        i3 = 0;
                        aVar.a = false;
                        aVar.c = 0;
                        aVar.b = 0;
                    } else {
                        i3 = 0;
                        aVar.d = aVar.c;
                        aVar.b = 4;
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (i7 == 179 || i7 == 181) {
                        aVar.c -= i9;
                        aVar.a = false;
                        rgp0 rgp0Var = this.i;
                        int i11 = aVar.d;
                        String str = this.h;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(aVar.e, aVar.c);
                        wi90 wi90Var = new wi90(copyOf, copyOf.length);
                        wi90Var.p(i11);
                        wi90Var.p(4);
                        wi90Var.n();
                        wi90Var.o(8);
                        if (wi90Var.f()) {
                            wi90Var.o(4);
                            wi90Var.o(3);
                        }
                        int g = wi90Var.g(4);
                        if (g == 15) {
                            int g2 = wi90Var.g(8);
                            int g3 = wi90Var.g(8);
                            if (g3 == 0) {
                                ahn.F("Invalid aspect ratio");
                                f = 1.0f;
                                if (wi90Var.f()) {
                                    wi90Var.o(2);
                                    wi90Var.o(1);
                                    if (wi90Var.f()) {
                                        wi90Var.o(15);
                                        wi90Var.n();
                                        wi90Var.o(15);
                                        wi90Var.n();
                                        wi90Var.o(15);
                                        wi90Var.n();
                                        wi90Var.o(3);
                                        wi90Var.o(11);
                                        wi90Var.n();
                                        wi90Var.o(15);
                                        wi90Var.n();
                                    }
                                }
                                if (wi90Var.g(2) != 0) {
                                    ahn.F("Unhandled video object layer shape");
                                }
                                wi90Var.n();
                                int g4 = wi90Var.g(16);
                                wi90Var.n();
                                if (wi90Var.f()) {
                                    if (g4 == 0) {
                                        ahn.F("Invalid vop_increment_time_resolution");
                                    } else {
                                        i = i5;
                                        int i12 = 0;
                                        for (int i13 = g4 - 1; i13 > 0; i13 >>= 1) {
                                            i12++;
                                        }
                                        wi90Var.o(i12);
                                        wi90Var.n();
                                        int g5 = wi90Var.g(13);
                                        wi90Var.n();
                                        int g6 = wi90Var.g(13);
                                        wi90Var.n();
                                        wi90Var.n();
                                        a.C0043a c0043a = new a.C0043a();
                                        c0043a.a = str;
                                        c0043a.l = io20.q("video/mp2t");
                                        c0043a.m = io20.q(MimeTypes.VIDEO_MP4V);
                                        c0043a.t = g5;
                                        c0043a.u = g6;
                                        c0043a.z = f;
                                        c0043a.p = Collections.singletonList(copyOf);
                                        zjh0.d(c0043a, rgp0Var);
                                        this.j = true;
                                    }
                                }
                                i = i5;
                                wi90Var.n();
                                int g52 = wi90Var.g(13);
                                wi90Var.n();
                                int g62 = wi90Var.g(13);
                                wi90Var.n();
                                wi90Var.n();
                                a.C0043a c0043a2 = new a.C0043a();
                                c0043a2.a = str;
                                c0043a2.l = io20.q("video/mp2t");
                                c0043a2.m = io20.q(MimeTypes.VIDEO_MP4V);
                                c0043a2.t = g52;
                                c0043a2.u = g62;
                                c0043a2.z = f;
                                c0043a2.p = Collections.singletonList(copyOf);
                                zjh0.d(c0043a2, rgp0Var);
                                this.j = true;
                            } else {
                                f = g2 / g3;
                                if (wi90Var.f()) {
                                }
                                if (wi90Var.g(2) != 0) {
                                }
                                wi90Var.n();
                                int g42 = wi90Var.g(16);
                                wi90Var.n();
                                if (wi90Var.f()) {
                                }
                                i = i5;
                                wi90Var.n();
                                int g522 = wi90Var.g(13);
                                wi90Var.n();
                                int g622 = wi90Var.g(13);
                                wi90Var.n();
                                wi90Var.n();
                                a.C0043a c0043a22 = new a.C0043a();
                                c0043a22.a = str;
                                c0043a22.l = io20.q("video/mp2t");
                                c0043a22.m = io20.q(MimeTypes.VIDEO_MP4V);
                                c0043a22.t = g522;
                                c0043a22.u = g622;
                                c0043a22.z = f;
                                c0043a22.p = Collections.singletonList(copyOf);
                                zjh0.d(c0043a22, rgp0Var);
                                this.j = true;
                            }
                        } else if (g < 7) {
                            f = l[g];
                            if (wi90Var.f()) {
                            }
                            if (wi90Var.g(2) != 0) {
                            }
                            wi90Var.n();
                            int g422 = wi90Var.g(16);
                            wi90Var.n();
                            if (wi90Var.f()) {
                            }
                            i = i5;
                            wi90Var.n();
                            int g5222 = wi90Var.g(13);
                            wi90Var.n();
                            int g6222 = wi90Var.g(13);
                            wi90Var.n();
                            wi90Var.n();
                            a.C0043a c0043a222 = new a.C0043a();
                            c0043a222.a = str;
                            c0043a222.l = io20.q("video/mp2t");
                            c0043a222.m = io20.q(MimeTypes.VIDEO_MP4V);
                            c0043a222.t = g5222;
                            c0043a222.u = g6222;
                            c0043a222.z = f;
                            c0043a222.p = Collections.singletonList(copyOf);
                            zjh0.d(c0043a222, rgp0Var);
                            this.j = true;
                        } else {
                            ahn.F("Invalid aspect ratio");
                            f = 1.0f;
                            if (wi90Var.f()) {
                            }
                            if (wi90Var.g(2) != 0) {
                            }
                            wi90Var.n();
                            int g4222 = wi90Var.g(16);
                            wi90Var.n();
                            if (wi90Var.f()) {
                            }
                            i = i5;
                            wi90Var.n();
                            int g52222 = wi90Var.g(13);
                            wi90Var.n();
                            int g62222 = wi90Var.g(13);
                            wi90Var.n();
                            wi90Var.n();
                            a.C0043a c0043a2222 = new a.C0043a();
                            c0043a2222.a = str;
                            c0043a2222.l = io20.q("video/mp2t");
                            c0043a2222.m = io20.q(MimeTypes.VIDEO_MP4V);
                            c0043a2222.t = g52222;
                            c0043a2222.u = g62222;
                            c0043a2222.z = f;
                            c0043a2222.p = Collections.singletonList(copyOf);
                            zjh0.d(c0043a2222, rgp0Var);
                            this.j = true;
                        }
                    } else {
                        i = i5;
                        i3 = 0;
                    }
                }
                aVar.a(a.f, i3, 3);
            }
            this.f.a(bArr, i4, b2);
            if (qt50Var != null) {
                if (i8 > 0) {
                    qt50Var.a(bArr, i4, b2);
                    i2 = 0;
                } else {
                    i2 = -i8;
                }
                if (qt50Var.b(i2)) {
                    int m = rt50.m(qt50Var.d, qt50Var.e);
                    String str2 = y2r0.a;
                    byte[] bArr2 = qt50Var.d;
                    xi90 xi90Var2 = this.b;
                    xi90Var2.N(bArr2, m);
                    this.a.a(this.k, xi90Var2);
                }
                if (i7 == 178) {
                    z = true;
                    if (xi90Var.a[b2 + 2] == 1) {
                        qt50Var.d(i7);
                    }
                    int i14 = i - b2;
                    this.f.b(i14, this.g - i14, this.j);
                    b bVar = this.f;
                    long j = this.k;
                    bVar.e = i7;
                    bVar.d = false;
                    bVar.b = (i7 != 182 || i7 == 179) ? z : false;
                    bVar.c = i7 != 182 ? z : false;
                    bVar.f = 0;
                    bVar.h = j;
                    i4 = i6;
                    i5 = i;
                }
            }
            z = true;
            int i142 = i - b2;
            this.f.b(i142, this.g - i142, this.j);
            b bVar2 = this.f;
            long j2 = this.k;
            bVar2.e = i7;
            bVar2.d = false;
            bVar2.b = (i7 != 182 || i7 == 179) ? z : false;
            bVar2.c = i7 != 182 ? z : false;
            bVar2.f = 0;
            bVar2.h = j2;
            i4 = i6;
            i5 = i;
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.h = cVar.e;
        cVar.b();
        rgp0 track = rgqVar.track(cVar.d, 2);
        this.i = track;
        this.f = new b(track);
        this.a.b(rgqVar, cVar);
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.k = j;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
        this.f.getClass();
        if (z) {
            this.f.b(0, this.g, this.j);
            b bVar = this.f;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
    }

    @Override // xsna.zap
    public final void seek() {
        rt50.a(this.c);
        a aVar = this.d;
        aVar.a = false;
        aVar.c = 0;
        aVar.b = 0;
        b bVar = this.f;
        if (bVar != null) {
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
        qt50 qt50Var = this.e;
        if (qt50Var != null) {
            qt50Var.c();
        }
        this.g = 0L;
        this.k = C.TIME_UNSET;
    }
}

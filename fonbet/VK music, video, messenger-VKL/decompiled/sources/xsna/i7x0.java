package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.bpm0;
import xsna.j7x0;

/* compiled from: VorbisReader.java */
/* loaded from: classes12.dex */
public final class i7x0 extends bpm0 {

    @Nullable
    public a n;
    public int o;
    public boolean p;

    @Nullable
    public j7x0.c q;

    @Nullable
    public j7x0.a r;

    /* compiled from: VorbisReader.java */
    public static final class a {
        public final j7x0.c a;
        public final j7x0.a b;
        public final byte[] c;
        public final j7x0.b[] d;
        public final int e;

        public a(j7x0.c cVar, j7x0.a aVar, byte[] bArr, j7x0.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = aVar;
            this.c = bArr;
            this.d = bVarArr;
            this.e = i;
        }
    }

    @Override // xsna.bpm0
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        j7x0.c cVar = this.q;
        this.o = cVar != null ? cVar.e : 0;
    }

    @Override // xsna.bpm0
    public final long b(xi90 xi90Var) {
        byte b = xi90Var.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        a aVar = this.n;
        aVar.getClass();
        int i = aVar.e;
        j7x0.c cVar = aVar.a;
        int i2 = !aVar.d[(b >> 1) & (255 >>> (8 - i))].a ? cVar.e : cVar.f;
        long j = this.p ? (this.o + i2) / 4 : 0;
        byte[] bArr = xi90Var.a;
        int length = bArr.length;
        int i3 = xi90Var.c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            xi90Var.N(copyOf, copyOf.length);
        } else {
            xi90Var.O(i3);
        }
        byte[] bArr2 = xi90Var.a;
        int i4 = xi90Var.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i2;
        return j;
    }

    @Override // xsna.bpm0
    public final boolean c(xi90 xi90Var, long j, bpm0.a aVar) throws IOException {
        a aVar2;
        j7x0.c cVar;
        long j2;
        if (this.n != null) {
            aVar.a.getClass();
            return false;
        }
        j7x0.c cVar2 = this.q;
        int i = 4;
        if (cVar2 == null) {
            j7x0.c(1, xi90Var, false);
            xi90Var.u();
            int C = xi90Var.C();
            int u = xi90Var.u();
            int r = xi90Var.r();
            int i2 = r <= 0 ? -1 : r;
            int r2 = xi90Var.r();
            int i3 = r2 <= 0 ? -1 : r2;
            xi90Var.r();
            int C2 = xi90Var.C();
            int pow = (int) Math.pow(2.0d, C2 & 15);
            int pow2 = (int) Math.pow(2.0d, (C2 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
            xi90Var.C();
            this.q = new j7x0.c(C, u, i2, i3, pow, pow2, Arrays.copyOf(xi90Var.a, xi90Var.c));
        } else {
            j7x0.a aVar3 = this.r;
            if (aVar3 == null) {
                this.r = j7x0.b(xi90Var, true, true);
            } else {
                int i4 = xi90Var.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(xi90Var.a, 0, bArr, 0, i4);
                int i5 = cVar2.a;
                int i6 = 5;
                j7x0.c(5, xi90Var, false);
                int C3 = xi90Var.C() + 1;
                wi90 wi90Var = new wi90(xi90Var.a);
                int i7 = 8;
                wi90Var.o(xi90Var.b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = i7;
                    int i10 = 16;
                    if (i8 >= C3) {
                        j7x0.c cVar3 = cVar2;
                        int i11 = 6;
                        int g = wi90Var.g(6) + 1;
                        for (int i12 = 0; i12 < g; i12++) {
                            if (wi90Var.g(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i13 = 1;
                        int g2 = wi90Var.g(6) + 1;
                        int i14 = 0;
                        while (true) {
                            int i15 = 3;
                            if (i14 < g2) {
                                int g3 = wi90Var.g(i10);
                                if (g3 == 0) {
                                    int i16 = i9;
                                    wi90Var.o(i16);
                                    wi90Var.o(16);
                                    wi90Var.o(16);
                                    wi90Var.o(6);
                                    wi90Var.o(i16);
                                    int g4 = wi90Var.g(4) + 1;
                                    int i17 = 0;
                                    while (i17 < g4) {
                                        wi90Var.o(i16);
                                        i17++;
                                        i16 = 8;
                                    }
                                } else {
                                    if (g3 != i13) {
                                        throw ParserException.a(null, "floor type greater than 1 not decodable: " + g3);
                                    }
                                    int g5 = wi90Var.g(5);
                                    int[] iArr = new int[g5];
                                    int i18 = -1;
                                    for (int i19 = 0; i19 < g5; i19++) {
                                        int g6 = wi90Var.g(4);
                                        iArr[i19] = g6;
                                        if (g6 > i18) {
                                            i18 = g6;
                                        }
                                    }
                                    int i20 = i18 + 1;
                                    int[] iArr2 = new int[i20];
                                    int i21 = 0;
                                    while (i21 < i20) {
                                        iArr2[i21] = wi90Var.g(i15) + 1;
                                        int g7 = wi90Var.g(2);
                                        int i22 = i9;
                                        if (g7 > 0) {
                                            wi90Var.o(i22);
                                        }
                                        int i23 = i20;
                                        int i24 = 0;
                                        for (int i25 = 1; i24 < (i25 << g7); i25 = 1) {
                                            wi90Var.o(i22);
                                            i24++;
                                            i22 = 8;
                                        }
                                        i21++;
                                        i20 = i23;
                                        i9 = 8;
                                        i15 = 3;
                                    }
                                    wi90Var.o(2);
                                    int g8 = wi90Var.g(4);
                                    int i26 = 0;
                                    int i27 = 0;
                                    for (int i28 = 0; i28 < g5; i28++) {
                                        i26 += iArr2[iArr[i28]];
                                        while (i27 < i26) {
                                            wi90Var.o(g8);
                                            i27++;
                                        }
                                    }
                                }
                                i14++;
                                i9 = 8;
                                i11 = 6;
                                i13 = 1;
                                i10 = 16;
                            } else {
                                int g9 = wi90Var.g(i11) + 1;
                                int i29 = 0;
                                while (i29 < g9) {
                                    if (wi90Var.g(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    wi90Var.o(24);
                                    wi90Var.o(24);
                                    wi90Var.o(24);
                                    int g10 = wi90Var.g(i11) + 1;
                                    int i30 = 8;
                                    wi90Var.o(8);
                                    int[] iArr3 = new int[g10];
                                    for (int i31 = 0; i31 < g10; i31++) {
                                        iArr3[i31] = ((wi90Var.f() ? wi90Var.g(5) : 0) * 8) + wi90Var.g(3);
                                    }
                                    int i32 = 0;
                                    while (i32 < g10) {
                                        int i33 = 0;
                                        while (i33 < i30) {
                                            if ((iArr3[i32] & (1 << i33)) != 0) {
                                                wi90Var.o(i30);
                                            }
                                            i33++;
                                            i30 = 8;
                                        }
                                        i32++;
                                        i30 = 8;
                                    }
                                    i29++;
                                    i11 = 6;
                                }
                                int g11 = wi90Var.g(i11) + 1;
                                for (int i34 = 0; i34 < g11; i34++) {
                                    int g12 = wi90Var.g(16);
                                    if (g12 != 0) {
                                        ahn.n("VorbisUtil", "mapping type other than 0 not supported: " + g12);
                                    } else {
                                        int g13 = wi90Var.f() ? wi90Var.g(4) + 1 : 1;
                                        if (wi90Var.f()) {
                                            int g14 = wi90Var.g(8) + 1;
                                            for (int i35 = 0; i35 < g14; i35++) {
                                                int i36 = i5 - 1;
                                                int i37 = 0;
                                                for (int i38 = i36; i38 > 0; i38 >>>= 1) {
                                                    i37++;
                                                }
                                                wi90Var.o(i37);
                                                int i39 = 0;
                                                while (i36 > 0) {
                                                    i39++;
                                                    i36 >>>= 1;
                                                }
                                                wi90Var.o(i39);
                                            }
                                        }
                                        if (wi90Var.g(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (g13 > 1) {
                                            for (int i40 = 0; i40 < i5; i40++) {
                                                wi90Var.o(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < g13; i41++) {
                                            wi90Var.o(8);
                                            wi90Var.o(8);
                                            wi90Var.o(8);
                                        }
                                    }
                                }
                                int g15 = wi90Var.g(6);
                                int i42 = g15 + 1;
                                j7x0.b[] bVarArr = new j7x0.b[i42];
                                for (int i43 = 0; i43 < i42; i43++) {
                                    boolean f = wi90Var.f();
                                    wi90Var.g(16);
                                    wi90Var.g(16);
                                    wi90Var.g(8);
                                    bVarArr[i43] = new j7x0.b(f);
                                }
                                if (!wi90Var.f()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i44 = 0;
                                while (g15 > 0) {
                                    i44++;
                                    g15 >>>= 1;
                                }
                                aVar2 = new a(cVar3, aVar3, bArr, bVarArr, i44);
                            }
                        }
                    } else {
                        if (wi90Var.g(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((wi90Var.d * 8) + wi90Var.e));
                        }
                        int g16 = wi90Var.g(16);
                        int g17 = wi90Var.g(24);
                        if (wi90Var.f()) {
                            wi90Var.o(i6);
                            int i45 = 0;
                            while (i45 < g17) {
                                int i46 = 0;
                                for (int i47 = g17 - i45; i47 > 0; i47 >>>= 1) {
                                    i46++;
                                }
                                i45 += wi90Var.g(i46);
                            }
                        } else {
                            boolean f2 = wi90Var.f();
                            for (int i48 = 0; i48 < g17; i48++) {
                                if (!f2) {
                                    wi90Var.o(i6);
                                } else if (wi90Var.f()) {
                                    wi90Var.o(i6);
                                }
                            }
                        }
                        int g18 = wi90Var.g(i);
                        if (g18 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + g18);
                        }
                        if (g18 == 1 || g18 == 2) {
                            wi90Var.o(32);
                            wi90Var.o(32);
                            int g19 = wi90Var.g(i) + 1;
                            wi90Var.o(1);
                            if (g18 != 1) {
                                cVar = cVar2;
                                j2 = g16 * g17;
                            } else if (g16 != 0) {
                                cVar = cVar2;
                                j2 = (long) Math.floor(Math.pow(g17, 1.0d / g16));
                            } else {
                                cVar = cVar2;
                                j2 = 0;
                            }
                            wi90Var.o((int) (j2 * g19));
                        } else {
                            cVar = cVar2;
                        }
                        i8++;
                        i7 = i9;
                        cVar2 = cVar;
                        i = 4;
                        i6 = 5;
                    }
                }
            }
        }
        aVar2 = null;
        this.n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        j7x0.c cVar4 = aVar2.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar4.g);
        arrayList.add(aVar2.c);
        fi20 a2 = j7x0.a(ImmutableList.n(aVar2.b.a));
        a.C0043a c0043a = new a.C0043a();
        c0043a.l = io20.q("audio/ogg");
        c0043a.m = io20.q(MimeTypes.AUDIO_VORBIS);
        c0043a.h = cVar4.d;
        c0043a.i = cVar4.c;
        c0043a.E = cVar4.a;
        c0043a.F = cVar4.b;
        c0043a.p = arrayList;
        c0043a.k = a2;
        aVar.a = new androidx.media3.common.a(c0043a);
        return true;
    }

    @Override // xsna.bpm0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}

package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class do3 extends d53 {
    public co3 n;
    public int o;
    public boolean p;
    public go3 q;
    public eo3 r;

    @Override // yads.d53
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        go3 go3Var = this.q;
        this.o = go3Var != null ? go3Var.e : 0;
    }

    @Override // yads.d53
    public final long a(kc2 kc2Var) {
        int i;
        byte[] bArr = kc2Var.a;
        byte b = bArr[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        co3 co3Var = this.n;
        if (co3Var != null) {
            if (!co3Var.d[(b >> 1) & (255 >>> (8 - co3Var.e))].a) {
                i = co3Var.a.e;
            } else {
                i = co3Var.a.f;
            }
            long j = this.p ? (this.o + i) / 4 : 0;
            int length = bArr.length;
            int i2 = kc2Var.c + 4;
            if (length < i2) {
                kc2Var.a(Arrays.copyOf(bArr, i2));
            } else {
                kc2Var.d(i2);
            }
            byte[] bArr2 = kc2Var.a;
            int i3 = kc2Var.c;
            bArr2[i3 - 4] = (byte) (j & 255);
            bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
            bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
            bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
            this.p = true;
            this.o = i;
            return j;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.d53
    public final boolean a(kc2 kc2Var, long j, b53 b53Var) {
        co3 co3Var;
        int i;
        int i2;
        int i3;
        if (this.n != null) {
            b53Var.a.getClass();
            return false;
        }
        go3 go3Var = this.q;
        int i4 = 1;
        if (go3Var == null) {
            this.q = ho3.a(kc2Var);
        } else {
            eo3 eo3Var = this.r;
            if (eo3Var == null) {
                this.r = ho3.a(kc2Var, true, true);
            } else {
                int i5 = kc2Var.c;
                byte[] bArr = new byte[i5];
                System.arraycopy(kc2Var.a, 0, bArr, 0, i5);
                int i6 = go3Var.a;
                int i7 = 5;
                ho3.a(5, kc2Var, false);
                int m = kc2Var.m() + 1;
                xn3 xn3Var = new xn3(kc2Var.a);
                int i8 = 8;
                xn3Var.b(kc2Var.b * 8);
                int i9 = 0;
                while (true) {
                    int i10 = i8;
                    int i11 = 16;
                    if (i9 < m) {
                        int i12 = i4;
                        if (xn3Var.a(24) == 5653314) {
                            int a = xn3Var.a(16);
                            int a2 = xn3Var.a(24);
                            long[] jArr = new long[a2];
                            long j2 = 0;
                            if (!xn3Var.a()) {
                                boolean a3 = xn3Var.a();
                                int i13 = 0;
                                while (i13 < a2) {
                                    if (a3) {
                                        if (xn3Var.a()) {
                                            i3 = m;
                                            jArr[i13] = xn3Var.a(i7) + 1;
                                        } else {
                                            i3 = m;
                                            jArr[i13] = 0;
                                        }
                                        i2 = 5;
                                    } else {
                                        i2 = i7;
                                        i3 = m;
                                        jArr[i13] = xn3Var.a(i2) + 1;
                                    }
                                    i13++;
                                    i7 = i2;
                                    m = i3;
                                }
                                i = m;
                            } else {
                                i = m;
                                int a4 = xn3Var.a(i7) + 1;
                                int i14 = 0;
                                while (i14 < a2) {
                                    int i15 = 0;
                                    for (int i16 = a2 - i14; i16 > 0; i16 >>>= 1) {
                                        i15++;
                                    }
                                    int a5 = xn3Var.a(i15);
                                    int i17 = 0;
                                    while (i17 < a5 && i14 < a2) {
                                        jArr[i14] = a4;
                                        i14++;
                                        i17++;
                                        go3Var = go3Var;
                                        eo3Var = eo3Var;
                                    }
                                    a4++;
                                    go3Var = go3Var;
                                    eo3Var = eo3Var;
                                }
                            }
                            go3 go3Var2 = go3Var;
                            eo3 eo3Var2 = eo3Var;
                            int a6 = xn3Var.a(4);
                            if (a6 > 2) {
                                throw new pc2(nh2.a("lookup type greater than 2 not decodable: ", a6), null, true, 1);
                            }
                            if (a6 == i12 || a6 == 2) {
                                xn3Var.b(32);
                                xn3Var.b(32);
                                int a7 = xn3Var.a(4) + i12;
                                xn3Var.b(i12);
                                if (a6 != i12) {
                                    j2 = a2 * a;
                                } else if (a != 0) {
                                    j2 = (long) Math.floor(Math.pow(a2, 1.0d / a));
                                }
                                xn3Var.b((int) (a7 * j2));
                            }
                            i9++;
                            i8 = i10;
                            go3Var = go3Var2;
                            m = i;
                            eo3Var = eo3Var2;
                            i7 = 5;
                            i4 = 1;
                        } else {
                            throw new pc2("expected code book to start with [0x56, 0x43, 0x42] at " + ((xn3Var.c * 8) + xn3Var.d), null, true, 1);
                        }
                    } else {
                        go3 go3Var3 = go3Var;
                        eo3 eo3Var3 = eo3Var;
                        boolean z = i4;
                        int i18 = 6;
                        int a8 = xn3Var.a(6) + (z ? 1 : 0);
                        for (int i19 = 0; i19 < a8; i19++) {
                            if (xn3Var.a(16) != 0) {
                                throw new pc2("placeholder of time domain transforms not zeroed out", null, z, z ? 1 : 0);
                            }
                        }
                        int a9 = xn3Var.a(6) + (z ? 1 : 0);
                        int i20 = 0;
                        int i21 = z;
                        while (true) {
                            int i22 = 3;
                            if (i20 < a9) {
                                int a10 = xn3Var.a(i11);
                                if (a10 == 0) {
                                    int i23 = i10;
                                    xn3Var.b(i23);
                                    xn3Var.b(16);
                                    xn3Var.b(16);
                                    xn3Var.b(6);
                                    xn3Var.b(i23);
                                    int a11 = xn3Var.a(4) + i21;
                                    int i24 = 0;
                                    while (i24 < a11) {
                                        xn3Var.b(i23);
                                        i24++;
                                        i23 = 8;
                                    }
                                } else if (a10 == i21) {
                                    int a12 = xn3Var.a(5);
                                    int[] iArr = new int[a12];
                                    int i25 = -1;
                                    for (int i26 = 0; i26 < a12; i26++) {
                                        int a13 = xn3Var.a(4);
                                        iArr[i26] = a13;
                                        if (a13 > i25) {
                                            i25 = a13;
                                        }
                                    }
                                    int i27 = i25 + 1;
                                    int[] iArr2 = new int[i27];
                                    int i28 = 0;
                                    while (i28 < i27) {
                                        iArr2[i28] = xn3Var.a(i22) + 1;
                                        int a14 = xn3Var.a(2);
                                        int i29 = i10;
                                        if (a14 > 0) {
                                            xn3Var.b(i29);
                                        }
                                        int i30 = 0;
                                        for (int i31 = 1; i30 < (i31 << a14); i31 = 1) {
                                            xn3Var.b(i29);
                                            i30++;
                                            i29 = 8;
                                        }
                                        i28++;
                                        i10 = 8;
                                        i22 = 3;
                                    }
                                    xn3Var.b(2);
                                    int a15 = xn3Var.a(4);
                                    int i32 = 0;
                                    int i33 = 0;
                                    for (int i34 = 0; i34 < a12; i34++) {
                                        i32 += iArr2[iArr[i34]];
                                        while (i33 < i32) {
                                            xn3Var.b(a15);
                                            i33++;
                                        }
                                    }
                                } else {
                                    throw new pc2(nh2.a("floor type greater than 1 not decodable: ", a10), null, true, 1);
                                }
                                i20++;
                                i10 = 8;
                                i18 = 6;
                                i21 = 1;
                                i11 = 16;
                            } else {
                                int i35 = 1;
                                int a16 = xn3Var.a(i18) + 1;
                                int i36 = 0;
                                while (i36 < a16) {
                                    if (xn3Var.a(16) <= 2) {
                                        xn3Var.b(24);
                                        xn3Var.b(24);
                                        xn3Var.b(24);
                                        int a17 = xn3Var.a(i18) + 1;
                                        int i37 = 8;
                                        xn3Var.b(8);
                                        int[] iArr3 = new int[a17];
                                        for (int i38 = 0; i38 < a17; i38++) {
                                            iArr3[i38] = ((xn3Var.a() ? xn3Var.a(5) : 0) * 8) + xn3Var.a(3);
                                        }
                                        int i39 = 0;
                                        while (i39 < a17) {
                                            int i40 = 0;
                                            while (i40 < i37) {
                                                if ((iArr3[i39] & (1 << i40)) != 0) {
                                                    xn3Var.b(i37);
                                                }
                                                i40++;
                                                i37 = 8;
                                            }
                                            i39++;
                                            i37 = 8;
                                        }
                                        i36++;
                                        i18 = 6;
                                        i35 = 1;
                                    } else {
                                        throw new pc2("residueType greater than 2 is not decodable", null, true, 1);
                                    }
                                }
                                int a18 = xn3Var.a(i18) + i35;
                                for (int i41 = 0; i41 < a18; i41++) {
                                    int a19 = xn3Var.a(16);
                                    if (a19 != 0) {
                                        ji1.b("VorbisUtil", "mapping type other than 0 not supported: " + a19);
                                    } else {
                                        int a20 = xn3Var.a() ? xn3Var.a(4) + 1 : 1;
                                        if (xn3Var.a()) {
                                            int a21 = xn3Var.a(8) + 1;
                                            for (int i42 = 0; i42 < a21; i42++) {
                                                int i43 = i6 - 1;
                                                int i44 = 0;
                                                for (int i45 = i43; i45 > 0; i45 >>>= 1) {
                                                    i44++;
                                                }
                                                xn3Var.b(i44);
                                                int i46 = 0;
                                                while (i43 > 0) {
                                                    i46++;
                                                    i43 >>>= 1;
                                                }
                                                xn3Var.b(i46);
                                            }
                                        }
                                        if (xn3Var.a(2) != 0) {
                                            throw new pc2("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                        }
                                        if (a20 > 1) {
                                            for (int i47 = 0; i47 < i6; i47++) {
                                                xn3Var.b(4);
                                            }
                                        }
                                        for (int i48 = 0; i48 < a20; i48++) {
                                            xn3Var.b(8);
                                            xn3Var.b(8);
                                            xn3Var.b(8);
                                        }
                                    }
                                }
                                int a22 = xn3Var.a(6);
                                int i49 = a22 + 1;
                                fo3[] fo3VarArr = new fo3[i49];
                                for (int i50 = 0; i50 < i49; i50++) {
                                    boolean a23 = xn3Var.a();
                                    xn3Var.a(16);
                                    xn3Var.a(16);
                                    xn3Var.a(8);
                                    fo3VarArr[i50] = new fo3(a23);
                                }
                                if (xn3Var.a()) {
                                    int i51 = 0;
                                    while (a22 > 0) {
                                        i51++;
                                        a22 >>>= 1;
                                    }
                                    co3Var = new co3(go3Var3, eo3Var3, bArr, fo3VarArr, i51);
                                } else {
                                    throw new pc2("framing bit after modes not set as expected", null, true, 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        co3Var = null;
        this.n = co3Var;
        if (co3Var == null) {
            return true;
        }
        go3 go3Var4 = co3Var.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(go3Var4.g);
        arrayList.add(co3Var.c);
        ut1 a24 = ho3.a(s51.b(co3Var.b.a));
        mx0 mx0Var = new mx0();
        mx0Var.k = MimeTypes.AUDIO_VORBIS;
        mx0Var.f = go3Var4.d;
        mx0Var.g = go3Var4.c;
        mx0Var.x = go3Var4.a;
        mx0Var.y = go3Var4.b;
        mx0Var.m = arrayList;
        mx0Var.i = a24;
        b53Var.a = new nx0(mx0Var);
        return true;
    }

    @Override // yads.d53
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}

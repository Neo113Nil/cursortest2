package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import java.math.RoundingMode;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class l941 implements m941, bt71 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, HProv.PP_SET_PIN, HProv.PP_INFO, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public static final int[] o = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] p = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, HProv.PP_SET_PIN, HProv.PP_INFO, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final int a;
    public final byte[] b;
    public final int c;
    public int d;
    public long e;
    public int f;
    public long g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public l941(d5p d5pVar, g001 g001Var, lhc0 lhc0Var) {
        this.h = d5pVar;
        this.i = g001Var;
        this.j = lhc0Var;
        int i = lhc0Var.c;
        int max = Math.max(1, i / 10);
        this.c = max;
        ef90 ef90Var = new ef90(lhc0Var.f);
        ef90Var.r();
        int r = ef90Var.r();
        this.a = r;
        int i2 = lhc0Var.b;
        int i3 = lhc0Var.d;
        int i4 = (((i3 - (i2 * 4)) * 8) / (lhc0Var.e * i2)) + 1;
        if (r != i4) {
            throw ParserException.a(null, "Expected frames per block: " + i4 + "; got: " + r);
        }
        int f = tw21.f(max, r);
        this.b = new byte[f * i3];
        this.k = new ef90(r * 2 * i2 * f);
        int i5 = ((i3 * i) * 8) / r;
        f7s f7sVar = new f7s();
        f7sVar.m = eh20.q("audio/raw");
        f7sVar.h = i5;
        f7sVar.i = i5;
        f7sVar.n = max * 2 * i2;
        f7sVar.C = i2;
        f7sVar.D = i;
        f7sVar.E = 2;
        this.l = new a(f7sVar);
    }

    @Override // defpackage.bt71
    public void a(long j) {
        this.d = 0;
        this.e = j;
        this.f = 0;
        this.g = 0L;
    }

    @Override // defpackage.m941
    public void b(int i, long j) {
        ((d5p) this.h).w(new p941((lhc0) this.j, this.a, i, j));
        ((g001) this.i).d((a) this.l);
    }

    @Override // defpackage.bt71
    public void c(int i, long j) {
        ((yg71) this.h).r(new tc81((lhc0) this.j, this.a, i, j));
        ((fb81) this.i).k((qd81) this.l);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0055->B:15:0x0055 BREAK  A[LOOP:0: B:6:0x0030->B:12:0x004d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0049 -> B:4:0x004b). Please report as a decompilation issue!!! */
    @Override // defpackage.bt71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(defpackage.w971 r25, long r26) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l941.d(w971, long):boolean");
    }

    @Override // defpackage.m941
    public void e(long j) {
        this.d = 0;
        this.e = j;
        this.f = 0;
        this.g = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0042 -> B:3:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.m941
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(c5p c5pVar, long j) {
        boolean z;
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int read;
        ef90 ef90Var = (ef90) this.k;
        int i4 = this.f;
        lhc0 lhc0Var = (lhc0) this.j;
        int i5 = i4 / (lhc0Var.b * 2);
        int i6 = this.c;
        int i7 = this.a;
        int f = tw21.f(i6 - i5, i7);
        int i8 = lhc0Var.d;
        int i9 = f * i8;
        if (j != 0) {
            z = false;
            while (true) {
                bArr = this.b;
                if (!!z || (i3 = this.d) >= i9) {
                    break;
                }
                read = c5pVar.read(bArr, this.d, (int) Math.min(i9 - i3, j));
                if (read == -1) {
                    break;
                }
                this.d += read;
            }
            i = this.d / i8;
            if (i > 0) {
                int i10 = 0;
                while (i10 < i) {
                    int i11 = 0;
                    while (true) {
                        int i12 = lhc0Var.b;
                        if (i11 < i12) {
                            byte[] bArr2 = ef90Var.a;
                            int i13 = (i11 * 4) + (i10 * i8);
                            int i14 = (i12 * 4) + i13;
                            int i15 = (i8 / i12) - 4;
                            int i16 = (short) ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8));
                            int i17 = i;
                            int min = Math.min(bArr[i13 + 2] & 255, 88);
                            int[] iArr = n;
                            int i18 = iArr[min];
                            int i19 = ((i10 * i7 * i12) + i11) * 2;
                            bArr2[i19] = (byte) (i16 & 255);
                            bArr2[i19 + 1] = (byte) (i16 >> 8);
                            int i20 = i10;
                            int i21 = 0;
                            while (i21 < i15 * 2) {
                                byte b = bArr[((i21 / 8) * i12 * 4) + i14 + ((i21 / 2) % 4)];
                                int i22 = i21;
                                int i23 = i22 % 2 == 0 ? b & PKIBody._CCP : (b & 255) >> 4;
                                int i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                i16 = tw21.i(i16 + i24, -32768, 32767);
                                i19 = (i12 * 2) + i19;
                                bArr2[i19] = (byte) (i16 & 255);
                                bArr2[i19 + 1] = (byte) (i16 >> 8);
                                min = tw21.i(min + m[i23], 0, 88);
                                i18 = iArr[min];
                                i21 = i22 + 1;
                            }
                            i11++;
                            i = i17;
                            i10 = i20;
                        }
                    }
                    i10++;
                }
                int i25 = i;
                int i26 = i7 * i25 * 2 * lhc0Var.b;
                ef90Var.K(0);
                ef90Var.J(i26);
                this.d -= i25 * i8;
                int i27 = ef90Var.c;
                ((g001) this.i).a(ef90Var, i27, 0);
                int i28 = this.f + i27;
                this.f = i28;
                if (i28 / (lhc0Var.b * 2) >= i6) {
                    g(i6);
                }
            }
            if (z && (i2 = this.f / (lhc0Var.b * 2)) > 0) {
                g(i2);
            }
            return z;
        }
        z = true;
        while (true) {
            bArr = this.b;
            if (!z) {
                break;
            }
            break;
            this.d += read;
        }
        i = this.d / i8;
        if (i > 0) {
        }
        if (z) {
            g(i2);
        }
        return z;
    }

    public void g(int i) {
        long j = this.e;
        long j2 = this.g;
        lhc0 lhc0Var = (lhc0) this.j;
        long j3 = lhc0Var.c;
        int i2 = tw21.a;
        long e0 = j + tw21.e0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i3 = i * 2 * lhc0Var.b;
        ((g001) this.i).c(e0, 1, i3, this.f - i3, null);
        this.g += i;
        this.f -= i3;
    }

    public l941(yg71 yg71Var, fb81 fb81Var, lhc0 lhc0Var) {
        this.h = yg71Var;
        this.i = fb81Var;
        this.j = lhc0Var;
        int i = lhc0Var.c;
        int max = Math.max(1, i / 10);
        this.c = max;
        byte[] bArr = lhc0Var.f;
        int length = bArr.length;
        byte b = bArr[0];
        byte b2 = bArr[1];
        int i2 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.a = i2;
        int i3 = lhc0Var.b;
        int i4 = lhc0Var.d;
        int i5 = (((i4 - (i3 * 4)) * 8) / (lhc0Var.e * i3)) + 1;
        if (i2 == i5) {
            int i6 = rf71.a;
            int i7 = ((max + i2) - 1) / i2;
            this.b = new byte[i7 * i4];
            this.k = new dl81(i2 * 2 * i3 * i7);
            int i8 = ((i4 * i) * 8) / i2;
            da81 da81Var = new da81();
            da81Var.k = "audio/raw";
            da81Var.f = i8;
            da81Var.g = i8;
            da81Var.l = max * 2 * i3;
            da81Var.x = i3;
            da81Var.y = i;
            da81Var.z = 2;
            this.l = new qd81(da81Var);
            return;
        }
        dy31.g(null, oyr.h(i5, i2, "Expected frames per block: ", "; got: "));
        throw null;
    }
}

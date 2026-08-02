package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes4.dex */
public class nll0 {
    public static final long[] o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int n;
    public final byte[] a = new byte[8];
    public final long[] m = new long[80];
    public int b = 0;

    public nll0() {
        g();
        ((edf) fdf.b.get()).getClass();
        g();
    }

    public static long a(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    public static long b(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    public static long c(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public static long d(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    public final void e() {
        long[] jArr;
        long j = this.c;
        if (j > 2305843009213693951L) {
            this.d += j >>> 61;
            this.c = j & 2305843009213693951L;
        }
        int i = 16;
        while (true) {
            jArr = this.m;
            if (i > 79) {
                break;
            }
            long j2 = jArr[i - 2];
            long j3 = ((j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)))) + jArr[i - 7];
            long j4 = jArr[i - 15];
            jArr[i] = j3 + ((((j4 >>> 8) | (j4 << 56)) ^ ((j4 << 63) | (j4 >>> 1))) ^ (j4 >>> 7)) + jArr[i - 16];
            i++;
        }
        long j5 = this.e;
        long j6 = this.f;
        long j7 = this.g;
        long j8 = this.h;
        long j9 = this.i;
        long j10 = this.j;
        long j11 = this.k;
        long j12 = j5;
        long j13 = j8;
        long j14 = j6;
        long j15 = j9;
        long j16 = j7;
        long j17 = j10;
        long j18 = this.l;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 10) {
            long d = d(j15);
            long a = a(j15, j17, j11);
            long j19 = j15;
            long j20 = j11;
            long j21 = j17;
            long[] jArr2 = o;
            int i4 = i3 + 1;
            long j22 = d + a + jArr2[i3] + jArr[i3] + j18;
            long j23 = j13 + j22;
            long j24 = j14;
            long j25 = j16;
            long c = c(j12) + b(j12, j24, j25) + j22;
            long d2 = d(j23) + a(j23, j19, j21) + jArr2[i4];
            int i5 = i3 + 2;
            long j26 = d2 + jArr[i4] + j20;
            long j27 = j25 + j26;
            long j28 = j12;
            long c2 = c(c) + b(c, j28, j24) + j26;
            int i6 = i3 + 3;
            long d3 = d(j27) + a(j27, j23, j19) + jArr2[i5] + jArr[i5] + j21;
            long j29 = j24 + d3;
            long c3 = c(c2) + b(c2, c, j28) + d3;
            int i7 = i3 + 4;
            long d4 = d(j29) + a(j29, j27, j23) + jArr2[i6] + jArr[i6] + j19;
            long j30 = j28 + d4;
            long c4 = c(c3) + b(c3, c2, c) + d4;
            int i8 = i3 + 5;
            long d5 = d(j30) + a(j30, j29, j27) + jArr2[i7] + jArr[i7] + j23;
            long j31 = c + d5;
            long c5 = c(c4) + b(c4, c3, c2) + d5;
            int i9 = i3 + 6;
            long d6 = d(j31) + a(j31, j30, j29) + jArr2[i8] + jArr[i8] + j27;
            long j32 = c2 + d6;
            long c6 = c(c5) + b(c5, c4, c3) + d6;
            int i10 = i3 + 7;
            long d7 = d(j32) + a(j32, j31, j30) + jArr2[i9] + jArr[i9] + j29;
            long j33 = c3 + d7;
            long c7 = c(c6) + b(c6, c5, c4) + d7;
            i3 += 8;
            long d8 = d(j33) + a(j33, j32, j31) + jArr2[i10] + jArr[i10] + j30;
            long j34 = c4 + d8;
            long c8 = d8 + c(c7) + b(c7, c6, c5);
            i2++;
            j17 = j33;
            j16 = c6;
            j15 = j34;
            j18 = j31;
            j14 = c7;
            j13 = c5;
            j11 = j32;
            j12 = c8;
        }
        this.e += j12;
        this.f += j14;
        this.g += j16;
        this.h += j13;
        this.i += j15;
        this.j += j17;
        this.k += j11;
        this.l += j18;
        this.n = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            jArr[i11] = 0;
        }
    }

    public final void f(int i, byte[] bArr) {
        int i2 = this.n;
        int a = u490.a(i, bArr);
        this.m[i2] = (u490.a(i + 4, bArr) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | ((a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) << 32);
        int i3 = this.n + 1;
        this.n = i3;
        if (i3 == 16) {
            e();
        }
    }

    public final void g() {
        this.c = 0L;
        this.d = 0L;
        int i = 0;
        this.b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.n = 0;
        while (true) {
            long[] jArr = this.m;
            if (i == jArr.length) {
                this.e = 7640891576956012808L;
                this.f = -4942790177534073029L;
                this.g = 4354685564936845355L;
                this.h = -6534734903238641935L;
                this.i = 5840696475078001361L;
                this.j = -7276294671716946913L;
                this.k = 2270897969802886507L;
                this.l = 6620516959819538809L;
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    public final void h(byte b) {
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        bArr[i] = b;
        if (i2 == bArr.length) {
            f(0, bArr);
            this.b = 0;
        }
        this.c++;
    }

    public final void i(int i, byte[] bArr) {
        int i2 = 0;
        while (this.b != 0 && i > 0) {
            h(bArr[i2]);
            i2++;
            i--;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i < bArr2.length) {
                break;
            }
            f(i2, bArr);
            i2 += bArr2.length;
            i -= bArr2.length;
            this.c += bArr2.length;
        }
        while (i > 0) {
            h(bArr[i2]);
            i2++;
            i--;
        }
    }
}

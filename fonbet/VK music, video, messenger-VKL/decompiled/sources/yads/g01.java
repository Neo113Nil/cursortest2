package yads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes10.dex */
public final class g01 implements vl0 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public q83 b;
    public final kc3 c;
    public final kc2 d;
    public final az1 e;
    public final boolean[] f = new boolean[4];
    public final f01 g = new f01();
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public g01(kc3 kc3Var) {
        this.c = kc3Var;
        if (kc3Var != null) {
            this.e = new az1(178);
            this.d = new kc2();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = C.TIME_UNSET;
        this.n = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        int i;
        long j;
        long j2;
        boolean z;
        boolean z2;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j3;
        q83 q83Var = this.b;
        if (q83Var == null) {
            throw new IllegalStateException();
        }
        int i5 = kc2Var.b;
        int i6 = kc2Var.c;
        byte[] bArr = kc2Var.a;
        int i7 = i6 - i5;
        this.h += i7;
        q83Var.a(i7, kc2Var);
        while (true) {
            int a = ez1.a(bArr, i5, i6, this.f);
            if (a == i6) {
                break;
            }
            int i8 = a + 3;
            int i9 = kc2Var.a[i8] & 255;
            int i10 = a - i5;
            if (this.j) {
                i = 9;
            } else {
                if (i10 > 0) {
                    this.g.a(bArr, i5, a);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                f01 f01Var = this.g;
                i = 9;
                if (f01Var.a) {
                    int i12 = f01Var.b - i11;
                    f01Var.b = i12;
                    if (f01Var.c == 0 && i9 == 181) {
                        f01Var.c = i12;
                    } else {
                        f01Var.a = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(f01Var.d, f01Var.b);
                        int i13 = copyOf[4] & 255;
                        byte b = copyOf[5];
                        int i14 = (i13 << 4) | ((b & 255) >> 4);
                        int i15 = (copyOf[6] & 255) | ((b & AmfConstants.TYPE_XML_DOCUMENT_MARKER) << 8);
                        int i16 = (copyOf[7] & 240) >> 4;
                        if (i16 == 2) {
                            f = i15 * 4;
                            i3 = i14 * 3;
                        } else if (i16 == 3) {
                            f = i15 * 16;
                            i3 = i14 * 9;
                        } else if (i16 != 4) {
                            f2 = 1.0f;
                            mx0 mx0Var = new mx0();
                            mx0Var.a = str;
                            mx0Var.k = MimeTypes.VIDEO_MPEG2;
                            mx0Var.p = i14;
                            mx0Var.q = i15;
                            mx0Var.t = f2;
                            mx0Var.m = Collections.singletonList(copyOf);
                            nx0 nx0Var = new nx0(mx0Var);
                            i4 = (copyOf[7] & AmfConstants.TYPE_XML_DOCUMENT_MARKER) - 1;
                            if (i4 >= 0) {
                                double[] dArr = q;
                                if (i4 < 8) {
                                    double d = dArr[i4];
                                    byte b2 = copyOf[f01Var.c + 9];
                                    int i17 = (b2 & 96) >> 5;
                                    if (i17 != (b2 & 31)) {
                                        d *= (i17 + 1.0d) / (r10 + 1);
                                    }
                                    j3 = (long) (1000000.0d / d);
                                    Pair create = Pair.create(nx0Var, Long.valueOf(j3));
                                    this.b.a((nx0) create.first);
                                    this.k = ((Long) create.second).longValue();
                                    this.j = true;
                                }
                            }
                            j3 = 0;
                            Pair create2 = Pair.create(nx0Var, Long.valueOf(j3));
                            this.b.a((nx0) create2.first);
                            this.k = ((Long) create2.second).longValue();
                            this.j = true;
                        } else {
                            f = i15 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            i3 = i14 * 100;
                        }
                        f2 = f / i3;
                        mx0 mx0Var2 = new mx0();
                        mx0Var2.a = str;
                        mx0Var2.k = MimeTypes.VIDEO_MPEG2;
                        mx0Var2.p = i14;
                        mx0Var2.q = i15;
                        mx0Var2.t = f2;
                        mx0Var2.m = Collections.singletonList(copyOf);
                        nx0 nx0Var2 = new nx0(mx0Var2);
                        i4 = (copyOf[7] & AmfConstants.TYPE_XML_DOCUMENT_MARKER) - 1;
                        if (i4 >= 0) {
                        }
                        j3 = 0;
                        Pair create22 = Pair.create(nx0Var2, Long.valueOf(j3));
                        this.b.a((nx0) create22.first);
                        this.k = ((Long) create22.second).longValue();
                        this.j = true;
                    }
                } else if (i9 == 179) {
                    f01Var.a = true;
                }
                f01Var.a(f01.e, 0, 3);
            }
            az1 az1Var = this.e;
            if (az1Var != null) {
                if (i10 > 0) {
                    az1Var.a(bArr, i5, a);
                    i2 = 0;
                } else {
                    i2 = -i10;
                }
                if (this.e.a(i2)) {
                    az1 az1Var2 = this.e;
                    int a2 = ez1.a(az1Var2.e, az1Var2.d);
                    kc2 kc2Var2 = this.d;
                    int i18 = mc3.a;
                    kc2Var2.a = this.e.d;
                    kc2Var2.c = a2;
                    kc2Var2.b = 0;
                    kc3 kc3Var = this.c;
                    long j4 = this.n;
                    kc3Var.getClass();
                    if (kc2Var2.c - kc2Var2.b >= i) {
                        int b3 = kc2Var2.b();
                        int b4 = kc2Var2.b();
                        int m = kc2Var2.m();
                        if (b3 == 434 && b4 == 1195456820 && m == 3) {
                            rt.b(j4, kc2Var2, kc3Var.b);
                        }
                    }
                }
                if (i9 == 178 && kc2Var.a[a + 2] == 1) {
                    this.e.b(i9);
                }
            }
            if (i9 == 0 || i9 == 179) {
                int i19 = i6 - a;
                if (this.p && this.j) {
                    long j5 = this.n;
                    if (j5 != C.TIME_UNSET) {
                        j = -9223372036854775807L;
                        this.b.a(j5, this.o ? 1 : 0, ((int) (this.h - this.m)) - i19, i19, null);
                        if (this.i || this.p) {
                            this.m = this.h - i19;
                            j2 = this.l;
                            if (j2 == j) {
                                long j6 = this.n;
                                j2 = j6 != j ? j6 + this.k : j;
                            }
                            this.n = j2;
                            z = false;
                            this.o = false;
                            this.l = j;
                            z2 = true;
                            this.i = true;
                        } else {
                            z2 = true;
                            z = false;
                        }
                        this.p = i9 != 0 ? z2 : z;
                    }
                }
                j = -9223372036854775807L;
                if (this.i) {
                }
                this.m = this.h - i19;
                j2 = this.l;
                if (j2 == j) {
                }
                this.n = j2;
                z = false;
                this.o = false;
                this.l = j;
                z2 = true;
                this.i = true;
                this.p = i9 != 0 ? z2 : z;
            } else if (i9 == 184) {
                this.o = true;
            }
            i5 = i8;
        }
        if (!this.j) {
            this.g.a(bArr, i5, i6);
        }
        az1 az1Var3 = this.e;
        if (az1Var3 != null) {
            az1Var3.a(bArr, i5, i6);
        }
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        this.a = pa3Var.e;
        pa3Var.b();
        this.b = qq0Var.a(pa3Var.d, 2);
        kc3 kc3Var = this.c;
        if (kc3Var != null) {
            kc3Var.a(qq0Var, pa3Var);
        }
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        this.l = j;
    }

    @Override // yads.vl0
    public final void a() {
        ez1.a(this.f);
        f01 f01Var = this.g;
        f01Var.a = false;
        f01Var.b = 0;
        f01Var.c = 0;
        az1 az1Var = this.e;
        if (az1Var != null) {
            az1Var.b = false;
            az1Var.c = false;
        }
        this.h = 0L;
        this.i = false;
        this.l = C.TIME_UNSET;
        this.n = C.TIME_UNSET;
    }
}

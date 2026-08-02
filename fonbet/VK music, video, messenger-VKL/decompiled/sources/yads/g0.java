package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes10.dex */
public final class g0 implements vl0 {
    public final jc2 a;
    public final kc2 b;
    public final String c;
    public String d;
    public q83 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public nx0 j;
    public int k;
    public long l;

    public g0() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ff  */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (this.e == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i12 = kc2Var.c - kc2Var.b;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f;
            if (i13 == 0) {
                while (true) {
                    if (kc2Var.c - kc2Var.b <= 0) {
                        break;
                    }
                    if (this.h) {
                        int m = kc2Var.m();
                        if (m == 119) {
                            this.h = false;
                            this.f = 1;
                            byte[] bArr = this.b.a;
                            bArr[0] = AmfConstants.TYPE_DATE_MARKER;
                            bArr[1] = 119;
                            this.g = 2;
                            break;
                        }
                        this.h = m == 11;
                    } else {
                        this.h = kc2Var.m() == 11;
                    }
                }
            } else if (i13 == 1) {
                byte[] bArr2 = this.b.a;
                int min = Math.min(i12, 128 - this.g);
                kc2Var.a(bArr2, this.g, min);
                int i14 = this.g + min;
                this.g = i14;
                if (i14 == 128) {
                    this.a.b(0);
                    jc2 jc2Var = this.a;
                    int d = jc2Var.d();
                    jc2Var.c(40);
                    Object[] objArr = jc2Var.a(5) > 10;
                    jc2Var.b(d);
                    if (objArr == true) {
                        jc2Var.c(16);
                        int a = jc2Var.a(2);
                        if (a == 0) {
                            r3 = 0;
                        } else if (a == 1) {
                            r3 = 1;
                        } else if (a == 2) {
                            r3 = 2;
                        }
                        jc2Var.c(3);
                        i4 = (jc2Var.a(11) + 1) * 2;
                        int a2 = jc2Var.a(2);
                        if (a2 == 3) {
                            i7 = h0.c[jc2Var.a(2)];
                            i5 = 3;
                            i6 = 6;
                        } else {
                            int a3 = jc2Var.a(2);
                            i5 = a3;
                            i6 = h0.a[a3];
                            i7 = h0.b[a2];
                        }
                        i3 = i6 * 256;
                        int a4 = jc2Var.a(3);
                        boolean e = jc2Var.e();
                        i2 = h0.d[a4] + (e ? 1 : 0);
                        jc2Var.c(10);
                        if (jc2Var.e()) {
                            jc2Var.c(8);
                        }
                        if (a4 == 0) {
                            jc2Var.c(5);
                            if (jc2Var.e()) {
                                jc2Var.c(8);
                            }
                        }
                        if (r3 == 1 && jc2Var.e()) {
                            jc2Var.c(16);
                        }
                        if (jc2Var.e()) {
                            if (a4 > 2) {
                                jc2Var.c(2);
                            }
                            if ((a4 & 1) == 0 || a4 <= 2) {
                                i9 = 6;
                            } else {
                                i9 = 6;
                                jc2Var.c(6);
                            }
                            if ((a4 & 4) != 0) {
                                jc2Var.c(i9);
                            }
                            if (e && jc2Var.e()) {
                                jc2Var.c(5);
                            }
                            if (r3 == 0) {
                                if (jc2Var.e()) {
                                    i10 = 6;
                                    jc2Var.c(6);
                                } else {
                                    i10 = 6;
                                }
                                if (a4 == 0 && jc2Var.e()) {
                                    jc2Var.c(i10);
                                }
                                if (jc2Var.e()) {
                                    jc2Var.c(i10);
                                }
                                int i15 = 2;
                                int a5 = jc2Var.a(2);
                                if (a5 == 1) {
                                    jc2Var.c(5);
                                } else {
                                    if (a5 == 2) {
                                        jc2Var.c(12);
                                    } else if (a5 == 3) {
                                        int a6 = jc2Var.a(5);
                                        if (jc2Var.e()) {
                                            jc2Var.c(5);
                                            if (jc2Var.e()) {
                                                jc2Var.c(4);
                                            }
                                            if (jc2Var.e()) {
                                                jc2Var.c(4);
                                            }
                                            if (jc2Var.e()) {
                                                jc2Var.c(4);
                                            }
                                            if (jc2Var.e()) {
                                                jc2Var.c(4);
                                            }
                                            if (jc2Var.e()) {
                                                jc2Var.c(4);
                                            }
                                            if (jc2Var.e()) {
                                                jc2Var.c(4);
                                            }
                                            if (jc2Var.e()) {
                                                jc2Var.c(4);
                                            }
                                            if (jc2Var.e()) {
                                                if (jc2Var.e()) {
                                                    jc2Var.c(4);
                                                }
                                                if (jc2Var.e()) {
                                                    jc2Var.c(4);
                                                }
                                            }
                                        }
                                        if (jc2Var.e()) {
                                            jc2Var.c(5);
                                            if (jc2Var.e()) {
                                                jc2Var.c(7);
                                                if (jc2Var.e()) {
                                                    i11 = 8;
                                                    jc2Var.c(8);
                                                    jc2Var.c((a6 + 2) * i11);
                                                    if (jc2Var.c != 0) {
                                                        jc2Var.c = 0;
                                                        jc2Var.b++;
                                                        jc2Var.a();
                                                    }
                                                }
                                            }
                                        }
                                        i11 = 8;
                                        jc2Var.c((a6 + 2) * i11);
                                        if (jc2Var.c != 0) {
                                        }
                                    }
                                    i15 = 2;
                                }
                                if (a4 < i15) {
                                    if (jc2Var.e()) {
                                        jc2Var.c(14);
                                    }
                                    if (a4 == 0 && jc2Var.e()) {
                                        jc2Var.c(14);
                                    }
                                }
                                if (jc2Var.e()) {
                                    if (i5 == 0) {
                                        jc2Var.c(5);
                                    } else {
                                        for (int i16 = 0; i16 < i6; i16++) {
                                            if (jc2Var.e()) {
                                                jc2Var.c(5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (jc2Var.e()) {
                            jc2Var.c(5);
                            if (a4 == 2) {
                                jc2Var.c(4);
                            }
                            if (a4 >= 6) {
                                jc2Var.c(2);
                            }
                            if (jc2Var.e()) {
                                jc2Var.c(8);
                            }
                            if (a4 == 0 && jc2Var.e()) {
                                jc2Var.c(8);
                            }
                            if (a2 < 3) {
                                jc2Var.g();
                            }
                        }
                        if (r3 == 0 && i5 != 3) {
                            jc2Var.g();
                        }
                        if (r3 == 2 && (i5 == 3 || jc2Var.e())) {
                            i8 = 6;
                            jc2Var.c(6);
                        } else {
                            i8 = 6;
                        }
                        str = (jc2Var.e() && jc2Var.a(i8) == 1 && jc2Var.a(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
                        r3 = i7;
                    } else {
                        jc2Var.c(32);
                        int a7 = jc2Var.a(2);
                        String str2 = a7 == 3 ? null : MimeTypes.AUDIO_AC3;
                        int a8 = h0.a(a7, jc2Var.a(6));
                        jc2Var.c(8);
                        int a9 = jc2Var.a(3);
                        if ((a9 & 1) == 0 || a9 == 1) {
                            i = 2;
                        } else {
                            i = 2;
                            jc2Var.c(2);
                        }
                        if ((a9 & 4) != 0) {
                            jc2Var.c(i);
                        }
                        if (a9 == i) {
                            jc2Var.c(i);
                        }
                        r3 = a7 < 3 ? h0.b[a7] : -1;
                        i2 = h0.d[a9] + (jc2Var.e() ? 1 : 0);
                        i3 = 1536;
                        str = str2;
                        i4 = a8;
                    }
                    int i17 = i2;
                    nx0 nx0Var = this.j;
                    if (nx0Var == null || i17 != nx0Var.z || r3 != nx0Var.A || !mc3.a(str, nx0Var.m)) {
                        mx0 mx0Var = new mx0();
                        mx0Var.a = this.d;
                        mx0Var.k = str;
                        mx0Var.x = i17;
                        mx0Var.y = r3;
                        mx0Var.c = this.c;
                        nx0 nx0Var2 = new nx0(mx0Var);
                        this.j = nx0Var2;
                        this.e.a(nx0Var2);
                    }
                    this.k = i4;
                    this.i = (i3 * 1000000) / this.j.A;
                    this.b.e(0);
                    this.e.a(128, this.b);
                    this.f = 2;
                }
            } else if (i13 == 2) {
                int min2 = Math.min(i12, this.k - this.g);
                this.e.a(min2, kc2Var);
                int i18 = this.g + min2;
                this.g = i18;
                int i19 = this.k;
                if (i18 == i19) {
                    long j = this.l;
                    if (j != C.TIME_UNSET) {
                        this.e.a(j, 1, i19, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                }
            }
        }
    }

    public g0(String str) {
        byte[] bArr = new byte[128];
        this.a = new jc2(bArr);
        this.b = new kc2(bArr);
        this.f = 0;
        this.l = C.TIME_UNSET;
        this.c = str;
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        this.d = pa3Var.e;
        pa3Var.b();
        this.e = qq0Var.a(pa3Var.d, 1);
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.l = j;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = C.TIME_UNSET;
    }
}

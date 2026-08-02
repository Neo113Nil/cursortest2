package defpackage;

import androidx.media3.common.a;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class mil0 implements wil0 {
    public final /* synthetic */ int a;
    public final vil0 b;
    public g001 c;
    public long d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;

    public mil0(vil0 vil0Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = vil0Var;
                this.d = -9223372036854775807L;
                this.g = -1;
                this.h = -9223372036854775807L;
                this.e = 0L;
                this.f = -1;
                this.i = -1;
                this.j = -1;
                break;
            default:
                this.b = vil0Var;
                this.d = -9223372036854775807L;
                this.g = -1;
                break;
        }
    }

    @Override // defpackage.wil0
    public final void a(long j, long j2) {
        switch (this.a) {
            case 0:
                this.d = j;
                this.f = 0;
                this.e = j2;
                break;
            default:
                this.d = j;
                this.g = -1;
                this.e = j2;
                break;
        }
    }

    @Override // defpackage.wil0
    public final void b(long j) {
        switch (this.a) {
            case 0:
                d6z.x(this.d == -9223372036854775807L);
                this.d = j;
                break;
            default:
                d6z.x(this.d == -9223372036854775807L);
                this.d = j;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wil0
    public final void c(ef90 ef90Var, long j, int i, boolean z) {
        int i2;
        int i3;
        int i4 = this.a;
        vil0 vil0Var = this.b;
        switch (i4) {
            case 0:
                d6z.z(this.c);
                int i5 = ef90Var.b;
                int E = ef90Var.E();
                Object[] objArr = (E & 1024) > 0;
                if ((E & 512) != 0 || (E & 504) != 0 || (E & 7) != 0) {
                    lk91.j("Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                    break;
                } else {
                    boolean z2 = this.m;
                    if (objArr == true) {
                        if (z2 && this.f > 0) {
                            g001 g001Var = this.c;
                            g001Var.getClass();
                            g001Var.c(this.h, this.k ? 1 : 0, this.f, 0, null);
                            this.f = 0;
                            this.h = -9223372036854775807L;
                            this.k = false;
                            this.m = false;
                        }
                        this.m = true;
                        if ((ef90Var.h() & 252) < 128) {
                            lk91.j("Picture start Code (PSC) missing, dropping packet.");
                            break;
                        } else {
                            byte[] bArr = ef90Var.a;
                            bArr[i5] = 0;
                            bArr[i5 + 1] = 0;
                            ef90Var.K(i5);
                        }
                    } else if (z2) {
                        int a = sil0.a(this.g);
                        if (i < a) {
                            int i6 = tw21.a;
                            Locale locale = Locale.US;
                            lk91.j("Received RTP packet with unexpected sequence number. Expected: " + a + "; received: " + i + ". Dropping packet.");
                            break;
                        }
                    } else {
                        lk91.j("First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        break;
                    }
                    if (this.f == 0) {
                        boolean z3 = this.l;
                        int i7 = ef90Var.b;
                        if (((ef90Var.A() >> 10) & 63) == 32) {
                            int h = ef90Var.h();
                            int i8 = (h >> 1) & 1;
                            if (!z3 && i8 == 0) {
                                int i9 = (h >> 2) & 7;
                                if (i9 == 1) {
                                    this.i = 128;
                                    this.j = 96;
                                } else {
                                    int i10 = i9 - 2;
                                    this.i = 176 << i10;
                                    this.j = 144 << i10;
                                }
                            }
                            ef90Var.K(i7);
                            this.k = i8 == 0;
                        } else {
                            ef90Var.K(i7);
                            this.k = false;
                        }
                        if (!this.l && this.k) {
                            int i11 = this.i;
                            a aVar = vil0Var.c;
                            if (i11 != aVar.u || this.j != aVar.v) {
                                g001 g001Var2 = this.c;
                                f7s a2 = aVar.a();
                                a2.t = this.i;
                                a2.u = this.j;
                                smw0.u(a2, g001Var2);
                            }
                            this.l = true;
                        }
                    }
                    int a3 = ef90Var.a();
                    this.c.a(ef90Var, a3, 0);
                    this.f += a3;
                    this.h = qva1.d(90000, this.e, j, this.d);
                    if (z) {
                        g001 g001Var3 = this.c;
                        g001Var3.getClass();
                        g001Var3.c(this.h, this.k ? 1 : 0, this.f, 0, null);
                        this.f = 0;
                        this.h = -9223372036854775807L;
                        this.k = false;
                        this.m = false;
                    }
                    this.g = i;
                    break;
                }
                break;
            default:
                d6z.z(this.c);
                int y = ef90Var.y();
                int i12 = y & 8;
                boolean z4 = this.k;
                if (i12 == 8) {
                    if (z4 && this.g > 0) {
                        g001 g001Var4 = this.c;
                        g001Var4.getClass();
                        g001Var4.c(this.h, this.m ? 1 : 0, this.g, 0, null);
                        this.g = -1;
                        this.h = -9223372036854775807L;
                        this.k = false;
                    }
                    this.k = true;
                } else if (z4) {
                    int a4 = sil0.a(this.f);
                    if (i < a4) {
                        int i13 = tw21.a;
                        Locale locale2 = Locale.US;
                        lk91.j("Received RTP packet with unexpected sequence number. Expected: " + a4 + "; received: " + i + ". Dropping packet.");
                        break;
                    }
                } else {
                    lk91.j("First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    break;
                }
                if ((y & 128) == 0 || (ef90Var.y() & 128) == 0 || ef90Var.a() >= 1) {
                    int i14 = y & 16;
                    d6z.k("VP9 flexible mode is not supported.", i14 == 0);
                    if ((y & 32) != 0) {
                        ef90Var.L(1);
                        if (ef90Var.a() >= 1) {
                            if (i14 == 0) {
                                ef90Var.L(1);
                            }
                        }
                    }
                    if ((y & 2) != 0) {
                        int y2 = ef90Var.y();
                        int i15 = (y2 >> 5) & 7;
                        if ((y2 & 16) != 0) {
                            int i16 = i15 + 1;
                            if (ef90Var.a() >= i16 * 4) {
                                for (int i17 = 0; i17 < i16; i17++) {
                                    this.i = ef90Var.E();
                                    this.j = ef90Var.E();
                                }
                            }
                        }
                        if ((y2 & 8) != 0) {
                            int y3 = ef90Var.y();
                            if (ef90Var.a() >= y3) {
                                for (int i18 = 0; i18 < y3; i18++) {
                                    int E2 = (ef90Var.E() & 12) >> 2;
                                    if (ef90Var.a() < E2) {
                                        break;
                                    } else {
                                        ef90Var.L(E2);
                                    }
                                }
                            }
                        }
                    }
                    if (this.g == -1 && this.k) {
                        this.m = (ef90Var.h() & 4) == 0;
                    }
                    if (!this.l && (i2 = this.i) != -1 && (i3 = this.j) != -1) {
                        a aVar2 = vil0Var.c;
                        if (i2 != aVar2.u || i3 != aVar2.v) {
                            g001 g001Var5 = this.c;
                            f7s a5 = aVar2.a();
                            a5.t = this.i;
                            a5.u = this.j;
                            smw0.u(a5, g001Var5);
                        }
                        this.l = true;
                    }
                    int a6 = ef90Var.a();
                    this.c.a(ef90Var, a6, 0);
                    int i19 = this.g;
                    if (i19 == -1) {
                        this.g = a6;
                    } else {
                        this.g = i19 + a6;
                    }
                    this.h = qva1.d(90000, this.e, j, this.d);
                    if (z) {
                        g001 g001Var6 = this.c;
                        g001Var6.getClass();
                        g001Var6.c(this.h, this.m ? 1 : 0, this.g, 0, null);
                        this.g = -1;
                        this.h = -9223372036854775807L;
                        this.k = false;
                    }
                    this.f = i;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wil0
    public final void d(d5p d5pVar, int i) {
        int i2 = this.a;
        vil0 vil0Var = this.b;
        switch (i2) {
            case 0:
                g001 B = d5pVar.B(i, 2);
                this.c = B;
                B.d(vil0Var.c);
                break;
            default:
                g001 B2 = d5pVar.B(i, 2);
                this.c = B2;
                B2.d(vil0Var.c);
                break;
        }
    }
}

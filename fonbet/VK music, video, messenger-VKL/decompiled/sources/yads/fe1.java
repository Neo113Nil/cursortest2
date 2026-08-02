package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes10.dex */
public final class fe1 implements nq0 {
    public qq0 b;
    public int c;
    public int d;
    public int e;
    public iw1 g;
    public oq0 h;
    public q43 i;
    public lw1 j;
    public final kc2 a = new kc2(6);
    public long f = -1;

    public final void a() {
        qq0 qq0Var = this.b;
        qq0Var.getClass();
        q83 a = qq0Var.a(1024, 4);
        mx0 mx0Var = new mx0();
        mx0Var.j = "image/jpeg";
        mx0Var.i = new ut1(new tt1[0]);
        a.a(new nx0(mx0Var));
        qq0 qq0Var2 = this.b;
        qq0Var2.getClass();
        qq0Var2.a();
        this.b.a(new yx2(C.TIME_UNSET, 0L));
        this.c = 6;
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            lw1 lw1Var = this.j;
            lw1Var.getClass();
            lw1Var.seek(j, j2);
        }
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.b = qq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        String a;
        String a2;
        gw1 gw1Var;
        iw1 iw1Var;
        long j;
        int i = this.c;
        if (i == 0) {
            this.a.c(2);
            ((ld0) oq0Var).a(this.a.a, 0, 2, false);
            int r = this.a.r();
            this.d = r;
            if (r == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                } else {
                    a();
                }
            } else if ((r < 65488 || r > 65497) && r != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i == 1) {
            this.a.c(2);
            ((ld0) oq0Var).a(this.a.a, 0, 2, false);
            this.e = this.a.r() - 2;
            this.c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || oq0Var != this.h) {
                    this.h = oq0Var;
                    this.i = new q43((ld0) oq0Var, this.f);
                }
                lw1 lw1Var = this.j;
                lw1Var.getClass();
                int a3 = lw1Var.a(this.i, hh2Var);
                if (a3 == 1) {
                    hh2Var.a += this.f;
                }
                return a3;
            }
            ld0 ld0Var = (ld0) oq0Var;
            long j2 = ld0Var.d;
            long j3 = this.f;
            if (j2 != j3) {
                hh2Var.a = j3;
                return 1;
            }
            if (!ld0Var.b(this.a.a, 0, 1, true)) {
                a();
            } else {
                ld0Var.f = 0;
                if (this.j == null) {
                    this.j = new lw1();
                }
                q43 q43Var = new q43(ld0Var, this.f);
                this.i = q43Var;
                this.j.getClass();
                if (w23.a(q43Var, false, false)) {
                    lw1 lw1Var2 = this.j;
                    long j4 = this.f;
                    qq0 qq0Var = this.b;
                    qq0Var.getClass();
                    lw1Var2.q = new s43(j4, qq0Var);
                    iw1 iw1Var2 = this.g;
                    iw1Var2.getClass();
                    tt1[] tt1VarArr = {iw1Var2};
                    qq0 qq0Var2 = this.b;
                    qq0Var2.getClass();
                    q83 a4 = qq0Var2.a(1024, 4);
                    mx0 mx0Var = new mx0();
                    mx0Var.j = "image/jpeg";
                    mx0Var.i = new ut1(tt1VarArr);
                    a4.a(new nx0(mx0Var));
                    this.c = 5;
                } else {
                    a();
                }
            }
            return 0;
        }
        if (this.d == 65505) {
            int i2 = this.e;
            byte[] bArr = new byte[i2];
            ld0 ld0Var2 = (ld0) oq0Var;
            ld0Var2.a(bArr, 0, i2, false);
            if (this.g == null) {
                int i3 = 0;
                if (i2 == 0) {
                    a = null;
                } else {
                    while (i3 < i2 && bArr[i3] != 0) {
                        i3++;
                    }
                    a = mc3.a(bArr, 0, i3);
                    if (i3 < i2) {
                        i3++;
                    }
                }
                if ("http://ns.adobe.com/xap/1.0/".equals(a)) {
                    if (i2 - i3 == 0) {
                        a2 = null;
                    } else {
                        int i4 = i3;
                        while (i4 < i2 && bArr[i4] != 0) {
                            i4++;
                        }
                        a2 = mc3.a(bArr, i3, i4 - i3);
                    }
                    if (a2 != null) {
                        long j5 = ld0Var2.c;
                        if (j5 != -1) {
                            try {
                                gw1Var = xq3.a(a2);
                            } catch (NumberFormatException | XmlPullParserException | pc2 unused) {
                                ji1.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                gw1Var = null;
                            }
                            if (gw1Var != null && gw1Var.b.size() >= 2) {
                                long j6 = -1;
                                long j7 = -1;
                                long j8 = -1;
                                long j9 = -1;
                                boolean z = false;
                                for (int size = gw1Var.b.size() - 1; size >= 0; size--) {
                                    fw1 fw1Var = (fw1) gw1Var.b.get(size);
                                    z |= MimeTypes.VIDEO_MP4.equals(fw1Var.a);
                                    if (size == 0) {
                                        j5 -= fw1Var.c;
                                        j = 0;
                                    } else {
                                        j = j5 - fw1Var.b;
                                    }
                                    long j10 = j5;
                                    j5 = j;
                                    if (z && j5 != j10) {
                                        j9 = j10 - j5;
                                        z = false;
                                        j8 = j5;
                                    }
                                    if (size == 0) {
                                        j7 = j10;
                                        j6 = j5;
                                    }
                                }
                                if (j8 != -1 && j9 != -1 && j6 != -1 && j7 != -1) {
                                    iw1Var = new iw1(j6, j7, gw1Var.a, j8, j9);
                                    this.g = iw1Var;
                                    if (iw1Var != null) {
                                        this.f = iw1Var.e;
                                    }
                                }
                            }
                        }
                        iw1Var = null;
                        this.g = iw1Var;
                        if (iw1Var != null) {
                        }
                    }
                }
            }
        } else {
            ((ld0) oq0Var).a(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        this.a.c(2);
        ld0Var.b(this.a.a, 0, 2, false);
        if (this.a.r() != 65496) {
            return false;
        }
        this.a.c(2);
        ld0Var.b(this.a.a, 0, 2, false);
        int r = this.a.r();
        this.d = r;
        if (r == 65504) {
            this.a.c(2);
            ld0Var.b(this.a.a, 0, 2, false);
            ld0Var.a(false, this.a.r() - 2);
            this.a.c(2);
            ld0Var.b(this.a.a, 0, 2, false);
            this.d = this.a.r();
        }
        if (this.d != 65505) {
            return false;
        }
        ld0Var.a(false, 2);
        this.a.c(6);
        ld0Var.b(this.a.a, 0, 6, false);
        return this.a.n() == 1165519206 && this.a.r() == 0;
    }
}

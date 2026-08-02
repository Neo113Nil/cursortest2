package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes10.dex */
public final class dm2 implements nq0 {
    public final c83 a;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public am2 i;
    public qq0 j;
    public boolean k;
    public final kc2 c = new kc2(4096);
    public final SparseArray b = new SparseArray();
    public final bm2 d = new bm2();

    public dm2(c83 c83Var) {
        this.a = c83Var;
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.j = qq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (r2 != r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r4.a.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        if (r0 != false) goto L19;
     */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void seek(long j, long j2) {
        long j3;
        c83 c83Var = this.a;
        synchronized (c83Var) {
            j3 = c83Var.b;
        }
        boolean z = j3 == C.TIME_UNSET;
        if (!z) {
            long a = this.a.a();
            if (a != C.TIME_UNSET) {
                if (a != 0) {
                }
            }
            am2 am2Var = this.i;
            if (am2Var != null) {
                am2Var.a(j2);
            }
            for (int i = 0; i < this.b.size(); i++) {
                cm2 cm2Var = (cm2) this.b.valueAt(i);
                cm2Var.f = false;
                cm2Var.a.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e4  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        boolean z;
        int i;
        int i2;
        am2 am2Var;
        long j;
        int b;
        vl0 g01Var;
        long j2;
        qq0 qq0Var = this.j;
        if (qq0Var == null) {
            throw new IllegalStateException();
        }
        ld0 ld0Var = (ld0) oq0Var;
        long j3 = ld0Var.c;
        long j4 = C.TIME_UNSET;
        if (j3 != -1) {
            i = 4;
            bm2 bm2Var = this.d;
            z = 3;
            if (!bm2Var.c) {
                if (!bm2Var.e) {
                    int min = (int) Math.min(20000L, j3);
                    long j5 = j3 - min;
                    if (ld0Var.d != j5) {
                        hh2Var.a = j5;
                        return 1;
                    }
                    bm2Var.b.c(min);
                    ld0Var.f = 0;
                    ld0Var.b(bm2Var.b.a, 0, min, false);
                    kc2 kc2Var = bm2Var.b;
                    int i3 = kc2Var.b;
                    int i4 = kc2Var.c - 4;
                    while (true) {
                        if (i4 < i3) {
                            break;
                        }
                        byte[] bArr = kc2Var.a;
                        if (((bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8)) == 442) {
                            kc2Var.e(i4 + 4);
                            long a = bm2.a(kc2Var);
                            if (a != C.TIME_UNSET) {
                                j4 = a;
                                break;
                            }
                        }
                        i4--;
                    }
                    bm2Var.g = j4;
                    bm2Var.e = true;
                    return 0;
                }
                if (bm2Var.g == C.TIME_UNSET) {
                    bm2Var.b.a(mc3.f);
                    bm2Var.c = true;
                    ld0Var.f = 0;
                } else {
                    if (!bm2Var.d) {
                        int min2 = (int) Math.min(20000L, j3);
                        long j6 = 0;
                        if (ld0Var.d != j6) {
                            hh2Var.a = j6;
                            return 1;
                        }
                        bm2Var.b.c(min2);
                        ld0Var.f = 0;
                        ld0Var.b(bm2Var.b.a, 0, min2, false);
                        kc2 kc2Var2 = bm2Var.b;
                        int i5 = kc2Var2.b;
                        int i6 = kc2Var2.c;
                        while (true) {
                            if (i5 >= i6 - 3) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr2 = kc2Var2.a;
                            int i7 = i5 + 1;
                            if (((bArr2[i5 + 3] & 255) | ((bArr2[i5] & 255) << 24) | ((bArr2[i7] & 255) << 16) | ((bArr2[i5 + 2] & 255) << 8)) == 442) {
                                kc2Var2.e(i5 + 4);
                                j2 = bm2.a(kc2Var2);
                                if (j2 != C.TIME_UNSET) {
                                    break;
                                }
                            }
                            i5 = i7;
                        }
                        bm2Var.f = j2;
                        bm2Var.d = true;
                        return 0;
                    }
                    long j7 = bm2Var.f;
                    if (j7 == C.TIME_UNSET) {
                        bm2Var.b.a(mc3.f);
                        bm2Var.c = true;
                        ld0Var.f = 0;
                    } else {
                        long b2 = bm2Var.a.b(bm2Var.g) - bm2Var.a.b(j7);
                        bm2Var.h = b2;
                        if (b2 < 0) {
                            ji1.d("PsDurationReader", "Invalid duration: " + bm2Var.h + ". Using TIME_UNSET instead.");
                            bm2Var.h = C.TIME_UNSET;
                        }
                        bm2Var.b.a(mc3.f);
                        bm2Var.c = true;
                        ld0Var.f = 0;
                    }
                }
                return 0;
            }
        } else {
            z = 3;
            i = 4;
        }
        if (!this.k) {
            this.k = true;
            bm2 bm2Var2 = this.d;
            long j8 = bm2Var2.h;
            if (j8 == C.TIME_UNSET) {
                i2 = i;
                qq0Var.a(new yx2(j8, 0L));
                am2Var = this.i;
                if (am2Var == null && am2Var.c != null) {
                    return am2Var.a(ld0Var, hh2Var);
                }
                ld0Var.f = 0;
                j = j3 == -1 ? j3 - (ld0Var.d + 0) : -1L;
                if ((j == -1 && j < 4) || !ld0Var.b(this.c.a, 0, i2, true)) {
                    return -1;
                }
                this.c.e(0);
                b = this.c.b();
                if (b != 441) {
                    return -1;
                }
                if (b == 442) {
                    ld0Var.b(this.c.a, 0, 10, false);
                    this.c.e(9);
                    ld0Var.a((this.c.m() & 7) + 14);
                    return 0;
                }
                if (b == 443) {
                    ld0Var.b(this.c.a, 0, 2, false);
                    this.c.e(0);
                    ld0Var.a(this.c.r() + 6);
                    return 0;
                }
                if (((b & (-256)) >> 8) != 1) {
                    ld0Var.a(1);
                    return 0;
                }
                int i8 = b & 255;
                cm2 cm2Var = (cm2) this.b.get(i8);
                if (!this.e) {
                    if (cm2Var == null) {
                        vl0 vl0Var = null;
                        if (i8 == 189) {
                            g01Var = new g0(null);
                            this.f = true;
                            this.h = ld0Var.d;
                        } else if ((b & 224) == 192) {
                            g01Var = new ow1(null);
                            this.f = true;
                            this.h = ld0Var.d;
                        } else {
                            if ((b & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                                g01Var = new g01(null);
                                this.g = true;
                                this.h = ld0Var.d;
                            }
                            if (vl0Var != null) {
                                vl0Var.a(this.j, new pa3(Integer.MIN_VALUE, i8, 256));
                                cm2Var = new cm2(vl0Var, this.a);
                                this.b.put(i8, cm2Var);
                            }
                        }
                        vl0Var = g01Var;
                        if (vl0Var != null) {
                        }
                    }
                    if (ld0Var.d > ((this.f && this.g) ? this.h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                        this.e = true;
                        this.j.a();
                    }
                }
                ld0Var.b(this.c.a, 0, 2, false);
                this.c.e(0);
                int r = this.c.r() + 6;
                if (cm2Var == null) {
                    ld0Var.a(r);
                } else {
                    this.c.c(r);
                    ld0Var.a(this.c.a, 0, r, false);
                    this.c.e(6);
                    kc2 kc2Var3 = this.c;
                    kc2Var3.a(cm2Var.c.a, 0, 3);
                    cm2Var.c.b(0);
                    cm2Var.c.c(8);
                    cm2Var.d = cm2Var.c.e();
                    cm2Var.e = cm2Var.c.e();
                    cm2Var.c.c(6);
                    kc2Var3.a(cm2Var.c.a, 0, cm2Var.c.a(8));
                    cm2Var.c.b(0);
                    cm2Var.g = 0L;
                    if (cm2Var.d) {
                        cm2Var.c.c(i2);
                        cm2Var.c.c(1);
                        cm2Var.c.c(1);
                        long a2 = (cm2Var.c.a(3) << 30) | (cm2Var.c.a(15) << 15) | cm2Var.c.a(15);
                        cm2Var.c.c(1);
                        if (!cm2Var.f && cm2Var.e) {
                            cm2Var.c.c(i2);
                            cm2Var.c.c(1);
                            cm2Var.c.c(1);
                            cm2Var.c.c(1);
                            cm2Var.b.b((cm2Var.c.a(3) << 30) | (cm2Var.c.a(15) << 15) | cm2Var.c.a(15));
                            cm2Var.f = true;
                        }
                        cm2Var.g = cm2Var.b.b(a2);
                    }
                    cm2Var.a.a(i2, cm2Var.g);
                    cm2Var.a.a(kc2Var3);
                    cm2Var.a.b();
                    kc2 kc2Var4 = this.c;
                    kc2Var4.d(kc2Var4.a.length);
                }
                return 0;
            }
            am2 am2Var2 = new am2(bm2Var2.a, j8, j3);
            this.i = am2Var2;
            this.j.a(am2Var2.a);
        }
        i2 = i;
        am2Var = this.i;
        if (am2Var == null) {
        }
        ld0Var.f = 0;
        if (j3 == -1) {
        }
        if (j == -1) {
        }
        this.c.e(0);
        b = this.c.b();
        if (b != 441) {
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        byte[] bArr = new byte[14];
        ld0 ld0Var = (ld0) oq0Var;
        ld0Var.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ld0Var.a(false, bArr[13] & 7);
        ld0Var.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public static nq0[] a() {
        return new nq0[]{new dm2(new c83(0L))};
    }
}

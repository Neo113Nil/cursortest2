package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.gms.location.DeviceOrientationRequest;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes7.dex */
public final class ka71 implements n771 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public v071 i;
    public yg71 j;
    public boolean k;
    public final lo61 a = new lo61(0);
    public final dl81 c = new dl81(4096);
    public final SparseArray b = new SparseArray();
    public final g471 d = new g471();

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.j = yg71Var;
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        long j3;
        lo61 lo61Var = this.a;
        synchronized (lo61Var) {
            j3 = lo61Var.b;
        }
        boolean z = true;
        boolean z2 = j3 == -9223372036854775807L;
        if (z2) {
            z = z2;
        } else {
            long a = this.a.a();
            if (a == -9223372036854775807L || a == 0 || a == j2) {
                z = false;
            }
        }
        if (z) {
            this.a.d(j2);
        }
        v071 v071Var = this.i;
        if (v071Var != null) {
            v071Var.b(j2);
        }
        for (int i = 0; i < this.b.size(); i++) {
            a771 a771Var = (a771) this.b.valueAt(i);
            a771Var.f = false;
            a771Var.a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x026c  */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        char c;
        w971 w971Var;
        int i;
        gz71 v681Var;
        long j;
        long j2;
        yg71 yg71Var = this.j;
        if (yg71Var == null) {
            ny61.k();
            return 0;
        }
        w971 w971Var2 = (w971) bb71Var;
        long j3 = w971Var2.c;
        g471 g471Var = this.d;
        if (j3 != -1) {
            boolean z = g471Var.c;
            lo61 lo61Var = g471Var.a;
            c = 3;
            dl81 dl81Var = g471Var.b;
            if (!z) {
                if (!g471Var.e) {
                    int min = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, j3);
                    long j4 = j3 - min;
                    if (w971Var2.w != j4) {
                        jp61Var.a = j4;
                        return 1;
                    }
                    dl81Var.i(min);
                    w971Var2.y = 0;
                    w971Var2.I(dl81Var.a, 0, min, false);
                    int i2 = dl81Var.b;
                    int i3 = dl81Var.c - 4;
                    while (true) {
                        if (i3 < i2) {
                            j2 = -9223372036854775807L;
                            break;
                        }
                        byte[] bArr = dl81Var.a;
                        if (((bArr[i3 + 3] & 255) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8)) == 442) {
                            dl81Var.m(i3 + 4);
                            j2 = g471.a(dl81Var);
                            if (j2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i3--;
                    }
                    g471Var.g = j2;
                    g471Var.e = true;
                    return 0;
                }
                if (g471Var.g == -9223372036854775807L) {
                    dl81Var.e(rf71.f);
                    g471Var.c = true;
                    w971Var2.y = 0;
                    return 0;
                }
                if (g471Var.d) {
                    long j5 = g471Var.f;
                    if (j5 == -9223372036854775807L) {
                        dl81Var.e(rf71.f);
                        g471Var.c = true;
                        w971Var2.y = 0;
                        return 0;
                    }
                    long c2 = lo61Var.c(g471Var.g) - lo61Var.c(j5);
                    g471Var.h = c2;
                    if (c2 < 0) {
                        nba1.e();
                        g471Var.h = -9223372036854775807L;
                    }
                    dl81Var.e(rf71.f);
                    g471Var.c = true;
                    w971Var2.y = 0;
                    return 0;
                }
                int min2 = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, j3);
                if (w971Var2.w != 0) {
                    jp61Var.a = 0L;
                    return 1;
                }
                dl81Var.i(min2);
                w971Var2.y = 0;
                w971Var2.I(dl81Var.a, 0, min2, false);
                int i4 = dl81Var.b;
                int i5 = dl81Var.c;
                while (true) {
                    if (i4 >= i5 - 3) {
                        j = -9223372036854775807L;
                        break;
                    }
                    byte[] bArr2 = dl81Var.a;
                    int i6 = i4 + 1;
                    if (((bArr2[i4 + 3] & 255) | ((bArr2[i4] & 255) << 24) | ((bArr2[i6] & 255) << 16) | ((bArr2[i4 + 2] & 255) << 8)) == 442) {
                        dl81Var.m(i4 + 4);
                        j = g471.a(dl81Var);
                        if (j != -9223372036854775807L) {
                            break;
                        }
                    }
                    i4 = i6;
                }
                g471Var.f = j;
                g471Var.d = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            w971Var = w971Var2;
            i = 442;
        } else {
            this.k = true;
            long j6 = g471Var.h;
            if (j6 != -9223372036854775807L) {
                w971Var = w971Var2;
                v071 v071Var = new v071(new q771(), new a441(g471Var.a), j6, j6 + 1, 0L, j3, 188L, 1000);
                this.i = v071Var;
                this.j.r((q471) v071Var.b);
                i = 442;
            } else {
                w971Var = w971Var2;
                i = 442;
                yg71Var.r(new w471(j6, 0L));
            }
        }
        v071 v071Var2 = this.i;
        if (v071Var2 != null && ((xt5) v071Var2.d) != null) {
            return v071Var2.a(w971Var, jp61Var);
        }
        w971 w971Var3 = w971Var;
        w971Var3.y = 0;
        long j7 = j3 != -1 ? j3 - w971Var3.w : -1L;
        if (j7 != -1 && j7 < 4) {
            return -1;
        }
        dl81 dl81Var2 = this.c;
        if (!w971Var3.I(dl81Var2.a, 0, 4, true)) {
            return -1;
        }
        dl81Var2.m(0);
        int a = dl81Var2.a();
        if (a == 441) {
            return -1;
        }
        if (a == i) {
            w971Var3.I(dl81Var2.a, 0, 10, false);
            dl81Var2.m(9);
            w971Var3.b((dl81Var2.s() & 7) + 14);
            return 0;
        }
        if (a == 443) {
            w971Var3.I(dl81Var2.a, 0, 2, false);
            dl81Var2.m(0);
            w971Var3.b(dl81Var2.x() + 6);
            return 0;
        }
        if (((a & (-256)) >> 8) != 1) {
            w971Var3.b(1);
            return 0;
        }
        int i7 = a & 255;
        SparseArray sparseArray = this.b;
        a771 a771Var = (a771) sparseArray.get(i7);
        if (!this.e) {
            if (a771Var == null) {
                gz71 gz71Var = null;
                if (i7 == 189) {
                    v681Var = new dz61(null, 0);
                    this.f = true;
                    this.h = w971Var3.w;
                } else if ((a & 224) == 192) {
                    v681Var = new aa81(null);
                    this.f = true;
                    this.h = w971Var3.w;
                } else {
                    if ((a & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) == 224) {
                        v681Var = new v681(null);
                        this.g = true;
                        this.h = w971Var3.w;
                    }
                    if (gz71Var != null) {
                        gz71Var.a(this.j, new xi11(Integer.MIN_VALUE, i7, 256, 1));
                        a771Var = new a771(gz71Var, this.a);
                        sparseArray.put(i7, a771Var);
                    }
                }
                gz71Var = v681Var;
                if (gz71Var != null) {
                }
            }
            if (w971Var3.w > ((this.f && this.g) ? this.h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.e = true;
                this.j.mo495a();
            }
        }
        w971Var3.I(dl81Var2.a, 0, 2, false);
        dl81Var2.m(0);
        int x = dl81Var2.x() + 6;
        if (a771Var == null) {
            w971Var3.b(x);
            return 0;
        }
        lo61 lo61Var2 = a771Var.b;
        gz71 gz71Var2 = a771Var.a;
        uh81 uh81Var = a771Var.c;
        dl81Var2.i(x);
        w971Var3.E(dl81Var2.a, 0, x, false);
        dl81Var2.m(6);
        dl81Var2.d(0, 3, uh81Var.a);
        uh81Var.f(0);
        uh81Var.h(8);
        a771Var.d = uh81Var.k();
        a771Var.e = uh81Var.k();
        uh81Var.h(6);
        dl81Var2.d(0, uh81Var.a(8), uh81Var.a);
        uh81Var.f(0);
        a771Var.g = 0L;
        if (a771Var.d) {
            uh81Var.h(4);
            uh81Var.h(1);
            uh81Var.h(1);
            long a2 = (uh81Var.a(3) << 30) | (uh81Var.a(15) << 15) | uh81Var.a(15);
            uh81Var.h(1);
            if (!a771Var.f && a771Var.e) {
                uh81Var.h(4);
                uh81Var.h(1);
                uh81Var.h(1);
                uh81Var.h(1);
                lo61Var2.c(uh81Var.a(15) | (uh81Var.a(3) << 30) | (uh81Var.a(15) << 15));
                a771Var.f = true;
            }
            a771Var.g = lo61Var2.c(a2);
        }
        gz71Var2.c(4, a771Var.g);
        gz71Var2.f(dl81Var2);
        gz71Var2.b();
        dl81Var2.k(dl81Var2.a.length);
        return 0;
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        byte[] bArr = new byte[14];
        w971 w971Var = (w971) bb71Var;
        w971Var.I(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            w971Var.c(bArr[13] & 7, false);
            w971Var.I(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }
}

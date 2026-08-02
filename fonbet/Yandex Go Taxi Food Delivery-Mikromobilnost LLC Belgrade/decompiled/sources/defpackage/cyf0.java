package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.gms.location.DeviceOrientationRequest;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public final class cyf0 implements b5p {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public wer i;
    public d5p j;
    public boolean k;
    public final sez0 a = new sez0(0);
    public final ef90 c = new ef90(4096);
    public final SparseArray b = new SparseArray();
    public final ayf0 d = new ayf0(0);

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        sez0 sez0Var = this.a;
        synchronized (sez0Var) {
            j3 = sez0Var.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long d = sez0Var.d();
            z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
        }
        if (z) {
            sez0Var.f(j2);
        }
        wer werVar = this.i;
        if (werVar != null) {
            werVar.e(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            byf0 byf0Var = (byf0) sparseArray.valueAt(i);
            byf0Var.f = false;
            byf0Var.a.d();
        }
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.j = d5pVar;
    }

    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        char c;
        int i;
        int i2;
        tqn tqnVar;
        long j;
        d6z.z(this.j);
        long length = c5pVar.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = -9223372036854775807L;
        ayf0 ayf0Var = this.d;
        if (i3 != 0) {
            c = 3;
            if (!ayf0Var.d) {
                sez0 sez0Var = ayf0Var.b;
                ef90 ef90Var = ayf0Var.c;
                if (!ayf0Var.f) {
                    long length2 = c5pVar.getLength();
                    int min = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, length2);
                    long j3 = length2 - min;
                    if (c5pVar.getPosition() != j3) {
                        xde0Var.a = j3;
                        return 1;
                    }
                    ef90Var.H(min);
                    c5pVar.J();
                    c5pVar.g(0, min, ef90Var.a);
                    int i4 = ef90Var.b;
                    int i5 = ef90Var.c - 4;
                    while (true) {
                        if (i5 < i4) {
                            break;
                        }
                        if (ayf0.b(i5, ef90Var.a) == 442) {
                            ef90Var.K(i5 + 4);
                            long c2 = ayf0.c(ef90Var);
                            if (c2 != -9223372036854775807L) {
                                j2 = c2;
                                break;
                            }
                        }
                        i5--;
                    }
                    ayf0Var.h = j2;
                    ayf0Var.f = true;
                    return 0;
                }
                if (ayf0Var.h == -9223372036854775807L) {
                    ayf0Var.a(c5pVar);
                    return 0;
                }
                if (ayf0Var.e) {
                    long j4 = ayf0Var.g;
                    if (j4 == -9223372036854775807L) {
                        ayf0Var.a(c5pVar);
                        return 0;
                    }
                    ayf0Var.i = sez0Var.c(ayf0Var.h) - sez0Var.b(j4);
                    ayf0Var.a(c5pVar);
                    return 0;
                }
                int min2 = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, c5pVar.getLength());
                if (c5pVar.getPosition() != 0) {
                    xde0Var.a = 0L;
                    return 1;
                }
                ef90Var.H(min2);
                c5pVar.J();
                c5pVar.g(0, min2, ef90Var.a);
                int i6 = ef90Var.b;
                int i7 = ef90Var.c;
                while (true) {
                    if (i6 >= i7 - 3) {
                        j = -9223372036854775807L;
                        break;
                    }
                    if (ayf0.b(i6, ef90Var.a) == 442) {
                        ef90Var.K(i6 + 4);
                        long c3 = ayf0.c(ef90Var);
                        if (c3 != -9223372036854775807L) {
                            j = c3;
                            break;
                        }
                    }
                    i6++;
                }
                ayf0Var.g = j;
                ayf0Var.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            i = i3;
            i2 = 4;
        } else {
            this.k = true;
            long j5 = ayf0Var.i;
            if (j5 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                wer werVar = new wer(new wt5(), new y4a0(ayf0Var.b), j5, j5 + 1, 0L, length, 188L, 1000);
                this.i = werVar;
                this.j.w((vt5) werVar.b);
            } else {
                i = i3;
                i2 = 4;
                this.j.w(new qb4(j5));
            }
        }
        wer werVar2 = this.i;
        if (werVar2 != null && ((xt5) werVar2.d) != null) {
            return werVar2.c(c5pVar, xde0Var);
        }
        c5pVar.J();
        long L = i != 0 ? length - c5pVar.L() : -1L;
        if (L != -1 && L < 4) {
            return -1;
        }
        ef90 ef90Var2 = this.c;
        if (!c5pVar.H(ef90Var2.a, 0, i2, true)) {
            return -1;
        }
        ef90Var2.K(0);
        int k = ef90Var2.k();
        if (k == 441) {
            return -1;
        }
        if (k == 442) {
            c5pVar.g(0, 10, ef90Var2.a);
            ef90Var2.K(9);
            c5pVar.O((ef90Var2.y() & 7) + 14);
            return 0;
        }
        if (k == 443) {
            c5pVar.g(0, 2, ef90Var2.a);
            ef90Var2.K(0);
            c5pVar.O(ef90Var2.E() + 6);
            return 0;
        }
        if (((k & (-256)) >> 8) != 1) {
            c5pVar.O(1);
            return 0;
        }
        int i8 = k & 255;
        SparseArray sparseArray = this.b;
        byf0 byf0Var = (byf0) sparseArray.get(i8);
        if (!this.e) {
            if (byf0Var == null) {
                if (i8 == 189) {
                    tqnVar = new gb("video/mp2p");
                    this.f = true;
                    this.h = c5pVar.getPosition();
                } else if ((k & 224) == 192) {
                    tqnVar = new ac30(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = c5pVar.getPosition();
                } else if ((k & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) == 224) {
                    tqnVar = new t4u(null, "video/mp2p");
                    this.g = true;
                    this.h = c5pVar.getPosition();
                } else {
                    tqnVar = null;
                }
                if (tqnVar != null) {
                    tqnVar.h(this.j, new xi11(i8, 256));
                    byf0Var = new byf0(tqnVar, this.a);
                    sparseArray.put(i8, byf0Var);
                }
            }
            if (c5pVar.getPosition() > ((this.f && this.g) ? this.h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.e = true;
                this.j.A();
            }
        }
        c5pVar.g(0, 2, ef90Var2.a);
        ef90Var2.K(0);
        int E = ef90Var2.E() + 6;
        if (byf0Var == null) {
            c5pVar.O(E);
            return 0;
        }
        ef90Var2.H(E);
        c5pVar.readFully(ef90Var2.a, 0, E);
        ef90Var2.K(6);
        tqn tqnVar2 = byf0Var.a;
        df90 df90Var = byf0Var.c;
        ef90Var2.i(0, 3, df90Var.a);
        df90Var.m(0);
        df90Var.o(8);
        byf0Var.d = df90Var.f();
        byf0Var.e = df90Var.f();
        df90Var.o(6);
        ef90Var2.i(0, df90Var.g(8), df90Var.a);
        df90Var.m(0);
        sez0 sez0Var2 = byf0Var.b;
        byf0Var.g = 0L;
        if (byf0Var.d) {
            df90Var.o(4);
            df90Var.o(1);
            df90Var.o(1);
            long g = (df90Var.g(3) << 30) | (df90Var.g(15) << 15) | df90Var.g(15);
            df90Var.o(1);
            if (!byf0Var.f && byf0Var.e) {
                df90Var.o(4);
                df90Var.o(1);
                df90Var.o(1);
                df90Var.o(1);
                sez0Var2.b((df90Var.g(3) << 30) | (df90Var.g(15) << 15) | df90Var.g(15));
                byf0Var.f = true;
            }
            byf0Var.g = sez0Var2.b(g);
        }
        tqnVar2.e(4, byf0Var.g);
        tqnVar2.b(ef90Var2);
        tqnVar2.g(false);
        ef90Var2.J(ef90Var2.a.length);
        return 0;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        byte[] bArr = new byte[14];
        kbh kbhVar = (kbh) c5pVar;
        kbhVar.H(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            kbhVar.a(bArr[13] & 7, false);
            kbhVar.H(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}

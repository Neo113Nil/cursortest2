package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes10.dex */
public abstract class bu5 {
    public final int a;
    public final Object b;
    public final Object c;
    public Object d;

    public bu5(be71 be71Var, kk71 kk71Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.c = kk71Var;
        this.a = i;
        this.b = new q471(be71Var, j, j2, j3, j4, j5);
    }

    public static int d(c5p c5pVar, long j, xde0 xde0Var) {
        if (j == c5pVar.getPosition()) {
            return 0;
        }
        xde0Var.a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        if (r10 != r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
    
        r33.a = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a(w971 w971Var, jp61 jp61Var) {
        kk71 kk71Var = (kk71) this.c;
        while (true) {
            xt5 xt5Var = (xt5) this.d;
            if (xt5Var == null) {
                ny61.k();
                return 0;
            }
            long j = xt5Var.f;
            long j2 = xt5Var.g;
            long j3 = xt5Var.h;
            if (j2 - j <= this.a) {
                this.d = null;
                kk71Var.mo24a();
                if (j != w971Var.w) {
                    jp61Var.a = j;
                    return 1;
                }
            } else {
                long j4 = w971Var.w;
                long j5 = j3 - j4;
                if (j5 < 0 || j5 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    break;
                }
                w971Var.b((int) j5);
                w971Var.y = 0;
                zt5 d = kk71Var.d(w971Var, xt5Var.b);
                int i = d.a;
                long j6 = d.c;
                if (i == -3) {
                    this.d = null;
                    kk71Var.mo24a();
                    if (j3 != w971Var.w) {
                        jp61Var.a = j3;
                        return 1;
                    }
                } else if (i == -2) {
                    long j7 = d.b;
                    xt5Var.d = j7;
                    xt5Var.f = j6;
                    xt5Var.h = xt5.a(xt5Var.b, j7, xt5Var.e, j6, xt5Var.g, xt5Var.c);
                } else if (i == -1) {
                    long j8 = d.b;
                    xt5Var.e = j8;
                    xt5Var.g = j6;
                    xt5Var.h = xt5.a(xt5Var.b, xt5Var.d, j8, xt5Var.f, j6, xt5Var.c);
                } else {
                    if (i != 0) {
                        ny61.r("Invalid case");
                        return 0;
                    }
                    long j9 = j6 - w971Var.w;
                    if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        w971Var.b((int) j9);
                    }
                    this.d = null;
                    kk71Var.mo24a();
                    if (j6 != w971Var.w) {
                        jp61Var.a = j6;
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public void b(long j) {
        q471 q471Var = (q471) this.b;
        xt5 xt5Var = (xt5) this.d;
        if (xt5Var == null || xt5Var.a != j) {
            this.d = new xt5(j, q471Var.a.a(j), q471Var.c, q471Var.d, q471Var.e, q471Var.f, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        return d(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(c5p c5pVar, xde0 xde0Var) {
        au5 au5Var = (au5) this.c;
        while (true) {
            xt5 xt5Var = (xt5) this.d;
            d6z.z(xt5Var);
            long j = xt5Var.f;
            long j2 = xt5Var.g;
            long j3 = xt5Var.h;
            if (j2 - j <= this.a) {
                this.d = null;
                au5Var.m();
                return d(c5pVar, j, xde0Var);
            }
            long position = j3 - c5pVar.getPosition();
            if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                break;
            }
            c5pVar.O((int) position);
            c5pVar.J();
            zt5 a = au5Var.a(c5pVar, xt5Var.b);
            int i = a.a;
            long j4 = a.b;
            long j5 = a.c;
            if (i == -3) {
                this.d = null;
                au5Var.m();
                return d(c5pVar, j3, xde0Var);
            }
            if (i == -2) {
                xt5Var.d = j4;
                xt5Var.f = j5;
                xt5Var.h = xt5.b(xt5Var.b, j4, xt5Var.e, j5, xt5Var.g, xt5Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        ny61.r("Invalid case");
                        return 0;
                    }
                    long position2 = j5 - c5pVar.getPosition();
                    if (position2 >= 0 && position2 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        c5pVar.O((int) position2);
                    }
                    this.d = null;
                    au5Var.m();
                    return d(c5pVar, j5, xde0Var);
                }
                xt5Var.e = j4;
                xt5Var.g = j5;
                xt5Var.h = xt5.b(xt5Var.b, xt5Var.d, j4, xt5Var.f, j5, xt5Var.c);
            }
        }
    }

    public void e(long j) {
        xt5 xt5Var = (xt5) this.d;
        if (xt5Var == null || xt5Var.a != j) {
            vt5 vt5Var = (vt5) this.b;
            this.d = new xt5(j, vt5Var.a.c(j), vt5Var.c, vt5Var.d, vt5Var.e, vt5Var.f, 0);
        }
    }

    public bu5(yt5 yt5Var, au5 au5Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.c = au5Var;
        this.a = i;
        this.b = new vt5(yt5Var, j, j2, j3, j4, j5);
    }
}

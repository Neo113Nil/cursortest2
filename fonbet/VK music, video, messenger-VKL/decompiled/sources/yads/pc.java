package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;

/* loaded from: classes10.dex */
public final class pc implements nq0 {
    public final kc2 d;
    public final jc2 e;
    public qq0 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int a = 0;
    public final qc b = new qc();
    public final kc2 c = new kc2(2048);
    public int i = -1;
    public long h = -1;

    public pc() {
        kc2 kc2Var = new kc2(10);
        this.d = kc2Var;
        this.e = new jc2(kc2Var.a());
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f = qq0Var;
        this.b.a(qq0Var, new pa3(Integer.MIN_VALUE, 0, 1));
        qq0Var.a();
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        this.k = false;
        this.b.a();
        this.g = j2;
    }

    public final int a(ld0 ld0Var) {
        int i = 0;
        while (true) {
            ld0Var.b(this.d.a, 0, 10, false);
            this.d.e(0);
            if (this.d.o() != 4801587) {
                break;
            }
            kc2 kc2Var = this.d;
            kc2Var.e(kc2Var.b + 3);
            int l = this.d.l();
            i += l + 10;
            ld0Var.a(false, l);
        }
        ld0Var.f = 0;
        ld0Var.a(false, i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        if (r14 == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ad  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        ld0 ld0Var;
        int i;
        boolean z;
        int i2;
        if (this.f != null) {
            ld0Var = (ld0) oq0Var;
            long j = ld0Var.c;
            int i3 = this.a;
            int i4 = 2;
            if (((i3 & 2) != 0 || ((i3 & 1) != 0 && j != -1)) && !this.j) {
                this.i = -1;
                ld0Var.f = 0;
                if (ld0Var.d == 0) {
                    a(ld0Var);
                }
                long j2 = 0;
                i = 0;
                while (true) {
                    try {
                        ld0 ld0Var2 = (ld0) oq0Var;
                        if (!ld0Var2.b(this.d.a, 0, i4, true)) {
                            break;
                        }
                        this.d.e(0);
                        int i5 = i4;
                        if ((this.d.r() & 65526) != 65520) {
                            i = 0;
                            break;
                        }
                        try {
                            if (!ld0Var2.b(this.d.a, 0, 4, true)) {
                                break;
                            }
                            this.e.b(14);
                            int a = this.e.a(13);
                            if (a > 6) {
                                j2 += a;
                                i++;
                                if (i != 1000 && ld0Var2.a(true, a - 6)) {
                                    i4 = i5;
                                }
                            } else {
                                this.j = true;
                                throw new pc2("Malformed ADTS stream", null, true, 1);
                            }
                        } catch (EOFException unused) {
                        }
                    } catch (EOFException unused2) {
                    }
                }
                ld0Var.f = 0;
                if (i <= 0) {
                    this.i = (int) (j2 / i);
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
            int read = ld0Var.read(this.c.a, 0, 2048);
            z = read != -1;
            if (this.l) {
                int i6 = this.a;
                boolean z2 = (i6 & 1) != 0 && this.i > 0;
                if (z2) {
                    i2 = -1;
                    if (this.b.q == C.TIME_UNSET) {
                    }
                } else {
                    i2 = -1;
                }
                if (z2) {
                    long j3 = this.b.q;
                    if (j3 != C.TIME_UNSET) {
                        qq0 qq0Var = this.f;
                        boolean z3 = (i6 & 2) != 0;
                        int i7 = this.i;
                        qq0Var.a(new gz((int) ((i7 * 8000000) / j3), i7, j, this.h, z3));
                        this.l = true;
                    }
                }
                this.f.a(new yx2(C.TIME_UNSET, 0L));
                this.l = true;
            } else {
                i2 = -1;
            }
            if (!z) {
                return i2;
            }
            this.c.e(0);
            this.c.d(read);
            if (!this.k) {
                this.b.a(4, this.g);
                this.k = true;
            }
            this.b.a(this.c);
            return 0;
        }
        throw new IllegalStateException();
        ld0Var.f = 0;
        if (i <= 0) {
        }
        this.j = true;
        int read2 = ld0Var.read(this.c.a, 0, 2048);
        if (read2 != -1) {
        }
        if (this.l) {
        }
        if (!z) {
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        int a = a(ld0Var);
        int i = a;
        int i2 = 0;
        int i3 = 0;
        do {
            ld0Var.b(this.d.a, 0, 2, false);
            this.d.e(0);
            if ((this.d.r() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                ld0Var.b(this.d.a, 0, 4, false);
                this.e.b(14);
                int a2 = this.e.a(13);
                if (a2 <= 6) {
                    i++;
                    ld0Var.f = 0;
                    ld0Var.a(false, i);
                } else {
                    ld0Var.a(false, a2 - 6);
                    i3 += a2;
                }
            } else {
                i++;
                ld0Var.f = 0;
                ld0Var.a(false, i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - a < 8192);
        return false;
    }

    public static nq0[] a() {
        return new nq0[]{new pc()};
    }
}

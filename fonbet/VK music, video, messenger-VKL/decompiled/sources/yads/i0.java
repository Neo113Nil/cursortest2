package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class i0 implements nq0 {
    public final j0 a = new j0();
    public final kc2 b = new kc2(16384);
    public boolean c;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        j0 j0Var = this.a;
        j0Var.getClass();
        j0Var.d = "0";
        j0Var.e = qq0Var.a(0, 1);
        qq0Var.a();
        qq0Var.a(new yx2(C.TIME_UNSET, 0L));
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // yads.nq0
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        int read = ((ld0) oq0Var).read(this.b.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.b.e(0);
        this.b.d(read);
        if (!this.c) {
            this.a.a(4, 0L);
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }

    public static /* synthetic */ nq0[] a() {
        return new nq0[]{new i0()};
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var;
        int i;
        kc2 kc2Var = new kc2(10);
        int i2 = 0;
        while (true) {
            ld0Var = (ld0) oq0Var;
            ld0Var.b(kc2Var.a, 0, 10, false);
            kc2Var.e(0);
            if (kc2Var.o() != 4801587) {
                break;
            }
            kc2Var.e(kc2Var.b + 3);
            int l = kc2Var.l();
            i2 += l + 10;
            ld0Var.a(false, l);
        }
        ld0Var.f = 0;
        ld0Var.a(false, i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            ld0Var.b(kc2Var.a, 0, 7, false);
            kc2Var.e(0);
            int r = kc2Var.r();
            if (r == 44096 || r == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = kc2Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (r == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                ld0Var.a(false, i - 7);
            } else {
                ld0Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                ld0Var.a(false, i4);
                i3 = 0;
            }
        }
    }

    @Override // yads.nq0
    public final void release() {
    }
}

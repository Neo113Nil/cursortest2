package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ru.ok.android.commons.nio.charset.CharsetEncoder;

/* loaded from: classes10.dex */
public final class f0 implements nq0 {
    public final g0 a = new g0();
    public final kc2 b = new kc2(2786);
    public boolean c;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        g0 g0Var = this.a;
        g0Var.getClass();
        g0Var.d = "0";
        g0Var.e = qq0Var.a(0, 1);
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
        int read = ((ld0) oq0Var).read(this.b.a, 0, 2786);
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
        return new nq0[]{new f0()};
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var;
        int a;
        kc2 kc2Var = new kc2(10);
        int i = 0;
        while (true) {
            ld0Var = (ld0) oq0Var;
            ld0Var.b(kc2Var.a, 0, 10, false);
            kc2Var.e(0);
            if (kc2Var.o() != 4801587) {
                break;
            }
            kc2Var.e(kc2Var.b + 3);
            int l = kc2Var.l();
            i += l + 10;
            ld0Var.a(false, l);
        }
        ld0Var.f = 0;
        ld0Var.a(false, i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            ld0Var.b(kc2Var.a, 0, 6, false);
            kc2Var.e(0);
            if (kc2Var.r() != 2935) {
                ld0Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                ld0Var.a(false, i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = kc2Var.a;
                if (bArr.length < 6) {
                    a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    a = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    a = h0.a((b & 192) >> 6, b & CharsetEncoder.DEFAULT_REPLACEMENT);
                }
                if (a == -1) {
                    return false;
                }
                ld0Var.a(false, a - 6);
            }
        }
    }

    @Override // yads.nq0
    public final void release() {
    }
}

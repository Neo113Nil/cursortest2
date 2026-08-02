package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import ru.ok.android.commons.nio.charset.CharsetEncoder;

/* loaded from: classes10.dex */
public final class rb2 extends d53 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean a(kc2 kc2Var, byte[] bArr) {
        int i = kc2Var.c;
        int i2 = kc2Var.b;
        if (i - i2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        kc2Var.a(bArr2, 0, bArr.length);
        kc2Var.e(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // yads.d53
    public final long a(kc2 kc2Var) {
        int i;
        byte[] bArr = kc2Var.a;
        byte b = bArr[0];
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & CharsetEncoder.DEFAULT_REPLACEMENT;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return (this.i * (i * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }

    @Override // yads.d53
    public final boolean a(kc2 kc2Var, long j, b53 b53Var) {
        if (a(kc2Var, o)) {
            byte[] copyOf = Arrays.copyOf(kc2Var.a, kc2Var.c);
            int i = copyOf[9] & 255;
            ArrayList a = sb2.a(copyOf);
            if (b53Var.a != null) {
                return true;
            }
            mx0 mx0Var = new mx0();
            mx0Var.k = MimeTypes.AUDIO_OPUS;
            mx0Var.x = i;
            mx0Var.y = 48000;
            mx0Var.m = a;
            b53Var.a = new nx0(mx0Var);
            return true;
        }
        if (a(kc2Var, p)) {
            if (b53Var.a != null) {
                if (this.n) {
                    return true;
                }
                this.n = true;
                kc2Var.e(kc2Var.b + 8);
                ut1 a2 = ho3.a(s51.b(ho3.a(kc2Var, false, false).a));
                if (a2 == null) {
                    return true;
                }
                nx0 nx0Var = b53Var.a;
                nx0Var.getClass();
                mx0 mx0Var2 = new mx0(nx0Var);
                ut1 ut1Var = b53Var.a.k;
                if (ut1Var != null) {
                    tt1[] tt1VarArr = ut1Var.b;
                    if (tt1VarArr.length != 0) {
                        a2 = new ut1((tt1[]) mc3.a((Object[]) a2.b, (Object[]) tt1VarArr));
                    }
                }
                mx0Var2.i = a2;
                b53Var.a = new nx0(mx0Var2);
                return true;
            }
            throw new IllegalStateException();
        }
        if (b53Var.a != null) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // yads.d53
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = false;
        }
    }
}

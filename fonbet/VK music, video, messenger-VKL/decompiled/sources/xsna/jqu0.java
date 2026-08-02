package xsna;

import org.chromium.net.NetError;
import xsna.q630;

/* compiled from: VkDivider.kt */
/* loaded from: classes17.dex */
public final class jqu0 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0062  */
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, long j, float f, float f2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        long j2;
        float f3;
        int i4;
        float f4;
        final q630 q630Var2;
        final long j3;
        final float f5;
        final float f6;
        androidx.compose.runtime.f s;
        q630 q630Var3;
        float f7;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1079053456);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (M.p(j2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j2 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j2 = j;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f3 = f;
            i3 |= M.n(f3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= M.n(f4) ? 2048 : 1024;
                if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630 q630Var4 = i6 != 0 ? q630.a.a : q630Var;
                        if ((i2 & 2) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var.p().b;
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        if (i7 != 0) {
                            f3 = (float) 0.5d;
                        }
                        if (i4 != 0) {
                            q630Var3 = q630Var4;
                            f7 = 0;
                            float f8 = f3;
                            long j4 = j2;
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1079053456, i3, -1, "com.vk.core.compose.component.VkDivider (VkDivider.kt:28)");
                            }
                            dsn.a(q630Var3, j4, f8, f7, M, i3 & 8190, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var2 = q630Var3;
                            j3 = j4;
                            f5 = f8;
                            f6 = f7;
                        } else {
                            q630Var3 = q630Var4;
                        }
                    } else {
                        M.h();
                        if ((i2 & 2) != 0) {
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        q630Var3 = q630Var;
                    }
                    f7 = f4;
                    float f82 = f3;
                    long j42 = j2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    dsn.a(q630Var3, j42, f82, f7, M, i3 & 8190, 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var2 = q630Var3;
                    j3 = j42;
                    f5 = f82;
                    f6 = f7;
                } else {
                    M.h();
                    q630Var2 = q630Var;
                    j3 = j2;
                    f5 = f3;
                    f6 = f4;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.iqu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jqu0.a(q630.this, j3, f5, f6, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            f4 = f2;
            if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
        }
        s = M.s();
        if (s != null) {
        }
    }
}

package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.chromium.net.NetError;
import xsna.q630;

/* compiled from: VkCard.kt */
/* loaded from: classes17.dex */
public final class phu0 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, r5j0 r5j0Var, long j, long j2, y18 y18Var, float f, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        r5j0 r5j0Var2;
        long j3;
        y18 y18Var2;
        int i4;
        float f2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final r5j0 r5j0Var3;
        final long j4;
        final y18 y18Var3;
        final float f3;
        final long j5;
        androidx.compose.runtime.f s;
        long j6;
        int i5;
        q630 q630Var4;
        y18 y18Var4;
        long j7;
        float f4;
        r5j0 r5j0Var4;
        int i6;
        int i7;
        androidx.compose.runtime.a M = aVar.M(-1435603177);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                r5j0Var2 = r5j0Var;
                if (M.J(r5j0Var2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                r5j0Var2 = r5j0Var;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            r5j0Var2 = r5j0Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (M.p(j3)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            y18Var2 = y18Var;
            i3 |= M.J(y18Var2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                f2 = f;
                i3 |= M.n(f2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    i3 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if (M.t(i3 & 1, (599187 & i3) != 599186)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630 q630Var5 = i8 != 0 ? q630.a.a : q630Var2;
                        if ((i2 & 2) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1344562486, 0, -1, "com.vk.core.compose.component.defaults.card.<get-VkCardDefaults> (VkCardDefaults.kt:10)");
                            }
                            uog0 uog0Var = cn20.a;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            uog0 b = vog0.b(kqu0.e);
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            r5j0Var2 = b;
                        }
                        if ((i2 & 4) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j3 = ylu0Var.getBackground().n;
                            i3 &= -897;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 q630Var6 = q630Var5;
                        j6 = ylu0Var2.getText().m;
                        i5 = i3 & (-7169);
                        y18 y18Var5 = i9 != 0 ? null : y18Var2;
                        if (i4 != 0) {
                            q630Var4 = q630Var6;
                            y18Var4 = y18Var5;
                            r5j0Var4 = r5j0Var2;
                            j7 = j3;
                            f4 = cn20.b;
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1435603177, i5, -1, "com.vk.core.compose.component.card.VkCard (VkCard.kt:41)");
                            }
                            M.K(1230818047);
                            aVar2 = M;
                            long j8 = j6;
                            uov0.a(q630Var4, r5j0Var4, j7, j8, y18Var4, f4, jaiVar, aVar2, i5 & 4194302, 0);
                            aVar2.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var4;
                            r5j0Var3 = r5j0Var4;
                            j4 = j7;
                            j5 = j8;
                            y18Var3 = y18Var4;
                            f3 = f4;
                        } else {
                            q630Var4 = q630Var6;
                            y18Var4 = y18Var5;
                            j7 = j3;
                            f4 = f2;
                        }
                    } else {
                        M.h();
                        if ((i2 & 2) != 0) {
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        i5 = i3 & (-7169);
                        q630Var4 = q630Var2;
                        j7 = j3;
                        y18Var4 = y18Var2;
                        f4 = f2;
                        j6 = j2;
                    }
                    r5j0Var4 = r5j0Var2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.K(1230818047);
                    aVar2 = M;
                    long j82 = j6;
                    uov0.a(q630Var4, r5j0Var4, j7, j82, y18Var4, f4, jaiVar, aVar2, i5 & 4194302, 0);
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var3 = q630Var4;
                    r5j0Var3 = r5j0Var4;
                    j4 = j7;
                    j5 = j82;
                    y18Var3 = y18Var4;
                    f3 = f4;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    q630Var3 = q630Var2;
                    r5j0Var3 = r5j0Var2;
                    j4 = j3;
                    y18Var3 = y18Var2;
                    f3 = f2;
                    j5 = j2;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.nhu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            phu0.a(q630.this, r5j0Var3, j4, j5, y18Var3, f3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        y18Var2 = y18Var;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final gzs gzsVar, q630 q630Var, final uog0 uog0Var, final long j, long j2, float f, sg50 sg50Var, boolean z, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        long j3;
        int i4;
        androidx.compose.runtime.a aVar2;
        final long j4;
        final float f2;
        final sg50 sg50Var2;
        final boolean z2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        int i5;
        float f3;
        sg50 sg50Var3;
        long j5;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(-1467386038);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= M.J(uog0Var) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= M.p(j3) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            i4 = i3 | 115015680;
            if ((805306368 & i) == 0) {
                i4 |= M.y(jaiVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            if (M.t(i4 & 1, (306783379 & i4) == 306783378)) {
                aVar2 = M;
                aVar2.h();
                j4 = j2;
                f2 = f;
                sg50Var2 = sg50Var;
                z2 = z;
                q630Var3 = q630Var2;
            } else {
                M.V();
                if ((i & 1) == 0 || M.i()) {
                    q630Var4 = i6 != 0 ? q630.a.a : q630Var2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j6 = ylu0Var.getText().m;
                    i5 = i4 & (-57345);
                    float f4 = cn20.b;
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = ir.h(M);
                    }
                    f3 = f4;
                    sg50Var3 = (sg50) x;
                    j5 = j6;
                    z3 = true;
                } else {
                    M.h();
                    i5 = i4 & (-57345);
                    j5 = j2;
                    f3 = f;
                    sg50Var3 = sg50Var;
                    z3 = z;
                    q630Var4 = q630Var2;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1467386038, i5, -1, "com.vk.core.compose.component.card.VkCard (VkCard.kt:80)");
                }
                M.K(-719441510);
                aVar2 = M;
                q630 q630Var5 = q630Var4;
                uov0.b(gzsVar, q630Var5, uog0Var, j3, j5, null, f3, sg50Var3, null, z3, null, jaiVar, aVar2, (33554430 & i5) | ((i5 << 3) & 1879048192), (i5 >> 24) & 112, CoverVideoUploadTask.y);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
                j4 = j5;
                f2 = f3;
                sg50Var2 = sg50Var3;
                z2 = z3;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ohu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        phu0.b(gzs.this, q630Var3, uog0Var, j, j4, f2, sg50Var2, z2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        i4 = i3 | 115015680;
        if ((805306368 & i) == 0) {
        }
        if (M.t(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}

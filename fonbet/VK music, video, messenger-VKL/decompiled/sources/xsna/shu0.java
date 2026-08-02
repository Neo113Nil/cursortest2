package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: VkCardOld.kt */
/* loaded from: classes17.dex */
public final class shu0 {
    /* JADX WARN: Removed duplicated region for block: B:106:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006e  */
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, r5j0 r5j0Var, long j, long j2, y18 y18Var, float f, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        r5j0 r5j0Var2;
        long j3;
        int i4;
        y18 y18Var2;
        int i5;
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
        q630 q630Var4;
        int i6;
        y18 y18Var4;
        r5j0 r5j0Var4;
        float f4;
        long j7;
        int i7;
        androidx.compose.runtime.a M = aVar.M(2001581789);
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
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            r5j0Var2 = r5j0Var;
            i3 |= M.J(r5j0Var2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (M.p(j3)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                y18Var2 = y18Var;
                i3 |= M.J(y18Var2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= M.n(f2) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    if (M.t(i3 & 1, (599187 & i3) == 599186)) {
                        aVar2 = M;
                        aVar2.h();
                        q630Var3 = q630Var2;
                        r5j0Var3 = r5j0Var2;
                        j4 = j3;
                        y18Var3 = y18Var2;
                        f3 = f2;
                        j5 = j2;
                    } else {
                        M.V();
                        if ((i & 1) == 0 || M.i()) {
                            q630 q630Var5 = i8 != 0 ? q630.a.a : q630Var2;
                            if (i9 != 0) {
                                r5j0Var2 = cn20.a;
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
                            j6 = ylu0Var2.getText().m;
                            int i10 = i3 & (-7169);
                            y18 y18Var5 = i4 != 0 ? null : y18Var2;
                            if (i5 != 0) {
                                q630Var4 = q630Var5;
                                i6 = i10;
                                y18Var4 = y18Var5;
                                r5j0Var4 = r5j0Var2;
                                j7 = j3;
                                f4 = cn20.b;
                            } else {
                                q630Var4 = q630Var5;
                                i6 = i10;
                                y18Var4 = y18Var5;
                                r5j0Var4 = r5j0Var2;
                                f4 = f2;
                                j7 = j3;
                            }
                        } else {
                            M.h();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            i6 = i3 & (-7169);
                            r5j0Var4 = r5j0Var2;
                            y18Var4 = y18Var2;
                            f4 = f2;
                            q630Var4 = q630Var2;
                            j7 = j3;
                            j6 = j2;
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2001581789, i6, -1, "com.vk.core.compose.component.VkCardOld (VkCardOld.kt:27)");
                        }
                        M.K(2092697337);
                        aVar2 = M;
                        long j8 = j6;
                        uov0.a(q630Var4, r5j0Var4, j7, j8, y18Var4, f4, jaiVar, aVar2, i6 & 4194302, 0);
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
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.rhu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                shu0.a(q630.this, r5j0Var3, j4, j5, y18Var3, f3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
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
                if (M.t(i3 & 1, (599187 & i3) == 599186)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            y18Var2 = y18Var;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            if (M.t(i3 & 1, (599187 & i3) == 599186)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        r5j0Var2 = r5j0Var;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        y18Var2 = y18Var;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        if (M.t(i3 & 1, (599187 & i3) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    @ozl
    public static final void b(final gzs gzsVar, final q630 q630Var, final r5j0 r5j0Var, final long j, long j2, float f, sg50 sg50Var, boolean z, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        r5j0 r5j0Var2;
        long j3;
        androidx.compose.runtime.a aVar2;
        final long j4;
        final float f2;
        final sg50 sg50Var2;
        final boolean z2;
        int i3;
        float f3;
        long j5;
        sg50 sg50Var3;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(-1361280210);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            r5j0Var2 = r5j0Var;
            i2 |= M.J(r5j0Var2) ? 256 : 128;
        } else {
            r5j0Var2 = r5j0Var;
        }
        if ((i & 3072) == 0) {
            j3 = j;
            i2 |= M.p(j3) ? 2048 : 1024;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        int i4 = i2 | 115015680;
        if ((805306368 & i) == 0) {
            i4 |= M.y(jaiVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i4 & 1, (306783379 & i4) != 306783378)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j6 = ylu0Var.getText().m;
                i3 = i4 & (-57345);
                float f4 = cn20.b;
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = ir.h(M);
                }
                f3 = f4;
                j5 = j6;
                sg50Var3 = (sg50) x;
                z3 = true;
            } else {
                M.h();
                i3 = i4 & (-57345);
                j5 = j2;
                f3 = f;
                sg50Var3 = sg50Var;
                z3 = z;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1361280210, i3, -1, "com.vk.core.compose.component.VkCardOld (VkCardOld.kt:58)");
            }
            M.K(-816788298);
            aVar2 = M;
            uov0.b(gzsVar, q630Var, r5j0Var2, j3, j5, null, f3, sg50Var3, null, z3, null, jaiVar, aVar2, (33554430 & i3) | ((i3 << 3) & 1879048192), (i3 >> 24) & 112, CoverVideoUploadTask.y);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j4 = j5;
            f2 = f3;
            sg50Var2 = sg50Var3;
            z2 = z3;
        } else {
            aVar2 = M;
            aVar2.h();
            j4 = j2;
            f2 = f;
            sg50Var2 = sg50Var;
            z2 = z;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qhu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    shu0.b(gzs.this, q630Var, r5j0Var, j, j4, f2, sg50Var2, z2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}

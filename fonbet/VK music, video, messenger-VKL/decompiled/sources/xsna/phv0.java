package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: VkScaffold.kt */
/* loaded from: classes17.dex */
public final class phv0 {
    public static final iyk0 a = new iyk0(new qc00(21));
    public static final float b = 16;

    public static final void a(int i, wzs wzsVar, jai jaiVar, wzs wzsVar2, wzs wzsVar3, wzs wzsVar4, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(945760989);
        int i3 = i2 | (M.l(false) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.y(wzsVar) ? 256 : 128) | (M.y(jaiVar) ? 2048 : 1024) | (M.y(wzsVar2) ? 16384 : 8192) | (M.y(wzsVar3) ? 131072 : 65536) | (M.y(wzsVar4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(945760989, i3, -1, "com.vk.core.compose.component.ScaffoldLayout (VkScaffold.kt:57)");
            }
            boolean z = ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576) | ((i3 & 7168) == 2048);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                qwq qwqVar = new qwq(i, jaiVar, wzsVar, wzsVar2, wzsVar3, wzsVar4);
                M.R(qwqVar);
                x = qwqVar;
            }
            xtm0.a(null, (wzs) x, M, 0, 1);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m8p0(i, wzsVar, jaiVar, wzsVar2, wzsVar3, wzsVar4, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(q630 q630Var, wzs wzsVar, wzs wzsVar2, wzs wzsVar3, wzs wzsVar4, int i, long j, long j2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        q630 q630Var2;
        int i4;
        wzs wzsVar5;
        int i5;
        wzs wzsVar6;
        int i6;
        wzs wzsVar7;
        int i7;
        wzs wzsVar8;
        int i8;
        int i9;
        androidx.compose.runtime.a aVar2;
        final int i10;
        final q630 q630Var3;
        final wzs wzsVar9;
        final wzs wzsVar10;
        final wzs wzsVar11;
        final long j3;
        final long j4;
        androidx.compose.runtime.f s;
        long j5;
        int i11;
        long j6;
        long j7;
        int i12;
        q630 q630Var4;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a M = aVar.M(-1085323105);
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i2 | 6;
            q630Var2 = q630Var;
        } else if ((i2 & 6) == 0) {
            q630Var2 = q630Var;
            i4 = (M.J(q630Var2) ? 4 : 2) | i2;
        } else {
            q630Var2 = q630Var;
            i4 = i2;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            wzsVar5 = wzsVar;
            i4 |= M.y(wzsVar5) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                wzsVar6 = wzsVar2;
                i4 |= M.y(wzsVar6) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    wzsVar7 = wzsVar3;
                    i4 |= M.y(wzsVar7) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        wzsVar8 = wzsVar4;
                        i4 |= M.y(wzsVar8) ? 16384 : 8192;
                        if ((i2 & 196608) == 0) {
                            i4 |= 65536;
                        }
                        i8 = i4 | 1572864;
                        if ((i2 & 12582912) == 0) {
                            i9 = i16;
                            if ((i3 & 128) == 0 && M.p(j)) {
                                i15 = 8388608;
                                i8 |= i15;
                            }
                            i15 = 4194304;
                            i8 |= i15;
                        } else {
                            i9 = i16;
                        }
                        if ((i2 & 100663296) == 0) {
                            i8 |= ((i3 & 256) == 0 && M.p(j2)) ? 67108864 : 33554432;
                        }
                        if ((805306368 & i2) == 0) {
                            i8 |= M.y(jaiVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        }
                        if (M.t(i8 & 1, (i8 & 306783379) != 306783378)) {
                            M.V();
                            if ((i2 & 1) == 0 || M.i()) {
                                if (i9 != 0) {
                                    q630Var2 = q630.a.a;
                                }
                                if (i17 != 0) {
                                    wzsVar5 = x19.c;
                                }
                                if (i5 != 0) {
                                    wzsVar6 = x19.d;
                                }
                                if (i6 != 0) {
                                    wzsVar7 = x19.e;
                                }
                                if (i7 != 0) {
                                    wzsVar8 = x19.f;
                                }
                                int i18 = i8 & (-458753);
                                if ((i3 & 128) != 0) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    j5 = ylu0Var.getBackground().a;
                                    i18 = i8 & (-29818881);
                                } else {
                                    j5 = j;
                                }
                                if ((i3 & 256) != 0) {
                                    i11 = 1572864;
                                    j6 = j5;
                                    i12 = i18 & (-234881025);
                                    q630Var4 = q630Var2;
                                    j7 = ((l5g) M.r(yfj.a)).a;
                                    i13 = 2;
                                    i14 = -1085323105;
                                    wzsVar5 = wzsVar5;
                                } else {
                                    i11 = 1572864;
                                    j6 = j5;
                                    j7 = j2;
                                    i12 = i18;
                                    q630Var4 = q630Var2;
                                    i13 = 2;
                                    i14 = -1085323105;
                                }
                            } else {
                                M.h();
                                int i19 = i8 & (-458753);
                                if ((i3 & 128) != 0) {
                                    i19 = i8 & (-29818881);
                                }
                                if ((i3 & 256) != 0) {
                                    i19 &= -234881025;
                                }
                                j7 = j2;
                                i12 = i19;
                                q630Var4 = q630Var2;
                                i11 = 1572864;
                                i14 = -1085323105;
                                i13 = i;
                                j6 = j;
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(i14, i12, -1, "com.vk.core.compose.component.VkScaffold (VkScaffold.kt:32)");
                            }
                            int i20 = i13;
                            wzs wzsVar12 = wzsVar8;
                            int i21 = i11 | (i12 & 14);
                            int i22 = i12 >> 15;
                            aVar2 = M;
                            uov0.a(q630Var4, null, j6, j7, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-2113521498, new orv(i20, jaiVar, wzsVar5, wzsVar7, wzsVar12, wzsVar6), M), aVar2, i21 | (i22 & 896) | (i22 & 7168), 50);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            wzsVar11 = wzsVar12;
                            i10 = i20;
                            wzsVar9 = wzsVar5;
                            wzsVar10 = wzsVar6;
                            q630Var3 = q630Var4;
                            j3 = j6;
                            j4 = j7;
                        } else {
                            aVar2 = M;
                            aVar2.h();
                            i10 = i;
                            q630Var3 = q630Var2;
                            wzsVar9 = wzsVar5;
                            wzsVar10 = wzsVar6;
                            wzsVar11 = wzsVar8;
                            j3 = j;
                            j4 = j2;
                        }
                        final wzs wzsVar13 = wzsVar7;
                        s = aVar2.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.nhv0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    phv0.b(q630.this, wzsVar9, wzsVar10, wzsVar13, wzsVar11, i10, j3, j4, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    wzsVar8 = wzsVar4;
                    if ((i2 & 196608) == 0) {
                    }
                    i8 = i4 | 1572864;
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((805306368 & i2) == 0) {
                    }
                    if (M.t(i8 & 1, (i8 & 306783379) != 306783378)) {
                    }
                    final wzs wzsVar132 = wzsVar7;
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                wzsVar7 = wzsVar3;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                wzsVar8 = wzsVar4;
                if ((i2 & 196608) == 0) {
                }
                i8 = i4 | 1572864;
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((805306368 & i2) == 0) {
                }
                if (M.t(i8 & 1, (i8 & 306783379) != 306783378)) {
                }
                final wzs wzsVar1322 = wzsVar7;
                s = aVar2.s();
                if (s != null) {
                }
            }
            wzsVar6 = wzsVar2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            wzsVar7 = wzsVar3;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            wzsVar8 = wzsVar4;
            if ((i2 & 196608) == 0) {
            }
            i8 = i4 | 1572864;
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((805306368 & i2) == 0) {
            }
            if (M.t(i8 & 1, (i8 & 306783379) != 306783378)) {
            }
            final wzs wzsVar13222 = wzsVar7;
            s = aVar2.s();
            if (s != null) {
            }
        }
        wzsVar5 = wzsVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        wzsVar6 = wzsVar2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        wzsVar7 = wzsVar3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        wzsVar8 = wzsVar4;
        if ((i2 & 196608) == 0) {
        }
        i8 = i4 | 1572864;
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        if (M.t(i8 & 1, (i8 & 306783379) != 306783378)) {
        }
        final wzs wzsVar132222 = wzsVar7;
        s = aVar2.s();
        if (s != null) {
        }
    }
}

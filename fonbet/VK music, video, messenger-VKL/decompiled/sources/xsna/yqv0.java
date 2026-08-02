package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import java.util.Map;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: VkText.kt */
/* loaded from: classes17.dex */
public final class yqv0 {
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, q630 q630Var, long j, long j2, b6s b6sVar, v4s v4sVar, long j3, int i, long j4, t7z t7zVar, int i2, boolean z, int i3, int i4, izs izsVar, frv0 frv0Var, androidx.compose.runtime.a aVar, final int i5, final int i6, final int i7) {
        int i8;
        q630 q630Var2;
        int i9;
        long j5;
        int i10;
        int i11;
        int i12;
        b6s b6sVar2;
        int i13;
        v4s v4sVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        long j6;
        int i18;
        int i19;
        androidx.compose.runtime.a aVar2;
        final int i20;
        final boolean z2;
        final int i21;
        final int i22;
        final izs izsVar2;
        final frv0 frv0Var2;
        final q630 q630Var3;
        final long j7;
        final t7z t7zVar2;
        final long j8;
        final v4s v4sVar3;
        final int i23;
        final long j9;
        final b6s b6sVar3;
        final long j10;
        androidx.compose.runtime.f s;
        long j11;
        long j12;
        izs izsVar3;
        t7z t7zVar3;
        int i24;
        boolean z3;
        b6s b6sVar4;
        q630 q630Var4;
        v4s v4sVar4;
        frv0 frv0Var3;
        int i25;
        long j13;
        int i26;
        int i27;
        long j14;
        int i28;
        androidx.compose.runtime.a M = aVar.M(1581249774);
        if ((i5 & 6) == 0) {
            i8 = (M.J(str) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i29 = i7 & 2;
        if (i29 != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            q630Var2 = q630Var;
            i8 |= M.J(q630Var2) ? 32 : 16;
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= 384;
            } else if ((i5 & 384) == 0) {
                j5 = j;
                i8 |= M.p(j5) ? 256 : 128;
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                    i11 = i29;
                } else {
                    i11 = i29;
                    if ((i5 & 3072) == 0) {
                        i8 |= M.p(j2) ? 2048 : 1024;
                    }
                }
                int i30 = i8 | 24576;
                i12 = i7 & 32;
                if (i12 != 0) {
                    i30 = i8 | 221184;
                } else if ((196608 & i5) == 0) {
                    b6sVar2 = b6sVar;
                    i30 |= M.J(b6sVar2) ? 131072 : 65536;
                    i13 = i7 & 64;
                    if (i13 == 0) {
                        i30 |= 1572864;
                        v4sVar2 = v4sVar;
                    } else {
                        v4sVar2 = v4sVar;
                        if ((i5 & 1572864) == 0) {
                            i30 |= M.J(v4sVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                    }
                    i14 = i30 | 918552576;
                    if ((i7 & 1024) != 0) {
                        i15 = i;
                        if (M.o(i15)) {
                            i16 = 4;
                            int i31 = i6 | i16;
                            i17 = i7 & 2048;
                            if (i17 != 0) {
                                i31 |= 48;
                                j6 = j4;
                            } else {
                                j6 = j4;
                                if ((i6 & 48) == 0) {
                                    i31 |= M.p(j6) ? 32 : 16;
                                }
                            }
                            int i32 = i31 | 1795456;
                            i18 = i7 & 131072;
                            if (i18 != 0) {
                                i32 = i31 | 14378368;
                            } else if ((i6 & 12582912) == 0) {
                                i32 |= M.o(i4) ? 8388608 : 4194304;
                            }
                            i19 = i32 | 100663296 | (((i7 & 524288) == 0 || !M.J(frv0Var)) ? 268435456 : SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                            int i33 = 0;
                            int i34 = 1;
                            if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 306783379) != 306783378)) {
                                M.V();
                                if ((i5 & 1) == 0 || M.i()) {
                                    if (i11 != 0) {
                                        q630Var2 = q630.a.a;
                                    }
                                    j11 = i9 != 0 ? l5g.k : j5;
                                    long j15 = i10 != 0 ? fno0.c : j2;
                                    if (i12 != 0) {
                                        b6sVar2 = null;
                                    }
                                    if (i13 != 0) {
                                        v4sVar2 = null;
                                    }
                                    j12 = fno0.c;
                                    if ((i7 & 1024) != 0) {
                                        i19 &= -15;
                                    } else {
                                        i33 = i15;
                                    }
                                    int i35 = i19;
                                    if (i17 != 0) {
                                        j6 = j12;
                                    }
                                    t7z t7zVar4 = t7z.d;
                                    int i36 = i35 & (-7169);
                                    int i37 = i18 != 0 ? Integer.MAX_VALUE : i4;
                                    Object x = M.x();
                                    if (x == a.C0011a.a) {
                                        x = new uqv0(0);
                                        M.R(x);
                                    }
                                    izs izsVar4 = (izs) x;
                                    if ((i7 & 524288) != 0) {
                                        int i38 = i35 & (-1879055361);
                                        izsVar3 = izsVar4;
                                        t7zVar3 = t7zVar4;
                                        b6sVar4 = b6sVar2;
                                        q630Var4 = q630Var2;
                                        v4sVar4 = v4sVar2;
                                        frv0Var3 = (frv0) M.r(grv0.a);
                                        long j16 = j6;
                                        i25 = i38;
                                        j13 = j15;
                                        i26 = 221184;
                                        i27 = i37;
                                        j14 = j16;
                                        i24 = 1;
                                        z3 = true;
                                    } else {
                                        izsVar3 = izsVar4;
                                        t7zVar3 = t7zVar4;
                                        i24 = 1;
                                        z3 = true;
                                        b6sVar4 = b6sVar2;
                                        q630Var4 = q630Var2;
                                        v4sVar4 = v4sVar2;
                                        frv0Var3 = frv0Var;
                                        long j17 = j6;
                                        i25 = i36;
                                        j13 = j15;
                                        i26 = 221184;
                                        i27 = i37;
                                        j14 = j17;
                                    }
                                } else {
                                    M.h();
                                    if ((i7 & 1024) != 0) {
                                        i19 &= -15;
                                    }
                                    int i39 = i19;
                                    int i40 = i39 & (-7169);
                                    if ((i7 & 524288) != 0) {
                                        i40 = i39 & (-1879055361);
                                    }
                                    j12 = j3;
                                    t7zVar3 = t7zVar;
                                    i24 = i2;
                                    z3 = z;
                                    i34 = i3;
                                    izsVar3 = izsVar;
                                    frv0Var3 = frv0Var;
                                    j14 = j6;
                                    i33 = i15;
                                    i25 = i40;
                                    j11 = j5;
                                    i26 = 221184;
                                    i27 = i4;
                                    b6sVar4 = b6sVar2;
                                    q630Var4 = q630Var2;
                                    v4sVar4 = v4sVar2;
                                    j13 = j2;
                                }
                                M.S();
                                if (androidx.compose.runtime.b.d()) {
                                    i28 = i26;
                                    androidx.compose.runtime.b.f(1581249774, i14, i25, "com.vk.core.compose.component.VkCustomText (VkText.kt:159)");
                                } else {
                                    i28 = i26;
                                }
                                t7z t7zVar5 = t7zVar3;
                                int i41 = i33;
                                nmo0 d = frv0Var3.a.d(new nmo0(j11, j13, b6sVar4, v4sVar4, j12, null, null, i41, j14, null, t7zVar5, 0, 13455184));
                                long j18 = j11;
                                long j19 = j12;
                                int i42 = i34;
                                izs izsVar5 = izsVar3;
                                aVar2 = M;
                                djo0.b(frv0Var3.b ? str.toUpperCase(Locale.ROOT) : str, q630Var4, j18, j13, b6sVar4, v4sVar4, j19, null, new obo0(i41), j14, i24, z3, i27, i42, izsVar5, d, aVar2, (i14 & 268435440) | ((i25 << 27) & 1879048192), ((i25 >> 3) & 14) | Tensorflow.FRAME_WIDTH | ((i25 >> 12) & 7168) | i28, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630Var3 = q630Var4;
                                i20 = i24;
                                i22 = i27;
                                t7zVar2 = t7zVar5;
                                frv0Var2 = frv0Var3;
                                j7 = j18;
                                j10 = j13;
                                b6sVar3 = b6sVar4;
                                v4sVar3 = v4sVar4;
                                j9 = j19;
                                j8 = j14;
                                z2 = z3;
                                i21 = i42;
                                izsVar2 = izsVar5;
                                i23 = i41;
                            } else {
                                aVar2 = M;
                                aVar2.h();
                                i20 = i2;
                                z2 = z;
                                i21 = i3;
                                i22 = i4;
                                izsVar2 = izsVar;
                                frv0Var2 = frv0Var;
                                q630Var3 = q630Var2;
                                j7 = j5;
                                t7zVar2 = t7zVar;
                                j8 = j6;
                                v4sVar3 = v4sVar2;
                                i23 = i15;
                                j9 = j3;
                                b6sVar3 = b6sVar2;
                                j10 = j2;
                            }
                            s = aVar2.s();
                            if (s != null) {
                                s.d = new wzs() { // from class: xsna.vqv0
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int I = ne7.I(i5 | 1);
                                        int I2 = ne7.I(i6);
                                        yqv0.a(str, q630Var3, j7, j10, b6sVar3, v4sVar3, j9, i23, j8, t7zVar2, i20, z2, i21, i22, izsVar2, frv0Var2, (androidx.compose.runtime.a) obj, I, I2, i7);
                                        return s3q0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                    } else {
                        i15 = i;
                    }
                    i16 = 2;
                    int i312 = i6 | i16;
                    i17 = i7 & 2048;
                    if (i17 != 0) {
                    }
                    int i322 = i312 | 1795456;
                    i18 = i7 & 131072;
                    if (i18 != 0) {
                    }
                    i19 = i322 | 100663296 | (((i7 & 524288) == 0 || !M.J(frv0Var)) ? 268435456 : SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                    int i332 = 0;
                    int i342 = 1;
                    if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 306783379) != 306783378)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                b6sVar2 = b6sVar;
                i13 = i7 & 64;
                if (i13 == 0) {
                }
                i14 = i30 | 918552576;
                if ((i7 & 1024) != 0) {
                }
                i16 = 2;
                int i3122 = i6 | i16;
                i17 = i7 & 2048;
                if (i17 != 0) {
                }
                int i3222 = i3122 | 1795456;
                i18 = i7 & 131072;
                if (i18 != 0) {
                }
                i19 = i3222 | 100663296 | (((i7 & 524288) == 0 || !M.J(frv0Var)) ? 268435456 : SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                int i3322 = 0;
                int i3422 = 1;
                if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 306783379) != 306783378)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            j5 = j;
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            int i302 = i8 | 24576;
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            b6sVar2 = b6sVar;
            i13 = i7 & 64;
            if (i13 == 0) {
            }
            i14 = i302 | 918552576;
            if ((i7 & 1024) != 0) {
            }
            i16 = 2;
            int i31222 = i6 | i16;
            i17 = i7 & 2048;
            if (i17 != 0) {
            }
            int i32222 = i31222 | 1795456;
            i18 = i7 & 131072;
            if (i18 != 0) {
            }
            i19 = i32222 | 100663296 | (((i7 & 524288) == 0 || !M.J(frv0Var)) ? 268435456 : SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            int i33222 = 0;
            int i34222 = 1;
            if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 306783379) != 306783378)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        j5 = j;
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        int i3022 = i8 | 24576;
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        b6sVar2 = b6sVar;
        i13 = i7 & 64;
        if (i13 == 0) {
        }
        i14 = i3022 | 918552576;
        if ((i7 & 1024) != 0) {
        }
        i16 = 2;
        int i312222 = i6 | i16;
        i17 = i7 & 2048;
        if (i17 != 0) {
        }
        int i322222 = i312222 | 1795456;
        i18 = i7 & 131072;
        if (i18 != 0) {
        }
        i19 = i322222 | 100663296 | (((i7 & 524288) == 0 || !M.J(frv0Var)) ? 268435456 : SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        int i332222 = 0;
        int i342222 = 1;
        if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 306783379) != 306783378)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final us2 us2Var, q630 q630Var, final long j, long j2, long j3, long j4, int i, boolean z, int i2, izs izsVar, Map map, final frv0 frv0Var, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        us2 us2Var2;
        int i6;
        q630 q630Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        long j5;
        int i11;
        int i12;
        long j6;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.a aVar2;
        final long j7;
        final izs izsVar2;
        final Map map2;
        final long j8;
        final long j9;
        final q630 q630Var3;
        final int i21;
        final boolean z2;
        final int i22;
        androidx.compose.runtime.f s;
        izs izsVar3;
        int i23;
        Map map3;
        int i24;
        boolean z3;
        int i25;
        androidx.compose.runtime.a M = aVar.M(-37713797);
        if ((i3 & 6) == 0) {
            us2Var2 = us2Var;
            i6 = (M.J(us2Var2) ? 4 : 2) | i3;
        } else {
            us2Var2 = us2Var;
            i6 = i3;
        }
        int i26 = i5 & 2;
        if (i26 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            q630Var2 = q630Var;
            i6 |= M.J(q630Var2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i6 |= M.p(j) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i8 = i6 | 3072;
            } else {
                int i27 = i6;
                if ((i3 & 3072) == 0) {
                    i27 |= M.p(j2) ? 2048 : 1024;
                }
                i8 = i27;
            }
            if ((i5 & 16) == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i8 |= M.J(null) ? 16384 : 8192;
            }
            if ((i5 & 32) == 0) {
                i8 |= 196608;
            } else if ((i3 & 196608) == 0) {
                i8 |= M.J(null) ? 131072 : 65536;
            }
            if ((i5 & 64) == 0) {
                i8 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i8 |= M.J(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i9 = i5 & 128;
            if (i9 == 0) {
                i8 |= 12582912;
                i10 = i9;
                j5 = j3;
            } else {
                i10 = i9;
                j5 = j3;
                if ((i3 & 12582912) == 0) {
                    i8 |= M.p(j5) ? 8388608 : 4194304;
                }
            }
            if ((i5 & 256) == 0) {
                i8 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                i8 |= M.J(null) ? 67108864 : 33554432;
            }
            if ((i5 & 512) == 0) {
                i8 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i8 |= M.J(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            if ((i4 & 6) != 0) {
                i11 = i4 | (((i5 & 1024) == 0 && M.o(0)) ? 4 : 2);
            } else {
                i11 = i4;
            }
            i12 = i5 & 2048;
            if (i12 == 0) {
                i11 |= 48;
                j6 = j4;
            } else {
                j6 = j4;
                if ((i4 & 48) == 0) {
                    i11 |= M.p(j6) ? 32 : 16;
                }
            }
            int i28 = i11 | 384;
            i13 = i5 & 8192;
            if (i13 == 0) {
                i14 = i13;
                i15 = i11 | 3456;
            } else if ((i4 & 3072) == 0) {
                i14 = i13;
                i15 = i28 | (M.o(i) ? 2048 : 1024);
            } else {
                i14 = i13;
                i15 = i28;
            }
            i16 = i5 & 16384;
            if (i16 == 0) {
                i17 = i15 | 24576;
            } else {
                i17 = i15;
                if ((i4 & 24576) == 0) {
                    i17 |= M.l(z) ? 16384 : 8192;
                    i18 = i5 & 32768;
                    if (i18 != 0) {
                        i17 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i17 |= M.o(i2) ? 131072 : 65536;
                    }
                    i19 = i17 | 1572864;
                    i20 = i5 & 131072;
                    if (i20 != 0) {
                        i19 = i17 | 14155776;
                    } else if ((i4 & 12582912) == 0) {
                        i19 |= M.y(map) ? 8388608 : 4194304;
                    }
                    if ((i4 & 100663296) == 0) {
                        i19 |= M.J(frv0Var) ? 67108864 : 33554432;
                    }
                    if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i19 & 38347923) != 38347922)) {
                        M.V();
                        if ((i3 & 1) == 0 || M.i()) {
                            if (i26 != 0) {
                                q630Var2 = q630.a.a;
                            }
                            long j10 = i7 != 0 ? fno0.c : j2;
                            long j11 = i10 != 0 ? fno0.c : j5;
                            if ((i5 & 1024) != 0) {
                                i19 &= -15;
                            }
                            if (i12 != 0) {
                                j6 = fno0.c;
                            }
                            int i29 = i14 != 0 ? 1 : i;
                            boolean z4 = i16 == 0 ? z : true;
                            int i30 = i18 != 0 ? Integer.MAX_VALUE : i2;
                            j2 = j10;
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = new tdk0(10);
                                M.R(x);
                            }
                            int i31 = i19;
                            izsVar3 = (izs) x;
                            i23 = i31;
                            map3 = i20 != 0 ? jgp.b : map;
                            i24 = i29;
                            z3 = z4;
                            i25 = i30;
                            j5 = j11;
                        } else {
                            M.h();
                            if ((i5 & 1024) != 0) {
                                i19 &= -15;
                            }
                            i24 = i;
                            z3 = z;
                            i25 = i2;
                            map3 = map;
                            i23 = i19;
                            izsVar3 = izsVar;
                        }
                        long j12 = j6;
                        long j13 = j2;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-37713797, i8, i23, "com.vk.core.compose.component.VkCustomText (VkText.kt:227)");
                        }
                        us2 d = frv0Var.b ? zs2.d(us2Var2) : us2Var2;
                        q630 q630Var4 = q630Var2;
                        int i32 = (268435440 & i8) | ((i23 << 27) & 1879048192);
                        int i33 = i23 >> 6;
                        aVar2 = M;
                        djo0.c(d, q630Var4, j, j13, j5, new obo0(0), j12, i24, z3, i25, 0, map3, izsVar3, nmo0.a(frv0Var.a, 0L, 0L, null, null, 0L, 0L, null, null, 14671871), aVar2, i32, ((i23 >> 3) & 14) | (i33 & 112) | (i33 & 896) | (i33 & 7168) | (i33 & 458752) | (i23 & 3670016), 16384);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var4;
                        j7 = j13;
                        j9 = j5;
                        j8 = j12;
                        i21 = i24;
                        z2 = z3;
                        i22 = i25;
                        map2 = map3;
                        izsVar2 = izsVar3;
                    } else {
                        aVar2 = M;
                        aVar2.h();
                        j7 = j2;
                        izsVar2 = izsVar;
                        map2 = map;
                        j8 = j6;
                        j9 = j5;
                        q630Var3 = q630Var2;
                        i21 = i;
                        z2 = z;
                        i22 = i2;
                    }
                    s = aVar2.s();
                    if (s != null) {
                        s.d = new wzs() { // from class: xsna.xqv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int I = ne7.I(i3 | 1);
                                int I2 = ne7.I(i4);
                                yqv0.b(us2.this, q630Var3, j, j7, j9, j8, i21, z2, i22, izsVar2, map2, frv0Var, (androidx.compose.runtime.a) obj, I, I2, i5);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
            }
            i18 = i5 & 32768;
            if (i18 != 0) {
            }
            i19 = i17 | 1572864;
            i20 = i5 & 131072;
            if (i20 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i19 & 38347923) != 38347922)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i3 & 384) == 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        if ((i5 & 16) == 0) {
        }
        if ((i5 & 32) == 0) {
        }
        if ((i5 & 64) == 0) {
        }
        i9 = i5 & 128;
        if (i9 == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if ((i5 & 512) == 0) {
        }
        if ((i4 & 6) != 0) {
        }
        i12 = i5 & 2048;
        if (i12 == 0) {
        }
        int i282 = i11 | 384;
        i13 = i5 & 8192;
        if (i13 == 0) {
        }
        i16 = i5 & 16384;
        if (i16 == 0) {
        }
        i18 = i5 & 32768;
        if (i18 != 0) {
        }
        i19 = i17 | 1572864;
        i20 = i5 & 131072;
        if (i20 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i19 & 38347923) != 38347922)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, q630 q630Var, long j, pdo0 pdo0Var, v4j0 v4j0Var, int i, int i2, t7z t7zVar, int i3, boolean z, int i4, int i5, izs<? super ljo0, s3q0> izsVar, frv0 frv0Var, androidx.compose.runtime.a aVar, final int i6, final int i7, final int i8) {
        int i9;
        q630 q630Var2;
        int i10;
        int i11;
        long j2;
        int i12;
        pdo0 pdo0Var2;
        int i13;
        v4j0 v4j0Var2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        androidx.compose.runtime.a aVar2;
        final izs<? super ljo0, s3q0> izsVar2;
        final pdo0 pdo0Var3;
        final long j3;
        final v4j0 v4j0Var3;
        final int i28;
        final q630 q630Var3;
        final int i29;
        final t7z t7zVar2;
        final int i30;
        final boolean z2;
        final int i31;
        final int i32;
        final frv0 frv0Var2;
        androidx.compose.runtime.f s;
        t7z t7zVar3;
        boolean z3;
        int i33;
        izs<? super ljo0, s3q0> izsVar3;
        v4j0 v4j0Var4;
        izs<? super ljo0, s3q0> izsVar4;
        pdo0 pdo0Var4;
        long j4;
        t7z t7zVar4;
        int i34;
        int i35;
        int i36;
        int i37;
        frv0 frv0Var3;
        int i38;
        int i39;
        q630 q630Var4;
        int i40;
        int i41;
        androidx.compose.runtime.a M = aVar.M(425408092);
        if ((i6 & 6) == 0) {
            i9 = (M.J(str) ? 4 : 2) | i6;
        } else {
            i9 = i6;
        }
        int i42 = i8 & 2;
        if (i42 != 0) {
            i9 |= 48;
        } else if ((i6 & 48) == 0) {
            q630Var2 = q630Var;
            i9 |= M.J(q630Var2) ? 32 : 16;
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= 384;
                i11 = i42;
                j2 = j;
            } else {
                i11 = i42;
                j2 = j;
                if ((i6 & 384) == 0) {
                    i9 |= M.p(j2) ? 256 : 128;
                }
            }
            i12 = i8 & 8;
            int i43 = 1024;
            if (i12 == 0) {
                i9 |= 3072;
            } else if ((i6 & 3072) == 0) {
                pdo0Var2 = pdo0Var;
                i9 |= M.J(pdo0Var2) ? 2048 : 1024;
                i13 = i8 & 16;
                if (i13 != 0) {
                    i9 |= 24576;
                } else if ((i6 & 24576) == 0) {
                    v4j0Var2 = v4j0Var;
                    i9 |= M.J(v4j0Var2) ? 16384 : 8192;
                    i14 = i8 & 32;
                    if (i14 == 0) {
                        i9 |= 196608;
                        i15 = i;
                    } else {
                        i15 = i;
                        if ((i6 & 196608) == 0) {
                            i9 |= M.o(i15) ? 131072 : 65536;
                        }
                    }
                    if ((i6 & 1572864) != 0) {
                        i16 = i2;
                        i9 |= ((i8 & 64) == 0 && M.o(i16)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    } else {
                        i16 = i2;
                    }
                    if ((i6 & 12582912) == 0) {
                        if ((i8 & 128) == 0) {
                            if ((16777216 & i6) == 0 ? M.J(t7zVar) : M.y(t7zVar)) {
                                i41 = 8388608;
                                i9 |= i41;
                            }
                        }
                        i41 = 4194304;
                        i9 |= i41;
                    }
                    i17 = i8 & 256;
                    if (i17 == 0) {
                        i9 |= 100663296;
                    } else if ((i6 & 100663296) == 0) {
                        i9 |= M.o(i3) ? 67108864 : 33554432;
                    }
                    i18 = i8 & 512;
                    if (i18 == 0) {
                        i9 |= 805306368;
                    } else if ((i6 & 805306368) == 0) {
                        i19 = i18;
                        i9 |= M.l(z) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        i20 = i8 & 1024;
                        if (i20 != 0) {
                            i22 = i7 | 6;
                            i21 = i20;
                        } else if ((i7 & 6) == 0) {
                            i21 = i20;
                            i22 = i7 | (M.o(i4) ? 4 : 2);
                        } else {
                            i21 = i20;
                            i22 = i7;
                        }
                        i23 = i8 & 2048;
                        if (i23 != 0) {
                            i22 |= 48;
                            i24 = i23;
                        } else if ((i7 & 48) == 0) {
                            i24 = i23;
                            i22 |= M.o(i5) ? 32 : 16;
                        } else {
                            i24 = i23;
                        }
                        int i44 = i22;
                        i25 = i8 & 4096;
                        if (i25 != 0) {
                            i26 = i44 | 384;
                        } else if ((i7 & 384) == 0) {
                            i26 = i44 | (M.y(izsVar) ? 256 : 128);
                        } else {
                            i26 = i44;
                        }
                        if ((i7 & 3072) == 0) {
                            if ((i8 & 8192) == 0 && M.J(frv0Var)) {
                                i43 = 2048;
                            }
                            i26 |= i43;
                        }
                        i27 = i26;
                        if (M.t(i9 & 1, (i9 & 306783379) == 306783378 || (i27 & 1171) != 1170)) {
                            M.V();
                            if ((i6 & 1) == 0 || M.i()) {
                                if (i11 != 0) {
                                    q630Var2 = q630.a.a;
                                }
                                if (i10 != 0) {
                                    j2 = l5g.k;
                                }
                                if (i12 != 0) {
                                    pdo0Var2 = null;
                                }
                                v4j0 v4j0Var5 = i13 == 0 ? v4j0Var2 : null;
                                if (i14 != 0) {
                                    i15 = 0;
                                }
                                if ((i8 & 64) != 0) {
                                    i9 &= -3670017;
                                    i16 = 0;
                                }
                                if ((i8 & 128) != 0) {
                                    t7zVar3 = t7z.d;
                                    i9 = (-29360129) & i9;
                                } else {
                                    t7zVar3 = t7zVar;
                                }
                                int i45 = i17 != 0 ? 1 : i3;
                                z3 = i19 != 0 ? true : z;
                                int i46 = i21 == 0 ? i4 : 1;
                                int i47 = i24 != 0 ? Integer.MAX_VALUE : i5;
                                v4j0 v4j0Var6 = v4j0Var5;
                                if (i25 != 0) {
                                    Object x = M.x();
                                    i33 = i45;
                                    if (x == a.C0011a.a) {
                                        x = new qit0(3);
                                        M.R(x);
                                    }
                                    izsVar3 = (izs) x;
                                } else {
                                    i33 = i45;
                                    izsVar3 = izsVar;
                                }
                                if ((i8 & 8192) != 0) {
                                    v4j0Var4 = v4j0Var6;
                                    izsVar4 = izsVar3;
                                    pdo0Var4 = pdo0Var2;
                                    j4 = j2;
                                    t7zVar4 = t7zVar3;
                                    i34 = i15;
                                    i36 = i16;
                                    i37 = i46;
                                    i38 = i27 & (-7169);
                                    frv0Var3 = (frv0) M.r(grv0.a);
                                    i39 = i9;
                                    q630Var4 = q630Var2;
                                    i35 = i47;
                                } else {
                                    v4j0Var4 = v4j0Var6;
                                    izsVar4 = izsVar3;
                                    pdo0Var4 = pdo0Var2;
                                    j4 = j2;
                                    t7zVar4 = t7zVar3;
                                    i34 = i15;
                                    i35 = i47;
                                    i36 = i16;
                                    i37 = i46;
                                    frv0Var3 = frv0Var;
                                    i38 = i27;
                                    i39 = i9;
                                    q630Var4 = q630Var2;
                                }
                                i40 = i33;
                            } else {
                                M.h();
                                if ((i8 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                if ((i8 & 128) != 0) {
                                    i9 &= -29360129;
                                }
                                if ((i8 & 8192) != 0) {
                                    i27 &= -7169;
                                }
                                t7zVar4 = t7zVar;
                                z3 = z;
                                i37 = i4;
                                i35 = i5;
                                izsVar4 = izsVar;
                                pdo0Var4 = pdo0Var2;
                                j4 = j2;
                                v4j0Var4 = v4j0Var2;
                                i34 = i15;
                                i36 = i16;
                                frv0Var3 = frv0Var;
                                i38 = i27;
                                i39 = i9;
                                q630Var4 = q630Var2;
                                i40 = i3;
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(425408092, i39, i38, "com.vk.core.compose.component.VkText (VkText.kt:53)");
                            }
                            frv0 frv0Var4 = frv0Var3;
                            long j5 = j4;
                            int i48 = i38;
                            int i49 = i39;
                            pdo0 pdo0Var5 = pdo0Var4;
                            int i50 = i40;
                            int i51 = i37;
                            int i52 = i35;
                            v4j0 v4j0Var7 = v4j0Var4;
                            int i53 = i36;
                            t7z t7zVar5 = t7zVar4;
                            int i54 = i34;
                            nmo0 d = frv0Var3.a.d(new nmo0(j5, 0L, null, null, 0L, pdo0Var5, v4j0Var4, i36, 0L, null, t7zVar4, i34, 13586430));
                            boolean z4 = z3;
                            izs<? super ljo0, s3q0> izsVar5 = izsVar4;
                            aVar2 = M;
                            djo0.b(frv0Var4.b ? str.toUpperCase(Locale.ROOT) : str, q630Var4, j5, 0L, null, null, 0L, pdo0Var5, new obo0(i53), 0L, i50, z4, i52, i51, izsVar5, d, aVar2, (i49 & 1008) | ((i49 << 15) & 234881024) | ((i49 << 9) & 1879048192), ((i49 >> 21) & 1008) | ((i48 << 6) & 7168) | ((i48 << 12) & 57344) | (458752 & (i48 << 9)), 1272);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            i29 = i53;
                            frv0Var2 = frv0Var4;
                            q630Var3 = q630Var4;
                            j3 = j5;
                            pdo0Var3 = pdo0Var5;
                            i30 = i50;
                            z2 = z4;
                            i32 = i52;
                            i31 = i51;
                            izsVar2 = izsVar5;
                            v4j0Var3 = v4j0Var7;
                            i28 = i54;
                            t7zVar2 = t7zVar5;
                        } else {
                            aVar2 = M;
                            aVar2.h();
                            izsVar2 = izsVar;
                            pdo0Var3 = pdo0Var2;
                            j3 = j2;
                            v4j0Var3 = v4j0Var2;
                            i28 = i15;
                            q630Var3 = q630Var2;
                            i29 = i16;
                            t7zVar2 = t7zVar;
                            i30 = i3;
                            z2 = z;
                            i31 = i4;
                            i32 = i5;
                            frv0Var2 = frv0Var;
                        }
                        s = aVar2.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.tqv0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int I = ne7.I(i6 | 1);
                                    int I2 = ne7.I(i7);
                                    yqv0.c(str, q630Var3, j3, pdo0Var3, v4j0Var3, i28, i29, t7zVar2, i30, z2, i31, i32, izsVar2, frv0Var2, (androidx.compose.runtime.a) obj, I, I2, i8);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i19 = i18;
                    i20 = i8 & 1024;
                    if (i20 != 0) {
                    }
                    i23 = i8 & 2048;
                    if (i23 != 0) {
                    }
                    int i442 = i22;
                    i25 = i8 & 4096;
                    if (i25 != 0) {
                    }
                    if ((i7 & 3072) == 0) {
                    }
                    i27 = i26;
                    if (M.t(i9 & 1, (i9 & 306783379) == 306783378 || (i27 & 1171) != 1170)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                v4j0Var2 = v4j0Var;
                i14 = i8 & 32;
                if (i14 == 0) {
                }
                if ((i6 & 1572864) != 0) {
                }
                if ((i6 & 12582912) == 0) {
                }
                i17 = i8 & 256;
                if (i17 == 0) {
                }
                i18 = i8 & 512;
                if (i18 == 0) {
                }
                i19 = i18;
                i20 = i8 & 1024;
                if (i20 != 0) {
                }
                i23 = i8 & 2048;
                if (i23 != 0) {
                }
                int i4422 = i22;
                i25 = i8 & 4096;
                if (i25 != 0) {
                }
                if ((i7 & 3072) == 0) {
                }
                i27 = i26;
                if (M.t(i9 & 1, (i9 & 306783379) == 306783378 || (i27 & 1171) != 1170)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            pdo0Var2 = pdo0Var;
            i13 = i8 & 16;
            if (i13 != 0) {
            }
            v4j0Var2 = v4j0Var;
            i14 = i8 & 32;
            if (i14 == 0) {
            }
            if ((i6 & 1572864) != 0) {
            }
            if ((i6 & 12582912) == 0) {
            }
            i17 = i8 & 256;
            if (i17 == 0) {
            }
            i18 = i8 & 512;
            if (i18 == 0) {
            }
            i19 = i18;
            i20 = i8 & 1024;
            if (i20 != 0) {
            }
            i23 = i8 & 2048;
            if (i23 != 0) {
            }
            int i44222 = i22;
            i25 = i8 & 4096;
            if (i25 != 0) {
            }
            if ((i7 & 3072) == 0) {
            }
            i27 = i26;
            if (M.t(i9 & 1, (i9 & 306783379) == 306783378 || (i27 & 1171) != 1170)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        i12 = i8 & 8;
        int i432 = 1024;
        if (i12 == 0) {
        }
        pdo0Var2 = pdo0Var;
        i13 = i8 & 16;
        if (i13 != 0) {
        }
        v4j0Var2 = v4j0Var;
        i14 = i8 & 32;
        if (i14 == 0) {
        }
        if ((i6 & 1572864) != 0) {
        }
        if ((i6 & 12582912) == 0) {
        }
        i17 = i8 & 256;
        if (i17 == 0) {
        }
        i18 = i8 & 512;
        if (i18 == 0) {
        }
        i19 = i18;
        i20 = i8 & 1024;
        if (i20 != 0) {
        }
        i23 = i8 & 2048;
        if (i23 != 0) {
        }
        int i442222 = i22;
        i25 = i8 & 4096;
        if (i25 != 0) {
        }
        if ((i7 & 3072) == 0) {
        }
        i27 = i26;
        if (M.t(i9 & 1, (i9 & 306783379) == 306783378 || (i27 & 1171) != 1170)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final us2 us2Var, q630 q630Var, long j, int i, t7z t7zVar, int i2, boolean z, int i3, izs izsVar, Map map, frv0 frv0Var, androidx.compose.runtime.a aVar, final int i4, final int i5, final int i6) {
        int i7;
        q630 q630Var2;
        int i8;
        int i9;
        long j2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        androidx.compose.runtime.a aVar2;
        final int i23;
        final long j3;
        final t7z t7zVar2;
        final boolean z2;
        final Map map2;
        final frv0 frv0Var2;
        final int i24;
        final q630 q630Var3;
        final int i25;
        final izs izsVar2;
        androidx.compose.runtime.f s;
        t7z t7zVar3;
        int i26;
        izs izsVar3;
        Map map3;
        int i27;
        boolean z3;
        long j4;
        int i28;
        q630 q630Var4;
        frv0 frv0Var3;
        t7z t7zVar4;
        int i29;
        int i30;
        androidx.compose.runtime.a M = aVar.M(-1834531759);
        if ((i4 & 6) == 0) {
            i7 = (M.J(us2Var) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            q630Var2 = q630Var;
            i7 |= M.J(q630Var2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i9 = i7 | 384;
                j2 = j;
            } else {
                i9 = i7;
                j2 = j;
                if ((i4 & 384) == 0) {
                    i9 |= M.p(j2) ? 256 : 128;
                }
            }
            i10 = i9 | 224256;
            if ((i4 & 1572864) != 0) {
                i11 = i;
                i10 |= ((i6 & 64) == 0 && M.o(i11)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            } else {
                i11 = i;
            }
            if ((i4 & 12582912) == 0) {
                if ((i6 & 128) == 0) {
                    if ((16777216 & i4) == 0 ? M.J(t7zVar) : M.y(t7zVar)) {
                        i30 = 8388608;
                        i10 |= i30;
                    }
                }
                i30 = 4194304;
                i10 |= i30;
            }
            i12 = i6 & 256;
            if (i12 == 0) {
                i10 |= 100663296;
                i13 = i2;
            } else {
                i13 = i2;
                if ((i4 & 100663296) == 0) {
                    i10 |= M.o(i13) ? 67108864 : 33554432;
                }
            }
            i14 = i6 & 512;
            if (i14 == 0) {
                i10 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i10 |= M.l(z) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            i15 = i6 & 1024;
            if (i15 == 0) {
                i17 = i5 | 6;
                i16 = i15;
            } else if ((i5 & 6) == 0) {
                i16 = i15;
                i17 = i5 | (M.o(i3) ? 4 : 2);
            } else {
                i16 = i15;
                i17 = i5;
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
                i17 |= 48;
                i19 = i18;
            } else if ((i5 & 48) == 0) {
                i19 = i18;
                i17 |= M.y(izsVar) ? 32 : 16;
            } else {
                i19 = i18;
            }
            int i32 = i17;
            i20 = i6 & 4096;
            if (i20 == 0) {
                i21 = i32 | 384;
            } else if ((i5 & 384) == 0) {
                i21 = i32 | (M.y(map) ? 256 : 128);
            } else {
                i21 = i32;
            }
            if ((i5 & 3072) == 0) {
                if ((i6 & 8192) == 0 && M.J(frv0Var)) {
                    i29 = 2048;
                    i21 |= i29;
                }
                i29 = 1024;
                i21 |= i29;
            }
            i22 = i21;
            int i33 = 0;
            if (M.t(i10 & 1, (i10 & 306783379) == 306783378 || (i22 & 1171) != 1170)) {
                aVar2 = M;
                aVar2.h();
                long j5 = j2;
                i23 = i11;
                j3 = j5;
                t7zVar2 = t7zVar;
                z2 = z;
                map2 = map;
                frv0Var2 = frv0Var;
                i24 = i13;
                q630Var3 = q630Var2;
                i25 = i3;
                izsVar2 = izsVar;
            } else {
                M.V();
                if ((i4 & 1) == 0 || M.i()) {
                    q630 q630Var5 = i31 != 0 ? q630.a.a : q630Var2;
                    if (i8 != 0) {
                        j2 = l5g.k;
                    }
                    if ((i6 & 64) != 0) {
                        i10 &= -3670017;
                    } else {
                        i33 = i11;
                    }
                    if ((i6 & 128) != 0) {
                        t7zVar3 = t7z.d;
                        i10 &= -29360129;
                    } else {
                        t7zVar3 = t7zVar;
                    }
                    if (i12 != 0) {
                        i13 = 1;
                    }
                    boolean z4 = i14 == 0 ? z : true;
                    i26 = i16 != 0 ? Integer.MAX_VALUE : i3;
                    if (i19 != 0) {
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = new d220(28);
                            M.R(x);
                        }
                        izsVar3 = (izs) x;
                    } else {
                        izsVar3 = izsVar;
                    }
                    map3 = i20 != 0 ? jgp.b : map;
                    if ((i6 & 8192) != 0) {
                        frv0Var3 = (frv0) M.r(grv0.a);
                        q630 q630Var6 = q630Var5;
                        i27 = i22 & (-7169);
                        z3 = z4;
                        j4 = j2;
                        i28 = i10;
                        q630Var4 = q630Var6;
                    } else {
                        q630 q630Var7 = q630Var5;
                        i27 = i22;
                        z3 = z4;
                        j4 = j2;
                        i28 = i10;
                        q630Var4 = q630Var7;
                        frv0Var3 = frv0Var;
                    }
                    t7zVar4 = t7zVar3;
                    i11 = i33;
                } else {
                    M.h();
                    if ((i6 & 64) != 0) {
                        i10 &= -3670017;
                    }
                    if ((i6 & 128) != 0) {
                        i10 &= -29360129;
                    }
                    if ((i6 & 8192) != 0) {
                        i22 &= -7169;
                    }
                    t7zVar4 = t7zVar;
                    i26 = i3;
                    izsVar3 = izsVar;
                    map3 = map;
                    i27 = i22;
                    j4 = j2;
                    i28 = i10;
                    z3 = z;
                    q630Var4 = q630Var2;
                    frv0Var3 = frv0Var;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1834531759, i28, i27, "com.vk.core.compose.component.VkText (VkText.kt:111)");
                }
                t7zVar2 = t7zVar4;
                int i34 = i27 << 9;
                boolean z5 = z3;
                aVar2 = M;
                int i35 = i26;
                izs izsVar4 = izsVar3;
                Map map4 = map3;
                int i36 = i13;
                djo0.c(frv0Var3.b ? zs2.d(us2Var) : us2Var, q630Var4, j4, 0L, 0L, new obo0(i11), 0L, i36, z5, i35, 0, map4, izsVar4, nmo0.a(frv0Var3.a, 0L, 0L, null, null, 0L, 0L, null, t7zVar4, 13623295), aVar2, (i28 & 1008) | ((i28 << 15) & 234881024) | ((i28 << 9) & 1879048192), (i34 & 7168) | ((i28 >> 21) & 1008) | (458752 & i34) | ((i27 << 15) & 3670016), 17656);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i23 = i11;
                frv0Var2 = frv0Var3;
                q630Var3 = q630Var4;
                j3 = j4;
                i24 = i36;
                z2 = z5;
                i25 = i35;
                map2 = map4;
                izsVar2 = izsVar4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.wqv0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i4 | 1);
                        int I2 = ne7.I(i5);
                        yqv0.d(us2.this, q630Var3, j3, i23, t7zVar2, i24, z2, i25, izsVar2, map2, frv0Var2, (androidx.compose.runtime.a) obj, I, I2, i6);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i10 = i9 | 224256;
        if ((i4 & 1572864) != 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i14 = i6 & 512;
        if (i14 == 0) {
        }
        i15 = i6 & 1024;
        if (i15 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        int i322 = i17;
        i20 = i6 & 4096;
        if (i20 == 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        i22 = i21;
        int i332 = 0;
        if (M.t(i10 & 1, (i10 & 306783379) == 306783378 || (i22 & 1171) != 1170)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}

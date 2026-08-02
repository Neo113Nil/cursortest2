package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.b6u0;

/* compiled from: BasicTextField.kt */
/* loaded from: classes11.dex */
public final class wt6 {
    static {
        float f = 40;
        byc0.b(f, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final tho0 tho0Var, final izs izsVar, final q630 q630Var, boolean z, final boolean z2, final nmo0 nmo0Var, final rgy rgyVar, final uey ueyVar, final boolean z3, int i, int i2, b6u0 b6u0Var, izs izsVar2, final sg50 sg50Var, final rek0 rek0Var, yzs yzsVar, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final int i17;
        final b6u0 b6u0Var2;
        final izs izsVar3;
        final boolean z5;
        final int i18;
        androidx.compose.runtime.a aVar2;
        final yzs yzsVar2;
        androidx.compose.runtime.f s;
        int i19;
        b6u0 b6u0Var3;
        a.C0011a.C0012a c0012a;
        izs izsVar4;
        int i20;
        yzs yzsVar3;
        izs izsVar5;
        int i21;
        boolean z6;
        int i22;
        int i23;
        androidx.compose.runtime.a M = aVar.M(-971111025);
        if ((i3 & 6) == 0) {
            i6 = (M.J(tho0Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= M.J(q630Var) ? 256 : 128;
        }
        int i24 = i5 & 8;
        if (i24 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            z4 = z;
            i6 |= M.l(z4) ? 2048 : 1024;
            if ((i3 & 24576) == 0) {
                i6 |= M.l(z2) ? 16384 : 8192;
            }
            if ((i3 & 196608) == 0) {
                i6 |= M.J(nmo0Var) ? 131072 : 65536;
            }
            if ((i3 & 1572864) == 0) {
                i6 |= M.J(rgyVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if ((i3 & 12582912) == 0) {
                i6 |= M.J(ueyVar) ? 8388608 : 4194304;
            }
            if ((i3 & 100663296) == 0) {
                i6 |= M.l(z3) ? 67108864 : 33554432;
            }
            if ((i3 & 805306368) != 0) {
                if ((i5 & 512) == 0) {
                    i7 = i;
                    if (M.o(i7)) {
                        i23 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                        i6 |= i23;
                    }
                } else {
                    i7 = i;
                }
                i23 = 268435456;
                i6 |= i23;
            } else {
                i7 = i;
            }
            i8 = i5 & 1024;
            if (i8 == 0) {
                i10 = i4 | 6;
                i9 = i8;
            } else if ((i4 & 6) == 0) {
                i9 = i8;
                i10 = i4 | (M.o(i2) ? 4 : 2);
            } else {
                i9 = i8;
                i10 = i4;
            }
            i11 = i5 & 2048;
            if (i11 == 0) {
                i10 |= 48;
                i12 = i11;
            } else if ((i4 & 48) == 0) {
                i12 = i11;
                i10 |= M.J(b6u0Var) ? 32 : 16;
            } else {
                i12 = i11;
            }
            int i25 = i10;
            i13 = i5 & 4096;
            if (i13 == 0) {
                i14 = i25 | 384;
            } else if ((i4 & 384) == 0) {
                i14 = i25 | (M.y(izsVar2) ? 256 : 128);
            } else {
                i14 = i25;
            }
            if ((i4 & 3072) == 0) {
                i14 |= M.J(sg50Var) ? 2048 : 1024;
            }
            if ((i4 & 24576) == 0) {
                i14 |= M.J(rek0Var) ? 16384 : 8192;
            }
            i15 = i5 & 32768;
            if (i15 == 0) {
                i14 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i14 |= M.y(yzsVar) ? 131072 : 65536;
            }
            i16 = i14;
            if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (74899 & i16) != 74898)) {
                M.h();
                i17 = i2;
                b6u0Var2 = b6u0Var;
                izsVar3 = izsVar2;
                z5 = z4;
                i18 = i7;
                aVar2 = M;
                yzsVar2 = yzsVar;
            } else {
                M.V();
                int i26 = i3 & 1;
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (i26 == 0 || M.i()) {
                    if (i24 != 0) {
                        z4 = true;
                    }
                    if ((i5 & 512) != 0) {
                        i19 = z3 ? 1 : Integer.MAX_VALUE;
                        i6 &= -1879048193;
                    } else {
                        i19 = i7;
                    }
                    int i27 = i9 != 0 ? 1 : i2;
                    b6u0Var3 = i12 != 0 ? b6u0.a.a : b6u0Var;
                    int i28 = i19;
                    if (i13 != 0) {
                        Object x = M.x();
                        if (x == c0012a2) {
                            c0012a = c0012a2;
                            x = new nk(4);
                            M.R(x);
                        } else {
                            c0012a = c0012a2;
                        }
                        izsVar4 = (izs) x;
                    } else {
                        c0012a = c0012a2;
                        izsVar4 = izsVar2;
                    }
                    if (i15 != 0) {
                        i20 = i28;
                        izsVar5 = izsVar4;
                        yzsVar3 = c4g0.b;
                    } else {
                        i20 = i28;
                        yzsVar3 = yzsVar;
                        izsVar5 = izsVar4;
                    }
                    i21 = i6;
                    z6 = z4;
                    i22 = i27;
                } else {
                    M.h();
                    if ((i5 & 512) != 0) {
                        i6 &= -1879048193;
                    }
                    i22 = i2;
                    b6u0Var3 = b6u0Var;
                    izsVar5 = izsVar2;
                    yzsVar3 = yzsVar;
                    c0012a = c0012a2;
                    i21 = i6;
                    z6 = z4;
                    i20 = i7;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-971111025, i21, i16, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:933)");
                }
                rgyVar.getClass();
                int i29 = i21;
                int i30 = rgyVar.a;
                afy afyVar = new afy(i30);
                if (i30 == -1) {
                    afyVar = null;
                }
                int i31 = afyVar != null ? afyVar.a : 0;
                Boolean bool = rgyVar.b;
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                int i32 = rgyVar.c;
                ihy ihyVar = new ihy(i32);
                if (i32 == 0) {
                    ihyVar = null;
                }
                int i33 = ihyVar != null ? ihyVar.a : 1;
                int i34 = rgyVar.d;
                qnw qnwVar = i34 == -1 ? null : new qnw(i34);
                a.C0011a.C0012a c0012a3 = c0012a;
                rnw rnwVar = new rnw(z3, i31, booleanValue, i33, qnwVar != null ? qnwVar.a : 1, lwz.d);
                boolean z7 = !z3;
                int i35 = z3 ? 1 : i22;
                int i36 = z3 ? 1 : i20;
                boolean z8 = ((i29 & 14) == 4) | ((i29 & 112) == 32);
                Object x2 = M.x();
                if (z8 || x2 == c0012a3) {
                    x2 = new ut6(0, tho0Var, izsVar);
                    M.R(x2);
                }
                int i37 = i16 << 9;
                int i38 = (i29 & 910) | ((i29 >> 6) & 7168) | (i37 & 57344) | (i37 & 458752) | (i37 & 3670016) | (i37 & 29360128);
                int i39 = (i29 & 57344) | ((i29 >> 15) & 896) | (i29 & 7168) | (i16 & 458752);
                boolean z9 = z6;
                int i40 = i35;
                b6u0 b6u0Var4 = b6u0Var3;
                izs izsVar6 = izsVar5;
                kuj.a(tho0Var, (izs) x2, q630Var, nmo0Var, b6u0Var4, izsVar6, sg50Var, rek0Var, z7, i36, i40, rnwVar, ueyVar, z9, z2, yzsVar3, M, i38, i39);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b6u0Var2 = b6u0Var4;
                z5 = z9;
                aVar2 = M;
                i18 = i20;
                i17 = i22;
                izsVar3 = izsVar6;
                yzsVar2 = yzsVar3;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.vt6
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i3 | 1);
                        int I2 = ne7.I(i4);
                        wt6.a(tho0.this, izsVar, q630Var, z5, z2, nmo0Var, rgyVar, ueyVar, z3, i18, i17, b6u0Var2, izsVar3, sg50Var, rek0Var, yzsVar2, (androidx.compose.runtime.a) obj, I, I2, i5);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z4 = z;
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if ((i3 & 805306368) != 0) {
        }
        i8 = i5 & 1024;
        if (i8 == 0) {
        }
        i11 = i5 & 2048;
        if (i11 == 0) {
        }
        int i252 = i10;
        i13 = i5 & 4096;
        if (i13 == 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        i15 = i5 & 32768;
        if (i15 == 0) {
        }
        i16 = i14;
        if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (74899 & i16) != 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}

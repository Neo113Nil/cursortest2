package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.g8s;
import xsna.h8s;
import xsna.i8s;

/* compiled from: ReviewTextInputField.kt */
/* loaded from: classes18.dex */
public final class aig0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final x9k x9kVar, final String str, final String str2, final q630 q630Var, final String str3, final int i, int i2, final izs izsVar, final uey ueyVar, final rgy rgyVar, final boolean z, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        int i6;
        androidx.compose.runtime.a aVar2;
        final int i7;
        int i8;
        Object x;
        a.C0011a.C0012a c0012a;
        wh50 wh50Var;
        Object x2;
        androidx.compose.runtime.a aVar3;
        int i9;
        int i10;
        int i11;
        boolean z2;
        bly blyVar;
        boolean z3;
        Object x3;
        boolean z4;
        Object x4;
        androidx.compose.runtime.a M = aVar.M(896691067);
        if ((i3 & 6) == 0) {
            i5 = (M.J(x9kVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= M.J(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= M.l(false) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= M.J(str2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= M.J(str3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= M.o(i) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i12 = i4 & 128;
        if (i12 != 0) {
            i5 |= 12582912;
            i6 = i2;
        } else {
            i6 = i2;
            if ((i3 & 12582912) == 0) {
                i5 |= M.o(i6) ? 8388608 : 4194304;
            }
        }
        if ((i3 & 100663296) == 0) {
            i5 |= M.y(izsVar) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= M.J(ueyVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i13 = 6 | (M.l(z) ? 32 : 16);
        if (M.t(i5 & 1, ((i5 & 306783379) == 306783378 && (i13 & 19) == 18) ? false : true)) {
            M.V();
            if ((i3 & 1) != 0 && !M.i()) {
                M.h();
            } else if (i12 != 0) {
                i8 = Integer.MAX_VALUE;
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(896691067, i5, i13, "com.vk.ecomm.design.compose.inputfield.InputFieldForReviews (ReviewTextInputField.kt:65)");
                }
                x = M.x();
                c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(new tho0(x9kVar.a, 0L, 6));
                    M.R(x);
                }
                wh50Var = (wh50) x;
                x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new rwr();
                    M.R(x2);
                }
                rwr rwrVar = (rwr) x2;
                h2e0 h2e0Var = new h2e0(x9kVar.c);
                if (z) {
                    aVar3 = M;
                    i9 = i8;
                    i10 = 2048;
                    i11 = 3;
                    z2 = false;
                    aVar3.K(-1371958925);
                    aVar3.j();
                    blyVar = null;
                } else {
                    M.K(-1372245148);
                    int length = drm0.p0(((tho0) wh50Var.getValue()).a.c).toString().length();
                    int i14 = x9kVar.b;
                    Object x5 = M.x();
                    if (x5 == c0012a) {
                        i9 = i8;
                        x5 = new bws(17);
                        M.R(x5);
                    } else {
                        i9 = i8;
                    }
                    i11 = 3;
                    z2 = false;
                    i10 = 2048;
                    bly a = i8s.a.AbstractC3037a.C3038a.a(length, i14, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), M, 3072, 0);
                    aVar3 = M;
                    aVar3.j();
                    blyVar = a;
                }
                q630 d = jvi.d(q630Var, rwrVar);
                tho0 tho0Var = (tho0) wh50Var.getValue();
                z3 = (i5 & 7168) != i10 ? true : z2;
                x3 = aVar3.x();
                if (!z3 || x3 == c0012a) {
                    x3 = new b9t(str2, 1);
                    aVar3.R(x3);
                }
                com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x3, i11);
                z4 = ((i5 & 14) != 4 ? true : z2) | ((234881024 & i5) != 67108864 ? z2 : true);
                x4 = aVar3.x();
                if (!z4 || x4 == c0012a) {
                    x4 = new zo8(x9kVar, izsVar, wh50Var, 9);
                    aVar3.R(x4);
                }
                int i15 = i5 >> 6;
                int i16 = i9;
                androidx.compose.runtime.a aVar4 = aVar3;
                nvu0.a(g8s.e.a.a(tho0Var, (izs) x4, str3, null, i, i16, false, rgyVar, ueyVar, null, a2, aVar4, ((i5 >> 9) & 896) | (57344 & i15) | (i15 & 458752) | 100663296 | (1879048192 & i5), 24576, 7368), d, h8s.a.a(str, false, null, blyVar, null, aVar4, ((i5 >> 3) & 14) | 196608, 22), null, h2e0Var, aVar4, 0, 8);
                aVar2 = aVar4;
                if (oq.h(-1375272825, aVar2)) {
                    androidx.compose.runtime.b.e();
                }
                i7 = i16;
            }
            i8 = i6;
            M.S();
            if (androidx.compose.runtime.b.d()) {
            }
            x = M.x();
            c0012a = a.C0011a.a;
            if (x == c0012a) {
            }
            wh50Var = (wh50) x;
            x2 = M.x();
            if (x2 == c0012a) {
            }
            rwr rwrVar2 = (rwr) x2;
            h2e0 h2e0Var2 = new h2e0(x9kVar.c);
            if (z) {
            }
            q630 d2 = jvi.d(q630Var, rwrVar2);
            tho0 tho0Var2 = (tho0) wh50Var.getValue();
            if ((i5 & 7168) != i10) {
            }
            x3 = aVar3.x();
            if (!z3) {
            }
            x3 = new b9t(str2, 1);
            aVar3.R(x3);
            com.vk.core.compose.component.semantics.a a22 = com.vk.core.compose.component.semantics.b.a(null, (izs) x3, i11);
            z4 = ((i5 & 14) != 4 ? true : z2) | ((234881024 & i5) != 67108864 ? z2 : true);
            x4 = aVar3.x();
            if (!z4) {
            }
            x4 = new zo8(x9kVar, izsVar, wh50Var, 9);
            aVar3.R(x4);
            int i152 = i5 >> 6;
            int i162 = i9;
            androidx.compose.runtime.a aVar42 = aVar3;
            nvu0.a(g8s.e.a.a(tho0Var2, (izs) x4, str3, null, i, i162, false, rgyVar, ueyVar, null, a22, aVar42, ((i5 >> 9) & 896) | (57344 & i152) | (i152 & 458752) | 100663296 | (1879048192 & i5), 24576, 7368), d2, h8s.a.a(str, false, null, blyVar, null, aVar42, ((i5 >> 3) & 14) | 196608, 22), null, h2e0Var2, aVar42, 0, 8);
            aVar2 = aVar42;
            if (oq.h(-1375272825, aVar2)) {
            }
            i7 = i162;
        } else {
            aVar2 = M;
            aVar2.h();
            i7 = i6;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zhg0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aig0.a(x9k.this, str, str2, q630Var, str3, i, i7, izsVar, ueyVar, rgyVar, z, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1), i4);
                    return s3q0.a;
                }
            };
        }
    }
}

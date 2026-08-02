package defpackage;

import androidx.compose.ui.layout.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class koy0 {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final f530 f530Var, String str, long j, final long j2, lzr lzrVar, long j3, long j4, ety0 ety0Var, fid fidVar, final int i, final int i2) {
        int i3;
        long j5;
        lzr lzrVar2;
        int i4;
        final String str2;
        final long j6;
        final ety0 ety0Var2;
        final lzr lzrVar3;
        final long j7;
        final long j8;
        aii0 v;
        lzr lzrVar4;
        long j9;
        int i5;
        ety0 ety0Var3;
        String str3;
        long j10;
        long j11;
        lzr lzrVar5;
        Object ioy0Var;
        int i6;
        long j12;
        int i7;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1508165186);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i3 | 48;
        int i9 = i2 & 4;
        if (i9 != 0) {
            i8 = i3 | 432;
            j5 = j;
        } else {
            j5 = j;
            if ((i & 384) == 0) {
                i8 |= btsVar.d(j5) ? 256 : 128;
            }
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i8 |= btsVar.d(j2) ? 2048 : 1024;
        }
        int i10 = i8 | HProv.ALG_CLASS_DATA_ENCRYPT;
        int i11 = i2 & 32;
        if (i11 != 0) {
            i10 = 221184 | i8;
        } else if ((196608 & i) == 0) {
            lzrVar2 = lzrVar;
            i10 |= btsVar.k(lzrVar2) ? 131072 : 65536;
            i4 = 114819072 | i10;
            if ((805306368 & i) == 0) {
                i4 = 383254528 | i10;
            }
            if (btsVar.V(i4 & 1, (306783379 & i4) == 306783378)) {
                btsVar.Y();
                str2 = str;
                j6 = j4;
                ety0Var2 = ety0Var;
                lzrVar3 = lzrVar2;
                j7 = j5;
                j8 = j3;
            } else {
                btsVar.a0();
                if ((i & 1) == 0 || btsVar.C()) {
                    if (i9 != 0) {
                        j5 = sty0.c;
                    }
                    lzrVar4 = i11 != 0 ? null : lzrVar2;
                    j9 = sty0.c;
                    i5 = i4 & (-1879048193);
                    ety0Var3 = ((zm51) btsVar.m(an51.a)).g;
                    str3 = " .";
                    j10 = j9;
                } else {
                    btsVar.Y();
                    int i12 = i4 & (-1879048193);
                    j9 = j4;
                    ety0Var3 = ety0Var;
                    i5 = i12;
                    lzrVar4 = lzrVar2;
                    str3 = str;
                    j10 = j3;
                }
                btsVar.u();
                boolean k = ((i5 & 112) == 32) | ((((i5 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar.d(j2)) || (i5 & HProv.ALG_TYPE_SECURECHANNEL) == 2048) | ((i5 & 896) == 256) | ((3670016 & i5) == 1048576) | ((458752 & i5) == 131072) | ((57344 & i5) == 16384) | ((234881024 & i5) == 67108864) | ((29360128 & i5) == 8388608) | btsVar.k(ety0Var3);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    int i13 = i5;
                    j11 = j5;
                    lzrVar5 = lzrVar4;
                    i6 = i13;
                    j12 = j9;
                    i7 = 0;
                    ioy0Var = new ioy0(str3, j2, j11, lzrVar5, j12, j10, ety0Var3, 0);
                    btsVar.o0(ioy0Var);
                } else {
                    i6 = i5;
                    j11 = j5;
                    i7 = 0;
                    lzrVar5 = lzrVar4;
                    ioy0Var = Q;
                    j12 = j9;
                }
                e.a(f530Var, (wls) ioy0Var, btsVar, i6 & 14, i7);
                str2 = str3;
                j7 = j11;
                lzrVar3 = lzrVar5;
                ety0Var2 = ety0Var3;
                j6 = j12;
                j8 = j10;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: joy0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int O = vng.O(i | 1);
                        koy0.a(f530.this, str2, j7, j2, lzrVar3, j8, j6, ety0Var2, (fid) obj, O, i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        lzrVar2 = lzrVar;
        i4 = 114819072 | i10;
        if ((805306368 & i) == 0) {
        }
        if (btsVar.V(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}

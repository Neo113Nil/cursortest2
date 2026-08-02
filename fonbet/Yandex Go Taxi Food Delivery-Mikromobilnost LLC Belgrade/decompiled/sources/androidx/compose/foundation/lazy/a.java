package androidx.compose.foundation.lazy;

import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.e6y;
import defpackage.f530;
import defpackage.feu0;
import defpackage.fid;
import defpackage.fx91;
import defpackage.g6y;
import defpackage.h43;
import defpackage.hgx;
import defpackage.it1;
import defpackage.j690;
import defpackage.k43;
import defpackage.k6y;
import defpackage.kdb1;
import defpackage.l0u;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.p6y;
import defpackage.r100;
import defpackage.r6y;
import defpackage.s5y;
import defpackage.snr;
import defpackage.t7j;
import defpackage.tls;
import defpackage.to5;
import defpackage.tse;
import defpackage.u4y;
import defpackage.uj91;
import defpackage.w01;
import defpackage.xj91;
import defpackage.xw91;
import defpackage.zpn;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:180:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, b bVar, j690 j690Var, boolean z, snr snrVar, boolean z2, c cVar, it1 it1Var, k43 k43Var, to5 to5Var, h43 h43Var, tls tlsVar, fid fidVar, int i, int i2, int i3) {
        int i4;
        it1 it1Var2;
        int i5;
        int i6;
        int i7;
        b bVar2;
        bts btsVar;
        k43 k43Var2;
        to5 to5Var2;
        h43 h43Var2;
        it1 it1Var3;
        aii0 v;
        int i8;
        k43 k43Var3;
        int i9;
        h43 h43Var3;
        to5 to5Var3;
        o430 o430Var;
        int i10;
        bts btsVar2;
        hgx hgxVar;
        k43 k43Var4;
        h43 h43Var4;
        f530 f530Var2;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(924924659);
        if ((i & 6) == 0) {
            i4 = (btsVar3.k(f530Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= btsVar3.k(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= btsVar3.k(j690Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar3.a(false) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar3.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= btsVar3.k(snrVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= btsVar3.a(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= btsVar3.k(cVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i4 |= SelfTester_JCP.DECRYPT_CFB;
        }
        int i11 = i3 & 512;
        if (i11 != 0) {
            i4 |= 805306368;
            it1Var2 = it1Var;
        } else {
            it1Var2 = it1Var;
            if ((i & 805306368) == 0) {
                i4 |= btsVar3.k(it1Var2) ? 536870912 : SelfTester_JCP.IMITA;
            }
        }
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i6 = i2 | 6;
            i5 = i4;
        } else if ((i2 & 6) == 0) {
            i5 = i4;
            i6 = i2 | (btsVar3.k(k43Var) ? 4 : 2);
        } else {
            i5 = i4;
            i6 = i2;
        }
        int i13 = i3 & 2048;
        if (i13 != 0) {
            i6 |= 48;
            i7 = i13;
        } else if ((i2 & 48) == 0) {
            i7 = i13;
            i6 |= btsVar3.k(to5Var) ? 32 : 16;
        } else {
            i7 = i13;
        }
        int i14 = i6;
        int i15 = i3 & 4096;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i2 & 384) == 0) {
            i14 |= btsVar3.k(h43Var) ? 256 : 128;
            if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i14 |= btsVar3.e(tlsVar) ? 2048 : 1024;
            }
            if (btsVar3.V(i5 & 1, (i5 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
                bVar2 = bVar;
                btsVar = btsVar3;
                btsVar.Y();
                k43Var2 = k43Var;
                to5Var2 = to5Var;
                h43Var2 = h43Var;
                it1Var3 = it1Var2;
            } else {
                btsVar3.a0();
                if ((i & 1) == 0 || btsVar3.C()) {
                    i8 = i5 & (-234881025);
                    if (i11 != 0) {
                        it1Var2 = null;
                    }
                    k43Var3 = i12 != 0 ? null : k43Var;
                    to5 to5Var4 = i7 != 0 ? null : to5Var;
                    if (i15 != 0) {
                        i9 = i14;
                        it1Var3 = it1Var2;
                        h43Var3 = null;
                    } else {
                        i9 = i14;
                        it1Var3 = it1Var2;
                        h43Var3 = h43Var;
                    }
                    to5Var3 = to5Var4;
                } else {
                    btsVar3.Y();
                    i8 = i5 & (-234881025);
                    k43Var3 = k43Var;
                    i9 = i14;
                    it1Var3 = it1Var2;
                    to5Var3 = to5Var;
                    h43Var3 = h43Var;
                }
                btsVar3.u();
                int i16 = i8 >> 3;
                int i17 = i16 & 14;
                int i18 = i17 | ((i9 >> 6) & 112);
                int i19 = i8;
                oz40 n = f.n(tlsVar, btsVar3);
                int i20 = i9;
                boolean z3 = (((i18 & 14) ^ 6) > 4 && btsVar3.k(bVar)) || (i18 & 6) == 4;
                Object Q = btsVar3.Q();
                boolean z4 = z3;
                o430 o430Var2 = did.a;
                if (z4 || Q == o430Var2) {
                    u4y u4yVar = new u4y();
                    xw91 xw91Var = xw91.D;
                    Q = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(f.e(new t7j(27, f.e(new w01(13, n), xw91Var), bVar, u4yVar), xw91Var), m3u0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    btsVar3.o0(Q);
                }
                hgx hgxVar2 = (hgx) Q;
                int i21 = i19 >> 9;
                int i22 = i17 | (i21 & 112);
                boolean z5 = ((((i22 & 112) ^ 48) > 32 && btsVar3.a(z)) || (i22 & 48) == 32) | ((((i22 & 14) ^ 6) > 4 && btsVar3.k(bVar)) || (i22 & 6) == 4);
                Object Q2 = btsVar3.Q();
                if (z5 || Q2 == o430Var2) {
                    Q2 = new g6y(bVar, z);
                    btsVar3.o0(Q2);
                }
                e6y e6yVar = (e6y) Q2;
                Object Q3 = btsVar3.Q();
                if (Q3 == o430Var2) {
                    Q3 = zpn.j(EmptyCoroutineContext.a, btsVar3);
                    btsVar3.o0(Q3);
                }
                tse tseVar = (tse) Q3;
                l0u l0uVar = (l0u) btsVar3.m(j.g);
                r100 r100Var = ((Boolean) btsVar3.m(j.w)).booleanValue() ? null : feu0.a;
                int i23 = i20 << 18;
                int i24 = (i19 & 65520) | (i21 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | ((i20 << 27) & 1879048192);
                boolean c = ((((i24 & 112) ^ 48) > 32 && btsVar3.k(bVar)) || (i24 & 48) == 32) | ((((i24 & 896) ^ 384) > 256 && btsVar3.k(j690Var)) || (i24 & 384) == 256) | ((((i24 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar3.a(false)) || (i24 & HProv.ALG_TYPE_SECURECHANNEL) == 2048) | ((((57344 & i24) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar3.a(z)) || (i24 & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384) | btsVar3.c(0) | ((((i24 & 3670016) ^ 1572864) > 1048576 && btsVar3.k(it1Var3)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) > 8388608 && btsVar3.k(to5Var3)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) > 67108864 && btsVar3.k(h43Var3)) || (i24 & 100663296) == 67108864) | ((((i24 & 1879048192) ^ 805306368) > 536870912 && btsVar3.k(k43Var3)) || (i24 & 805306368) == 536870912) | btsVar3.k(l0uVar) | btsVar3.k(r100Var);
                Object Q4 = btsVar3.Q();
                if (c || Q4 == o430Var2) {
                    o430Var = o430Var2;
                    i10 = 4;
                    btsVar2 = btsVar3;
                    k43 k43Var5 = k43Var3;
                    Q4 = new r6y(bVar, z, j690Var, hgxVar2, k43Var5, h43Var3, tseVar, l0uVar, r100Var, it1Var3, to5Var3);
                    hgxVar = hgxVar2;
                    k43Var4 = k43Var5;
                    h43Var4 = h43Var3;
                    btsVar2.o0(Q4);
                } else {
                    hgxVar = hgxVar2;
                    k43Var4 = k43Var3;
                    btsVar2 = btsVar3;
                    h43Var4 = h43Var3;
                    o430Var = o430Var2;
                    i10 = 4;
                }
                s5y s5yVar = (s5y) Q4;
                Orientation orientation = z ? Orientation.Vertical : Orientation.Horizontal;
                if (z2) {
                    btsVar2.e0(-2077147368);
                    boolean c2 = btsVar2.c(0) | ((((i16 & 14) ^ 6) > i10 && btsVar2.k(bVar)) || (i16 & 6) == i10);
                    Object Q5 = btsVar2.Q();
                    if (c2 || Q5 == o430Var) {
                        Q5 = new k6y(bVar);
                        btsVar2.o0(Q5);
                    }
                    f530Var2 = uj91.e((k6y) Q5, bVar.p, orientation);
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(-2076718545);
                    btsVar2.t(false);
                    f530Var2 = c530.a;
                }
                bVar2 = bVar;
                btsVar = btsVar2;
                kdb1.a(hgxVar, fx91.d(xj91.b(f530Var.k(bVar.m).k(bVar.n), hgxVar, e6yVar, orientation, z2).k(f530Var2).k(bVar.o.k), bVar, orientation, cVar, z2, snrVar, bVar.g, null), bVar2.q, s5yVar, btsVar, 0);
                k43Var2 = k43Var4;
                to5Var2 = to5Var3;
                h43Var2 = h43Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new p6y(f530Var, bVar2, j690Var, z, snrVar, z2, cVar, it1Var3, k43Var2, to5Var2, h43Var2, tlsVar, i, i2, i3);
                return;
            }
            return;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if (btsVar3.V(i5 & 1, (i5 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}

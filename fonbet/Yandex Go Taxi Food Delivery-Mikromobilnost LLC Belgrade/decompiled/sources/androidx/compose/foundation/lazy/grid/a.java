package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.d4y;
import defpackage.did;
import defpackage.f530;
import defpackage.feu0;
import defpackage.fid;
import defpackage.fx91;
import defpackage.g4y;
import defpackage.h43;
import defpackage.hgx;
import defpackage.j690;
import defpackage.k43;
import defpackage.kdb1;
import defpackage.l0u;
import defpackage.m3u0;
import defpackage.mqu;
import defpackage.o430;
import defpackage.oz40;
import defpackage.r100;
import defpackage.s1u;
import defpackage.s5y;
import defpackage.snr;
import defpackage.tls;
import defpackage.tse;
import defpackage.uj91;
import defpackage.w01;
import defpackage.w3y;
import defpackage.xj91;
import defpackage.xw91;
import defpackage.zpn;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0268, code lost:
    
        if (r14.a(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, b bVar, s1u s1uVar, j690 j690Var, snr snrVar, boolean z, androidx.compose.foundation.c cVar, k43 k43Var, h43 h43Var, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        int i4;
        b bVar2;
        bts btsVar;
        boolean z2;
        boolean k;
        Object g4yVar;
        b bVar3;
        c cVar2;
        boolean z3;
        boolean z4;
        hgx hgxVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(708740370);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? btsVar2.k(s1uVar) : btsVar2.e(s1uVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.k(j690Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.a(false) ? 16384 : 8192;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i3 |= btsVar2.a(true) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= btsVar2.k(snrVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= btsVar2.a(z) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i3 |= btsVar2.k(cVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i3 |= btsVar2.k(k43Var) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (btsVar2.k(h43Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            btsVar2.a0();
            if ((i & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            oz40 n = f.n(tlsVar, btsVar2);
            int i8 = i3;
            boolean z5 = (((i7 & 14) ^ 6) > 4 && btsVar2.k(bVar)) || (i7 & 6) == 4;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z5 || Q == o430Var) {
                xw91 xw91Var = xw91.D;
                Q = new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1(f.e(new mqu(17, f.e(new w01(11, n), xw91Var), bVar), xw91Var), m3u0.class, "value", "getValue()Ljava/lang/Object;", 0);
                btsVar2.o0(Q);
            }
            hgx hgxVar2 = (hgx) Q;
            int i9 = i6 | ((i8 >> 9) & 112);
            boolean z6 = ((((i9 & 14) ^ 6) > 4 && btsVar2.k(bVar)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && btsVar2.a(false)) || (i9 & 48) == 32);
            Object Q2 = btsVar2.Q();
            if (z6 || Q2 == o430Var) {
                Q2 = new c(bVar);
                btsVar2.o0(Q2);
            }
            c cVar3 = (c) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                btsVar2.o0(Q3);
            }
            tse tseVar = (tse) Q3;
            l0u l0uVar = (l0u) btsVar2.m(j.g);
            r100 r100Var = !((Boolean) btsVar2.m(j.w)).booleanValue() ? feu0.a : null;
            int i10 = (i8 & 524272) | ((i4 << 18) & 3670016) | ((i8 >> 6) & 29360128);
            boolean z7 = ((((i10 & 896) ^ 384) > 256 && btsVar2.k(s1uVar)) || (i10 & 384) == 256) | ((((i10 & 112) ^ 48) > 32 && btsVar2.k(bVar)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar2.k(j690Var)) || (i10 & HProv.ALG_TYPE_SECURECHANNEL) == 2048);
            if (((57344 & i10) ^ HProv.ALG_CLASS_DATA_ENCRYPT) <= 16384) {
            }
            if ((i10 & HProv.ALG_CLASS_DATA_ENCRYPT) != 16384) {
                z2 = false;
                k = ((((i10 & 29360128) ^ 12582912) <= 8388608 && btsVar2.k(k43Var)) || (i10 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i10) ^ ImageMetadata.EDGE_MODE) <= 131072 && btsVar2.a(true)) || (i10 & ImageMetadata.EDGE_MODE) == 131072) | ((((i10 & 3670016) ^ 1572864) <= 1048576 && btsVar2.k(h43Var)) || (i10 & 1572864) == 1048576) | btsVar2.k(l0uVar);
                Object Q4 = btsVar2.Q();
                if (!k || Q4 == o430Var) {
                    bVar3 = bVar;
                    cVar2 = cVar3;
                    z3 = false;
                    z4 = true;
                    g4yVar = new g4y(bVar3, j690Var, hgxVar2, s1uVar, k43Var, h43Var, tseVar, l0uVar, r100Var);
                    hgxVar = hgxVar2;
                    btsVar2.o0(g4yVar);
                } else {
                    g4yVar = Q4;
                    cVar2 = cVar3;
                    hgxVar = hgxVar2;
                    z3 = false;
                    z4 = true;
                    bVar3 = bVar;
                }
                s5y s5yVar = (s5y) g4yVar;
                Orientation orientation = Orientation.Vertical;
                if (z) {
                    btsVar2.e0(27577840);
                    btsVar2.t(z3);
                    f530Var2 = c530.a;
                } else {
                    btsVar2.e0(27281635);
                    if (((i6 ^ 6) <= 4 || !btsVar2.k(bVar3)) && (i5 & 6) != 4) {
                        z4 = z3;
                    }
                    Object Q5 = btsVar2.Q();
                    if (z4 || Q5 == o430Var) {
                        Q5 = new w3y(bVar3);
                        btsVar2.o0(Q5);
                    }
                    f530Var2 = uj91.e((w3y) Q5, bVar3.n, orientation);
                    btsVar2.t(z3);
                }
                bVar2 = bVar3;
                btsVar = btsVar2;
                kdb1.a(hgxVar, fx91.d(xj91.b(f530Var.k(bVar3.k).k(bVar3.l), hgxVar, cVar2, orientation, z).k(f530Var2).k(bVar3.m.k), bVar3, orientation, cVar, z, snrVar, bVar3.f, null), bVar2.o, s5yVar, btsVar, 0);
            }
            z2 = true;
            k = ((((i10 & 29360128) ^ 12582912) <= 8388608 && btsVar2.k(k43Var)) || (i10 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i10) ^ ImageMetadata.EDGE_MODE) <= 131072 && btsVar2.a(true)) || (i10 & ImageMetadata.EDGE_MODE) == 131072) | ((((i10 & 3670016) ^ 1572864) <= 1048576 && btsVar2.k(h43Var)) || (i10 & 1572864) == 1048576) | btsVar2.k(l0uVar);
            Object Q42 = btsVar2.Q();
            if (k) {
            }
            bVar3 = bVar;
            cVar2 = cVar3;
            z3 = false;
            z4 = true;
            g4yVar = new g4y(bVar3, j690Var, hgxVar2, s1uVar, k43Var, h43Var, tseVar, l0uVar, r100Var);
            hgxVar = hgxVar2;
            btsVar2.o0(g4yVar);
            s5y s5yVar2 = (s5y) g4yVar;
            Orientation orientation2 = Orientation.Vertical;
            if (z) {
            }
            bVar2 = bVar3;
            btsVar = btsVar2;
            kdb1.a(hgxVar, fx91.d(xj91.b(f530Var.k(bVar3.k).k(bVar3.l), hgxVar, cVar2, orientation2, z).k(f530Var2).k(bVar3.m.k), bVar3, orientation2, cVar, z, snrVar, bVar3.f, null), bVar2.o, s5yVar2, btsVar, 0);
        } else {
            bVar2 = bVar;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d4y(f530Var, bVar2, s1uVar, j690Var, snrVar, z, cVar, k43Var, h43Var, tlsVar, i, i2);
        }
    }
}

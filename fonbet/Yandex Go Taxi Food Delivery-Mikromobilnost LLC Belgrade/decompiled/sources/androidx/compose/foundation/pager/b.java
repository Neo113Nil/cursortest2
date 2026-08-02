package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.e6y;
import defpackage.exw0;
import defpackage.f530;
import defpackage.f6y;
import defpackage.f890;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fx91;
import defpackage.g890;
import defpackage.gn50;
import defpackage.hgx;
import defpackage.j690;
import defpackage.k1t0;
import defpackage.kdb1;
import defpackage.m3u0;
import defpackage.mqu;
import defpackage.ny8;
import defpackage.oz40;
import defpackage.r890;
import defpackage.rx3;
import defpackage.s5y;
import defpackage.sls;
import defpackage.so5;
import defpackage.t7j;
import defpackage.tls;
import defpackage.to5;
import defpackage.tse;
import defpackage.u790;
import defpackage.uj91;
import defpackage.vk6;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xj91;
import defpackage.xw91;
import defpackage.yk6;
import defpackage.zpn;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class b {
    public static final void a(f530 f530Var, d dVar, final j690 j690Var, final Orientation orientation, final androidx.compose.foundation.gestures.snapping.a aVar, final boolean z, final androidx.compose.foundation.c cVar, final float f, final u790 u790Var, gn50 gn50Var, final tls tlsVar, final to5 to5Var, final k1t0 k1t0Var, final androidx.compose.runtime.internal.a aVar2, fid fidVar, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.internal.a aVar3;
        f530 f530Var2;
        d dVar2;
        bts btsVar;
        tse tseVar;
        int i5;
        int i6;
        Orientation orientation2;
        hgx hgxVar;
        f530 f530Var3;
        gn50 gn50Var2 = gn50Var;
        so5 so5Var = x4c.H;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-572816025);
        if ((i & 6) == 0) {
            i3 = i | (btsVar2.k(f530Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.k(j690Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.a(false) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.c(orientation.ordinal()) ? 16384 : 8192;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i3 |= btsVar2.k(aVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= btsVar2.a(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= btsVar2.k(cVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i3 |= btsVar2.c(0) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i3 |= btsVar2.b(f) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (btsVar2.k(u790Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar2.e(gn50Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar2.k(so5Var) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.k(to5Var) ? 16384 : 8192;
        }
        if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
            i4 |= btsVar2.k(k1t0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            aVar3 = aVar2;
            i4 |= btsVar2.e(aVar3) ? 1048576 : 524288;
        } else {
            aVar3 = aVar2;
        }
        int i7 = i4;
        if (btsVar2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i7) == 599186) ? false : true)) {
            int i8 = i3 & 112;
            boolean z2 = i8 == 32;
            Object Q = btsVar2.Q();
            Object obj = did.a;
            if (z2 || Q == obj) {
                Q = new ny8(dVar, 2);
                btsVar2.o0(Q);
            }
            sls slsVar = (sls) Q;
            int i9 = i3 >> 3;
            int i10 = i9 & 14;
            int i11 = i7 >> 15;
            int i12 = i10 | (i11 & 112) | (i7 & 896);
            oz40 n = f.n(aVar3, btsVar2);
            oz40 n2 = f.n(tlsVar, btsVar2);
            boolean k = ((((i12 & 14) ^ 6) > 4 && btsVar2.k(dVar)) || (i12 & 6) == 4) | btsVar2.k(n) | btsVar2.k(n2) | btsVar2.k(slsVar);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == obj) {
                xw91 xw91Var = xw91.D;
                Q2 = new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1(f.e(new mqu(18, f.e(new t7j(26, n, n2, slsVar), xw91Var), dVar), xw91Var), m3u0.class, "value", "getValue()Ljava/lang/Object;", 0);
                btsVar2.o0(Q2);
            }
            hgx hgxVar2 = (hgx) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == obj) {
                Q3 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                btsVar2.o0(Q3);
            }
            tse tseVar2 = (tse) Q3;
            boolean z3 = i8 == 32;
            Object Q4 = btsVar2.Q();
            if (z3 || Q4 == obj) {
                Q4 = new ny8(dVar, 3);
                btsVar2.o0(Q4);
            }
            sls slsVar2 = (sls) Q4;
            int i13 = i3 >> 9;
            int i14 = (i3 & 65520) | (i13 & ImageMetadata.JPEG_GPS_COORDINATES) | (i13 & 3670016) | ((i7 << 21) & 29360128);
            int i15 = i7 << 15;
            int i16 = i14 | (i15 & 234881024) | (i15 & 1879048192);
            boolean k2 = ((((i16 & ImageMetadata.JPEG_GPS_COORDINATES) ^ ImageMetadata.EDGE_MODE) > 131072 && btsVar2.c(0)) || (i16 & ImageMetadata.EDGE_MODE) == 131072) | ((((i16 & 896) ^ 384) > 256 && btsVar2.k(j690Var)) || (i16 & 384) == 256) | ((((i16 & 112) ^ 48) > 32 && btsVar2.k(dVar)) || (i16 & 48) == 32) | ((((i16 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar2.a(false)) || (i16 & HProv.ALG_TYPE_SECURECHANNEL) == 2048) | ((((57344 & i16) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar2.c(orientation.ordinal())) || (i16 & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384) | ((((i16 & 234881024) ^ 100663296) > 67108864 && btsVar2.k(so5Var)) || (i16 & 100663296) == 67108864) | ((((i16 & 1879048192) ^ 805306368) > 536870912 && btsVar2.k(to5Var)) || (i16 & 805306368) == 536870912) | ((((i16 & 3670016) ^ 1572864) > 1048576 && btsVar2.b(f)) || (i16 & 1572864) == 1048576) | ((((i16 & 29360128) ^ 12582912) > 8388608 && btsVar2.k(u790Var)) || (i16 & 12582912) == 8388608) | ((((i11 & 14) ^ 6) > 4 && btsVar2.k(k1t0Var)) || (i11 & 6) == 4) | btsVar2.k(slsVar2) | btsVar2.k(tseVar2);
            Object Q5 = btsVar2.Q();
            if (k2 || Q5 == obj) {
                tseVar = tseVar2;
                btsVar = btsVar2;
                i5 = i8;
                i6 = 32;
                orientation2 = orientation;
                Q5 = new r890(dVar, orientation2, j690Var, f, u790Var, hgxVar2, slsVar2, to5Var, k1t0Var, tseVar);
                hgxVar = hgxVar2;
                btsVar.o0(Q5);
            } else {
                tseVar = tseVar2;
                btsVar = btsVar2;
                i5 = i8;
                hgxVar = hgxVar2;
                i6 = 32;
                orientation2 = orientation;
            }
            s5y s5yVar = (s5y) Q5;
            Orientation orientation3 = Orientation.Vertical;
            boolean z4 = orientation2 == orientation3;
            boolean a = (((i10 ^ 6) > 4 && btsVar.k(dVar)) || (i9 & 6) == 4) | btsVar.a(z4);
            Object Q6 = btsVar.Q();
            if (a || Q6 == obj) {
                Q6 = new f6y(dVar, z4);
                btsVar.o0(Q6);
            }
            e6y e6yVar = (e6y) Q6;
            boolean z5 = (i5 == i6) | ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072);
            Object Q7 = btsVar.Q();
            if (z5 || Q7 == obj) {
                Q7 = new e(aVar, dVar);
                btsVar.o0(Q7);
            }
            e eVar = (e) Q7;
            vk6 vk6Var = (vk6) btsVar.m(yk6.a);
            LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(j.n);
            btsVar.e0(-853904960);
            boolean k3 = (i5 == i6) | btsVar.k(vk6Var) | btsVar.c(layoutDirection.ordinal());
            Object Q8 = btsVar.Q();
            if (k3 || Q8 == obj) {
                Q8 = new g890(dVar, vk6Var, layoutDirection);
                btsVar.o0(Q8);
            }
            g890 g890Var = (g890) Q8;
            btsVar.t(false);
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(-853484445);
                int i17 = i10 | ((i3 >> 21) & 112);
                boolean z6 = ((((i17 & 112) ^ 48) > 32 && btsVar.c(0)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) > 4 && btsVar.k(dVar)) || (i17 & 6) == 4);
                Object Q9 = btsVar.Q();
                if (z6 || Q9 == obj) {
                    Q9 = new f890(dVar);
                    btsVar.o0(Q9);
                }
                f530Var3 = uj91.e((f890) Q9, dVar.v, orientation2);
                btsVar.t(false);
            } else {
                btsVar.e0(-853054661);
                btsVar.t(false);
                f530Var3 = c530Var;
            }
            f530Var2 = f530Var;
            f530 b = xj91.b(f530Var2.k(dVar.y).k(dVar.w), hgxVar, e6yVar, orientation2, z);
            dVar2 = dVar;
            gn50Var2 = gn50Var;
            kdb1.a(hgxVar, androidx.compose.ui.input.nestedscroll.b.a(fx91.d((z ? b.k(fnq0.b(c530Var, false, new rx3(orientation2 == orientation3, dVar, tseVar, 8))) : b.k(c530Var)).k(f530Var3), dVar, orientation2, cVar, z, eVar, dVar.p, g890Var).k(exw0.a(c530Var, dVar2, new a(dVar2))), gn50Var2, null), dVar2.t, s5yVar, btsVar, 0);
        } else {
            f530Var2 = f530Var;
            dVar2 = dVar;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final d dVar3 = dVar2;
            final f530 f530Var4 = f530Var2;
            final gn50 gn50Var3 = gn50Var2;
            v.d = new wls() { // from class: x5y
                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int O = vng.O(i | 1);
                    int O2 = vng.O(i2);
                    b.a(f530.this, dVar3, j690Var, orientation, aVar, z, cVar, f, u790Var, gn50Var3, tlsVar, to5Var, k1t0Var, aVar2, (fid) obj2, O, O2);
                    return zy11.a;
                }
            };
        }
    }
}

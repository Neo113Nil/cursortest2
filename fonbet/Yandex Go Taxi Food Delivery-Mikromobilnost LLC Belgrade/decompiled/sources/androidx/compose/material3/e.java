package androidx.compose.material3;

import androidx.compose.material3.e;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.apr;
import defpackage.b7p;
import defpackage.bts;
import defpackage.c530;
import defpackage.d7p;
import defpackage.dgc;
import defpackage.did;
import defpackage.ehr0;
import defpackage.eq11;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.ly3;
import defpackage.mnw0;
import defpackage.o430;
import defpackage.sls;
import defpackage.swo;
import defpackage.tls;
import defpackage.two;
import defpackage.uor;
import defpackage.uwo;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xor;
import defpackage.xvq;
import defpackage.y7m;
import defpackage.zir0;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zx40;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class e {
    public static final float a;
    public static final float b;

    static {
        int i = uwo.a;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        int i2 = swo.a;
        a = 20.0f;
        b = 80.0f;
    }

    public static final void a(final sls slsVar, f530 f530Var, ehr0 ehr0Var, long j, long j2, uor uorVar, zls zlsVar, fid fidVar, final int i) {
        zls zlsVar2;
        f530 f530Var2;
        final ehr0 ehr0Var2;
        final long j3;
        final long j4;
        final uor uorVar2;
        long d;
        long b2;
        uor uorVar3;
        int i2;
        ehr0 ehr0Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1039585610);
        int i3 = i | (btsVar.e(slsVar) ? 4 : 2) | 1647792;
        if (btsVar.V(i3 & 1, (4793491 & i3) != 4793490)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                ehr0 b3 = zir0.b(two.a, btsVar);
                d = dgc.d(d7p.a, btsVar);
                b2 = dgc.b(d, btsVar);
                uorVar3 = new uor(d7p.b, d7p.e, d7p.c, d7p.d);
                i2 = i3 & (-524161);
                ehr0Var3 = b3;
                f530Var2 = c530.a;
            } else {
                btsVar.Y();
                i2 = i3 & (-524161);
                f530Var2 = f530Var;
                ehr0Var3 = ehr0Var;
                d = j;
                b2 = j2;
                uorVar3 = uorVar;
            }
            btsVar.u();
            zlsVar2 = zlsVar;
            long j5 = d;
            long j6 = b2;
            uor uorVar4 = uorVar3;
            b(slsVar, f530Var2, ehr0Var3, j5, j6, uorVar4, null, wwg.S(-1233936436, true, new xor(zlsVar2, 0), btsVar), btsVar, (i2 & 14) | 14155824, 0);
            ehr0Var2 = ehr0Var3;
            j3 = j5;
            j4 = j6;
            uorVar2 = uorVar4;
        } else {
            zlsVar2 = zlsVar;
            btsVar.Y();
            f530Var2 = f530Var;
            ehr0Var2 = ehr0Var;
            j3 = j;
            j4 = j2;
            uorVar2 = uorVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final zls zlsVar3 = zlsVar2;
            final f530 f530Var3 = f530Var2;
            v.d = new wls(f530Var3, ehr0Var2, j3, j4, uorVar2, zlsVar3, i) { // from class: yor
                public final /* synthetic */ f530 b;
                public final /* synthetic */ ehr0 c;
                public final /* synthetic */ long w;
                public final /* synthetic */ long x;
                public final /* synthetic */ uor y;
                public final /* synthetic */ zls z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(12582913);
                    e.a(sls.this, this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(final sls slsVar, final f530 f530Var, final ehr0 ehr0Var, final long j, final long j2, uor uorVar, final zx40 zx40Var, final androidx.compose.runtime.internal.a aVar, fid fidVar, final int i, final int i2) {
        int i3;
        uor uorVar2;
        bts btsVar;
        final uor uorVar3;
        int i4;
        uor uorVar4;
        uor uorVar5;
        int i5;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(748201188);
        if ((i & 6) == 0) {
            i3 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.k(ehr0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.d(j) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.d(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                uorVar2 = uorVar;
                if (btsVar2.k(uorVar2)) {
                    i5 = 131072;
                    i3 |= i5;
                }
            } else {
                uorVar2 = uorVar;
            }
            i5 = 65536;
            i3 |= i5;
        } else {
            uorVar2 = uorVar;
        }
        if ((1572864 & i) == 0) {
            i3 |= btsVar2.k(zx40Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= btsVar2.e(aVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if (btsVar2.V(i3 & 1, (4793491 & i3) != 4793490)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                if ((i2 & 32) != 0) {
                    int i6 = i3;
                    uorVar4 = new uor(d7p.b, d7p.e, d7p.c, d7p.d);
                    i4 = i6 & (-458753);
                } else {
                    i4 = i3;
                    uorVar4 = uorVar2;
                }
                uorVar5 = uorVar4;
                i3 = i4;
            } else {
                btsVar2.Y();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                uorVar5 = uorVar2;
            }
            btsVar2.u();
            int i7 = i3 << 9;
            btsVar = btsVar2;
            c(slsVar, eq11.a(two.b, btsVar2), b7p.a, f530Var, ehr0Var, j, j2, uorVar5, zx40Var, aVar, btsVar, (i3 & 14) | 3456 | (i7 & HProv.ALG_CLASS_ALL) | (i7 & ImageMetadata.JPEG_GPS_COORDINATES) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i3 >> 21) & 14);
            uorVar3 = uorVar5;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            uorVar3 = uorVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: zor
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e.b(sls.this, f530Var, ehr0Var, j, j2, uorVar3, zx40Var, aVar, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(final sls slsVar, final ety0 ety0Var, final float f, final f530 f530Var, final ehr0 ehr0Var, final long j, final long j2, final uor uorVar, final zx40 zx40Var, final androidx.compose.runtime.internal.a aVar, fid fidVar, final int i, final int i2) {
        int i3;
        ehr0 ehr0Var2;
        androidx.compose.runtime.internal.a aVar2;
        int i4;
        bts btsVar;
        zx40 zx40Var2;
        int i5;
        float f2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(121669932);
        if ((i & 6) == 0) {
            i3 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(ety0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.b(f) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.b(56.0f) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.k(f530Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            ehr0Var2 = ehr0Var;
            i3 |= btsVar2.k(ehr0Var2) ? 131072 : 65536;
        } else {
            ehr0Var2 = ehr0Var;
        }
        if ((1572864 & i) == 0) {
            i3 |= btsVar2.d(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= btsVar2.d(j2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i3 |= btsVar2.k(uorVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i) == 0) {
            i3 |= btsVar2.k(zx40Var) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            aVar2 = aVar;
            i4 = i2 | (btsVar2.e(aVar2) ? 4 : 2);
        } else {
            aVar2 = aVar;
            i4 = i2;
        }
        if (btsVar2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            btsVar2.a0();
            if ((i & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            o430 o430Var = did.a;
            if (zx40Var == null) {
                btsVar2.e0(-282853233);
                Object Q = btsVar2.Q();
                if (Q == o430Var) {
                    Q = ly3.i(btsVar2);
                }
                zx40Var2 = (zx40) Q;
                btsVar2.t(false);
            } else {
                btsVar2.e0(960706376);
                btsVar2.t(false);
                zx40Var2 = zx40Var;
            }
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                i5 = i3;
                Q2 = new xvq(8);
                btsVar2.o0(Q2);
            } else {
                i5 = i3;
            }
            f530 b2 = fnq0.b(f530Var, false, (tls) Q2);
            float f3 = uorVar.a;
            int i6 = i5 >> 21;
            int i7 = i6 & 112;
            boolean k = btsVar2.k(zx40Var2);
            Object Q3 = btsVar2.Q();
            if (k || Q3 == o430Var) {
                f2 = f3;
                Q3 = new d(uorVar.a, uorVar.b, uorVar.d, uorVar.c);
                btsVar2.o0(Q3);
            } else {
                f2 = f3;
            }
            d dVar = (d) Q3;
            boolean e = btsVar2.e(dVar) | (((i7 ^ 48) > 32 && btsVar2.k(uorVar)) || (i6 & 48) == 32);
            Object Q4 = btsVar2.Q();
            if (e || Q4 == o430Var) {
                Q4 = new FloatingActionButtonElevation$animateElevation$1$1(dVar, uorVar, null);
                btsVar2.o0(Q4);
            }
            zpn.e(btsVar2, (wls) Q4, uorVar);
            boolean k2 = btsVar2.k(zx40Var2) | btsVar2.e(dVar);
            Object Q5 = btsVar2.Q();
            if (k2 || Q5 == o430Var) {
                Q5 = new FloatingActionButtonElevation$animateElevation$2$1(zx40Var2, dVar, null);
                btsVar2.o0(Q5);
            }
            zpn.e(btsVar2, (wls) Q5, zx40Var2);
            int i8 = i5 >> 6;
            btsVar = btsVar2;
            mnw0.b(slsVar, b2, false, ehr0Var2, j, j2, f2, ((y7m) dVar.e.d.b.getValue()).a, zx40Var2, wwg.S(-1779603465, true, new apr(j2, ety0Var, f, aVar2), btsVar2), btsVar, (i5 & 14) | (i8 & 7168) | (57344 & i8) | (i8 & ImageMetadata.JPEG_GPS_COORDINATES), 260);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: bpr
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    int O2 = vng.O(i2);
                    e.c(sls.this, ety0Var, f, f530Var, ehr0Var, j, j2, uorVar, zx40Var, aVar, (fid) obj, O, O2);
                    return zy11.a;
                }
            };
        }
    }
}

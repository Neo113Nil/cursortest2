package coil.compose;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bev;
import defpackage.bts;
import defpackage.cma1;
import defpackage.did;
import defpackage.ea3;
import defpackage.f530;
import defpackage.fa3;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.ga3;
import defpackage.gh91;
import defpackage.h2b1;
import defpackage.ha3;
import defpackage.hev;
import defpackage.hhe;
import defpackage.ja3;
import defpackage.jdi0;
import defpackage.jl40;
import defpackage.jt1;
import defpackage.mhe;
import defpackage.mnq0;
import defpackage.nhe;
import defpackage.ohd;
import defpackage.qav;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rjs0;
import defpackage.sd90;
import defpackage.sls;
import defpackage.sx21;
import defpackage.tls;
import defpackage.tse0;
import defpackage.uo5;
import defpackage.vng;
import defpackage.wec;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.zy11;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:94:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ja3 ja3Var, final String str, final f530 f530Var, final tls tlsVar, final tls tlsVar2, final jt1 jt1Var, final nhe nheVar, final float f, final wec wecVar, final int i, final boolean z, fid fidVar, final int i2, final int i3) {
        int i4;
        tls tlsVar3;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        rjs0 rjs0Var;
        hev hevVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-421592773);
        if ((i2 & 14) == 0) {
            i4 = (btsVar.k(ja3Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_ALL) == 0) {
            tlsVar3 = tlsVar2;
            i4 |= btsVar.e(tlsVar3) ? 16384 : 8192;
        } else {
            tlsVar3 = tlsVar2;
        }
        if ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            i4 |= btsVar.k(jt1Var) ? 131072 : 65536;
        }
        if ((i2 & 3670016) == 0) {
            i4 |= btsVar.k(nheVar) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i4 |= btsVar.b(f) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i2 & 234881024) == 0) {
            i4 |= btsVar.k(wecVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i2 & 1879048192) == 0) {
            i4 |= btsVar.c(i) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i3 & 14) == 0) {
            i5 = 3670016;
            z2 = z;
            i6 = i3 | (btsVar.a(z2) ? 4 : 2);
        } else {
            i5 = 3670016;
            z2 = z;
            i6 = i3;
        }
        if ((i4 & 1533916891) == 306783378 && (i6 & 11) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            Object obj = ja3Var.a;
            jdi0 jdi0Var = sx21.b;
            btsVar.f0(1677680258);
            boolean z4 = obj instanceof hev;
            if (z4) {
                hevVar = (hev) obj;
                i7 = i4;
                if (hevVar.G.a != null) {
                    btsVar.t(false);
                    hev hevVar2 = hevVar;
                    qav qavVar = ja3Var.c;
                    int i8 = i7 >> 6;
                    int i9 = i8 & HProv.ALG_CLASS_ALL;
                    d f2 = sd90.f(hevVar2, qavVar, tlsVar, tlsVar3, nheVar, i, btsVar, 0);
                    rjs0 rjs0Var2 = hevVar2.y;
                    d(!(rjs0Var2 instanceof f) ? f530Var.k((f530) rjs0Var2) : f530Var, f2, str, jt1Var, nheVar, f, wecVar, z2, btsVar, (i8 & i5) | i9 | ((i7 << 3) & 896) | (i8 & 7168) | (i8 & ImageMetadata.JPEG_GPS_COORDINATES) | ((i6 << 21) & 29360128));
                    btsVar = btsVar;
                }
            } else {
                i7 = i4;
            }
            btsVar.f0(-679565543);
            boolean l = jl40.l(nheVar, mhe.f);
            Object obj2 = did.a;
            if (l) {
                rjs0Var = sx21.b;
                z3 = false;
            } else {
                btsVar.f0(-679565452);
                Object Q = btsVar.Q();
                if (Q == obj2) {
                    Q = new f();
                    btsVar.o0(Q);
                }
                rjs0 rjs0Var3 = (f) Q;
                z3 = false;
                btsVar.t(false);
                rjs0Var = rjs0Var3;
            }
            btsVar.t(z3);
            if (z4) {
                btsVar.f0(-679565365);
                btsVar.f0(-679565358);
                boolean k = btsVar.k(obj) | btsVar.k(rjs0Var);
                Object Q2 = btsVar.Q();
                if (k || Q2 == obj2) {
                    bev F = hev.F((hev) obj);
                    F.x = rjs0Var;
                    F.l();
                    Q2 = F.d();
                    btsVar.o0(Q2);
                }
                hevVar = (hev) Q2;
                tse0.t(btsVar, false, false, false);
            } else {
                btsVar.f0(-679565199);
                Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
                btsVar.f0(-679565153);
                boolean k2 = btsVar.k(context) | btsVar.k(obj) | btsVar.k(rjs0Var);
                Object Q3 = btsVar.Q();
                if (k2 || Q3 == obj2) {
                    bev bevVar = new bev(context);
                    bevVar.c = obj;
                    bevVar.x = rjs0Var;
                    bevVar.l();
                    Q3 = bevVar.d();
                    btsVar.o0(Q3);
                }
                hevVar = (hev) Q3;
                tse0.t(btsVar, false, false, false);
            }
            hev hevVar22 = hevVar;
            qav qavVar2 = ja3Var.c;
            int i82 = i7 >> 6;
            int i92 = i82 & HProv.ALG_CLASS_ALL;
            d f22 = sd90.f(hevVar22, qavVar2, tlsVar, tlsVar3, nheVar, i, btsVar, 0);
            rjs0 rjs0Var22 = hevVar22.y;
            if (!(rjs0Var22 instanceof f)) {
            }
            d(!(rjs0Var22 instanceof f) ? f530Var.k((f530) rjs0Var22) : f530Var, f22, str, jt1Var, nheVar, f, wecVar, z2, btsVar, (i82 & i5) | i92 | ((i7 << 3) & 896) | (i82 & 7168) | (i82 & ImageMetadata.JPEG_GPS_COORDINATES) | ((i6 << 21) & 29360128));
            btsVar = btsVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: coil.compose.AsyncImageKt$AsyncImage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    b.a(ja3.this, str, f530Var, tlsVar, tlsVar2, jt1Var, nheVar, f, wecVar, i, z, (fid) obj3, vng.O(i2 | 1), vng.O(i3));
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(hev hevVar, coil.c cVar, f530 f530Var, final tls tlsVar, final tls tlsVar2, final tls tlsVar3, jt1 jt1Var, nhe nheVar, float f, int i, fid fidVar, int i2, int i3) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(-1481548872);
        ja3 ja3Var = new ja3(hevVar, gh91.a, cVar);
        jdi0 jdi0Var = sx21.b;
        tls tlsVar4 = d.N;
        tls tlsVar5 = (tlsVar == null && tlsVar2 == null && tlsVar3 == null) ? null : new tls() { // from class: coil.compose.UtilsKt$onStateOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                tls tlsVar6;
                ha3 ha3Var = (ha3) obj;
                if (ha3Var instanceof fa3) {
                    tls tlsVar7 = tls.this;
                    if (tlsVar7 != null) {
                        tlsVar7.invoke(ha3Var);
                    }
                } else if (ha3Var instanceof ga3) {
                    tls tlsVar8 = tlsVar2;
                    if (tlsVar8 != null) {
                        tlsVar8.invoke(ha3Var);
                    }
                } else if ((ha3Var instanceof ea3) && (tlsVar6 = tlsVar3) != null) {
                    tlsVar6.invoke(ha3Var);
                }
                return zy11.a;
            }
        };
        int i4 = i3 << 15;
        a(ja3Var, null, f530Var, AsyncImagePainter$Companion$DefaultTransform$1.w, tlsVar5, jt1Var, nheVar, f, null, i, true, btsVar, (i2 & 112) | ((i2 >> 3) & 896) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), (i3 >> 15) & 14);
        btsVar.t(false);
    }

    public static final void c(hev hevVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(1451072229);
        tls tlsVar = d.N;
        uo5 uo5Var = x4c.y;
        qav qavVar = (qav) btsVar.m(h.a);
        if (qavVar == null) {
            qavVar = h2b1.f((Context) btsVar.m(AndroidCompositionLocals_androidKt.b));
        }
        int i2 = i << 3;
        int i3 = (i & 112) | 520 | (i2 & 7168) | (i2 & HProv.ALG_CLASS_ALL) | (i2 & ImageMetadata.JPEG_GPS_COORDINATES) | (i2 & 3670016) | (i2 & 29360128) | (i2 & 234881024) | (i2 & 1879048192);
        btsVar.f0(2032051394);
        ja3 ja3Var = new ja3(hevVar, gh91.a, qavVar);
        int i4 = i3 >> 3;
        a(ja3Var, null, f530Var, AsyncImagePainter$Companion$DefaultTransform$1.w, null, uo5Var, mhe.b, 1.0f, null, 1, true, btsVar, (i3 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & HProv.ALG_CLASS_ALL) | (i4 & ImageMetadata.JPEG_GPS_COORDINATES) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
        btsVar.t(false);
        btsVar.t(false);
    }

    public static final void d(final f530 f530Var, final d dVar, final String str, final jt1 jt1Var, final nhe nheVar, final float f, final wec wecVar, final boolean z, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(777774312);
        if ((i & 14) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= btsVar.k(dVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= btsVar.k(str) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= btsVar.k(jt1Var) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= btsVar.k(nheVar) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= btsVar.b(f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= btsVar.k(wecVar) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= btsVar.a(z) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i2 & 23967451) == 4793490 && btsVar.E()) {
            btsVar.Y();
        } else {
            jdi0 jdi0Var = sx21.b;
            f530 b = str != null ? fnq0.b(f530Var, false, new tls() { // from class: coil.compose.UtilsKt$contentDescription$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    mnq0 mnq0Var = (mnq0) obj;
                    androidx.compose.ui.semantics.f.l(mnq0Var, str);
                    androidx.compose.ui.semantics.f.p(mnq0Var, 5);
                    return zy11.a;
                }
            }) : f530Var;
            if (z) {
                b = ymb1.m(b);
            }
            f530 k = b.k(new hhe(dVar, jt1Var, nheVar, f, wecVar));
            btsVar.f0(544976794);
            int S = cma1.S(btsVar);
            f530 d = androidx.compose.ui.b.d(btsVar, k);
            r1b0 o = btsVar.o();
            ohd.G1.getClass();
            final sls slsVar = androidx.compose.ui.node.d.b;
            btsVar.f0(1405779621);
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(new sls() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        return sls.this.invoke();
                    }
                });
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a.a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            tse0.t(btsVar, true, false, false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: coil.compose.AsyncImageKt$Content$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    b.d(f530.this, dVar, str, jt1Var, nheVar, f, wecVar, z, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final d e(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(-1494234083);
        tls tlsVar = d.N;
        qav qavVar = (qav) btsVar.m(h.a);
        if (qavVar == null) {
            qavVar = h2b1.f((Context) btsVar.m(AndroidCompositionLocals_androidKt.b));
        }
        d f = sd90.f(str, qavVar, AsyncImagePainter$Companion$DefaultTransform$1.w, null, mhe.b, 1, btsVar, 64);
        btsVar.t(false);
        return f;
    }
}

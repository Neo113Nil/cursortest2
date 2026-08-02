package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;

/* loaded from: classes5.dex */
public abstract class hn1 {
    public static final long a = rzo.f(2986344448L);

    public static final void a(final CharSequence charSequence, final CharSequence charSequence2, final boolean z, final boolean z2, final int i, final boolean z3, final sls slsVar, final sls slsVar2, final sls slsVar3, final sls slsVar4, final sls slsVar5, final tls tlsVar, fid fidVar, final int i2) {
        int i3;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1651196064);
        dmw0 dmw0Var = btsVar2.a;
        if ((i2 & 6) == 0) {
            i3 = (btsVar2.e(charSequence) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar2.e(charSequence2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar2.a(z) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.a(z2) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.c(150) ? 16384 : 8192;
        }
        if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
            i3 |= btsVar2.b(91.0f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= btsVar2.c(i) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= btsVar2.a(z3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= btsVar2.e(slsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= btsVar2.e(slsVar2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i4 = i3;
        int i5 = 3078 | (btsVar2.e(slsVar4) ? 32 : 16) | (btsVar2.e(slsVar5) ? 256 : 128);
        if (btsVar2.V(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            WeakHashMap weakHashMap = a.w;
            float d = w8a1.f(vuz.o(btsVar2).f, btsVar2).d();
            float f = ((y7m) y6i0.a(new y7m(z2 ? 22.0f : 113.0f), new y7m(0.0f))).a;
            tbn tbnVar = ubn.d;
            m3u0 a2 = b.a(f, sb2.K(150, 0, tbnVar, 2), "spacer_animation", null, btsVar2, 384, 8);
            m3u0 b = b.b(z2 ? 1.0f : 0.0f, sb2.K(150, 0, tbnVar, 2), "aperture_animation", null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 20);
            k3r k3rVar = ljs0.c;
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar2, k3rVar);
            ohd.G1.getClass();
            sls slsVar6 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar6);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, d2);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d3);
            sic a3 = qic.a(lr20.c, x4c.H, btsVar2, 48);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar2, k3rVar);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar6);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a3);
            qje.W(btsVar2, wlsVar2, o2);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar3);
            }
            qje.W(btsVar2, wlsVar4, d4);
            oeb1.c(btsVar2, o9a1.f(vuz.o(btsVar2).f));
            float f2 = ((y7m) a2.getValue()).a + 56.0f;
            c530 c530Var = c530.a;
            oeb1.c(btsVar2, ljs0.e(c530Var, f2));
            if (z3 || z2) {
                btsVar2.e0(-472139822);
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = new a0(6, tlsVar);
                    btsVar2.o0(Q);
                }
                mq61.a(eja1.y(c530Var, (tls) Q), btsVar2, 0);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-471882274);
                btsVar2.t(false);
            }
            uic uicVar = uic.a;
            oeb1.c(btsVar2, uicVar.b(c530Var, 1.0f, true));
            g.b(uicVar, (z || z2) ? false : true, null, v2o.a, k.f(sb2.K(150, 0, null, 6), 2), null, wwg.S(163106060, true, new zls() { // from class: en1
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    dn1.a(charSequence2, slsVar, slsVar2, slsVar3, i, z3, (fid) obj2, 0);
                    return zy11.a;
                }
            }, btsVar2), btsVar2, 1572870, 18);
            btsVar2.t(true);
            float f3 = 56.0f + ((y7m) a2.getValue()).a + d;
            g.e(z, null, k.e(sb2.K(150, 0, null, 6), 2), k.f(sb2.K(SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND, 0, null, 6), 2), null, wwg.S(-2008076734, true, new fn1(f3, slsVar4, slsVar5, 0), btsVar2), btsVar2, ((i4 >> 6) & 14) | ImageMetadata.EDGE_MODE, 18);
            btsVar = btsVar2;
            if (((Number) b.getValue()).floatValue() > 0.0f) {
                btsVar.e0(1401926606);
                mq61.b(((Number) b.getValue()).floatValue(), f3, ldc.b, btsVar, 384);
                btsVar.t(false);
            } else {
                btsVar.e0(1402105352);
                btsVar.t(false);
            }
            if (z) {
                btsVar.e0(1402366248);
                btsVar.t(false);
            } else {
                btsVar.e0(1402155789);
                fqa1.a(((i4 << 3) & 112) | 384 | ((i5 << 3) & 7168), btsVar, slsVar5, i9a1.f(c530Var), charSequence);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: gn1
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i2 | 1);
                    hn1.a(charSequence, charSequence2, z, z2, i, z3, slsVar, slsVar2, slsVar3, slsVar4, slsVar5, tlsVar, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }
}

package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: EqualizerGraph.kt */
/* loaded from: classes3.dex */
public final class wtp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ytp ytpVar, final boolean z, final izs izsVar, final wzs wzsVar, final q630 q630Var, jai jaiVar, final jai jaiVar2, final gzs gzsVar, final rtp rtpVar, xtp xtpVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final xtp xtpVar2;
        float f;
        float f2;
        int i2;
        final xtp xtpVar3;
        cri.a.e eVar;
        cri.a.b bVar;
        Object obj;
        cri.a.e eVar2;
        cri.a.d dVar;
        Object obj2;
        Path path;
        long j;
        q630.a aVar3;
        a.C0011a.C0012a c0012a;
        cri.a.e eVar3;
        int i3;
        cri.a.C2678a c2678a;
        cri.a.b bVar2;
        int i4;
        a.C0011a.C0012a c0012a2;
        boolean z2;
        Object x;
        ytp ytpVar2 = ytpVar;
        izs izsVar2 = izsVar;
        jai jaiVar3 = jaiVar;
        androidx.compose.runtime.a M = aVar.M(-1908265502);
        int i5 = (i & 6) == 0 ? (M.J(ytpVar2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= M.y(izsVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= M.y(wzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= M.y(jaiVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= M.y(jaiVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= M.y(gzsVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= M.J(rtpVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= 268435456;
        }
        if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                float f3 = 200;
                float f4 = 24;
                float f5 = 1;
                float f6 = 1;
                float f7 = 2;
                float f8 = 1;
                float f9 = 1;
                float f10 = 16;
                float f11 = 10;
                int i6 = i5;
                float f12 = 6;
                if (androidx.compose.runtime.b.d()) {
                    f = f12;
                    f2 = f9;
                    androidx.compose.runtime.b.f(2143315761, 0, 6, "com.vk.music.design.compose.equalizer.EqualizerGraphDefaults.sizes (EqualizerGraph.kt:249)");
                } else {
                    f = f12;
                    f2 = f9;
                }
                xtp xtpVar4 = new xtp(f3, f4, f5, f6, f7, f8, f2, f10, f11, f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i2 = i6 & (-1879048193);
                xtpVar3 = xtpVar4;
            } else {
                M.h();
                i2 = i5 & (-1879048193);
                xtpVar3 = xtpVar;
            }
            int i7 = i2;
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1908265502, i7, -1, "com.vk.music.design.compose.equalizer.EqualizerGraph (EqualizerGraph.kt:53)");
            }
            int i8 = i7 >> 12;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar4 = cri.a.e;
            k9q0.w(M, D, eVar4);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            q630.a aVar5 = q630.a.a;
            q630 E = ahn.E(s200.H(txj0.h(txj0.f(aVar5, 1.0f), xtpVar3.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xtpVar3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "equalizerFreqBlock");
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar4);
            ur.d(hashCode2, M, bVar3, M, c2678a2);
            k9q0.w(M, c2, dVar2);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (x2 == c0012a3) {
                eVar = eVar4;
                x2 = androidx.compose.runtime.k.b(new mxj0((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L)));
                M.R(x2);
            } else {
                eVar = eVar4;
            }
            final wh50 wh50Var = (wh50) x2;
            int i9 = i7 & 14;
            boolean p = M.p(((mxj0) wh50Var.getValue()).a) | (i9 == 4);
            Object x3 = M.x();
            if (p || x3 == c0012a3) {
                androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
                bVar = bVar3;
                b(a2, ytpVar2, ((mxj0) wh50Var.getValue()).a, 1.0f);
                M.R(a2);
                obj = a2;
            } else {
                bVar = bVar3;
                obj = x3;
            }
            final Path path2 = (Path) obj;
            boolean p2 = M.p(((mxj0) wh50Var.getValue()).a) | (i9 == 4);
            Object x4 = M.x();
            if (p2 || x4 == c0012a3) {
                androidx.compose.ui.graphics.a a3 = androidx.compose.ui.graphics.b.a();
                eVar2 = eVar;
                dVar = dVar2;
                b(a3, ytpVar2, ((mxj0) wh50Var.getValue()).a, 0.8f);
                M.R(a3);
                obj2 = a3;
            } else {
                eVar2 = eVar;
                dVar = dVar2;
                obj2 = x4;
            }
            Path path3 = (Path) obj2;
            boolean p3 = (i9 == 4) | M.p(((mxj0) wh50Var.getValue()).a);
            Object x5 = M.x();
            Object obj3 = x5;
            if (p3 || x5 == c0012a3) {
                androidx.compose.ui.graphics.a a4 = androidx.compose.ui.graphics.b.a();
                b(a4, ytpVar2, ((mxj0) wh50Var.getValue()).a, 0.7f);
                M.R(a4);
                obj3 = a4;
            }
            final Path path4 = (Path) obj3;
            q630 h = txj0.h(txj0.f(aVar5, 1.0f), xtpVar3.c);
            if (z) {
                path = path3;
                j = rtpVar.a;
            } else {
                path = path3;
                j = rtpVar.h;
            }
            cri.a.e eVar5 = eVar2;
            ja8.a(hr80.m(h, j, androidx.compose.ui.graphics.e.a), M, 0);
            q630 c3 = txj0.c(txj0.f(aVar5, 1.0f), 1.0f);
            final Path path5 = path;
            boolean y = M.y(path4) | ((i7 & 112) == 32) | ((((i7 & 234881024) ^ 100663296) > 67108864 && M.J(rtpVar)) || (i7 & 100663296) == 67108864) | M.J(xtpVar3) | M.y(path5) | M.y(path2);
            Object x6 = M.x();
            if (y || x6 == c0012a3) {
                aVar3 = aVar5;
                c0012a = c0012a3;
                eVar3 = eVar5;
                i3 = i7;
                c2678a = c2678a2;
                bVar2 = bVar;
                i4 = 2048;
                izs izsVar3 = new izs() { // from class: xsna.ttp
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj4) {
                        oio oioVar = (oio) obj4;
                        wh50 wh50Var2 = wh50Var;
                        if (Float.intBitsToFloat((int) (((mxj0) wh50Var2.getValue()).a & 4294967295L)) != Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) || Float.intBitsToFloat((int) (((mxj0) wh50Var2.getValue()).a >> 32)) != Float.intBitsToFloat((int) (oioVar.d() >> 32))) {
                            wh50Var2.setValue(new mxj0(oioVar.d()));
                        }
                        boolean z3 = z;
                        rtp rtpVar2 = rtpVar;
                        long j2 = z3 ? rtpVar2.e : rtpVar2.l;
                        xtp xtpVar5 = xtpVar3;
                        oio.C0(oioVar, Path.this, j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new frm0(oioVar.I0(xtpVar5.g), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26), 52);
                        oio.C0(oioVar, path5, z3 ? rtpVar2.d : rtpVar2.k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new frm0(oioVar.I0(xtpVar5.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26), 52);
                        oio.C0(oioVar, path2, z3 ? rtpVar2.c : rtpVar2.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new frm0(oioVar.I0(xtpVar5.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26), 52);
                        return s3q0.a;
                    }
                };
                M.R(izsVar3);
                x6 = izsVar3;
            } else {
                aVar3 = aVar5;
                c0012a = c0012a3;
                eVar3 = eVar5;
                i3 = i7;
                c2678a = c2678a2;
                bVar2 = bVar;
                i4 = 2048;
            }
            xa4.i(6, M, (izs) x6, c3);
            float f13 = 1.0f;
            q630 f14 = txj0.f(aVar3, 1.0f);
            List<Short> list = ytpVar2.d;
            List<Short> list2 = ytpVar2.d;
            boolean z3 = false;
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(new j06(list.size()), dt1.a.k, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, f14);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D3, eVar3);
            ur.d(hashCode3, M, bVar2, M, c2678a);
            k9q0.w(M, c4, dVar);
            M.K(-2083729498);
            int size = list2.size();
            int i10 = 0;
            androidx.compose.runtime.a aVar6 = M;
            while (i10 < size) {
                short s = ytpVar2.b;
                int i11 = size;
                short s2 = ytpVar2.c;
                short shortValue = ytpVar2.get(i10).shortValue();
                String str = (String) izsVar2.invoke(Integer.valueOf(i10));
                int i12 = i3;
                boolean o = ((i12 & 7168) == i4 ? true : z3) | aVar6.o(i10);
                Object x7 = aVar6.x();
                if (o) {
                    c0012a2 = c0012a;
                } else {
                    c0012a2 = c0012a;
                    if (x7 != c0012a2) {
                        izs izsVar4 = (izs) x7;
                        z2 = (29360128 & i12) != 8388608;
                        x = aVar6.x();
                        if (!z2 || x == c0012a2) {
                            x = new utp(0, gzsVar);
                            aVar6.R(x);
                        }
                        int i13 = i12 << 9;
                        i3 = i12;
                        q630.a aVar7 = aVar3;
                        androidx.compose.runtime.a aVar8 = aVar6;
                        List<Short> list3 = list2;
                        xtp xtpVar5 = xtpVar3;
                        pup.c(s, s2, shortValue, str, z, xtpVar5, rtpVar, null, null, jaiVar2, izsVar4, (gzs) x, aVar8, (i13 & 57344) | ((i12 >> 6) & 3670016) | (i13 & 1879048192));
                        xtpVar3 = xtpVar5;
                        i10++;
                        f13 = 1.0f;
                        aVar6 = aVar8;
                        list2 = list3;
                        size = i11;
                        i4 = 2048;
                        c0012a = c0012a2;
                        z3 = false;
                        izsVar2 = izsVar;
                        aVar3 = aVar7;
                        ytpVar2 = ytpVar;
                    }
                }
                x7 = new hu1(wzsVar, i10, 2);
                aVar6.R(x7);
                izs izsVar42 = (izs) x7;
                if ((29360128 & i12) != 8388608) {
                }
                x = aVar6.x();
                if (!z2) {
                }
                x = new utp(0, gzsVar);
                aVar6.R(x);
                int i132 = i12 << 9;
                i3 = i12;
                q630.a aVar72 = aVar3;
                androidx.compose.runtime.a aVar82 = aVar6;
                List<Short> list32 = list2;
                xtp xtpVar52 = xtpVar3;
                pup.c(s, s2, shortValue, str, z, xtpVar52, rtpVar, null, null, jaiVar2, izsVar42, (gzs) x, aVar82, (i132 & 57344) | ((i12 >> 6) & 3670016) | (i132 & 1879048192));
                xtpVar3 = xtpVar52;
                i10++;
                f13 = 1.0f;
                aVar6 = aVar82;
                list2 = list32;
                size = i11;
                i4 = 2048;
                c0012a = c0012a2;
                z3 = false;
                izsVar2 = izsVar;
                aVar3 = aVar72;
                ytpVar2 = ytpVar;
            }
            List<Short> list4 = list2;
            q630.a aVar9 = aVar3;
            aVar2 = aVar6;
            aVar2.j();
            aVar2.G();
            aVar2.G();
            q630 f15 = txj0.f(aVar9, f13);
            j06 j06Var = new j06(list4.size());
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(j06Var, dt1.a.k, aVar2, 0);
            int hashCode4 = Long.hashCode(n34.n(aVar2));
            sy90 D4 = aVar2.D();
            q630 c5 = qri.c(aVar2, f15);
            cri.h7.getClass();
            LayoutNode.a aVar10 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar10);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a6, cri.a.f);
            k9q0.w(aVar2, D4, cri.a.e);
            k9q0.w(aVar2, Integer.valueOf(hashCode4), cri.a.g);
            k9q0.t(aVar2, cri.a.h);
            k9q0.w(aVar2, c5, cri.a.d);
            aVar2.K(-1647819822);
            int size2 = list4.size();
            for (int i14 = 0; i14 < size2; i14++) {
                jaiVar.invoke(Integer.valueOf(i14), aVar2, Integer.valueOf(i8 & 112));
            }
            jaiVar3 = jaiVar;
            aVar2.j();
            aVar2.G();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            xtpVar2 = xtpVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            xtpVar2 = xtpVar;
        }
        androidx.compose.runtime.f s3 = aVar2.s();
        if (s3 != null) {
            final jai jaiVar4 = jaiVar3;
            s3.d = new wzs() { // from class: xsna.vtp
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    wtp.a(ytp.this, z, izsVar, wzsVar, q630Var, jaiVar4, jaiVar2, gzsVar, rtpVar, xtpVar2, (androidx.compose.runtime.a) obj4, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.ui.graphics.a aVar, ytp ytpVar, long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32)) / (ytpVar.d.size() + 1);
        float f2 = 2;
        float f3 = intBitsToFloat / f2;
        aVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
        float f4 = intBitsToFloat2 / f2;
        short shortValue = ytpVar.get(0).shortValue();
        short s = ytpVar.b;
        short s2 = ytpVar.c;
        aVar.b(f4, f3, f4, c(shortValue, s, s2, intBitsToFloat, f), intBitsToFloat2, c(ytpVar.get(0).shortValue(), s, s2, intBitsToFloat, f));
        int size = ytpVar.d.size();
        int i = 1;
        while (i < size) {
            int i2 = i + 1;
            float f5 = i2 * intBitsToFloat2;
            float f6 = ((i * intBitsToFloat2) + f5) / f2;
            aVar.b(f6, c(ytpVar.get(i - 1).shortValue(), s, s2, intBitsToFloat, f), f6, c(ytpVar.get(i).shortValue(), s, s2, intBitsToFloat, f), f5, c(ytpVar.get(i).shortValue(), s, s2, intBitsToFloat, f));
            s = s;
            i = i2;
            s2 = s2;
        }
        aVar.b((((e43.h(ytpVar) + 1) * intBitsToFloat2) + ((e43.h(ytpVar) + 2) * intBitsToFloat2)) / f2, c(((Number) j5g.i0(ytpVar)).shortValue(), s, s2, intBitsToFloat, f), (((e43.h(ytpVar) + 1) * intBitsToFloat2) + ((e43.h(ytpVar) + 2) * intBitsToFloat2)) / f2, f3, (e43.h(ytpVar) + 2) * intBitsToFloat2, f3);
    }

    public static final float c(short s, short s2, short s3, float f, float f2) {
        float abs;
        float f3;
        float f4 = f / 2;
        if (s > 0) {
            abs = s * f2;
            f3 = s3;
        } else {
            abs = Math.abs(s) * f2;
            f3 = s2;
        }
        return f4 - ((abs / f3) * f4);
    }
}

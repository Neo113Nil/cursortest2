package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.fgo0;
import xsna.kgo0;
import xsna.q630;

/* compiled from: TextField.kt */
/* loaded from: classes11.dex */
public final class jgo0 {
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04c6, code lost:
    
        if (r1.y(r0) != false) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x055d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wzs wzsVar, final wzs wzsVar2, yzs yzsVar, final wzs wzsVar3, final wzs wzsVar4, final wzs wzsVar5, wzs wzsVar6, final boolean z, final kgo0.b bVar, final fgo0.b bVar2, final jai jaiVar, wzs wzsVar7, s890 s890Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        s890 s890Var2;
        wzs wzsVar8;
        yzs yzsVar2;
        wzs wzsVar9;
        androidx.compose.runtime.a aVar2;
        wzs wzsVar10;
        Object ngo0Var;
        q630.a aVar3;
        int i5;
        int i6;
        dt1.c cVar;
        int i7;
        float f;
        Object obj;
        boolean z2;
        Object x;
        androidx.compose.runtime.a M = aVar.M(-1086465551);
        int i8 = i & 6;
        q630.a aVar4 = q630.a.a;
        if (i8 == 0) {
            i3 = i | (M.J(aVar4) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(wzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(wzsVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(yzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.y(wzsVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.y(wzsVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.y(wzsVar5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= M.y(wzsVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= M.l(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.J(bVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i9 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? M.J(bVar2) : M.y(bVar2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(jaiVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.y(wzsVar7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= M.J(s890Var) ? 2048 : 1024;
        }
        int i10 = i4;
        if (M.t(i9 & 1, ((i9 & 306783379) == 306783378 && (i10 & 1171) == 1170) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1086465551, i9, i10, "androidx.compose.material3.TextFieldLayout (TextField.kt:671)");
            }
            float e = fgo0.e(M);
            int i11 = i10 & 14;
            boolean n = ((234881024 & i9) == 67108864) | ((1879048192 & i9) == 536870912) | (i11 == 4 || ((i10 & 8) != 0 && M.J(bVar2))) | ((i10 & 7168) == 2048) | M.n(e);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (n || x2 == c0012a) {
                s890Var2 = s890Var;
                aVar2 = M;
                aVar3 = aVar4;
                i5 = i10;
                ngo0Var = new ngo0(z, bVar, bVar2, s890Var2, e);
                aVar2.R(ngo0Var);
            } else {
                aVar2 = M;
                ngo0Var = x2;
                aVar3 = aVar4;
                s890Var2 = s890Var;
                i5 = i10;
            }
            ngo0 ngo0Var2 = (ngo0) ngo0Var;
            LayoutDirection layoutDirection = (LayoutDirection) aVar2.r(uvi.n);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(aVar2, ngo0Var2, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(aVar2, D, eVar);
            cri.a.b bVar3 = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar3);
            }
            cri.a.d dVar = cri.a.d;
            k9q0.w(aVar2, c, dVar);
            jaiVar.invoke(aVar2, Integer.valueOf((i5 >> 3) & 14));
            if (wzsVar3 != null) {
                aVar2.K(-1445181094);
                q630 u = vua0.u(aVar3, "Leading");
                icv icvVar = zax.a;
                q630 g = u.g(zr20.a);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int m2 = n34.m(aVar2);
                sy90 D2 = aVar2.D();
                q630 c2 = qri.c(aVar2, g);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d, cVar2);
                k9q0.w(aVar2, D2, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m2))) {
                    kr.a(m2, aVar2, m2, bVar3);
                }
                k9q0.w(aVar2, c2, dVar);
                wzsVar3.invoke(aVar2, Integer.valueOf((i9 >> 12) & 14));
                aVar2.G();
                aVar2.j();
            } else {
                aVar2.K(-1444935078);
                aVar2.j();
            }
            if (wzsVar4 != null) {
                aVar2.K(-1444892360);
                q630 u2 = vua0.u(aVar3, "Trailing");
                icv icvVar2 = zax.a;
                q630 g2 = u2.g(zr20.a);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, false);
                int m3 = n34.m(aVar2);
                sy90 D3 = aVar2.D();
                q630 c3 = qri.c(aVar2, g2);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d2, cVar2);
                k9q0.w(aVar2, D3, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m3))) {
                    kr.a(m3, aVar2, m3, bVar3);
                }
                k9q0.w(aVar2, c3, dVar);
                wzsVar4.invoke(aVar2, Integer.valueOf((i9 >> 15) & 14));
                aVar2.G();
                aVar2.j();
            } else {
                aVar2.K(-1444644422);
                aVar2.j();
            }
            float s = s200.s(s890Var2, layoutDirection);
            float r = s200.r(s890Var2, layoutDirection);
            float f2 = fgo0.f(aVar2);
            if (wzsVar3 != null) {
                s -= f2;
                i6 = 0;
                float f3 = 0;
                if (s < f3) {
                    s = f3;
                }
            } else {
                i6 = 0;
            }
            float f4 = s;
            if (wzsVar4 != null) {
                r -= f2;
                float f5 = i6;
                if (r < f5) {
                    r = f5;
                }
            }
            float f6 = r;
            if (wzsVar5 != null) {
                aVar2.K(-1443868027);
                q630 H = s200.H(txj0.z(txj0.j(fgo0.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, vua0.u(aVar3, "Prefix")), null, 3), f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fgo0.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                dt1.a.getClass();
                cp10 d3 = ja8.d(dt1.a.b, false);
                int m4 = n34.m(aVar2);
                sy90 D4 = aVar2.D();
                q630 c4 = qri.c(aVar2, H);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d3, cVar2);
                k9q0.w(aVar2, D4, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m4))) {
                    kr.a(m4, aVar2, m4, bVar3);
                }
                k9q0.w(aVar2, c4, dVar);
                wzsVar5.invoke(aVar2, Integer.valueOf((i9 >> 18) & 14));
                aVar2.G();
                aVar2.j();
            } else {
                aVar2.K(-1443540326);
                aVar2.j();
            }
            if (wzsVar6 != null) {
                aVar2.K(-1443497081);
                q630 H2 = s200.H(txj0.z(txj0.j(fgo0.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, vua0.u(aVar3, "Suffix")), null, 3), fgo0.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                dt1.a.getClass();
                cp10 d4 = ja8.d(dt1.a.b, false);
                int m5 = n34.m(aVar2);
                sy90 D5 = aVar2.D();
                q630 c5 = qri.c(aVar2, H2);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d4, cVar2);
                k9q0.w(aVar2, D5, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m5))) {
                    kr.a(m5, aVar2, m5, bVar3);
                }
                k9q0.w(aVar2, c5, dVar);
                wzsVar9 = wzsVar6;
                wzsVar9.invoke(aVar2, Integer.valueOf((i9 >> 21) & 14));
                aVar2.G();
                aVar2.j();
            } else {
                wzsVar9 = wzsVar6;
                aVar2.K(-1443171302);
                aVar2.j();
            }
            q630 H3 = s200.H(aVar3, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            if (wzsVar2 != null) {
                aVar2.K(-1442671489);
                q630 u3 = vua0.u(aVar3, "Label");
                if (i11 != 4) {
                    if ((i5 & 8) != 0) {
                        obj = bVar2;
                    } else {
                        obj = bVar2;
                    }
                    z2 = false;
                    x = aVar2.x();
                    if (!z2 || x == c0012a) {
                        x = new so40(obj, 29);
                        aVar2.R(x);
                    }
                    q630 g3 = txj0.z(dd80.i(u3, new he30((gzs) x, 2)), null, 3).g(H3);
                    dt1.a.getClass();
                    cp10 d5 = ja8.d(dt1.a.b, false);
                    int m6 = n34.m(aVar2);
                    sy90 D6 = aVar2.D();
                    q630 c6 = qri.c(aVar2, g3);
                    if (aVar2.N() != null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar5);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d5, cVar2);
                    k9q0.w(aVar2, D6, eVar);
                    if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m6))) {
                        kr.a(m6, aVar2, m6, bVar3);
                    }
                    k9q0.w(aVar2, c6, dVar);
                    wzsVar2.invoke(aVar2, Integer.valueOf((i9 >> 6) & 14));
                    aVar2.G();
                    aVar2.j();
                    cVar = null;
                } else {
                    obj = bVar2;
                }
                z2 = true;
                x = aVar2.x();
                if (!z2) {
                }
                x = new so40(obj, 29);
                aVar2.R(x);
                q630 g32 = txj0.z(dd80.i(u3, new he30((gzs) x, 2)), null, 3).g(H3);
                dt1.a.getClass();
                cp10 d52 = ja8.d(dt1.a.b, false);
                int m62 = n34.m(aVar2);
                sy90 D62 = aVar2.D();
                q630 c62 = qri.c(aVar2, g32);
                if (aVar2.N() != null) {
                }
            } else {
                cVar = null;
                aVar2.K(-1442276518);
                aVar2.j();
            }
            q630 z3 = txj0.z(txj0.j(fgo0.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), cVar, 3);
            if (wzsVar5 == null) {
                f = f4;
                i7 = 0;
            } else {
                i7 = 0;
                f = 0;
            }
            q630 H4 = s200.H(z3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wzsVar9 == null ? f6 : i7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            if (yzsVar != null) {
                aVar2.K(-1441906533);
                yzsVar2 = yzsVar;
                yzsVar2.invoke(vua0.u(aVar3, "Hint").g(H4), aVar2, Integer.valueOf((i9 >> 6) & 112));
                aVar2.j();
            } else {
                yzsVar2 = yzsVar;
                aVar2.K(-1441815238);
                aVar2.j();
            }
            q630 g4 = vua0.u(aVar3, "TextField").g(H4);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d6 = ja8.d(ty6Var, true);
            int m7 = n34.m(aVar2);
            sy90 D7 = aVar2.D();
            q630 c7 = qri.c(aVar2, g4);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d6, cVar2);
            k9q0.w(aVar2, D7, eVar);
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m7))) {
                kr.a(m7, aVar2, m7, bVar3);
            }
            k9q0.w(aVar2, c7, dVar);
            wzsVar8 = wzsVar;
            wzsVar8.invoke(aVar2, Integer.valueOf((i9 >> 3) & 14));
            aVar2.G();
            if (wzsVar7 != null) {
                aVar2.K(-1441566587);
                q630 C = s200.C(txj0.z(txj0.j(fgo0.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, vua0.u(aVar3, "Supporting")), null, 3), qfo0.a());
                cp10 d7 = ja8.d(ty6Var, false);
                int m8 = n34.m(aVar2);
                sy90 D8 = aVar2.D();
                q630 c8 = qri.c(aVar2, C);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d7, cVar2);
                k9q0.w(aVar2, D8, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m8))) {
                    kr.a(m8, aVar2, m8, bVar3);
                }
                k9q0.w(aVar2, c8, dVar);
                wzsVar10 = wzsVar7;
                wzsVar10.invoke(aVar2, Integer.valueOf((i5 >> 6) & 14));
                aVar2.G();
                aVar2.j();
            } else {
                wzsVar10 = wzsVar7;
                aVar2.K(-1441177382);
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            s890Var2 = s890Var;
            wzsVar8 = wzsVar;
            yzsVar2 = yzsVar;
            wzsVar9 = wzsVar6;
            aVar2 = M;
            wzsVar10 = wzsVar7;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            final wzs wzsVar11 = wzsVar8;
            final wzs wzsVar12 = wzsVar9;
            final s890 s890Var3 = s890Var2;
            final wzs wzsVar13 = wzsVar10;
            final yzs yzsVar3 = yzsVar2;
            s2.d = new wzs() { // from class: xsna.igo0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    jgo0.a(wzs.this, wzsVar2, yzsVar3, wzsVar3, wzsVar4, wzsVar5, wzsVar12, z, bVar, bVar2, jaiVar, wzsVar13, s890Var3, (androidx.compose.runtime.a) obj2, I, I2);
                    return s3q0.a;
                }
            };
        }
    }
}

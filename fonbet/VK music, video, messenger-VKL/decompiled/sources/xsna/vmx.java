package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InternalSurface.kt */
/* loaded from: classes17.dex */
public final class vmx {
    public static final void a(final gzs gzsVar, final q630 q630Var, final boolean z, final r5j0 r5j0Var, final long j, final long j2, final y18 y18Var, final float f, final sg50 sg50Var, final buw buwVar, final String str, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1050809464);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(r5j0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.p(j) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= M.p(j2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= M.J(y18Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.n(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.J(sg50Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.J(buwVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.J(str) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(jaiVar) ? 32 : 16;
        }
        int i5 = i4;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1050809464, i3, i5, "com.vk.core.compose.component.internal.InternalSurface (InternalSurface.kt:102)");
            }
            pqo pqoVar = hbp.b;
            final float f2 = ((pco) M.r(pqoVar)).b + f;
            rvi.b(new c9e0[]{vcl0.b(j2, yfj.a), pqoVar.b(new pco(f2))}, kai.c(1417416776, new wzs() { // from class: xsna.smx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1417416776, intValue, -1, "com.vk.core.compose.component.internal.InternalSurface.<anonymous> (InternalSurface.kt:108)");
                        }
                        long e = vmx.e(j, (gbp) aVar2.r(hbp.a), f2, aVar2);
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.b;
                        cp10 d = ja8.d(ty6Var, true);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, q630Var);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar2, d, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar2, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar2, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar2, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar2, c, dVar);
                        ra8 ra8Var = ra8.a;
                        q630.a aVar4 = q630.a.a;
                        q630 a = ra8Var.a(aVar4);
                        float e2 = l5g.e(e);
                        r5j0 r5j0Var2 = r5j0Var;
                        ja8.a(vmx.c(a, r5j0Var2, e2, f), aVar2, 0);
                        q630 a2 = ojc.a(vmx.d(aVar4, r5j0Var2, e, y18Var), sg50Var, buwVar, z, str, new plg0(0), gzsVar);
                        cp10 d2 = ja8.d(ty6Var, true);
                        int hashCode2 = Long.hashCode(n34.n(aVar2));
                        sy90 D2 = aVar2.D();
                        q630 c2 = qri.c(aVar2, a2);
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d2, cVar);
                        k9q0.w(aVar2, D2, eVar);
                        ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                        k9q0.w(aVar2, c2, dVar);
                        jaiVar.invoke(aVar2, 0);
                        aVar2.G();
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.tmx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    vmx.a(gzs.this, q630Var, z, r5j0Var, j, j2, y18Var, f, sg50Var, buwVar, str, jaiVar, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final q630 q630Var, final r5j0 r5j0Var, final long j, final long j2, final y18 y18Var, final float f, final wzs wzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1775419936);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(r5j0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.p(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.p(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(y18Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.n(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(wzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1775419936, i2, -1, "com.vk.core.compose.component.internal.InternalSurface (InternalSurface.kt:44)");
            }
            pqo pqoVar = hbp.b;
            final float f2 = ((pco) M.r(pqoVar)).b + f;
            rvi.b(new c9e0[]{vcl0.b(j2, yfj.a), pqoVar.b(new pco(f2))}, kai.c(-782015136, new wzs() { // from class: xsna.qmx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-782015136, intValue, -1, "com.vk.core.compose.component.internal.InternalSurface.<anonymous> (InternalSurface.kt:50)");
                        }
                        long e = vmx.e(j, (gbp) aVar2.r(hbp.a), f2, aVar2);
                        Object x = aVar2.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = new p2u(3);
                            aVar2.R(x);
                        }
                        q630 b = egi0.b(q630Var, false, (izs) x);
                        s3q0 s3q0Var = s3q0.a;
                        Object x2 = aVar2.x();
                        if (x2 == c0012a) {
                            x2 = umx.a;
                            aVar2.R(x2);
                        }
                        q630 b2 = skn0.b(b, s3q0Var, (PointerInputEventHandler) x2);
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.b;
                        cp10 d = ja8.d(ty6Var, true);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, b2);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar2, d, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar2, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar2, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar2, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar2, c, dVar);
                        ra8 ra8Var = ra8.a;
                        q630.a aVar4 = q630.a.a;
                        q630 a = ra8Var.a(aVar4);
                        float e2 = l5g.e(e);
                        r5j0 r5j0Var2 = r5j0Var;
                        ja8.a(vmx.c(a, r5j0Var2, e2, f), aVar2, 0);
                        q630 d2 = vmx.d(aVar4, r5j0Var2, e, y18Var);
                        cp10 d3 = ja8.d(ty6Var, true);
                        int hashCode2 = Long.hashCode(n34.n(aVar2));
                        sy90 D2 = aVar2.D();
                        q630 c2 = qri.c(aVar2, d2);
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d3, cVar);
                        k9q0.w(aVar2, D2, eVar);
                        ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                        k9q0.w(aVar2, c2, dVar);
                        wzsVar.invoke(aVar2, 0);
                        aVar2.G();
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rmx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vmx.b(q630.this, r5j0Var, j, j2, y18Var, f, wzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final q630 c(q630 q630Var, r5j0 r5j0Var, float f, float f2) {
        q630 e = bu00.e(q630Var, new mi10(r5j0Var, 4));
        long j = udu.a;
        return a5j0.a(e, f2, r5j0Var, false, l5g.c(14, j, f), l5g.c(14, j, f));
    }

    public static final q630 d(q630 q630Var, r5j0 r5j0Var, long j, y18 y18Var) {
        q630 g;
        if (y18Var != null && (g = q630Var.g(r18.b(y18Var.a, y18Var.b, q630.a.a, r5j0Var))) != null) {
            q630Var = g;
        }
        return rte0.d(hr80.m(q630Var, j, r5j0Var), r5j0Var);
    }

    public static final long e(long j, gbp gbpVar, float f, androidx.compose.runtime.a aVar) {
        long j2;
        l5g c;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1705113234, 0, -1, "com.vk.core.compose.component.internal.surfaceColorAtElevation (InternalSurface.kt:197)");
        }
        if (gbpVar == null) {
            aVar.K(450318864);
            aVar.j();
            c = null;
            j2 = j;
        } else {
            aVar.K(-2063683567);
            j2 = j;
            c = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(gbpVar.a(j2, f, aVar, 0), aVar);
        }
        long j3 = c != null ? c.a : j2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j3;
    }
}

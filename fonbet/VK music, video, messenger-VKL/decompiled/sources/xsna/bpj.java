package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: ContextMenuUi.kt */
/* loaded from: classes11.dex */
public final class bpj {
    public static final mnj a;

    static {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        pqo pqoVar = nb2.a;
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.Inherit;
        SecureFlagPolicy secureFlagPolicy3 = SecureFlagPolicy.Inherit;
        long j = l5g.d;
        long j2 = l5g.b;
        a = new mnj(j, j2, j2, l5g.c(14, j2, 0.38f), l5g.c(14, j2, 0.38f));
    }

    public static final void a(mnj mnjVar, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-527864079);
        if ((i & 6) == 0) {
            i2 = (M.J(mnjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-527864079, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.kt:153)");
            }
            q630 D = p490.D(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, woj.i, 1, m200.G(hr80.m(a5j0.b(q630Var, woj.d, vog0.b(woj.e), false, 0L, 0L, 28), mnjVar.a, androidx.compose.ui.graphics.e.a), IntrinsicSize.Max)), p490.x(M), 14);
            int i3 = (i2 << 3) & 7168;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar.invoke(r9g.a, M, Integer.valueOf(((i3 >> 6) & 112) | 6));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yoj(i, 0, mnjVar, q630Var, jaiVar);
        }
    }

    public static final void b(q630 q630Var, mnj mnjVar, izs<? super boj, s3q0> izsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (M.J(mnjVar) ? 32 : 16);
        }
        int i7 = i4 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                q630Var = q630.a.a;
            }
            if (i6 != 0) {
                mnjVar = a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-625529233, i7, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder (ContextMenuUi.kt:132)");
            }
            a(mnjVar, q630Var, kai.c(-250345048, new xoj(0, izsVar, mnjVar), M), M, ((i7 >> 3) & 14) | 384 | ((i7 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        mnj mnjVar2 = mnjVar;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xv9(q630Var2, mnjVar2, izsVar, i, i2);
        }
    }

    public static final void c(String str, final boolean z, mnj mnjVar, q630 q630Var, yzs yzsVar, final gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        String str2;
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2001167027);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(mnjVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 2048 : 1024;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(yzsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(gzsVar) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2001167027, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
            }
            ty6.b bVar = woj.f;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = woj.h;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new gzs() { // from class: xsna.zoj
                    @Override // xsna.gzs
                    public final Object invoke() {
                        if (z) {
                            gzsVar.invoke();
                        }
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            q630 f2 = txj0.f(ojc.c(q630Var2, z, str2, null, (gzs) x, 12), 1.0f);
            float f3 = woj.a;
            float f4 = woj.b;
            float f5 = woj.c;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.t(f2, f3, f5, f4, f5));
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (yzsVar == null) {
                M.K(-1597947094);
                M.j();
            } else {
                M.K(-1597947093);
                float f6 = woj.j;
                q630 o = txj0.o(q630.a.a, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f6, 2);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, o);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar2, M, c2678a);
                k9q0.w(M, c2, dVar);
                yzsVar.invoke(new l5g(z ? mnjVar.c : mnjVar.e), M, 0);
                M.G();
                M.j();
            }
            nmo0 nmo0Var = new nmo0(z ? mnjVar.b : mnjVar.d, woj.m, woj.n, null, woj.p, null, null, woj.g, woj.o, null, null, 0, 16613240);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            aVar2 = M;
            bu6.b(str, new xpy(1.0f, true), nmo0Var, null, 0, false, 1, 0, null, aVar2, (i3 & 14) | 1572864, 952);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new apj(str, z, mnjVar, q630Var, yzsVar, gzsVar, i);
        }
    }
}

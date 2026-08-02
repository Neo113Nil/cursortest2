package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkFormField.kt */
/* loaded from: classes17.dex */
public final class nvu0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final g8s g8sVar, q630 q630Var, h8s h8sVar, e8s e8sVar, f8s f8sVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        int i5;
        int i6;
        final f8s f8sVar2;
        final h8s h8sVar2;
        final q630 q630Var3;
        final e8s e8sVar2;
        androidx.compose.runtime.f s;
        h8s h8sVar3;
        int i7;
        androidx.compose.runtime.a M = aVar.M(1643716608);
        if ((i & 6) == 0) {
            i3 = (M.J(g8sVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? M.J(h8sVar) : M.y(h8sVar) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= M.J(e8sVar) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= M.J(f8sVar) ? 16384 : 8192;
                    if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                        M.h();
                        f8sVar2 = f8sVar;
                        h8sVar2 = h8sVar;
                        q630Var3 = q630Var2;
                        e8sVar2 = e8sVar;
                    } else {
                        q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                        if (i4 != 0) {
                            i7 = i6;
                            h8sVar3 = null;
                        } else {
                            h8sVar3 = h8sVar;
                            i7 = i6;
                        }
                        e8s e8sVar3 = i5 != 0 ? null : e8sVar;
                        f8s f8sVar3 = i7 != 0 ? null : f8sVar;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1643716608, i3, -1, "com.vk.core.compose.component.form.VkFormField (VkFormField.kt:37)");
                        }
                        int i9 = i3 << 3;
                        b(g8sVar, true, q630Var4, h8sVar3, e8sVar3, f8sVar3, M, (i3 & 14) | 48 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var4;
                        h8sVar2 = h8sVar3;
                        e8sVar2 = e8sVar3;
                        f8sVar2 = f8sVar3;
                    }
                    s = M.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.lvu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nvu0.a(g8s.this, q630Var3, h8sVar2, e8sVar2, f8sVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                }
                s = M.s();
                if (s == null) {
                }
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
            }
            s = M.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void b(final g8s g8sVar, final boolean z, final q630 q630Var, final h8s h8sVar, final e8s e8sVar, f8s f8sVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        q630.a aVar2;
        float f;
        final f8s f8sVar2 = f8sVar;
        androidx.compose.runtime.a M = aVar.M(1641289508);
        if ((i & 6) == 0) {
            i2 = (M.J(g8sVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(h8sVar) : M.y(h8sVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(e8sVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(f8sVar2) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1641289508, i2, -1, "com.vk.core.compose.component.form.VkFormField (VkFormField.kt:56)");
            }
            float f2 = z ? kqu0.b : 0;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new wql0(12);
                M.R(x);
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.c, 1, egi0.b(q630Var, false, (izs) x));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630.a aVar4 = q630.a.a;
            if (h8sVar != null) {
                M.K(1075983401);
                rdi.u();
                hn20.a.a(i2 & 14, M);
                i3 = i2;
                aVar2 = aVar4;
                h8sVar.a(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 7)), M, (i3 >> 6) & 112);
                M.j();
            } else {
                i3 = i2;
                aVar2 = aVar4;
                if (z) {
                    M.K(1073831412);
                } else {
                    M.K(1076252078);
                    rdi.u();
                    hn20 hn20Var = hn20.a;
                    float f3 = hn20.f;
                    rdi.u();
                    hn20Var.a(i3 & 14, M);
                    f9t.e(txj0.h(aVar2, f3 + kqu0.t), M, 0);
                }
                M.j();
            }
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (!(((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, xpyVar);
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
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            ((zak0) g8sVar.a).setValue(Boolean.valueOf(e8sVar != null));
            ((zak0) g8sVar.b).setValue(new pco(f2));
            g8sVar.a(txj0.f(aVar2, 1.0f), M, ((i3 << 3) & 112) | 6);
            M.G();
            if (e8sVar == null) {
                M.K(-807070873);
                M.j();
                f = f2;
            } else {
                M.K(-807070872);
                float f4 = f2;
                q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                f = f4;
                rdi.u();
                q630 q = txj0.q(H, hn20.b);
                cp10 d2 = ja8.d(ty6Var, false);
                int hashCode4 = Long.hashCode(n34.n(M));
                sy90 D4 = M.D();
                q630 c4 = qri.c(M, q);
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
                k9q0.w(M, d2, cVar);
                k9q0.w(M, D4, eVar);
                ur.d(hashCode4, M, bVar, M, c2678a);
                k9q0.w(M, c4, dVar);
                e8sVar.a(ra8.a.b(aVar2, dt1.a.f), M, 0);
                M.G();
                s3q0 s3q0Var = s3q0.a;
                M.j();
            }
            M.G();
            if (f8sVar == null) {
                M.K(1077373006);
                M.j();
                f8sVar2 = f8sVar;
            } else {
                M.K(-935077357);
                f8sVar2 = f8sVar;
                f8sVar2.a(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), M, (i3 >> 12) & 112);
                M.j();
                s3q0 s3q0Var2 = s3q0.a;
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mvu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nvu0.b(g8s.this, z, q630Var, h8sVar, e8sVar, f8sVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}

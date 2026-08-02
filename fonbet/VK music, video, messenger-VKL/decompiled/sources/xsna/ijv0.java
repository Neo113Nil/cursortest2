package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkSeparator.kt */
/* loaded from: classes17.dex */
public final class ijv0 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final SeparatorDpi separatorDpi, SeparatorAppearance separatorAppearance, final boolean z, q630 q630Var, pco pcoVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        pco pcoVar2;
        SeparatorAppearance separatorAppearance2;
        androidx.compose.runtime.f s;
        float f;
        androidx.compose.runtime.a M = aVar.M(851433329);
        if ((i & 6) == 0) {
            i3 = (M.o(separatorDpi.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(separatorAppearance.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                pcoVar2 = pcoVar;
                i3 |= M.J(pcoVar2) ? 16384 : 8192;
                if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
                    q630.a aVar2 = q630.a.a;
                    if (i5 != 0) {
                        q630Var2 = aVar2;
                    }
                    if (i4 != 0) {
                        pcoVar2 = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(851433329, i3, -1, "com.vk.core.compose.component.VkColumnSpacingSeparator (VkSeparator.kt:63)");
                    }
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.c;
                    if (pcoVar2 == null) {
                        M.K(-2111308474);
                        float f2 = kki0.a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2125491092, 6, -1, "com.vk.core.compose.component.defaults.SeparatorDefaults.separatorMinSpacing (SeparatorDefaults.kt:19)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        f = kki0.b;
                        M.j();
                    } else {
                        M.K(-2111309435);
                        M.j();
                        f = pcoVar2.b;
                    }
                    q630 j = txj0.j(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var2);
                    if (z) {
                        j = j.g(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2));
                    }
                    cp10 d = ja8.d(ty6Var, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, j);
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
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    separatorAppearance2 = separatorAppearance;
                    if (dt.c(hr80.m(txj0.h(txj0.f(aVar2, 1.0f), kki0.a), kki0.a(separatorAppearance2, M, ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 384), androidx.compose.ui.graphics.e.a), M, 0)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    separatorAppearance2 = separatorAppearance;
                    M.h();
                }
                final pco pcoVar3 = pcoVar2;
                s = M.s();
                if (s != null) {
                    final SeparatorAppearance separatorAppearance3 = separatorAppearance2;
                    final q630 q630Var3 = q630Var2;
                    s.d = new wzs() { // from class: xsna.gjv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ijv0.a(SeparatorDpi.this, separatorAppearance3, z, q630Var3, pcoVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            pcoVar2 = pcoVar;
            if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            }
            final pco pcoVar32 = pcoVar2;
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        pcoVar2 = pcoVar;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
        }
        final pco pcoVar322 = pcoVar2;
        s = M.s();
        if (s != null) {
        }
    }

    public static final void b(final SeparatorDpi separatorDpi, final SeparatorAppearance separatorAppearance, final boolean z, final q630 q630Var, final pco pcoVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        float f;
        androidx.compose.runtime.a M = aVar.M(-344998577);
        if ((i & 3072) == 0) {
            i2 = (M.J(q630Var) ? 2048 : 1024) | i;
        } else {
            i2 = i;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(pcoVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-344998577, i2, -1, "com.vk.core.compose.component.VkRowSpacingSeparator (VkSeparator.kt:94)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            if (pcoVar == null) {
                M.K(-831135164);
                float f2 = kki0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2125491092, 6, -1, "com.vk.core.compose.component.defaults.SeparatorDefaults.separatorMinSpacing (SeparatorDefaults.kt:19)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f = kki0.b;
                M.j();
            } else {
                M.K(-831136094);
                M.j();
                f = pcoVar.b;
            }
            q630 x = txj0.x(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            q630.a aVar2 = q630.a.a;
            if (z) {
                x = x.g(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.c, 1, aVar2));
            }
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, x);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (dt.c(hr80.m(txj0.v(txj0.c(aVar2, 1.0f), kki0.a), kki0.a(separatorAppearance, M, 438), androidx.compose.ui.graphics.e.a), M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fjv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ijv0.b(SeparatorDpi.this, separatorAppearance, z, q630Var, pcoVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(SeparatorDpi separatorDpi, SeparatorAppearance separatorAppearance, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        SeparatorAppearance separatorAppearance2;
        final SeparatorDpi separatorDpi2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(11917308);
        if ((i & 6) == 0) {
            i3 = (M.o(separatorDpi.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(separatorAppearance.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            q630 q630Var3 = q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(11917308, i3, -1, "com.vk.core.compose.component.VkSeparator (VkSeparator.kt:41)");
            }
            separatorAppearance2 = separatorAppearance;
            a(separatorDpi, separatorAppearance2, false, q630Var3, null, M, (i3 & 14) | 384 | (i3 & 112) | ((i3 << 3) & 7168), 16);
            separatorDpi2 = separatorDpi;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
        } else {
            separatorAppearance2 = separatorAppearance;
            separatorDpi2 = separatorDpi;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final SeparatorAppearance separatorAppearance3 = separatorAppearance2;
            s.d = new wzs() { // from class: xsna.hjv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ijv0.c(SeparatorDpi.this, separatorAppearance3, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}

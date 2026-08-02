package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CoverCropActivity.kt */
/* loaded from: classes5.dex */
public final class j2k {
    public static final void a(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a M = aVar.M(89093850);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(89093850, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CloseIcon (CoverCropActivity.kt:349)");
            }
            gzsVar2 = gzsVar;
            nzu0.e(gzsVar2, s200.D(f9t.L(), 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, kn4.e, M, (i2 & 14) | 100663296, 252);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qma(gzsVar2, i, 1);
        }
    }

    public static final void b(final njw njwVar, final o5d0 o5d0Var, final gzs gzsVar, final gzs gzsVar2, final izs izsVar, final izs izsVar2, final lyd0 lyd0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1401416005);
        int i2 = i | (M.J(njwVar) ? 4 : 2) | (M.J(o5d0Var) ? 32 : 16) | (M.y(gzsVar2) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192) | (M.y(izsVar2) ? 131072 : 65536) | (M.y(lyd0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1401416005, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.Editor (CoverCropActivity.kt:326)");
            }
            agw agwVar = (agw) njwVar.c;
            gzs<Boolean> gzsVar3 = o5d0Var.a;
            int i3 = o5d0Var.b;
            s890 s890Var = o5d0Var.c;
            q630 d = txj0.d(q630.a.a, 1.0f);
            boolean z = i3 == 0;
            boolean J = M.J(s890Var);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new dnh(s890Var, 9);
                M.R(x);
            }
            f760.c(njwVar, gzsVar3, z, izsVar, (gzs) x, d, gzsVar, agwVar, M, (i2 & 14) | 196608 | ((i2 >> 3) & 7168) | 1572864);
            if (gzsVar3.invoke().booleanValue()) {
                M.K(1793678984);
                c(i3, izsVar2, lyd0Var, M, (i2 >> 12) & 1008);
                M.j();
            } else {
                M.K(1793746533);
                a(gzsVar2, M, (i2 >> 9) & 14);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(o5d0Var, gzsVar, gzsVar2, izsVar, izsVar2, lyd0Var, i) { // from class: xsna.g2k
                public final /* synthetic */ o5d0 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ izs g;
                public final /* synthetic */ lyd0 h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    j2k.b(njw.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, final izs izsVar, final lyd0 lyd0Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-914857672);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(lyd0Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-914857672, i3, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.Preview (CoverCropActivity.kt:298)");
            }
            q630 e = rte0.e(s200.H(f9t.L(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, e);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f = 16;
            q630 d2 = rte0.d(s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), vog0.b(8));
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, d2);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            ejv0.a(null, Integer.valueOf(i), false, null, kai.c(-514900673, new yzs() { // from class: xsna.h2k
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    y4i0 y4i0Var = (y4i0) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(y4i0Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-514900673, intValue, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.Preview.<anonymous>.<anonymous>.<anonymous> (CoverCropActivity.kt:311)");
                        }
                        izs izsVar2 = izsVar;
                        boolean J = aVar3.J(izsVar2);
                        Object x = aVar3.x();
                        if (J || x == a.C0011a.a) {
                            x = new lz0(izsVar2, 25);
                            aVar3.R(x);
                        }
                        j2k.f(y4i0Var, i, lyd0Var, (izs) x, aVar3, intValue & 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 << 3) & 112) | 24576, 13);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.d2k
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    j2k.c(i, izsVar, lyd0Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1693187786);
        int i2 = i | (M.y(gzsVar2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1693187786, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.PreviewAndApplyButtons (CoverCropActivity.kt:398)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(12);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            String N = d370.N(R.string.user_profile_cover_apply, 0, M);
            ButtonSize buttonSize = ButtonSize.Large;
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, ButtonStyle.Primary, ButtonAppearance.Accent, f, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, 28086, 0, 0, 4190176);
            bhu0.e(gzsVar2, buttonSize, ButtonStyle.Secondary, ButtonAppearance.Overlay, txj0.f(aVar4, 1.0f), null, false, false, null, null, null, d370.N(R.string.user_profile_cover_preview, 0, aVar2), null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | 28080, 0, 0, 4190176);
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
            s.d = new fo3(i, 1, gzsVar, gzsVar2, q630Var);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1567444736);
        int i2 = i | (M.y(gzsVar2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1567444736, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.PreviewAndEditButtons (CoverCropActivity.kt:427)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(12);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            String N = d370.N(R.string.user_profile_cover_apply, 0, M);
            ButtonSize buttonSize = ButtonSize.Large;
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, ButtonStyle.Primary, ButtonAppearance.Accent, f, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, 28086, 0, 0, 4190176);
            bhu0.e(gzsVar2, buttonSize, ButtonStyle.Secondary, ButtonAppearance.Overlay, txj0.f(aVar4, 1.0f), null, false, false, null, null, null, d370.N(R.string.user_profile_cover_return_to_edit, 0, aVar2), null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | 28080, 0, 0, 4190176);
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
            s.d = new xce(i, 1, gzsVar, gzsVar2, q630Var);
        }
    }

    public static final void f(final y4i0 y4i0Var, final int i, final lyd0 lyd0Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1179385280);
        if ((i2 & 6) == 0) {
            i3 = (M.J(y4i0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(lyd0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1179385280, i3, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.Segments (CoverCropActivity.kt:261)");
            }
            boolean z = i == 0;
            int i4 = i3 & 7168;
            boolean y = M.y(lyd0Var) | (i4 == 2048);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new defpackage.u(9, lyd0Var, izsVar);
                M.R(x);
            }
            boolean z2 = true;
            int i5 = ((i3 << 12) & 57344) | 384;
            y4i0Var.c(z, (gzs) x, kn4.c, null, M, i5, 8);
            boolean z3 = i == 1;
            if (i4 != 2048) {
                z2 = false;
            }
            boolean y2 = z2 | M.y(lyd0Var);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new ig1(10, izsVar, lyd0Var);
                M.R(x2);
            }
            y4i0Var.c(z3, (gzs) x2, kn4.d, null, M, i5, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.e2k
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j2k.f(y4i0.this, i, lyd0Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}

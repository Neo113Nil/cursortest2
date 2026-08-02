package xsna;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.pdt0;
import xsna.q630;
import xsna.wkj;

/* compiled from: VideoRestrictionPlaceholder.kt */
/* loaded from: classes16.dex */
public final class ndt0 {
    public static final void a(final pdt0 pdt0Var, final String str, final gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1691556910);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(pdt0Var) : M.y(pdt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1691556910, i3, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.BlurVideoRestrictionView (VideoRestrictionPlaceholder.kt:98)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (str == null) {
                M.K(793518511);
            } else {
                M.K(793518512);
                b(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, (i3 >> 3) & 14);
            }
            M.j();
            j(pdt0Var, gzsVar, ra8.a.b(aVar2, dt1.a.f), M, ((i3 >> 3) & 112) | (i3 & 14));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.jdt0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ndt0.a(pdt0.this, str, gzsVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(String str, final float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final String str2;
        androidx.compose.runtime.a M = aVar.M(126361391);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(126361391, i3, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.BlurredImageFromUrl (VideoRestrictionPlaceholder.kt:205)");
            }
            if (Build.VERSION.SDK_INT < 31) {
                M.K(2040997221);
                c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3 & 14, M, str, null);
                M.j();
                str2 = str;
            } else {
                M.K(2041056152);
                lg90 l = fwu0.l(str, null, null, null, M, i3 & 14, 62);
                str2 = str;
                vjw.a(l, null, jcr.c(txj0.d(q630.a.a, 1.0f), 16.0f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24632, 104);
                M = M;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f = 16.0f;
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kdt0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    ndt0.b(str2, f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(float f, final int i, androidx.compose.runtime.a aVar, final String str, q630 q630Var) {
        int i2;
        final float f2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-221734013);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | Tensorflow.FRAME_WIDTH;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-221734013, i3, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.LegacyBlurImage (VideoRestrictionPlaceholder.kt:225)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            agw r = xus.r(str, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, i3 & 14, 62);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            f2 = 16.0f;
            Float valueOf = Float.valueOf(16.0f);
            boolean y = M.y(r) | M.y(context) | ((i3 & 896) == 256);
            Object x2 = M.x();
            if (y || x2 == obj) {
                mdt0 mdt0Var = new mdt0(r, context, 16.0f, wh50Var, null);
                M.R(mdt0Var);
                x2 = mdt0Var;
            }
            bap.f(r, valueOf, (wzs) x2, M, (i3 >> 3) & 112);
            agw agwVar = (agw) wh50Var.getValue();
            q630Var2 = q630.a.a;
            if (agwVar == null) {
                M.K(-17555874);
            } else {
                M.K(-17555873);
                vjw.b(agwVar, txj0.d(q630Var2, 1.0f), wkj.a.a, M, 24624, 232);
                M = M;
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            f2 = f;
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ldt0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(i | 1);
                    ndt0.c(f2, I, (androidx.compose.runtime.a) obj2, str, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(pdt0 pdt0Var, String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        long j;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-258627378);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? M.J(pdt0Var) : M.y(pdt0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-258627378, i3, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.RestrictionIcon (VideoRestrictionPlaceholder.kt:255)");
            }
            if (pdt0Var instanceof pdt0.b) {
                M.K(567201339);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().l;
                M.j();
            } else {
                if (!(pdt0Var instanceof pdt0.a)) {
                    throw alb0.c(567198391, M);
                }
                M.K(567204058);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().c;
                M.j();
            }
            long j2 = j;
            q630.a aVar3 = q630.a.a;
            if (str == null) {
                M.K(403493691);
                M.j();
                aVar2 = aVar3;
            } else {
                M.K(403493692);
                aVar2 = aVar3;
                pzu0.b(fwu0.l(str, null, null, null, M, 0, 62), null, aVar2, j2, M, 56 | (i3 & 896), 0);
                M = M;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bku(i, 3, pdt0Var, str, q630Var2);
        }
    }

    public static final void e(pdt0 pdt0Var, frv0 frv0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-2026124956);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? M.J(pdt0Var) : M.y(pdt0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(frv0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2026124956, i3, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.RestrictionText (VideoRestrictionPlaceholder.kt:275)");
            }
            if (pdt0Var instanceof pdt0.b) {
                M.K(-1485889008);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().s;
                M.j();
            } else {
                if (!(pdt0Var instanceof pdt0.a)) {
                    throw alb0.c(-1485891956, M);
                }
                M.K(-1485886320);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().d;
                M.j();
            }
            String title = pdt0Var.getTitle();
            int i4 = ((i3 >> 3) & 112) | 100663296;
            int i5 = ((i3 << 6) & 7168) | 48;
            q630Var2 = q630.a.a;
            yqv0.c(title, q630Var2, j, null, null, 0, 3, null, 2, false, 0, 2, null, frv0Var, M, i4, i5, 5816);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xte0(pdt0Var, frv0Var, q630Var2, i, 1);
        }
    }

    public static final void f(pdt0 pdt0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-805186330);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(pdt0Var) : M.y(pdt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-805186330, i3, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.SimpleVideoRestrictionView (VideoRestrictionPlaceholder.kt:121)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            j(pdt0Var, gzsVar, ra8.a.b(aVar2, dt1.a.f), M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m3j0(pdt0Var, gzsVar, q630Var2, i, 2);
        }
    }

    public static final void g(pdt0 pdt0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-808342925);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(pdt0Var) : M.y(pdt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-808342925, i2, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.VideoRestrictionMobileTitle (VideoRestrictionPlaceholder.kt:186)");
            }
            q630 E = s200.E(q630Var, 8, 13);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = i2 & 14;
            d(pdt0Var, pdt0Var.a(), null, M, i3);
            if (pdt0Var.getTitle().length() > 0) {
                M.K(-517757117);
                if (a690.d(q630.a.a, 6, M, 6)) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                e(pdt0Var, wuv0Var.s0, null, M, i3);
            } else {
                M.K(-524326823);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rc50(pdt0Var, q630Var, i, 2);
        }
    }

    public static final void h(rdt0 rdt0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        pdt0 pdt0Var = rdt0Var.a;
        l8s0 l8s0Var = rdt0Var.c;
        Image image = rdt0Var.b;
        androidx.compose.runtime.a M = aVar.M(740137852);
        if ((i & 6) == 0) {
            i2 = (M.J(rdt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(740137852, i2, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.VideoRestrictionPlaceholder (VideoRestrictionPlaceholder.kt:60)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            boolean J = M.J(image) | M.J(l8s0Var) | M.J(azlVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                ImageSize Cb = image.Cb((int) azlVar.I0(l8s0Var.c), true, false);
                x = Cb != null ? Cb.d.d : null;
                M.R(x);
            }
            String str = (String) x;
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (pdt0Var instanceof pdt0.a) {
                M.K(858818458);
                aVar2 = M;
                a((pdt0.a) pdt0Var, str, gzsVar, null, aVar2, (i2 << 3) & 896);
                aVar2.j();
            } else {
                aVar2 = M;
                if (!(pdt0Var instanceof pdt0.b)) {
                    throw alb0.c(-1219224648, aVar2);
                }
                aVar2.K(-1219214645);
                f(rdt0Var.a, gzsVar, null, aVar2, i2 & 112);
                aVar2.j();
            }
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
            s.d = new hg8(i, 3, rdt0Var, gzsVar, q630Var);
        }
    }

    public static final void i(pdt0 pdt0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-697995485);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(pdt0Var) : M.y(pdt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-697995485, i2, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.VideoRestrictionTabletTitle (VideoRestrictionPlaceholder.kt:153)");
            }
            q630 E = s200.E(q630Var, 17, 16);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            int i3 = i2 & 14;
            d(pdt0Var, pdt0Var.a(), null, M, i3);
            boolean z = pdt0Var.getTitle().length() > 0;
            q630.a aVar4 = q630.a.a;
            if (z) {
                M.K(-1221898345);
                if (a690.d(aVar4, 8, M, 6)) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                e(pdt0Var, wuv0Var.T, null, M, i3);
            } else {
                M.K(-1227341015);
            }
            M.j();
            if (pdt0Var.o() == null || !(pdt0Var instanceof pdt0.b)) {
                aVar2 = M;
                aVar2.K(-1227341015);
            } else {
                M.K(-1221579324);
                f9t.e(txj0.h(aVar4, 12), M, 6);
                RestrictionButton restrictionButton = ((pdt0.b) pdt0Var).c;
                bhu0.e(gzsVar2, ButtonSize.Small, ButtonStyle.Secondary, ButtonAppearance.Neutral, null, null, false, false, null, null, null, restrictionButton != null ? restrictionButton.c : null, null, null, null, null, false, null, null, null, M, ((i2 >> 3) & 14) | X2.b.f, 0, 0, 4190192);
                aVar2 = M;
            }
            aVar2.j();
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
            s.d = new pt6(i, 5, pdt0Var, gzsVar, q630Var);
        }
    }

    public static final void j(pdt0 pdt0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-288558295);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(pdt0Var) : M.y(pdt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-288558295, i2, -1, "com.vk.catalog.mvi.block.video.impl.restriction.view.VideoRestrictionTitle (VideoRestrictionPlaceholder.kt:140)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                M.K(2084564074);
                i(pdt0Var, gzsVar, q630Var, M, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                M.j();
            } else {
                M.K(2084648115);
                g(pdt0Var, q630Var, M, (i2 & 14) | ((i2 >> 3) & 112));
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
            s.d = new pha(pdt0Var, gzsVar, q630Var, i, 7);
        }
    }
}

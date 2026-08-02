package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import xsna.chs;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: AttachedClips.kt */
/* loaded from: classes7.dex */
public final class p54 {
    public static final void a(final s44 s44Var, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(347466801);
        int i2 = i | (M.J(s44Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(347466801, i2, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.attachedclips.AttachedClip (AttachedClips.kt:114)");
            }
            uog0 b = vog0.b(4);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new defpackage.u(2, izsVar, s44Var);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            q630 d = rte0.d(ojc.c(aVar2, false, null, null, (gzs) x, 15), b);
            float f = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            fwu0.c(txj0.s(r18.a(f, ylu0Var.getImage().a, d, b), 79, VersionConstants.PRODUCT_MAJOR_VERSION), null, s44Var.b, null, null, null, null, kai.c(-1911097856, new a0t() { // from class: xsna.n54
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    String str;
                    q630.a aVar3;
                    qa8 qa8Var = (qa8) obj;
                    chs chsVar = (chs) obj2;
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar4.J(qa8Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar4.J(chsVar) ? 32 : 16;
                    }
                    if ((intValue & 384) == 0) {
                        i3 |= (intValue & 512) == 0 ? aVar4.J(lg90Var) : aVar4.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar4.t(i3 & 1, (i3 & 1171) != 1170)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1911097856, i3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.attachedclips.AttachedClip.<anonymous> (AttachedClips.kt:129)");
                        }
                        boolean z2 = chsVar instanceof chs.e;
                        q630.a aVar5 = q630.a.a;
                        if (z2 || (chsVar instanceof chs.d)) {
                            aVar4.K(570380145);
                            str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                            aVar3 = aVar5;
                            vjw.a(lg90Var, d370.N(R.string.clip, 0, aVar4), txj0.d(aVar5, 1.0f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, ((i3 >> 6) & 14) | 24968, 104);
                            aVar4.j();
                        } else {
                            if (!(chsVar instanceof chs.c) && !(chsVar instanceof chs.b) && !(chsVar instanceof chs.a)) {
                                throw alb0.c(1680964728, aVar4);
                            }
                            aVar4.K(570819570);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            ja8.a(txj0.d(hr80.m(aVar5, ylu0Var2.getBackground().a, androidx.compose.ui.graphics.e.a), 1.0f), aVar4, 0);
                            aVar4.j();
                            aVar3 = aVar5;
                            str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        }
                        dt1.a.getClass();
                        float f2 = 3;
                        q630 H = s200.H(qa8Var.b(aVar3, dt1.a.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9);
                        float f3 = 2;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, str);
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 a = r18.a(f3, ylu0Var3.m().c, H, vog0.a);
                        Object x2 = aVar4.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x2 == c0012a) {
                            x2 = ir.h(aVar4);
                        }
                        sg50 sg50Var = (sg50) x2;
                        izs izsVar2 = izs.this;
                        boolean J = aVar4.J(izsVar2);
                        s44 s44Var2 = s44Var;
                        boolean J2 = J | aVar4.J(s44Var2);
                        Object x3 = aVar4.x();
                        if (J2 || x3 == c0012a) {
                            x3 = new com.vk.movika.sdk.base.presenter.c(4, izsVar2, s44Var2);
                            aVar4.R(x3);
                        }
                        q630 A = txj0.A(txj0.q(ojc.b(a, sg50Var, null, false, null, (gzs) x3, 28), 22), dt1.a.f, true);
                        cp10 d2 = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar4));
                        sy90 D = aVar4.D();
                        q630 c = qri.c(aVar4, A);
                        cri.h7.getClass();
                        LayoutNode.a aVar6 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar6);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, d2, cri.a.f);
                        k9q0.w(aVar4, D, cri.a.e);
                        k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar4, cri.a.h);
                        k9q0.w(aVar4, c, cri.a.d);
                        qzu0.a.getClass();
                        pzu0.b(qzu0.E(aVar4), d370.N(R.string.setting_clip_icon_remove_talkback, 0, aVar4), null, l5g.k, aVar4, 3080, 4);
                        aVar4.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 100663296, 250);
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
            s.d = new o54(i, 0, s44Var, izsVar, q630Var2);
        }
    }

    public static final void b(b64 b64Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(250377347);
        int i2 = i | (M.J(b64Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(250377347, i2, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.attachedclips.AttachedClips (AttachedClips.kt:52)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "AttachedClipsTags.CELL");
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.setting_clip_title, 0, M), null, null, 1, null, null, M, 12610560, 102), Cell$Middle.c.b.b(d370.N(R.string.setting_clip_subtitle, 0, M), 2, null, null, null, M, 12583344, 120), null, null, M, 196608, 28);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new qm(2);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.u0 a3 = o.b.a.a(null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), 0L, false, M, 196608, 27);
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new r0(izsVar, 1);
                M.R(x2);
            }
            wiu0.b(E, false, null, a2, a3, (gzs) x2, null, M, 6, 70);
            aVar2 = M;
            c(b64Var, izsVar, null, aVar2, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
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
            s.d = new s0(i, 1, b64Var, izsVar, q630Var);
        }
    }

    public static final void c(b64 b64Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1071066107);
        if ((i & 6) == 0) {
            i2 = i | (M.J(b64Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1071066107, i3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.attachedclips.AttachedClipsList (AttachedClips.kt:92)");
            }
            u890 m = s200.m(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            a.j g = androidx.compose.foundation.layout.a.g(8);
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(txj0.f(aVar2, 1.0f), "AttachedClipsTags.LIST");
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new sh3(1, b64Var, izsVar);
                M.R(x);
            }
            z1v0.a(E, null, m, g, null, null, false, (izs) x, M, 24960, 234);
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
            s.d = new l54(i, 0, b64Var, izsVar, q630Var2);
        }
    }
}

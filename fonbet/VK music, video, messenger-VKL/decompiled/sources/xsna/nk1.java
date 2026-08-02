package xsna;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import xsna.cri;
import xsna.dt1;
import xsna.mto0;
import xsna.phw;
import xsna.q630;

/* compiled from: AlbumRedesign.kt */
/* loaded from: classes7.dex */
public final class nk1 {
    public static final void a(final rl1 rl1Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        String string;
        androidx.compose.runtime.a M = aVar.M(-592557807);
        int i2 = i | (M.J(rl1Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-592557807, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.album.AlbumRedesign (AlbumRedesign.kt:58)");
            }
            com.vk.core.compose.component.cell.content.j0 a = Cell$Left.Main.a.C0731a.a(kai.c(1391572040, new zzs() { // from class: xsna.ik1
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1391572040, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.album.AlbumRedesign.<anonymous> (AlbumRedesign.kt:60)");
                        }
                        nk1.b(rl1.this, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M);
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(rl1Var.c, null, null, 2, null, null, M, 12610560, 102);
            int i3 = rl1Var.g;
            Resources resources = ((Context) M.r(AndroidCompositionLocals_androidKt.b)).getResources();
            Lazy a3 = msy.a(LazyThreadSafetyMode.NONE, new kk1(0));
            long millis = TimeUnit.SECONDS.toMillis(i3);
            xuo0.a.getClass();
            if (xuo0.a() - millis < tni.l()) {
                string = resources.getString(R.string.video_album_updated_right_now);
            } else {
                ((StringBuffer) a3.getValue()).setLength(0);
                mto0.a(millis, (StringBuffer) a3.getValue(), mto0.a.C3369a.g);
                string = resources.getString(R.string.video_album_updated, (StringBuffer) a3.getValue());
            }
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(a2, Cell$Middle.c.b.b(string, 1, null, null, null, M, 12583344, 120), null, null, M, 196608, 28);
            boolean z = rl1Var.b;
            boolean z2 = rl1Var.a;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new qt0(1);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            int i4 = i2 & 112;
            int i5 = i2 & 14;
            boolean z3 = (i4 == 32) | (i5 == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new tx(2, (Object) rl1Var, izsVar);
                M.R(x2);
            }
            Triple triple = new Triple(a, a4, o.e.a.C0736a.a(z, (gzs) x2, z2, a5, M, 24576, 0));
            Cell$Left.Main.a aVar3 = (Cell$Left.Main.a) triple.d();
            Cell$Middle cell$Middle = (Cell$Middle) triple.g();
            o.e.a aVar4 = (o.e.a) triple.h();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x3;
            boolean z4 = rl1Var.a;
            boolean z5 = (i4 == 32) | (i5 == 4);
            Object x4 = M.x();
            if (z5 || x4 == c0012a) {
                x4 = new uk(2, izsVar, rl1Var);
                M.R(x4);
            }
            q630.a aVar5 = q630.a.a;
            wiu0.b(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 1, ojc.b(aVar5, sg50Var, null, z4, null, (gzs) x4, 24)), false, aVar3, cell$Middle, aVar4, null, null, M, 0, 98);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar5;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new jk1(i, 0, rl1Var, izsVar, q630Var2);
        }
    }

    public static final void b(rl1 rl1Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-458792434);
        int i2 = (M.J(rl1Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-458792434, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.album.PlaylistView (AlbumRedesign.kt:101)");
            }
            List list = rl1Var.f;
            ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ImageSize) it.next()).d.d);
            }
            float f = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
            q630.a aVar2 = q630.a.a;
            float f2 = 6;
            q630 d = rte0.d(txj0.h(txj0.v(aVar2, f), 76), vog0.b(f2));
            float f3 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 a = r18.a(f3, ylu0Var.getImage().a, d, vog0.b(f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(a, ylu0Var2.r().a, androidx.compose.ui.graphics.e.a);
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
            if (arrayList.isEmpty()) {
                M.K(631225710);
            } else {
                M.K(635594199);
                phw a2 = phw.a.a(fwu0.l(null, (String) j5g.i0(arrayList), null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
                M = M;
                a2.a(6, byc0.b(f, f), M, m);
            }
            M.j();
            List list2 = rl1Var.i;
            qow qowVar = list2 != null ? (qow) j5g.a0(new wow(list2)) : null;
            ty6 ty6Var = dt1.a.h;
            ra8 ra8Var = ra8.a;
            c(qowVar, ra8Var.b(aVar2, ty6Var), M, 0);
            d(rl1Var.h, 0, M, ra8Var.b(aVar2, dt1.a.g));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lk1(rl1Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(qow qowVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1778544632);
        int i2 = (M.J(qowVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1778544632, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.album.PrivacyIcon (AlbumRedesign.kt:143)");
            }
            lg90 lg90Var = null;
            PrivacySetting.PrivacyRule privacyRule = qowVar != null ? (PrivacySetting.PrivacyRule) qowVar.a : null;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-835371306, 0, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.album.getPrivacyIconRes (AlbumRedesign.kt:159)");
            }
            List O0 = privacyRule != null ? j5g.O0(privacyRule.zb()) : null;
            if (O0 == null || O0.equals(Collections.singletonList(PrivacyRules.a.d))) {
                M.K(-1505868473);
                M.j();
            } else if (O0.equals(Collections.singletonList(PrivacyRules.b.d)) || O0.equals(Collections.singletonList(PrivacyRules.c.d))) {
                M.K(-1505779037);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1519174268, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Lock16> (VkSdkIcons.kt:2148)");
                }
                lg90Var = or.b(M, 1650386415, R.drawable.vk_icon_lock_16, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (O0.equals(Collections.singletonList(PrivacyRules.e.d))) {
                M.K(367071358);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1888461922, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Linked16> (VkIcons.kt:6516)");
                }
                lg90Var = pg90.a(R.drawable.vk_icon_linked_16, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (O0.equals(Collections.singletonList(PrivacyRules.f.d))) {
                M.K(367073252);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1907735746, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DonutOutline16> (VkIcons.kt:2126)");
                }
                lg90Var = or.b(M, -1946446365, R.drawable.vk_icon_donut_outline_16, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (O0.equals(Collections.singletonList(PrivacyRules.g.d))) {
                M.K(367075388);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1213156898, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-User16> (VkIcons.kt:11076)");
                }
                lg90Var = or.b(M, -992484212, R.drawable.vk_icon_user_16, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(367076381);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1463876704, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Users16> (VkIcons.kt:11326)");
                }
                lg90Var = or.b(M, -746870387, R.drawable.vk_icon_users_16, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            lg90 lg90Var2 = lg90Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (lg90Var2 == null) {
                M.K(1906767663);
            } else {
                M.K(1906767664);
                q630 q = txj0.q(s200.D(q630Var, 8), 16);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(lg90Var2, null, q, ylu0Var.getIcon().c, M, 56, 0);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bc1(qowVar, q630Var, i, 1);
        }
    }

    public static final void d(int i, int i2, androidx.compose.runtime.a aVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1772596995);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.J(q630Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1772596995, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.album.VideosCountOverlay (AlbumRedesign.kt:181)");
            }
            q630 m = hr80.m(txj0.c(q630Var, 1.0f), f870.c(((Context) M.r(AndroidCompositionLocals_androidKt.b)).getColor(R.color.vk_black_alpha60)), androidx.compose.ui.graphics.e.a);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qzu0.a.getClass();
            float f = 10;
            pzu0.b(qzu0.D0(M), null, txj0.q(s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 2, 2), 20), wlb0.h(M).getIcon().c, M, 440, 0);
            aVar2 = M;
            yqv0.c(String.valueOf(i), null, wlb0.h(aVar2).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).l0, aVar2, 0, 0, 8186);
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
            s.d = new mk1(i, q630Var, i2);
        }
    }
}

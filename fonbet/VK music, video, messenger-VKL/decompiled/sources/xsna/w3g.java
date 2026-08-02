package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.core.compose.component.topbar.k;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import xsna.cri;
import xsna.q630;
import xsna.yqx0;

/* compiled from: CollapsableHeader.kt */
/* loaded from: classes6.dex */
public final class w3g {
    public static final void a(final x3g x3gVar, final izs izsVar, rmp rmpVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        final float I0;
        androidx.compose.runtime.a M = aVar.M(-830977759);
        int i2 = i | (M.J(x3gVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(rmpVar) ? 256 : 128) | 3072;
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-830977759, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.CollapsableHeader (CollapsableHeader.kt:49)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(txj0.z(txj0.f(aVar2, 1.0f), null, 3), "video_playlist_header");
            int i3 = i2 >> 6;
            int i4 = i3 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1872493286, i4, -1, "com.vk.video.playlist.playlistscreen.ui.view.rememberCollapseFraction (CollapsableHeader.kt:255)");
            }
            if (((i4 ^ 6) <= 4 || !M.J(rmpVar)) && (i3 & 6) != 4) {
                z = false;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = bbk0.b(new com.vk.movika.sdk.base.logic.processor.h(rmpVar, 21));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1244384783, 0, -1, "com.vk.video.playlist.playlistscreen.ui.view.getCoverHeight (CollapsableHeader.kt:162)");
            }
            M.K(-1852865799);
            iyk0 iyk0Var = uvi.h;
            azl azlVar = (azl) M.r(iyk0Var);
            iyk0 iyk0Var2 = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) M.r(iyk0Var2);
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                M.K(-1926060841);
                I0 = Math.max(azlVar.I0(((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp) / 6.0f, azlVar.I0(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE));
                M.j();
            } else {
                M.K(-1925791699);
                M.j();
                I0 = azlVar.I0(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final boolean d = fnj.d((Context) M.r(iyk0Var2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(594020756, 6, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:257)");
            }
            WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
            yjr0 yjr0Var = yqx0.a.c(M).o;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            b(kai.c(-1434170561, new n87(x3gVar, izsVar, mtk0Var), M), kai.c(277107806, new wzs() { // from class: xsna.q3g
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(277107806, intValue, -1, "com.vk.video.playlist.playlistscreen.ui.view.CollapsableHeader.<anonymous> (CollapsableHeader.kt:66)");
                        }
                        x3g x3gVar2 = x3g.this;
                        keb0 keb0Var = x3gVar2.a;
                        w7b0 w7b0Var = x3gVar2.b;
                        l3k.a(keb0Var, (w7b0Var == null || !(w7b0Var.f || d)) ? null : w7b0Var, txj0.h(txj0.f(q630.a.a, 1.0f), I0 / cn70.a()), izsVar, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), rmpVar, yjr0Var.e().b, E, M, (i2 & 896) | 24630);
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
            s.d = new r3g(x3gVar, izsVar, rmpVar, q630Var2, i);
        }
    }

    public static final void b(final jai jaiVar, final jai jaiVar2, final rmp rmpVar, final int i, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1477876526);
        if ((i2 & 6) == 0) {
            i3 = (M.y(jaiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(jaiVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(rmpVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1477876526, i3, -1, "com.vk.video.playlist.playlistscreen.ui.view.CollapsableHeaderLayout (CollapsableHeader.kt:181)");
            }
            q630 D = p490.D(q630Var, p490.x(M), 14);
            List l = e43.l(jaiVar, jaiVar2);
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new v3g(i, rmpVar);
                M.R(x);
            }
            b540 b540Var = (b540) x;
            jai b = joy.b(l);
            boolean J = M.J(b540Var);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new c540(b540Var);
                M.R(x2);
            }
            cp10 cp10Var = (cp10) x2;
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (er.f(0, M, b)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.s3g
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w3g.b(jai.this, jaiVar2, rmpVar, i, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(x3g x3gVar, izs izsVar, mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
        keb0 keb0Var;
        TopBar$Middle topBar$Middle;
        int i2;
        int i3;
        d.b.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1596768832);
        int i4 = i | (M.J(x3gVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(mtk0Var) ? 256 : 128);
        q630.a aVar3 = q630.a.a;
        int i5 = i4 | (M.J(aVar3) ? 2048 : 1024);
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1596768832, i5, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistToolbar (CollapsableHeader.kt:92)");
            }
            q630 z = txj0.z(txj0.f(aVar3, 1.0f), null, 3);
            k.a.C0761a c0761a = k.a.C0761a.a;
            String N = d370.N(R.string.vk_back, 0, M);
            int i6 = i5 & 112;
            boolean z2 = i6 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new ln7(izsVar, 1);
                M.R(x);
            }
            TopBar$Before.e a = e.a.a((gzs) x, N, null, null, null, M, 196608, 28);
            androidx.compose.runtime.a aVar4 = M;
            TopBar$Middle.a aVar5 = TopBar$Middle.a.c;
            keb0 keb0Var2 = x3gVar.a;
            String str = keb0Var2.a;
            if (str == null || str.length() == 0) {
                keb0Var = keb0Var2;
                aVar4.K(-1716692521);
                aVar4.j();
                topBar$Middle = aVar5;
            } else {
                aVar4.K(-1716868942);
                keb0Var = keb0Var2;
                TopBar$Middle.Text.Title a2 = TopBar$Middle.Text.Title.b.a(keb0Var2.a, null, null, null, null, aVar4, 196608, 30);
                aVar4 = aVar4;
                TopBar$Middle a3 = TopBar$Middle.Text.b.a(a2, null, null, null, aVar4, 14);
                aVar4.j();
                topBar$Middle = a3;
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_more_vertical_24, 0, aVar4);
            boolean z3 = i6 == 32;
            Object x2 = aVar4.x();
            if (z3 || x2 == c0012a) {
                x2 = new cc1(izsVar, 3);
                aVar4.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            Object x3 = aVar4.x();
            if (x3 == c0012a) {
                x3 = new ht(13);
                aVar4.R(x3);
            }
            d.c.C0760d a5 = d.c.C0760d.a.a(a4, null, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar4, 1572872, 26);
            if (androidx.compose.runtime.b.d()) {
                i2 = -1;
                androidx.compose.runtime.b.f(2115742070, i6, -1, "com.vk.video.playlist.playlistscreen.ui.view.getToolbarExtraIcon (CollapsableHeader.kt:134)");
            } else {
                i2 = -1;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(273627943, 0, i2, "com.vk.video.playlist.playlistscreen.ui.view.rememberShouldShowSubscribeIcon (CollapsableHeader.kt:273)");
            }
            Context context = (Context) aVar4.r(AndroidCompositionLocals_androidKt.b);
            Configuration configuration = (Configuration) aVar4.r(AndroidCompositionLocals_androidKt.a);
            boolean o = aVar4.o(configuration.screenHeightDp) | aVar4.o(configuration.orientation) | aVar4.J(context) | aVar4.o(configuration.screenWidthDp);
            Object x4 = aVar4.x();
            if (o || x4 == c0012a) {
                x4 = Boolean.valueOf(iah0.r(context) && !fnj.d(context));
                aVar4.R(x4);
            }
            boolean booleanValue = ((Boolean) x4).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            keb0 keb0Var3 = keb0Var;
            if (keb0Var3.b) {
                aVar4.K(1427215309);
                lg90 a6 = pg90.a(R.drawable.vk_icon_write_outline_28, 0, aVar4);
                boolean z4 = ((i6 ^ 48) > 32 && aVar4.J(izsVar)) || (i5 & 48) == 32;
                Object x5 = aVar4.x();
                if (z4 || x5 == c0012a) {
                    x5 = new nhf(izsVar, 1);
                    aVar4.R(x5);
                }
                d.b.a a7 = d.b.a.C0757a.a(a6, null, (gzs) x5, null, null, null, aVar4, 12582920, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                aVar4.j();
                aVar2 = a7;
                i3 = i2;
            } else {
                int i7 = i2;
                if (keb0Var3.c && booleanValue) {
                    aVar4.K(1427504911);
                    lg90 a8 = pg90.a(keb0Var3.d ? R.drawable.vk_icon_check_square_outline_24 : R.drawable.vk_icon_add_square_outline_24, 0, aVar4);
                    boolean z5 = ((i6 ^ 48) > 32 && aVar4.J(izsVar)) || (i5 & 48) == 32;
                    Object x6 = aVar4.x();
                    if (z5 || x6 == c0012a) {
                        x6 = new ux(izsVar, 3);
                        aVar4.R(x6);
                    }
                    i3 = i7;
                    d.b.a a9 = d.b.a.C0757a.a(a8, null, (gzs) x6, null, null, null, aVar4, 12582920, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                    aVar4.j();
                    aVar2 = a9;
                } else {
                    i3 = i7;
                    aVar4.K(1427950535);
                    aVar4.j();
                    aVar2 = null;
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar6 = aVar4;
            com.vk.core.compose.component.topbar.a a10 = d.a.a(a5, aVar2, null, null, aVar6, 24576, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(topBar$Middle, z, c0761a, aVar5, a, null, a10, null, false, ylu0Var.d().a, mtk0Var, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar6, 3456, (i5 >> 6) & 14, 6560);
            M = aVar6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t3g(i, 0, x3gVar, izsVar, mtk0Var);
        }
    }
}

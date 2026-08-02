package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: FeedPlacePicker.kt */
/* loaded from: classes18.dex */
public final class k2r {
    public static final void a(final String str, final String str2, final boolean z, final boolean z2, final q630 q630Var, final gzs gzsVar, final gzs gzsVar2, final String str3, SemanticsConfiguration semanticsConfiguration, SemanticsConfiguration semanticsConfiguration2, final SemanticsConfiguration semanticsConfiguration3, jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        final SemanticsConfiguration semanticsConfiguration4;
        final SemanticsConfiguration semanticsConfiguration5;
        final jai jaiVar2;
        androidx.compose.runtime.a aVar2;
        cri.a.C2678a c2678a;
        cri.a.e eVar;
        cri.a.b bVar;
        androidx.compose.runtime.a aVar3;
        cri.a.d dVar;
        int i2;
        char c;
        int i3;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        int i4;
        cri.a.e eVar2;
        LayoutNode.a aVar4;
        cri.a.c cVar;
        cri.a.C2678a c2678a2;
        cri.a.b bVar2;
        cri.a.d dVar2;
        com.vk.core.compose.component.cell.content.o a;
        androidx.compose.runtime.a aVar5;
        androidx.compose.runtime.a M = aVar.M(1950117594);
        int i5 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.y(gzsVar) ? 131072 : 65536) | (M.y(gzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(str3) ? 8388608 : 4194304);
        int i6 = (M.J(semanticsConfiguration3) ? 4 : 2) | 48;
        if (M.t(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1950117594, i5, i6, "com.vk.feed.design.compose.posting.picker.placepicker.FeedPlacePicker (FeedPlacePicker.kt:48)");
            }
            int i7 = i5 >> 12;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar3 = cri.a.e;
            k9q0.w(M, D, eVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a3 = cri.a.h;
            k9q0.t(M, c2678a3);
            cri.a.d dVar3 = cri.a.d;
            k9q0.w(M, c2, dVar3);
            com.vk.core.compose.component.cell.content.j0 a3 = Cell$Left.Main.a.C0731a.a(tfi.a, M);
            com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.d.b.a(str, null, null, 0, semanticsConfiguration3, null, M, (i5 & 14) | 12582912 | ((i6 << 15) & 458752), 94);
            if (str2 == null) {
                M.K(-794422432);
                M.j();
                aVar3 = M;
                i3 = i7;
                dVar = dVar3;
                c2678a = c2678a3;
                eVar = eVar3;
                bVar = bVar3;
                h1Var = null;
                i2 = 0;
                c = 2;
            } else {
                M.K(-794422431);
                c2678a = c2678a3;
                eVar = eVar3;
                bVar = bVar3;
                aVar3 = M;
                dVar = dVar3;
                i2 = 0;
                c = 2;
                i3 = i7;
                com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(str2, 0, null, null, null, aVar3, ((i5 >> 3) & 14) | 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                aVar3.j();
                h1Var = b;
            }
            com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(a4, h1Var, null, null, aVar3, 196608, 28);
            if (z) {
                aVar3.K(-794309188);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1243383292, i2, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                }
                lg90 b2 = or.b(aVar3, 1833859693, R.drawable.vk_icon_cancel_24, aVar3, i2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i2, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().l;
                int i8 = (i3 & 7168) | 1572872 | (57344 & (i5 >> 6));
                dVar2 = dVar;
                aVar5 = aVar3;
                i4 = i2;
                aVar4 = aVar6;
                cVar = cVar2;
                c2678a2 = c2678a;
                bVar2 = bVar;
                eVar2 = eVar;
                a = com.vk.core.compose.component.cell.content.p.a(b2, j, 0L, str3, gzsVar2, null, aVar5, i8, 36);
                aVar5.j();
            } else {
                androidx.compose.runtime.a aVar7 = aVar3;
                i4 = i2;
                eVar2 = eVar;
                aVar4 = aVar6;
                cVar = cVar2;
                cri.a.d dVar4 = dVar;
                aVar7.K(-793999777);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i4, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar7.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getIcon().n;
                c2678a2 = c2678a;
                bVar2 = bVar;
                dVar2 = dVar4;
                a = o.b.a.a(null, null, j2, false, aVar7, 221184, 7);
                aVar5 = aVar7;
                aVar5.j();
            }
            com.vk.core.compose.component.cell.content.o oVar = a;
            q630.a aVar8 = q630.a.a;
            semanticsConfiguration4 = semanticsConfiguration;
            androidx.compose.runtime.a aVar9 = aVar5;
            wiu0.b(com.vk.core.compose.component.semantics.b.b(ojc.c(aVar8, false, null, null, gzsVar, 15), semanticsConfiguration4), false, a3, a5, oVar, null, null, aVar9, 0, 98);
            aVar2 = aVar9;
            if (z2) {
                aVar2.K(-793631280);
                f9t.e(txj0.h(aVar8, 3), aVar2, 6);
                q630 r = p490.r(s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40, 1, txj0.f(aVar8, 1.0f))), p490.x(aVar2), 14);
                semanticsConfiguration5 = semanticsConfiguration2;
                q630 b3 = com.vk.core.compose.component.semantics.b.b(r, semanticsConfiguration5);
                androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, aVar2, i4);
                int hashCode2 = Long.hashCode(n34.n(aVar2));
                sy90 D2 = aVar2.D();
                q630 c3 = qri.c(aVar2, b3);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar4);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, a6, cVar);
                k9q0.w(aVar2, D2, eVar2);
                ur.d(hashCode2, aVar2, bVar2, aVar2, c2678a2);
                k9q0.w(aVar2, c3, dVar2);
                jaiVar2 = jaiVar;
                jaiVar2.invoke(tpg0.a, aVar2, 54);
                aVar2.G();
            } else {
                semanticsConfiguration5 = semanticsConfiguration2;
                jaiVar2 = jaiVar;
                aVar2.K(-797387054);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            semanticsConfiguration4 = semanticsConfiguration;
            semanticsConfiguration5 = semanticsConfiguration2;
            jaiVar2 = jaiVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, str2, z, z2, q630Var, gzsVar, gzsVar2, str3, semanticsConfiguration4, semanticsConfiguration5, semanticsConfiguration3, jaiVar2, i) { // from class: xsna.j2r
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ gzs h;
                public final /* synthetic */ String i;
                public final /* synthetic */ SemanticsConfiguration j;
                public final /* synthetic */ SemanticsConfiguration k;
                public final /* synthetic */ SemanticsConfiguration l;
                public final /* synthetic */ jai m;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k2r.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (androidx.compose.runtime.a) obj, ne7.I(905994241));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-1827171882);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1827171882, i2, -1, "com.vk.feed.design.compose.posting.picker.placepicker.FeedPlacePickerItem (FeedPlacePicker.kt:109)");
            }
            mnv0.a(SubnavigationButtonSize.Small, SubnavigationButtonMode.Secondary, SubnavigationBarAppearance.Neutral, false, gzsVar, q630Var, str, null, null, null, false, false, M, (57344 & (i2 << 6)) | 3510 | ((i2 << 12) & 458752) | ((i2 << 18) & 3670016), 3968);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oq0(str, q630Var, gzsVar, i);
        }
    }
}

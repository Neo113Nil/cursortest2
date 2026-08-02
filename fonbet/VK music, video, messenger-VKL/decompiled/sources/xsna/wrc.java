package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import com.vk.clips.viewer.edit.presentation.model.coauthors.CoauthorsBannerVS;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.DiagonalUserStackSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.ksc;
import xsna.phw;
import xsna.q630;
import xsna.xcc;

/* compiled from: ClipEditCoauthosContent.kt */
/* loaded from: classes17.dex */
public final class wrc {

    /* compiled from: ClipEditCoauthosContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoauthorsBannerVS.values().length];
            try {
                iArr[CoauthorsBannerVS.ClosedProfileWithoutCoauthors.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoauthorsBannerVS.ClosedProfileWithCoauthors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoauthorsBannerVS.ClosedGroupWithoutCoauthors.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoauthorsBannerVS.ClosedGroupWithCoauthors.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CoauthorsBannerVS.ClosedClip.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final ksc kscVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        int i2;
        boolean z;
        String str;
        Cell$Left a2;
        int i3;
        String str2;
        com.vk.core.compose.component.cell.content.k0 a3;
        androidx.compose.runtime.a aVar2;
        Cell$Left cell$Left;
        a.C0011a.C0012a c0012a;
        q630.a aVar3;
        int i4;
        com.vk.core.compose.component.cell.content.o a4;
        androidx.compose.runtime.a aVar4;
        androidx.compose.runtime.a M = aVar.M(1460756856);
        int i5 = i | (M.J(kscVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1460756856, i5, -1, "com.vk.clips.viewer.edit.presentation.compose.coauthos.ClipEditCoauthorsContent (ClipEditCoauthosContent.kt:34)");
            }
            final ClipsComposeImageLoader clipsComposeImageLoader = (ClipsComposeImageLoader) M.r(dkw.b);
            int i6 = i5 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(478199074, i6, -1, "com.vk.clips.viewer.edit.presentation.compose.coauthos.getCoauthorsLeft (ClipEditCoauthosContent.kt:135)");
            }
            boolean z2 = kscVar instanceof ksc.a;
            if (z2) {
                M.K(-377708803);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2049717820, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-UserAddOutline28> (VkSdkIcons.kt:3556)");
                }
                lg90 b = or.b(M, 1593707043, R.drawable.vk_icon_user_add_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = z2;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                a2 = com.vk.core.compose.component.cell.content.f.a(b, size, ylu0Var.getIcon().a, null, null, M, 196664, 24);
                M.j();
                i2 = -1;
            } else {
                i2 = -1;
                z = z2;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                if (kscVar instanceof ksc.c) {
                    M.K(-377473575);
                    phw a5 = phw.a.a(clipsComposeImageLoader.a(((ksc.c) kscVar).c.b, M, 0).j(), null, null, null, null, M, 196616, 30);
                    M = M;
                    a2 = com.vk.core.compose.component.cell.content.e.b(a5, 36, null, M, 100663344, 252);
                    M.j();
                } else {
                    if (!(kscVar instanceof ksc.b)) {
                        throw alb0.c(-12185021, M);
                    }
                    M.K(-377192746);
                    a2 = Cell$Left.Main.a.C0731a.a(kai.c(-1929348584, new zzs() { // from class: xsna.urc
                        @Override // xsna.zzs
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            q630 q630Var3 = (q630) obj2;
                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            if ((intValue & 48) == 0) {
                                intValue |= aVar5.J(q630Var3) ? 32 : 16;
                            }
                            if (aVar5.t(intValue & 1, (intValue & 145) != 144)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1929348584, intValue, -1, "com.vk.clips.viewer.edit.presentation.compose.coauthos.getCoauthorsLeft.<anonymous> (ClipEditCoauthosContent.kt:155)");
                                }
                                DiagonalUserStackSize diagonalUserStackSize = DiagonalUserStackSize.Large;
                                xcc.a.c cVar = xcc.a.c.a;
                                ksc kscVar2 = ksc.this;
                                boolean J = aVar5.J(kscVar2);
                                ClipsComposeImageLoader clipsComposeImageLoader2 = clipsComposeImageLoader;
                                boolean J2 = J | aVar5.J(clipsComposeImageLoader2);
                                Object x = aVar5.x();
                                if (J2 || x == a.C0011a.a) {
                                    x = new ma(4, kscVar2, clipsComposeImageLoader2);
                                    aVar5.R(x);
                                }
                                hyv0.b(q630Var3, diagonalUserStackSize, cVar, (izs) x, aVar5, ((intValue >> 3) & 14) | 48, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar5.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M);
                    M.j();
                }
            }
            Cell$Left cell$Left2 = a2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(332809893, i6, i2, "com.vk.clips.viewer.edit.presentation.compose.coauthos.getCoauthorsMiddle (ClipEditCoauthosContent.kt:99)");
            }
            if (z) {
                M.K(2002732143);
                i3 = i2;
                str2 = str;
                androidx.compose.runtime.a aVar5 = M;
                a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.clips_edit_coauthors_select_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar5, 196608, 30);
                aVar2 = aVar5;
                aVar2.j();
            } else {
                i3 = i2;
                str2 = str;
                if (kscVar instanceof ksc.b) {
                    M.K(2002738433);
                    androidx.compose.runtime.a aVar6 = M;
                    a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.O(R.string.clips_edit_coauthors_selected_more_then_one_text, new Object[]{((pyf) j5g.Y(((ksc.b) kscVar).c)).a, Integer.valueOf(r5.size() - 1)}, M), null, null, 1, null, null, M, 12585984, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), Cell$Middle.c.b.b(d370.N(R.string.clips_edit_coauthors_selected_multi_subtitle, 0, M), 0, null, null, null, aVar6, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar6, 196608, 28);
                    aVar2 = aVar6;
                    aVar2.j();
                } else {
                    if (!(kscVar instanceof ksc.c)) {
                        throw alb0.c(2002731128, M);
                    }
                    M.K(2002753973);
                    androidx.compose.runtime.a aVar7 = M;
                    a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(((ksc.c) kscVar).c.a, null, null, 1, null, null, M, 12585984, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), Cell$Middle.c.b.b(d370.N(R.string.clips_edit_coauthors_selected_single_subtitle, 0, M), 0, null, null, null, aVar7, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar7, 196608, 28);
                    aVar2 = aVar7;
                    aVar2.j();
                }
            }
            com.vk.core.compose.component.cell.content.k0 k0Var = a3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a6 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
            int hashCode = Long.hashCode(n34.n(aVar2));
            sy90 D = aVar2.D();
            q630.a aVar8 = q630.a.a;
            q630 c = qri.c(aVar2, aVar8);
            cri.h7.getClass();
            LayoutNode.a aVar9 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar9);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a6, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(aVar2, cri.a.h);
            k9q0.w(aVar2, c, cri.a.d);
            boolean a7 = kscVar.a();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (!a7 || z) {
                cell$Left = cell$Left2;
                c0012a = c0012a2;
                aVar3 = aVar8;
                i4 = 32;
                aVar2.K(2072388172);
                androidx.compose.runtime.a aVar10 = aVar2;
                a4 = o.b.a.a(null, null, 0L, false, aVar10, 196608, 31);
                aVar4 = aVar10;
                aVar4.j();
            } else {
                aVar2.K(2072075971);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-78024716, 0, i3, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline24> (VkSdkIcons.kt:270)");
                }
                lg90 b2 = or.b(aVar2, -856830611, R.drawable.vk_icon_cancel_outline_24, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i3, str2);
                }
                ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var2.getIcon().n;
                boolean z3 = (i5 & 112) == 32;
                Object x = aVar2.x();
                if (z3 || x == c0012a2) {
                    x = new os7(izsVar, 2);
                    aVar2.R(x);
                }
                aVar3 = aVar8;
                androidx.compose.runtime.a aVar11 = aVar2;
                cell$Left = cell$Left2;
                c0012a = c0012a2;
                i4 = 32;
                a4 = com.vk.core.compose.component.cell.content.p.a(b2, j, 0L, null, (gzs) x, null, aVar11, 1572872, 44);
                aVar4 = aVar11;
                aVar4.j();
            }
            com.vk.core.compose.component.cell.content.o oVar = a4;
            boolean z4 = kscVar.b() == null;
            boolean z5 = (i5 & 112) == i4;
            Object x2 = aVar4.x();
            if (z5 || x2 == c0012a) {
                x2 = new src(izsVar, 0);
                aVar4.R(x2);
            }
            androidx.compose.runtime.a aVar12 = aVar4;
            wiu0.b(null, z4, cell$Left, k0Var, oVar, (gzs) x2, null, aVar12, 0, 65);
            mm2.b(r9g.a, (kscVar.b() == null || kscVar.b() == CoauthorsBannerVS.None) ? false : true, null, null, null, null, kai.c(1622824426, new trc(0, kscVar, izsVar), aVar12), aVar12, 1572870, 30);
            M = aVar12;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new an7(i, 1, (Object) kscVar, izsVar, q630Var2);
        }
    }
}

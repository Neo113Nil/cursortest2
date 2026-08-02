package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.znc;

/* compiled from: ClipCoauthorDecisionContent.kt */
/* loaded from: classes16.dex */
public final class onc {
    public static final void a(znc zncVar, izs<? super fnc, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ArrayList arrayList = zncVar.b;
        androidx.compose.runtime.a M = aVar.M(-124402584);
        if ((i & 6) == 0) {
            i2 = (M.J(zncVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-124402584, i2, -1, "com.vk.clips.coauthors.list.pendings.mvi.ClipCoauthorDecisionContent (ClipCoauthorDecisionContent.kt:53)");
            }
            boolean J = M.J(arrayList);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((znc.a) it.next()).d && (i3 = i3 + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                x = Integer.valueOf(i3);
                M.R(x);
            }
            rrv0.e(true, null, null, null, null, null, kai.c(-1724402075, new jnc(zncVar, izsVar, ((Number) x).intValue(), 0), M), M, 1572870, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new knc(zncVar, izsVar, i, 0);
        }
    }

    public static final void b(final ArrayList arrayList, final boolean z, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        String str;
        znc.a aVar2;
        int i2;
        int i3;
        char c;
        com.vk.core.compose.component.cell.content.o oVar;
        int i4;
        char c2;
        int i5;
        ArrayList arrayList2 = arrayList;
        boolean z2 = z;
        androidx.compose.runtime.a M = aVar.M(2073560173);
        int i6 = i | (M.J(arrayList2) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 3072;
        int i7 = 0;
        if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2073560173, i6, -1, "com.vk.clips.coauthors.list.pendings.mvi.ItemsList (ClipCoauthorDecisionContent.kt:196)");
            }
            float f = 8;
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            q630.a aVar3 = q630.a.a;
            q630 C = s200.C(aVar3, n);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, C);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            M.K(1749753222);
            int size = arrayList2.size();
            int i8 = 0;
            while (i8 < size) {
                znc.a aVar5 = (znc.a) arrayList2.get(i8);
                UserId userId = aVar5.a;
                boolean z3 = aVar5.d;
                M.W(-2121395454, userId);
                if (z3) {
                    M.K(-1338726940);
                    znc.a.InterfaceC4185a interfaceC4185a = aVar5.e;
                    if (interfaceC4185a.equals(znc.a.InterfaceC4185a.C4186a.a)) {
                        i5 = R.string.clips_coauthors_pending_list_item_selected_accessibility_group;
                    } else if (interfaceC4185a.equals(znc.a.InterfaceC4185a.b.a)) {
                        i5 = R.string.clips_coauthors_pending_list_item_selected_accessibility_female;
                    } else {
                        if (!interfaceC4185a.equals(znc.a.InterfaceC4185a.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = R.string.clips_coauthors_pending_list_item_selected_accessibility_male;
                    }
                    str = d370.N(i5, i7, M);
                    M.j();
                } else {
                    M.K(-1338159423);
                    M.j();
                    str = "";
                }
                M.K(-2121370358);
                float f2 = f;
                q630.a aVar6 = aVar3;
                q630 H = s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7);
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z3) {
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                    boolean y = M.y(aVar5) | M.J(str);
                    Object x = M.x();
                    if (y || x == c0012a) {
                        x = new rm0(4, aVar5, str);
                        M.R(x);
                    }
                    H = H.g(com.vk.core.compose.component.semantics.b.b(aVar6, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2)));
                }
                M.j();
                int i9 = size;
                int i10 = i8;
                androidx.compose.runtime.a aVar7 = M;
                int i11 = i6;
                q630 q630Var3 = H;
                com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(null, aVar5.c, null, null, M, 0, 61), null, null, null, null, aVar7, 196616, 30), z2 ? Cell$Left.Main.Size.Medium : Cell$Left.Main.Size.Small, null, null, null, null, null, aVar7, 100663296, 252);
                androidx.compose.runtime.a aVar8 = aVar7;
                com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(aVar5.b, null, null, 0, null, null, aVar7, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar8, 196608, 30);
                if (z2) {
                    aVar8.K(-1337056815);
                    boolean z4 = aVar5.d;
                    boolean y2 = aVar8.y(aVar5) | ((i11 & 896) == 256);
                    Object x2 = aVar8.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new m84(5, izsVar, aVar5);
                        aVar8.R(x2);
                    }
                    oVar = o.e.a.C0736a.a(z4, (gzs) x2, false, null, aVar8, 24576, 12);
                    aVar8.j();
                    aVar2 = aVar5;
                    i2 = 256;
                    i3 = 0;
                    c = 65535;
                } else {
                    aVar8.K(-1336827446);
                    if (z3) {
                        aVar8.K(-1336786929);
                        if (androidx.compose.runtime.b.d()) {
                            i4 = 0;
                            androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                        } else {
                            i4 = 0;
                        }
                        lg90 a4 = pg90.a(R.drawable.vk_icon_check_circle_on_24, i4, aVar8);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            c2 = 65535;
                            androidx.compose.runtime.b.f(1040687336, i4, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            c2 = 65535;
                        }
                        ylu0 ylu0Var = (ylu0) aVar8.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().a;
                        int i12 = (aVar8.y(aVar5) ? 1 : 0) | ((i11 & 896) == 256 ? 1 : i4);
                        Object x3 = aVar8.x();
                        if (i12 != 0 || x3 == c0012a) {
                            x3 = new lb6(4, izsVar, aVar5);
                            aVar8.R(x3);
                        }
                        i3 = i4;
                        c = c2;
                        aVar2 = aVar5;
                        i2 = 256;
                        oVar = com.vk.core.compose.component.cell.content.p.a(a4, j, 0L, null, (gzs) x3, null, aVar8, 1572872, 44);
                        aVar8 = aVar8;
                        aVar8.j();
                    } else {
                        aVar2 = aVar5;
                        i2 = 256;
                        i3 = 0;
                        c = 65535;
                        aVar8.K(-1336475441);
                        aVar8.j();
                        oVar = null;
                    }
                    aVar8.j();
                }
                int i13 = (aVar8.y(aVar2) ? 1 : 0) | ((i11 & 896) == i2 ? 1 : i3);
                Object x4 = aVar8.x();
                if (i13 != 0 || x4 == c0012a) {
                    x4 = new cy0(4, izsVar, aVar2);
                    aVar8.R(x4);
                }
                androidx.compose.runtime.a aVar9 = aVar8;
                wiu0.b(q630Var3, false, a2, a3, oVar, (gzs) x4, null, aVar9, 0, 66);
                M = aVar9;
                M.a0();
                i8 = i10 + 1;
                arrayList2 = arrayList;
                z2 = z;
                i6 = i11;
                size = i9;
                i7 = i3;
                f = f2;
                aVar3 = aVar6;
            }
            q630.a aVar10 = aVar3;
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar10;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(arrayList, z, izsVar, q630Var2, i) { // from class: xsna.lnc
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    onc.b(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(znc zncVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        String N;
        String N2;
        String str;
        String str2;
        int i2;
        int i3;
        String a;
        androidx.compose.runtime.a M = aVar.M(2089804757);
        int i4 = i | (M.J(zncVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2089804757, i4, -1, "com.vk.clips.coauthors.list.pendings.mvi.TopBar (ClipCoauthorDecisionContent.kt:131)");
            }
            boolean z = zncVar.e;
            ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType = zncVar.c;
            TopBar$Middle.Text.d dVar = null;
            if (z) {
                M.K(1822819894);
                if ((clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.AcceptRequest) || (clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeclineRequest)) {
                    M.K(1822970430);
                    if (zncVar.d) {
                        i2 = 1823015659;
                        i3 = R.string.clips_coauthors_bs_title_channels;
                    } else {
                        i2 = 1823118920;
                        i3 = R.string.clips_coauthors_bs_title_communities;
                    }
                    a = zq.a(M, i2, i3, M, 0);
                    M.j();
                } else {
                    if (!(clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeleteClip)) {
                        throw alb0.c(-1742314372, M);
                    }
                    a = zq.a(M, 1823327767, R.string.clips_coauthor_refuse, M, 0);
                }
                M.j();
                str = a;
                str2 = null;
            } else {
                M.K(1823488254);
                if (clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.AcceptRequest) {
                    M.K(1823568296);
                    N = d370.N(R.string.clips_coauthors_accept_invite_bs_title, 0, M);
                    N2 = d370.N(R.string.clips_coauthors_accept_invite_bs_subtitle, 0, M);
                    M.j();
                } else if (clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeclineRequest) {
                    M.K(1823830246);
                    N = d370.N(R.string.clips_coauthors_decline_invite_bs_title, 0, M);
                    N2 = d370.N(R.string.clips_coauthors_decline_invite_bs_subtitle, 0, M);
                    M.j();
                } else {
                    if (!(clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeleteClip)) {
                        throw alb0.c(-1742292812, M);
                    }
                    M.K(1824089344);
                    N = d370.N(R.string.clips_coauthor_refuse, 0, M);
                    N2 = d370.N(R.string.clips_coauthors_refuse_bs_subtitle, 0, M);
                    M.j();
                }
                M.j();
                String str3 = N2;
                str = N;
                str2 = str3;
            }
            TopBar$Middle.Text.Title a2 = TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, 196608, 30);
            if (str2 == null) {
                M.K(1824451857);
            } else {
                M.K(1824451858);
                dVar = TopBar$Middle.Text.d.a.a(str2, 0, 0, null, null, M, 196608, 30);
            }
            M.j();
            TopBar$Middle.Text.d dVar2 = dVar;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new nt(15);
                M.R(x);
            }
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(a2, dVar2, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2), M, 4);
            String N3 = d370.N(R.string.clips_coauthors_selection_accessibility_close, 0, M);
            boolean z2 = (i4 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new mnc(izsVar, 0);
                M.R(x2);
            }
            TopBar$Before.d a4 = TopBar$Before.d.a.a(N3, (gzs) x2, null, null, M, 24576, 12);
            q630.a aVar3 = q630.a.a;
            muv0.h(a3, aVar3, null, null, null, a4, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8156);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nnc(i, 0, zncVar, izsVar, q630Var2);
        }
    }
}

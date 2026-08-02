package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.view.components.compose.CommunityCardImageCornersRoundingStyle;
import com.vk.community.design.view.components.compose.CommunityCardMode;
import com.vk.community.design.view.components.compose.CommunityCardTitle$Text;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkCommunityCard.kt */
/* loaded from: classes17.dex */
public final class emu0 {

    /* compiled from: VkCommunityCard.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityCardImageCornersRoundingStyle.values().length];
            try {
                iArr[CommunityCardImageCornersRoundingStyle.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityCardImageCornersRoundingStyle.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(CommunityCardTitle$Text communityCardTitle$Text, com.vk.community.design.view.components.compose.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1238114852);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(communityCardTitle$Text) : M.y(communityCardTitle$Text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(bVar) : M.y(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1238114852, i2, -1, "com.vk.community.design.view.components.compose.CommunityCardCaption (VkCommunityCard.kt:141)");
            }
            q630 E = s200.E(q630Var, 12, 8);
            a.j g = androidx.compose.foundation.layout.a.g(2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            M.K(445513987);
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(516832763);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            communityCardTitle$Text.a(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 6);
            M.j();
            M.G();
            M.j();
            if (bVar == null) {
                M.K(445816732);
            } else {
                M.K(152928517);
                bVar.a(txj0.f(aVar3, 1.0f), M, (i2 & 112) | 6);
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
            s.d = new b6v(communityCardTitle$Text, bVar, q630Var, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(etg etgVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        float f;
        androidx.compose.runtime.a M = aVar.M(-1765298931);
        if ((i & 6) == 0) {
            i2 = (M.J(etgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1765298931, i2, -1, "com.vk.community.design.view.components.compose.CommunityCardImage (VkCommunityCard.kt:101)");
            }
            CommunityCardImageCornersRoundingStyle communityCardImageCornersRoundingStyle = etgVar != null ? etgVar.b : null;
            int i3 = communityCardImageCornersRoundingStyle == null ? -1 : a.$EnumSwitchMapping$0[communityCardImageCornersRoundingStyle.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    f = 12;
                    float f2 = 12;
                    uog0 c = vog0.c(f2, f2, f, f);
                    q630 d = rte0.d(q630Var, c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(d, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
                    float f3 = kqu0.d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 a2 = r18.a(f3, ylu0Var2.getImage().a, m, c);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c2 = qri.c(M, a2);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (M.N() != null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar2);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d2, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c2, cri.a.d);
                    fwu0.c(txj0.d(q630.a.a, 1.0f), null, etgVar != null ? etgVar.a : null, null, null, null, null, com.vk.community.design.view.components.compose.c.a, M, 100663302, 250);
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 2;
            float f22 = 12;
            uog0 c3 = vog0.c(f22, f22, f, f);
            q630 d3 = rte0.d(q630Var, c3);
            if (androidx.compose.runtime.b.d()) {
            }
            iyk0 iyk0Var2 = rrv0.a;
            ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var2);
            if (androidx.compose.runtime.b.d()) {
            }
            q630 m2 = hr80.m(d3, ylu0Var3.getImage().b, androidx.compose.ui.graphics.e.a);
            float f32 = kqu0.d;
            if (androidx.compose.runtime.b.d()) {
            }
            ylu0 ylu0Var22 = (ylu0) M.r(iyk0Var2);
            if (androidx.compose.runtime.b.d()) {
            }
            q630 a22 = r18.a(f32, ylu0Var22.getImage().a, m2, c3);
            dt1.a.getClass();
            cp10 d22 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c22 = qri.c(M, a22);
            cri.h7.getClass();
            LayoutNode.a aVar22 = cri.a.b;
            if (M.N() != null) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y78(etgVar, q630Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(CommunityCardTitle$Text communityCardTitle$Text, q630 q630Var, com.vk.community.design.view.components.compose.b bVar, dtg dtgVar, com.vk.community.design.view.components.compose.a aVar, etg etgVar, CommunityCardMode communityCardMode, k9q0 k9q0Var, androidx.compose.runtime.a aVar2, int i, int i2) {
        q630 q630Var2;
        int i3;
        dtg dtgVar2;
        int i4;
        etg etgVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        com.vk.community.design.view.components.compose.b bVar2;
        androidx.compose.runtime.a aVar3;
        q630 q630Var3;
        dtg dtgVar3;
        etg etgVar3;
        k9q0 k9q0Var2;
        androidx.compose.runtime.f s;
        dtg dtgVar4;
        etg etgVar4;
        dtg dtgVar5;
        com.vk.community.design.view.components.compose.a aVar4 = aVar;
        androidx.compose.runtime.a M = aVar2.M(1839092849);
        int i9 = (M.J(communityCardTitle$Text) ? 4 : 2) | i;
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 = i9 | 48;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i9 | (M.J(q630Var2) ? 32 : 16);
        }
        int i11 = i3 | (M.J(bVar) ? 256 : 128);
        int i12 = i2 & 8;
        if (i12 != 0) {
            i11 |= 3072;
        } else if ((i & 3072) == 0) {
            dtgVar2 = dtgVar;
            i11 |= M.J(dtgVar2) ? 2048 : 1024;
            int i13 = i11 | (!M.J(aVar4) ? 16384 : 8192);
            i4 = i2 & 32;
            if (i4 == 0) {
                i5 = i13 | 196608;
                etgVar2 = etgVar;
            } else {
                etgVar2 = etgVar;
                i5 = i13 | (M.J(etgVar2) ? 131072 : 65536);
            }
            i6 = i2 & 128;
            if (i6 == 0) {
                i7 = 12582912;
            } else {
                i7 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) == 0 ? M.J(k9q0Var) : M.y(k9q0Var) ? 8388608 : 4194304;
            }
            i8 = i5 | i7;
            if (M.t(i8 & 1, (i8 & 4793491) == 4793490)) {
                bVar2 = bVar;
                aVar3 = M;
                aVar3.h();
                q630Var3 = q630Var2;
                dtgVar3 = dtgVar2;
                etgVar3 = etgVar2;
                k9q0Var2 = k9q0Var;
            } else {
                q630.a aVar5 = q630.a.a;
                if (i10 != 0) {
                    q630Var2 = aVar5;
                }
                dtg dtgVar6 = i12 != 0 ? null : dtgVar2;
                etg etgVar5 = i4 != 0 ? null : etgVar2;
                k9q0 k9q0Var3 = i6 != 0 ? null : k9q0Var;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1839092849, i8, -1, "com.vk.community.design.view.components.compose.VkCommunityCard (VkCommunityCard.kt:44)");
                }
                float f = 12;
                q630 d = rte0.d(txj0.v(q630Var2, communityCardMode.h()), vog0.b(f));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m = hr80.m(d, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, m);
                cri.h7.getClass();
                q630 q630Var4 = q630Var2;
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
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, a2, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar3 = cri.a.g;
                k9q0.w(M, valueOf, bVar3);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                q630 d2 = sua.d(communityCardMode.i(), txj0.f(aVar5, 1.0f), false);
                cp10 d3 = ja8.d(dt1.a.b, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, d2);
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
                k9q0.w(M, d3, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar3, M, c2678a);
                k9q0.w(M, c2, dVar);
                b(etgVar5, txj0.d(aVar5, 1.0f), M, ((i8 >> 15) & 14) | 48);
                ra8 ra8Var = ra8.a;
                if (dtgVar6 == null) {
                    M.K(1327764804);
                } else {
                    M.K(1327764805);
                    M.K(-1758283093);
                    float f2 = 8;
                    dtgVar6.a(M, s200.H(ra8Var.b(aVar5, dt1.a.h), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 6));
                    s3q0 s3q0Var = s3q0.a;
                    M.j();
                }
                M.j();
                if (k9q0Var3 == null) {
                    M.K(1328180514);
                    M.j();
                    aVar3 = M;
                    dtgVar5 = dtgVar6;
                    etgVar4 = etgVar5;
                } else {
                    M.K(-1758270785);
                    q630 b = ra8Var.b(aVar5, dt1.a.d);
                    int i14 = 8 | ((i8 >> 21) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        dtgVar4 = dtgVar6;
                        androidx.compose.runtime.b.f(-1752984109, i14, -1, "com.vk.community.design.view.components.compose.Content (VkCommunityCard.kt:172)");
                    } else {
                        dtgVar4 = dtgVar6;
                    }
                    q630 c3 = ojc.c(txj0.q(b, 36), false, null, null, null, 15);
                    cp10 d4 = ja8.d(dt1.a.f, false);
                    int hashCode3 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630 c4 = qri.c(M, c3);
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
                    k9q0.w(M, d4, cVar);
                    k9q0.w(M, D3, eVar);
                    ur.d(hashCode3, M, bVar3, M, c2678a);
                    k9q0.w(M, c4, dVar);
                    M.K(1269224922);
                    qzu0.a.getClass();
                    lg90 E = qzu0.E(M);
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var2.getIcon().c;
                    etgVar4 = etgVar5;
                    dtgVar5 = dtgVar4;
                    pzu0.b(E, null, null, j, M, 56, 4);
                    aVar3 = M;
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar3.j();
                    s3q0 s3q0Var2 = s3q0.a;
                }
                aVar3.G();
                bVar2 = bVar;
                a(communityCardTitle$Text, bVar2, txj0.f(aVar5, 1.0f), aVar3, (i8 & 14) | 384 | ((i8 >> 3) & 112));
                if (aVar == null) {
                    aVar3.K(-344107852);
                    aVar3.j();
                    aVar4 = aVar;
                } else {
                    aVar3.K(-1812215571);
                    aVar4 = aVar;
                    aVar4.a(s200.H(txj0.f(aVar5, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2), aVar3, ((i8 >> 9) & 112) | 6);
                    aVar3.j();
                    s3q0 s3q0Var3 = s3q0.a;
                }
                aVar3.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                etgVar3 = etgVar4;
                dtgVar3 = dtgVar5;
                k9q0Var2 = k9q0Var3;
                q630Var3 = q630Var4;
            }
            s = aVar3.s();
            if (s == null) {
                s.d = new xc10(communityCardTitle$Text, q630Var3, bVar2, dtgVar3, aVar4, etgVar3, communityCardMode, k9q0Var2, i, i2);
                return;
            }
            return;
        }
        dtgVar2 = dtgVar;
        int i132 = i11 | (!M.J(aVar4) ? 16384 : 8192);
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i8 = i5 | i7;
        if (M.t(i8 & 1, (i8 & 4793491) == 4793490)) {
        }
        s = aVar3.s();
        if (s == null) {
        }
    }
}

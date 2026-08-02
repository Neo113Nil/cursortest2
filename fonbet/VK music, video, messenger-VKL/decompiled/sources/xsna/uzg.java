package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.profile.community.creationonboarding.api.models.CommunityData;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.ty6;
import xsna.wkj;

/* compiled from: CommunityCreationOnboardingFinishScreen.kt */
/* loaded from: classes5.dex */
public final class uzg {

    /* compiled from: CommunityCreationOnboardingFinishScreen.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityCreationOnboardingFinishState.SubscribeStatus.values().length];
            try {
                iArr[CommunityCreationOnboardingFinishState.SubscribeStatus.IN_PROGRESS_SUBSCRIBED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityCreationOnboardingFinishState.SubscribeStatus.IN_PROGRESS_NO_SUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityCreationOnboardingFinishState.SubscribeStatus.NO_SUBSCRIBE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityCreationOnboardingFinishState.SubscribeStatus.SUBSCRIBED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(Object obj, izs<? super com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(792031748);
        if ((i & 6) == 0) {
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(792031748, i3, -1, "com.vk.profile.community.creationonboarding.impl.finish.presentation.compose.CommunityItem (CommunityCreationOnboardingFinishScreen.kt:208)");
            }
            CommunityData communityData = (CommunityData) obj;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630.a.a, ylu0Var.getBackground().B, vog0.b(kqu0.v));
            com.vk.core.compose.component.cell.content.t b = com.vk.core.compose.component.cell.content.e.b(phw.a.a(fwu0.l(communityData.c, null, null, null, M, 0, 62), null, wkj.a.b, null, null, M, 197000, 26), 24, null, M, 100663344, 252);
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(communityData.b, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new c2(19);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.u0 a3 = o.b.a.a(null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), 0L, false, M, 196608, 27);
            boolean y = ((i3 & 112) == 32) | M.y(communityData);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new ie3(7, izsVar, communityData);
                M.R(x2);
            }
            wiu0.b(m, false, b, a2, a3, (gzs) x2, null, M, 0, 66);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xw5(obj, izsVar, i, 1);
        }
    }

    public static final void b(CommunityCreationOnboardingFinishState communityCreationOnboardingFinishState, izs<? super com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs<? super com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a, s3q0> izsVar2;
        androidx.compose.runtime.a aVar2;
        float f;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1583816999);
        if ((i & 6) == 0) {
            i2 = i | (M.J(communityCreationOnboardingFinishState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1583816999, i4, -1, "com.vk.profile.community.creationonboarding.impl.finish.presentation.compose.Screen (CommunityCreationOnboardingFinishScreen.kt:79)");
            }
            float f2 = kqu0.w;
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(p490.D(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), p490.x(M), 14), "creation_onboarding_finish_dialog_root_container");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f3 = 4;
            q630 s = txj0.s(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1, aVar3), 36, f3);
            ty6.a aVar6 = dt1.a.o;
            bev0.a(1.0f, 6, 0, wlb0.h(M).getIcon().o, M, lr.c(aVar6, s));
            float f4 = 24;
            q630 s2 = txj0.s(lr.c(aVar6, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), PsExtractor.AUDIO_STREAM, VersionConstants.PRODUCT_MAJOR_VERSION);
            String str = communityCreationOnboardingFinishState.b;
            List<CommunityData> list = communityCreationOnboardingFinishState.e;
            String str2 = communityCreationOnboardingFinishState.g;
            fwu0.c(s2, null, str, null, null, null, null, idi.b, M, 100663296, 250);
            yqv0.c(communityCreationOnboardingFinishState.c, s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).z, M, 0, 0, 8120);
            q630 f5 = txj0.f(aVar3, 1.0f);
            float f6 = kqu0.t;
            if ((str2 == null || drm0.N(str2)) && list.isEmpty()) {
                f = 16;
                i3 = 0;
            } else {
                i3 = 0;
                f = 0;
            }
            yqv0.c(communityCreationOnboardingFinishState.d, s200.H(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5), wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).T, M, 0, 0, 8120);
            aVar2 = M;
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 5);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f6), aVar4, aVar2, i3);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D2 = aVar2.D();
            q630 c2 = qri.c(aVar2, H);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a3, cVar);
            k9q0.w(aVar2, D2, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c2, dVar);
            aVar2.K(-242487746);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                a((CommunityData) it.next(), izsVar, aVar2, i4 & 112);
            }
            izsVar2 = izsVar;
            aVar2.j();
            aVar2.G();
            c(communityCreationOnboardingFinishState.f, str2, izsVar2, aVar2, (i4 << 3) & 896);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s3 = aVar2.s();
        if (s3 != null) {
            s3.d = new t41(communityCreationOnboardingFinishState, izsVar2, i, 3);
        }
    }

    public static final void c(CommunityCreationOnboardingFinishState.SubscribeStatus subscribeStatus, String str, izs<? super com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String str2;
        String a2;
        androidx.compose.runtime.a M = aVar.M(1037578411);
        if ((i & 6) == 0) {
            i2 = (M.o(subscribeStatus.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1037578411, i2, -1, "com.vk.profile.community.creationonboarding.impl.finish.presentation.compose.SubscribeButton (CommunityCreationOnboardingFinishScreen.kt:164)");
            }
            int[] iArr = a.$EnumSwitchMapping$0;
            int i3 = iArr[subscribeStatus.ordinal()];
            boolean z = i3 == 1 || i3 == 2;
            if (str == null || drm0.N(str)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new mx9(i, 1, subscribeStatus, str, izsVar, false);
                    return;
                }
                return;
            }
            float f = 16;
            q630 H = s200.H(txj0.f(q630.a.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5);
            int i4 = iArr[subscribeStatus.ordinal()];
            if (i4 != 3) {
                if (i4 != 4) {
                    M.K(-380133582);
                    M.j();
                    a2 = null;
                } else {
                    a2 = zq.a(M, 680471410, R.string.community_creation_onboarding_final_subscribed, M, 0);
                }
                str2 = a2;
            } else {
                M.K(680468405);
                M.j();
                str2 = str;
            }
            ButtonSize buttonSize = ButtonSize.Large;
            int i5 = iArr[subscribeStatus.ordinal()];
            ButtonStyle buttonStyle = (i5 == 2 || i5 == 3) ? ButtonStyle.Primary : ButtonStyle.Secondary;
            int i6 = iArr[subscribeStatus.ordinal()];
            ButtonAppearance buttonAppearance = (i6 == 2 || i6 == 3) ? ButtonAppearance.Accent : ButtonAppearance.Neutral;
            boolean z2 = !z;
            boolean z3 = (i2 & 896) == 256;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new u77(izsVar, 1);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, H, null, z, false, null, null, null, str2, null, null, null, null, z2, null, null, null, aVar2, 24624, 0, 0, 4058976);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new rzg(subscribeStatus, str, izsVar, i);
        }
    }
}

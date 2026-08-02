package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityCreationProgressOnboarding.kt */
/* loaded from: classes17.dex */
public final class l0h {

    /* compiled from: CommunityCreationProgressOnboarding.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityCreationOnboardingBlock.Item.Progress.ProgressState.values().length];
            try {
                iArr[CommunityCreationOnboardingBlock.Item.Progress.ProgressState.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityCreationOnboardingBlock.Item.Progress.ProgressState.Completed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar, List list, q630 q630Var) {
        float f;
        char c;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(1491054594);
        int i2 = (M.J(list) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1491054594, i2, -1, "com.vk.community.design.compose.onboarding.progress.CommunityCreationProgressOnboarding (CommunityCreationProgressOnboarding.kt:21)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a3 = yu50.a(M, c2, cri.a.d, -719102773, list);
            int i3 = 0;
            while (a3.hasNext()) {
                Object next = a3.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                CommunityCreationOnboardingBlock.Item.Progress progress = (CommunityCreationOnboardingBlock.Item.Progress) next;
                int i5 = a.$EnumSwitchMapping$0[progress.a.ordinal()];
                if (i5 == 1) {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 1.0f;
                }
                q630 h = txj0.h(q630.a.a, 8);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 E = ahn.E(defpackage.j0.d(1.0f, h, true), "community_creation_onboarding_block_item_progress_" + cqm0.m(progress.a.name()) + '_' + i3);
                if (androidx.compose.runtime.b.d()) {
                    c = 65535;
                    z = false;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    c = 65535;
                    z = false;
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                bev0.a(f, 0, 0, ylu0Var.getIcon().j, M, E);
                i3 = i4;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yb1(list, q630Var, i, 2);
        }
    }
}

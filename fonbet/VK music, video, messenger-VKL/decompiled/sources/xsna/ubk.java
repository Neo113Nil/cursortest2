package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTask;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskProgress;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskType;
import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: CreationOnBoardingTasksScreen.kt */
/* loaded from: classes5.dex */
public final class ubk {

    /* compiled from: CreationOnBoardingTasksScreen.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SnackBar.values().length];
            try {
                iArr[SnackBar.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackBar.POST_CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackBar.STORY_CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnBoardingTaskProgress.values().length];
            try {
                iArr2[OnBoardingTaskProgress.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnBoardingTaskProgress.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OnBoardingTaskType.values().length];
            try {
                iArr3[OnBoardingTaskType.COVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OnBoardingTaskType.DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[OnBoardingTaskType.AVATAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OnBoardingTaskType.STORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OnBoardingTaskType.POST.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OnBoardingTaskType.INVITE_FRIENDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OnBoardingTaskType.COPY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OnBoardingTaskType.CONTACTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[OnBoardingTaskType.ACTION_BUTTON.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[OnBoardingTaskType.GOODS.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[OnBoardingTaskType.SERVICES.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[OnBoardingTaskType.ADS.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void a(zck zckVar, izs<? super cck, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs<? super cck, s3q0> izsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(754934763);
        if ((i & 6) == 0) {
            i2 = i | (M.J(zckVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(754934763, i3, -1, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.CreationOnboardingScreen (CreationOnBoardingTasksScreen.kt:98)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 E = ahn.E(p490.D(s200.F(kqu0.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), p490.x(M), 14), "creation_onboarding_task_dialog_container");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            ty6.a aVar5 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f = 4;
            q630 s = txj0.s(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar3), 36, f);
            ty6.a aVar6 = dt1.a.o;
            bev0.a(1.0f, 6, 0, wlb0.h(M).getIcon().o, M, lr.c(aVar6, s));
            float f2 = 24;
            fwu0.c(txj0.s(lr.c(aVar6, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), PsExtractor.AUDIO_STREAM, VersionConstants.PRODUCT_MAJOR_VERSION), null, zckVar.c, null, null, null, null, qei.b, M, 100663296, 250);
            yqv0.c(zckVar.d, s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).z, M, 0, 0, 8120);
            q630 f3 = txj0.f(aVar3, 1.0f);
            float f4 = kqu0.t;
            yqv0.c(zckVar.e, s200.H(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).T, M, 0, 0, 8120);
            aVar2 = M;
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f4), aVar5, aVar2, 0);
            int hashCode3 = Long.hashCode(n34.n(aVar2));
            sy90 D3 = aVar2.D();
            q630 c3 = qri.c(aVar2, H);
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
            k9q0.w(aVar2, a3, cVar);
            k9q0.w(aVar2, D3, eVar);
            ur.d(hashCode3, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c3, dVar);
            aVar2.K(-1442217347);
            Iterator<T> it = zckVar.b.iterator();
            while (it.hasNext()) {
                c((OnBoardingTask) it.next(), izsVar, aVar2, i3 & 112);
            }
            izsVar2 = izsVar;
            aVar2.j();
            aVar2.G();
            aVar2.G();
            b(zckVar.f, izsVar2, aVar2, ((i3 << 3) & 896) | 6);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new z7d(zckVar, izsVar2, i, 1);
        }
    }

    public static final void b(SnackBar snackBar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        a.C0011a.C0012a c0012a;
        dlv0 dlv0Var;
        spj spjVar;
        int i3;
        spj spjVar2;
        akg0 q;
        androidx.compose.runtime.a M = aVar.M(843751093);
        int i4 = i & 6;
        ra8 ra8Var = ra8.a;
        if (i4 == 0) {
            i2 = (M.J(ra8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(snackBar == null ? -1 : snackBar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i5 = i2;
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(843751093, i5, -1, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.LinkCopySnackbar (CreationOnBoardingTasksScreen.kt:176)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = yq.f(M);
            }
            dlv0 dlv0Var2 = (dlv0) x;
            if (snackBar != null) {
                M.K(2040452425);
                dt1.a.getClass();
                q630 b = ra8Var.b(q630.a.a, dt1.a.i);
                float f = kqu0.t;
                q630 H = s200.H(b, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(316178300, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline28> (VkSdkIcons.kt:364)");
                }
                lg90 b2 = or.b(M, 404637919, R.drawable.vk_icon_check_circle_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                mqv z3 = s200.z(b2, ylu0Var.getIcon().i, M);
                int[] iArr = a.$EnumSwitchMapping$0;
                int i6 = iArr[snackBar.ordinal()];
                if (i6 == 1) {
                    i3 = R.string.community_creation_onboading_copy_link;
                } else if (i6 == 2) {
                    i3 = R.string.community_creation_onboarding_post_created;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = R.string.community_creation_onboarding_story_created;
                }
                wl20 m = wlb0.m(d370.N(i3, 0, M), null, null, M, 6);
                int i7 = iArr[snackBar.ordinal()];
                Integer valueOf = (i7 == 2 || i7 == 3) ? Integer.valueOf(R.string.community_creation_onboarding_show_content) : null;
                if (valueOf == null) {
                    M.K(2041226494);
                    M.j();
                    q = null;
                    spjVar2 = null;
                } else {
                    M.K(2041226495);
                    String N = d370.N(valueOf.intValue(), 0, M);
                    boolean z4 = ((i5 & 896) == 256) | ((i5 & 112) == 32);
                    Object x2 = M.x();
                    if (z4 || x2 == c0012a2) {
                        x2 = new lb6(6, izsVar, snackBar);
                        M.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    Object x3 = M.x();
                    if (x3 == c0012a2) {
                        x3 = new e60(23);
                        M.R(x3);
                    }
                    spjVar2 = null;
                    q = xx1.q(0, 8188, M, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), N, gzsVar);
                    M.j();
                }
                dlv0Var = dlv0Var2;
                spjVar = spjVar2;
                z2 = false;
                z = true;
                c0012a = c0012a2;
                zkv0.c(dlv0Var, m, H, z3, q, null, M, 6, 96);
                M = M;
            } else {
                z = true;
                z2 = false;
                c0012a = c0012a2;
                dlv0Var = dlv0Var2;
                spjVar = null;
                M.K(2033235501);
            }
            M.j();
            boolean z5 = (i5 & 112) == 32 ? z : z2;
            if ((i5 & 896) == 256) {
                z2 = z;
            }
            boolean z6 = z5 | z2;
            Object x4 = M.x();
            if (z6 || x4 == c0012a) {
                x4 = new tbk(snackBar, dlv0Var, izsVar, spjVar);
                M.R(x4);
            }
            bap.g(snackBar, (wzs) x4, M, (i5 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ubh(snackBar, izsVar, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Object obj, izs<? super cck, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        i6v i6vVar;
        OnBoardingTaskProgress onBoardingTaskProgress;
        q630 q630Var;
        int i3;
        int i4;
        int i5;
        iyk0 iyk0Var;
        String str;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        lg90 Z0;
        long j;
        com.vk.core.compose.component.cell.content.u0 u0Var;
        int i6;
        Object x;
        androidx.compose.runtime.a M = aVar.M(-158760011);
        if ((i & 6) == 0) {
            i2 = i | (M.J(obj) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i7 = i2;
        if (M.t(i7 & 1, (i7 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-158760011, i7, -1, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.OnBoardingItem (CreationOnBoardingTasksScreen.kt:238)");
            }
            OnBoardingTask onBoardingTask = (OnBoardingTask) obj;
            String str2 = onBoardingTask.d;
            OnBoardingTaskType onBoardingTaskType = onBoardingTask.e;
            OnBoardingTaskProgress onBoardingTaskProgress2 = onBoardingTask.f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var2 = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = ahn.E(hr80.m(q630.a.a, ylu0Var.getBackground().B, vog0.b(kqu0.v)), "creation_onboarding_task_item_" + cqm0.m(onBoardingTaskType.name()) + '_' + cqm0.m(onBoardingTaskProgress2.name()));
            OnBoardingTaskProgress onBoardingTaskProgress3 = OnBoardingTaskProgress.IN_PROGRESS;
            boolean z = onBoardingTaskProgress2 == onBoardingTaskProgress3;
            i6v i6vVar2 = new i6v(onBoardingTask.b, onBoardingTask.c);
            if (str2 == null || drm0.N(str2)) {
                i6vVar = i6vVar2;
                onBoardingTaskProgress = onBoardingTaskProgress2;
                q630Var = E;
                i3 = i7;
                i4 = -1;
                i5 = 0;
                iyk0Var = iyk0Var2;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                M.K(-859675287);
                M.j();
                h1Var = null;
            } else {
                M.K(-859632476);
                i6vVar = i6vVar2;
                i3 = i7;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                q630Var = E;
                iyk0Var = iyk0Var2;
                onBoardingTaskProgress = onBoardingTaskProgress2;
                i4 = -1;
                i5 = 0;
                com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(str2, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
                h1Var = b;
            }
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(i6vVar, h1Var, null, null, M, 196608, 28);
            M.K(1882671345);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1882671345, i5, i4, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.getIcon (CreationOnBoardingTasksScreen.kt:304)");
            }
            if (onBoardingTaskProgress == OnBoardingTaskProgress.DONE) {
                M.K(-1315716631);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(983561468, i5, i4, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                }
                Z0 = pg90.a(R.drawable.vk_icon_done_24, i5, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1327141743);
                M.j();
                switch (a.$EnumSwitchMapping$2[onBoardingTaskType.ordinal()]) {
                    case 1:
                        M.K(1065939713);
                        qzu0.a.getClass();
                        Z0 = qzu0.Z0(M);
                        M.j();
                        break;
                    case 2:
                        M.K(1065941860);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(978281764, i5, i4, "com.vk.core.compose.icons.generated.VkIcons.<get-ArticleBoxOutline24> (VkIcons.kt:476)");
                        }
                        Z0 = or.b(M, -1655860677, R.drawable.vk_icon_article_box_outline_24, M, i5);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 3:
                        M.K(1065943940);
                        qzu0.a.getClass();
                        Z0 = qzu0.x1(M);
                        M.j();
                        break;
                    case 4:
                        M.K(1065945983);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(323709442, i5, i4, "com.vk.core.compose.icons.generated.VkIcons.<get-StoryOutline24> (VkIcons.kt:10546)");
                        }
                        Z0 = or.b(M, 1426579619, R.drawable.vk_icon_story_outline_24, M, i5);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 5:
                        M.K(1065947844);
                        qzu0.a.getClass();
                        Z0 = qzu0.x1(M);
                        M.j();
                        break;
                    case 6:
                        M.K(1065950177);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-452453278, i5, i4, "com.vk.core.compose.icons.generated.VkIcons.<get-UserAddOutline24> (VkIcons.kt:11136)");
                        }
                        Z0 = or.b(M, -1428054464, R.drawable.vk_icon_user_add_outline_24, M, i5);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 7:
                        M.K(1065952087);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(840406018, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Copy24> (VkIcons.kt:1756)");
                        }
                        Z0 = or.b(M, 1171477164, R.drawable.vk_icon_copy_24, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 8:
                        M.K(1065953918);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-438459630, i5, i4, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-UserOutline24> (VkSdkIcons.kt:3584)");
                        }
                        Z0 = or.b(M, -1155115631, R.drawable.vk_icon_user_outline_24, M, i5);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 9:
                        M.K(1065956037);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2095547358, i5, i4, "com.vk.core.compose.icons.generated.VkIcons.<get-HandPointUpOutline24> (VkIcons.kt:3222)");
                        }
                        Z0 = pg90.a(R.drawable.vk_icon_hand_point_up_outline_24, i5, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 10:
                        M.K(1065958112);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-277209578, i5, i4, "com.vk.core.compose.icons.generated.VkIcons.<get-MarketOutline24> (VkIcons.kt:7252)");
                        }
                        Z0 = or.b(M, 871745550, R.drawable.vk_icon_market_outline_24, M, i5);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 11:
                        M.K(1065960133);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1305425410, i5, i4, "com.vk.core.compose.icons.generated.VkIcons.<get-CalendarAddOutline24> (VkIcons.kt:928)");
                        }
                        Z0 = pg90.a(R.drawable.vk_icon_calendar_add_outline_24, i5, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 12:
                        M.K(1065962149);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(664968482, i5, i4, "com.vk.core.compose.icons.generated.VkIcons.<get-AdvertisingOutline24> (VkIcons.kt:198)");
                        }
                        Z0 = or.b(M, 1687056765, R.drawable.vk_icon_advertising_outline_24, M, i5);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    default:
                        throw alb0.c(1065938626, M);
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-175303638, i5, i4, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.getIconTint (CreationOnBoardingTasksScreen.kt:293)");
            }
            int i8 = a.$EnumSwitchMapping$1[onBoardingTaskProgress.ordinal()];
            if (i8 == 1) {
                M.K(-963065995);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i5, i4, str);
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().j;
                M.j();
            } else {
                if (i8 != 2) {
                    throw alb0.c(-963068520, M);
                }
                M.K(-963063721);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i5, i4, str);
                }
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getIcon().l;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i9 = 1;
            OnBoardingTaskProgress onBoardingTaskProgress4 = onBoardingTaskProgress;
            com.vk.core.compose.component.cell.content.i0 a3 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(Z0, size, j, null, null, M, 196664, 24), null, M, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1210122259, i5, i4, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.getChevron (CreationOnBoardingTasksScreen.kt:280)");
            }
            OnBoardingTaskType onBoardingTaskType2 = OnBoardingTaskType.COPY;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (onBoardingTaskType == onBoardingTaskType2) {
                M.K(-1203076150);
                M.j();
            } else if (onBoardingTaskProgress4 == onBoardingTaskProgress3) {
                M.K(-1008637744);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new nt(28);
                    M.R(x2);
                }
                com.vk.core.compose.component.cell.content.u0 a4 = o.b.a.a(null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), 0L, false, M, 196608, 27);
                M.j();
                u0Var = a4;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if ((i3 & 112) != 32) {
                    i9 = i5;
                }
                i6 = i9 | (M.y(onBoardingTask) ? 1 : 0);
                x = M.x();
                if (i6 == 0 || x == c0012a) {
                    x = new yk(6, izsVar, onBoardingTask);
                    M.R(x);
                }
                wiu0.b(q630Var, z, a3, a2, u0Var, (gzs) x, null, M, 0, 64);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(-1202860886);
                M.j();
            }
            u0Var = null;
            if (androidx.compose.runtime.b.d()) {
            }
            if ((i3 & 112) != 32) {
            }
            i6 = i9 | (M.y(onBoardingTask) ? 1 : 0);
            x = M.x();
            if (i6 == 0) {
            }
            x = new yk(6, izsVar, onBoardingTask);
            M.R(x);
            wiu0.b(q630Var, z, a3, a2, u0Var, (gzs) x, null, M, 0, 64);
            M = M;
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rbh(obj, izsVar, i, 1);
        }
    }
}

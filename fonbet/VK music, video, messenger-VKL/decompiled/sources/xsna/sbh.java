package xsna;

import com.vk.poll.fragments.PollVotersFragment;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sbh implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sbh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                v5v v5vVar = (v5v) obj5;
                izs izsVar = (izs) obj;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.y(izsVar) ? 4 : 2;
                }
                int i2 = intValue;
                if (aVar.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1827671279, i2, -1, "com.vk.community.design.compose.onboarding.HighlightedHeader.<anonymous>.<anonymous>.<anonymous> (CommunityOnboardingBanner.kt:118)");
                    }
                    boolean z = !wlb0.h(aVar).s();
                    long j = wlb0.h(aVar).getText().o;
                    bpn0 bpn0Var = v5v.c;
                    yqv0.d(d8v0.c(v5vVar, true, z, j, aVar, 48), ahn.E(q630.a.a, "community_onboarding_banner_block_title"), wlb0.h(aVar).getText().m, 0, null, 0, false, 0, izsVar, null, wlb0.l(aVar).p, aVar, 48, (i2 << 3) & 112, 6136);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                v5v v5vVar2 = (v5v) obj5;
                izs izsVar2 = (izs) obj;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.y(izsVar2) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(457662544, intValue2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.PostTeaserCellWithHint.<anonymous>.<anonymous> (PrivacySettingsContentView.kt:293)");
                    }
                    String str = v5vVar2.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.T;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, null, ylu0Var.d().a, null, null, 0, 0, null, 0, false, 0, 0, izsVar2, frv0Var, aVar2, 0, (intValue2 << 6) & 896, 4090);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                String str2 = (String) obj5;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                int i3 = PollVotersFragment.a0;
                if (aVar3.t(intValue3 & 1, (intValue3 & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1232155093, intValue3, -1, "com.vk.poll.fragments.PollVotersFragment.PollSegment.<anonymous> (PollVotersFragment.kt:197)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var2.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str2, null, j2, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var2.M, aVar3, 100663296, 48, 5882);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}

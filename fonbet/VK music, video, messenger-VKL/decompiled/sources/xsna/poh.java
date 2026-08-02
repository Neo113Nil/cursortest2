package xsna;

import com.vk.dto.group.creation_onboarding.GroupCreationOnboarding;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingBlock;
import com.vk.profile.community.impl.ui.profile.a;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gij;

/* compiled from: CommunityProfileFeature.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class poh extends FunctionReferenceImpl implements izs<gij.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(gij.a aVar) {
        GroupCreationOnboarding groupCreationOnboarding;
        gij.a aVar2 = aVar;
        com.vk.profile.community.impl.ui.profile.a aVar3 = (com.vk.profile.community.impl.ui.profile.a) this.receiver;
        aVar3.getClass();
        if (epx.f(aVar2.a, aVar3.i.a)) {
            int i = a.C1566a.$EnumSwitchMapping$0[aVar2.b.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                aVar3.Y(new d.b.a(aVar3.i.a, aVar2.c));
            }
            mmh mmhVar = aVar3.r;
            ExtendedCommunityProfile extendedCommunityProfile = ((CommunityProfileState) aVar3.h.c).b;
            mmhVar.getClass();
            if (extendedCommunityProfile != null && (groupCreationOnboarding = extendedCommunityProfile.K2) != null && groupCreationOnboarding.e.b == GroupCreationOnboardingBlock.Step.CLIPS) {
                mmhVar.e.invoke(new CommunityProfileAction.o(true));
            }
        }
        return s3q0.a;
    }
}

package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.good2.presentation.businessonboarding.ProductCardBusinessOnboardingState;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.NoWhenBranchMatchedException;
import xsna.ejd0;
import xsna.smd0;
import xsna.tkd0;

/* compiled from: ProductCardBusinessOnboardingActor.kt */
/* loaded from: classes18.dex */
public final class njd0 extends al50<nmd0, ejd0.a, on50, smd0, xld0, tkd0> {
    public final sj50<nmd0, on50, smd0, xld0, tkd0> c;

    public njd0(sj50<nmd0, on50, smd0, xld0, tkd0> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        ejd0.a aVar = (ejd0.a) lj50Var;
        if (!(aVar instanceof ejd0.a.C2815a)) {
            if (!(aVar instanceof ejd0.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(smd0.a.C3678a.b);
            return;
        }
        t6g0 t6g0Var = t6g0.b;
        ExtendedProfilesRepository c = t6g0.c();
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        ExtendedUserProfile L0 = c.L0(((nmd0) sj50Var.getCurrentState()).b);
        ExtendedCommunityProfile extendedCommunityProfile = L0 instanceof ExtendedCommunityProfile ? (ExtendedCommunityProfile) L0 : null;
        if (extendedCommunityProfile == null) {
            return;
        }
        UserId userId = ((nmd0) sj50Var.getCurrentState()).b;
        ProductCardBusinessOnboardingState productCardBusinessOnboardingState = ((nmd0) sj50Var.getCurrentState()).s;
        c(new tkd0.a.C3752a(userId, extendedCommunityProfile, productCardBusinessOnboardingState != null ? productCardBusinessOnboardingState.e : null));
        c(new tkd0.a.c(((nmd0) sj50Var.getCurrentState()).b));
    }
}

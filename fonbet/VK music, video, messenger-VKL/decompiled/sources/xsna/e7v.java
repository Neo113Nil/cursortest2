package xsna;

import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.efc0;

/* compiled from: HintsFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class e7v {
    public final efc0.a a;
    public final h7v b;
    public final Lazy<q7v0> c;
    public final evl0 d;

    public e7v(efc0.a aVar, h7v h7vVar, Lazy lazy, evl0 evl0Var) {
        this.a = aVar;
        this.b = h7vVar;
        this.c = lazy;
        this.d = evl0Var;
    }

    public final void a(PostingState postingState, PostingAction.Hints hints) {
        Hint p;
        HintId hintId;
        boolean z = hints instanceof PostingAction.Hints.RemoveNextStepButtonHint;
        efc0.a aVar = this.a;
        h7v h7vVar = this.b;
        if (z) {
            h7vVar.b(HintId.POSTING_NEXT_STEP_BUTTON.getId());
            aVar.a(ijc0.b);
            return;
        }
        if (hints instanceof PostingAction.Hints.RemoveCoauthorsOnboardingHint) {
            h7vVar.b(HintId.POSTING_COAUTHORS_ONBOARDING.getId());
            aVar.a(fjc0.b);
            return;
        }
        if (hints instanceof PostingAction.Hints.RemoveDonutOnboardingHint) {
            h7vVar.b(HintId.POSTING_DONUT_ONBOARDING.getId());
            aVar.a(gjc0.b);
            return;
        }
        if (hints instanceof PostingAction.Hints.RemoveProductsActionOnboardingHint) {
            if (postingState.x().g == null || (hintId = HintId.FEED_POSTING_ACTIONS_PROFILE) == null) {
                hintId = HintId.FEED_POSTING_ACTIONS_COMMUNITY;
            }
            h7vVar.b(hintId.getId());
            h7vVar.v(hintId.getId()).c();
            aVar.a(jjc0.b);
            return;
        }
        if (hints instanceof PostingAction.Hints.RemoveMusicSnippetOnboardingHint) {
            if (postingState.x().t) {
                HintId hintId2 = HintId.FEED_POSTING_AUDIO_SNIPPETS;
                h7vVar.b(hintId2.getId());
                h7vVar.v(hintId2.getId()).c();
                aVar.a(hjc0.b);
                return;
            }
            return;
        }
        if (hints instanceof PostingAction.Hints.RemoveRemoteDraftOnboardingHint) {
            HintId hintId3 = HintId.POSTING_REMOTE_DRAFTS_ONBOARDING;
            h7vVar.b(hintId3.getId());
            h7vVar.v(hintId3.getId()).c();
            aVar.a(kjc0.b);
            return;
        }
        if (hints instanceof PostingAction.Hints.LoadRemoteDraftOnboardingHint) {
            HintId hintId4 = HintId.POSTING_REMOTE_DRAFTS_ONBOARDING;
            String str = null;
            if (h7vVar.m(hintId4) && (p = h7vVar.p(hintId4.getId())) != null) {
                str = p.c;
            }
            if (str != null) {
                aVar.a(new djc0(str));
                return;
            }
            return;
        }
        if (hints instanceof PostingAction.Hints.RemoveVkTicketOnboardingHint) {
            HintId hintId5 = HintId.FEED_POSTING_VK_TICKET_ACTION_BUTTON;
            h7vVar.b(hintId5.getId());
            h7vVar.v(hintId5.getId()).c();
            aVar.a(ljc0.b);
            return;
        }
        if (hints.equals(PostingAction.Hints.RemoveBcProductsPostingOnboardingHint.b)) {
            HintId hintId6 = HintId.FEED_POSTING_NEW_BC_POSTING_ONBOARDING;
            h7vVar.b(hintId6.getId());
            h7vVar.v(hintId6.getId()).c();
            aVar.a(ejc0.b);
            return;
        }
        if (hints.equals(PostingAction.Hints.RepostToStoryOnboardingShowed.b)) {
            aqw.o(this.c.getValue(), "stories:auto_repost:sum_likes", new pv7((byte) 0, 7));
        } else {
            if (!hints.equals(PostingAction.Hints.DonutPrivacyOnboardingShowed.b)) {
                throw new NoWhenBranchMatchedException();
            }
            h7vVar.b((fkq0.d(postingState.getContext().b.b) ? HintId.DONUT_PROFILE_POSTING_ONBOARDING : HintId.DONUT_GROUP_POSTING_ONBOARDING).getId());
            aVar.a(gjc0.b);
        }
    }
}

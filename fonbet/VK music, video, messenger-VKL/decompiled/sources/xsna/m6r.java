package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$ValidationOldPostData$CheckRules;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.domain.rules.api.RestrictCombinationRule;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.efc0;

/* compiled from: FetchFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class m6r {
    public final efc0.a a;
    public final wb7 b;
    public final vou c;
    public final com.vk.movika.sdk.base.asset.b d;
    public final rj01 e;
    public final h7v f;
    public final cpc0 g;
    public final List<RestrictCombinationRule> h;

    public m6r(efc0.a aVar, wb7 wb7Var, vou vouVar, com.vk.movika.sdk.base.asset.b bVar, rj01 rj01Var, h7v h7vVar, jgz jgzVar, cpc0 cpc0Var) {
        this.a = aVar;
        this.b = wb7Var;
        this.c = vouVar;
        this.d = bVar;
        this.e = rj01Var;
        this.f = h7vVar;
        this.g = cpc0Var;
        RuleAttachment ruleAttachment = RuleAttachment.Photo;
        RuleAttachment ruleAttachment2 = RuleAttachment.Article;
        Set y0 = rl3.y0(new RuleAttachment[]{ruleAttachment, ruleAttachment2});
        Context context = e43.a;
        RestrictCombinationRule restrictCombinationRule = new RestrictCombinationRule(y0, (context == null ? null : context).getString(R.string.posting_rule_restriction_article_photo));
        RuleAttachment ruleAttachment3 = RuleAttachment.Link;
        Set y02 = rl3.y0(new RuleAttachment[]{ruleAttachment, ruleAttachment3});
        Context context2 = e43.a;
        RestrictCombinationRule restrictCombinationRule2 = new RestrictCombinationRule(y02, (context2 == null ? null : context2).getString(R.string.posting_rule_restriction_link_photo));
        Set y03 = rl3.y0(new RuleAttachment[]{ruleAttachment2, ruleAttachment3});
        Context context3 = e43.a;
        RestrictCombinationRule restrictCombinationRule3 = new RestrictCombinationRule(y03, (context3 == null ? null : context3).getString(R.string.posting_rule_restriction_article_link));
        RuleAttachment ruleAttachment4 = RuleAttachment.Video;
        Set y04 = rl3.y0(new RuleAttachment[]{ruleAttachment4, ruleAttachment2});
        Context context4 = e43.a;
        RestrictCombinationRule restrictCombinationRule4 = new RestrictCombinationRule(y04, (context4 == null ? null : context4).getString(R.string.posting_rule_restriction_article_video));
        Set y05 = rl3.y0(new RuleAttachment[]{ruleAttachment4, ruleAttachment3});
        Context context5 = e43.a;
        this.h = e43.l(restrictCombinationRule, restrictCombinationRule2, restrictCombinationRule3, restrictCombinationRule4, new RestrictCombinationRule(y05, (context5 != null ? context5 : null).getString(R.string.posting_rule_restriction_link_video)));
    }

    public final void a(PostingAction.Fetch.CheckEditPostRules checkEditPostRules) {
        qjc0 qjc0Var = new qjc0(checkEditPostRules.b, checkEditPostRules.c, checkEditPostRules.d, checkEditPostRules.e);
        efc0.a aVar = this.a;
        aVar.a(qjc0Var);
        aVar.d(new PostingAction$ValidationOldPostData$CheckRules(this.h));
    }

    public final void b(UserId userId, Integer num) {
        PostingAction.Fetch.SettingsLoadingState settingsLoadingState = new PostingAction.Fetch.SettingsLoadingState(LoadingState.LOADING, null, 2, null);
        efc0.a aVar = this.a;
        aVar.d(settingsLoadingState);
        j3j0 j3j0Var = (j3j0) this.b.b;
        max0 max0Var = new max0();
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        aVar.a.e.b(rsg0.W(yfb.x(lax0.k(max0Var, userId, num, 8)), 7).l(new qca0(new q1(j3j0Var, 7), 5)).subscribe(new xf1(new gb(18, this, userId), 20), new az(new wze(this, 24), 24)));
    }

    public final void c(PostingState postingState) {
        PostingAction.Fetch.LoadHints loadHints = new PostingAction.Fetch.LoadHints(postingState.x());
        efc0.a aVar = this.a;
        aVar.d(loadHints);
        Iterator<PostingAction> it = postingState.D7().iterator();
        while (it.hasNext()) {
            aVar.d(it.next());
        }
    }
}

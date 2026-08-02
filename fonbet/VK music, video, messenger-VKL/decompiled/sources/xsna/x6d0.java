package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.link.EnhancedFeedLinkCard;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vkontakte.android.R;
import kotlin.Triple;
import xsna.tlo0;
import xsna.y6d0;

/* compiled from: PrimaryArticlePlaceholderHolderEnhanced.kt */
/* loaded from: classes4.dex */
public final class x6d0 extends rp6<y6d0, NewsEntry> implements View.OnClickListener, blc0, i7o {
    public final EnhancedFeedLinkCard E;
    public e6o F;

    public x6d0(ViewGroup viewGroup) {
        super(R.layout.attach_primary_link_card_enhanced, viewGroup);
        this.E = (EnhancedFeedLinkCard) this.itemView.findViewById(R.id.enhanced_link_card);
        View.OnClickListener onClickListener = this.F;
        this.itemView.setOnClickListener(onClickListener == null ? this : onClickListener);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        EnhancedFeedLinkCard enhancedFeedLinkCard = this.E;
        if (z) {
            enhancedFeedLinkCard.setBadge(FeedLinkCard.a.C1053a.a);
        } else {
            enhancedFeedLinkCard.setBadge(null);
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a = s6oVar.a(this, s6oVar.e);
        this.F = a;
        this.itemView.setOnClickListener(a);
    }

    @Override // xsna.rp6
    public final void R6(y6d0 y6d0Var) {
        y6d0 y6d0Var2 = y6d0Var;
        boolean z = !y6d0Var2.m;
        EnhancedFeedLinkCard enhancedFeedLinkCard = this.E;
        enhancedFeedLinkCard.setCardEnabledState(z);
        String str = y6d0Var2.h;
        String str2 = y6d0Var2.i;
        enhancedFeedLinkCard.setFooter(new FeedLinkCard.c.a(str != null ? oq.d(tlo0.Companion, str) : null, oq.d(tlo0.Companion, y6d0Var2.j ? this.itemView.getContext().getString(R.string.article_author_group, str2) : this.itemView.getContext().getString(R.string.article_author_user, str2))));
        y6d0.a aVar = y6d0Var2.k;
        if (aVar != null) {
            gko gkoVar = new gko(aVar.a);
            Integer num = aVar.b;
            enhancedFeedLinkCard.setContent(new FeedLinkCard.b.C1054b(gkoVar, num != null ? new tlo0.f(num.intValue()) : null));
        } else {
            enhancedFeedLinkCard.setContent(null);
        }
        y6d0.b bVar = y6d0Var2.l;
        if (bVar == null) {
            enhancedFeedLinkCard.setOverlayContent(null);
            return;
        }
        Triple<String, Integer, String> triple = bVar.a;
        String d = triple.d();
        Integer g = triple.g();
        String h = triple.h();
        if (d == null) {
            d = (h == null || g == null) ? g != null ? this.itemView.getContext().getString(g.intValue()) : "" : this.itemView.getContext().getString(g.intValue(), h);
        }
        enhancedFeedLinkCard.setOverlayContent(new FeedLinkCard.OverlayContent.ActionButtonWithTitle(d, this.itemView.getContext().getString(R.string.article_protected_action), FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.Primary));
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.E.setOnBadgeClickListener(onClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        u1c0 J0 = J0();
        r74 r74Var = J0 instanceof r74 ? (r74) J0 : null;
        if (r74Var == null) {
            return;
        }
        Attachment attachment = r74Var.q;
        s980 s980Var = this.y;
        if (s980Var != 0) {
            s980Var.Mg(view, J0(), q6(), attachment);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}

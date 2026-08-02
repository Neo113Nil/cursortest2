package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.link.EnhancedFeedLinkCard;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: PrimaryArticleDonutHolderEnhanced.kt */
/* loaded from: classes4.dex */
public final class v6d0 extends rp6<w6d0, NewsEntry> implements View.OnClickListener, blc0, i7o {
    public final EnhancedFeedLinkCard E;
    public e6o F;

    public v6d0(ViewGroup viewGroup) {
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
    public final void R6(w6d0 w6d0Var) {
        CharSequence charSequence;
        w6d0 w6d0Var2 = w6d0Var;
        Photo photo = w6d0Var2.k;
        tlo0.h d = oq.d(tlo0.Companion, w6d0Var2.h);
        boolean z = w6d0Var2.j;
        String str = w6d0Var2.i;
        FeedLinkCard.c.a aVar = new FeedLinkCard.c.a(d, new tlo0.h(z ? this.itemView.getContext().getString(R.string.article_author_group, str) : this.itemView.getContext().getString(R.string.article_author_user, str)));
        EnhancedFeedLinkCard enhancedFeedLinkCard = this.E;
        enhancedFeedLinkCard.setFooter(aVar);
        String str2 = w6d0Var2.l;
        ImageSize Fb = photo != null ? photo.Fb(iah0.f().widthPixels, false) : null;
        enhancedFeedLinkCard.setContent(new FeedLinkCard.b.a(Fb != null ? Fb.d.d : null, photo != null ? photo.P : null, Fb != null, str2));
        boolean z2 = photo != null;
        DonutPriceTemplate donutPriceTemplate = w6d0Var2.o;
        if (donutPriceTemplate != null) {
            charSequence = y1o.b(donutPriceTemplate, this.itemView.getContext());
        } else {
            charSequence = w6d0Var2.n;
            bpn0 bpn0Var = cqm0.a;
            if (charSequence == null) {
                charSequence = "";
            }
        }
        String str3 = w6d0Var2.m;
        if (str3 == null) {
            str3 = this.itemView.getContext().getString(R.string.article_paid);
        }
        enhancedFeedLinkCard.setOverlayContent(new FeedLinkCard.OverlayContent.ActionButtonWithTitle(str3, charSequence, z2 ? FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.Contrast : FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.Primary));
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

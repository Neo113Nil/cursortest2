package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.link.EnhancedFeedLinkCard;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vkontakte.android.R;
import kotlin.Triple;
import xsna.tlo0;

/* compiled from: PrimaryLinkHolderV2Enhanced.kt */
/* loaded from: classes4.dex */
public final class v9d0 extends rp6<u9d0, NewsEntry> implements View.OnClickListener, blc0, i7o, co10 {
    public final EnhancedFeedLinkCard E;
    public e6o F;

    public v9d0(ViewGroup viewGroup) {
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
    public final void R6(u9d0 u9d0Var) {
        u9d0 u9d0Var2 = u9d0Var;
        String str = u9d0Var2.h;
        Triple<String, Integer, String> triple = u9d0Var2.i;
        tlo0.h d = oq.d(tlo0.Companion, str);
        String d2 = triple.d();
        Integer g = triple.g();
        String h = triple.h();
        if (d2 == null) {
            d2 = (h == null || g == null) ? g != null ? this.itemView.getContext().getString(g.intValue()) : "" : this.itemView.getContext().getString(g.intValue(), h);
        }
        FeedLinkCard.c.a aVar = new FeedLinkCard.c.a(d, new tlo0.h(d2));
        EnhancedFeedLinkCard enhancedFeedLinkCard = this.E;
        enhancedFeedLinkCard.setFooter(aVar);
        Photo photo = u9d0Var2.j;
        String str2 = u9d0Var2.k;
        ImageSize Fb = photo != null ? photo.Fb(iah0.f().widthPixels, false) : null;
        enhancedFeedLinkCard.setContent(new FeedLinkCard.b.a(Fb != null ? Fb.d.d : null, photo != null ? photo.P : null, false, str2));
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.E.setOnBadgeClickListener(onClickListener);
    }

    @Override // xsna.co10
    public final void j3(int i) {
        this.E.setCardMaxHeight(i);
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

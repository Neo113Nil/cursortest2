package xsna;

import android.graphics.drawable.Drawable;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.imageloader.view.VKImageView;

/* compiled from: SendReactionButtonDelegate.kt */
/* loaded from: classes4.dex */
public final class fii0 {
    public final VKImageView a;
    public final FeedAnimatedView b;
    public final eii0 c = new eii0(this);
    public final vfe d = new vfe(this);
    public o2f0 e;
    public q6s f;
    public String g;
    public boolean h;

    public fii0(VKImageView vKImageView, FeedAnimatedView feedAnimatedView) {
        this.a = vKImageView;
        this.b = feedAnimatedView;
    }

    public final void a(q6s q6sVar, ReactionMeta reactionMeta) {
        ReactionAsset d = reactionMeta.d();
        String str = d != null ? d.b : null;
        if (str == null || str.length() == 0) {
            c();
            return;
        }
        if (q6sVar == this.f && str == this.g) {
            return;
        }
        if (!this.h) {
            c();
            return;
        }
        FeedAnimatedView feedAnimatedView = this.b;
        d(feedAnimatedView);
        this.g = str;
        this.f = q6sVar;
        bwt0.p0(this.a, false);
        bwt0.p0(feedAnimatedView, true);
        feedAnimatedView.e(str, true);
    }

    public final void b(o2f0 o2f0Var, ReactionMeta reactionMeta) {
        ReactionAsset d = reactionMeta.d();
        String str = d != null ? d.b : null;
        if (str == null || str.length() == 0) {
            c();
            return;
        }
        if (o2f0Var == this.e && str == this.g) {
            return;
        }
        if (!this.h) {
            c();
            return;
        }
        FeedAnimatedView feedAnimatedView = this.b;
        d(feedAnimatedView);
        this.g = str;
        this.e = o2f0Var;
        bwt0.p0(this.a, false);
        bwt0.p0(feedAnimatedView, true);
        feedAnimatedView.e(str, true);
    }

    public final void c() {
        this.g = null;
        this.e = null;
        this.f = null;
        bwt0.p0(this.a, true);
        FeedAnimatedView feedAnimatedView = this.b;
        bwt0.p0(feedAnimatedView, false);
        feedAnimatedView.setAnimating(false);
        feedAnimatedView.g();
    }

    public final void d(FeedAnimatedView feedAnimatedView) {
        feedAnimatedView.setPlayCount(1);
        feedAnimatedView.setAnimationListener(this.c);
        feedAnimatedView.setAnimationSize(cn70.b(24));
        feedAnimatedView.setSafeZoneSize(cn70.b(4));
        feedAnimatedView.setOnLoadAnimationCallback(this.d);
        feedAnimatedView.setPlaceholderImage((Drawable) null);
        feedAnimatedView.setColorFilter(null);
    }
}

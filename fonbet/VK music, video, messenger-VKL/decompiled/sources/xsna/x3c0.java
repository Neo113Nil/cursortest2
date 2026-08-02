package xsna;

import android.view.View;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.feed.design.view.newsfeed.header.type.VkFeedHeaderActionButtonType;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import com.vkontakte.android.attachments.ShitAttachment;

/* compiled from: PostHeaderHolderV2.kt */
/* loaded from: classes4.dex */
public final class x3c0 implements View.OnClickListener {
    public final /* synthetic */ w3c0 b;

    public x3c0(w3c0 w3c0Var) {
        this.b = w3c0Var;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        View view3;
        w3c0 w3c0Var = this.b;
        rwm0 rwm0Var = w3c0Var.H;
        VkFeedPostHeaderView vkFeedPostHeaderView = w3c0Var.M;
        ?? q6 = w3c0Var.q6();
        if (q6 == 0) {
            return;
        }
        boolean z = q6 instanceof ShitAttachment;
        boolean z2 = z && ((ShitAttachment) q6).Gb();
        if (z2) {
            ShitAttachment shitAttachment = z ? (ShitAttachment) q6 : null;
            if (shitAttachment != null) {
                w3c0Var.G.h(shitAttachment);
            }
        }
        if ((q6 instanceof Post) || (q6 instanceof Videos) || z2) {
            if (w3c0Var.J == VkFeedHeaderActionButtonType.SUBSCRIBE_AVATAR && !sni.q(q6)) {
                hi60 hi60Var = w3c0Var.D;
                if (vkFeedPostHeaderView.getOptionsIsVisible() && w3c0Var.J == VkFeedHeaderActionButtonType.SUBSCRIBE_IMAGE) {
                    view3 = vkFeedPostHeaderView.getSubscriptionAnchor();
                } else {
                    view3 = rwm0Var.e;
                    if (view3 == null) {
                        view3 = vkFeedPostHeaderView.getSubscriptionAnchor();
                    }
                }
                hi60Var.sa(new NewsfeedExternalAction.c.a.b(view3, w3c0Var.itemView.getContext(), q6, w3c0Var.u, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint.HEADER_PHOTO_FOLLOW_BUTTON));
                return;
            }
            if (w3c0Var.J == VkFeedHeaderActionButtonType.SUBSCRIBE_TEXT_WITH_BG) {
                w3c0Var.D.sa(new NewsfeedExternalAction.c.a.C1438c(w3c0Var.itemView.getContext(), q6, w3c0Var.u, w3c0Var.b7(), w3c0.e7(w3c0Var.J)));
                return;
            }
            hi60 hi60Var2 = w3c0Var.D;
            if (vkFeedPostHeaderView.getOptionsIsVisible() && w3c0Var.J == VkFeedHeaderActionButtonType.SUBSCRIBE_IMAGE) {
                view2 = vkFeedPostHeaderView.getSubscriptionAnchor();
            } else {
                view2 = rwm0Var.e;
                if (view2 == null) {
                    view2 = vkFeedPostHeaderView.getSubscriptionAnchor();
                }
            }
            hi60Var2.sa(new NewsfeedExternalAction.c.a.C1437a(view2, q6, w3c0Var.u, w3c0Var.b7()));
        }
    }
}

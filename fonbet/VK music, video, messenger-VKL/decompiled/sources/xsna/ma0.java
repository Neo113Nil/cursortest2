package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.qr80;
import xsna.tlo0;

/* compiled from: ActivityLikesHolder.kt */
/* loaded from: classes4.dex */
public final class ma0 extends rp6<k4c0, Post> implements View.OnClickListener, w8i, iis, al2 {
    public static final m900<Pair<Long, Integer>, Boolean> K = new m900<>(30);
    public final View E;
    public final VkUserStack F;
    public final AvatarAnimatedStack G;
    public boolean H;
    public final Object I;
    public final Object J;

    public ma0(ViewGroup viewGroup) {
        super(R.layout.post_activity_likes_v2, viewGroup);
        getContext();
        this.E = this.itemView.findViewById(R.id.container_post_activity_likes);
        VkUserStack vkUserStack = (VkUserStack) this.itemView.findViewById(R.id.user_stack);
        this.F = vkUserStack;
        this.G = (AvatarAnimatedStack) this.itemView.findViewById(R.id.user_stack_animated_like);
        ka0 ka0Var = new ka0(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.I = msy.a(lazyThreadSafetyMode, ka0Var);
        this.J = msy.a(lazyThreadSafetyMode, new la0(0));
        this.itemView.setBackground(null);
        bwt0.t0(this.itemView, 0, iah0.a(10), 0, 0, 13);
        if (vkUserStack != null) {
            f4m.s(0, vkUserStack);
        }
        bwt0.h0(this, this.itemView);
    }

    @Override // xsna.rp6
    public final void R6(k4c0 k4c0Var) {
        k4c0 k4c0Var2 = k4c0Var;
        tlo0.h hVar = k4c0Var2.m;
        boolean z = k4c0Var2.l;
        VkUserStack vkUserStack = this.F;
        AvatarAnimatedStack avatarAnimatedStack = this.G;
        if (z) {
            this.H = false;
            if (avatarAnimatedStack != null) {
                avatarAnimatedStack.setText(hVar);
            }
            if (avatarAnimatedStack != null) {
                avatarAnimatedStack.a(k4c0Var2.k, k4c0Var2.j);
            }
        } else {
            if (vkUserStack != null) {
                vkUserStack.setText(hVar);
            }
            if (vkUserStack != null) {
                vkUserStack.setAvatars(k4c0Var2.i);
            }
        }
        int a = iah0.a(6);
        if (!z) {
            a = iah0.a(10);
        }
        bwt0.t0(this.itemView, 0, a, 0, 0, 13);
        int a2 = iah0.a(4);
        if (!z) {
            a2 = iah0.a(8);
        }
        View view = this.E;
        if (view != null) {
            f4m.v(a2, view);
        }
        if (vkUserStack != null) {
            vkUserStack.setVisibility(!z ? 0 : 8);
        }
        if (avatarAnimatedStack != null) {
            avatarAnimatedStack.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.iis
    public final void X4() {
        k4c0 k4c0Var = (k4c0) this.C;
        if (k4c0Var == null) {
            return;
        }
        Post post = (Post) q6();
        Pair<Long, Integer> pair = post != null ? new Pair<>(Long.valueOf(post.m.b), Integer.valueOf(post.n)) : null;
        if (!k4c0Var.l || this.H || pair == null) {
            return;
        }
        m900<Pair<Long, Integer>, Boolean> m900Var = K;
        if (m900Var.get(pair) == null) {
            m900Var.put(pair, Boolean.TRUE);
            this.H = true;
            AvatarAnimatedStack avatarAnimatedStack = this.G;
            if (avatarAnimatedStack != null && !avatarAnimatedStack.n) {
                avatarAnimatedStack.m = true;
                if (avatarAnimatedStack.l) {
                    FeedAnimatedView feedAnimatedView = avatarAnimatedStack.d;
                    if (!feedAnimatedView.x) {
                        feedAnimatedView.setAnimating(true);
                    }
                }
            }
            p4r p4rVar = (p4r) this.J.getValue();
            Post post2 = k4c0Var.h;
            long j = post2.n;
            UserId userId = post2.m;
            String str = this.v;
            long j2 = k4c0Var.n;
            p4rVar.getClass();
            String valueOf = String.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
            UiTracker uiTracker = UiTracker.a;
            new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, Long.valueOf(j), Long.valueOf(userId.b), null, str, null, 40, null), valueOf, valueOf, null, new MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesText(j2), 8)).q();
        }
    }

    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PostDonut.Paywall paywall;
        PostDonut.Snippet snippet;
        LinkButton linkButton;
        Action action;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton2;
        k4c0 k4c0Var = (k4c0) this.C;
        if (k4c0Var == null) {
            return;
        }
        Post post = k4c0Var.h;
        if (!post.jc()) {
            ((NewsfeedRouter) this.I.getValue()).b0(this.itemView.getContext(), post, ModalPostDestination.REACTIONS_ALL, false, null, null, post.L.b, qr80.f.a);
            return;
        }
        PostDonut postDonut = post.R;
        if (postDonut == null || (placeholder = postDonut.c) == null || (linkButton2 = placeholder.c) == null || (action = linkButton2.c) == null) {
            if (postDonut == null || (paywall = postDonut.g) == null || (snippet = paywall.d) == null || (linkButton = snippet.e) == null) {
                return;
            } else {
                action = linkButton.c;
            }
        }
        hd60.a().v(action, this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : this.u, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
        p4r p4rVar = (p4r) this.J.getValue();
        String str = this.v;
        UserId userId = post.m;
        Integer valueOf = Integer.valueOf(post.n);
        p4rVar.getClass();
        p4r.a(MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick.Subtype.LIKES_ACTIVITY, str, userId, valueOf);
    }
}

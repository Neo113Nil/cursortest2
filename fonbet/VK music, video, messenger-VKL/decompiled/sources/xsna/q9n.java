package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.imageloader.view.VKImageView;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vkontakte.android.R;

/* compiled from: DiscoverStoryPreviewHolder.kt */
/* loaded from: classes6.dex */
public final class q9n extends vfz<rrl0> implements View.OnClickListener, View.OnLongClickListener {
    public final izs<StoriesContainer, s3q0> l;
    public final izs<StoriesContainer, s3q0> m;
    public final VKImageView n;
    public final StoryAvatarView o;
    public final TextView p;
    public final ShimmerFrameLayout q;
    public final FrameLayout r;
    public rrl0 s;
    public final p9n t;

    public q9n(ViewGroup viewGroup, bw6 bw6Var, p99 p99Var) {
        super(R.layout.stories_discover_preview, viewGroup);
        this.l = bw6Var;
        this.m = p99Var;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.preview);
        this.n = vKImageView;
        this.o = (StoryAvatarView) this.itemView.findViewById(R.id.photo);
        this.p = (TextView) this.itemView.findViewById(R.id.name);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.stories_discover_skeleton_shimmer);
        this.q = shimmerFrameLayout;
        this.r = (FrameLayout) this.itemView.findViewById(R.id.stories_discover_preview_content);
        this.t = new p9n(this);
        njt hierarchy = vKImageView.getHierarchy();
        if (hierarchy != null) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.c(iah0.b(0.5f), viewGroup.getContext().getColor(R.color.vk_white_alpha12));
            hierarchy.u(roundingParams);
        }
        this.itemView.setOnClickListener(this);
        this.itemView.setOnLongClickListener(this);
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(false).i();
        cVar.k(viewGroup.getContext().getColor(R.color.vk_gray_50));
        cVar.a.d = viewGroup.getContext().getColor(R.color.vk_gray_800);
        shimmerFrameLayout.b(((Shimmer.c) ((Shimmer.c) cVar.d()).g(0.08f).h()).e(800L).a());
    }

    @Override // xsna.vfz
    public final void W5(rrl0 rrl0Var) {
        String zb;
        rrl0 rrl0Var2 = rrl0Var;
        this.s = rrl0Var2;
        StoriesContainer storiesContainer = rrl0Var2.b;
        p9n p9nVar = this.t;
        VKImageView vKImageView = this.n;
        vKImageView.setOnLoadCallback(p9nVar);
        StoryEntry Lb = storiesContainer.Lb();
        vKImageView.load(Lb != null ? Lb.Bb(iah0.f().widthPixels / 3) : null);
        StoriesContainer storiesContainer2 = rrl0Var2.b;
        ayl0 ayl0Var = new ayl0();
        StoryAvatarView storyAvatarView = this.o;
        storyAvatarView.t1(storiesContainer2, false, ayl0Var, null);
        StoryOwner storyOwner = storiesContainer.b;
        storyAvatarView.s1(storiesContainer.Hb(iah0.a(40.0f)), (storyOwner == null || !storyOwner.Lb()) ? AvatarBorderType.CIRCLE : AvatarBorderType.HEXAGON);
        StoryOwner storyOwner2 = storiesContainer.b;
        String Gb = storyOwner2 != null ? storyOwner2.Gb() : null;
        if (Gb == null || drm0.N(Gb)) {
            zb = storiesContainer.zb();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(storiesContainer.zb());
            sb.append('\n');
            StoryOwner storyOwner3 = storiesContainer.b;
            sb.append(storyOwner3 != null ? storyOwner3.Gb() : null);
            zb = sb.toString();
        }
        this.p.setText(zb);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rrl0 rrl0Var;
        StoriesContainer storiesContainer;
        if (jjc.b() || (rrl0Var = this.s) == null || (storiesContainer = rrl0Var.b) == null) {
            return;
        }
        this.l.invoke(storiesContainer);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        StoriesContainer storiesContainer;
        rrl0 rrl0Var = this.s;
        if (rrl0Var == null || (storiesContainer = rrl0Var.b) == null) {
            return true;
        }
        this.m.invoke(storiesContainer);
        return true;
    }
}

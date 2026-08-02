package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.core.view.avatars.StoryBorderView;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.w43;

/* compiled from: GroupedStoryPreviewHolder.kt */
/* loaded from: classes6.dex */
public final class mou extends vif0<StoriesContainer> implements View.OnClickListener, View.OnLongClickListener {
    public final xsl0 n;
    public final izs<StoriesContainer, s3q0> o;
    public final izs<androidx.appcompat.app.d, s3q0> p;
    public final VKImageView q;
    public final VKImageView r;
    public final StoryBorderView s;
    public final TextView t;
    public final View u;
    public final View v;

    public mou(ViewGroup viewGroup, xsl0 xsl0Var, w43.c cVar, w43.d dVar) {
        super(viewGroup, R.layout.stories_grouped_preview, 0);
        this.n = xsl0Var;
        this.o = cVar;
        this.p = dVar;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.preview);
        this.q = vKImageView;
        VKImageView vKImageView2 = (VKImageView) this.itemView.findViewById(R.id.photo);
        this.r = vKImageView2;
        this.s = (StoryBorderView) this.itemView.findViewById(R.id.border);
        this.t = (TextView) this.itemView.findViewById(R.id.name);
        this.u = this.itemView.findViewById(R.id.live_icon);
        this.v = this.itemView.findViewById(R.id.badge);
        njt hierarchy = vKImageView.getHierarchy();
        if (hierarchy != null) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.c(iah0.b(0.5f), viewGroup.getContext().getColor(R.color.vk_white_alpha12));
            hierarchy.u(roundingParams);
        }
        njt hierarchy2 = vKImageView2.getHierarchy();
        if (hierarchy2 != null) {
            RoundingParams a = RoundingParams.a();
            a.c(iah0.b(1.0f), viewGroup.getContext().getColor(R.color.vk_black_alpha12));
            hierarchy2.u(a);
        }
        this.itemView.setOnClickListener(this);
        this.itemView.setOnLongClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(StoriesContainer storiesContainer) {
        StoriesContainer storiesContainer2 = storiesContainer;
        boolean Cb = storiesContainer2.Cb();
        boolean z = storiesContainer2 instanceof LiveFinishedStoriesContainer;
        View view = this.v;
        View view2 = this.u;
        StoryBorderView storyBorderView = this.s;
        if (z) {
            view2.setBackground(m33.a(Cb ? R.drawable.vk_icon_play_circle_fill_pink_16 : R.drawable.vk_icon_play_circle_fill_gray_16, this.l.getContext()));
            bwt0.p0(view2, true);
            bwt0.p0(view, false);
            storyBorderView.setLive(Cb);
        } else if (fsk.A(storiesContainer2)) {
            bwt0.p0(view2, false);
            bwt0.p0(view, true);
            storyBorderView.setLive(true);
        } else {
            bwt0.p0(view2, false);
            bwt0.p0(view, false);
            storyBorderView.setLive(false);
        }
        VKImageView vKImageView = this.r;
        if (Cb) {
            int a = iah0.a(2.0f);
            vKImageView.setPadding(a, a, a, a);
            bwt0.p0(storyBorderView, true);
        } else {
            vKImageView.setPadding(0, 0, 0, 0);
            bwt0.p0(storyBorderView, false);
        }
        StoryEntry Lb = storiesContainer2.Lb();
        this.q.load(Lb != null ? Lb.Bb(iah0.f().widthPixels / 3) : null);
        vKImageView.load(storiesContainer2.Hb(iah0.a(28.0f)));
        this.t.setText(storiesContainer2.Ib());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StoriesContainer storiesContainer;
        if (jjc.b() || (storiesContainer = (StoriesContainer) this.m) == null) {
            return;
        }
        this.o.invoke(storiesContainer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        StoriesContainer storiesContainer = (StoriesContainer) this.m;
        if (storiesContainer != null) {
            srl0 srl0Var = new srl0(this.l.getContext(), this.n);
            srl0Var.e = storiesContainer;
            srl0Var.d = (storiesContainer.Pb() || fsk.B(storiesContainer)) ? false : true;
            this.p.invoke(srl0Var.a());
        }
        return true;
    }
}

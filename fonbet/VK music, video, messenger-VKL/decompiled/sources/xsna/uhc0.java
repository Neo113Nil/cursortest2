package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.hints.HintId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vkontakte.android.R;

/* compiled from: PostingItemNewPostAdapter.kt */
/* loaded from: classes4.dex */
public final class uhc0 extends vif0<s3q0> implements jgc0, View.OnClickListener {
    public final View n;
    public final TextView o;
    public final View p;
    public final View q;
    public final View r;
    public final View s;
    public final View t;
    public final View u;

    public uhc0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.holder_newsfeed_create_post, 0);
        this.n = this.itemView.findViewById(R.id.create_post_title_icon);
        this.o = (TextView) this.itemView.findViewById(R.id.create_post_title_text);
        View findViewById = this.itemView.findViewById(R.id.create_post_gallery_image);
        this.p = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.create_post_clip);
        this.q = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.create_post_live_image);
        this.r = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.create_post_story_image);
        this.s = findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.create_post_sitposting);
        this.t = findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.whats_new_button);
        this.u = findViewById6;
        g620.f().getExperiments().c();
        PostingCreationEntryPoint postingCreationEntryPoint = PostingCreationEntryPoint.Other;
        jjc.f(this, this.itemView);
        jjc.f(this, findViewById);
        jjc.f(this, findViewById2);
        jjc.f(this, findViewById3);
        jjc.f(this, findViewById4);
        if (findViewById5 != null) {
            jjc.f(this, findViewById5);
        }
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new lcw(this));
        }
        this.itemView.findViewById(R.id.create_post_root_layout).setBackground(null);
    }

    @Override // xsna.jgc0
    public final void M2(String str) {
        this.p.setContentDescription(str);
    }

    @Override // xsna.jgc0
    public final void Z5(boolean z) {
        View view = this.t;
        if (view != null) {
            bwt0.p0(view, z);
        }
        if (view == null || !bwt0.K(view)) {
            return;
        }
        q8(false);
    }

    @Override // xsna.vif0
    public final void i6(s3q0 s3q0Var) {
        h7v.f(pla.e().b(), this.o, HintId.INFO_FRIENDS_BEST_FRIENDS_AUTHOR.getId(), null, 12);
    }

    @Override // xsna.jgc0
    public final void oj(boolean z) {
        bwt0.p0(this.p, z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            view.getId();
        }
    }

    @Override // xsna.jgc0
    public final void p8(boolean z) {
        bwt0.p0(this.s, z);
    }

    @Override // xsna.jgc0
    public final void q8(boolean z) {
        bwt0.p0(this.r, z);
    }

    @Override // xsna.jgc0
    public final void v5(boolean z) {
        bwt0.p0(this.q, z);
    }
}

package xsna;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.h7u0;

/* compiled from: PostponedFooterHolder.kt */
/* loaded from: classes4.dex */
public final class brc0 extends qi6<Post> implements View.OnClickListener, w8i {
    public final VkGroupItem C;
    public final VkGroupItem D;
    public Post E;
    public final Object F;

    public brc0(ViewGroup viewGroup) {
        super(R.layout.postpone_post_footer, viewGroup);
        VkGroupItem vkGroupItem = (VkGroupItem) this.itemView.findViewById(R.id.btn_edit);
        this.C = vkGroupItem;
        VkGroupItem vkGroupItem2 = (VkGroupItem) this.itemView.findViewById(R.id.btn_delete_post);
        this.D = vkGroupItem2;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new yu60(this, 13));
        vkGroupItem.setOnClickListener(this);
        vkGroupItem.setText(R.string.post_footer_edit);
        SpannableStringBuilder c = cqm0.c(e3m.f(R.attr.vk_ui_text_negative, this.itemView.getContext()), v6(R.string.post_footer_button_delete));
        vkGroupItem2.setOnClickListener(this);
        vkGroupItem2.setText(c);
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        this.E = post;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post q6;
        Post post;
        if (jjc.b()) {
            return;
        }
        if (epx.f(view, this.C)) {
            Activity w = bwt0.w(this.itemView);
            if (w == null || (post = this.E) == null) {
                return;
            }
            ((c1c0) this.F.getValue()).c(-1, w, post, fkq0.d(post.m) ? PostingCreationEntryPoint.ProfilePostponedPosts : PostingCreationEntryPoint.GroupPostponedPosts);
            return;
        }
        if (!epx.f(view, this.D) || (q6 = q6()) == null) {
            return;
        }
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(this.itemView.getContext());
        c.g0(R.string.confirm);
        c.U(R.string.delete_confirm);
        c.c0(R.string.yes, new arc0(this, q6, 0));
        c.W(R.string.no, null);
        c.m();
    }
}

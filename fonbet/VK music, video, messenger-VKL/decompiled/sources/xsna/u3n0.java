package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: SuggestedPostButtonsHolder.kt */
/* loaded from: classes4.dex */
public final class u3n0 extends qi6<Post> implements View.OnClickListener {
    public final c1c0 C;
    public final View D;
    public final View E;
    public final VkGroupItem F;
    public final VkGroupItem G;
    public Post H;

    public u3n0(ViewGroup viewGroup, c1c0 c1c0Var) {
        super(R.layout.card_buttons, viewGroup);
        this.C = c1c0Var;
        View findViewById = this.itemView.findViewById(R.id.post_divider);
        this.D = findViewById;
        this.E = this.itemView.findViewById(R.id.bottom_divider);
        VkGroupItem vkGroupItem = (VkGroupItem) this.itemView.findViewById(R.id.friend_req_btn_add);
        this.F = vkGroupItem;
        VkGroupItem vkGroupItem2 = (VkGroupItem) this.itemView.findViewById(R.id.friend_req_btn_decline);
        this.G = vkGroupItem2;
        vkGroupItem.setOnClickListener(this);
        vkGroupItem.setText(R.string.publish_suggested);
        SpannableStringBuilder c = cqm0.c(e3m.f(R.attr.vk_ui_text_negative, this.itemView.getContext()), v6(R.string.post_footer_button_decline));
        vkGroupItem2.setOnClickListener(this);
        vkGroupItem2.setText(c);
        bwt0.p0(findViewById, false);
        f4m.y(0, this.itemView);
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        this.H = post;
        SpannableStringBuilder c = cqm0.c(e3m.f(R.attr.vk_ui_text_negative, this.itemView.getContext()), v6(R.string.post_footer_button_delete));
        this.F.setText(R.string.post_footer_edit);
        this.G.setText(c);
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        bwt0.p0(this.E, epx.f(u1c0Var.g, Boolean.TRUE));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final Post q6;
        Post post;
        if (epx.f(view, this.F)) {
            Activity w = bwt0.w(this.itemView);
            if (w == null || (post = this.H) == null) {
                return;
            }
            this.C.c(-1, w, post, PostingCreationEntryPoint.Other);
            return;
        }
        if (!epx.f(view, this.G) || (q6 = q6()) == null) {
            return;
        }
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(this.itemView.getContext());
        c.g0(R.string.confirm);
        c.U(R.string.delete_confirm);
        c.c0(R.string.yes, new DialogInterface.OnClickListener() { // from class: xsna.t3n0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                u3n0 u3n0Var = u3n0.this;
                u3n0Var.C.v(u3n0Var.itemView.getContext(), q6);
            }
        });
        c.W(R.string.no, null);
        c.m();
    }
}

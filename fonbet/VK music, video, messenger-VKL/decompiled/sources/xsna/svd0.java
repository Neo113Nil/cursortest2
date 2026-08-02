package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;

/* compiled from: ProfileDeletedTextHolder.kt */
/* loaded from: classes4.dex */
public final class svd0 extends qi6<Post> {
    public final VkLinkedText C;

    public svd0(ViewGroup viewGroup) {
        super(R.layout.news_item_text, viewGroup);
        VkLinkedText vkLinkedText = (VkLinkedText) this.itemView.findViewById(R.id.post_view);
        this.C = vkLinkedText;
        vkLinkedText.setCanShowMessageOptions(true);
        vkLinkedText.setTextIsSelectable(false);
        jno0.c(vkLinkedText, R.attr.vk_ui_text_secondary);
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        Post post2 = post;
        Owner owner = post2.o;
        this.C.setText(post2.s.length() > 0 ? owner.l() ? R.string.page_deleted_f : R.string.page_deleted_m : owner.l() ? R.string.page_deleted_silent_f : R.string.page_deleted_silent_m);
    }
}

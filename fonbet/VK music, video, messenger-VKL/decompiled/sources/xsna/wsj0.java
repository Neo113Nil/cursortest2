package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: SimpleTextHolder.kt */
/* loaded from: classes4.dex */
public final class wsj0 extends qi6<NewsEntry> {
    public final VkLinkedText C;
    public CharSequence D;

    public wsj0(ViewGroup viewGroup) {
        super(R.layout.news_item_text, viewGroup);
        VkLinkedText vkLinkedText = (VkLinkedText) this.itemView.findViewById(R.id.post_view);
        this.C = vkLinkedText;
        vkLinkedText.setCanShowMessageOptions(true);
        vkLinkedText.setTextIsSelectable(true);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        ucp ucpVar = ucp.a;
        CharSequence i = ucp.i(hd60.a().h(this.D));
        VkLinkedText vkLinkedText = this.C;
        if (TextUtils.equals(i, vkLinkedText.getText())) {
            return;
        }
        vkLinkedText.setText(i);
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof kqm0) {
            this.D = ((kqm0) u1c0Var).q;
        }
        super.a6(u1c0Var);
    }
}

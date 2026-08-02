package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.newsfeed.impl.posting.avatar.PostingAvatarViewContainer;
import com.vk.sharing.api.dto.Target;
import com.vkontakte.android.R;

/* compiled from: PostingAuthorsAdapter.kt */
/* loaded from: classes4.dex */
public final class ddc0 extends vif0<Target> {
    public final PostingAvatarViewContainer n;
    public final TextView o;
    public final ImageView p;

    public ddc0(LinearLayout linearLayout, yxu yxuVar) {
        super(LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.post_author_item, (ViewGroup) linearLayout, false));
        this.n = (PostingAvatarViewContainer) this.itemView.findViewById(R.id.author_avatar_image);
        this.o = (TextView) this.itemView.findViewById(R.id.item_text);
        this.p = (ImageView) this.itemView.findViewById(R.id.item_icon);
        bwt0.i0(this.itemView, new g6(25, yxuVar, this));
    }

    @Override // xsna.vif0
    public final void i6(Target target) {
        Target target2 = target;
        PostingAvatarViewContainer postingAvatarViewContainer = this.n;
        postingAvatarViewContainer.q(target2, dhr0.w(R.drawable.user_placeholder, postingAvatarViewContainer.getContext()));
        bwt0.p0(this.p, target2.g);
        this.o.setText(target2.l ? target2.d : this.itemView.getContext().getString(R.string.posting_source_my_page));
    }
}

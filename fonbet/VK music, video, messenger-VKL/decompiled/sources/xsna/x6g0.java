package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.picture.VkImage;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;

/* compiled from: RepostHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class x6g0 extends ih {
    public final View J;
    public final VkImage K;
    public final View L;

    public x6g0(ViewGroup viewGroup, NewsfeedRouter newsfeedRouter) {
        super(viewGroup, newsfeedRouter);
        this.J = this.itemView.findViewById(R.id.icon2);
        this.K = (VkImage) this.itemView.findViewById(R.id.status);
        this.L = this.itemView.findViewById(R.id.icon);
        jno0.c(this.G, R.attr.newsfeed_post_title_color);
    }
}

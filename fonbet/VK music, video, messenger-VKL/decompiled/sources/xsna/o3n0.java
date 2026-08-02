package xsna;

import android.view.ViewGroup;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;

/* compiled from: SuggestedPostButtonsHolder.kt */
/* loaded from: classes4.dex */
public final class o3n0 extends qi6<Post> {
    public final NewsfeedRouter C;

    public o3n0(ViewGroup viewGroup, NewsfeedRouter newsfeedRouter) {
        super(R.layout.suggested_single_button, viewGroup);
        this.C = newsfeedRouter;
        jjc.g(this.itemView, new zyl0(this, 6));
    }

    @Override // xsna.qi6
    public final /* bridge */ /* synthetic */ void E6(Post post) {
    }
}

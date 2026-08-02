package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.camera.editor.stories.impl.share.content.StoryShareContentType;
import com.vk.camera.editor.stories.impl.share.holders.ShareStoryDataRecyclerView;
import com.vkontakte.android.R;

/* compiled from: LongTapView.kt */
/* loaded from: classes16.dex */
public final class b600 extends ConstraintLayout {
    public final ShareStoryDataRecyclerView t;
    public com.vk.lists.c u;
    public int v;

    public b600(Context context) {
        super(context, null, 0);
        this.v = Integer.MAX_VALUE;
        LayoutInflater.from(context).inflate(R.layout.layout_story_long_tap, this);
        ShareStoryDataRecyclerView shareStoryDataRecyclerView = (ShareStoryDataRecyclerView) findViewById(R.id.pagination_story_recycler);
        shareStoryDataRecyclerView.setType(StoryShareContentType.LONG_TAP);
        shareStoryDataRecyclerView.getRecyclerView().setClipToPadding(false);
        f4m.x(iah0.a(12), shareStoryDataRecyclerView.getRecyclerView());
        this.t = shareStoryDataRecyclerView;
    }

    public final void setAdapter(odm0 odm0Var) {
        this.t.setAdapter(odm0Var);
    }
}

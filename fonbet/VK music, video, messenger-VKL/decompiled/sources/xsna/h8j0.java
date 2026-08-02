package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.camera.editor.stories.impl.share.content.StoryShareContentType;
import com.vk.camera.editor.stories.impl.share.holders.ShareStoryDataRecyclerView;
import com.vk.lists.c;
import com.vkontakte.android.R;

/* compiled from: ShareStoryDataHolder.kt */
/* loaded from: classes6.dex */
public final class h8j0 extends ConstraintLayout {
    public final int t;
    public final ShareStoryDataRecyclerView u;
    public final TextView v;
    public final odm0 w;
    public final com.vk.lists.c x;

    public h8j0(Context context, n8 n8Var, c.h hVar, int i) {
        super(context);
        this.t = i;
        odm0 odm0Var = new odm0(n8Var, StoryShareContentType.BOTTOM_SHEET);
        this.w = odm0Var;
        LayoutInflater.from(context).inflate(R.layout.layout_story_share_data, this);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ShareStoryDataRecyclerView shareStoryDataRecyclerView = (ShareStoryDataRecyclerView) findViewById(R.id.pagination_story_items_recycler);
        this.u = shareStoryDataRecyclerView;
        shareStoryDataRecyclerView.setAdapter(odm0Var);
        RecyclerView recyclerView = shareStoryDataRecyclerView.getRecyclerView();
        recyclerView.setClipToPadding(false);
        f4m.x(iah0.a(8), recyclerView);
        TextView textView = (TextView) findViewById(R.id.title);
        this.v = textView;
        textView.setAllCaps(true);
        hVar.m = false;
        hVar.l = false;
        this.x = com.vk.lists.f.a(hVar, shareStoryDataRecyclerView);
    }
}

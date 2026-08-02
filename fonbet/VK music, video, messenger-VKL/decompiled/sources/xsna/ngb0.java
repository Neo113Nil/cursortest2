package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: PodcastCategoryItemVh.kt */
/* loaded from: classes16.dex */
public final class ngb0 extends RecyclerView.e0 {
    public final wzs<View, UIBlockLink, View.OnClickListener> l;
    public final VKImageView m;
    public final TextView n;

    public ngb0(View view, z5 z5Var) {
        super(view);
        this.l = z5Var;
        this.m = (VKImageView) view.findViewById(R.id.item_podcast_category_image);
        this.n = (TextView) view.findViewById(R.id.item_podcast_category_title);
    }
}

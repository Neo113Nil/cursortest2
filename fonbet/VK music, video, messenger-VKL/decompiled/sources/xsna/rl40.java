package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: MusicKidsAgeCategoryItemVh.kt */
/* loaded from: classes16.dex */
public final class rl40 extends RecyclerView.e0 {
    public final wzs<View, UIBlockLink, View.OnClickListener> l;
    public final VKImageView m;
    public final TextView n;

    public rl40(View view, w1 w1Var) {
        super(view);
        this.l = w1Var;
        this.m = (VKImageView) view.findViewById(R.id.image);
        this.n = (TextView) view.findViewById(R.id.title);
    }
}

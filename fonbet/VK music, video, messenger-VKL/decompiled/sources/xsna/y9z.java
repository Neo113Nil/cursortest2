package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: LinkMyShelfItemVh.kt */
/* loaded from: classes16.dex */
public final class y9z extends RecyclerView.e0 {
    public final wzs<View, UIBlockLink, View.OnClickListener> l;
    public final TextView m;
    public final TextView n;
    public final VKImageView o;

    public y9z(View view, rei reiVar) {
        super(view);
        this.l = reiVar;
        this.m = (TextView) view.findViewById(R.id.tv_title);
        this.n = (TextView) view.findViewById(R.id.tv_subtitle);
        this.o = (VKImageView) view.findViewById(R.id.audio_image);
    }
}

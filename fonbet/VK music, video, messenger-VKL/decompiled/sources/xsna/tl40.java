package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: MusicKidsCatalogItemVh.kt */
/* loaded from: classes16.dex */
public final class tl40 extends RecyclerView.e0 {
    public final View l;
    public final e1a m;
    public final wzs<View, UIBlockLink, View.OnClickListener> n;
    public final CardView o;
    public final ConstraintLayout p;
    public final TextView q;
    public final VkContentBadge r;
    public final VKImageView s;

    public tl40(View view, e1a e1aVar, qw6 qw6Var) {
        super(view);
        this.l = view;
        this.m = e1aVar;
        this.n = qw6Var;
        this.o = (CardView) view.findViewById(R.id.root_container);
        this.p = (ConstraintLayout) view.findViewById(R.id.container);
        this.q = (TextView) view.findViewById(R.id.kids_catalog_title);
        this.r = (VkContentBadge) view.findViewById(R.id.kids_catalog_header);
        this.s = (VKImageView) view.findViewById(R.id.kids_catalog_image);
    }
}

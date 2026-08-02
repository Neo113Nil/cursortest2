package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: PodcastCategoryAdapter.kt */
/* loaded from: classes16.dex */
public final class mgb0 extends zoj0<UIBlock, ngb0> {
    public final z5 e;

    public mgb0(z5 z5Var) {
        this.e = z5Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ngb0 ngb0Var = (ngb0) e0Var;
        UIBlockLink uIBlockLink = (UIBlockLink) ((ArrayList) y0()).get(i);
        View view = ngb0Var.itemView;
        view.setOnClickListener(ngb0Var.l.invoke(view, uIBlockLink));
        ngb0Var.n.setText(uIBlockLink.y.c);
        bwt0.S(ngb0Var.m, new m9(26, uIBlockLink, ngb0Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ngb0(bwt0.I(R.layout.item_podcast_category, viewGroup, false), this.e);
    }
}

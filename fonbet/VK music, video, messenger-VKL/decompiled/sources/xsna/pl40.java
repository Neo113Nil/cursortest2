package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: MusicKidsAgeCategoryAdapter.kt */
/* loaded from: classes16.dex */
public final class pl40 extends zoj0<UIBlock, rl40> {
    public final w1 e;

    public pl40(w1 w1Var) {
        this.e = w1Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        rl40 rl40Var = (rl40) e0Var;
        UIBlockLink uIBlockLink = (UIBlockLink) ((ArrayList) y0()).get(i);
        View view = rl40Var.itemView;
        view.setOnClickListener(rl40Var.l.invoke(view, uIBlockLink));
        TextView textView = rl40Var.n;
        CatalogLink catalogLink = uIBlockLink.y;
        textView.setText(catalogLink.c);
        VKImageView vKImageView = rl40Var.m;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!vKImageView.isLaidOut()) {
            vKImageView.addOnLayoutChangeListener(new ql40(uIBlockLink, rl40Var));
        } else {
            ImageSize Cb = catalogLink.f.Cb(vKImageView.getWidth(), true, false);
            vKImageView.s0(Cb != null ? Cb.d.d : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new rl40(bwt0.I(R.layout.music_kids_age_category_item, viewGroup, false), this.e);
    }
}

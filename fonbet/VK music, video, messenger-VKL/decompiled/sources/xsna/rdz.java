package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: LinksMyShelfAdapter.kt */
/* loaded from: classes16.dex */
public final class rdz extends zoj0<UIBlock, y9z> {
    public final rei e;

    public rdz(rei reiVar) {
        this.e = reiVar;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        y9z y9zVar = (y9z) e0Var;
        UIBlockLink uIBlockLink = (UIBlockLink) ((ArrayList) y0()).get(i);
        View view = y9zVar.itemView;
        view.setOnClickListener(y9zVar.l.invoke(view, uIBlockLink));
        TextView textView = y9zVar.m;
        CatalogLink catalogLink = uIBlockLink.y;
        textView.setText(catalogLink.c);
        y9zVar.n.setText(catalogLink.d);
        Image image = catalogLink.f;
        VKImageView vKImageView = y9zVar.o;
        ImageSize Cb = image.Cb(vKImageView.getLayoutParams().width, true, false);
        vKImageView.load(Cb != null ? Cb.d.d : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new y9z(bwt0.I(R.layout.music_my_shelf_element, viewGroup, false), this.e);
    }
}

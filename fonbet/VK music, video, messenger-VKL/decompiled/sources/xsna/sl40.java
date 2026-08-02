package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.catalog.dto.CatalogBackgroundDto;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: MusicKidsCatalogAdapter.kt */
/* loaded from: classes16.dex */
public final class sl40 extends zoj0<UIBlock, tl40> {
    public final e1a e;
    public final qw6 f;

    public sl40(e1a e1aVar, qw6 qw6Var) {
        this.e = e1aVar;
        this.f = qw6Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        tl40 tl40Var = (tl40) e0Var;
        UIBlockLink uIBlockLink = (UIBlockLink) ((ArrayList) y0()).get(i);
        TextView textView = tl40Var.q;
        CatalogLink catalogLink = uIBlockLink.y;
        ey2.i(textView, catalogLink.c);
        VkContentBadge vkContentBadge = tl40Var.r;
        CatalogBadge catalogBadge = catalogLink.h;
        String str = catalogBadge != null ? catalogBadge.b : null;
        bwt0.p0(vkContentBadge, !(str == null || drm0.N(str)));
        vkContentBadge.setText(catalogBadge != null ? catalogBadge.b : null);
        vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new x7g(R.attr.vk_ui_text_primary_invariably), new x7g(R.attr.vk_ui_background_contrast), null, 12));
        CardView cardView = tl40Var.o;
        cardView.setOnClickListener(tl40Var.n.invoke(cardView, uIBlockLink));
        VKImageView vKImageView = tl40Var.s;
        Image image = catalogLink.f;
        ImageSize Cb = image != null ? image.Cb(bwt0.y(R.dimen.catalog_kids_catalog_container_height, vKImageView), true, false) : null;
        vKImageView.load(Cb != null ? Cb.d.d : null);
        CatalogBackgroundDto catalogBackgroundDto = catalogLink.l;
        ConstraintLayout constraintLayout = tl40Var.p;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        if (catalogBackgroundDto == null) {
            constraintLayout.setBackground(colorDrawable);
        } else {
            tl40Var.m.getClass();
            constraintLayout.setBackground(e1a.a(catalogBackgroundDto, colorDrawable));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new tl40(bwt0.I(R.layout.catalog_music_kids_catalog_grid_item, viewGroup, false), this.e, this.f);
    }
}

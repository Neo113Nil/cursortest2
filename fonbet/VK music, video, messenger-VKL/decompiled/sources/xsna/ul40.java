package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.link.CatalogLinkImageStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.MusicKidsCoverStackedView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.vl40;

/* compiled from: MusicKidsCollectionAdapter.kt */
/* loaded from: classes16.dex */
public final class ul40 extends zoj0<UIBlock, vl40> {
    public final cv4 e;

    public ul40(e1a e1aVar, cv4 cv4Var) {
        this.e = cv4Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vl40 vl40Var = (vl40) e0Var;
        UIBlockLink uIBlockLink = (UIBlockLink) ((ArrayList) y0()).get(i);
        TextView textView = vl40Var.o;
        CatalogLink catalogLink = uIBlockLink.y;
        ey2.i(textView, catalogLink.c);
        ey2.i(vl40Var.p, catalogLink.d);
        CardView cardView = vl40Var.n;
        cardView.setOnClickListener(vl40Var.m.invoke(cardView, uIBlockLink));
        VKImageView vKImageView = vl40Var.r;
        MusicKidsCoverStackedView musicKidsCoverStackedView = vl40Var.q;
        CatalogLinkImageStyle catalogLinkImageStyle = catalogLink.j;
        Image image = catalogLink.f;
        int i2 = vl40.a.$EnumSwitchMapping$0[catalogLinkImageStyle.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                musicKidsCoverStackedView.setVisibility(0);
                f4m.j(vKImageView);
                musicKidsCoverStackedView.setImage(image);
                return;
            } else {
                f4m.j(musicKidsCoverStackedView);
                vKImageView.setDontLoadAgainIfSameResource(true);
                vKImageView.setVisibility(0);
                ImageSize Cb = image != null ? image.Cb(vKImageView.getLayoutParams().width, true, false) : null;
                vKImageView.s0(Cb != null ? Cb.d.d : null);
                return;
            }
        }
        musicKidsCoverStackedView.setVisibility(0);
        f4m.j(vKImageView);
        ArrayList Fb = image.Fb();
        ArrayList arrayList = new ArrayList();
        Iterator it = Fb.iterator();
        while (it.hasNext()) {
            arrayList.add(new Image((List<ImageSize>) Collections.singletonList((ImageSize) it.next())));
        }
        if (arrayList.isEmpty()) {
            f4m.j(musicKidsCoverStackedView);
        } else {
            musicKidsCoverStackedView.setVisibility(0);
        }
        if (arrayList.size() <= 1) {
            if (arrayList.size() == 1) {
                musicKidsCoverStackedView.setImage((Image) j5g.Y(arrayList));
                return;
            }
            return;
        }
        Image image2 = (Image) j5g.Y(arrayList);
        Image image3 = (Image) j5g.i0(arrayList);
        Thumb thumb = new Thumb(image2);
        Thumb thumb2 = image3 != null ? new Thumb(image3) : null;
        ThumbsImageView thumbsImageView = musicKidsCoverStackedView.u;
        if (thumb2 != null) {
            thumbsImageView.setVisibility(0);
            musicKidsCoverStackedView.post(new wl40(musicKidsCoverStackedView, thumb2, thumb, 0));
        } else {
            f4m.j(thumbsImageView);
            musicKidsCoverStackedView.t.setThumb(thumb);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new vl40(bwt0.I(R.layout.catalog_music_kids_collection_grid_item, viewGroup, false), this.e);
    }
}

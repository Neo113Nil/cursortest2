package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: MusicCategoryAdapter.kt */
/* loaded from: classes16.dex */
public final class de40 extends zoj0<UIBlock, fe40> {
    public final b5a e;
    public final SearchStatInfoProvider f;
    public final lga g;
    public final s77 h = new s77(this, 7);

    public de40(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, lga lgaVar) {
        this.e = b5aVar;
        this.f = searchStatInfoProvider;
        this.g = lgaVar;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        CatalogLink catalogLink;
        Meta meta;
        Object obj = ((ArrayList) y0()).get(i);
        ContentType contentType = null;
        UIBlockLink uIBlockLink = obj instanceof UIBlockLink ? (UIBlockLink) obj : null;
        if (uIBlockLink != null && (catalogLink = uIBlockLink.y) != null && (meta = catalogLink.g) != null) {
            contentType = meta.c;
        }
        if (contentType == ContentType.AUDIO_OFFLINE) {
            return 5757;
        }
        return super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((fe40) e0Var).V5((UIBlockLink) ((ArrayList) y0()).get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 5757 ? new we40(bwt0.I(R.layout.catalog_music_category_offline_grid_item, viewGroup, false), new x76(this, 9)) : new ge40(bwt0.I(R.layout.catalog_music_category_grid_item, viewGroup, false), new no3(this, 6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        fe40 fe40Var = (fe40) e0Var;
        fe40Var.c();
        super.onViewDetachedFromWindow(fe40Var);
    }
}

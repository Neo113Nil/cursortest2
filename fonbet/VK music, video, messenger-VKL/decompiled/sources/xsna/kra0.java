package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;

/* compiled from: PlacePickerSearchHolder.kt */
/* loaded from: classes4.dex */
public final class kra0 extends RecyclerView.e0 {
    public final tqa0 l;
    public final VkSearchView m;
    public io.reactivex.rxjava3.disposables.c n;

    public kra0(ViewGroup viewGroup, com.vk.newsfeed.posting.geo_picker.presentation.e eVar) {
        super(tf3.b(viewGroup, R.layout.geo_picker_item_geo_search, viewGroup, false));
        this.l = eVar;
        VkSearchView vkSearchView = (VkSearchView) this.itemView.findViewById(R.id.search_view);
        orl.a(vkSearchView);
        this.m = vkSearchView;
        vkSearchView.X4(false);
        vkSearchView.setOnActionSearchQueryClick(new kn9(this, 11));
        this.itemView.addOnAttachStateChangeListener(new jra0(this));
    }
}

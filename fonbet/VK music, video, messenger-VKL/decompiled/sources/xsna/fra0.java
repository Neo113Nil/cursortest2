package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;

/* compiled from: PlacePickerPlaceHolder.kt */
/* loaded from: classes4.dex */
public final class fra0 extends RecyclerView.e0 {
    public final tqa0 l;
    public final VkCell m;
    public gra0 n;

    public fra0(ViewGroup viewGroup, com.vk.newsfeed.posting.geo_picker.presentation.e eVar) {
        super(tf3.b(viewGroup, R.layout.geo_picker_item_geo_place, viewGroup, false));
        this.l = eVar;
        View view = this.itemView;
        this.m = (VkCell) view;
        jjc.g(view, new qz40(this, 10));
    }
}

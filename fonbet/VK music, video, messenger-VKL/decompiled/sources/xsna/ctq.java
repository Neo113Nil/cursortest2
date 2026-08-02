package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerItem;

/* compiled from: FavoritesAdapter.kt */
/* loaded from: classes15.dex */
public final class ctq extends androidx.recyclerview.widget.x<StickerItem, q4l0> {
    public final uei0 c;

    public ctq(uei0 uei0Var) {
        super(new w4l0());
        this.c = uei0Var;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return getItem(i).b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((q4l0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new q4l0(viewGroup.getContext(), this.c, null, null);
    }
}

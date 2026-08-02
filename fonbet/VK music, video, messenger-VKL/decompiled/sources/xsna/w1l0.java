package xsna;

import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerStockItem;
import com.vkontakte.android.R;

/* compiled from: StickerAdapter.kt */
/* loaded from: classes15.dex */
public final class w1l0 extends RecyclerView.Adapter<RecyclerView.e0> {
    public final uei0 c;
    public final i7l0 d;
    public final StickerStockItem e;

    public w1l0(uei0 uei0Var, i7l0 i7l0Var, StickerStockItem stickerStockItem) {
        this.c = uei0Var;
        this.d = i7l0Var;
        this.e = stickerStockItem;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.Eb().size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (i == 0) {
            return 0L;
        }
        return ((Number) this.e.Eb().get(i - 1)).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == 0 ? 100 : 101;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        boolean z = e0Var instanceof q4l0;
        boolean z2 = true;
        StickerStockItem stickerStockItem = this.e;
        if (z) {
            ((q4l0) e0Var).V5(stickerStockItem.g.get(i - 1));
            return;
        }
        if (e0Var instanceof k5l0) {
            k5l0 k5l0Var = (k5l0) e0Var;
            ViewGroup viewGroup = k5l0Var.l;
            ImageButton imageButton = k5l0Var.p;
            TextView textView = k5l0Var.o;
            boolean z3 = stickerStockItem.Q;
            textView.setText(z3 ? viewGroup.getContext().getString(R.string.story_vmoji_stickers_header) : stickerStockItem.d);
            if (!z3 && stickerStockItem.Ib()) {
                z2 = false;
            }
            bwt0.p0(imageButton, z2);
            imageButton.setContentDescription(viewGroup.getContext().getString(z3 ? R.string.story_accessebility_vmoji_stickers_header_settings : R.string.story_accessebility_stickers_header_select_style));
            bwt0.i0(imageButton, new ju(26, stickerStockItem, k5l0Var));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        uei0 uei0Var = this.c;
        if (i == 100) {
            return new k5l0(viewGroup, uei0Var, this.d);
        }
        if (i == 101) {
            return new q4l0(viewGroup.getContext(), uei0Var, null, null);
        }
        throw new IllegalStateException(lhg.a(i, "Can't create holder for viewType: "));
    }
}

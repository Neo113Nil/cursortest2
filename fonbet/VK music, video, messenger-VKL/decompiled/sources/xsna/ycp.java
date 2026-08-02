package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: EmojiAutofitRecyclerView.java */
/* loaded from: classes15.dex */
public final class ycp extends RecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimension = (int) getResources().getDimension(R.dimen.picker_emoji_size);
        if (dimension <= 0 || getLayoutManager() == null || !(getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        ((GridLayoutManager) getLayoutManager()).setSpanCount(Math.max(1, getMeasuredWidth() / dimension));
    }
}

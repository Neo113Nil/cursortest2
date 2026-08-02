package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AlbumDetailsEmptyViewDecoration.kt */
/* loaded from: classes4.dex */
public final class hf1 extends RecyclerView.n {
    public final int b;

    public hf1(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (!(recyclerView.getChildViewHolder(view) instanceof yhp)) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            return;
        }
        View childAt = recyclerView.getChildAt(((yhp) r0).getAbsoluteAdapterPosition() - 1);
        RecyclerView.e0 childViewHolder = childAt != null ? recyclerView.getChildViewHolder(childAt) : null;
        if (childAt != null) {
            if (!(childViewHolder instanceof ywu) && !(childViewHolder instanceof af1)) {
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            int i = 0;
            for (int childAdapterPosition = recyclerView.getChildAdapterPosition(view) - 1; -1 < childAdapterPosition; childAdapterPosition--) {
                RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(childAdapterPosition);
                View view2 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView : null;
                i += view2 != null ? view2.getHeight() : 0;
            }
            int i2 = this.b - i;
            if (view.getMeasuredHeight() == 0) {
                if (view.getLayoutParams() == null) {
                    u11.h(-1, -2, view);
                }
                view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0), recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view.getLayoutParams().height));
            }
            int measuredHeight = (i2 - view.getMeasuredHeight()) / 2;
            int b = cn70.b(0);
            if (measuredHeight < b) {
                measuredHeight = b;
            }
            rect.top = measuredHeight;
            rect.bottom = measuredHeight;
            view.animate().alpha(1.0f).setStartDelay(0L).start();
        }
    }
}

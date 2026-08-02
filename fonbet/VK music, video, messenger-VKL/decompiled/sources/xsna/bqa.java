package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CenteredEmptyViewDecoration.kt */
/* loaded from: classes4.dex */
public final class bqa extends RecyclerView.n {
    public int b;
    public float c;

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (!(recyclerView.getChildViewHolder(view) instanceof zhp)) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            return;
        }
        if (view.getMeasuredHeight() == 0) {
            if (view.getLayoutParams() == null) {
                u11.h(-1, -2, view);
            }
            view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0), recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view.getLayoutParams().height));
        }
        int i = 0;
        for (int childAdapterPosition = recyclerView.getChildAdapterPosition(view) - 1; -1 < childAdapterPosition; childAdapterPosition--) {
            RecyclerView.e0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(childAdapterPosition);
            View view2 = findViewHolderForLayoutPosition != null ? findViewHolderForLayoutPosition.itemView : null;
            i += view2 != null ? view2.getHeight() : 0;
        }
        float measuredHeight = ((((recyclerView.getMeasuredHeight() * this.c) - this.b) - i) - view.getMeasuredHeight()) / 2;
        if (measuredHeight < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            measuredHeight = 0.0f;
        }
        rect.top = (int) measuredHeight;
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes5.dex */
public final class cde extends RecyclerView.d {
    public final tls a;
    public bde b;

    public cde(RecyclerView recyclerView, tls tlsVar) {
        this.a = tlsVar;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new ade(this));
        }
        recyclerView.addOnLayoutChangeListener(new u90(18, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a7  */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int childAdapterPosition;
        View view;
        int childAdapterPosition2;
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) == -1) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        tls tlsVar = this.a;
        View view2 = null;
        if (adapter != null) {
            while (true) {
                if (((Boolean) tlsVar.invoke(Integer.valueOf(childAdapterPosition))).booleanValue()) {
                    break;
                }
                childAdapterPosition--;
                if (childAdapterPosition < 0) {
                    childAdapterPosition = -1;
                    break;
                }
            }
            if (childAdapterPosition != -1) {
                int itemViewType = adapter.getItemViewType(childAdapterPosition);
                bde bdeVar = this.b;
                if (bdeVar != null && bdeVar.a == childAdapterPosition) {
                    x0 x0Var = bdeVar.b;
                    if (x0Var.y == itemViewType) {
                        view = x0Var.a;
                        if (view == null) {
                            return;
                        }
                        int paddingTop = recyclerView.getPaddingTop() + view.getBottom();
                        int childCount = recyclerView.getChildCount();
                        int i = 0;
                        while (true) {
                            if (i >= childCount) {
                                break;
                            }
                            View childAt2 = recyclerView.getChildAt(i);
                            Rect rect = new Rect();
                            recyclerView.getDecoratedBoundsWithMargins(childAt2, rect);
                            if (rect.bottom > paddingTop && rect.top <= paddingTop) {
                                view2 = childAt2;
                                break;
                            }
                            i++;
                        }
                        if (view2 == null || (childAdapterPosition2 = recyclerView.getChildAdapterPosition(view2)) == -1) {
                            return;
                        }
                        if (!((Boolean) tlsVar.invoke(Integer.valueOf(childAdapterPosition2))).booleanValue()) {
                            canvas.save();
                            canvas.translate(0.0f, recyclerView.getPaddingTop());
                            view.draw(canvas);
                            canvas.restore();
                            return;
                        }
                        int paddingTop2 = recyclerView.getPaddingTop();
                        canvas.save();
                        canvas.clipRect(0, paddingTop2, canvas.getWidth(), view.getHeight() + paddingTop2);
                        canvas.translate(0.0f, view2.getTop() - view.getHeight());
                        view.draw(canvas);
                        canvas.restore();
                        return;
                    }
                }
                x0 createViewHolder = adapter.createViewHolder(recyclerView, itemViewType);
                adapter.onBindViewHolder(createViewHolder, childAdapterPosition);
                View view3 = createViewHolder.a;
                view3.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view3.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view3.getLayoutParams().height));
                view3.layout(0, 0, view3.getMeasuredWidth(), view3.getMeasuredHeight());
                this.b = new bde(createViewHolder, childAdapterPosition);
                view = createViewHolder.a;
                if (view == null) {
                }
            }
        }
        view = null;
        if (view == null) {
        }
    }
}

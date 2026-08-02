package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: ShowcaseUtils.kt */
/* loaded from: classes6.dex */
public final class bkj0 {
    public static void a(RecyclerView recyclerView, bh5 bh5Var, List list, int i, RecyclerView recyclerView2, int i2) {
        float f;
        int height;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i3));
            if (findContainingViewHolder != null) {
                if (findContainingViewHolder instanceof ncn0) {
                    RecyclerView recyclerView3 = ((ncn0) findContainingViewHolder).s;
                    a(recyclerView3, bh5Var, list, i, recyclerView, findContainingViewHolder.itemView.getTop() - recyclerView3.getTop());
                } else if (findContainingViewHolder instanceof zdn0) {
                    RecyclerView recyclerView4 = ((zdn0) findContainingViewHolder).u;
                    a(recyclerView4, bh5Var, list, i, recyclerView, findContainingViewHolder.itemView.getTop() - recyclerView4.getTop());
                } else {
                    ucn0 ucn0Var = findContainingViewHolder instanceof ucn0 ? (ucn0) findContainingViewHolder : null;
                    z8n0 z8n0Var = ucn0Var != null ? (z8n0) ucn0Var.o : null;
                    if (z8n0Var != null && list.contains(z8n0Var)) {
                        View view = findContainingViewHolder.itemView;
                        int i4 = 100;
                        if (i2 == 0) {
                            if (recyclerView2.getHeight() > 0 && view.getHeight() > 0) {
                                if (view.getTop() <= 0 || view.getBottom() <= 0 || view.getBottom() >= recyclerView2.getHeight() - i) {
                                    int min = Math.min(recyclerView2.getHeight(), view.getBottom()) - Math.max(0, view.getTop());
                                    if (min < 0) {
                                        min = 0;
                                    }
                                    f = min * 100;
                                    height = view.getHeight();
                                    i4 = (int) (f / height);
                                }
                                bh5Var.invoke(z8n0Var, Integer.valueOf(i4));
                            }
                            i4 = 0;
                            bh5Var.invoke(z8n0Var, Integer.valueOf(i4));
                        } else {
                            if (recyclerView2.getHeight() > 0 && view.getHeight() > 0) {
                                int top = view.getTop() + i2;
                                int bottom = view.getBottom() + i2;
                                if (top <= 0 || bottom <= 0 || bottom >= recyclerView2.getHeight() - i) {
                                    int min2 = Math.min(recyclerView2.getHeight() - i, view.getBottom() + i2) - Math.max(0, view.getTop() + i2);
                                    if (min2 < 0) {
                                        min2 = 0;
                                    }
                                    f = min2 * 100;
                                    height = view.getHeight();
                                    i4 = (int) (f / height);
                                }
                                bh5Var.invoke(z8n0Var, Integer.valueOf(i4));
                            }
                            i4 = 0;
                            bh5Var.invoke(z8n0Var, Integer.valueOf(i4));
                        }
                    }
                }
            }
        }
    }
}

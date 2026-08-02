package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerViewUtils.java */
/* loaded from: classes7.dex */
public final class hkf0 {
    @Nullable
    public static View a(@NonNull RecyclerView recyclerView, float f, float f2) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return null;
        }
        for (int childCount = layoutManager.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = layoutManager.getChildAt(childCount);
            if (childAt != null) {
                float translationX = childAt.getTranslationX();
                float translationY = childAt.getTranslationY();
                if (f >= layoutManager.getDecoratedLeft(childAt) + translationX && f <= layoutManager.getDecoratedRight(childAt) + translationX && f2 >= layoutManager.getDecoratedTop(childAt) + translationY && f2 <= layoutManager.getDecoratedBottom(childAt) + translationY) {
                    return childAt;
                }
            }
        }
        return null;
    }
}

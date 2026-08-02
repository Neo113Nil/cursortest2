package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.x0;
import ru.yandex.taxi.preorder.suggested.selection.c;

/* loaded from: classes6.dex */
public final class n4v0 extends j {
    public final Context c;

    public n4v0(Context context) {
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j.b);
        this.a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        x0 findContainingViewHolder = recyclerView.findContainingViewHolder(view);
        if ((findContainingViewHolder instanceof c) && ((c) findContainingViewHolder).a0) {
            rect.bottom = (int) uh6.p(this.c, 6.0f);
        } else {
            rect.setEmpty();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            x0 findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
            if ((findContainingViewHolder instanceof c) && ((c) findContainingViewHolder).a0) {
                int bottom = childAt.getBottom() - ((int) uh6.p(this.c, 24.0f));
                drawable.setBounds(0, bottom, recyclerView.getRight(), drawable.getIntrinsicHeight() + bottom);
                drawable.draw(canvas);
            }
        }
    }
}

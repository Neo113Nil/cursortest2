package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: RecyclerItemDividerDecorator.kt */
/* loaded from: classes7.dex */
public class ajf0 extends RecyclerView.n {
    public static final int g = cn70.b(16);
    public static final int h = cn70.b(4);
    public static final int i = cn70.b(6);
    public final a b;
    public final int c;
    public final int d;
    public final ColorDrawable e;
    public final int f;

    /* compiled from: RecyclerItemDividerDecorator.kt */
    public interface a {
        hfz c(int i);
    }

    public ajf0(Context context, a aVar, int i2, int i3, int i4) {
        i2 = (i4 & 4) != 0 ? h : i2;
        i3 = (i4 & 8) != 0 ? i : i3;
        this.b = aVar;
        this.c = i2;
        this.d = i3;
        dhr0.a.getClass();
        this.e = new ColorDrawable(dhr0.Y(R.attr.vk_ui_separator_primary, new l7s(context, dhr0.u().c)));
        this.f = iah0.a(0.5f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i2 = m(childAdapterPosition) ? this.c : 0;
        if (l(childAdapterPosition)) {
            i2 += this.d;
        }
        rect.set(0, i2, 0, 0);
    }

    public boolean l(int i2) {
        throw null;
    }

    public boolean m(int i2) {
        throw null;
    }

    public boolean n(int i2) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition < recyclerView.getChildCount() && n(childAdapterPosition)) {
                int top = childAt.getTop() - this.d;
                int left = recyclerView.getLeft();
                int i3 = g;
                int i4 = left + i3;
                int right = recyclerView.getRight() - i3;
                int i5 = this.f + top;
                ColorDrawable colorDrawable = this.e;
                colorDrawable.setBounds(i4, top, right, i5);
                colorDrawable.draw(canvas);
            }
        }
    }
}

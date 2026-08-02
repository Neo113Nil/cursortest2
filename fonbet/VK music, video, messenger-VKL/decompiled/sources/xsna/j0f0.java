package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ReactionCardItemDecorator.kt */
/* loaded from: classes5.dex */
public final class j0f0 extends RecyclerView.n {
    public final t2f0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Rect h = new Rect();
    public final bpn0 i;
    public final bpn0 j;

    public j0f0(Context context, t2f0 t2f0Var) {
        this.b = t2f0Var;
        this.c = gbg0.a(context.getResources(), 12.0f);
        this.d = gbg0.a(context.getResources(), 3.0f);
        this.e = gbg0.a(context.getResources(), 2.0f);
        this.f = gbg0.a(context.getResources(), 12.0f);
        this.g = gbg0.a(context.getResources(), 4.0f);
        this.i = new bpn0(new jqe0(context, 1));
        this.j = new bpn0(new i0f0(context, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.b.e;
        if (childAdapterPosition < i) {
            rect.top = this.g;
        }
        int i2 = childAdapterPosition % i;
        int i3 = this.c;
        int i4 = this.f;
        if (i == 1) {
            rect.left = i3;
            rect.right = i3;
        } else if (i != 2) {
            if (i == 3) {
                int i5 = this.d;
                if (i2 == 0) {
                    rect.left = i3;
                    rect.right = i5;
                } else if (i2 == i - 1) {
                    rect.left = i5;
                    rect.right = i3;
                } else {
                    rect.left = i4 - i5;
                    rect.right = i4 - i5;
                }
            } else if (i != 4) {
                rect.left = i4 / 2;
                rect.right = i4 / 2;
            } else {
                int i6 = this.e;
                if (i2 == 0) {
                    rect.left = i3;
                    rect.right = i6;
                } else if (i2 == 1) {
                    rect.left = i4 - i6;
                    rect.right = i4 / 2;
                } else if (i2 == i - 2) {
                    rect.left = i4 / 2;
                    rect.right = i4 - i6;
                } else if (i2 == i - 1) {
                    rect.left = i6;
                    rect.right = i3;
                } else {
                    rect.left = i4 / 2;
                    rect.right = i4 / 2;
                }
            }
        } else if (i2 == 0) {
            rect.left = i3;
            rect.right = i4 / 2;
        } else if (i2 == i - 1) {
            rect.left = i4 / 2;
            rect.right = i3;
        } else {
            rect.left = i4 / 2;
            rect.right = i4 / 2;
        }
        rect.bottom = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (((g6f0) this.b.c.c(gridLayoutManager.getPosition(childAt))) != null) {
                int left = childAt.getLeft() - cn70.b(8);
                int top = childAt.getTop() - cn70.b(4);
                int b = cn70.b(8) + childAt.getRight();
                int b2 = cn70.b(12) + childAt.getBottom();
                Rect rect = this.h;
                rect.set(left, top, b, b2);
                bpn0 bpn0Var = this.i;
                NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) bpn0Var.getValue();
                if (ninePatchDrawable != null) {
                    ninePatchDrawable.setBounds(rect);
                }
                NinePatchDrawable ninePatchDrawable2 = (NinePatchDrawable) bpn0Var.getValue();
                if (ninePatchDrawable2 != null) {
                    ninePatchDrawable2.draw(canvas);
                }
                rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                bpn0 bpn0Var2 = this.j;
                Drawable drawable = (Drawable) bpn0Var2.getValue();
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                Drawable drawable2 = (Drawable) bpn0Var2.getValue();
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
            }
        }
    }
}

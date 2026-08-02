package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes8.dex */
public final class yrn extends RecyclerView.n implements too0 {
    public Drawable b;
    public Drawable c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final int l;
    public a m;
    public boolean n;
    public int o;

    /* compiled from: DividerItemDecoration.java */
    public interface a {
        boolean Z(RecyclerView.e0 e0Var);
    }

    public yrn(Drawable drawable, int i) {
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.o = 0;
        this.b = drawable;
        this.d = i;
    }

    @Override // xsna.too0
    public final void Ng() {
        int i = this.k;
        int i2 = this.l;
        if (i2 != 0) {
            this.b = new ColorDrawable(dhr0.t.c(i2));
        }
        if (i != 0) {
            this.c = new ColorDrawable(dhr0.t.c(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.Adapter adapter;
        if (recyclerView.getLayoutManager() == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        int bindingAdapterPosition = childViewHolder.getBindingAdapterPosition();
        rect.set(0, 0, 0, 0);
        if (bindingAdapterPosition == 0) {
            rect.top = this.e + rect.top;
        }
        if (bindingAdapterPosition == itemCount - 1) {
            return;
        }
        a aVar = this.m;
        if (aVar == null || (bindingAdapterPosition < itemCount && aVar.Z(childViewHolder))) {
            rect.bottom = this.d + this.i + this.g + rect.bottom;
        }
    }

    public final void l(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.Adapter adapter;
        RecyclerView.e0 childViewHolder;
        a aVar;
        Drawable drawable;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = !z ? this.f : this.h;
        int i2 = !z ? this.h : this.f;
        for (int i3 = 0; i3 < layoutManager.getChildCount(); i3++) {
            View childAt = layoutManager.getChildAt(i3);
            if (childAt != null && (childViewHolder = recyclerView.getChildViewHolder(childAt)) != null) {
                int bindingAdapterPosition = childViewHolder.getBindingAdapterPosition();
                if (bindingAdapterPosition == 0 && (drawable = this.c) != null) {
                    drawable.setBounds(childAt.getLeft() + this.j, childAt.getTop() - this.e, childAt.getRight() - this.j, childAt.getTop());
                    this.c.draw(canvas);
                }
                if (bindingAdapterPosition != itemCount - 1 && ((aVar = this.m) == null || (bindingAdapterPosition < itemCount && aVar.Z(childViewHolder)))) {
                    boolean z2 = this.n;
                    int i4 = this.d;
                    int decoratedBottom = (z2 ? recyclerView.getLayoutManager().getDecoratedBottom(childAt) : childAt.getBottom() + i4) + this.g + this.i;
                    this.b.setBounds(childAt.getLeft() + i + this.o, (decoratedBottom - i4) - this.i, (childAt.getRight() - i2) - this.o, decoratedBottom - this.i);
                    this.b.draw(canvas);
                }
            }
        }
    }

    public yrn(int i, int i2, Drawable drawable, Drawable drawable2) {
        this(drawable, i);
        this.c = drawable2;
        this.e = i2;
    }

    public yrn(int i, int i2) {
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.o = 0;
        this.l = i;
        this.b = new ColorDrawable(dhr0.t.c(i));
        this.d = i2;
    }
}

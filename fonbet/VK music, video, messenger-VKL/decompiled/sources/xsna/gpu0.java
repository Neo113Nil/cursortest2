package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: VkDecoration.kt */
/* loaded from: classes17.dex */
public final class gpu0 extends RecyclerView.n implements too0 {
    public static final a k = new a();
    public final Context b;
    public int c = R.attr.vk_ui_separator_primary_alpha;
    public ColorDrawable d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public jjv0 j;

    /* compiled from: VkDecoration.kt */
    public static final class a implements jjv0 {
        @Override // xsna.jjv0
        public final int n1(int i) {
            return 0;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return 0;
        }
    }

    public gpu0(Context context) {
        this.b = context;
        this.d = new ColorDrawable(krv0.m(this.c, context));
        iah0.a(4);
        this.e = iah0.a(32);
        this.f = iah0.a(0.5f) == 0 ? (int) Math.ceil(iah0.b(0.5f)) : iah0.a(0.5f);
        this.g = iah0.a(7.5f);
        this.h = iah0.a(8.0f);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.vk_post_side_padding);
        this.j = k;
    }

    @Override // xsna.too0
    public final void Ng() {
        this.d = new ColorDrawable(krv0.m(this.c, this.b));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.set(0, 0, 0, 0);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int n1 = this.j.n1(childAdapterPosition);
        int t = this.j.t(childAdapterPosition);
        if (n1 == 1) {
            rect.top = lr.a(this.g, this.f, t, rect.top);
        } else if (n1 == 2) {
            rect.top = this.f + t + rect.top;
        } else if (n1 == 3) {
            rect.top = rqi.a(t, 2, this.g + this.f + this.h, rect.top);
        } else if (n1 == 4) {
            rect.top = lr.a(this.f, this.h, t, rect.top);
        } else if (n1 == 5) {
            rect.top = this.g + t + rect.top;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (childAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) - 1) {
            rect.bottom += this.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                int position = layoutManager.getPosition(childAt);
                int left = childAt.getLeft() + this.i;
                int right = childAt.getRight() - this.i;
                int top = childAt.getTop() + ((int) childAt.getTranslationY());
                int n1 = this.j.n1(position);
                int t = this.j.t(position);
                if (n1 == 1 || n1 == 2) {
                    this.d.setBounds(left, top - this.f, right, top);
                    this.d.draw(canvas);
                } else if (n1 == 3 || n1 == 4) {
                    int i2 = (top - this.h) - t;
                    this.d.setBounds(left, i2 - this.f, right, i2);
                    this.d.draw(canvas);
                } else if (n1 == 6) {
                    this.d.setBounds(left, this.f + top, right, top);
                    this.d.draw(canvas);
                }
            }
        }
    }
}

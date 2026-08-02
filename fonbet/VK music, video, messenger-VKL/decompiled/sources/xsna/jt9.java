package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.base.GridFragment;
import java.util.WeakHashMap;

/* compiled from: CardItemDecoration.java */
/* loaded from: classes7.dex */
public final class jt9 extends RecyclerView.n implements too0 {
    public final ft9 b;

    @Nullable
    public final mf7 c;
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final SparseIntArray p;
    public final int q;
    public final int r;

    public jt9(@Nullable GridFragment.b bVar, boolean z) {
        Paint paint = new Paint();
        this.d = paint;
        this.o = true;
        this.p = new SparseIntArray();
        this.q = R.attr.vk_ui_background;
        this.r = R.attr.vk_ui_background_content;
        e43.a.getResources();
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_background_content);
        WeakHashMap weakHashMap = j6r0.a;
        float a = iah0.a(2.0f);
        this.n = z;
        ft9 ft9Var = new ft9(a, c, z);
        Rect rect = new Rect();
        this.b = ft9Var;
        ft9Var.getPadding(rect);
        this.i = rect.left;
        this.j = rect.top;
        this.k = rect.right;
        this.l = rect.bottom;
        int i = this.q;
        this.q = i;
        paint.setColor(abg0Var.c(i));
        this.c = bVar;
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.b.a.setColor(abg0Var.c(this.r));
        this.d.setColor(abg0Var.c(this.q));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.c != null) {
            if ((this.c.e0(recyclerView.getChildAdapterPosition(view)) & 4) == 4) {
                rect.bottom += this.m;
            }
        }
    }

    public final void l(Canvas canvas, RecyclerView recyclerView, int i, int i2, int i3, int i4, int i5, int i6) {
        Canvas canvas2;
        Paint paint = this.d;
        if (paint.getColor() != 0) {
            int i7 = (int) this.b.j;
            float f = i2 - i5;
            float f2 = i6 + i4;
            canvas2 = canvas;
            canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.i + i, f2, paint);
            canvas2.drawRect(i3 - this.k, f, recyclerView.getWidth(), f2, paint);
            canvas2.drawRect(this.i + i, f, i3 - this.k, this.j + i2, paint);
            canvas2.drawRect(this.i + i, i4 - this.l, i3 - this.k, f2, paint);
            canvas2.drawRect(this.i + i, this.j + i2, r8 + i7, r9 + i7, paint);
            canvas2.drawRect(this.i + i, r9 - i7, r8 + i7, i4 - this.l, paint);
            int i8 = i3 - this.k;
            canvas2.drawRect(i8 - i7, this.j + i2, i8, r9 + i7, paint);
            canvas2.drawRect(r8 - i7, r9 - i7, i3 - this.k, i4 - this.l, paint);
        } else {
            canvas2 = canvas;
        }
        this.b.setBounds(i, i2, i3, i4);
        this.b.draw(canvas2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View view;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        if (recyclerView == null) {
            return;
        }
        if (this.c == null) {
            l(canvas, recyclerView, (recyclerView.getPaddingLeft() - this.i) - this.e, (recyclerView.getPaddingTop() - ((int) this.b.j)) - this.f, (recyclerView.getWidth() - recyclerView.getPaddingRight()) + this.k + this.g, (recyclerView.getHeight() - recyclerView.getPaddingBottom()) + ((int) this.b.j) + this.h, 0, 0);
            return;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2.getAdapter() == null) {
            return;
        }
        int i5 = Integer.MAX_VALUE;
        boolean z3 = this.o;
        boolean z4 = this.n;
        int paddingLeft = z4 ? 0 : z3 ? (recyclerView2.getPaddingLeft() - this.i) - this.e : Integer.MAX_VALUE;
        int width = z4 ? recyclerView2.getWidth() : z3 ? (recyclerView2.getWidth() - recyclerView2.getPaddingRight()) + this.k + this.g : Integer.MIN_VALUE;
        int i6 = this.m;
        int childCount = recyclerView2.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            i5 = Math.min(recyclerView2.getChildAdapterPosition(recyclerView2.getChildAt(i7)), i5);
        }
        SparseIntArray sparseIntArray = this.p;
        sparseIntArray.clear();
        int childCount2 = recyclerView2.getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount2; i9++) {
            int childAdapterPosition = recyclerView2.getChildAdapterPosition(recyclerView2.getChildAt(i9));
            i8 = Math.max(i8, childAdapterPosition);
            sparseIntArray.put(childAdapterPosition, i9);
        }
        int itemCount = recyclerView2.getAdapter().getItemCount() - 1;
        int i10 = paddingLeft;
        int i11 = width;
        boolean z5 = false;
        boolean z6 = false;
        int i12 = 0;
        boolean z7 = false;
        int i13 = 0;
        int i14 = 0;
        while (i5 <= i8) {
            int i15 = i6;
            int i16 = sparseIntArray.get(i5, -1);
            if (i16 == -1) {
                int i17 = i14;
                i3 = i5;
                i4 = i17;
                int i18 = i13;
                i = itemCount;
                i2 = i18;
                i6 = i15;
            } else {
                View childAt = recyclerView2.getChildAt(i16);
                int e0 = this.c.e0(i5);
                if (z4 || z3) {
                    view = childAt;
                } else {
                    view = childAt;
                    if ((e0 & 8) == 8) {
                        i10 = Math.min((view.getLeft() - this.i) - this.e, i10);
                    }
                    if ((e0 & 16) == 16) {
                        i11 = Math.max(view.getRight() + this.k + this.g, i11);
                    }
                }
                int i19 = i10;
                int i20 = i11;
                if (e0 != 0 && !z5) {
                    i13 = ((Math.round(view.getTranslationY()) + view.getTop()) - this.j) - this.f;
                    if (i5 == 0) {
                        i14 = (recyclerView.getPaddingTop() - this.j) - this.f;
                    }
                    z5 = true;
                    z6 = false;
                }
                if (e0 != 0) {
                    i12 = Math.round(view.getTranslationY()) + view.getBottom() + this.l + this.h;
                }
                int i21 = i12;
                if ((e0 & 4) == 4 && !z6) {
                    z6 = true;
                    z7 = true;
                    z5 = false;
                }
                if (i5 == i8 && z5 && !z6) {
                    z7 = true;
                    z = false;
                    z2 = false;
                } else {
                    z = z5;
                    z2 = z6;
                }
                int bottom = (i5 == itemCount || i5 == i8) ? recyclerView.getBottom() - i21 : i15;
                if (z7) {
                    int i22 = i13;
                    i = itemCount;
                    i2 = i22;
                    int i23 = i14;
                    i3 = i5;
                    l(canvas, recyclerView, i19, i2, i20, i21, i23, bottom);
                    i6 = this.m;
                    z5 = z;
                    i10 = paddingLeft;
                    z6 = z2;
                    i4 = 0;
                    z7 = false;
                    i12 = i21;
                    i11 = width;
                } else {
                    int i24 = i13;
                    i = itemCount;
                    i2 = i24;
                    int i25 = i14;
                    i3 = i5;
                    i10 = i19;
                    i6 = bottom;
                    z6 = z2;
                    i12 = i21;
                    i11 = i20;
                    i4 = i25;
                    z5 = z;
                }
            }
            int i26 = i3 + 1;
            int i27 = i;
            i13 = i2;
            itemCount = i27;
            i14 = i4;
            i5 = i26;
            recyclerView2 = recyclerView;
        }
    }
}

package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: CardItemDecorator.java */
/* loaded from: classes3.dex */
public class kt9 extends RecyclerView.n implements too0 {
    public final mf7 b;
    public final RecyclerView.o c;
    public final ft9 d;
    public final boolean e;
    public final Paint f;
    public final Rect g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public final boolean n;
    public final Context o;
    public final ArrayList<View> p;
    public final a q;

    /* compiled from: CardItemDecorator.java */
    public class a implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            View view3 = view;
            View view4 = view2;
            if (view3.equals(view4)) {
                return 0;
            }
            return view3.getTop() - view4.getTop();
        }
    }

    public kt9(RecyclerView recyclerView, mf7 mf7Var, boolean z) {
        Context context = recyclerView.getContext();
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        int m = krv0.m(R.attr.vk_ui_background, context);
        float f = ft9.o;
        Paint paint = new Paint();
        this.f = paint;
        this.g = new Rect();
        boolean z2 = true;
        this.m = true;
        this.n = true;
        this.p = new ArrayList<>();
        this.q = new a();
        this.o = context;
        if (mf7Var == null) {
            throw new NullPointerException("BlockTypeProvider must be not null");
        }
        this.b = mf7Var;
        this.c = layoutManager;
        this.h = krv0.m(R.attr.vk_ui_background, context);
        context.getResources();
        this.d = new ft9(iah0.a(2), f, krv0.m(R.attr.vk_ui_background_content, context), z);
        paint.setColor(m);
        if ((!(layoutManager instanceof GridLayoutManager) || ((GridLayoutManager) layoutManager).s != 1) && (!(layoutManager instanceof LinearLayoutManager) || (layoutManager instanceof GridLayoutManager))) {
            z2 = false;
        }
        this.e = z2;
    }

    public static boolean p(int i, int i2) {
        return (i & i2) == i2;
    }

    @Override // xsna.too0
    public final void Ng() {
        Context context = this.o;
        this.d.a.setColor(krv0.m(R.attr.vk_ui_background_content, context));
        int m = krv0.m(R.attr.vk_ui_background, context);
        this.f.setColor(m);
        this.h = m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (adapter == null || childAdapterPosition >= itemCount) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int e0 = this.b.e0(childAdapterPosition);
        if (e0 == 0) {
            return;
        }
        this.d.getPadding(rect);
        if (this.e) {
            if (childAdapterPosition == 0) {
                e0 |= 32;
            }
            if (childAdapterPosition == itemCount - 1) {
                e0 |= 64;
            }
        }
        rect.top += p(e0, 32) ? this.k : this.i;
        rect.bottom += p(e0, 64) ? this.l : this.j;
        if (!p(e0, 6)) {
            if (p(e0, 2)) {
                rect.bottom = 0;
            } else if (p(e0, 4)) {
                rect.top = 0;
            } else if (p(e0, 1)) {
                rect.bottom = 0;
                rect.top = 0;
            }
        }
        if (p(e0, 8)) {
            rect.right = 0;
        }
        if (p(e0, 16)) {
            rect.left = 0;
        }
        if (childAdapterPosition == 0 && !this.n) {
            rect.top = 0;
        }
        m(childAdapterPosition, rect);
    }

    public final void l(Canvas canvas, Rect rect, int i, int i2) {
        int i3;
        if (this.m) {
            int i4 = rect.bottom;
            int i5 = rect.top;
            Rect rect2 = this.g;
            if (i4 < i5) {
                Log.e("bad bounds", rect2.toString());
            }
            this.d.getPadding(rect2);
            rect2.top = rect2.top + i;
            rect2.bottom = rect2.bottom + i2;
            int i6 = rect2.left;
            Paint paint = this.f;
            if (i6 > 0) {
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.top + r2, rect.left + i6, rect.bottom - r3, paint);
                float f = 2;
                canvas.drawRect(rect.left + rect2.left, (rect.top + rect2.top) - Math.min(0, i), iah0.a(f) + rect.left + rect2.left, iah0.a(f) + ((rect.top + rect2.top) - Math.min(0, i)), paint);
                canvas.drawRect(rect.left + rect2.left, (rect.bottom - rect2.bottom) - iah0.a(f), iah0.a(f) + rect.left + rect2.left, rect.bottom - rect2.bottom, paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(rect.right - rect2.left, rect.top + rect2.top, canvas.getWidth(), rect.bottom - rect2.bottom, paint);
                float f2 = 2;
                canvas.drawRect((rect.right - rect2.right) - iah0.a(f2), (rect.top + rect2.top) - Math.min(0, i), rect.right - rect2.right, iah0.a(f2) + ((rect.top + rect2.top) - Math.min(0, i)), paint);
                canvas.drawRect((rect.right - rect2.right) - iah0.a(f2), (rect.bottom - rect2.bottom) - iah0.a(f2), rect.right - rect2.right, rect.bottom - rect2.bottom, paint);
            }
            int i7 = rect2.top;
            if (i7 > 0 && (i3 = rect.top) > (-i7)) {
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3 - i, canvas.getWidth(), (rect.top + rect2.top) - Math.min(0, i), paint);
            }
            if (rect2.bottom <= 0 || rect.bottom >= canvas.getHeight()) {
                return;
            }
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.bottom - rect2.bottom, canvas.getWidth(), rect.bottom + i2, paint);
        }
    }

    public final int n(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return Math.round(view.getTranslationY()) + this.c.getDecoratedBottom(view) + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : 0);
    }

    public final int o(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return (Math.round(view.getTranslationY()) + this.c.getDecoratedTop(view)) - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
        ArrayList<View> arrayList;
        Paint paint;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean p;
        int i7;
        int i8;
        int i9;
        int i10;
        int n;
        RecyclerView recyclerView2 = recyclerView;
        super.onDraw(canvas, recyclerView, a0Var);
        RecyclerView.Adapter adapter = recyclerView2.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (adapter == null || itemCount == 0) {
            int i11 = this.h;
            if (i11 != 0) {
                canvas.drawColor(i11);
                return;
            }
            return;
        }
        int paddingLeft = recyclerView2.getPaddingLeft() + recyclerView2.getLeft();
        int right = recyclerView2.getRight() - recyclerView2.getPaddingRight();
        int childCount = recyclerView2.getChildCount();
        int i12 = 0;
        while (true) {
            arrayList = this.p;
            if (i12 >= childCount) {
                break;
            }
            View childAt = recyclerView2.getChildAt(i12);
            if (childAt != null) {
                arrayList.add(childAt);
            }
            i12++;
        }
        Collections.sort(arrayList, this.q);
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MIN_VALUE;
        int i17 = Integer.MIN_VALUE;
        while (true) {
            paint = this.f;
            if (i13 >= size) {
                i = i14;
                break;
            }
            View view = arrayList.get(i13);
            int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
            if (childAdapterPosition < 0) {
                i8 = i13;
                i7 = itemCount;
            } else {
                int i18 = i14;
                boolean z = childAdapterPosition == itemCount + (-1);
                if (childAdapterPosition < itemCount) {
                    boolean z2 = z;
                    i14 = i18;
                    int e0 = this.b.e0(childAdapterPosition);
                    if (childAdapterPosition == 0) {
                        i2 = e0;
                        if (!this.n && i2 != 0) {
                            e0 = i2 & (-3);
                            if (e0 == 0) {
                                i2 = 1;
                            }
                        }
                        if (this.e) {
                            i3 = i2;
                        } else {
                            i3 = childAdapterPosition == 0 ? i2 | 32 : i2;
                            if (z2) {
                                i3 |= 64;
                            }
                        }
                        i4 = Integer.MIN_VALUE;
                        if (i15 != Integer.MIN_VALUE) {
                            int i19 = p(i3, 32) ? this.k : this.i;
                            int i20 = i3 & (-33);
                            i5 = i19;
                            i6 = i20;
                            i4 = Integer.MIN_VALUE;
                        } else {
                            int i21 = i3;
                            i5 = i15;
                            i6 = i21;
                        }
                        if (i16 == i4) {
                            i16 = p(i6, 64) ? this.l : this.j;
                            i6 &= -65;
                        }
                        int i22 = i16;
                        p = p(i6, 6);
                        ft9 ft9Var = this.d;
                        if (p) {
                            i7 = itemCount;
                            if (p(i6, 2)) {
                                i17 = o(view) + i5;
                                if ((i13 == childCount - 1 || z2) && (n = n(view) + iah0.a(2)) >= i14) {
                                    ft9Var.setBounds(paddingLeft, i17, right, n - i22);
                                    l(canvas, ft9Var.getBounds(), i5, i22);
                                    ft9Var.draw(canvas);
                                    i8 = i13;
                                    i14 = n;
                                }
                                i8 = i13;
                            } else {
                                if (p(i6, 4)) {
                                    if (i17 == Integer.MIN_VALUE) {
                                        i17 = o(view) + i5;
                                    }
                                    if (p(i6, 1)) {
                                        i17 -= iah0.a(5);
                                    }
                                    int n2 = n(view);
                                    if (n2 >= i14) {
                                        ft9Var.setBounds(paddingLeft, i17, right, n2 - i22);
                                        if (ft9Var.getBounds().bottom > ft9Var.getBounds().top) {
                                            l(canvas, ft9Var.getBounds(), i5, i22);
                                            ft9Var.draw(canvas);
                                        }
                                        i8 = i13;
                                        i14 = n2;
                                    }
                                } else if (p(i6, 1)) {
                                    if (i17 == Integer.MIN_VALUE) {
                                        i17 = (o(view) - iah0.a(5)) + i5;
                                    }
                                    if ((i13 == childCount - 1 || z2 || i13 == 0) && (n = n(view) + iah0.a(2)) >= i14) {
                                        ft9Var.setBounds(paddingLeft, i17, right, n - i22);
                                        l(canvas, ft9Var.getBounds(), i5, i22);
                                        ft9Var.draw(canvas);
                                        i8 = i13;
                                        i14 = n;
                                    }
                                } else {
                                    if (this.m && i6 == 0) {
                                        float o = o(view);
                                        float width = canvas.getWidth();
                                        float n3 = n(view);
                                        i10 = i17;
                                        i8 = i13;
                                        i9 = i14;
                                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, o, width, n3, paint);
                                    } else {
                                        i8 = i13;
                                        i9 = i14;
                                        i10 = i17;
                                    }
                                    i15 = i5;
                                    i17 = i10;
                                    i14 = i9;
                                    i16 = i22;
                                }
                                i8 = i13;
                            }
                            i15 = i5;
                            i16 = i22;
                        } else {
                            int o2 = o(view);
                            int n4 = n(view);
                            ft9Var.setBounds(paddingLeft, o2 + i5, right, n4 - i22);
                            l(canvas, ft9Var.getBounds(), i5, i22);
                            ft9Var.draw(canvas);
                            i8 = i13;
                            i14 = n4;
                            i7 = itemCount;
                        }
                        i15 = Integer.MIN_VALUE;
                        i16 = Integer.MIN_VALUE;
                        i17 = Integer.MIN_VALUE;
                    }
                    i2 = e0;
                    if (this.e) {
                    }
                    i4 = Integer.MIN_VALUE;
                    if (i15 != Integer.MIN_VALUE) {
                    }
                    if (i16 == i4) {
                    }
                    int i222 = i16;
                    p = p(i6, 6);
                    ft9 ft9Var2 = this.d;
                    if (p) {
                    }
                    i15 = Integer.MIN_VALUE;
                    i16 = Integer.MIN_VALUE;
                    i17 = Integer.MIN_VALUE;
                } else if (this.m) {
                    paint = paint;
                    canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, o(view), canvas.getWidth(), n(view), paint);
                    i = i18;
                } else {
                    i = i18;
                    paint = paint;
                }
            }
            i13 = i8 + 1;
            recyclerView2 = recyclerView;
            itemCount = i7;
        }
        if (this.m && i < recyclerView.getHeight()) {
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, canvas.getWidth(), recyclerView.getHeight(), paint);
        }
        arrayList.clear();
    }

    public void m(int i, Rect rect) {
    }
}

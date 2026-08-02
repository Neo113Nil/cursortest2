package com.vkontakte.android.ui.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import xsna.iah0;

/* compiled from: SubPagerOfListItem.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class b extends ViewGroup {
    public final HashMap<View, Integer> b;
    public final SparseArray<View> c;
    public final SparseArray<SparseArray<View>> d;
    public Drawable e;
    public int f;
    public final Rect g;
    public View h;
    public int i;
    public boolean j;
    public boolean k;

    @NonNull
    public final SubPagerOfList l;
    public final a m;

    /* compiled from: SubPagerOfListItem.java */
    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            b.this.setAdapter(null);
        }
    }

    /* compiled from: SubPagerOfListItem.java */
    public static abstract class c extends RecyclerView.Adapter {
    }

    public b(@NonNull SubPagerOfList subPagerOfList) {
        super(subPagerOfList.getContext());
        this.b = new HashMap<>();
        this.c = new SparseArray<>();
        this.d = new SparseArray<>();
        this.e = null;
        this.f = 0;
        this.g = new Rect();
        this.h = null;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.m = new a();
        new C2109b();
        this.l = subPagerOfList;
    }

    private int getCurrentTop() {
        return Math.max(0, this.l.getEmulatedTop() * (-1));
    }

    public final int a(int i, int i2) {
        return this.k ? Math.min(((i2 - i) / this.f) + 2, this.i - 1) : Math.min((i2 / this.f) + 1, this.i - 1);
    }

    public final int b(int i) {
        if (!this.k) {
            return iah0.a(8.0f) + (this.f * i);
        }
        return iah0.a(8.0f) + (this.f * i) + Math.max(0, this.l.getEmulatedTop() * (-1));
    }

    public final void c() {
        if (getMeasuredWidth() == 0) {
            this.j = true;
            return;
        }
        int currentTop = getCurrentTop();
        SubPagerOfList subPagerOfList = this.l;
        int a2 = a(currentTop, Math.min(subPagerOfList.getEmulatedHeight(), subPagerOfList.getEmulatedHeight() - subPagerOfList.getEmulatedTop()) + currentTop);
        int childCount = getChildCount() - 1;
        while (true) {
            SparseArray<View> sparseArray = this.c;
            if (childCount < 0) {
                for (int max = this.k ? 0 : Math.max(currentTop / this.f, 0); max <= a2; max++) {
                    View view = sparseArray.get(max);
                    view.getClass();
                    if (this.k) {
                        view.layout(0, b(max), view.getMeasuredWidth(), b(max));
                        view.invalidate();
                    }
                }
                invalidate();
                return;
            }
            View childAt = getChildAt(childCount);
            int indexOfValue = sparseArray.indexOfValue(childAt);
            if ((indexOfValue >= 0 ? sparseArray.keyAt(indexOfValue) : -1) >= 0) {
                this.b.get(childAt).intValue();
                throw null;
            }
            childCount--;
        }
    }

    public final void d() {
        c();
        int currentTop = getCurrentTop();
        if (!this.k) {
            Math.max(currentTop / this.f, 0);
        }
        SubPagerOfList subPagerOfList = this.l;
        a(currentTop, Math.min(subPagerOfList.getEmulatedHeight(), subPagerOfList.getEmulatedHeight() - subPagerOfList.getEmulatedTop()) + currentTop);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = 0;
        while (true) {
            SparseArray<View> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                this.h = null;
                return;
            }
            int keyAt = sparseArray.keyAt(i);
            View view = sparseArray.get(keyAt);
            this.h = view;
            if (keyAt < this.i - 1) {
                int bottom = view.getBottom();
                Rect rect = this.g;
                rect.top = bottom;
                rect.left = this.h.getLeft();
                rect.right = this.h.getRight();
                rect.bottom = rect.top + this.f;
                Drawable drawable = this.e;
                if (drawable != null) {
                    drawable.setBounds(rect);
                    this.e.draw(canvas);
                }
            }
            i++;
        }
    }

    public c getListAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.j) {
            c();
            return;
        }
        int i5 = 0;
        while (true) {
            SparseArray<View> sparseArray = this.c;
            if (i5 >= sparseArray.size()) {
                this.h = null;
                return;
            }
            int keyAt = sparseArray.keyAt(i5);
            View view = sparseArray.get(keyAt);
            this.h = view;
            if (z) {
                view.forceLayout();
            }
            this.h.layout(0, b(keyAt), i3 - i, b(keyAt));
            i5++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            this.h = childAt;
            if (childAt.getVisibility() != 8) {
                this.h.measure(makeMeasureSpec2, makeMeasureSpec);
            }
        }
        this.h = null;
        setMeasuredDimension(View.MeasureSpec.getSize(i), iah0.a(16.0f) + ((this.i - 1) * this.f));
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        this.b.remove(view);
    }

    public void setAdapter(@NonNull c cVar) {
        cVar.registerAdapterDataObserver(this.m);
        this.i = cVar.getItemCount();
        c();
        int i = 0;
        while (true) {
            SparseArray<SparseArray<View>> sparseArray = this.d;
            if (i >= sparseArray.size()) {
                sparseArray.clear();
                requestLayout();
                d();
                return;
            } else {
                SparseArray<View> valueAt = sparseArray.valueAt(i);
                for (int i2 = 0; i2 < valueAt.size(); i2++) {
                    removeView(valueAt.valueAt(i2));
                }
                i++;
            }
        }
    }

    public void setDivider(@Nullable Drawable drawable) {
        if (drawable != null) {
            this.f = drawable.getIntrinsicHeight();
        } else {
            this.f = 0;
        }
        this.e = drawable;
        requestLayout();
    }

    public void setIsShowFirstItemMode(boolean z) {
        this.k = z;
        c();
        this.j = false;
        requestLayout();
    }

    /* compiled from: SubPagerOfListItem.java */
    /* renamed from: com.vkontakte.android.ui.widget.b$b, reason: collision with other inner class name */
    public class C2109b extends RecyclerView.t {
        public C2109b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            b.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }
    }
}

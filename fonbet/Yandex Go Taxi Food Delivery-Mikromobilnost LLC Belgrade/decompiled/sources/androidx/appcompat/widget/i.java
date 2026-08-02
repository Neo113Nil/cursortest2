package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import defpackage.f1a1;
import defpackage.gty;
import defpackage.hty;
import defpackage.iog0;
import defpackage.mbs;
import defpackage.n4i0;
import defpackage.q9s0;

/* loaded from: classes.dex */
public class i implements q9s0 {
    public final int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public final int F;
    public DataSetObserver G;
    public View H;
    public AdapterView.OnItemClickListener I;
    public AdapterView.OnItemSelectedListener J;
    public final mbs K;
    public final ListPopupWindow$PopupTouchInterceptor L;
    public final ListPopupWindow$PopupScrollListener M;
    public final h N;
    public final Handler O;
    public final Rect P;
    public Rect Q;
    public boolean R;
    public final PopupWindow S;
    public final Context a;
    public ListAdapter b;
    public DropDownListView c;
    public final int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.appcompat.widget.ListPopupWindow$PopupScrollListener] */
    public i(Context context, AttributeSet attributeSet, int i, int i2) {
        this.w = -2;
        this.x = -2;
        this.A = 1002;
        this.E = 0;
        this.F = Integer.MAX_VALUE;
        this.K = new mbs(5, this);
        this.L = new View.OnTouchListener() { // from class: androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                PopupWindow popupWindow;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && (popupWindow = i.this.S) != null && popupWindow.isShowing() && x >= 0 && x < i.this.S.getWidth() && y >= 0 && y < i.this.S.getHeight()) {
                    i iVar = i.this;
                    iVar.O.postDelayed(iVar.K, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                i iVar2 = i.this;
                iVar2.O.removeCallbacks(iVar2.K);
                return false;
            }
        };
        this.M = new AbsListView.OnScrollListener() { // from class: androidx.appcompat.widget.ListPopupWindow$PopupScrollListener
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i3, int i4, int i5) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i3) {
                if (i3 != 1 || i.this.S.getInputMethodMode() == 2 || i.this.S.getContentView() == null) {
                    return;
                }
                i iVar = i.this;
                iVar.O.removeCallbacks(iVar.K);
                i.this.K.run();
            }
        };
        this.N = new h(this);
        this.P = new Rect();
        this.a = context;
        this.O = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4i0.ListPopupWindow, i, i2);
        this.y = obtainStyledAttributes.getDimensionPixelOffset(n4i0.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(n4i0.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.B = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.S = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    public DropDownListView c(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    public final void d(int i) {
        Drawable background = this.S.getBackground();
        if (background == null) {
            this.x = i;
            return;
        }
        Rect rect = this.P;
        background.getPadding(rect);
        this.x = rect.left + rect.right + i;
    }

    @Override // defpackage.q9s0
    public final void dismiss() {
        PopupWindow popupWindow = this.S;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.c = null;
        this.O.removeCallbacks(this.K);
    }

    public final void e() {
        this.R = true;
        this.S.setFocusable(true);
    }

    public final Drawable getBackground() {
        return this.S.getBackground();
    }

    public final int getHorizontalOffset() {
        return this.y;
    }

    @Override // defpackage.q9s0
    public final ListView getListView() {
        return this.c;
    }

    public final int getVerticalOffset() {
        if (this.B) {
            return this.z;
        }
        return 0;
    }

    @Override // defpackage.q9s0
    public final boolean isShowing() {
        return this.S.isShowing();
    }

    public void setAdapter(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.G;
        if (dataSetObserver == null) {
            this.G = new DataSetObserver() { // from class: androidx.appcompat.widget.ListPopupWindow$PopupDataSetObserver
                @Override // android.database.DataSetObserver
                public void onChanged() {
                    if (i.this.S.isShowing()) {
                        i.this.show();
                    }
                }

                @Override // android.database.DataSetObserver
                public void onInvalidated() {
                    i.this.dismiss();
                }
            };
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.G);
        }
        DropDownListView dropDownListView = this.c;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.b);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.S.setBackgroundDrawable(drawable);
    }

    public final void setHorizontalOffset(int i) {
        this.y = i;
    }

    public final void setVerticalOffset(int i) {
        this.z = i;
        this.B = true;
    }

    @Override // defpackage.q9s0
    public void show() {
        int i;
        int paddingBottom;
        DropDownListView dropDownListView;
        DropDownListView dropDownListView2 = this.c;
        Context context = this.a;
        PopupWindow popupWindow = this.S;
        if (dropDownListView2 == null) {
            DropDownListView c = c(context, !this.R);
            this.c = c;
            c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.I);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow$3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                    DropDownListView dropDownListView3;
                    if (i2 == -1 || (dropDownListView3 = i.this.c) == null) {
                        return;
                    }
                    dropDownListView3.setListSelectionHidden(false);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.c.setOnScrollListener(this.M);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.J;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.P;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.B) {
                this.z = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a = gty.a(popupWindow, this.H, this.z, popupWindow.getInputMethodMode() == 2);
        int i3 = this.w;
        if (i3 == -1) {
            paddingBottom = a + i;
        } else {
            int i4 = this.x;
            int measureHeightOfChildrenCompat = this.c.measureHeightOfChildrenCompat(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), 0, -1, a, -1);
            paddingBottom = measureHeightOfChildrenCompat + (measureHeightOfChildrenCompat > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        f1a1.g(popupWindow, this.A);
        if (popupWindow.isShowing()) {
            if (this.H.isAttachedToWindow()) {
                int i5 = this.x;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.H.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i6 = this.x;
                    if (z) {
                        popupWindow.setWidth(i6 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(i6 == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                int i7 = i5;
                popupWindow.update(this.H, this.y, this.z, i7 < 0 ? -1 : i7, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.x;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.H.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        popupWindow.setWidth(i8);
        popupWindow.setHeight(i3);
        hty.b(popupWindow, true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.L);
        if (this.D) {
            f1a1.f(popupWindow, this.C);
        }
        hty.a(popupWindow, this.Q);
        f1a1.h(popupWindow, this.H, this.y, this.z, this.E);
        this.c.setSelection(-1);
        if ((!this.R || this.c.isInTouchMode()) && (dropDownListView = this.c) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.R) {
            return;
        }
        this.O.post(this.N);
    }

    public i(Context context) {
        this(context, null, iog0.listPopupWindowStyle, 0);
    }
}

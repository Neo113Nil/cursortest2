package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes.dex */
public abstract class byu extends azt0<View> {
    public final Rect d;
    public final Rect e;
    public int f;
    public int g;

    public byu() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    @Override // xsna.azt0
    public final void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        View H = H(coordinatorLayout.E(view));
        if (H == null) {
            coordinatorLayout.R(i, view);
            this.f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
        int bottom = H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        int bottom2 = ((H.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
        Rect rect = this.d;
        rect.set(paddingLeft, bottom, width, bottom2);
        bqx0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i2 = fVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.e;
        s101.g(i2, measuredWidth, measuredHeight, i, rect, rect2);
        int I = I(H);
        view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
        this.f = rect2.top - H.getBottom();
    }

    @Nullable
    public abstract View H(ArrayList arrayList);

    public final int I(View view) {
        if (this.g == 0) {
            return 0;
        }
        float J = J(view);
        int i = this.g;
        return xwk.b((int) (J * i), 0, i);
    }

    public float J(View view) {
        return 1.0f;
    }

    public int K(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        View H;
        bqx0 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (H = H(coordinatorLayout.E(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (H.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int K = K(H) + size;
        int measuredHeight = H.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            K -= measuredHeight;
        }
        coordinatorLayout.U(view, i, i2, View.MeasureSpec.makeMeasureSpec(K, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    public byu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}

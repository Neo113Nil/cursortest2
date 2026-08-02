package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuBuilder;
import defpackage.iog0;
import defpackage.n4i0;
import defpackage.qw;
import defpackage.vr;
import defpackage.x4e;

/* loaded from: classes10.dex */
abstract class AbsActionBarView extends ViewGroup {
    private static final int FADE_DURATION = 200;
    protected d mActionMenuPresenter;
    protected int mContentHeight;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected final b mVisAnimListener;
    protected androidx.core.view.d mVisibilityAnim;

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVisAnimListener = new b(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(iog0.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.mPopupContext = context;
        } else {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int next(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public void animateToVisibility(int i) {
        View view = (View) setupAnimatorToVisibility(i, 200L).a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        d dVar = this.mActionMenuPresenter;
        if (dVar != null) {
            dVar.b();
            qw qwVar = dVar.N;
            if (qwVar != null) {
                qwVar.a();
            }
        }
    }

    public int getAnimatedVisibility() {
        return this.mVisibilityAnim != null ? this.mVisAnimListener.b : getVisibility();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public boolean hideOverflowMenu() {
        d dVar = this.mActionMenuPresenter;
        if (dVar != null) {
            return dVar.b();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        d dVar = this.mActionMenuPresenter;
        if (dVar != null) {
            return dVar.O != null || dVar.c();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        d dVar = this.mActionMenuPresenter;
        if (dVar != null) {
            return dVar.c();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        d dVar = this.mActionMenuPresenter;
        return dVar != null && dVar.F;
    }

    public int measureChildView(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, n4i0.ActionBar, iog0.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(n4i0.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        d dVar = this.mActionMenuPresenter;
        if (dVar != null) {
            dVar.J = vr.d(dVar.b).e();
            MenuBuilder menuBuilder = dVar.c;
            if (menuBuilder != null) {
                menuBuilder.onItemsChanged(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public int positionChild(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int c = x4e.c(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, c, i, measuredHeight + c);
        } else {
            view.layout(i, c, i + measuredWidth, measuredHeight + c);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public void postShowOverflowMenu() {
        post(new a(0, this));
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            androidx.core.view.d dVar = this.mVisibilityAnim;
            if (dVar != null) {
                dVar.b();
            }
            super.setVisibility(i);
        }
    }

    public androidx.core.view.d setupAnimatorToVisibility(int i, long j) {
        androidx.core.view.d dVar = this.mVisibilityAnim;
        if (dVar != null) {
            dVar.b();
        }
        if (i != 0) {
            androidx.core.view.d c = androidx.core.view.b.c(this);
            c.a(0.0f);
            c.c(j);
            b bVar = this.mVisAnimListener;
            bVar.c.mVisibilityAnim = c;
            bVar.b = i;
            c.d(bVar);
            return c;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.d c2 = androidx.core.view.b.c(this);
        c2.a(1.0f);
        c2.c(j);
        b bVar2 = this.mVisAnimListener;
        bVar2.c.mVisibilityAnim = c2;
        bVar2.b = i;
        c2.d(bVar2);
        return c2;
    }

    public boolean showOverflowMenu() {
        d dVar = this.mActionMenuPresenter;
        if (dVar != null) {
            return dVar.e();
        }
        return false;
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbsActionBarView(Context context) {
        this(context, null);
    }
}

package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: AbsActionBarView.java */
/* loaded from: classes11.dex */
public abstract class y9 extends ViewGroup {
    public final a b;
    public final Context c;
    public ActionMenuView d;
    public ActionMenuPresenter e;
    public int f;
    public b0u0 g;
    public boolean h;
    public boolean i;

    /* compiled from: AbsActionBarView.java */
    public class a implements e0u0 {
        public boolean a = false;
        public int b;

        public a() {
        }

        @Override // xsna.e0u0
        public final void a() {
            y9.super.setVisibility(0);
            this.a = false;
        }

        @Override // xsna.e0u0
        public final void b() {
            if (this.a) {
                return;
            }
            y9 y9Var = y9.this;
            y9Var.g = null;
            y9.super.setVisibility(this.b);
        }

        @Override // xsna.e0u0
        public final void c() {
            this.a = true;
        }
    }

    public y9(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(int i, int i2, View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int d(View view, boolean z, int i, int i2, int i3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int b = x9.b(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, b, i, measuredHeight + b);
        } else {
            view.layout(i, b, i + measuredWidth, measuredHeight + b);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final b0u0 e(int i, long j) {
        b0u0 b0u0Var = this.g;
        if (b0u0Var != null) {
            b0u0Var.b();
        }
        a aVar = this.b;
        if (i != 0) {
            b0u0 b = iut0.b(this);
            b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            b.c(j);
            y9.this.g = b;
            aVar.b = i;
            b.d(aVar);
            return b;
        }
        if (getVisibility() != 0) {
            setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        b0u0 b2 = iut0.b(this);
        b2.a(1.0f);
        b2.c(j);
        y9.this.g = b2;
        aVar.b = i;
        b2.d(aVar);
        return b2;
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.b.b : getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.e;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            actionMenuPresenter.r = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.d;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.i = false;
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.h = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            b0u0 b0u0Var = this.g;
            if (b0u0Var != null) {
                b0u0Var.b();
            }
            super.setVisibility(i);
        }
    }

    public y9(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.c = context;
        } else {
            this.c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}

package com.vkontakte.android.ui.layout;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.b8q;
import xsna.c8q;
import xsna.e3m;
import xsna.fnj;
import xsna.iah0;
import xsna.izs;
import xsna.m33;
import xsna.s3q0;

/* loaded from: classes7.dex */
public class ExpandableBarLayout extends ViewGroup {
    public static final /* synthetic */ int m = 0;
    public View b;
    public View c;
    public View d;
    public View e;
    public final Paint f;
    public izs<Float, s3q0> g;
    public izs<Boolean, s3q0> h;
    public final AccelerateDecelerateInterpolator i;
    public boolean j;
    public final Drawable k;
    public final int l;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ExpandableBarLayout expandableBarLayout = ExpandableBarLayout.this;
            if (expandableBarLayout.j) {
                expandableBarLayout.a();
                return;
            }
            View view2 = expandableBarLayout.c;
            if (view2 == null) {
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -view2.getMeasuredHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat.setDuration(400L);
            ofFloat.setInterpolator(expandableBarLayout.i);
            ofFloat.addListener(new c8q(expandableBarLayout));
            ofFloat.addUpdateListener(new b8q(expandableBarLayout, 0));
            ofFloat.start();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
            ExpandableBarLayout expandableBarLayout = ExpandableBarLayout.this;
            izs<Float, s3q0> izsVar = expandableBarLayout.g;
            if (izsVar != null) {
                izsVar.invoke(Float.valueOf(animatedFraction));
            }
            expandableBarLayout.f.setAlpha((int) (animatedFraction * 102.0f));
            expandableBarLayout.invalidate();
        }
    }

    public ExpandableBarLayout(Context context) {
        super(context);
        this.i = new AccelerateDecelerateInterpolator();
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f = paint;
        paint.setColor(-16777216);
        paint.setAlpha(102);
        Context context2 = getContext();
        e3m.a aVar = e3m.a;
        this.k = m33.a(R.drawable.bg_search_expand_shadow, context2);
        this.l = (int) getResources().getDimension(R.dimen.vk_bottom_navigation_height);
    }

    private void setContainerViewPadding(Configuration configuration) {
        View view = this.e;
        if (view != null) {
            Context context = getContext();
            HashSet hashSet = iah0.a;
            view.setPadding(0, 0, 0, (fnj.d(context) || configuration.orientation != 2) ? 0 : this.l);
        }
    }

    public final void a() {
        View view = this.c;
        if (view == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -view.getMeasuredHeight());
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(this.i);
        ofFloat.addListener(new b());
        ofFloat.addUpdateListener(new c());
        ofFloat.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View view;
        super.dispatchDraw(canvas);
        boolean z = this.j;
        Drawable drawable = this.k;
        if (!z || (view = this.c) == null) {
            if (drawable != null) {
                drawable.setBounds(0, this.b.getBottom(), getWidth(), drawable.getIntrinsicHeight() + this.b.getBottom());
                drawable.draw(canvas);
                return;
            }
            return;
        }
        int translationY = (int) (this.c.getTranslationY() + view.getBottom());
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, translationY, getRight(), getBottom(), this.f);
        if (drawable != null) {
            drawable.setBounds(0, translationY, getWidth(), drawable.getIntrinsicHeight() + translationY);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        if (this.j && (view = this.c) != null) {
            if (motionEvent.getY() > ((int) (this.c.getTranslationY() + view.getBottom()))) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                a();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.j && view == this.d && this.c != null) {
            int save = canvas.save();
            canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c.getTranslationY() + this.c.getBottom(), getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            return drawChild;
        }
        if (view != this.c) {
            return super.drawChild(canvas, view, j);
        }
        int save2 = canvas.save();
        canvas.clipRect(0, this.b.getBottom(), getWidth(), getBottom());
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save2);
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasTransientState() {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setContainerViewPadding(configuration);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = getChildAt(0);
        this.b = getChildAt(1);
        View childAt = getChildAt(2);
        this.c = childAt;
        if (childAt != null) {
            this.b.setOnClickListener(new a());
        }
        this.e = findViewById(R.id.search_extended);
        setContainerViewPadding(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        View view = this.b;
        int measuredHeight = (view == null ? 0 : view.getMeasuredHeight()) + paddingTop;
        View view2 = this.d;
        if (view2 != null) {
            view2.layout(paddingLeft, measuredHeight, view2.getMeasuredWidth() + paddingLeft, this.d.getMeasuredHeight() + measuredHeight);
        }
        View view3 = this.c;
        if (view3 != null && view3.getVisibility() == 0) {
            View view4 = this.c;
            view4.layout(paddingLeft, measuredHeight, view4.getMeasuredWidth() + paddingLeft, this.c.getMeasuredHeight() + measuredHeight);
        }
        View view5 = this.b;
        if (view5 != null) {
            view5.layout(paddingLeft, paddingTop, view5.getMeasuredWidth() + paddingLeft, measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (this.b.getLayoutParams().height >= 0) {
            View view = this.b;
            view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().height, 1073741824));
        } else {
            this.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
        }
        int measuredHeight2 = measuredHeight - this.b.getMeasuredHeight();
        View view2 = this.c;
        if (view2 != null) {
            view2.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, Integer.MIN_VALUE));
        }
        this.d.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
    }

    public void setOpenListener(izs<Boolean, s3q0> izsVar) {
        this.h = izsVar;
    }

    public void setProgressListener(izs<Float, s3q0> izsVar) {
        this.g = izsVar;
    }

    public ExpandableBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new AccelerateDecelerateInterpolator();
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f = paint;
        paint.setColor(-16777216);
        paint.setAlpha(102);
        Context context2 = getContext();
        e3m.a aVar = e3m.a;
        this.k = m33.a(R.drawable.bg_search_expand_shadow, context2);
        this.l = (int) getResources().getDimension(R.dimen.vk_bottom_navigation_height);
    }

    public ExpandableBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new AccelerateDecelerateInterpolator();
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f = paint;
        paint.setColor(-16777216);
        paint.setAlpha(102);
        Context context2 = getContext();
        e3m.a aVar = e3m.a;
        this.k = m33.a(R.drawable.bg_search_expand_shadow, context2);
        this.l = (int) getResources().getDimension(R.dimen.vk_bottom_navigation_height);
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ExpandableBarLayout expandableBarLayout = ExpandableBarLayout.this;
            expandableBarLayout.j = false;
            expandableBarLayout.c.setVisibility(8);
            izs<Boolean, s3q0> izsVar = expandableBarLayout.h;
            if (izsVar != null) {
                izsVar.invoke(Boolean.valueOf(expandableBarLayout.j));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ExpandableBarLayout expandableBarLayout = ExpandableBarLayout.this;
            expandableBarLayout.j = false;
            expandableBarLayout.c.setVisibility(8);
            izs<Boolean, s3q0> izsVar = expandableBarLayout.h;
            if (izsVar != null) {
                izsVar.invoke(Boolean.valueOf(expandableBarLayout.j));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @TargetApi(21)
    public ExpandableBarLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new AccelerateDecelerateInterpolator();
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f = paint;
        paint.setColor(-16777216);
        paint.setAlpha(102);
        Context context2 = getContext();
        e3m.a aVar = e3m.a;
        this.k = m33.a(R.drawable.bg_search_expand_shadow, context2);
        this.l = (int) getResources().getDimension(R.dimen.vk_bottom_navigation_height);
    }
}

package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.avb;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.jx81;
import defpackage.ny61;
import defpackage.org0;
import defpackage.pvb;
import defpackage.yvy0;
import defpackage.z2i0;

/* loaded from: classes11.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<pvb> {
    public static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_ADVANCE = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_RETREAT = 1;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        initializeDrawables();
        this.initialized = true;
    }

    private void initializeDrawables() {
        avb avbVar = new avb((pvb) this.spec);
        setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(getContext(), (pvb) this.spec, avbVar));
        setProgressDrawable(DeterminateDrawable.createCircularDrawable(getContext(), (pvb) this.spec, avbVar));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public pvb createSpec(Context context, AttributeSet attributeSet) {
        int i = eng0.circularProgressIndicatorStyle;
        int i2 = DEF_STYLE_RES;
        pvb pvbVar = new pvb(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(org0.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(org0.mtrl_progress_circular_inset_medium);
        int[] iArr = z2i0.CircularProgressIndicator;
        yvy0.a(context, attributeSet, i, i2);
        yvy0.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        pvbVar.q = obtainStyledAttributes.getInt(z2i0.CircularProgressIndicator_indeterminateAnimationTypeCircular, 0);
        pvbVar.r = Math.max(jx81.p(context, obtainStyledAttributes, z2i0.CircularProgressIndicator_indicatorSize, dimensionPixelSize), pvbVar.a * 2);
        pvbVar.s = jx81.p(context, obtainStyledAttributes, z2i0.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        pvbVar.t = obtainStyledAttributes.getInt(z2i0.CircularProgressIndicator_indicatorDirectionCircular, 0);
        pvbVar.u = obtainStyledAttributes.getBoolean(z2i0.CircularProgressIndicator_indeterminateTrackVisible, true);
        obtainStyledAttributes.recycle();
        pvbVar.d();
        return pvbVar;
    }

    public int getIndeterminateAnimationType() {
        return ((pvb) this.spec).q;
    }

    public int getIndicatorDirection() {
        return ((pvb) this.spec).t;
    }

    public int getIndicatorInset() {
        return ((pvb) this.spec).s;
    }

    public int getIndicatorSize() {
        return ((pvb) this.spec).r;
    }

    public void setIndeterminateAnimationType(int i) {
        if (((pvb) this.spec).q == i) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            ny61.r("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        S s = this.spec;
        ((pvb) s).q = i;
        ((pvb) s).d();
        getIndeterminateDrawable().setAnimatorDelegate(i == 1 ? new b(getContext(), (pvb) this.spec) : new a((pvb) this.spec));
        registerSwitchIndeterminateModeCallback();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((pvb) this.spec).t = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.spec;
        if (((pvb) s).s != i) {
            ((pvb) s).s = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.spec;
        if (((pvb) s).r != max) {
            ((pvb) s).r = max;
            ((pvb) s).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((pvb) this.spec).d();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}

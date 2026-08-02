package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.gjy;
import defpackage.niy;
import defpackage.ny61;
import defpackage.yvy0;
import defpackage.z2i0;
import java.util.Objects;

/* loaded from: classes11.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<gjy> {
    public static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_LinearProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        initializeDrawables();
        this.initialized = true;
    }

    private void initializeDrawables() {
        niy niyVar = new niy((gjy) this.spec);
        setIndeterminateDrawable(IndeterminateDrawable.createLinearDrawable(getContext(), (gjy) this.spec, niyVar));
        setProgressDrawable(DeterminateDrawable.createLinearDrawable(getContext(), (gjy) this.spec, niyVar));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public gjy createSpec(Context context, AttributeSet attributeSet) {
        int i = eng0.linearProgressIndicatorStyle;
        int i2 = DEF_STYLE_RES;
        gjy gjyVar = new gjy(context, attributeSet, i, i2);
        int[] iArr = z2i0.LinearProgressIndicator;
        int i3 = eng0.linearProgressIndicatorStyle;
        yvy0.a(context, attributeSet, i3, i2);
        yvy0.b(context, attributeSet, iArr, i3, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
        gjyVar.q = obtainStyledAttributes.getInt(z2i0.LinearProgressIndicator_indeterminateAnimationType, 1);
        gjyVar.r = obtainStyledAttributes.getInt(z2i0.LinearProgressIndicator_indicatorDirectionLinear, 0);
        gjyVar.t = obtainStyledAttributes.getDimensionPixelSize(z2i0.LinearProgressIndicator_trackStopIndicatorSize, 0);
        if (obtainStyledAttributes.hasValue(z2i0.LinearProgressIndicator_trackStopIndicatorPadding)) {
            gjyVar.u = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(z2i0.LinearProgressIndicator_trackStopIndicatorPadding, 0));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(z2i0.LinearProgressIndicator_trackInnerCornerRadius);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                gjyVar.v = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), gjyVar.a / 2);
                gjyVar.x = false;
                gjyVar.y = true;
            } else if (i4 == 6) {
                gjyVar.w = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                gjyVar.x = true;
                gjyVar.y = true;
            }
        }
        obtainStyledAttributes.recycle();
        gjyVar.d();
        gjyVar.s = gjyVar.r == 1;
        return gjyVar;
    }

    public int getIndeterminateAnimationType() {
        return ((gjy) this.spec).q;
    }

    public int getIndicatorDirection() {
        return ((gjy) this.spec).r;
    }

    public int getTrackInnerCornerRadius() {
        return ((gjy) this.spec).v;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((gjy) this.spec).u;
    }

    public int getTrackStopIndicatorSize() {
        return ((gjy) this.spec).t;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.spec;
        gjy gjyVar = (gjy) s;
        boolean z2 = true;
        if (((gjy) s).r != 1 && ((getLayoutDirection() != 1 || ((gjy) this.spec).r != 2) && (getLayoutDirection() != 0 || ((gjy) this.spec).r != 3))) {
            z2 = false;
        }
        gjyVar.s = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        IndeterminateDrawable<gjy> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        DeterminateDrawable<gjy> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        if (((gjy) this.spec).q == i) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            ny61.r("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        S s = this.spec;
        ((gjy) s).q = i;
        ((gjy) s).d();
        if (i == 0) {
            getIndeterminateDrawable().setAnimatorDelegate(new c((gjy) this.spec));
        } else {
            getIndeterminateDrawable().setAnimatorDelegate(new d(getContext(), (gjy) this.spec));
        }
        registerSwitchIndeterminateModeCallback();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((gjy) this.spec).d();
    }

    public void setIndicatorDirection(int i) {
        S s = this.spec;
        ((gjy) s).r = i;
        gjy gjyVar = (gjy) s;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((gjy) this.spec).r != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        gjyVar.s = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i, boolean z) {
        S s = this.spec;
        if (s != 0 && ((gjy) s).q == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i, z);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((gjy) this.spec).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        S s = this.spec;
        if (((gjy) s).v != i) {
            ((gjy) s).v = Math.round(Math.min(i, ((gjy) s).a / 2.0f));
            S s2 = this.spec;
            ((gjy) s2).x = false;
            ((gjy) s2).y = true;
            ((gjy) s2).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        S s = this.spec;
        if (((gjy) s).w != f) {
            ((gjy) s).w = Math.min(f, 0.5f);
            S s2 = this.spec;
            ((gjy) s2).x = true;
            ((gjy) s2).y = true;
            ((gjy) s2).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        if (Objects.equals(((gjy) this.spec).u, num)) {
            return;
        }
        ((gjy) this.spec).u = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        S s = this.spec;
        if (((gjy) s).t != i) {
            ((gjy) s).t = i;
            ((gjy) s).d();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}

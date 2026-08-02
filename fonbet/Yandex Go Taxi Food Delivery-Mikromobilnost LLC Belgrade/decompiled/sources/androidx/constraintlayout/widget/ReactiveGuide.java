package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.aqr0;
import defpackage.z3i0;
import defpackage.zpr0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class ReactiveGuide extends View implements zpr0 {
    private boolean mAnimateChange;
    private boolean mApplyToAllConstraintSets;
    private int mApplyToConstraintSetId;
    private int mAttributeId;

    public ReactiveGuide(Context context) {
        super(context);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(null);
    }

    private void changeValue(int i, int i2, MotionLayout motionLayout, int i3) {
        e constraintSet = motionLayout.getConstraintSet(i3);
        constraintSet.o(i2).e.f = i;
        constraintSet.o(i2).e.e = -1;
        constraintSet.o(i2).e.g = -1.0f;
        motionLayout.updateState(i3, constraintSet);
    }

    private void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z3i0.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == z3i0.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.mAttributeId = obtainStyledAttributes.getResourceId(index, this.mAttributeId);
                } else if (index == z3i0.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.mAnimateChange = obtainStyledAttributes.getBoolean(index, this.mAnimateChange);
                } else if (index == z3i0.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.mApplyToConstraintSetId = obtainStyledAttributes.getResourceId(index, this.mApplyToConstraintSetId);
                } else if (index == z3i0.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.mApplyToAllConstraintSets = obtainStyledAttributes.getBoolean(index, this.mApplyToAllConstraintSets);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.mAttributeId != -1) {
            ConstraintLayout.getSharedValues().a(this.mAttributeId, this);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.mApplyToConstraintSetId;
    }

    public int getAttributeId() {
        return this.mAttributeId;
    }

    public boolean isAnimatingChange() {
        return this.mAnimateChange;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void onNewValue(int i, int i2, int i3) {
        setGuidelineBegin(i2);
        int id = getId();
        if (id > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i4 = this.mApplyToConstraintSetId;
            if (i4 != 0) {
                currentState = i4;
            }
            boolean z = this.mAnimateChange;
            boolean z2 = this.mApplyToAllConstraintSets;
            int i5 = 0;
            if (!z) {
                if (!z2) {
                    changeValue(i2, id, motionLayout, currentState);
                    return;
                }
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                while (i5 < constraintSetIds.length) {
                    changeValue(i2, id, motionLayout, constraintSetIds[i5]);
                    i5++;
                }
                return;
            }
            if (z2) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i5 < constraintSetIds2.length) {
                    int i6 = constraintSetIds2[i5];
                    if (i6 != currentState) {
                        changeValue(i2, id, motionLayout, i6);
                    }
                    i5++;
                }
            }
            e cloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
            cloneConstraintSet.o(id).e.f = i2;
            cloneConstraintSet.o(id).e.e = -1;
            cloneConstraintSet.o(id).e.g = -1.0f;
            motionLayout.updateStateAnimate(currentState, cloneConstraintSet, 1000);
        }
    }

    public void setAnimateChange(boolean z) {
        this.mAnimateChange = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.mApplyToConstraintSetId = i;
    }

    public void setAttributeId(int i) {
        HashSet hashSet;
        aqr0 sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.mAttributeId;
        if (i2 != -1 && (hashSet = (HashSet) sharedValues.a.get(Integer.valueOf(i2))) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zpr0 zpr0Var = (zpr0) weakReference.get();
                if (zpr0Var == null || zpr0Var == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.mAttributeId = i;
        if (i != -1) {
            sharedValues.a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideBegin = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideEnd = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guidePercent = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attributeSet);
    }
}

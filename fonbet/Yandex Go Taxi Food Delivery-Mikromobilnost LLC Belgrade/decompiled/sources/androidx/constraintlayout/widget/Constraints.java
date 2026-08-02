package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import defpackage.kbs;
import defpackage.z3i0;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class Constraints extends ViewGroup {
    public static final String TAG = "Constraints";
    e mConstraintSet;

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
        super.setVisibility(8);
    }

    private void init() {
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public e getConstraintSet() {
        if (this.mConstraintSet == null) {
            this.mConstraintSet = new e();
        }
        e eVar = this.mConstraintSet;
        eVar.getClass();
        int childCount = getChildCount();
        HashMap hashMap = eVar.g;
        hashMap.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (eVar.f && id == -1) {
                kbs.g("All children of ConstraintLayout must have ids to use ConstraintSet");
                return null;
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new e.a());
            }
            e.a aVar = (e.a) hashMap.get(Integer.valueOf(id));
            if (aVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    e.b bVar = aVar.e;
                    aVar.e(id, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        bVar.i0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        bVar.g0 = barrier.getType();
                        bVar.j0 = barrier.getReferencedIds();
                        bVar.h0 = barrier.getMargin();
                    }
                }
                aVar.e(id, layoutParams);
            }
        }
        return this.mConstraintSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float alpha;
        public boolean applyElevation;
        public float elevation;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == z3i0.ConstraintSet_android_alpha) {
                    this.alpha = obtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == z3i0.ConstraintSet_android_elevation) {
                    this.elevation = obtainStyledAttributes.getFloat(index, this.elevation);
                    this.applyElevation = true;
                } else if (index == z3i0.ConstraintSet_android_rotationX) {
                    this.rotationX = obtainStyledAttributes.getFloat(index, this.rotationX);
                } else if (index == z3i0.ConstraintSet_android_rotationY) {
                    this.rotationY = obtainStyledAttributes.getFloat(index, this.rotationY);
                } else if (index == z3i0.ConstraintSet_android_rotation) {
                    this.rotation = obtainStyledAttributes.getFloat(index, this.rotation);
                } else if (index == z3i0.ConstraintSet_android_scaleX) {
                    this.scaleX = obtainStyledAttributes.getFloat(index, this.scaleX);
                } else if (index == z3i0.ConstraintSet_android_scaleY) {
                    this.scaleY = obtainStyledAttributes.getFloat(index, this.scaleY);
                } else if (index == z3i0.ConstraintSet_android_transformPivotX) {
                    this.transformPivotX = obtainStyledAttributes.getFloat(index, this.transformPivotX);
                } else if (index == z3i0.ConstraintSet_android_transformPivotY) {
                    this.transformPivotY = obtainStyledAttributes.getFloat(index, this.transformPivotY);
                } else if (index == z3i0.ConstraintSet_android_translationX) {
                    this.translationX = obtainStyledAttributes.getFloat(index, this.translationX);
                } else if (index == z3i0.ConstraintSet_android_translationY) {
                    this.translationY = obtainStyledAttributes.getFloat(index, this.translationY);
                } else if (index == z3i0.ConstraintSet_android_translationZ) {
                    this.translationZ = obtainStyledAttributes.getFloat(index, this.translationZ);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.alpha = 1.0f;
            this.applyElevation = false;
            this.elevation = 0.0f;
            this.rotation = 0.0f;
            this.rotationX = 0.0f;
            this.rotationY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = 0.0f;
            this.transformPivotY = 0.0f;
            this.translationX = 0.0f;
            this.translationY = 0.0f;
            this.translationZ = 0.0f;
        }
    }
}

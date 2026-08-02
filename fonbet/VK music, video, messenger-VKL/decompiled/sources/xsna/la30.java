package xsna;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;

/* compiled from: MotionHelper.java */
/* loaded from: classes11.dex */
public final class la30 extends androidx.constraintlayout.widget.a implements MotionLayout.i {
    public boolean j;
    public boolean k;
    public float l;
    public View[] m;

    public float getProgress() {
        return this.l;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.j = obtainStyledAttributes.getBoolean(index, this.j);
                } else if (index == 0) {
                    this.k = obtainStyledAttributes.getBoolean(index, this.k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.l = f;
        int i = 0;
        if (this.c > 0) {
            this.m = m((ConstraintLayout) getParent());
            while (i < this.c) {
                View view = this.m[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            viewGroup.getChildAt(i);
            i++;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void c(int i) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void a(int i, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void b(float f, int i, int i2) {
    }
}

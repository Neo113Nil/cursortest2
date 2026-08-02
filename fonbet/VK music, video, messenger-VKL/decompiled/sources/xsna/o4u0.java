package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public abstract class o4u0 extends androidx.constraintlayout.widget.a {
    public boolean j;
    public boolean k;

    public o4u0(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.a
    public void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.j = true;
                } else if (index == 22) {
                    this.k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j || this.k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.c; i++) {
                    View G4 = constraintLayout.G4(this.b[i]);
                    if (G4 != null) {
                        if (this.j) {
                            G4.setVisibility(visibility);
                        }
                        if (this.k && elevation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            G4.setTranslationZ(G4.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        h();
    }

    public o4u0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o4u0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void u(androidx.constraintlayout.core.widgets.i iVar, int i, int i2) {
    }
}

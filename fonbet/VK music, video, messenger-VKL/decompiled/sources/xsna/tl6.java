package xsna;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;

/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes13.dex */
public abstract class tl6 {
    public int a;
    public int b;

    @NonNull
    public int[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public tl6(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_track_thickness);
        int[] iArr = R$styleable.BaseProgressIndicator;
        fpo0.a(context, attributeSet, i, i2);
        fpo0.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = qm10.c(context, obtainStyledAttributes, R$styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.b = Math.min(qm10.c(context, obtainStyledAttributes, R$styleable.BaseProgressIndicator_trackCornerRadius, 0), this.a / 2);
        this.e = obtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f = obtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseProgressIndicator_indicatorTrackGapSize, 0);
        if (!obtainStyledAttributes.hasValue(R$styleable.BaseProgressIndicator_indicatorColor)) {
            this.c = new int[]{dm10.b(R$attr.colorPrimary, -1, context)};
        } else if (obtainStyledAttributes.peekValue(R$styleable.BaseProgressIndicator_indicatorColor).type != 1) {
            this.c = new int[]{obtainStyledAttributes.getColor(R$styleable.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(R$styleable.BaseProgressIndicator_indicatorColor, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(R$styleable.BaseProgressIndicator_trackColor)) {
            this.d = obtainStyledAttributes.getColor(R$styleable.BaseProgressIndicator_trackColor, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.d = dm10.a(this.d, (int) (f * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}

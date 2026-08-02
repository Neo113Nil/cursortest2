package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes11.dex */
public abstract class n85 {
    public int a;
    public int b;
    public float c;
    public boolean d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;

    public n85(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(org0.mtrl_progress_track_thickness);
        int[] iArr = z2i0.BaseProgressIndicator;
        yvy0.a(context, attributeSet, i, i2);
        yvy0.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = jx81.p(context, obtainStyledAttributes, z2i0.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        TypedValue peekValue = obtainStyledAttributes.peekValue(z2i0.BaseProgressIndicator_trackCornerRadius);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                this.b = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), this.a / 2);
                this.d = false;
            } else if (i3 == 6) {
                this.c = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = obtainStyledAttributes.getInt(z2i0.BaseProgressIndicator_showAnimationBehavior, 0);
        this.h = obtainStyledAttributes.getInt(z2i0.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(z2i0.BaseProgressIndicator_indicatorTrackGapSize, 0);
        int abs = Math.abs(obtainStyledAttributes.getDimensionPixelSize(z2i0.BaseProgressIndicator_wavelength, 0));
        this.j = Math.abs(obtainStyledAttributes.getDimensionPixelSize(z2i0.BaseProgressIndicator_wavelengthDeterminate, abs));
        this.k = Math.abs(obtainStyledAttributes.getDimensionPixelSize(z2i0.BaseProgressIndicator_wavelengthIndeterminate, abs));
        this.l = Math.abs(obtainStyledAttributes.getDimensionPixelSize(z2i0.BaseProgressIndicator_waveAmplitude, 0));
        this.m = obtainStyledAttributes.getDimensionPixelSize(z2i0.BaseProgressIndicator_waveSpeed, 0);
        this.n = obtainStyledAttributes.getFloat(z2i0.BaseProgressIndicator_indeterminateAnimatorDurationScale, 1.0f);
        this.o = obtainStyledAttributes.getFloat(z2i0.BaseProgressIndicator_waveAmplitudeRampProgressMin, 0.1f);
        this.p = obtainStyledAttributes.getFloat(z2i0.BaseProgressIndicator_waveAmplitudeRampProgressMax, 0.9f);
        if (!obtainStyledAttributes.hasValue(z2i0.BaseProgressIndicator_indicatorColor)) {
            this.e = new int[]{vez0.x(context, iog0.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(z2i0.BaseProgressIndicator_indicatorColor).type != 1) {
            this.e = new int[]{obtainStyledAttributes.getColor(z2i0.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(z2i0.BaseProgressIndicator_indicatorColor, -1));
            this.e = intArray;
            if (intArray.length == 0) {
                ny61.g("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (obtainStyledAttributes.hasValue(z2i0.BaseProgressIndicator_trackColor)) {
            this.f = obtainStyledAttributes.getColor(z2i0.BaseProgressIndicator_trackColor, -1);
        } else {
            this.f = this.e[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.f = vez0.d(this.f, (int) (f * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public final int a() {
        return this.d ? (int) (this.a * this.c) : this.b;
    }

    public final boolean b(boolean z) {
        if (this.l <= 0) {
            return false;
        }
        if (z || this.k <= 0) {
            return z && this.j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.d && this.c == 0.5f;
    }

    public void d() {
        if (this.i >= 0) {
            return;
        }
        ny61.g("indicatorTrackGapSize must be >= 0.");
    }
}

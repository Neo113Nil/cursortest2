package com.google.android.material.loadingindicator;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import defpackage.nwt0;
import defpackage.sb2;
import defpackage.tzy;
import defpackage.v9j;
import defpackage.vzy;

/* loaded from: classes11.dex */
public final class a {
    public static final Property i;
    public static final v9j j = new v9j(1);
    public int a;
    public float b;
    public float c;
    public ObjectAnimator d;
    public nwt0 e;
    public vzy f;
    public LoadingIndicatorDrawable g;
    public tzy h;

    static {
        final Class<Float> cls = Float.class;
        final String str = "animationFraction";
        i = new Property<a, Float>(cls, str) { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate$2
            @Override // android.util.Property
            public Float get(a aVar) {
                return Float.valueOf(aVar.b);
            }

            @Override // android.util.Property
            public void set(a aVar, Float f) {
                aVar.b = f.floatValue();
                float f2 = aVar.a - 1;
                float f3 = aVar.c - f2;
                float f4 = ((int) (r3 * 650.0f)) / 650.0f;
                if (f4 == 1.0f) {
                    f4 = 0.0f;
                }
                aVar.h.c = ((f3 * 90.0f) + ((f4 * 50.0f) + (f2 * 140.0f))) % 360.0f;
                LoadingIndicatorDrawable loadingIndicatorDrawable = aVar.g;
                if (loadingIndicatorDrawable != null) {
                    loadingIndicatorDrawable.invalidateSelf();
                }
            }
        };
    }

    public final void a(float f) {
        this.c = f;
        tzy tzyVar = this.h;
        tzyVar.b = f;
        int i2 = this.a - 1;
        int[] iArr = this.f.d;
        int length = i2 % iArr.length;
        tzyVar.a = ArgbEvaluatorCompat.getInstance().evaluate(sb2.j(this.c - (this.a - 1), 0.0f, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.g;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.invalidateSelf();
        }
    }
}
